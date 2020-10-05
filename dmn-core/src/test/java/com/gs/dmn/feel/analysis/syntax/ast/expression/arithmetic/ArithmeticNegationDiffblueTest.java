package com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.SemanticError;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.PathExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.transformation.basic.EnvironmentMemoizer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.omg.spec.dmn._20180521.model.TBusinessKnowledgeModel;
import org.omg.spec.dmn._20180521.model.TDecision;

public class ArithmeticNegationDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testConstructor() {
    // Arrange and Act
    ArithmeticNegation actualArithmeticNegation = new ArithmeticNegation(
        new PathExpression(new Name("loan"), "termMonths"));

    // Assert
    assertNull(actualArithmeticNegation.getRightOperand());
    assertEquals("-", actualArithmeticNegation.getOperator());
    assertEquals("ArithmeticNegation(PathExpression(Name(loan), termMonths))", actualArithmeticNegation.toString());
    assertTrue(actualArithmeticNegation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    ArithmeticNegation actualArithmeticNegation = new ArithmeticNegation(new Name("n"));

    // Assert
    assertNull(actualArithmeticNegation.getRightOperand());
    assertEquals("-", actualArithmeticNegation.getOperator());
    assertEquals("ArithmeticNegation(Name(n))", actualArithmeticNegation.toString());
    assertTrue(actualArithmeticNegation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    ArithmeticNegation actualArithmeticNegation = new ArithmeticNegation(new NumericLiteral(".872"));

    // Assert
    assertNull(actualArithmeticNegation.getRightOperand());
    assertEquals("-", actualArithmeticNegation.getOperator());
    assertEquals("ArithmeticNegation(NumericLiteral(.872))", actualArithmeticNegation.toString());
    assertTrue(actualArithmeticNegation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testDeriveType() {
    // Arrange
    TBusinessKnowledgeModel tBusinessKnowledgeModel = new TBusinessKnowledgeModel();
    FEELContext context = FEELContext.makeContext(tBusinessKnowledgeModel,
        (new EnvironmentMemoizer()).get(tBusinessKnowledgeModel));

    // Act and Assert
    thrown.expect(SemanticError.class);
    (new ArithmeticNegation(new Name("n"))).deriveType(context);
  }

  @Test
  public void testDeriveType2() {
    // Arrange
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, (new EnvironmentMemoizer()).get(tDecision));

    // Act and Assert
    thrown.expect(SemanticError.class);
    (new ArithmeticNegation(new NumericLiteral(".872"))).deriveType(context);
  }
}

