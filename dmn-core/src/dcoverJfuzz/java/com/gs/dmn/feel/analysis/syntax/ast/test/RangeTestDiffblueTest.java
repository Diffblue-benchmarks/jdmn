package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.SemanticError;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RangeTestDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ExpressionList start = new ExpressionList();
    RangeTest rangeTest = new RangeTest(true, start, true, new ExpressionList());
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = rangeTest.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    boolean actualIsOpenStartResult = ((RangeTest) actualAcceptResult).isOpenStart();
    Expression start1 = ((RangeTest) actualAcceptResult).getStart();
    Expression end = ((RangeTest) actualAcceptResult).getEnd();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualAcceptResult).isOpenEnd());
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())", actualToStringResult);
    Type actualType = end.getType();
    String actualToStringResult1 = end.toString();
    assertTrue(actualIsOpenStartResult);
    Type actualType1 = start1.getType();
    assertEquals("ExpressionList()", actualToStringResult1);
    assertEquals("ExpressionList()", start1.toString());
    assertSame(type, actualType1);
    assertSame(type, actualType);
  }
  @Test(timeout=10000)
  public void isOpenEndTest() {
    // Arrange
    ExpressionList start = new ExpressionList();

    // Act and Assert
    assertTrue((new RangeTest(true, start, true, new ExpressionList())).isOpenEnd());
  }
  @Test(timeout=10000)
  public void getEndTest() {
    // Arrange
    ExpressionList start = new ExpressionList();
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new RangeTest(true, start, true, expressionList)).getEnd());
  }
  @Test(timeout=10000)
  public void getStartTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new RangeTest(true, expressionList, true, new ExpressionList())).getStart());
  }
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ExpressionList start = new ExpressionList();

    // Act
    RangeTest actualRangeTest = new RangeTest(true, start, true, new ExpressionList());

    // Assert
    Type type = actualRangeTest.getType();
    String actualToStringResult = actualRangeTest.toString();
    boolean actualIsOpenStartResult = actualRangeTest.isOpenStart();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue(actualRangeTest.isOpenEnd());
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())", actualToStringResult);
    assertTrue(actualIsOpenStartResult);
  }
  @Test(timeout=10000)
  public void isOpenStartTest() {
    // Arrange
    ExpressionList start = new ExpressionList();

    // Act and Assert
    assertTrue((new RangeTest(true, start, true, new ExpressionList())).isOpenStart());
  }
  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    ExpressionList start = new ExpressionList();

    // Act and Assert
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())",
        (new RangeTest(true, start, true, new ExpressionList())).toString());
  }
  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    ExpressionList start = new ExpressionList();

    // Act and Assert
    thrown.expect(SemanticError.class);
    (new RangeTest(true, start, true, new ExpressionList())).deriveType(null);
  }
}

