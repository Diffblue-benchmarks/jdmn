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
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ExpressionTest expressionTest = new ExpressionTest(new ExpressionList());
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = expressionTest.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((ExpressionTest) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    Expression expression = ((ExpressionTest) actualAcceptResult).getExpression();
    assertTrue(type instanceof AnyType);
    Type actualType = expression.getType();
    assertEquals("ExpressionTest(ExpressionList())", actualToStringResult);
    assertEquals("ExpressionList()", expression.toString());
    assertSame(type, actualType);
  }
  @Test(timeout=10000)
  public void getExpressionTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new ExpressionTest(expressionList)).getExpression());
  }
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ExpressionTest actualExpressionTest = new ExpressionTest(new ExpressionList());

    // Assert
    Type type = actualExpressionTest.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionTest(ExpressionList())", actualExpressionTest.toString());
  }
  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ExpressionTest(ExpressionList())", (new ExpressionTest(new ExpressionList())).toString());
  }
  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new ExpressionTest(new ExpressionList())).deriveType(null);
  }
}

