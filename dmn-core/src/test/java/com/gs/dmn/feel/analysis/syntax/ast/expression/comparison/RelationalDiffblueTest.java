package com.gs.dmn.feel.analysis.syntax.ast.expression.comparison;

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

public class RelationalDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void acceptTest() {
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
  public void constructorTest() {
    // Arrange and Act
    Relational actualRelational = new Relational("operator", new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("operator", actualRelational.getOperator());
    assertTrue(actualRelational.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Relational(operator,ExpressionList(),ExpressionList" + "())", actualRelational.toString());
  }
  @Test
  public void deriveTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(SemanticError.class);
    (new Relational("operator", new ExpressionList(), new ExpressionList())).deriveType(null);
  }
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Relational(operator,ExpressionList(),ExpressionList" + "())",
        (new Relational("operator", new ExpressionList(), new ExpressionList())).toString());
  }
}

