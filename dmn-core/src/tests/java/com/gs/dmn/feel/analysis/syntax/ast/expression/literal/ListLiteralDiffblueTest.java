package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Test;

public class ListLiteralDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ListLiteral listLiteral = new ListLiteral(null);
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = listLiteral.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((ListLiteral) actualAcceptResult).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListLiteral()", actualAcceptResult.toString());
  }

  @Test(timeout=10000)
  public void getExpressionListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ListLiteral(null)).getExpressionList().size());
  }

  @Test(timeout=10000)
  public void addTest() {
    // Arrange
    ListLiteral listLiteral = new ListLiteral(null);

    // Act
    listLiteral.add(new ExpressionList());

    // Assert
    assertEquals("ListLiteral(ExpressionList())", listLiteral.toString());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ListLiteral actualListLiteral = new ListLiteral(null);

    // Assert
    Type type = actualListLiteral.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListLiteral()", actualListLiteral.toString());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ListLiteral()", (new ListLiteral(null)).toString());
  }
}

