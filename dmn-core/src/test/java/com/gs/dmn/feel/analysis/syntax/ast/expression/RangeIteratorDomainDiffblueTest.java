package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class RangeIteratorDomainDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = rangeIteratorDomain.accept(new CloneVisitor(), params);

    // Assert
    Expression end = ((RangeIteratorDomain) actualAcceptResult).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) actualAcceptResult).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", actualAcceptResult.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    Type type = start.getType();
    assertTrue(type instanceof AnyType);
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())",
        (new RangeIteratorDomain(new ExpressionList(), new ExpressionList())).toString());
  }

  @Test
  public void deriveTypeTest() {
    // Arrange
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(new ExpressionList(), new ExpressionList());

    // Act
    rangeIteratorDomain.deriveType(null);

    // Assert
    Type type = rangeIteratorDomain.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    assertTrue(type.isValid());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())",
        (new RangeIteratorDomain(new ExpressionList(), new ExpressionList())).toString());
  }
}

