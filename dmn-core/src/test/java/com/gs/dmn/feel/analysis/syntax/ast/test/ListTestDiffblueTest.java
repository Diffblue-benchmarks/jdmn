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
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.ListLiteral;
import java.util.ArrayList;
import org.junit.Test;

public class ListTestDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act
    ListTest actualListTest = new ListTest(new ListLiteral(expressionList));

    // Assert
    assertTrue(actualListTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListTest(ListLiteral(ExpressionList()))", actualListTest.toString());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    ListTest listTest = new ListTest(new ListLiteral(null));

    // Act
    listTest.deriveType(null);

    // Assert
    assertTrue(listTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void testAccept() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    ListTest listTest = new ListTest(new ListLiteral(expressionList));
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = listTest.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((ListTest) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    ListLiteral listLiteral = ((ListTest) actualAcceptResult).getListLiteral();
    assertEquals("ListTest(ListLiteral(ExpressionList()))", actualAcceptResult.toString());
    assertEquals("ListLiteral(ExpressionList())", listLiteral.toString());
    assertSame(type, listLiteral.getType());
    Expression getResult = listLiteral.getExpressionList().get(0);
    assertSame(type, getResult.getType());
    assertEquals("ExpressionList()", getResult.toString());
  }

  @Test
  public void testAccept2() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    ListTest listTest = new ListTest(new ListLiteral(expressionList));
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(listTest, listTest.accept(new NopVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act and Assert
    assertEquals("ListTest(ListLiteral(ExpressionList()))", (new ListTest(new ListLiteral(expressionList))).toString());
  }
}

