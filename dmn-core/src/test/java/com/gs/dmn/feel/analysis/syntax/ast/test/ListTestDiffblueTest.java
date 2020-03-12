package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.ListLiteral;
import java.util.ArrayList;
import org.junit.Test;

public class ListTestDiffblueTest {
  @Test
  public void constructorTest() {
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
  public void toStringTest() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act and Assert
    assertEquals("ListTest(ListLiteral(ExpressionList()))", (new ListTest(new ListLiteral(expressionList))).toString());
  }
}

