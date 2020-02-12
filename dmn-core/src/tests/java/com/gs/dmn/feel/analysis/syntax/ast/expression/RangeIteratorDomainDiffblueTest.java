package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class RangeIteratorDomainDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ExpressionList start = new ExpressionList();
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(start, new ExpressionList());
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = rangeIteratorDomain.accept(visitor, FEELContext.makeContext(null));

    // Assert
    String actualToStringResult = actualAcceptResult.toString();
    Expression start1 = ((RangeIteratorDomain) actualAcceptResult).getStart();
    Expression end = ((RangeIteratorDomain) actualAcceptResult).getEnd();
    Type actualType = end.getType();
    String actualToStringResult1 = end.toString();
    Type type = start1.getType();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", actualToStringResult);
    assertEquals("ExpressionList()", start1.toString());
    assertTrue(type instanceof AnyType);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void getEndTest() {
    // Arrange
    ExpressionList start = new ExpressionList();
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new RangeIteratorDomain(start, expressionList)).getEnd());
  }

  @Test(timeout=10000)
  public void getStartTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new RangeIteratorDomain(expressionList, new ExpressionList())).getStart());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ExpressionList start = new ExpressionList();

    // Act and Assert
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())",
        (new RangeIteratorDomain(start, new ExpressionList())).toString());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    ExpressionList start = new ExpressionList();

    // Act and Assert
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())",
        (new RangeIteratorDomain(start, new ExpressionList())).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    ExpressionList start = new ExpressionList();
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(start, new ExpressionList());

    // Act
    rangeIteratorDomain.deriveType(null);

    // Assert
    Type type = rangeIteratorDomain.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    assertTrue(type.isValid());
  }

  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange
    ExpressionList start = new ExpressionList();

    // Act and Assert
    assertNull((new RangeIteratorDomain(start, new ExpressionList())).getType());
  }
}

