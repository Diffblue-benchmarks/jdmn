package com.gs.dmn.feel.analysis.syntax.ast.expression.comparison;

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

public class BetweenExpressionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    BetweenExpression actualBetweenExpression = new BetweenExpression(new ExpressionList(), new ExpressionList(),
        new ExpressionList());

    // Assert
    assertTrue(actualBetweenExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("BetweenExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualBetweenExpression.toString());
  }

  @Test
  public void testAccept() {
    // Arrange
    BetweenExpression betweenExpression = new BetweenExpression(new ExpressionList(), new ExpressionList(),
        new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = betweenExpression.accept(new CloneVisitor(), params);

    // Assert
    Expression value = ((BetweenExpression) actualAcceptResult).getValue();
    String actualToStringResult = value.toString();
    Expression rightEndpoint = ((BetweenExpression) actualAcceptResult).getRightEndpoint();
    String actualToStringResult1 = rightEndpoint.toString();
    Type type = ((BetweenExpression) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftEndpoint = ((BetweenExpression) actualAcceptResult).getLeftEndpoint();
    String actualToStringResult2 = leftEndpoint.toString();
    assertEquals("BetweenExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualAcceptResult.toString());
    assertEquals("ExpressionList()", actualToStringResult2);
    assertSame(type, leftEndpoint.getType());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, rightEndpoint.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value.getType());
  }

  @Test
  public void testAccept2() {
    // Arrange
    BetweenExpression betweenExpression = new BetweenExpression(new NumericLiteral("value"),
        new NumericLiteral("value"), new NumericLiteral("value"));
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(betweenExpression, betweenExpression.accept(visitor, FEELContext.makeContext(null)));
    Type type = ((BetweenExpression) betweenExpression.accept(visitor, FEELContext.makeContext(null))).getValue()
        .getType();
    assertTrue(((BetweenExpression) betweenExpression.accept(visitor, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
  }

  @Test
  public void testAccept3() {
    // Arrange
    BetweenExpression betweenExpression = new BetweenExpression(new ExpressionList(), new ExpressionList(),
        new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(betweenExpression, betweenExpression.accept(new NopVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("BetweenExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        (new BetweenExpression(new ExpressionList(), new ExpressionList(), new ExpressionList())).toString());
  }
}

