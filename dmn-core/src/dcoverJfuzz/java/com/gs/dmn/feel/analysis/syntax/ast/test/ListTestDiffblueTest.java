package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.ListLiteral;
import org.junit.Test;

public class ListTestDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ListTest listTest = new ListTest(new ListLiteral(null));
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = listTest.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((ListTest) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    ListLiteral listLiteral = ((ListTest) actualAcceptResult).getListLiteral();
    assertTrue(type instanceof AnyType);
    Type actualType = listLiteral.getType();
    assertEquals("ListTest(ListLiteral())", actualToStringResult);
    assertEquals("ListLiteral()", listLiteral.toString());
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void getListLiteralTest() {
    // Arrange
    ListLiteral listLiteral = new ListLiteral(null);

    // Act and Assert
    assertSame(listLiteral, (new ListTest(listLiteral)).getListLiteral());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ListTest(ListLiteral())", (new ListTest(new ListLiteral(null))).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    ListTest listTest = new ListTest(new ListLiteral(null));

    // Act
    listTest.deriveType(null);

    // Assert
    assertTrue(listTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ListTest actualListTest = new ListTest(new ListLiteral(null));

    // Assert
    Type type = actualListTest.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListTest(ListLiteral())", actualListTest.toString());
  }
}

