package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import java.util.ArrayList;
import org.junit.Test;

public class ListLiteralDiffblueTest {
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
  public void toStringTest() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act and Assert
    assertEquals("ListLiteral(ExpressionList())", (new ListLiteral(expressionList)).toString());
  }
}

