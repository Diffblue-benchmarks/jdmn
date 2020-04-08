package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.HashMap;
import org.junit.Test;

public class RangeTestDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    RangeTest actualRangeTest = new RangeTest(true, new ExpressionList(), true, new ExpressionList());

    // Assert
    assertTrue(actualRangeTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue(actualRangeTest.isOpenEnd());
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())", actualRangeTest.toString());
    assertTrue(actualRangeTest.isOpenStart());
  }

  @Test
  public void testAccept() {
    // Arrange
    RangeTest rangeTest = new RangeTest(true, new ExpressionList(), true, new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(rangeTest, rangeTest.accept(new NopVisitor(), params));
  }

  @Test
  public void testAccept2() {
    // Arrange
    RangeTest rangeTest = new RangeTest(true, new NumericLiteral("value"), true, new NumericLiteral("value"));
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(rangeTest, rangeTest.accept(visitor, FEELContext.makeContext(null)));
    assertTrue(((RangeTest) rangeTest.accept(visitor, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    assertTrue(((RangeTest) rangeTest.accept(visitor, FEELContext.makeContext(null))).getEnd()
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
  }

  @Test
  public void testAccept3() {
    // Arrange
    RangeTest rangeTest = new RangeTest(true, new ExpressionList(), true, new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = rangeTest.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((RangeTest) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualAcceptResult).isOpenEnd());
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())", actualAcceptResult.toString());
    Expression end = ((RangeTest) actualAcceptResult).getEnd();
    String actualToStringResult = end.toString();
    assertTrue(((RangeTest) actualAcceptResult).isOpenStart());
    Expression start = ((RangeTest) actualAcceptResult).getStart();
    assertEquals("ExpressionList()", actualToStringResult);
    assertEquals("ExpressionList()", start.toString());
    assertSame(type, start.getType());
    assertSame(type, end.getType());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())",
        (new RangeTest(true, new ExpressionList(), true, new ExpressionList())).toString());
  }
}

