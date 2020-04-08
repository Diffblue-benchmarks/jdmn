package com.gs.dmn.feel.analysis.syntax.ast.expression.logic;

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
import org.junit.Test;

public class DisjunctionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Disjunction actualDisjunction = new Disjunction(new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("or", actualDisjunction.getOperator());
    assertTrue(actualDisjunction.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Disjunction(ExpressionList(),ExpressionList())", actualDisjunction.toString());
  }

  @Test
  public void testAccept() {
    // Arrange
    Disjunction disjunction = new Disjunction(new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(disjunction, disjunction.accept(new NopVisitor(), params));
  }

  @Test
  public void testAccept2() {
    // Arrange
    Disjunction disjunction = new Disjunction(new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = disjunction.accept(new CloneVisitor(), params);

    // Assert
    assertEquals("or", ((Disjunction) actualAcceptResult).getOperator());
    Expression rightOperand = ((Disjunction) actualAcceptResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Disjunction) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Disjunction) actualAcceptResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Disjunction(ExpressionList(),ExpressionList())", actualAcceptResult.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("Disjunction(ExpressionList(),ExpressionList())",
        (new Disjunction(new ExpressionList(), new ExpressionList())).toString());
  }
}

