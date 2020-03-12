package com.gs.dmn.runtime.compiler;

import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionDefinition;
import com.gs.dmn.feel.synthesis.FEELTranslatorForInterpreter;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JavaAssistCompilerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void compileTest() throws Exception {
    // Arrange
    JavaxToolsClassData classData = new JavaxToolsClassData("packageName", "className", "classText");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    (new JavaAssistCompiler()).compile(classData);
  }
  @Test
  public void makeClassDataTest() {
    // Arrange
    JavaAssistCompiler javaAssistCompiler = new JavaAssistCompiler();
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("name", new AnyType()));
    FunctionDefinition element = new FunctionDefinition(formalParameterList, new ExpressionList(), true);
    FEELContext context = FEELContext.makeContext(null);
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector1 = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap1 = new HashMap<String, String>();
    stringStringMap1.put("foo", "foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    javaAssistCompiler.makeClassData(element, context, dmnTransformer,
        new FEELTranslatorForInterpreter(new BasicDMN2JavaTransformer(dmnModelRepository1, null, feelTypeTranslator1,
            lazyEvaluationDetector1, stringStringMap1)),
        "LambdaExpressionImpl");
  }
}

