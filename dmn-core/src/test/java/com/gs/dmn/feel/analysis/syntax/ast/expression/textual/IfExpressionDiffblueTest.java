package com.gs.dmn.feel.analysis.syntax.ast.expression.textual;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.BooleanType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.test.Any;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.HashMap;
import org.junit.Test;

public class IfExpressionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    IfExpression actualIfExpression = new IfExpression(new ExpressionList(), new ExpressionList(),
        new ExpressionList());

    // Assert
    assertTrue(actualIfExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("IfExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualIfExpression.toString());
  }

  @Test
  public void testAccept() {
    // Arrange
    IfExpression ifExpression = new IfExpression(new Any(), new Any(), new Any());
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(ifExpression, ifExpression.accept(visitor, FEELContext.makeContext(null)));
    Type type = ((IfExpression) ifExpression.accept(visitor, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type,
        ((IfExpression) ifExpression.accept(visitor, FEELContext.makeContext(null))).getCondition().getType());
  }

  @Test
  public void testAccept2() {
    // Arrange
    IfExpression ifExpression = new IfExpression(new ExpressionList(), new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = ifExpression.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((IfExpression) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression condition = ((IfExpression) actualAcceptResult).getCondition();
    String actualToStringResult = condition.toString();
    Expression thenExpression = ((IfExpression) actualAcceptResult).getThenExpression();
    String actualToStringResult1 = thenExpression.toString();
    Expression elseExpression = ((IfExpression) actualAcceptResult).getElseExpression();
    String actualToStringResult2 = elseExpression.toString();
    assertEquals("IfExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualAcceptResult.toString());
    assertEquals("ExpressionList()", actualToStringResult2);
    assertSame(type, elseExpression.getType());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, thenExpression.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, condition.getType());
  }

  @Test
  public void testAccept3() {
    // Arrange
    IfExpression ifExpression = new IfExpression(new ExpressionList(), new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(ifExpression, ifExpression.accept(new NopVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("IfExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        (new IfExpression(new ExpressionList(), new ExpressionList(), new ExpressionList())).toString());
  }
}

