package com.gs.dmn.feel.analysis.syntax.antlrv4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.Test;

public class FEELParserDiffblueTest {
  @Test(timeout=10000)
  public void unaryTestsTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsRootContext(new ParserRuleContext(), 1)).unaryTests());
  }

  @Test(timeout=10000)
  public void constructorTest57() {
    // Arrange and Act
    FEELParser.UnaryTestsRootContext actualUnaryTestsRootContext = new FEELParser.UnaryTestsRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualUnaryTestsRootContext.invokingState);
    assertEquals(2, actualUnaryTestsRootContext.depth());
  }

  @Test(timeout=10000)
  public void EOFTest6() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest57() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.UnaryTestsRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void PAREN_OPENTest8() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test(timeout=10000)
  public void PAREN_CLOSETest8() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test(timeout=10000)
  public void constructorTest56() {
    // Arrange and Act
    FEELParser.UnaryTestsContext actualUnaryTestsContext = new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualUnaryTestsContext.invokingState);
    assertEquals(2, actualUnaryTestsContext.depth());
  }

  @Test(timeout=10000)
  public void MINUSTest7() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).MINUS());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest56() {
    // Arrange, Act and Assert
    assertEquals(6, (new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void positiveUnaryTestsTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).positiveUnaryTests());
  }

  @Test(timeout=10000)
  public void NOTTest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).NOT());
  }

  @Test(timeout=10000)
  public void ARROWTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).ARROW());
  }

  @Test(timeout=10000)
  public void identifierTest14() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TypeContext(new ParserRuleContext(), 1)).identifier().size());
  }

  @Test(timeout=10000)
  public void typeTest4() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TypeContext(new ParserRuleContext(), 1)).type().size());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest55() {
    // Arrange, Act and Assert
    assertEquals(36, (new FEELParser.TypeContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void identifierTest13() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test(timeout=10000)
  public void constructorTest55() {
    // Arrange and Act
    FEELParser.TypeContext actualTypeContext = new FEELParser.TypeContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualTypeContext.invokingState);
    assertEquals(2, actualTypeContext.depth());
  }

  @Test(timeout=10000)
  public void qualifiedNameTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test(timeout=10000)
  public void COLONTest6() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).COLON(1));
  }

  @Test(timeout=10000)
  public void GTTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).GT());
  }

  @Test(timeout=10000)
  public void COMMATest22() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TypeContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test(timeout=10000)
  public void COLONTest5() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TypeContext(new ParserRuleContext(), 1)).COLON().size());
  }

  @Test(timeout=10000)
  public void COMMATest21() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test(timeout=10000)
  public void typeTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).type(1));
  }

  @Test(timeout=10000)
  public void LTTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).LT());
  }

  @Test(timeout=10000)
  public void constructorTest54() {
    // Arrange and Act
    FEELParser.TextualExpressionsRootContext actualTextualExpressionsRootContext = new FEELParser.TextualExpressionsRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualTextualExpressionsRootContext.invokingState);
    assertEquals(2, actualTextualExpressionsRootContext.depth());
  }

  @Test(timeout=10000)
  public void textualExpressionsTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionsRootContext(new ParserRuleContext(), 1)).textualExpressions());
  }

  @Test(timeout=10000)
  public void EOFTest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionsRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest54() {
    // Arrange, Act and Assert
    assertEquals(4, (new FEELParser.TextualExpressionsRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void textualExpressionTest3() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TextualExpressionsContext(new ParserRuleContext(), 1)).textualExpression().size());
  }

  @Test(timeout=10000)
  public void constructorTest53() {
    // Arrange and Act
    FEELParser.TextualExpressionsContext actualTextualExpressionsContext = new FEELParser.TextualExpressionsContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualTextualExpressionsContext.invokingState);
    assertEquals(2, actualTextualExpressionsContext.depth());
  }

  @Test(timeout=10000)
  public void textualExpressionTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionsContext(new ParserRuleContext(), 1)).textualExpression(1));
  }

  @Test(timeout=10000)
  public void getRuleIndexTest53() {
    // Arrange, Act and Assert
    assertEquals(19, (new FEELParser.TextualExpressionsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void COMMATest20() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TextualExpressionsContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test(timeout=10000)
  public void COMMATest19() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test(timeout=10000)
  public void constructorTest52() {
    // Arrange and Act
    FEELParser.TextualExpressionContext actualTextualExpressionContext = new FEELParser.TextualExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualTextualExpressionContext.invokingState);
    assertEquals(2, actualTextualExpressionContext.depth());
  }

  @Test(timeout=10000)
  public void disjunctionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionContext(new ParserRuleContext(), 1)).disjunction());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest52() {
    // Arrange, Act and Assert
    assertEquals(20, (new FEELParser.TextualExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void quantifiedExpressionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionContext(new ParserRuleContext(), 1)).quantifiedExpression());
  }

  @Test(timeout=10000)
  public void forExpressionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionContext(new ParserRuleContext(), 1)).forExpression());
  }

  @Test(timeout=10000)
  public void ifExpressionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionContext(new ParserRuleContext(), 1)).ifExpression());
  }

  @Test(timeout=10000)
  public void constructorTest51() {
    // Arrange and Act
    FEELParser.StringLiteralContext actualStringLiteralContext = new FEELParser.StringLiteralContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualStringLiteralContext.invokingState);
    assertEquals(2, actualStringLiteralContext.depth());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest51() {
    // Arrange, Act and Assert
    assertEquals(47, (new FEELParser.StringLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void STRINGTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.StringLiteralContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test(timeout=10000)
  public void constructorTest50() {
    // Arrange and Act
    FEELParser.SimpleValueContext actualSimpleValueContext = new FEELParser.SimpleValueContext(new ParserRuleContext(),
        1);

    // Assert
    assertEquals(1, actualSimpleValueContext.invokingState);
    assertEquals(2, actualSimpleValueContext.depth());
  }

  @Test(timeout=10000)
  public void simpleLiteralTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleValueContext(new ParserRuleContext(), 1)).simpleLiteral());
  }

  @Test(timeout=10000)
  public void qualifiedNameTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleValueContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest50() {
    // Arrange, Act and Assert
    assertEquals(43, (new FEELParser.SimpleValueContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void constructorTest49() {
    // Arrange and Act
    FEELParser.SimpleUnaryTestsRootContext actualSimpleUnaryTestsRootContext = new FEELParser.SimpleUnaryTestsRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleUnaryTestsRootContext.invokingState);
    assertEquals(2, actualSimpleUnaryTestsRootContext.depth());
  }

  @Test(timeout=10000)
  public void EOFTest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test(timeout=10000)
  public void simpleUnaryTestsTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsRootContext(new ParserRuleContext(), 1)).simpleUnaryTests());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest49() {
    // Arrange, Act and Assert
    assertEquals(1, (new FEELParser.SimpleUnaryTestsRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void PAREN_OPENTest7() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test(timeout=10000)
  public void simplePositiveUnaryTestsTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).simplePositiveUnaryTests());
  }

  @Test(timeout=10000)
  public void PAREN_CLOSETest7() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test(timeout=10000)
  public void constructorTest48() {
    // Arrange and Act
    FEELParser.SimpleUnaryTestsContext actualSimpleUnaryTestsContext = new FEELParser.SimpleUnaryTestsContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleUnaryTestsContext.invokingState);
    assertEquals(2, actualSimpleUnaryTestsContext.depth());
  }

  @Test(timeout=10000)
  public void MINUSTest6() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).MINUS());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest48() {
    // Arrange, Act and Assert
    assertEquals(9, (new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void NOTTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).NOT());
  }

  @Test(timeout=10000)
  public void constructorTest47() {
    // Arrange and Act
    FEELParser.SimplePositiveUnaryTestsContext actualSimplePositiveUnaryTestsContext = new FEELParser.SimplePositiveUnaryTestsContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimplePositiveUnaryTestsContext.invokingState);
    assertEquals(2, actualSimplePositiveUnaryTestsContext.depth());
  }

  @Test(timeout=10000)
  public void simplePositiveUnaryTestTest3() {
    // Arrange, Act and Assert
    assertEquals(0,
        (new FEELParser.SimplePositiveUnaryTestsContext(new ParserRuleContext(), 1)).simplePositiveUnaryTest().size());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest47() {
    // Arrange, Act and Assert
    assertEquals(10, (new FEELParser.SimplePositiveUnaryTestsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void COMMATest18() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.SimplePositiveUnaryTestsContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test(timeout=10000)
  public void simplePositiveUnaryTestTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestsContext(new ParserRuleContext(), 1)).simplePositiveUnaryTest(1));
  }

  @Test(timeout=10000)
  public void COMMATest17() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test(timeout=10000)
  public void constructorTest46() {
    // Arrange and Act
    FEELParser.SimplePositiveUnaryTestContext actualSimplePositiveUnaryTestContext = new FEELParser.SimplePositiveUnaryTestContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimplePositiveUnaryTestContext.invokingState);
    assertEquals(2, actualSimplePositiveUnaryTestContext.depth());
  }

  @Test(timeout=10000)
  public void GETest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).GE());
  }

  @Test(timeout=10000)
  public void GTTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).GT());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest46() {
    // Arrange, Act and Assert
    assertEquals(11, (new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void intervalTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).interval());
  }

  @Test(timeout=10000)
  public void LETest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).LE());
  }

  @Test(timeout=10000)
  public void LTTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).LT());
  }

  @Test(timeout=10000)
  public void endpointTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).endpoint());
  }

  @Test(timeout=10000)
  public void numericLiteralTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleLiteralContext(new ParserRuleContext(), 1)).numericLiteral());
  }

  @Test(timeout=10000)
  public void constructorTest45() {
    // Arrange and Act
    FEELParser.SimpleLiteralContext actualSimpleLiteralContext = new FEELParser.SimpleLiteralContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleLiteralContext.invokingState);
    assertEquals(2, actualSimpleLiteralContext.depth());
  }

  @Test(timeout=10000)
  public void booleanLiteralTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleLiteralContext(new ParserRuleContext(), 1)).booleanLiteral());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest45() {
    // Arrange, Act and Assert
    assertEquals(46, (new FEELParser.SimpleLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void dateTimeLiteralTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleLiteralContext(new ParserRuleContext(), 1)).dateTimeLiteral());
  }

  @Test(timeout=10000)
  public void stringLiteralTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleLiteralContext(new ParserRuleContext(), 1)).stringLiteral());
  }

  @Test(timeout=10000)
  public void constructorTest44() {
    // Arrange and Act
    FEELParser.SimpleExpressionsRootContext actualSimpleExpressionsRootContext = new FEELParser.SimpleExpressionsRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleExpressionsRootContext.invokingState);
    assertEquals(2, actualSimpleExpressionsRootContext.depth());
  }

  @Test(timeout=10000)
  public void simpleExpressionsTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionsRootContext(new ParserRuleContext(), 1)).simpleExpressions());
  }

  @Test(timeout=10000)
  public void EOFTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionsRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest44() {
    // Arrange, Act and Assert
    assertEquals(3, (new FEELParser.SimpleExpressionsRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void constructorTest43() {
    // Arrange and Act
    FEELParser.SimpleExpressionsContext actualSimpleExpressionsContext = new FEELParser.SimpleExpressionsContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleExpressionsContext.invokingState);
    assertEquals(2, actualSimpleExpressionsContext.depth());
  }

  @Test(timeout=10000)
  public void simpleExpressionTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionsContext(new ParserRuleContext(), 1)).simpleExpression(1));
  }

  @Test(timeout=10000)
  public void getRuleIndexTest43() {
    // Arrange, Act and Assert
    assertEquals(16, (new FEELParser.SimpleExpressionsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void COMMATest16() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.SimpleExpressionsContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test(timeout=10000)
  public void simpleExpressionTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.SimpleExpressionsContext(new ParserRuleContext(), 1)).simpleExpression().size());
  }

  @Test(timeout=10000)
  public void COMMATest15() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test(timeout=10000)
  public void arithmeticExpressionTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionContext(new ParserRuleContext(), 1)).arithmeticExpression());
  }

  @Test(timeout=10000)
  public void constructorTest42() {
    // Arrange and Act
    FEELParser.SimpleExpressionContext actualSimpleExpressionContext = new FEELParser.SimpleExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleExpressionContext.invokingState);
    assertEquals(2, actualSimpleExpressionContext.depth());
  }

  @Test(timeout=10000)
  public void simpleValueTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionContext(new ParserRuleContext(), 1)).simpleValue());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest42() {
    // Arrange, Act and Assert
    assertEquals(17, (new FEELParser.SimpleExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void expressionTest22() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test(timeout=10000)
  public void constructorTest41() {
    // Arrange and Act
    FEELParser.QuantifiedExpressionContext actualQuantifiedExpressionContext = new FEELParser.QuantifiedExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualQuantifiedExpressionContext.invokingState);
    assertEquals(2, actualQuantifiedExpressionContext.depth());
  }

  @Test(timeout=10000)
  public void identifierTest12() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).identifier().size());
  }

  @Test(timeout=10000)
  public void INTest5() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).IN().size());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest41() {
    // Arrange, Act and Assert
    assertEquals(26, (new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void expressionTest21() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test(timeout=10000)
  public void SOMETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).SOME());
  }

  @Test(timeout=10000)
  public void EVERYTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).EVERY());
  }

  @Test(timeout=10000)
  public void INTest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).IN(1));
  }

  @Test(timeout=10000)
  public void identifierTest11() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test(timeout=10000)
  public void SATISFIESTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).SATISFIES());
  }

  @Test(timeout=10000)
  public void constructorTest40() {
    // Arrange and Act
    FEELParser.QualifiedNameContext actualQualifiedNameContext = new FEELParser.QualifiedNameContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualQualifiedNameContext.invokingState);
    assertEquals(2, actualQualifiedNameContext.depth());
  }

  @Test(timeout=10000)
  public void DOTTest4() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.QualifiedNameContext(new ParserRuleContext(), 1)).DOT().size());
  }

  @Test(timeout=10000)
  public void identifierTest10() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.QualifiedNameContext(new ParserRuleContext(), 1)).identifier().size());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest40() {
    // Arrange, Act and Assert
    assertEquals(44, (new FEELParser.QualifiedNameContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void identifierTest9() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QualifiedNameContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test(timeout=10000)
  public void DOTTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QualifiedNameContext(new ParserRuleContext(), 1)).DOT(1));
  }

  @Test(timeout=10000)
  public void PAREN_OPENTest6() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test(timeout=10000)
  public void PAREN_CLOSETest6() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test(timeout=10000)
  public void constructorTest39() {
    // Arrange and Act
    FEELParser.PrimaryExpressionContext actualPrimaryExpressionContext = new FEELParser.PrimaryExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualPrimaryExpressionContext.invokingState);
    assertEquals(2, actualPrimaryExpressionContext.depth());
  }

  @Test(timeout=10000)
  public void identifierTest8() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test(timeout=10000)
  public void literalTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).literal());
  }

  @Test(timeout=10000)
  public void expressionTest20() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).expression());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest39() {
    // Arrange, Act and Assert
    assertEquals(42, (new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void boxedExpressionTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).boxedExpression());
  }

  @Test(timeout=10000)
  public void simplePositiveUnaryTestTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).simplePositiveUnaryTest());
  }

  @Test(timeout=10000)
  public void expressionTest19() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test(timeout=10000)
  public void BRACKET_OPENTest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).BRACKET_OPEN(1));
  }

  @Test(timeout=10000)
  public void identifierTest7() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).identifier().size());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest38() {
    // Arrange, Act and Assert
    assertEquals(37, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void identifierTest6() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test(timeout=10000)
  public void BRACKET_OPENTest4() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).BRACKET_OPEN().size());
  }

  @Test(timeout=10000)
  public void parametersTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).parameters(1));
  }

  @Test(timeout=10000)
  public void parametersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).parameters().size());
  }

  @Test(timeout=10000)
  public void constructorTest38() {
    // Arrange and Act
    FEELParser.PostfixExpressionContext actualPostfixExpressionContext = new FEELParser.PostfixExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualPostfixExpressionContext.invokingState);
    assertEquals(2, actualPostfixExpressionContext.depth());
  }

  @Test(timeout=10000)
  public void DOTTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).DOT().size());
  }

  @Test(timeout=10000)
  public void primaryExpressionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).primaryExpression());
  }

  @Test(timeout=10000)
  public void BRACKET_CLOSETest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).BRACKET_CLOSE(1));
  }

  @Test(timeout=10000)
  public void expressionTest18() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test(timeout=10000)
  public void BRACKET_CLOSETest4() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).BRACKET_CLOSE().size());
  }

  @Test(timeout=10000)
  public void DOTTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).DOT(1));
  }

  @Test(timeout=10000)
  public void constructorTest37() {
    // Arrange and Act
    FEELParser.PositiveUnaryTestsContext actualPositiveUnaryTestsContext = new FEELParser.PositiveUnaryTestsContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualPositiveUnaryTestsContext.invokingState);
    assertEquals(2, actualPositiveUnaryTestsContext.depth());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest37() {
    // Arrange, Act and Assert
    assertEquals(7, (new FEELParser.PositiveUnaryTestsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void COMMATest14() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PositiveUnaryTestsContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test(timeout=10000)
  public void COMMATest13() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PositiveUnaryTestsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test(timeout=10000)
  public void positiveUnaryTestTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PositiveUnaryTestsContext(new ParserRuleContext(), 1)).positiveUnaryTest(1));
  }

  @Test(timeout=10000)
  public void positiveUnaryTestTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PositiveUnaryTestsContext(new ParserRuleContext(), 1)).positiveUnaryTest().size());
  }

  @Test(timeout=10000)
  public void constructorTest36() {
    // Arrange and Act
    FEELParser.PositiveUnaryTestContext actualPositiveUnaryTestContext = new FEELParser.PositiveUnaryTestContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualPositiveUnaryTestContext.invokingState);
    assertEquals(2, actualPositiveUnaryTestContext.depth());
  }

  @Test(timeout=10000)
  public void expressionTest17() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PositiveUnaryTestContext(new ParserRuleContext(), 1)).expression());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest36() {
    // Arrange, Act and Assert
    assertEquals(8, (new FEELParser.PositiveUnaryTestContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void expressionTest16() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PositionalParametersContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test(timeout=10000)
  public void constructorTest35() {
    // Arrange and Act
    FEELParser.PositionalParametersContext actualPositionalParametersContext = new FEELParser.PositionalParametersContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualPositionalParametersContext.invokingState);
    assertEquals(2, actualPositionalParametersContext.depth());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest35() {
    // Arrange, Act and Assert
    assertEquals(41, (new FEELParser.PositionalParametersContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void COMMATest12() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PositionalParametersContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test(timeout=10000)
  public void expressionTest15() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PositionalParametersContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test(timeout=10000)
  public void COMMATest11() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PositionalParametersContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test(timeout=10000)
  public void PAREN_OPENTest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ParametersContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test(timeout=10000)
  public void positionalParametersTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ParametersContext(new ParserRuleContext(), 1)).positionalParameters());
  }

  @Test(timeout=10000)
  public void PAREN_CLOSETest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ParametersContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test(timeout=10000)
  public void constructorTest34() {
    // Arrange and Act
    FEELParser.ParametersContext actualParametersContext = new FEELParser.ParametersContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualParametersContext.invokingState);
    assertEquals(2, actualParametersContext.depth());
  }

  @Test(timeout=10000)
  public void namedParametersTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ParametersContext(new ParserRuleContext(), 1)).namedParameters());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest34() {
    // Arrange, Act and Assert
    assertEquals(38, (new FEELParser.ParametersContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void constructorTest33() {
    // Arrange and Act
    FEELParser.ParameterNameContext actualParameterNameContext = new FEELParser.ParameterNameContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualParameterNameContext.invokingState);
    assertEquals(2, actualParameterNameContext.depth());
  }

  @Test(timeout=10000)
  public void identifierTest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ParameterNameContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest33() {
    // Arrange, Act and Assert
    assertEquals(40, (new FEELParser.ParameterNameContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void constructorTest32() {
    // Arrange and Act
    FEELParser.NumericLiteralContext actualNumericLiteralContext = new FEELParser.NumericLiteralContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualNumericLiteralContext.invokingState);
    assertEquals(2, actualNumericLiteralContext.depth());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest32() {
    // Arrange, Act and Assert
    assertEquals(49, (new FEELParser.NumericLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void NUMBERTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.NumericLiteralContext(new ParserRuleContext(), 1)).NUMBER());
  }

  @Test(timeout=10000)
  public void expressionTest14() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test(timeout=10000)
  public void constructorTest31() {
    // Arrange and Act
    FEELParser.NamedParametersContext actualNamedParametersContext = new FEELParser.NamedParametersContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualNamedParametersContext.invokingState);
    assertEquals(2, actualNamedParametersContext.depth());
  }

  @Test(timeout=10000)
  public void COLONTest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).COLON(1));
  }

  @Test(timeout=10000)
  public void getRuleIndexTest31() {
    // Arrange, Act and Assert
    assertEquals(39, (new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void COMMATest10() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test(timeout=10000)
  public void expressionTest13() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test(timeout=10000)
  public void parameterNameTest3() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).parameterName().size());
  }

  @Test(timeout=10000)
  public void COLONTest3() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).COLON().size());
  }

  @Test(timeout=10000)
  public void COMMATest9() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test(timeout=10000)
  public void parameterNameTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).parameterName(1));
  }

  @Test(timeout=10000)
  public void STARTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).STAR().size());
  }

  @Test(timeout=10000)
  public void constructorTest30() {
    // Arrange and Act
    FEELParser.MultiplicationContext actualMultiplicationContext = new FEELParser.MultiplicationContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualMultiplicationContext.invokingState);
    assertEquals(2, actualMultiplicationContext.depth());
  }

  @Test(timeout=10000)
  public void FORWARD_SLASHTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).FORWARD_SLASH().size());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest30() {
    // Arrange, Act and Assert
    assertEquals(32, (new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void STARTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).STAR(1));
  }

  @Test(timeout=10000)
  public void exponentiationTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).exponentiation().size());
  }

  @Test(timeout=10000)
  public void FORWARD_SLASHTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).FORWARD_SLASH(1));
  }

  @Test(timeout=10000)
  public void exponentiationTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).exponentiation(1));
  }

  @Test(timeout=10000)
  public void NULLTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.LiteralContext(new ParserRuleContext(), 1)).NULL());
  }

  @Test(timeout=10000)
  public void constructorTest29() {
    // Arrange and Act
    FEELParser.LiteralContext actualLiteralContext = new FEELParser.LiteralContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualLiteralContext.invokingState);
    assertEquals(2, actualLiteralContext.depth());
  }

  @Test(timeout=10000)
  public void simpleLiteralTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.LiteralContext(new ParserRuleContext(), 1)).simpleLiteral());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest29() {
    // Arrange, Act and Assert
    assertEquals(45, (new FEELParser.LiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void BRACKET_CLOSETest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ListContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test(timeout=10000)
  public void expressionTest12() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ListContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test(timeout=10000)
  public void BRACKET_OPENTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ListContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test(timeout=10000)
  public void constructorTest28() {
    // Arrange and Act
    FEELParser.ListContext actualListContext = new FEELParser.ListContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualListContext.invokingState);
    assertEquals(2, actualListContext.depth());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest28() {
    // Arrange, Act and Assert
    assertEquals(51, (new FEELParser.ListContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void COMMATest8() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ListContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test(timeout=10000)
  public void expressionTest11() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ListContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test(timeout=10000)
  public void COMMATest7() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ListContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test(timeout=10000)
  public void constructorTest27() {
    // Arrange and Act
    FEELParser.KeyContext actualKeyContext = new FEELParser.KeyContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualKeyContext.invokingState);
    assertEquals(2, actualKeyContext.depth());
  }

  @Test(timeout=10000)
  public void identifierTest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.KeyContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest27() {
    // Arrange, Act and Assert
    assertEquals(54, (new FEELParser.KeyContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void stringLiteralTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.KeyContext(new ParserRuleContext(), 1)).stringLiteral());
  }

  @Test(timeout=10000)
  public void DOT_DOTTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IterationDomainContext(new ParserRuleContext(), 1)).DOT_DOT());
  }

  @Test(timeout=10000)
  public void expressionTest10() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IterationDomainContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test(timeout=10000)
  public void constructorTest26() {
    // Arrange and Act
    FEELParser.IterationDomainContext actualIterationDomainContext = new FEELParser.IterationDomainContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIterationDomainContext.invokingState);
    assertEquals(2, actualIterationDomainContext.depth());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest26() {
    // Arrange, Act and Assert
    assertEquals(24, (new FEELParser.IterationDomainContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void expressionTest9() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.IterationDomainContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test(timeout=10000)
  public void BRACKET_CLOSETest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalStartParContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test(timeout=10000)
  public void PAREN_OPENTest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalStartParContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test(timeout=10000)
  public void BRACKET_OPENTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalStartParContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test(timeout=10000)
  public void constructorTest25() {
    // Arrange and Act
    FEELParser.IntervalStartParContext actualIntervalStartParContext = new FEELParser.IntervalStartParContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIntervalStartParContext.invokingState);
    assertEquals(2, actualIntervalStartParContext.depth());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest25() {
    // Arrange, Act and Assert
    assertEquals(13, (new FEELParser.IntervalStartParContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void BRACKET_CLOSETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalEndParContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test(timeout=10000)
  public void BRACKET_OPENTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalEndParContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test(timeout=10000)
  public void PAREN_CLOSETest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalEndParContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test(timeout=10000)
  public void constructorTest24() {
    // Arrange and Act
    FEELParser.IntervalEndParContext actualIntervalEndParContext = new FEELParser.IntervalEndParContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIntervalEndParContext.invokingState);
    assertEquals(2, actualIntervalEndParContext.depth());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest24() {
    // Arrange, Act and Assert
    assertEquals(14, (new FEELParser.IntervalEndParContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void DOT_DOTTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalContext(new ParserRuleContext(), 1)).DOT_DOT());
  }

  @Test(timeout=10000)
  public void constructorTest23() {
    // Arrange and Act
    FEELParser.IntervalContext actualIntervalContext = new FEELParser.IntervalContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIntervalContext.invokingState);
    assertEquals(2, actualIntervalContext.depth());
  }

  @Test(timeout=10000)
  public void endpointTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.IntervalContext(new ParserRuleContext(), 1)).endpoint().size());
  }

  @Test(timeout=10000)
  public void endpointTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalContext(new ParserRuleContext(), 1)).endpoint(1));
  }

  @Test(timeout=10000)
  public void getRuleIndexTest23() {
    // Arrange, Act and Assert
    assertEquals(12, (new FEELParser.IntervalContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void intervalEndParTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalContext(new ParserRuleContext(), 1)).intervalEndPar());
  }

  @Test(timeout=10000)
  public void intervalStartParTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalContext(new ParserRuleContext(), 1)).intervalStartPar());
  }

  @Test(timeout=10000)
  public void postfixExpressionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.InstanceOfContext(new ParserRuleContext(), 1)).postfixExpression());
  }

  @Test(timeout=10000)
  public void typeTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.InstanceOfContext(new ParserRuleContext(), 1)).type());
  }

  @Test(timeout=10000)
  public void constructorTest22() {
    // Arrange and Act
    FEELParser.InstanceOfContext actualInstanceOfContext = new FEELParser.InstanceOfContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualInstanceOfContext.invokingState);
    assertEquals(2, actualInstanceOfContext.depth());
  }

  @Test(timeout=10000)
  public void INSTANCE_OFTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.InstanceOfContext(new ParserRuleContext(), 1)).INSTANCE_OF());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest22() {
    // Arrange, Act and Assert
    assertEquals(35, (new FEELParser.InstanceOfContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void expressionTest8() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test(timeout=10000)
  public void constructorTest21() {
    // Arrange and Act
    FEELParser.IfExpressionContext actualIfExpressionContext = new FEELParser.IfExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIfExpressionContext.invokingState);
    assertEquals(2, actualIfExpressionContext.depth());
  }

  @Test(timeout=10000)
  public void THENTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).THEN());
  }

  @Test(timeout=10000)
  public void IFTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).IF());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest21() {
    // Arrange, Act and Assert
    assertEquals(25, (new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void expressionTest7() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test(timeout=10000)
  public void ELSETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).ELSE());
  }

  @Test(timeout=10000)
  public void ORTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IdentifierContext(new ParserRuleContext(), 1)).OR());
  }

  @Test(timeout=10000)
  public void NAMETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IdentifierContext(new ParserRuleContext(), 1)).NAME());
  }

  @Test(timeout=10000)
  public void constructorTest20() {
    // Arrange and Act
    FEELParser.IdentifierContext actualIdentifierContext = new FEELParser.IdentifierContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIdentifierContext.invokingState);
    assertEquals(2, actualIdentifierContext.depth());
  }

  @Test(timeout=10000)
  public void FUNCTIONTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IdentifierContext(new ParserRuleContext(), 1)).FUNCTION());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest20() {
    // Arrange, Act and Assert
    assertEquals(56, (new FEELParser.IdentifierContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void ANDTest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IdentifierContext(new ParserRuleContext(), 1)).AND());
  }

  @Test(timeout=10000)
  public void PAREN_OPENTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test(timeout=10000)
  public void PAREN_CLOSETest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test(timeout=10000)
  public void constructorTest19() {
    // Arrange and Act
    FEELParser.FunctionDefinitionContext actualFunctionDefinitionContext = new FEELParser.FunctionDefinitionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualFunctionDefinitionContext.invokingState);
    assertEquals(2, actualFunctionDefinitionContext.depth());
  }

  @Test(timeout=10000)
  public void expressionTest6() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).expression());
  }

  @Test(timeout=10000)
  public void FUNCTIONTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).FUNCTION());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest19() {
    // Arrange, Act and Assert
    assertEquals(21, (new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void COMMATest6() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test(timeout=10000)
  public void formalParameterTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).formalParameter(1));
  }

  @Test(timeout=10000)
  public void EXTERNALTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).EXTERNAL());
  }

  @Test(timeout=10000)
  public void COMMATest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test(timeout=10000)
  public void formalParameterTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).formalParameter().size());
  }

  @Test(timeout=10000)
  public void typeTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FormalParameterContext(new ParserRuleContext(), 1)).type());
  }

  @Test(timeout=10000)
  public void constructorTest18() {
    // Arrange and Act
    FEELParser.FormalParameterContext actualFormalParameterContext = new FEELParser.FormalParameterContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualFormalParameterContext.invokingState);
    assertEquals(2, actualFormalParameterContext.depth());
  }

  @Test(timeout=10000)
  public void COLONTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FormalParameterContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest18() {
    // Arrange, Act and Assert
    assertEquals(22, (new FEELParser.FormalParameterContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void parameterNameTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FormalParameterContext(new ParserRuleContext(), 1)).parameterName());
  }

  @Test(timeout=10000)
  public void expressionTest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).expression());
  }

  @Test(timeout=10000)
  public void identifierTest3() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).identifier().size());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest17() {
    // Arrange, Act and Assert
    assertEquals(23, (new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void RETURNTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).RETURN());
  }

  @Test(timeout=10000)
  public void identifierTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test(timeout=10000)
  public void iterationDomainTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).iterationDomain().size());
  }

  @Test(timeout=10000)
  public void constructorTest17() {
    // Arrange and Act
    FEELParser.ForExpressionContext actualForExpressionContext = new FEELParser.ForExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualForExpressionContext.invokingState);
    assertEquals(2, actualForExpressionContext.depth());
  }

  @Test(timeout=10000)
  public void INTest3() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).IN().size());
  }

  @Test(timeout=10000)
  public void COMMATest4() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test(timeout=10000)
  public void INTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).IN(1));
  }

  @Test(timeout=10000)
  public void FORTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).FOR());
  }

  @Test(timeout=10000)
  public void COMMATest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test(timeout=10000)
  public void iterationDomainTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).iterationDomain(1));
  }

  @Test(timeout=10000)
  public void constructorTest16() {
    // Arrange and Act
    FEELParser.ExpressionRootContext actualExpressionRootContext = new FEELParser.ExpressionRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualExpressionRootContext.invokingState);
    assertEquals(2, actualExpressionRootContext.depth());
  }

  @Test(timeout=10000)
  public void expressionTest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ExpressionRootContext(new ParserRuleContext(), 1)).expression());
  }

  @Test(timeout=10000)
  public void EOFTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ExpressionRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest16() {
    // Arrange, Act and Assert
    assertEquals(2, (new FEELParser.ExpressionRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void constructorTest15() {
    // Arrange and Act
    FEELParser.ExpressionContext actualExpressionContext = new FEELParser.ExpressionContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualExpressionContext.invokingState);
    assertEquals(2, actualExpressionContext.depth());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest15() {
    // Arrange, Act and Assert
    assertEquals(18, (new FEELParser.ExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void textualExpressionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ExpressionContext(new ParserRuleContext(), 1)).textualExpression());
  }

  @Test(timeout=10000)
  public void STAR_STARTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ExponentiationContext(new ParserRuleContext(), 1)).STAR_STAR().size());
  }

  @Test(timeout=10000)
  public void constructorTest14() {
    // Arrange and Act
    FEELParser.ExponentiationContext actualExponentiationContext = new FEELParser.ExponentiationContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualExponentiationContext.invokingState);
    assertEquals(2, actualExponentiationContext.depth());
  }

  @Test(timeout=10000)
  public void arithmeticNegationTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ExponentiationContext(new ParserRuleContext(), 1)).arithmeticNegation(1));
  }

  @Test(timeout=10000)
  public void STAR_STARTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ExponentiationContext(new ParserRuleContext(), 1)).STAR_STAR(1));
  }

  @Test(timeout=10000)
  public void arithmeticNegationTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ExponentiationContext(new ParserRuleContext(), 1)).arithmeticNegation().size());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest14() {
    // Arrange, Act and Assert
    assertEquals(33, (new FEELParser.ExponentiationContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void constructorTest13() {
    // Arrange and Act
    FEELParser.EndpointContext actualEndpointContext = new FEELParser.EndpointContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualEndpointContext.invokingState);
    assertEquals(2, actualEndpointContext.depth());
  }

  @Test(timeout=10000)
  public void simpleValueTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.EndpointContext(new ParserRuleContext(), 1)).simpleValue());
  }

  @Test(timeout=10000)
  public void MINUSTest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.EndpointContext(new ParserRuleContext(), 1)).MINUS());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest13() {
    // Arrange, Act and Assert
    assertEquals(15, (new FEELParser.EndpointContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void conjunctionTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.DisjunctionContext(new ParserRuleContext(), 1)).conjunction().size());
  }

  @Test(timeout=10000)
  public void conjunctionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DisjunctionContext(new ParserRuleContext(), 1)).conjunction(1));
  }

  @Test(timeout=10000)
  public void ORTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DisjunctionContext(new ParserRuleContext(), 1)).OR(1));
  }

  @Test(timeout=10000)
  public void constructorTest12() {
    // Arrange and Act
    FEELParser.DisjunctionContext actualDisjunctionContext = new FEELParser.DisjunctionContext(new ParserRuleContext(),
        1);

    // Assert
    assertEquals(1, actualDisjunctionContext.invokingState);
    assertEquals(2, actualDisjunctionContext.depth());
  }

  @Test(timeout=10000)
  public void ORTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.DisjunctionContext(new ParserRuleContext(), 1)).OR().size());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest12() {
    // Arrange, Act and Assert
    assertEquals(27, (new FEELParser.DisjunctionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void PAREN_OPENTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DateTimeLiteralContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test(timeout=10000)
  public void PAREN_CLOSETest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DateTimeLiteralContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test(timeout=10000)
  public void constructorTest11() {
    // Arrange and Act
    FEELParser.DateTimeLiteralContext actualDateTimeLiteralContext = new FEELParser.DateTimeLiteralContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualDateTimeLiteralContext.invokingState);
    assertEquals(2, actualDateTimeLiteralContext.depth());
  }

  @Test(timeout=10000)
  public void identifierTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DateTimeLiteralContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest11() {
    // Arrange, Act and Assert
    assertEquals(55, (new FEELParser.DateTimeLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void stringLiteralTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DateTimeLiteralContext(new ParserRuleContext(), 1)).stringLiteral());
  }

  @Test(timeout=10000)
  public void constructorTest10() {
    // Arrange and Act
    FEELParser.ContextEntryContext actualContextEntryContext = new FEELParser.ContextEntryContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualContextEntryContext.invokingState);
    assertEquals(2, actualContextEntryContext.depth());
  }

  @Test(timeout=10000)
  public void expressionTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextEntryContext(new ParserRuleContext(), 1)).expression());
  }

  @Test(timeout=10000)
  public void COLONTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextEntryContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest10() {
    // Arrange, Act and Assert
    assertEquals(53, (new FEELParser.ContextEntryContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void keyTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextEntryContext(new ParserRuleContext(), 1)).key());
  }

  @Test(timeout=10000)
  public void BRACE_CLOSETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextContext(new ParserRuleContext(), 1)).BRACE_CLOSE());
  }

  @Test(timeout=10000)
  public void BRACE_OPENTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextContext(new ParserRuleContext(), 1)).BRACE_OPEN());
  }

  @Test(timeout=10000)
  public void constructorTest9() {
    // Arrange and Act
    FEELParser.ContextContext actualContextContext = new FEELParser.ContextContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualContextContext.invokingState);
    assertEquals(2, actualContextContext.depth());
  }

  @Test(timeout=10000)
  public void contextEntryTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ContextContext(new ParserRuleContext(), 1)).contextEntry().size());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest9() {
    // Arrange, Act and Assert
    assertEquals(52, (new FEELParser.ContextContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void COMMATest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ContextContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test(timeout=10000)
  public void COMMATest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test(timeout=10000)
  public void contextEntryTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextContext(new ParserRuleContext(), 1)).contextEntry(1));
  }

  @Test(timeout=10000)
  public void constructorTest8() {
    // Arrange and Act
    FEELParser.ConjunctionContext actualConjunctionContext = new FEELParser.ConjunctionContext(new ParserRuleContext(),
        1);

    // Assert
    assertEquals(1, actualConjunctionContext.invokingState);
    assertEquals(2, actualConjunctionContext.depth());
  }

  @Test(timeout=10000)
  public void ANDTest3() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ConjunctionContext(new ParserRuleContext(), 1)).AND().size());
  }

  @Test(timeout=10000)
  public void comparisonTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ConjunctionContext(new ParserRuleContext(), 1)).comparison(1));
  }

  @Test(timeout=10000)
  public void getRuleIndexTest8() {
    // Arrange, Act and Assert
    assertEquals(28, (new FEELParser.ConjunctionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void ANDTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ConjunctionContext(new ParserRuleContext(), 1)).AND(1));
  }

  @Test(timeout=10000)
  public void comparisonTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ConjunctionContext(new ParserRuleContext(), 1)).comparison().size());
  }

  @Test(timeout=10000)
  public void expressionTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test(timeout=10000)
  public void arithmeticExpressionTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).arithmeticExpression().size());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest7() {
    // Arrange, Act and Assert
    assertEquals(29, (new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void positiveUnaryTestsTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).positiveUnaryTests());
  }

  @Test(timeout=10000)
  public void LETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).LE());
  }

  @Test(timeout=10000)
  public void ANDTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).AND());
  }

  @Test(timeout=10000)
  public void NETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).NE());
  }

  @Test(timeout=10000)
  public void PAREN_OPENTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test(timeout=10000)
  public void INTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).IN());
  }

  @Test(timeout=10000)
  public void arithmeticExpressionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).arithmeticExpression(1));
  }

  @Test(timeout=10000)
  public void PAREN_CLOSETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test(timeout=10000)
  public void constructorTest7() {
    // Arrange and Act
    FEELParser.ComparisonContext actualComparisonContext = new FEELParser.ComparisonContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualComparisonContext.invokingState);
    assertEquals(2, actualComparisonContext.depth());
  }

  @Test(timeout=10000)
  public void positiveUnaryTestTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).positiveUnaryTest());
  }

  @Test(timeout=10000)
  public void GETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).GE());
  }

  @Test(timeout=10000)
  public void GTTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).GT());
  }

  @Test(timeout=10000)
  public void EQTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).EQ());
  }

  @Test(timeout=10000)
  public void expressionTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test(timeout=10000)
  public void BETWEENTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).BETWEEN());
  }

  @Test(timeout=10000)
  public void LTTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).LT());
  }

  @Test(timeout=10000)
  public void constructorTest6() {
    // Arrange and Act
    FEELParser.BoxedExpressionRootContext actualBoxedExpressionRootContext = new FEELParser.BoxedExpressionRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualBoxedExpressionRootContext.invokingState);
    assertEquals(2, actualBoxedExpressionRootContext.depth());
  }

  @Test(timeout=10000)
  public void EOFTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BoxedExpressionRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest6() {
    // Arrange, Act and Assert
    assertEquals(5, (new FEELParser.BoxedExpressionRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void boxedExpressionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BoxedExpressionRootContext(new ParserRuleContext(), 1)).boxedExpression());
  }

  @Test(timeout=10000)
  public void constructorTest5() {
    // Arrange and Act
    FEELParser.BoxedExpressionContext actualBoxedExpressionContext = new FEELParser.BoxedExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualBoxedExpressionContext.invokingState);
    assertEquals(2, actualBoxedExpressionContext.depth());
  }

  @Test(timeout=10000)
  public void listTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BoxedExpressionContext(new ParserRuleContext(), 1)).list());
  }

  @Test(timeout=10000)
  public void contextTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BoxedExpressionContext(new ParserRuleContext(), 1)).context());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest5() {
    // Arrange, Act and Assert
    assertEquals(50, (new FEELParser.BoxedExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void functionDefinitionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BoxedExpressionContext(new ParserRuleContext(), 1)).functionDefinition());
  }

  @Test(timeout=10000)
  public void constructorTest4() {
    // Arrange and Act
    FEELParser.BooleanLiteralContext actualBooleanLiteralContext = new FEELParser.BooleanLiteralContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualBooleanLiteralContext.invokingState);
    assertEquals(2, actualBooleanLiteralContext.depth());
  }

  @Test(timeout=10000)
  public void FALSETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BooleanLiteralContext(new ParserRuleContext(), 1)).FALSE());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest4() {
    // Arrange, Act and Assert
    assertEquals(48, (new FEELParser.BooleanLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void TRUETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BooleanLiteralContext(new ParserRuleContext(), 1)).TRUE());
  }

  @Test(timeout=10000)
  public void NOTTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).NOT(1));
  }

  @Test(timeout=10000)
  public void MINUSTest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).MINUS(1));
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange and Act
    FEELParser.ArithmeticNegationContext actualArithmeticNegationContext = new FEELParser.ArithmeticNegationContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualArithmeticNegationContext.invokingState);
    assertEquals(2, actualArithmeticNegationContext.depth());
  }

  @Test(timeout=10000)
  public void NOTTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).NOT().size());
  }

  @Test(timeout=10000)
  public void MINUSTest3() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).MINUS().size());
  }

  @Test(timeout=10000)
  public void instanceOfTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).instanceOf());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest3() {
    // Arrange, Act and Assert
    assertEquals(34, (new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void additionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ArithmeticExpressionContext(new ParserRuleContext(), 1)).addition());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    FEELParser.ArithmeticExpressionContext actualArithmeticExpressionContext = new FEELParser.ArithmeticExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualArithmeticExpressionContext.invokingState);
    assertEquals(2, actualArithmeticExpressionContext.depth());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest2() {
    // Arrange, Act and Assert
    assertEquals(30, (new FEELParser.ArithmeticExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void MINUSTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.AdditionContext(new ParserRuleContext(), 1)).MINUS(1));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    FEELParser.AdditionContext actualAdditionContext = new FEELParser.AdditionContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualAdditionContext.invokingState);
    assertEquals(2, actualAdditionContext.depth());
  }

  @Test(timeout=10000)
  public void PLUSTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.AdditionContext(new ParserRuleContext(), 1)).PLUS(1));
  }

  @Test(timeout=10000)
  public void multiplicationTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.AdditionContext(new ParserRuleContext(), 1)).multiplication().size());
  }

  @Test(timeout=10000)
  public void PLUSTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.AdditionContext(new ParserRuleContext(), 1)).PLUS().size());
  }

  @Test(timeout=10000)
  public void MINUSTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.AdditionContext(new ParserRuleContext(), 1)).MINUS().size());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest() {
    // Arrange, Act and Assert
    assertEquals(31, (new FEELParser.AdditionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test(timeout=10000)
  public void multiplicationTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.AdditionContext(new ParserRuleContext(), 1)).multiplication(1));
  }
}

