package com.gs.dmn.feel.analysis.syntax.ast.expression.comparison;

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

public class RelationalDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Relational actualRelational = new Relational("operator", new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("operator", actualRelational.getOperator());
    assertTrue(actualRelational.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Relational(operator,ExpressionList(),ExpressionList" + "())", actualRelational.toString());
  }

  @Test
  public void testAccept() {
    // Arrange
    Relational relational = new Relational("operator", new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(relational, relational.accept(new NopVisitor(), params));
  }

  @Test
  public void testAccept2() {
    // Arrange
    Relational relational = new Relational("operator", new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = relational.accept(new CloneVisitor(), params);

    // Assert
    assertEquals("operator", ((Relational) actualAcceptResult).getOperator());
    Expression rightOperand = ((Relational) actualAcceptResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Relational) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Relational) actualAcceptResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Relational(operator,ExpressionList(),ExpressionList" + "())", actualAcceptResult.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("Relational(operator,ExpressionList(),ExpressionList" + "())",
        (new Relational("operator", new ExpressionList(), new ExpressionList())).toString());
  }
}

