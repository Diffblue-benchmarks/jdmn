package com.gs.dmn.feel.analysis.syntax.ast;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Iterator;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.PathExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Addition;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.ArithmeticNegation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Exponentiation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Multiplication;
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.Relational;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionInvocation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.PositionalParameters;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.BooleanLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NullLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.StringLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.Conjunction;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.Disjunction;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.IfExpression;
import com.gs.dmn.feel.analysis.syntax.ast.test.OperatorTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.RangeTest;
import java.util.ArrayList;
import org.junit.Test;

public class ASTFactoryDiffblueTest {
  @Test
  public void testToExpressionList() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToExpressionListResult = astFactory.toExpressionList(new ArrayList<Expression>());

    // Assert
    assertTrue(actualToExpressionListResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", actualToExpressionListResult.toString());
  }

  @Test
  public void testToExpressionList2() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToExpressionListResult = astFactory.toExpressionList(new ArrayList<Expression>());

    // Assert
    assertTrue(actualToExpressionListResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", actualToExpressionListResult.toString());
  }

  @Test
  public void testToExpressionList3() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToExpressionListResult = astFactory.toExpressionList(new ArrayList<Expression>());

    // Assert
    assertTrue(actualToExpressionListResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", actualToExpressionListResult.toString());
  }

  @Test
  public void testToComparison() {
    // Arrange
    Name leftOperand = new Name("dept");
    NumericLiteral rightOperand = new NumericLiteral("20");

    // Act
    Expression actualToComparisonResult = (new ASTFactory()).toComparison("=", leftOperand, rightOperand);

    // Assert
    assertEquals("=", ((Relational) actualToComparisonResult).getOperator());
    assertTrue(actualToComparisonResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Relational(=,Name(dept),NumericLiteral(20))", actualToComparisonResult.toString());
  }

  @Test
  public void testToComparison2() {
    // Arrange
    PathExpression leftOperand = new PathExpression(new Name("item"), "dept");
    NumericLiteral rightOperand = new NumericLiteral("20");

    // Act
    Expression actualToComparisonResult = (new ASTFactory()).toComparison("=", leftOperand, rightOperand);

    // Assert
    assertEquals("=", ((Relational) actualToComparisonResult).getOperator());
    assertTrue(actualToComparisonResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Relational(=,PathExpression(Name(item), dept),NumericLiteral(20))",
        actualToComparisonResult.toString());
  }

  @Test
  public void testToMultiplication() {
    // Arrange
    NumericLiteral leftOperand = new NumericLiteral("12");
    Name rightOperand = new Name("'Monthly Salary'");

    // Act
    Expression actualToMultiplicationResult = (new ASTFactory()).toMultiplication("*", leftOperand, rightOperand);

    // Assert
    assertEquals("*", ((Multiplication) actualToMultiplicationResult).getOperator());
    assertTrue(actualToMultiplicationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Multiplication(*,NumericLiteral(12),Name('Monthly Salary'))",
        actualToMultiplicationResult.toString());
  }

  @Test
  public void testToMultiplication2() {
    // Arrange
    PathExpression leftOperand = new PathExpression(new Name("loan"), "principal");
    PathExpression rightOperand = new PathExpression(new Name("loan"), "rate");

    // Act
    Expression actualToMultiplicationResult = (new ASTFactory()).toMultiplication("*", leftOperand, rightOperand);

    // Assert
    assertEquals("*", ((Multiplication) actualToMultiplicationResult).getOperator());
    assertTrue(actualToMultiplicationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Multiplication(*,PathExpression(Name(loan), principal),PathExpression(Name(loan), rate))",
        actualToMultiplicationResult.toString());
  }

  @Test
  public void testToMultiplication3() {
    // Arrange
    PathExpression leftOperand = new PathExpression(new Name("loan"), "principal");
    Multiplication leftOperand1 = new Multiplication("*", leftOperand, new PathExpression(new Name("loan"), "rate"));
    NumericLiteral rightOperand = new NumericLiteral("12");

    // Act
    Expression actualToMultiplicationResult = (new ASTFactory()).toMultiplication("/", leftOperand1, rightOperand);

    // Assert
    assertEquals("/", ((Multiplication) actualToMultiplicationResult).getOperator());
    assertTrue(actualToMultiplicationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Multiplication(/,Multiplication(*,PathExpression(Name(loan), principal),PathExpression(Name(loan),"
        + " rate)),NumericLiteral(12))", actualToMultiplicationResult.toString());
  }

  @Test
  public void testToAddition() {
    // Arrange
    StringLiteral leftOperand = new StringLiteral("\"Hello \"");
    Name rightOperand = new Name("'Full Name'");

    // Act
    Expression actualToAdditionResult = (new ASTFactory()).toAddition("+", leftOperand, rightOperand);

    // Assert
    assertEquals("+", ((Addition) actualToAdditionResult).getOperator());
    assertTrue(actualToAdditionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Addition(+,StringLiteral(\"Hello \"),Name('Full Name'))", actualToAdditionResult.toString());
  }

  @Test
  public void testToAddition2() {
    // Arrange
    StringLiteral leftOperand = new StringLiteral("\"You are \"");
    Name rightOperand = new Name("'Employment Status'");

    // Act
    Expression actualToAdditionResult = (new ASTFactory()).toAddition("+", leftOperand, rightOperand);

    // Assert
    assertEquals("+", ((Addition) actualToAdditionResult).getOperator());
    assertTrue(actualToAdditionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Addition(+,StringLiteral(\"You are \"),Name('Employment Status'))",
        actualToAdditionResult.toString());
  }

  @Test
  public void testToAddition3() {
    // Arrange
    NumericLiteral leftOperand = new NumericLiteral("1");
    PathExpression leftOperand1 = new PathExpression(new Name("loan"), "rate");
    Multiplication rightOperand = new Multiplication("/", leftOperand1, new NumericLiteral("12"));

    // Act
    Expression actualToAdditionResult = (new ASTFactory()).toAddition("+", leftOperand, rightOperand);

    // Assert
    assertEquals("+", ((Addition) actualToAdditionResult).getOperator());
    assertTrue(actualToAdditionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Addition(+,NumericLiteral(1),Multiplication(/,PathExpression(Name(loan), rate),NumericLiteral(12)))",
        actualToAdditionResult.toString());
  }

  @Test
  public void testToExponentiation() {
    // Arrange
    NumericLiteral leftOperand = new NumericLiteral("1");
    PathExpression leftOperand1 = new PathExpression(new Name("loan"), "rate");
    Addition leftOperand2 = new Addition("+", leftOperand,
        new Multiplication("/", leftOperand1, new NumericLiteral("12")));
    ArithmeticNegation rightOperand = new ArithmeticNegation(new PathExpression(new Name("loan"), "termMonths"));

    // Act
    Expression actualToExponentiationResult = (new ASTFactory()).toExponentiation(leftOperand2, rightOperand);

    // Assert
    assertEquals("**", ((Exponentiation) actualToExponentiationResult).getOperator());
    assertTrue(actualToExponentiationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals(
        "Exponentiation(Addition(+,NumericLiteral(1),Multiplication(/,PathExpression(Name(loan), rate)"
            + ",NumericLiteral(12))),ArithmeticNegation(PathExpression(Name(loan), termMonths)))",
        actualToExponentiationResult.toString());
  }

  @Test
  public void testToExponentiation2() {
    // Arrange
    NumericLiteral leftOperand = new NumericLiteral("1");
    Name leftOperand1 = new Name("r");
    Addition leftOperand2 = new Addition("+", leftOperand,
        new Multiplication("/", leftOperand1, new NumericLiteral("12")));
    ArithmeticNegation rightOperand = new ArithmeticNegation(new Name("n"));

    // Act
    Expression actualToExponentiationResult = (new ASTFactory()).toExponentiation(leftOperand2, rightOperand);

    // Assert
    assertEquals("**", ((Exponentiation) actualToExponentiationResult).getOperator());
    assertTrue(actualToExponentiationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals(
        "Exponentiation(Addition(+,NumericLiteral(1),Multiplication(/,Name(r),NumericLiteral(12))),ArithmeticNegation"
            + "(Name(n)))",
        actualToExponentiationResult.toString());
  }

  @Test
  public void testToExponentiation3() {
    // Arrange
    NumericLiteral leftOperand = new NumericLiteral("10");
    NumericLiteral rightOperand = new NumericLiteral("5");

    // Act
    Expression actualToExponentiationResult = (new ASTFactory()).toExponentiation(leftOperand, rightOperand);

    // Assert
    assertEquals("**", ((Exponentiation) actualToExponentiationResult).getOperator());
    assertTrue(actualToExponentiationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Exponentiation(NumericLiteral(10),NumericLiteral(5))", actualToExponentiationResult.toString());
  }

  @Test
  public void testToNegation() {
    // Arrange
    PathExpression operand = new PathExpression(new Name("loan"), "termMonths");

    // Act
    Expression actualToNegationResult = (new ASTFactory()).toNegation("-", operand);

    // Assert
    assertNull(((ArithmeticNegation) actualToNegationResult).getRightOperand());
    assertEquals("-", ((ArithmeticNegation) actualToNegationResult).getOperator());
    assertEquals("ArithmeticNegation(PathExpression(Name(loan), termMonths))", actualToNegationResult.toString());
    assertTrue(actualToNegationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testToNegation2() {
    // Arrange
    Name operand = new Name("n");

    // Act
    Expression actualToNegationResult = (new ASTFactory()).toNegation("-", operand);

    // Assert
    assertNull(((ArithmeticNegation) actualToNegationResult).getRightOperand());
    assertEquals("-", ((ArithmeticNegation) actualToNegationResult).getOperator());
    assertEquals("ArithmeticNegation(Name(n))", actualToNegationResult.toString());
    assertTrue(actualToNegationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testToNegation3() {
    // Arrange
    NumericLiteral operand = new NumericLiteral(".872");

    // Act
    Expression actualToNegationResult = (new ASTFactory()).toNegation("-", operand);

    // Assert
    assertNull(((ArithmeticNegation) actualToNegationResult).getRightOperand());
    assertEquals("-", ((ArithmeticNegation) actualToNegationResult).getOperator());
    assertEquals("ArithmeticNegation(NumericLiteral(.872))", actualToNegationResult.toString());
    assertTrue(actualToNegationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testToNegation4() {
    // Arrange
    StringLiteral stringLiteral = new StringLiteral("\"Hello \"");
    ASTFactory astFactory = new ASTFactory();

    // Act and Assert
    assertSame(stringLiteral, astFactory.toNegation(new ArrayList<String>(), stringLiteral));
  }

  @Test
  public void testToNegation5() {
    // Arrange
    Name name = new Name("'Full Name'");
    ASTFactory astFactory = new ASTFactory();

    // Act and Assert
    assertSame(name, astFactory.toNegation(new ArrayList<String>(), name));
  }

  @Test
  public void testToNegation6() {
    // Arrange
    NumericLiteral numericLiteral = new NumericLiteral("12");
    ASTFactory astFactory = new ASTFactory();

    // Act and Assert
    assertSame(numericLiteral, astFactory.toNegation(new ArrayList<String>(), numericLiteral));
  }

  @Test
  public void testToNumericLiteral() {
    // Arrange and Act
    NumericLiteral actualToNumericLiteralResult = (new ASTFactory()).toNumericLiteral("12");

    // Assert
    assertTrue(actualToNumericLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("12", actualToNumericLiteralResult.getLexeme());
  }

  @Test
  public void testToNumericLiteral2() {
    // Arrange and Act
    NumericLiteral actualToNumericLiteralResult = (new ASTFactory()).toNumericLiteral("18");

    // Assert
    assertTrue(actualToNumericLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("18", actualToNumericLiteralResult.getLexeme());
  }

  @Test
  public void testToNumericLiteral3() {
    // Arrange and Act
    NumericLiteral actualToNumericLiteralResult = (new ASTFactory()).toNumericLiteral("18");

    // Assert
    assertTrue(actualToNumericLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("18", actualToNumericLiteralResult.getLexeme());
  }

  @Test
  public void testToStringLiteral() {
    // Arrange and Act
    StringLiteral actualToStringLiteralResult = (new ASTFactory()).toStringLiteral("\"Hello \"");

    // Assert
    assertTrue(actualToStringLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("\"Hello \"", actualToStringLiteralResult.getLexeme());
  }

  @Test
  public void testToStringLiteral2() {
    // Arrange and Act
    StringLiteral actualToStringLiteralResult = (new ASTFactory()).toStringLiteral("\"You are \"");

    // Assert
    assertTrue(actualToStringLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("\"You are \"", actualToStringLiteralResult.getLexeme());
  }

  @Test
  public void testToStringLiteral3() {
    // Arrange and Act
    StringLiteral actualToStringLiteralResult = (new ASTFactory()).toStringLiteral("\"Medium\"");

    // Assert
    assertTrue(actualToStringLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("\"Medium\"", actualToStringLiteralResult.getLexeme());
  }

  @Test
  public void testToBooleanLiteral() {
    // Arrange and Act
    BooleanLiteral actualToBooleanLiteralResult = (new ASTFactory()).toBooleanLiteral("true");

    // Assert
    assertTrue(actualToBooleanLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("true", actualToBooleanLiteralResult.getLexeme());
  }

  @Test
  public void testToBooleanLiteral2() {
    // Arrange and Act
    BooleanLiteral actualToBooleanLiteralResult = (new ASTFactory()).toBooleanLiteral("true");

    // Assert
    assertTrue(actualToBooleanLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("true", actualToBooleanLiteralResult.getLexeme());
  }

  @Test
  public void testToBooleanLiteral3() {
    // Arrange and Act
    BooleanLiteral actualToBooleanLiteralResult = (new ASTFactory()).toBooleanLiteral("true");

    // Assert
    assertTrue(actualToBooleanLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("true", actualToBooleanLiteralResult.getLexeme());
  }

  @Test
  public void testToName() {
    // Arrange and Act
    Expression actualToNameResult = (new ASTFactory()).toName("'Full Name'");

    // Assert
    assertTrue(actualToNameResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name('Full Name')", actualToNameResult.toString());
  }

  @Test
  public void testToName2() {
    // Arrange and Act
    Expression actualToNameResult = (new ASTFactory()).toName("'Monthly Salary'");

    // Assert
    assertTrue(actualToNameResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name('Monthly Salary')", actualToNameResult.toString());
  }

  @Test
  public void testToName3() {
    // Arrange and Act
    Expression actualToNameResult = (new ASTFactory()).toName("'Employment Status'");

    // Assert
    assertTrue(actualToNameResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name('Employment Status')", actualToNameResult.toString());
  }

  @Test
  public void testToAny() {
    // Arrange, Act and Assert
    assertTrue((new ASTFactory()).toAny().getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue((new ASTFactory()).toAny().getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue((new ASTFactory()).toAny().getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testToPositiveUnaryTest() {
    // Arrange
    OperatorTest operatorTest = new OperatorTest(">=", new NumericLiteral("18"));

    // Act and Assert
    assertSame(operatorTest, (new ASTFactory()).toPositiveUnaryTest(operatorTest));
  }

  @Test
  public void testToPositiveUnaryTest2() {
    // Arrange
    StringLiteral expression = new StringLiteral("\"Medium\"");

    // Act
    PositiveUnaryTest actualToPositiveUnaryTestResult = (new ASTFactory()).toPositiveUnaryTest(expression);

    // Assert
    String actualOperator = ((OperatorTest) actualToPositiveUnaryTestResult).getOperator();
    assertTrue(actualToPositiveUnaryTestResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(actualOperator);
    assertEquals("OperatorTest(null,StringLiteral(\"Medium\"))", actualToPositiveUnaryTestResult.toString());
  }

  @Test
  public void testToPositiveUnaryTest3() {
    // Arrange
    StringLiteral expression = new StringLiteral("\"Low\"");

    // Act
    PositiveUnaryTest actualToPositiveUnaryTestResult = (new ASTFactory()).toPositiveUnaryTest(expression);

    // Assert
    String actualOperator = ((OperatorTest) actualToPositiveUnaryTestResult).getOperator();
    assertTrue(actualToPositiveUnaryTestResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(actualOperator);
    assertEquals("OperatorTest(null,StringLiteral(\"Low\"))", actualToPositiveUnaryTestResult.toString());
  }

  @Test
  public void testToOperatorTest() {
    // Arrange
    NumericLiteral endpoint = new NumericLiteral("18");

    // Act
    OperatorTest actualToOperatorTestResult = (new ASTFactory()).toOperatorTest(">=", endpoint);

    // Assert
    assertTrue(actualToOperatorTestResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals(">=", actualToOperatorTestResult.getOperator());
    assertEquals("OperatorTest(>=,NumericLiteral(18))", actualToOperatorTestResult.toString());
  }

  @Test
  public void testToOperatorTest2() {
    // Arrange
    StringLiteral endpoint = new StringLiteral("\"Medium\"");

    // Act
    OperatorTest actualToOperatorTestResult = (new ASTFactory()).toOperatorTest(null, endpoint);

    // Assert
    assertTrue(actualToOperatorTestResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(actualToOperatorTestResult.getOperator());
    assertEquals("OperatorTest(null,StringLiteral(\"Medium\"))", actualToOperatorTestResult.toString());
  }

  @Test
  public void testToOperatorTest3() {
    // Arrange
    StringLiteral endpoint = new StringLiteral("\"Low\"");

    // Act
    OperatorTest actualToOperatorTestResult = (new ASTFactory()).toOperatorTest(null, endpoint);

    // Assert
    assertTrue(actualToOperatorTestResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(actualToOperatorTestResult.getOperator());
    assertEquals("OperatorTest(null,StringLiteral(\"Low\"))", actualToOperatorTestResult.toString());
  }

  @Test
  public void testToIntervalTest() {
    // Arrange
    NumericLiteral start = new NumericLiteral("18");
    NumericLiteral end = new NumericLiteral("21");

    // Act
    RangeTest actualToIntervalTestResult = (new ASTFactory()).toIntervalTest("[", start, "]", end);

    // Assert
    assertTrue(actualToIntervalTestResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertFalse(actualToIntervalTestResult.isOpenEnd());
    assertEquals("IntervalTest(false,NumericLiteral(18),false,NumericLiteral(21))",
        actualToIntervalTestResult.toString());
    assertFalse(actualToIntervalTestResult.isOpenStart());
  }

  @Test
  public void testToIntervalTest2() {
    // Arrange
    NumericLiteral start = new NumericLiteral("22");
    NumericLiteral end = new NumericLiteral("25");

    // Act
    RangeTest actualToIntervalTestResult = (new ASTFactory()).toIntervalTest("[", start, "]", end);

    // Assert
    assertTrue(actualToIntervalTestResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertFalse(actualToIntervalTestResult.isOpenEnd());
    assertEquals("IntervalTest(false,NumericLiteral(22),false,NumericLiteral(25))",
        actualToIntervalTestResult.toString());
    assertFalse(actualToIntervalTestResult.isOpenStart());
  }

  @Test
  public void testToIntervalTest3() {
    // Arrange
    NumericLiteral start = new NumericLiteral("26");
    NumericLiteral end = new NumericLiteral("35");

    // Act
    RangeTest actualToIntervalTestResult = (new ASTFactory()).toIntervalTest("[", start, "]", end);

    // Assert
    assertTrue(actualToIntervalTestResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertFalse(actualToIntervalTestResult.isOpenEnd());
    assertEquals("IntervalTest(false,NumericLiteral(26),false,NumericLiteral(35))",
        actualToIntervalTestResult.toString());
    assertFalse(actualToIntervalTestResult.isOpenStart());
  }

  @Test
  public void testToPositiveUnaryTests() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    PositiveUnaryTests actualToPositiveUnaryTestsResult = astFactory.toPositiveUnaryTests(new ArrayList<Expression>());

    // Assert
    assertTrue(actualToPositiveUnaryTestsResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PositiveUnaryTests()", actualToPositiveUnaryTestsResult.toString());
  }

  @Test
  public void testToPositiveUnaryTests2() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    PositiveUnaryTests actualToPositiveUnaryTestsResult = astFactory.toPositiveUnaryTests(new ArrayList<Expression>());

    // Assert
    assertTrue(actualToPositiveUnaryTestsResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PositiveUnaryTests()", actualToPositiveUnaryTestsResult.toString());
  }

  @Test
  public void testToPositiveUnaryTests3() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    PositiveUnaryTests actualToPositiveUnaryTestsResult = astFactory.toPositiveUnaryTests(new ArrayList<Expression>());

    // Assert
    assertTrue(actualToPositiveUnaryTestsResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PositiveUnaryTests()", actualToPositiveUnaryTestsResult.toString());
  }

  @Test
  public void testToIterator() {
    // Arrange
    ExpressionIteratorDomain domain = new ExpressionIteratorDomain(new Name("Loans"));

    // Act
    Iterator actualToIteratorResult = (new ASTFactory()).toIterator("i", domain);

    // Assert
    assertEquals("i", actualToIteratorResult.getName());
    assertEquals("Iterator(i in ExpressionIteratorDomain(Name(Loans)))", actualToIteratorResult.toString());
  }

  @Test
  public void testToIteratorDomain() {
    // Arrange
    Name start = new Name("Loans");

    // Act and Assert
    assertEquals("ExpressionIteratorDomain(Name(Loans))", (new ASTFactory()).toIteratorDomain(start, null).toString());
  }

  @Test
  public void testToListLiteral() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToListLiteralResult = astFactory.toListLiteral(new ArrayList<Expression>());

    // Assert
    assertTrue(actualToListLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListLiteral()", actualToListLiteralResult.toString());
  }

  @Test
  public void testToListLiteral2() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToListLiteralResult = astFactory.toListLiteral(new ArrayList<Expression>());

    // Assert
    assertTrue(actualToListLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListLiteral()", actualToListLiteralResult.toString());
  }

  @Test
  public void testToListLiteral3() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToListLiteralResult = astFactory.toListLiteral(new ArrayList<Expression>());

    // Assert
    assertTrue(actualToListLiteralResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListLiteral()", actualToListLiteralResult.toString());
  }

  @Test
  public void testToNullLiteral() {
    // Arrange, Act and Assert
    assertTrue((new ASTFactory()).toNullLiteral().getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue((new ASTFactory()).toNullLiteral().getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue((new ASTFactory()).toNullLiteral().getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testToForExpression() {
    // Arrange
    Name function = new Name("PMT2");
    FunctionInvocation body = new FunctionInvocation(function, new PositionalParameters(new ArrayList<Expression>()));
    ASTFactory astFactory = new ASTFactory();

    // Act
    Expression actualToForExpressionResult = astFactory.toForExpression(new ArrayList<Iterator>(), body);

    // Assert
    assertTrue(actualToForExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ForExpression( -> FunctionInvocation(Name(PMT2) -> PositionalParameters()))",
        actualToForExpressionResult.toString());
  }

  @Test
  public void testToIfExpression() {
    // Arrange
    Name leftOperand = new Name("DisposableIncome");
    Multiplication leftOperand1 = new Multiplication("*", leftOperand, new Name("CreditContingencyFactor"));
    Relational condition = new Relational(">", leftOperand1, new Name("RequiredMonthlyInstallment"));
    BooleanLiteral thenExpression = new BooleanLiteral("true");
    BooleanLiteral elseExpression = new BooleanLiteral("false");

    // Act
    IfExpression actualToIfExpressionResult = (new ASTFactory()).toIfExpression(condition, thenExpression,
        elseExpression);

    // Assert
    assertTrue(actualToIfExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals(
        "IfExpression(Relational(>,Multiplication(*,Name(DisposableIncome),Name(CreditContingencyFactor)),Name"
            + "(RequiredMonthlyInstallment)), BooleanLiteral(true), BooleanLiteral(false))",
        actualToIfExpressionResult.toString());
  }

  @Test
  public void testToIfExpression2() {
    // Arrange
    Name leftOperand = new Name("ProductType");
    Relational condition = new Relational("=", leftOperand, new StringLiteral("\"SPECIAL LOAN\""));
    NumericLiteral thenExpression = new NumericLiteral("25.00");
    NullLiteral elseExpression = new NullLiteral();

    // Act
    IfExpression actualToIfExpressionResult = (new ASTFactory()).toIfExpression(condition, thenExpression,
        elseExpression);

    // Assert
    assertTrue(actualToIfExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("IfExpression(Relational(=,Name(ProductType),StringLiteral(\"SPECIAL LOAN\")), NumericLiteral(25.00),"
        + " NullLiteral())", actualToIfExpressionResult.toString());
  }

  @Test
  public void testToIfExpression3() {
    // Arrange
    Name leftOperand = new Name("ProductType");
    Relational condition = new Relational("=", leftOperand, new StringLiteral("\"STANDARD LOAN\""));
    NumericLiteral thenExpression = new NumericLiteral("20.00");
    Name leftOperand1 = new Name("ProductType");
    Relational condition1 = new Relational("=", leftOperand1, new StringLiteral("\"SPECIAL LOAN\""));
    NumericLiteral thenExpression1 = new NumericLiteral("25.00");
    IfExpression elseExpression = new IfExpression(condition1, thenExpression1, new NullLiteral());

    // Act
    IfExpression actualToIfExpressionResult = (new ASTFactory()).toIfExpression(condition, thenExpression,
        elseExpression);

    // Assert
    assertTrue(actualToIfExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("IfExpression(Relational(=,Name(ProductType),StringLiteral(\"STANDARD LOAN\")), NumericLiteral(20.00),"
        + " IfExpression(Relational(=,Name(ProductType),StringLiteral(\"SPECIAL LOAN\")), NumericLiteral(25.00),"
        + " NullLiteral()))", actualToIfExpressionResult.toString());
  }

  @Test
  public void testToDisjunction() {
    // Arrange
    Name left = new Name("A");
    Name right = new Name("B");

    // Act
    Expression actualToDisjunctionResult = (new ASTFactory()).toDisjunction(left, right);

    // Assert
    assertEquals("or", ((Disjunction) actualToDisjunctionResult).getOperator());
    assertTrue(actualToDisjunctionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Disjunction(Name(A),Name(B))", actualToDisjunctionResult.toString());
  }

  @Test
  public void testToConjunction() {
    // Arrange
    Name left = new Name("A");
    Name right = new Name("B");

    // Act
    Expression actualToConjunctionResult = (new ASTFactory()).toConjunction(left, right);

    // Assert
    assertEquals("and", ((Conjunction) actualToConjunctionResult).getOperator());
    assertTrue(actualToConjunctionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Conjunction(Name(A),Name(B))", actualToConjunctionResult.toString());
  }

  @Test
  public void testToPathExpression() {
    // Arrange
    Name source = new Name("loan");

    // Act
    Expression actualToPathExpressionResult = (new ASTFactory()).toPathExpression(source, "principal");

    // Assert
    String actualMember = ((PathExpression) actualToPathExpressionResult).getMember();
    assertTrue(actualToPathExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PathExpression(Name(loan), principal)", actualToPathExpressionResult.toString());
    assertEquals("principal", actualMember);
  }

  @Test
  public void testToPathExpression2() {
    // Arrange
    Name source = new Name("loan");

    // Act
    Expression actualToPathExpressionResult = (new ASTFactory()).toPathExpression(source, "rate");

    // Assert
    String actualMember = ((PathExpression) actualToPathExpressionResult).getMember();
    assertTrue(actualToPathExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PathExpression(Name(loan), rate)", actualToPathExpressionResult.toString());
    assertEquals("rate", actualMember);
  }

  @Test
  public void testToPathExpression3() {
    // Arrange
    Name source = new Name("loan");

    // Act
    Expression actualToPathExpressionResult = (new ASTFactory()).toPathExpression(source, "rate");

    // Assert
    String actualMember = ((PathExpression) actualToPathExpressionResult).getMember();
    assertTrue(actualToPathExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PathExpression(Name(loan), rate)", actualToPathExpressionResult.toString());
    assertEquals("rate", actualMember);
  }

  @Test
  public void testToFilterExpression() {
    // Arrange
    Name value = new Name("Employees");
    Name leftOperand = new Name("dept");
    Relational filter = new Relational("=", leftOperand, new NumericLiteral("20"));

    // Act
    Expression actualToFilterExpressionResult = (new ASTFactory()).toFilterExpression(value, filter);

    // Assert
    assertTrue(actualToFilterExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FilterExpression(Name(Employees), Relational(=,Name(dept),NumericLiteral(20)))",
        actualToFilterExpressionResult.toString());
  }

  @Test
  public void testToFilterExpression2() {
    // Arrange
    Name value = new Name("EmployeeTable");
    Name leftOperand = new Name("name");
    Relational filter = new Relational("=", leftOperand, new Name("LastName"));

    // Act
    Expression actualToFilterExpressionResult = (new ASTFactory()).toFilterExpression(value, filter);

    // Assert
    assertTrue(actualToFilterExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FilterExpression(Name(EmployeeTable), Relational(=,Name(name),Name(LastName)))",
        actualToFilterExpressionResult.toString());
  }

  @Test
  public void testToFunctionInvocation() {
    // Arrange
    Name function = new Name("PMT");
    PositionalParameters parameters = new PositionalParameters(new ArrayList<Expression>());

    // Act
    Expression actualToFunctionInvocationResult = (new ASTFactory()).toFunctionInvocation(function, parameters);

    // Assert
    assertTrue(actualToFunctionInvocationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FunctionInvocation(Name(PMT) -> PositionalParameters())",
        actualToFunctionInvocationResult.toString());
  }

  @Test
  public void testToFunctionInvocation2() {
    // Arrange
    Name function = new Name("starts with");
    PositionalParameters parameters = new PositionalParameters(new ArrayList<Expression>());

    // Act
    Expression actualToFunctionInvocationResult = (new ASTFactory()).toFunctionInvocation(function, parameters);

    // Assert
    assertTrue(actualToFunctionInvocationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FunctionInvocation(Name(starts with) -> PositionalParameters())",
        actualToFunctionInvocationResult.toString());
  }

  @Test
  public void testToFunctionInvocation3() {
    // Arrange
    Name function = new Name("starts with");
    PositionalParameters parameters = new PositionalParameters(new ArrayList<Expression>());

    // Act
    Expression actualToFunctionInvocationResult = (new ASTFactory()).toFunctionInvocation(function, parameters);

    // Assert
    assertTrue(actualToFunctionInvocationResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FunctionInvocation(Name(starts with) -> PositionalParameters())",
        actualToFunctionInvocationResult.toString());
  }

  @Test
  public void testToPositionalParameters() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act and Assert
    assertTrue(astFactory.toPositionalParameters(new ArrayList<Expression>()).isEmpty());
  }

  @Test
  public void testToPositionalParameters2() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act and Assert
    assertTrue(astFactory.toPositionalParameters(new ArrayList<Expression>()).isEmpty());
  }

  @Test
  public void testToPositionalParameters3() {
    // Arrange
    ASTFactory astFactory = new ASTFactory();

    // Act and Assert
    assertTrue(astFactory.toPositionalParameters(new ArrayList<Expression>()).isEmpty());
  }
}

