package com.gs.dmn.feel.analysis.syntax.ast.expression.comparison;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.PathExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import org.junit.Test;

public class RelationalDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    Name leftOperand = new Name("dept");

    // Act
    Relational actualRelational = new Relational("=", leftOperand, new NumericLiteral("20"));

    // Assert
    assertEquals("=", actualRelational.getOperator());
    assertTrue(actualRelational.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Relational(=,Name(dept),NumericLiteral(20))", actualRelational.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    PathExpression leftOperand = new PathExpression(new Name("item"), "dept");

    // Act
    Relational actualRelational = new Relational("=", leftOperand, new NumericLiteral("20"));

    // Assert
    assertEquals("=", actualRelational.getOperator());
    assertTrue(actualRelational.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Relational(=,PathExpression(Name(item), dept),NumericLiteral(20))", actualRelational.toString());
  }
}

