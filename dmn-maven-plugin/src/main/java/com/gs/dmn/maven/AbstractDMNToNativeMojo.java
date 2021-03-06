/*
 * Copyright 2016 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.gs.dmn.maven;

import com.gs.dmn.dialect.DMNDialectDefinition;
import com.gs.dmn.log.BuildLogger;
import com.gs.dmn.serialization.TypeDeserializationConfigurer;
import com.gs.dmn.transformation.DMNTransformer;
import com.gs.dmn.transformation.FileTransformer;
import com.gs.dmn.transformation.InputParamUtil;
import com.gs.dmn.transformation.lazy.LazyEvaluationDetector;
import com.gs.dmn.transformation.template.TemplateProvider;
import com.gs.dmn.validation.DMNValidator;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@SuppressWarnings("CanBeFinal")
public abstract class AbstractDMNToNativeMojo<NUMBER, DATE, TIME, DATE_TIME, DURATION, TEST> extends AbstractDMNMojo<NUMBER, DATE, TIME, DATE_TIME, DURATION, TEST> {
    @Parameter(required = true, defaultValue = "${project.basedir}/src/main/resources/dmn")
    public File inputFileDirectory;

    @Parameter(required = true, defaultValue = "${project.build.directory}/generated-sources/dmn")
    public File outputFileDirectory;

    @Override
    public void execute() throws MojoExecutionException {
        transform(this.inputFileDirectory, this.outputFileDirectory);
    }

    protected void checkMandatoryFields(String dmnDialect) {
        checkMandatoryField(this.project, "project");
        checkMandatoryField(this.inputFileDirectory, "inputFileDirectory");
        checkMandatoryField(this.outputFileDirectory, "outputFileDirectory");
        checkMandatoryField(dmnDialect, "dmnDialect");
    }

    protected FileTransformer makeTransformer(BuildLogger logger, String dmnDialectName, String templateProviderName) throws Exception {
        // Create and validate arguments
        Class<?> dialectClass = Class.forName(dmnDialectName);
        DMNDialectDefinition<NUMBER, DATE, TIME, DATE_TIME, DURATION, TEST> dmnDialect = makeDialect(dialectClass);
        DMNValidator dmnValidator = makeDMNValidator(this.dmnValidators, logger);
        DMNTransformer<TEST> dmnTransformer = makeDMNTransformer(this.dmnTransformers, logger);
        TemplateProvider templateProvider = makeTemplateProvider(templateProviderName, logger);
        LazyEvaluationDetector lazyEvaluationDetector = makeLazyEvaluationDetector(this.lazyEvaluationDetectors, logger, this.inputParameters);
        TypeDeserializationConfigurer typeDeserializationConfigurer = makeTypeDeserializationConfigurer(this.typeDeserializationConfigurer, logger);
        validateParameters(dmnDialect, dmnValidator, dmnTransformer, templateProvider, this.inputParameters);

        // Create transformer
        FileTransformer transformer = dmnDialect.createDMNToNativeTransformer(
                dmnValidator,
                dmnTransformer,
                templateProvider,
                lazyEvaluationDetector,
                typeDeserializationConfigurer,
                this.inputParameters,
                logger
        );
        return transformer;
    }

    @Override
    protected void addSourceRoot(File outputFileDirectory) throws IOException {
        this.project.addCompileSourceRoot(outputFileDirectory.getCanonicalPath());
    }

    private void validateParameters(DMNDialectDefinition<NUMBER, DATE, TIME, DATE_TIME, DURATION, TEST> dmnDialect, DMNValidator dmnValidator, DMNTransformer<TEST> dmnTransformer, TemplateProvider templateProvider, Map<String, String> inputParameters) {
        boolean onePackage = InputParamUtil.getOptionalBooleanParam(inputParameters, "onePackage");
        String singletonInputData = InputParamUtil.getOptionalParam(inputParameters, "singletonInputData");
        String caching = InputParamUtil.getOptionalParam(inputParameters, "caching");
        if (onePackage) {
            this.getLog().warn("Use 'onePackage' carefully, names must be unique across all the DMs.");
        }
        if ("false".equals(singletonInputData) && "true".equals(caching)) {
            this.getLog().error(String.format("Incompatible 'singletonInputData=%s' and 'caching=%s'", singletonInputData, caching));
        }
    }
}
