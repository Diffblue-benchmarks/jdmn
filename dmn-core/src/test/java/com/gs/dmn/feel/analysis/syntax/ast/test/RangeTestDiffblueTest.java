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
  @Test
  public void acceptTest() {
    // Arrange
    RangeTest rangeTest = new RangeTest(true, new ExpressionList(), true, new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = rangeTest.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((RangeTest) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualAcceptResult).isOpenEnd());
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())", actualAcceptResult.toString());
    Expression end = ((RangeTest) actualAcceptResult).getEnd();
    String actualToStringResult = end.toString();
    assertTrue(((RangeTest) actualAcceptResult).isOpenStart());
    Expression start = ((RangeTest) actualAcceptResult).getStart();
    assertEquals("ExpressionList()", actualToStringResult);
    assertEquals("ExpressionList()", start.toString());
    assertSame(type, start.getType());
    assertSame(type, end.getType());
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    RangeTest actualRangeTest = new RangeTest(true, new ExpressionList(), true, new ExpressionList());

    // Assert
    assertTrue(actualRangeTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue(actualRangeTest.isOpenEnd());
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())", actualRangeTest.toString());
    assertTrue(actualRangeTest.isOpenStart());
  }
  @Test
  public void deriveTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(SemanticError.class);
    (new RangeTest(true, new ExpressionList(), true, new ExpressionList())).deriveType(null);
  }
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())",
        (new RangeTest(true, new ExpressionList(), true, new ExpressionList())).toString());
  }
}

