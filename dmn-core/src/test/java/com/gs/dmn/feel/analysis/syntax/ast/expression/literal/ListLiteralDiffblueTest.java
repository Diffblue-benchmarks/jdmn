package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import java.util.ArrayList;
import org.junit.Test;

public class ListLiteralDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    ListLiteral listLiteral = new ListLiteral(expressionList);
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = listLiteral.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((ListLiteral) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression getResult = ((ListLiteral) actualAcceptResult).getExpressionList().get(0);
    assertEquals("ListLiteral(ExpressionList())", actualAcceptResult.toString());
    assertEquals("ExpressionList()", getResult.toString());
    assertSame(type, getResult.getType());
  }

  @Test
  public void addTest() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    ExpressionList expressionList1 = new ExpressionList();
    expressionList.add(expressionList1);
    ListLiteral listLiteral = new ListLiteral(expressionList);

    // Act
    listLiteral.add(expressionList1);

    // Assert
    assertEquals("ListLiteral(ExpressionList(),ExpressionList())", listLiteral.toString());
  }

  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act
    ListLiteral actualListLiteral = new ListLiteral(expressionList);

    // Assert
    assertTrue(actualListLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListLiteral(ExpressionList())", actualListLiteral.toString());
  }

  @Test
  public void deriveTypeTest() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    ListLiteral listLiteral = new ListLiteral(expressionList);

    // Act
    listLiteral.deriveType(null);

    // Assert
    Type type = listLiteral.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.ListType);
    assertTrue(type.isValid());
  }

  @Test
  public void toStringTest() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act and Assert
    assertEquals("ListLiteral(ExpressionList())", (new ListLiteral(expressionList)).toString());
  }
}

