package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import java.util.ArrayList;
import org.junit.Test;

public class ExpressionListDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = expressionList.accept(new CloneVisitor(), params);

    // Assert
    assertTrue(
        ((ExpressionList) actualAcceptResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", actualAcceptResult.toString());
  }

  @Test
  public void addTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act
    expressionList.add(new ExpressionList());

    // Assert
    assertEquals("ExpressionList(ExpressionList())", expressionList.toString());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ExpressionList actualExpressionList = new ExpressionList();

    // Assert
    assertTrue(actualExpressionList.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", actualExpressionList.toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act
    ExpressionList actualExpressionList = new ExpressionList(expressionList);

    // Assert
    assertTrue(actualExpressionList.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList(ExpressionList())", actualExpressionList.toString());
  }

  @Test
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

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ExpressionList()", (new ExpressionList()).toString());
  }
}

