package com.gs.dmn.runtime.compiler;

import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionDefinition;
import com.gs.dmn.feel.synthesis.FEELTranslatorForInterpreter;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JavaAssistCompilerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void makeClassDataTest() {
    // Arrange
    JavaAssistCompiler javaAssistCompiler = new JavaAssistCompiler();
    FunctionDefinition element = new FunctionDefinition(null, new ExpressionList(), true);
    FEELContext context = FEELContext.makeContext(null);
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    thrown.expect(ClassCastException.class);
    javaAssistCompiler.makeClassData(element, context, dmnTransformer,
        new FEELTranslatorForInterpreter(new BasicDMN2JavaTransformer(dmnModelRepository1, null, feelTypeTranslator1,
            new NopLazyEvaluationDetector(), null)),
        "name");
  }
  @Test(timeout=10000)
  public void compileTest() throws Exception {
    // Arrange
    JavaAssistCompiler javaAssistCompiler = new JavaAssistCompiler();

    // Act and Assert
    thrown.expect(ClassCastException.class);
    javaAssistCompiler.compile(new JavaxToolsClassData("name", "name", "foo"));
  }
}

