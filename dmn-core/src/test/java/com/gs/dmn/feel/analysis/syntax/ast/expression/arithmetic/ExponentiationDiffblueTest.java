package com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.PathExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import org.junit.Test;

public class ExponentiationDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    NumericLiteral leftOperand = new NumericLiteral("1");
    PathExpression leftOperand1 = new PathExpression(new Name("loan"), "rate");
    Addition leftOperand2 = new Addition("+", leftOperand,
        new Multiplication("/", leftOperand1, new NumericLiteral("12")));

    // Act
    Exponentiation actualExponentiation = new Exponentiation(leftOperand2,
        new ArithmeticNegation(new PathExpression(new Name("loan"), "termMonths")));

    // Assert
    assertEquals("**", actualExponentiation.getOperator());
    assertTrue(actualExponentiation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals(
        "Exponentiation(Addition(+,NumericLiteral(1),Multiplication(/,PathExpression(Name(loan), rate)"
            + ",NumericLiteral(12))),ArithmeticNegation(PathExpression(Name(loan), termMonths)))",
        actualExponentiation.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    NumericLiteral leftOperand = new NumericLiteral("1");
    Name leftOperand1 = new Name("r");
    Addition leftOperand2 = new Addition("+", leftOperand,
        new Multiplication("/", leftOperand1, new NumericLiteral("12")));

    // Act
    Exponentiation actualExponentiation = new Exponentiation(leftOperand2, new ArithmeticNegation(new Name("n")));

    // Assert
    assertEquals("**", actualExponentiation.getOperator());
    assertTrue(actualExponentiation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals(
        "Exponentiation(Addition(+,NumericLiteral(1),Multiplication(/,Name(r),NumericLiteral(12))),ArithmeticNegation"
            + "(Name(n)))",
        actualExponentiation.toString());
  }

  @Test
  public void testConstructor3() {
    // Arrange
    NumericLiteral leftOperand = new NumericLiteral("10");

    // Act
    Exponentiation actualExponentiation = new Exponentiation(leftOperand, new NumericLiteral("5"));

    // Assert
    assertEquals("**", actualExponentiation.getOperator());
    assertTrue(actualExponentiation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Exponentiation(NumericLiteral(10),NumericLiteral(5))", actualExponentiation.toString());
  }
}

