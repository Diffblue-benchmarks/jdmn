package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class ExpressionListDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = expressionList.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((ExpressionList) actualAcceptResult).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", actualAcceptResult.toString());
  }

  @Test(timeout=10000)
  public void getExpressionListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ExpressionList()).getExpressionList().size());
  }

  @Test(timeout=10000)
  public void addTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act
    expressionList.add(new ExpressionList());

    // Assert
    assertEquals("ExpressionList(ExpressionList())", expressionList.toString());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    ExpressionList actualExpressionList = new ExpressionList(null);

    // Assert
    Type type = actualExpressionList.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(actualExpressionList.getExpressionList());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ExpressionList actualExpressionList = new ExpressionList();

    // Assert
    Type type = actualExpressionList.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", actualExpressionList.toString());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ExpressionList()", (new ExpressionList()).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act
    expressionList.deriveType(null);

    // Assert
    Type type = expressionList.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type.toString());
  }
}

