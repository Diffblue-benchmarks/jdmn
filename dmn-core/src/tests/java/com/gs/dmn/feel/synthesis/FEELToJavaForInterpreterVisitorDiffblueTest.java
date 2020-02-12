package com.gs.dmn.feel.synthesis;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import org.junit.Test;

public class FEELToJavaForInterpreterVisitorDiffblueTest {
  @Test(timeout=10000)
  public void makeNavigationTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    FEELToJavaForInterpreterVisitor feelToJavaForInterpreterVisitor = new FEELToJavaForInterpreterVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(),
            null));
    ExpressionList element = new ExpressionList();

    // Act and Assert
    assertEquals("((com.gs.dmn.runtime.Context)(foo)).get(\"name\"," + " asList())",
        feelToJavaForInterpreterVisitor.makeNavigation(element, new AnyType(), "foo", "name", "name"));
  }
}

