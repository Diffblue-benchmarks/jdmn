package com.gs.dmn.feel.analysis.syntax.antlrv4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.Test;

public class FEELParserDiffblueTest {
  @Test
  public void testAdditionContextConstructor() {
    // Arrange and Act
    FEELParser.AdditionContext actualAdditionContext = new FEELParser.AdditionContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualAdditionContext.invokingState);
    assertEquals(2, actualAdditionContext.depth());
  }

  @Test
  public void testAdditionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(31, (new FEELParser.AdditionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testAdditionContextMINUS() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.AdditionContext(new ParserRuleContext(), 1)).MINUS().size());
  }

  @Test
  public void testAdditionContextMINUS2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.AdditionContext(new ParserRuleContext(), 1)).MINUS(1));
  }

  @Test
  public void testAdditionContextMultiplication() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.AdditionContext(new ParserRuleContext(), 1)).multiplication(1));
  }

  @Test
  public void testAdditionContextMultiplication2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.AdditionContext(new ParserRuleContext(), 1)).multiplication().size());
  }

  @Test
  public void testAdditionContextPLUS() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.AdditionContext(new ParserRuleContext(), 1)).PLUS().size());
  }

  @Test
  public void testAdditionContextPLUS2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.AdditionContext(new ParserRuleContext(), 1)).PLUS(1));
  }

  @Test
  public void testArithmeticExpressionContextAddition() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ArithmeticExpressionContext(new ParserRuleContext(), 1)).addition());
  }

  @Test
  public void testArithmeticExpressionContextConstructor() {
    // Arrange and Act
    FEELParser.ArithmeticExpressionContext actualArithmeticExpressionContext = new FEELParser.ArithmeticExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualArithmeticExpressionContext.invokingState);
    assertEquals(2, actualArithmeticExpressionContext.depth());
  }

  @Test
  public void testArithmeticExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(30, (new FEELParser.ArithmeticExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testArithmeticNegationContextConstructor() {
    // Arrange and Act
    FEELParser.ArithmeticNegationContext actualArithmeticNegationContext = new FEELParser.ArithmeticNegationContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualArithmeticNegationContext.invokingState);
    assertEquals(2, actualArithmeticNegationContext.depth());
  }

  @Test
  public void testArithmeticNegationContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(34, (new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testArithmeticNegationContextInstanceOf() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).instanceOf());
  }

  @Test
  public void testArithmeticNegationContextMINUS() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).MINUS().size());
  }

  @Test
  public void testArithmeticNegationContextMINUS2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).MINUS(1));
  }

  @Test
  public void testArithmeticNegationContextNOT() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).NOT().size());
  }

  @Test
  public void testArithmeticNegationContextNOT2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).NOT(1));
  }

  @Test
  public void testBooleanLiteralContextConstructor() {
    // Arrange and Act
    FEELParser.BooleanLiteralContext actualBooleanLiteralContext = new FEELParser.BooleanLiteralContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualBooleanLiteralContext.invokingState);
    assertEquals(2, actualBooleanLiteralContext.depth());
  }

  @Test
  public void testBooleanLiteralContextFALSE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BooleanLiteralContext(new ParserRuleContext(), 1)).FALSE());
  }

  @Test
  public void testBooleanLiteralContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(48, (new FEELParser.BooleanLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testBooleanLiteralContextTRUE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BooleanLiteralContext(new ParserRuleContext(), 1)).TRUE());
  }

  @Test
  public void testBoxedExpressionContextConstructor() {
    // Arrange and Act
    FEELParser.BoxedExpressionContext actualBoxedExpressionContext = new FEELParser.BoxedExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualBoxedExpressionContext.invokingState);
    assertEquals(2, actualBoxedExpressionContext.depth());
  }

  @Test
  public void testBoxedExpressionContextContext() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BoxedExpressionContext(new ParserRuleContext(), 1)).context());
  }

  @Test
  public void testBoxedExpressionContextFunctionDefinition() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BoxedExpressionContext(new ParserRuleContext(), 1)).functionDefinition());
  }

  @Test
  public void testBoxedExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(50, (new FEELParser.BoxedExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testBoxedExpressionContextList() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BoxedExpressionContext(new ParserRuleContext(), 1)).list());
  }

  @Test
  public void testBoxedExpressionRootContextBoxedExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BoxedExpressionRootContext(new ParserRuleContext(), 1)).boxedExpression());
  }

  @Test
  public void testBoxedExpressionRootContextConstructor() {
    // Arrange and Act
    FEELParser.BoxedExpressionRootContext actualBoxedExpressionRootContext = new FEELParser.BoxedExpressionRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualBoxedExpressionRootContext.invokingState);
    assertEquals(2, actualBoxedExpressionRootContext.depth());
  }

  @Test
  public void testBoxedExpressionRootContextEOF() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BoxedExpressionRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void testBoxedExpressionRootContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(5, (new FEELParser.BoxedExpressionRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testComparisonContextAND() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).AND());
  }

  @Test
  public void testComparisonContextArithmeticExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).arithmeticExpression(1));
  }

  @Test
  public void testComparisonContextArithmeticExpression2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).arithmeticExpression().size());
  }

  @Test
  public void testComparisonContextBETWEEN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).BETWEEN());
  }

  @Test
  public void testComparisonContextConstructor() {
    // Arrange and Act
    FEELParser.ComparisonContext actualComparisonContext = new FEELParser.ComparisonContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualComparisonContext.invokingState);
    assertEquals(2, actualComparisonContext.depth());
  }

  @Test
  public void testComparisonContextEQ() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).EQ());
  }

  @Test
  public void testComparisonContextExpression() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test
  public void testComparisonContextExpression2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void testComparisonContextGE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).GE());
  }

  @Test
  public void testComparisonContextGT() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).GT());
  }

  @Test
  public void testComparisonContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(29, (new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testComparisonContextIN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).IN());
  }

  @Test
  public void testComparisonContextLE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).LE());
  }

  @Test
  public void testComparisonContextLT() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).LT());
  }

  @Test
  public void testComparisonContextNE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).NE());
  }

  @Test
  public void testComparisonContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testComparisonContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testComparisonContextPositiveUnaryTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).positiveUnaryTest());
  }

  @Test
  public void testComparisonContextPositiveUnaryTests() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).positiveUnaryTests());
  }

  @Test
  public void testConjunctionContextAND() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ConjunctionContext(new ParserRuleContext(), 1)).AND(1));
  }

  @Test
  public void testConjunctionContextAND2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ConjunctionContext(new ParserRuleContext(), 1)).AND().size());
  }

  @Test
  public void testConjunctionContextComparison() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ConjunctionContext(new ParserRuleContext(), 1)).comparison().size());
  }

  @Test
  public void testConjunctionContextComparison2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ConjunctionContext(new ParserRuleContext(), 1)).comparison(1));
  }

  @Test
  public void testConjunctionContextConstructor() {
    // Arrange and Act
    FEELParser.ConjunctionContext actualConjunctionContext = new FEELParser.ConjunctionContext(new ParserRuleContext(),
        1);

    // Assert
    assertEquals(1, actualConjunctionContext.invokingState);
    assertEquals(2, actualConjunctionContext.depth());
  }

  @Test
  public void testConjunctionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(28, (new FEELParser.ConjunctionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testContextContextBRACE_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextContext(new ParserRuleContext(), 1)).BRACE_CLOSE());
  }

  @Test
  public void testContextContextBRACE_OPEN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextContext(new ParserRuleContext(), 1)).BRACE_OPEN());
  }

  @Test
  public void testContextContextCOMMA() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testContextContextCOMMA2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ContextContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void testContextContextConstructor() {
    // Arrange and Act
    FEELParser.ContextContext actualContextContext = new FEELParser.ContextContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualContextContext.invokingState);
    assertEquals(2, actualContextContext.depth());
  }

  @Test
  public void testContextContextContextEntry() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextContext(new ParserRuleContext(), 1)).contextEntry(1));
  }

  @Test
  public void testContextContextContextEntry2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ContextContext(new ParserRuleContext(), 1)).contextEntry().size());
  }

  @Test
  public void testContextContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(52, (new FEELParser.ContextContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testContextEntryContextCOLON() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextEntryContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test
  public void testContextEntryContextConstructor() {
    // Arrange and Act
    FEELParser.ContextEntryContext actualContextEntryContext = new FEELParser.ContextEntryContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualContextEntryContext.invokingState);
    assertEquals(2, actualContextEntryContext.depth());
  }

  @Test
  public void testContextEntryContextExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextEntryContext(new ParserRuleContext(), 1)).expression());
  }

  @Test
  public void testContextEntryContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(53, (new FEELParser.ContextEntryContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testContextEntryContextKey() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextEntryContext(new ParserRuleContext(), 1)).key());
  }

  @Test
  public void testDateTimeLiteralContextConstructor() {
    // Arrange and Act
    FEELParser.DateTimeLiteralContext actualDateTimeLiteralContext = new FEELParser.DateTimeLiteralContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualDateTimeLiteralContext.invokingState);
    assertEquals(2, actualDateTimeLiteralContext.depth());
  }

  @Test
  public void testDateTimeLiteralContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(55, (new FEELParser.DateTimeLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testDateTimeLiteralContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DateTimeLiteralContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testDateTimeLiteralContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DateTimeLiteralContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testDateTimeLiteralContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DateTimeLiteralContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testDateTimeLiteralContextStringLiteral() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DateTimeLiteralContext(new ParserRuleContext(), 1)).stringLiteral());
  }

  @Test
  public void testDisjunctionContextConjunction() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DisjunctionContext(new ParserRuleContext(), 1)).conjunction(1));
  }

  @Test
  public void testDisjunctionContextConjunction2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.DisjunctionContext(new ParserRuleContext(), 1)).conjunction().size());
  }

  @Test
  public void testDisjunctionContextConstructor() {
    // Arrange and Act
    FEELParser.DisjunctionContext actualDisjunctionContext = new FEELParser.DisjunctionContext(new ParserRuleContext(),
        1);

    // Assert
    assertEquals(1, actualDisjunctionContext.invokingState);
    assertEquals(2, actualDisjunctionContext.depth());
  }

  @Test
  public void testDisjunctionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(27, (new FEELParser.DisjunctionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testDisjunctionContextOR() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.DisjunctionContext(new ParserRuleContext(), 1)).OR().size());
  }

  @Test
  public void testDisjunctionContextOR2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DisjunctionContext(new ParserRuleContext(), 1)).OR(1));
  }

  @Test
  public void testEndpointContextConstructor() {
    // Arrange and Act
    FEELParser.EndpointContext actualEndpointContext = new FEELParser.EndpointContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualEndpointContext.invokingState);
    assertEquals(2, actualEndpointContext.depth());
  }

  @Test
  public void testEndpointContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(15, (new FEELParser.EndpointContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testEndpointContextMINUS() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.EndpointContext(new ParserRuleContext(), 1)).MINUS());
  }

  @Test
  public void testEndpointContextSimpleValue() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.EndpointContext(new ParserRuleContext(), 1)).simpleValue());
  }

  @Test
  public void testExponentiationContextArithmeticNegation() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ExponentiationContext(new ParserRuleContext(), 1)).arithmeticNegation().size());
  }

  @Test
  public void testExponentiationContextArithmeticNegation2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ExponentiationContext(new ParserRuleContext(), 1)).arithmeticNegation(1));
  }

  @Test
  public void testExponentiationContextConstructor() {
    // Arrange and Act
    FEELParser.ExponentiationContext actualExponentiationContext = new FEELParser.ExponentiationContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualExponentiationContext.invokingState);
    assertEquals(2, actualExponentiationContext.depth());
  }

  @Test
  public void testExponentiationContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(33, (new FEELParser.ExponentiationContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testExponentiationContextSTAR_STAR() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ExponentiationContext(new ParserRuleContext(), 1)).STAR_STAR(1));
  }

  @Test
  public void testExponentiationContextSTAR_STAR2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ExponentiationContext(new ParserRuleContext(), 1)).STAR_STAR().size());
  }

  @Test
  public void testExpressionContextConstructor() {
    // Arrange and Act
    FEELParser.ExpressionContext actualExpressionContext = new FEELParser.ExpressionContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualExpressionContext.invokingState);
    assertEquals(2, actualExpressionContext.depth());
  }

  @Test
  public void testExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(18, (new FEELParser.ExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testExpressionContextTextualExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ExpressionContext(new ParserRuleContext(), 1)).textualExpression());
  }

  @Test
  public void testExpressionRootContextConstructor() {
    // Arrange and Act
    FEELParser.ExpressionRootContext actualExpressionRootContext = new FEELParser.ExpressionRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualExpressionRootContext.invokingState);
    assertEquals(2, actualExpressionRootContext.depth());
  }

  @Test
  public void testExpressionRootContextEOF() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ExpressionRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void testExpressionRootContextExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ExpressionRootContext(new ParserRuleContext(), 1)).expression());
  }

  @Test
  public void testExpressionRootContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(2, (new FEELParser.ExpressionRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testForExpressionContextCOMMA() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testForExpressionContextCOMMA2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void testForExpressionContextConstructor() {
    // Arrange and Act
    FEELParser.ForExpressionContext actualForExpressionContext = new FEELParser.ForExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualForExpressionContext.invokingState);
    assertEquals(2, actualForExpressionContext.depth());
  }

  @Test
  public void testForExpressionContextExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).expression());
  }

  @Test
  public void testForExpressionContextFOR() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).FOR());
  }

  @Test
  public void testForExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(23, (new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testForExpressionContextIN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).IN(1));
  }

  @Test
  public void testForExpressionContextIN2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).IN().size());
  }

  @Test
  public void testForExpressionContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void testForExpressionContextIdentifier2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).identifier().size());
  }

  @Test
  public void testForExpressionContextIterationDomain() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).iterationDomain(1));
  }

  @Test
  public void testForExpressionContextIterationDomain2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).iterationDomain().size());
  }

  @Test
  public void testForExpressionContextRETURN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).RETURN());
  }

  @Test
  public void testFormalParameterContextCOLON() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FormalParameterContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test
  public void testFormalParameterContextConstructor() {
    // Arrange and Act
    FEELParser.FormalParameterContext actualFormalParameterContext = new FEELParser.FormalParameterContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualFormalParameterContext.invokingState);
    assertEquals(2, actualFormalParameterContext.depth());
  }

  @Test
  public void testFormalParameterContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(22, (new FEELParser.FormalParameterContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testFormalParameterContextParameterName() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FormalParameterContext(new ParserRuleContext(), 1)).parameterName());
  }

  @Test
  public void testFormalParameterContextType() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FormalParameterContext(new ParserRuleContext(), 1)).type());
  }

  @Test
  public void testFunctionDefinitionContextCOMMA() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testFunctionDefinitionContextCOMMA2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void testFunctionDefinitionContextConstructor() {
    // Arrange and Act
    FEELParser.FunctionDefinitionContext actualFunctionDefinitionContext = new FEELParser.FunctionDefinitionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualFunctionDefinitionContext.invokingState);
    assertEquals(2, actualFunctionDefinitionContext.depth());
  }

  @Test
  public void testFunctionDefinitionContextEXTERNAL() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).EXTERNAL());
  }

  @Test
  public void testFunctionDefinitionContextExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).expression());
  }

  @Test
  public void testFunctionDefinitionContextFUNCTION() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).FUNCTION());
  }

  @Test
  public void testFunctionDefinitionContextFormalParameter() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).formalParameter().size());
  }

  @Test
  public void testFunctionDefinitionContextFormalParameter2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).formalParameter(1));
  }

  @Test
  public void testFunctionDefinitionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(21, (new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testFunctionDefinitionContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testFunctionDefinitionContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testIdentifierContextAND() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IdentifierContext(new ParserRuleContext(), 1)).AND());
  }

  @Test
  public void testIdentifierContextConstructor() {
    // Arrange and Act
    FEELParser.IdentifierContext actualIdentifierContext = new FEELParser.IdentifierContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIdentifierContext.invokingState);
    assertEquals(2, actualIdentifierContext.depth());
  }

  @Test
  public void testIdentifierContextFUNCTION() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IdentifierContext(new ParserRuleContext(), 1)).FUNCTION());
  }

  @Test
  public void testIdentifierContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(56, (new FEELParser.IdentifierContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testIdentifierContextNAME() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IdentifierContext(new ParserRuleContext(), 1)).NAME());
  }

  @Test
  public void testIdentifierContextOR() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IdentifierContext(new ParserRuleContext(), 1)).OR());
  }

  @Test
  public void testIfExpressionContextConstructor() {
    // Arrange and Act
    FEELParser.IfExpressionContext actualIfExpressionContext = new FEELParser.IfExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIfExpressionContext.invokingState);
    assertEquals(2, actualIfExpressionContext.depth());
  }

  @Test
  public void testIfExpressionContextELSE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).ELSE());
  }

  @Test
  public void testIfExpressionContextExpression() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test
  public void testIfExpressionContextExpression2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void testIfExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(25, (new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testIfExpressionContextIF() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).IF());
  }

  @Test
  public void testIfExpressionContextTHEN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).THEN());
  }

  @Test
  public void testInstanceOfContextConstructor() {
    // Arrange and Act
    FEELParser.InstanceOfContext actualInstanceOfContext = new FEELParser.InstanceOfContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualInstanceOfContext.invokingState);
    assertEquals(2, actualInstanceOfContext.depth());
  }

  @Test
  public void testInstanceOfContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(35, (new FEELParser.InstanceOfContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testInstanceOfContextINSTANCE_OF() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.InstanceOfContext(new ParserRuleContext(), 1)).INSTANCE_OF());
  }

  @Test
  public void testInstanceOfContextPostfixExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.InstanceOfContext(new ParserRuleContext(), 1)).postfixExpression());
  }

  @Test
  public void testInstanceOfContextType() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.InstanceOfContext(new ParserRuleContext(), 1)).type());
  }

  @Test
  public void testIntervalContextConstructor() {
    // Arrange and Act
    FEELParser.IntervalContext actualIntervalContext = new FEELParser.IntervalContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIntervalContext.invokingState);
    assertEquals(2, actualIntervalContext.depth());
  }

  @Test
  public void testIntervalContextDOT_DOT() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalContext(new ParserRuleContext(), 1)).DOT_DOT());
  }

  @Test
  public void testIntervalContextEndpoint() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalContext(new ParserRuleContext(), 1)).endpoint(1));
  }

  @Test
  public void testIntervalContextEndpoint2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.IntervalContext(new ParserRuleContext(), 1)).endpoint().size());
  }

  @Test
  public void testIntervalContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(12, (new FEELParser.IntervalContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testIntervalContextIntervalEndPar() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalContext(new ParserRuleContext(), 1)).intervalEndPar());
  }

  @Test
  public void testIntervalContextIntervalStartPar() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalContext(new ParserRuleContext(), 1)).intervalStartPar());
  }

  @Test
  public void testIntervalEndParContextBRACKET_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalEndParContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test
  public void testIntervalEndParContextBRACKET_OPEN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalEndParContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test
  public void testIntervalEndParContextConstructor() {
    // Arrange and Act
    FEELParser.IntervalEndParContext actualIntervalEndParContext = new FEELParser.IntervalEndParContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIntervalEndParContext.invokingState);
    assertEquals(2, actualIntervalEndParContext.depth());
  }

  @Test
  public void testIntervalEndParContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(14, (new FEELParser.IntervalEndParContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testIntervalEndParContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalEndParContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testIntervalStartParContextBRACKET_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalStartParContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test
  public void testIntervalStartParContextBRACKET_OPEN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalStartParContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test
  public void testIntervalStartParContextConstructor() {
    // Arrange and Act
    FEELParser.IntervalStartParContext actualIntervalStartParContext = new FEELParser.IntervalStartParContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIntervalStartParContext.invokingState);
    assertEquals(2, actualIntervalStartParContext.depth());
  }

  @Test
  public void testIntervalStartParContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(13, (new FEELParser.IntervalStartParContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testIntervalStartParContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalStartParContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testIterationDomainContextConstructor() {
    // Arrange and Act
    FEELParser.IterationDomainContext actualIterationDomainContext = new FEELParser.IterationDomainContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIterationDomainContext.invokingState);
    assertEquals(2, actualIterationDomainContext.depth());
  }

  @Test
  public void testIterationDomainContextDOT_DOT() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IterationDomainContext(new ParserRuleContext(), 1)).DOT_DOT());
  }

  @Test
  public void testIterationDomainContextExpression() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.IterationDomainContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test
  public void testIterationDomainContextExpression2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IterationDomainContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void testIterationDomainContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(24, (new FEELParser.IterationDomainContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testKeyContextConstructor() {
    // Arrange and Act
    FEELParser.KeyContext actualKeyContext = new FEELParser.KeyContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualKeyContext.invokingState);
    assertEquals(2, actualKeyContext.depth());
  }

  @Test
  public void testKeyContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(54, (new FEELParser.KeyContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testKeyContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.KeyContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testKeyContextStringLiteral() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.KeyContext(new ParserRuleContext(), 1)).stringLiteral());
  }

  @Test
  public void testListContextBRACKET_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ListContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test
  public void testListContextBRACKET_OPEN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ListContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test
  public void testListContextCOMMA() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ListContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testListContextCOMMA2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ListContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void testListContextConstructor() {
    // Arrange and Act
    FEELParser.ListContext actualListContext = new FEELParser.ListContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualListContext.invokingState);
    assertEquals(2, actualListContext.depth());
  }

  @Test
  public void testListContextExpression() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ListContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test
  public void testListContextExpression2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ListContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void testListContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(51, (new FEELParser.ListContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testLiteralContextConstructor() {
    // Arrange and Act
    FEELParser.LiteralContext actualLiteralContext = new FEELParser.LiteralContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualLiteralContext.invokingState);
    assertEquals(2, actualLiteralContext.depth());
  }

  @Test
  public void testLiteralContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(45, (new FEELParser.LiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testLiteralContextNULL() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.LiteralContext(new ParserRuleContext(), 1)).NULL());
  }

  @Test
  public void testLiteralContextSimpleLiteral() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.LiteralContext(new ParserRuleContext(), 1)).simpleLiteral());
  }

  @Test
  public void testMultiplicationContextConstructor() {
    // Arrange and Act
    FEELParser.MultiplicationContext actualMultiplicationContext = new FEELParser.MultiplicationContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualMultiplicationContext.invokingState);
    assertEquals(2, actualMultiplicationContext.depth());
  }

  @Test
  public void testMultiplicationContextExponentiation() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).exponentiation(1));
  }

  @Test
  public void testMultiplicationContextExponentiation2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).exponentiation().size());
  }

  @Test
  public void testMultiplicationContextFORWARD_SLASH() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).FORWARD_SLASH(1));
  }

  @Test
  public void testMultiplicationContextFORWARD_SLASH2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).FORWARD_SLASH().size());
  }

  @Test
  public void testMultiplicationContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(32, (new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testMultiplicationContextSTAR() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).STAR(1));
  }

  @Test
  public void testMultiplicationContextSTAR2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).STAR().size());
  }

  @Test
  public void testNamedParametersContextCOLON() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).COLON().size());
  }

  @Test
  public void testNamedParametersContextCOLON2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).COLON(1));
  }

  @Test
  public void testNamedParametersContextCOMMA() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testNamedParametersContextCOMMA2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void testNamedParametersContextConstructor() {
    // Arrange and Act
    FEELParser.NamedParametersContext actualNamedParametersContext = new FEELParser.NamedParametersContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualNamedParametersContext.invokingState);
    assertEquals(2, actualNamedParametersContext.depth());
  }

  @Test
  public void testNamedParametersContextExpression() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test
  public void testNamedParametersContextExpression2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void testNamedParametersContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(39, (new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testNamedParametersContextParameterName() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).parameterName(1));
  }

  @Test
  public void testNamedParametersContextParameterName2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).parameterName().size());
  }

  @Test
  public void testNumericLiteralContextConstructor() {
    // Arrange and Act
    FEELParser.NumericLiteralContext actualNumericLiteralContext = new FEELParser.NumericLiteralContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualNumericLiteralContext.invokingState);
    assertEquals(2, actualNumericLiteralContext.depth());
  }

  @Test
  public void testNumericLiteralContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(49, (new FEELParser.NumericLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testNumericLiteralContextNUMBER() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.NumericLiteralContext(new ParserRuleContext(), 1)).NUMBER());
  }

  @Test
  public void testParameterNameContextConstructor() {
    // Arrange and Act
    FEELParser.ParameterNameContext actualParameterNameContext = new FEELParser.ParameterNameContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualParameterNameContext.invokingState);
    assertEquals(2, actualParameterNameContext.depth());
  }

  @Test
  public void testParameterNameContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(40, (new FEELParser.ParameterNameContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testParameterNameContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ParameterNameContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testParametersContextConstructor() {
    // Arrange and Act
    FEELParser.ParametersContext actualParametersContext = new FEELParser.ParametersContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualParametersContext.invokingState);
    assertEquals(2, actualParametersContext.depth());
  }

  @Test
  public void testParametersContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(38, (new FEELParser.ParametersContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testParametersContextNamedParameters() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ParametersContext(new ParserRuleContext(), 1)).namedParameters());
  }

  @Test
  public void testParametersContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ParametersContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testParametersContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ParametersContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testParametersContextPositionalParameters() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ParametersContext(new ParserRuleContext(), 1)).positionalParameters());
  }

  @Test
  public void testPositionalParametersContextCOMMA() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PositionalParametersContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testPositionalParametersContextCOMMA2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PositionalParametersContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void testPositionalParametersContextConstructor() {
    // Arrange and Act
    FEELParser.PositionalParametersContext actualPositionalParametersContext = new FEELParser.PositionalParametersContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualPositionalParametersContext.invokingState);
    assertEquals(2, actualPositionalParametersContext.depth());
  }

  @Test
  public void testPositionalParametersContextExpression() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PositionalParametersContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test
  public void testPositionalParametersContextExpression2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PositionalParametersContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void testPositionalParametersContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(41, (new FEELParser.PositionalParametersContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testPositiveUnaryTestContextConstructor() {
    // Arrange and Act
    FEELParser.PositiveUnaryTestContext actualPositiveUnaryTestContext = new FEELParser.PositiveUnaryTestContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualPositiveUnaryTestContext.invokingState);
    assertEquals(2, actualPositiveUnaryTestContext.depth());
  }

  @Test
  public void testPositiveUnaryTestContextExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PositiveUnaryTestContext(new ParserRuleContext(), 1)).expression());
  }

  @Test
  public void testPositiveUnaryTestContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(8, (new FEELParser.PositiveUnaryTestContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testPositiveUnaryTestsContextCOMMA() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PositiveUnaryTestsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testPositiveUnaryTestsContextCOMMA2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PositiveUnaryTestsContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void testPositiveUnaryTestsContextConstructor() {
    // Arrange and Act
    FEELParser.PositiveUnaryTestsContext actualPositiveUnaryTestsContext = new FEELParser.PositiveUnaryTestsContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualPositiveUnaryTestsContext.invokingState);
    assertEquals(2, actualPositiveUnaryTestsContext.depth());
  }

  @Test
  public void testPositiveUnaryTestsContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(7, (new FEELParser.PositiveUnaryTestsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testPositiveUnaryTestsContextPositiveUnaryTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PositiveUnaryTestsContext(new ParserRuleContext(), 1)).positiveUnaryTest().size());
  }

  @Test
  public void testPositiveUnaryTestsContextPositiveUnaryTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PositiveUnaryTestsContext(new ParserRuleContext(), 1)).positiveUnaryTest(1));
  }

  @Test
  public void testPostfixExpressionContextBRACKET_CLOSE() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).BRACKET_CLOSE().size());
  }

  @Test
  public void testPostfixExpressionContextBRACKET_CLOSE2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).BRACKET_CLOSE(1));
  }

  @Test
  public void testPostfixExpressionContextBRACKET_OPEN() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).BRACKET_OPEN().size());
  }

  @Test
  public void testPostfixExpressionContextBRACKET_OPEN2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).BRACKET_OPEN(1));
  }

  @Test
  public void testPostfixExpressionContextConstructor() {
    // Arrange and Act
    FEELParser.PostfixExpressionContext actualPostfixExpressionContext = new FEELParser.PostfixExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualPostfixExpressionContext.invokingState);
    assertEquals(2, actualPostfixExpressionContext.depth());
  }

  @Test
  public void testPostfixExpressionContextDOT() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).DOT(1));
  }

  @Test
  public void testPostfixExpressionContextDOT2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).DOT().size());
  }

  @Test
  public void testPostfixExpressionContextExpression() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test
  public void testPostfixExpressionContextExpression2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void testPostfixExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(37, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testPostfixExpressionContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void testPostfixExpressionContextIdentifier2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).identifier().size());
  }

  @Test
  public void testPostfixExpressionContextParameters() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).parameters().size());
  }

  @Test
  public void testPostfixExpressionContextParameters2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).parameters(1));
  }

  @Test
  public void testPostfixExpressionContextPrimaryExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).primaryExpression());
  }

  @Test
  public void testPrimaryExpressionContextBoxedExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).boxedExpression());
  }

  @Test
  public void testPrimaryExpressionContextConstructor() {
    // Arrange and Act
    FEELParser.PrimaryExpressionContext actualPrimaryExpressionContext = new FEELParser.PrimaryExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualPrimaryExpressionContext.invokingState);
    assertEquals(2, actualPrimaryExpressionContext.depth());
  }

  @Test
  public void testPrimaryExpressionContextExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).expression());
  }

  @Test
  public void testPrimaryExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(42, (new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testPrimaryExpressionContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void testPrimaryExpressionContextLiteral() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).literal());
  }

  @Test
  public void testPrimaryExpressionContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testPrimaryExpressionContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testPrimaryExpressionContextSimplePositiveUnaryTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).simplePositiveUnaryTest());
  }

  @Test
  public void testQualifiedNameContextConstructor() {
    // Arrange and Act
    FEELParser.QualifiedNameContext actualQualifiedNameContext = new FEELParser.QualifiedNameContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualQualifiedNameContext.invokingState);
    assertEquals(2, actualQualifiedNameContext.depth());
  }

  @Test
  public void testQualifiedNameContextDOT() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QualifiedNameContext(new ParserRuleContext(), 1)).DOT(1));
  }

  @Test
  public void testQualifiedNameContextDOT2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.QualifiedNameContext(new ParserRuleContext(), 1)).DOT().size());
  }

  @Test
  public void testQualifiedNameContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(44, (new FEELParser.QualifiedNameContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testQualifiedNameContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QualifiedNameContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void testQualifiedNameContextIdentifier2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.QualifiedNameContext(new ParserRuleContext(), 1)).identifier().size());
  }

  @Test
  public void testQuantifiedExpressionContextConstructor() {
    // Arrange and Act
    FEELParser.QuantifiedExpressionContext actualQuantifiedExpressionContext = new FEELParser.QuantifiedExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualQuantifiedExpressionContext.invokingState);
    assertEquals(2, actualQuantifiedExpressionContext.depth());
  }

  @Test
  public void testQuantifiedExpressionContextEVERY() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).EVERY());
  }

  @Test
  public void testQuantifiedExpressionContextExpression() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test
  public void testQuantifiedExpressionContextExpression2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void testQuantifiedExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(26, (new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testQuantifiedExpressionContextIN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).IN(1));
  }

  @Test
  public void testQuantifiedExpressionContextIN2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).IN().size());
  }

  @Test
  public void testQuantifiedExpressionContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void testQuantifiedExpressionContextIdentifier2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).identifier().size());
  }

  @Test
  public void testQuantifiedExpressionContextSATISFIES() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).SATISFIES());
  }

  @Test
  public void testQuantifiedExpressionContextSOME() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).SOME());
  }

  @Test
  public void testSimpleExpressionContextArithmeticExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionContext(new ParserRuleContext(), 1)).arithmeticExpression());
  }

  @Test
  public void testSimpleExpressionContextConstructor() {
    // Arrange and Act
    FEELParser.SimpleExpressionContext actualSimpleExpressionContext = new FEELParser.SimpleExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleExpressionContext.invokingState);
    assertEquals(2, actualSimpleExpressionContext.depth());
  }

  @Test
  public void testSimpleExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(17, (new FEELParser.SimpleExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testSimpleExpressionContextSimpleValue() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionContext(new ParserRuleContext(), 1)).simpleValue());
  }

  @Test
  public void testSimpleExpressionsContextCOMMA() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testSimpleExpressionsContextCOMMA2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.SimpleExpressionsContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void testSimpleExpressionsContextConstructor() {
    // Arrange and Act
    FEELParser.SimpleExpressionsContext actualSimpleExpressionsContext = new FEELParser.SimpleExpressionsContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleExpressionsContext.invokingState);
    assertEquals(2, actualSimpleExpressionsContext.depth());
  }

  @Test
  public void testSimpleExpressionsContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(16, (new FEELParser.SimpleExpressionsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testSimpleExpressionsContextSimpleExpression() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.SimpleExpressionsContext(new ParserRuleContext(), 1)).simpleExpression().size());
  }

  @Test
  public void testSimpleExpressionsContextSimpleExpression2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionsContext(new ParserRuleContext(), 1)).simpleExpression(1));
  }

  @Test
  public void testSimpleExpressionsRootContextConstructor() {
    // Arrange and Act
    FEELParser.SimpleExpressionsRootContext actualSimpleExpressionsRootContext = new FEELParser.SimpleExpressionsRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleExpressionsRootContext.invokingState);
    assertEquals(2, actualSimpleExpressionsRootContext.depth());
  }

  @Test
  public void testSimpleExpressionsRootContextEOF() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionsRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void testSimpleExpressionsRootContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(3, (new FEELParser.SimpleExpressionsRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testSimpleExpressionsRootContextSimpleExpressions() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionsRootContext(new ParserRuleContext(), 1)).simpleExpressions());
  }

  @Test
  public void testSimpleLiteralContextBooleanLiteral() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleLiteralContext(new ParserRuleContext(), 1)).booleanLiteral());
  }

  @Test
  public void testSimpleLiteralContextConstructor() {
    // Arrange and Act
    FEELParser.SimpleLiteralContext actualSimpleLiteralContext = new FEELParser.SimpleLiteralContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleLiteralContext.invokingState);
    assertEquals(2, actualSimpleLiteralContext.depth());
  }

  @Test
  public void testSimpleLiteralContextDateTimeLiteral() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleLiteralContext(new ParserRuleContext(), 1)).dateTimeLiteral());
  }

  @Test
  public void testSimpleLiteralContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(46, (new FEELParser.SimpleLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testSimpleLiteralContextNumericLiteral() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleLiteralContext(new ParserRuleContext(), 1)).numericLiteral());
  }

  @Test
  public void testSimpleLiteralContextStringLiteral() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleLiteralContext(new ParserRuleContext(), 1)).stringLiteral());
  }

  @Test
  public void testSimplePositiveUnaryTestContextConstructor() {
    // Arrange and Act
    FEELParser.SimplePositiveUnaryTestContext actualSimplePositiveUnaryTestContext = new FEELParser.SimplePositiveUnaryTestContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimplePositiveUnaryTestContext.invokingState);
    assertEquals(2, actualSimplePositiveUnaryTestContext.depth());
  }

  @Test
  public void testSimplePositiveUnaryTestContextEndpoint() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).endpoint());
  }

  @Test
  public void testSimplePositiveUnaryTestContextGE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).GE());
  }

  @Test
  public void testSimplePositiveUnaryTestContextGT() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).GT());
  }

  @Test
  public void testSimplePositiveUnaryTestContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(11, (new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testSimplePositiveUnaryTestContextInterval() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).interval());
  }

  @Test
  public void testSimplePositiveUnaryTestContextLE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).LE());
  }

  @Test
  public void testSimplePositiveUnaryTestContextLT() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).LT());
  }

  @Test
  public void testSimplePositiveUnaryTestsContextCOMMA() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testSimplePositiveUnaryTestsContextCOMMA2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.SimplePositiveUnaryTestsContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void testSimplePositiveUnaryTestsContextConstructor() {
    // Arrange and Act
    FEELParser.SimplePositiveUnaryTestsContext actualSimplePositiveUnaryTestsContext = new FEELParser.SimplePositiveUnaryTestsContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimplePositiveUnaryTestsContext.invokingState);
    assertEquals(2, actualSimplePositiveUnaryTestsContext.depth());
  }

  @Test
  public void testSimplePositiveUnaryTestsContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(10, (new FEELParser.SimplePositiveUnaryTestsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testSimplePositiveUnaryTestsContextSimplePositiveUnaryTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestsContext(new ParserRuleContext(), 1)).simplePositiveUnaryTest(1));
  }

  @Test
  public void testSimplePositiveUnaryTestsContextSimplePositiveUnaryTest2() {
    // Arrange, Act and Assert
    assertEquals(0,
        (new FEELParser.SimplePositiveUnaryTestsContext(new ParserRuleContext(), 1)).simplePositiveUnaryTest().size());
  }

  @Test
  public void testSimpleUnaryTestsContextConstructor() {
    // Arrange and Act
    FEELParser.SimpleUnaryTestsContext actualSimpleUnaryTestsContext = new FEELParser.SimpleUnaryTestsContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleUnaryTestsContext.invokingState);
    assertEquals(2, actualSimpleUnaryTestsContext.depth());
  }

  @Test
  public void testSimpleUnaryTestsContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(9, (new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testSimpleUnaryTestsContextMINUS() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).MINUS());
  }

  @Test
  public void testSimpleUnaryTestsContextNOT() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).NOT());
  }

  @Test
  public void testSimpleUnaryTestsContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testSimpleUnaryTestsContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testSimpleUnaryTestsContextSimplePositiveUnaryTests() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).simplePositiveUnaryTests());
  }

  @Test
  public void testSimpleUnaryTestsRootContextConstructor() {
    // Arrange and Act
    FEELParser.SimpleUnaryTestsRootContext actualSimpleUnaryTestsRootContext = new FEELParser.SimpleUnaryTestsRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleUnaryTestsRootContext.invokingState);
    assertEquals(2, actualSimpleUnaryTestsRootContext.depth());
  }

  @Test
  public void testSimpleUnaryTestsRootContextEOF() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void testSimpleUnaryTestsRootContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(1, (new FEELParser.SimpleUnaryTestsRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testSimpleUnaryTestsRootContextSimpleUnaryTests() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsRootContext(new ParserRuleContext(), 1)).simpleUnaryTests());
  }

  @Test
  public void testSimpleValueContextConstructor() {
    // Arrange and Act
    FEELParser.SimpleValueContext actualSimpleValueContext = new FEELParser.SimpleValueContext(new ParserRuleContext(),
        1);

    // Assert
    assertEquals(1, actualSimpleValueContext.invokingState);
    assertEquals(2, actualSimpleValueContext.depth());
  }

  @Test
  public void testSimpleValueContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(43, (new FEELParser.SimpleValueContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testSimpleValueContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleValueContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testSimpleValueContextSimpleLiteral() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleValueContext(new ParserRuleContext(), 1)).simpleLiteral());
  }

  @Test
  public void testStringLiteralContextConstructor() {
    // Arrange and Act
    FEELParser.StringLiteralContext actualStringLiteralContext = new FEELParser.StringLiteralContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualStringLiteralContext.invokingState);
    assertEquals(2, actualStringLiteralContext.depth());
  }

  @Test
  public void testStringLiteralContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(47, (new FEELParser.StringLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testStringLiteralContextSTRING() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.StringLiteralContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void testTextualExpressionContextConstructor() {
    // Arrange and Act
    FEELParser.TextualExpressionContext actualTextualExpressionContext = new FEELParser.TextualExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualTextualExpressionContext.invokingState);
    assertEquals(2, actualTextualExpressionContext.depth());
  }

  @Test
  public void testTextualExpressionContextDisjunction() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionContext(new ParserRuleContext(), 1)).disjunction());
  }

  @Test
  public void testTextualExpressionContextForExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionContext(new ParserRuleContext(), 1)).forExpression());
  }

  @Test
  public void testTextualExpressionContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(20, (new FEELParser.TextualExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testTextualExpressionContextIfExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionContext(new ParserRuleContext(), 1)).ifExpression());
  }

  @Test
  public void testTextualExpressionContextQuantifiedExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionContext(new ParserRuleContext(), 1)).quantifiedExpression());
  }

  @Test
  public void testTextualExpressionsContextCOMMA() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testTextualExpressionsContextCOMMA2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TextualExpressionsContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void testTextualExpressionsContextConstructor() {
    // Arrange and Act
    FEELParser.TextualExpressionsContext actualTextualExpressionsContext = new FEELParser.TextualExpressionsContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualTextualExpressionsContext.invokingState);
    assertEquals(2, actualTextualExpressionsContext.depth());
  }

  @Test
  public void testTextualExpressionsContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(19, (new FEELParser.TextualExpressionsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testTextualExpressionsContextTextualExpression() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionsContext(new ParserRuleContext(), 1)).textualExpression(1));
  }

  @Test
  public void testTextualExpressionsContextTextualExpression2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TextualExpressionsContext(new ParserRuleContext(), 1)).textualExpression().size());
  }

  @Test
  public void testTextualExpressionsRootContextConstructor() {
    // Arrange and Act
    FEELParser.TextualExpressionsRootContext actualTextualExpressionsRootContext = new FEELParser.TextualExpressionsRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualTextualExpressionsRootContext.invokingState);
    assertEquals(2, actualTextualExpressionsRootContext.depth());
  }

  @Test
  public void testTextualExpressionsRootContextEOF() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionsRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void testTextualExpressionsRootContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(4, (new FEELParser.TextualExpressionsRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testTextualExpressionsRootContextTextualExpressions() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionsRootContext(new ParserRuleContext(), 1)).textualExpressions());
  }

  @Test
  public void testTypeContextARROW() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).ARROW());
  }

  @Test
  public void testTypeContextCOLON() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TypeContext(new ParserRuleContext(), 1)).COLON().size());
  }

  @Test
  public void testTypeContextCOLON2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).COLON(1));
  }

  @Test
  public void testTypeContextCOMMA() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void testTypeContextCOMMA2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TypeContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void testTypeContextConstructor() {
    // Arrange and Act
    FEELParser.TypeContext actualTypeContext = new FEELParser.TypeContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualTypeContext.invokingState);
    assertEquals(2, actualTypeContext.depth());
  }

  @Test
  public void testTypeContextGT() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).GT());
  }

  @Test
  public void testTypeContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(36, (new FEELParser.TypeContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testTypeContextIdentifier() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void testTypeContextIdentifier2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TypeContext(new ParserRuleContext(), 1)).identifier().size());
  }

  @Test
  public void testTypeContextLT() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).LT());
  }

  @Test
  public void testTypeContextQualifiedName() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void testTypeContextType() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).type(1));
  }

  @Test
  public void testTypeContextType2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TypeContext(new ParserRuleContext(), 1)).type().size());
  }

  @Test
  public void testUnaryTestsContextConstructor() {
    // Arrange and Act
    FEELParser.UnaryTestsContext actualUnaryTestsContext = new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualUnaryTestsContext.invokingState);
    assertEquals(2, actualUnaryTestsContext.depth());
  }

  @Test
  public void testUnaryTestsContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(6, (new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testUnaryTestsContextMINUS() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).MINUS());
  }

  @Test
  public void testUnaryTestsContextNOT() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).NOT());
  }

  @Test
  public void testUnaryTestsContextPAREN_CLOSE() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void testUnaryTestsContextPAREN_OPEN() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void testUnaryTestsContextPositiveUnaryTests() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).positiveUnaryTests());
  }

  @Test
  public void testUnaryTestsRootContextConstructor() {
    // Arrange and Act
    FEELParser.UnaryTestsRootContext actualUnaryTestsRootContext = new FEELParser.UnaryTestsRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualUnaryTestsRootContext.invokingState);
    assertEquals(2, actualUnaryTestsRootContext.depth());
  }

  @Test
  public void testUnaryTestsRootContextEOF() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void testUnaryTestsRootContextGetRuleIndex() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.UnaryTestsRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void testUnaryTestsRootContextUnaryTests() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsRootContext(new ParserRuleContext(), 1)).unaryTests());
  }
}

