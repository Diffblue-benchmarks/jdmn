package com.gs.dmn.transformation.basic;

import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionDefinition;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FunctionDefinitionToJavaTransformerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void functionDefinitionToJavaTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FunctionDefinitionToJavaTransformer functionDefinitionToJavaTransformer = new FunctionDefinitionToJavaTransformer(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));

    // Act and Assert
    thrown.expect(ClassCastException.class);
    functionDefinitionToJavaTransformer
        .functionDefinitionToJava(new FunctionDefinition(null, new ExpressionList(), true), "foo", true);
  }
}

