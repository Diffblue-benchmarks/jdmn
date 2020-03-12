package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.runtime.DMNRuntimeException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExpressionTestDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void acceptTest() {
    // Arrange
    ExpressionTest expressionTest = new ExpressionTest(new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = expressionTest.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((ExpressionTest) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression expression = ((ExpressionTest) actualAcceptResult).getExpression();
    String actualToStringResult = expression.toString();
    assertEquals("ExpressionTest(ExpressionList())", actualAcceptResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, expression.getType());
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    ExpressionTest actualExpressionTest = new ExpressionTest(new ExpressionList());

    // Assert
    assertTrue(actualExpressionTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionTest(ExpressionList())", actualExpressionTest.toString());
  }
  @Test
  public void deriveTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new ExpressionTest(new ExpressionList())).deriveType(null);
  }
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ExpressionTest(ExpressionList())", (new ExpressionTest(new ExpressionList())).toString());
  }
}

