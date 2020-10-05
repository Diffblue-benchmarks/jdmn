package com.gs.dmn.feel.analysis.syntax.ast.expression.textual;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.SemanticError;
import com.gs.dmn.feel.analysis.semantics.environment.Environment;
import com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Multiplication;
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.Relational;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.BooleanLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NullLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.StringLiteral;
import com.gs.dmn.transformation.basic.EnvironmentMemoizer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.omg.spec.dmn._20180521.model.TBusinessKnowledgeModel;

public class IfExpressionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testConstructor() {
    // Arrange
    Name leftOperand = new Name("DisposableIncome");
    Multiplication leftOperand1 = new Multiplication("*", leftOperand, new Name("CreditContingencyFactor"));
    Relational condition = new Relational(">", leftOperand1, new Name("RequiredMonthlyInstallment"));
    BooleanLiteral thenExpression = new BooleanLiteral("true");

    // Act
    IfExpression actualIfExpression = new IfExpression(condition, thenExpression, new BooleanLiteral("false"));

    // Assert
    assertTrue(actualIfExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals(
        "IfExpression(Relational(>,Multiplication(*,Name(DisposableIncome),Name(CreditContingencyFactor)),Name"
            + "(RequiredMonthlyInstallment)), BooleanLiteral(true), BooleanLiteral(false))",
        actualIfExpression.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    Name leftOperand = new Name("ProductType");
    Relational condition = new Relational("=", leftOperand, new StringLiteral("\"SPECIAL LOAN\""));
    NumericLiteral thenExpression = new NumericLiteral("25.00");

    // Act
    IfExpression actualIfExpression = new IfExpression(condition, thenExpression, new NullLiteral());

    // Assert
    assertTrue(actualIfExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("IfExpression(Relational(=,Name(ProductType),StringLiteral(\"SPECIAL LOAN\")), NumericLiteral(25.00),"
        + " NullLiteral())", actualIfExpression.toString());
  }

  @Test
  public void testConstructor3() {
    // Arrange
    Name leftOperand = new Name("ProductType");
    Relational condition = new Relational("=", leftOperand, new StringLiteral("\"STANDARD LOAN\""));
    NumericLiteral thenExpression = new NumericLiteral("20.00");
    Name leftOperand1 = new Name("ProductType");
    Relational condition1 = new Relational("=", leftOperand1, new StringLiteral("\"SPECIAL LOAN\""));
    NumericLiteral thenExpression1 = new NumericLiteral("25.00");

    // Act
    IfExpression actualIfExpression = new IfExpression(condition, thenExpression,
        new IfExpression(condition1, thenExpression1, new NullLiteral()));

    // Assert
    assertTrue(actualIfExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("IfExpression(Relational(=,Name(ProductType),StringLiteral(\"STANDARD LOAN\")), NumericLiteral(20.00),"
        + " IfExpression(Relational(=,Name(ProductType),StringLiteral(\"SPECIAL LOAN\")), NumericLiteral(25.00),"
        + " NullLiteral()))", actualIfExpression.toString());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    Environment environment = (new EnvironmentMemoizer()).get(tBusinessKnowledgeModel);
    FEELContext context = FEELContext.makeContext(tBusinessKnowledgeModel, FEELContext
        .makeContext(tBusinessKnowledgeModel, StandardEnvironmentFactory.instance().makeEnvironment(environment, null))
        .getEnvironment());
    Name leftOperand = new Name("DisposableIncome");
    Multiplication leftOperand1 = new Multiplication("*", leftOperand, new Name("CreditContingencyFactor"));
    Relational condition = new Relational(">", leftOperand1, new Name("RequiredMonthlyInstallment"));
    BooleanLiteral thenExpression = new BooleanLiteral("true");

    // Act and Assert
    thrown.expect(SemanticError.class);
    (new IfExpression(condition, thenExpression, new BooleanLiteral("false"))).deriveType(context);
  }
}

