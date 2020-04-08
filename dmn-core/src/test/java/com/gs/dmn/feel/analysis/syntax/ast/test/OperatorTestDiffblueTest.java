package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class OperatorTestDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    OperatorTest actualOperatorTest = new OperatorTest("operator", new ExpressionList());

    // Assert
    assertTrue(actualOperatorTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("operator", actualOperatorTest.getOperator());
    assertEquals("OperatorTest(operator,ExpressionList())", actualOperatorTest.toString());
  }

  @Test
  public void testAccept() {
    // Arrange
    OperatorTest operatorTest = new OperatorTest("operator", new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(operatorTest, operatorTest.accept(new NopVisitor(), params));
  }

  @Test
  public void testAccept2() {
    // Arrange
    OperatorTest operatorTest = new OperatorTest("operator", new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = operatorTest.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((OperatorTest) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("operator", ((OperatorTest) actualAcceptResult).getOperator());
    assertEquals("OperatorTest(operator,ExpressionList())", actualAcceptResult.toString());
    Expression endpoint = ((OperatorTest) actualAcceptResult).getEndpoint();
    assertEquals("ExpressionList()", endpoint.toString());
    assertSame(type, endpoint.getType());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("OperatorTest(operator,ExpressionList())",
        (new OperatorTest("operator", new ExpressionList())).toString());
  }
}

