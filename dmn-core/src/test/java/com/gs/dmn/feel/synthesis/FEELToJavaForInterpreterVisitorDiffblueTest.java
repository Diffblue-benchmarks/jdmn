package com.gs.dmn.feel.synthesis;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.ListType;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.HashMap;
import org.junit.Test;

public class FEELToJavaForInterpreterVisitorDiffblueTest {
  @Test
  public void testMakeNavigation() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaForInterpreterVisitor feelToJavaForInterpreterVisitor = new FEELToJavaForInterpreterVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    ExpressionList element = new ExpressionList();

    // Act and Assert
    assertEquals(
        "foo.stream().map(x -> ((com.gs.dmn.runtime.Context" + ")(x)).get(\"memberName\", asList())).collect(Collectors"
            + ".toList())",
        feelToJavaForInterpreterVisitor.makeNavigation(element, new ListType(), "foo", "memberName",
            "memberVariableName"));
  }

  @Test
  public void testMakeNavigation2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaForInterpreterVisitor feelToJavaForInterpreterVisitor = new FEELToJavaForInterpreterVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    ExpressionList element = new ExpressionList();

    // Act and Assert
    assertEquals("((com.gs.dmn.runtime.Context)(foo)).get(\"memberName\"," + " asList())",
        feelToJavaForInterpreterVisitor.makeNavigation(element, new AnyType(), "foo", "memberName",
            "memberVariableName"));
  }
}

