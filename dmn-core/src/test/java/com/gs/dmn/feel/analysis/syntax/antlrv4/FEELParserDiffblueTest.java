package com.gs.dmn.feel.analysis.syntax.antlrv4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.VocabularyImpl;
import org.junit.Test;

public class FEELParserDiffblueTest {
  @Test
  public void ANDTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ConjunctionContext(new ParserRuleContext(), 1)).AND(1));
  }

  @Test
  public void ANDTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ConjunctionContext(new ParserRuleContext(), 1)).AND().size());
  }

  @Test
  public void ANDTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).AND());
  }

  @Test
  public void ANDTest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IdentifierContext(new ParserRuleContext(), 1)).AND());
  }

  @Test
  public void ARROWTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).ARROW());
  }

  @Test
  public void BETWEENTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).BETWEEN());
  }

  @Test
  public void BRACE_CLOSETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextContext(new ParserRuleContext(), 1)).BRACE_CLOSE());
  }

  @Test
  public void BRACE_OPENTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextContext(new ParserRuleContext(), 1)).BRACE_OPEN());
  }

  @Test
  public void BRACKET_CLOSETest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).BRACKET_CLOSE().size());
  }

  @Test
  public void BRACKET_CLOSETest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).BRACKET_CLOSE(1));
  }

  @Test
  public void BRACKET_CLOSETest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ListContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test
  public void BRACKET_CLOSETest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalStartParContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test
  public void BRACKET_CLOSETest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalEndParContext(new ParserRuleContext(), 1)).BRACKET_CLOSE());
  }

  @Test
  public void BRACKET_OPENTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).BRACKET_OPEN().size());
  }

  @Test
  public void BRACKET_OPENTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).BRACKET_OPEN(1));
  }

  @Test
  public void BRACKET_OPENTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ListContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test
  public void BRACKET_OPENTest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalStartParContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test
  public void BRACKET_OPENTest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalEndParContext(new ParserRuleContext(), 1)).BRACKET_OPEN());
  }

  @Test
  public void COLONTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).COLON().size());
  }

  @Test
  public void COLONTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).COLON(1));
  }

  @Test
  public void COLONTest3() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TypeContext(new ParserRuleContext(), 1)).COLON().size());
  }

  @Test
  public void COLONTest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).COLON(1));
  }

  @Test
  public void COLONTest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FormalParameterContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test
  public void COLONTest6() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextEntryContext(new ParserRuleContext(), 1)).COLON());
  }

  @Test
  public void COMMATest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void COMMATest10() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PositionalParametersContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void COMMATest11() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void COMMATest12() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.SimplePositiveUnaryTestsContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void COMMATest13() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PositiveUnaryTestsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void COMMATest14() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PositiveUnaryTestsContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void COMMATest15() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void COMMATest16() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void COMMATest17() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void COMMATest18() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ContextContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void COMMATest19() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ListContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void COMMATest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void COMMATest20() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ListContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void COMMATest21() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void COMMATest22() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TextualExpressionsContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void COMMATest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void COMMATest4() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void COMMATest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void COMMATest6() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TypeContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void COMMATest7() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionsContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void COMMATest8() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.SimpleExpressionsContext(new ParserRuleContext(), 1)).COMMA().size());
  }

  @Test
  public void COMMATest9() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PositionalParametersContext(new ParserRuleContext(), 1)).COMMA(1));
  }

  @Test
  public void DOTTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QualifiedNameContext(new ParserRuleContext(), 1)).DOT(1));
  }

  @Test
  public void DOTTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.QualifiedNameContext(new ParserRuleContext(), 1)).DOT().size());
  }

  @Test
  public void DOTTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).DOT(1));
  }

  @Test
  public void DOTTest4() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).DOT().size());
  }

  @Test
  public void DOT_DOTTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IterationDomainContext(new ParserRuleContext(), 1)).DOT_DOT());
  }

  @Test
  public void DOT_DOTTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalContext(new ParserRuleContext(), 1)).DOT_DOT());
  }

  @Test
  public void ELSETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).ELSE());
  }

  @Test
  public void EOFTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionsRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void EOFTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void EOFTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ExpressionRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void EOFTest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionsRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void EOFTest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BoxedExpressionRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void EOFTest6() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsRootContext(new ParserRuleContext(), 1)).EOF());
  }

  @Test
  public void EQTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).EQ());
  }

  @Test
  public void EVERYTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).EVERY());
  }

  @Test
  public void EXTERNALTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).EXTERNAL());
  }

  @Test
  public void FALSETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BooleanLiteralContext(new ParserRuleContext(), 1)).FALSE());
  }

  @Test
  public void FORTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).FOR());
  }

  @Test
  public void FORWARD_SLASHTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).FORWARD_SLASH(1));
  }

  @Test
  public void FORWARD_SLASHTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).FORWARD_SLASH().size());
  }

  @Test
  public void FUNCTIONTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).FUNCTION());
  }

  @Test
  public void FUNCTIONTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IdentifierContext(new ParserRuleContext(), 1)).FUNCTION());
  }

  @Test
  public void GETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).GE());
  }

  @Test
  public void GETest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).GE());
  }

  @Test
  public void GTTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).GT());
  }

  @Test
  public void GTTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).GT());
  }

  @Test
  public void GTTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).GT());
  }

  @Test
  public void IFTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).IF());
  }

  @Test
  public void INSTANCE_OFTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.InstanceOfContext(new ParserRuleContext(), 1)).INSTANCE_OF());
  }

  @Test
  public void INTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).IN(1));
  }

  @Test
  public void INTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).IN().size());
  }

  @Test
  public void INTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).IN(1));
  }

  @Test
  public void INTest4() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).IN().size());
  }

  @Test
  public void INTest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).IN());
  }

  @Test
  public void LETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).LE());
  }

  @Test
  public void LETest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).LE());
  }

  @Test
  public void LTTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).LT());
  }

  @Test
  public void LTTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).LT());
  }

  @Test
  public void LTTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).LT());
  }

  @Test
  public void MINUSTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).MINUS());
  }

  @Test
  public void MINUSTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.AdditionContext(new ParserRuleContext(), 1)).MINUS().size());
  }

  @Test
  public void MINUSTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.AdditionContext(new ParserRuleContext(), 1)).MINUS(1));
  }

  @Test
  public void MINUSTest4() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).MINUS().size());
  }

  @Test
  public void MINUSTest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).MINUS(1));
  }

  @Test
  public void MINUSTest6() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).MINUS());
  }

  @Test
  public void MINUSTest7() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.EndpointContext(new ParserRuleContext(), 1)).MINUS());
  }

  @Test
  public void NAMETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IdentifierContext(new ParserRuleContext(), 1)).NAME());
  }

  @Test
  public void NETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).NE());
  }

  @Test
  public void NOTTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).NOT());
  }

  @Test
  public void NOTTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).NOT().size());
  }

  @Test
  public void NOTTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).NOT(1));
  }

  @Test
  public void NOTTest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).NOT());
  }

  @Test
  public void NULLTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.LiteralContext(new ParserRuleContext(), 1)).NULL());
  }

  @Test
  public void NUMBERTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.NumericLiteralContext(new ParserRuleContext(), 1)).NUMBER());
  }

  @Test
  public void ORTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.DisjunctionContext(new ParserRuleContext(), 1)).OR().size());
  }

  @Test
  public void ORTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DisjunctionContext(new ParserRuleContext(), 1)).OR(1));
  }

  @Test
  public void ORTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IdentifierContext(new ParserRuleContext(), 1)).OR());
  }

  @Test
  public void PAREN_CLOSETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ParametersContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void PAREN_CLOSETest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void PAREN_CLOSETest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void PAREN_CLOSETest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void PAREN_CLOSETest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void PAREN_CLOSETest6() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void PAREN_CLOSETest7() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DateTimeLiteralContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void PAREN_CLOSETest8() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalEndParContext(new ParserRuleContext(), 1)).PAREN_CLOSE());
  }

  @Test
  public void PAREN_OPENTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ParametersContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void PAREN_OPENTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void PAREN_OPENTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void PAREN_OPENTest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void PAREN_OPENTest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void PAREN_OPENTest6() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void PAREN_OPENTest7() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalStartParContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void PAREN_OPENTest8() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DateTimeLiteralContext(new ParserRuleContext(), 1)).PAREN_OPEN());
  }

  @Test
  public void PLUSTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.AdditionContext(new ParserRuleContext(), 1)).PLUS().size());
  }

  @Test
  public void PLUSTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.AdditionContext(new ParserRuleContext(), 1)).PLUS(1));
  }

  @Test
  public void RETURNTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).RETURN());
  }

  @Test
  public void SATISFIESTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).SATISFIES());
  }

  @Test
  public void SOMETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).SOME());
  }

  @Test
  public void STARTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).STAR(1));
  }

  @Test
  public void STARTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).STAR().size());
  }

  @Test
  public void STAR_STARTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ExponentiationContext(new ParserRuleContext(), 1)).STAR_STAR(1));
  }

  @Test
  public void STAR_STARTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ExponentiationContext(new ParserRuleContext(), 1)).STAR_STAR().size());
  }

  @Test
  public void STRINGTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.StringLiteralContext(new ParserRuleContext(), 1)).STRING());
  }

  @Test
  public void THENTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).THEN());
  }

  @Test
  public void TRUETest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BooleanLiteralContext(new ParserRuleContext(), 1)).TRUE());
  }

  @Test
  public void additionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ArithmeticExpressionContext(new ParserRuleContext(), 1)).addition());
  }

  @Test
  public void additionTest2() throws RecognitionException {
    // Arrange and Act
    FEELParser.AdditionContext actualAdditionResult = (new FEELParser(
        new BufferedTokenStream(new FEELLexer(new ANTLRInputStream())))).addition();

    // Assert
    assertNull(actualAdditionResult.ast);
    FEELParser.MultiplicationContext multiplicationContext = actualAdditionResult.left;
    Expression actualExpression = multiplicationContext.ast;
    assertNull(actualAdditionResult.getParent());
    Token expectedStart = actualAdditionResult.start;
    Token start = actualAdditionResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualAdditionResult.getChildCount());
    assertNull(actualAdditionResult.getStop());
    assertTrue(actualAdditionResult.isEmpty());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertNull(actualExpression);
    assertEquals(0, start.getTokenIndex());
    FEELParser.ExponentiationContext exponentiationContext = multiplicationContext.left;
    FEELParser.ArithmeticNegationContext arithmeticNegationContext = exponentiationContext.left;
    assertEquals("([444] ([458 444] [472 458 444]))", multiplicationContext.toStringTree());
    assertEquals(444, multiplicationContext.invokingState);
    assertEquals(1, multiplicationContext.getChildCount());
    assertEquals(1, start.getLine());
    assertNull(multiplicationContext.getStop());
    assertSame(start, multiplicationContext.getStart());
    assertEquals(2, multiplicationContext.depth());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getStartIndex());
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertNull(exponentiationContext.getStop());
    assertNull(exponentiationContext.ast);
    assertEquals(1, exponentiationContext.getChildCount());
    assertEquals("[458 444]", exponentiationContext.toString());
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertEquals(458, exponentiationContext.invokingState);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(472, arithmeticNegationContext.invokingState);
    assertTrue(arithmeticNegationContext.exception instanceof org.antlr.v4.runtime.InputMismatchException);
  }

  @Test
  public void arithmeticExpressionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).arithmeticExpression(1));
  }

  @Test
  public void arithmeticExpressionTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).arithmeticExpression().size());
  }

  @Test
  public void arithmeticExpressionTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionContext(new ParserRuleContext(), 1)).arithmeticExpression());
  }

  @Test
  public void arithmeticNegationTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ExponentiationContext(new ParserRuleContext(), 1)).arithmeticNegation().size());
  }

  @Test
  public void arithmeticNegationTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ExponentiationContext(new ParserRuleContext(), 1)).arithmeticNegation(1));
  }

  @Test
  public void arithmeticNegationTest3() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new FEELLexer(new ANTLRInputStream()));
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.ArithmeticNegationContext actualArithmeticNegationResult = feelParser.arithmeticNegation();

    // Assert
    RecognitionException recognitionException = actualArithmeticNegationResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualArithmeticNegationResult.getParent());
    Token expectedStart = actualArithmeticNegationResult.start;
    Token start = actualArithmeticNegationResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualArithmeticNegationResult.getStop());
    assertTrue(actualArithmeticNegationResult.isEmpty());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    ParserRuleContext actualRuleContext = ((FEELParser) recognizer).getRuleContext();
    assertEquals(0, start.getTokenIndex());
    assertSame(actualArithmeticNegationResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(490, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getStartIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertNull(actualRuleContext);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(-1, recognizer.getState());
  }

  @Test
  public void booleanLiteralTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleLiteralContext(new ParserRuleContext(), 1)).booleanLiteral());
  }

  @Test
  public void booleanLiteralTest2() throws RecognitionException {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(feelLexer);
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.BooleanLiteralContext actualBooleanLiteralResult = feelParser.booleanLiteral();

    // Assert
    RecognitionException recognitionException = actualBooleanLiteralResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualBooleanLiteralResult.getParent());
    Token expectedStart = feelLexer._token;
    Token start = actualBooleanLiteralResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualBooleanLiteralResult.getStop());
    assertTrue(actualBooleanLiteralResult.isEmpty());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    ParserRuleContext actualRuleContext = ((FEELParser) recognizer).getRuleContext();
    assertEquals(0, start.getTokenIndex());
    assertSame(actualBooleanLiteralResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(692, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getStartIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertNull(actualRuleContext);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(-1, recognizer.getState());
  }

  @Test
  public void boxedExpressionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).boxedExpression());
  }

  @Test
  public void boxedExpressionTest2() throws RecognitionException {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(feelLexer);
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.BoxedExpressionContext actualBoxedExpressionResult = feelParser.boxedExpression();

    // Assert
    RecognitionException recognitionException = actualBoxedExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualBoxedExpressionResult.getParent());
    Token expectedStart = feelLexer._token;
    Token start = actualBoxedExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(-1, actualBoxedExpressionResult.invokingState);
    assertNull(actualBoxedExpressionResult.getStop());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualBoxedExpressionResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals("<EOF>", start.getText());
    assertEquals(1, start.getLine());
    assertEquals(708, recognitionException.getOffendingState());
    assertEquals(0, start.getTokenIndex());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertEquals(-1, recognizer.getState());
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
  }

  @Test
  public void boxedExpressionTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BoxedExpressionRootContext(new ParserRuleContext(), 1)).boxedExpression());
  }

  @Test
  public void comparisonTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ConjunctionContext(new ParserRuleContext(), 1)).comparison().size());
  }

  @Test
  public void comparisonTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ConjunctionContext(new ParserRuleContext(), 1)).comparison(1));
  }

  @Test
  public void conjunctionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DisjunctionContext(new ParserRuleContext(), 1)).conjunction(1));
  }

  @Test
  public void conjunctionTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.DisjunctionContext(new ParserRuleContext(), 1)).conjunction().size());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    FEELParser.NamedParametersContext actualNamedParametersContext = new FEELParser.NamedParametersContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualNamedParametersContext.invokingState);
    assertEquals(2, actualNamedParametersContext.depth());
  }

  @Test
  public void constructorTest10() {
    // Arrange and Act
    FEELParser.TypeContext actualTypeContext = new FEELParser.TypeContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualTypeContext.invokingState);
    assertEquals(2, actualTypeContext.depth());
  }

  @Test
  public void constructorTest11() {
    // Arrange and Act
    FEELParser.QuantifiedExpressionContext actualQuantifiedExpressionContext = new FEELParser.QuantifiedExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualQuantifiedExpressionContext.invokingState);
    assertEquals(2, actualQuantifiedExpressionContext.depth());
  }

  @Test
  public void constructorTest12() {
    // Arrange and Act
    FEELParser.NumericLiteralContext actualNumericLiteralContext = new FEELParser.NumericLiteralContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualNumericLiteralContext.invokingState);
    assertEquals(2, actualNumericLiteralContext.depth());
  }

  @Test
  public void constructorTest13() {
    // Arrange and Act
    FEELParser.SimpleExpressionsContext actualSimpleExpressionsContext = new FEELParser.SimpleExpressionsContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleExpressionsContext.invokingState);
    assertEquals(2, actualSimpleExpressionsContext.depth());
  }

  @Test
  public void constructorTest14() {
    // Arrange and Act
    FEELParser.SimpleLiteralContext actualSimpleLiteralContext = new FEELParser.SimpleLiteralContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleLiteralContext.invokingState);
    assertEquals(2, actualSimpleLiteralContext.depth());
  }

  @Test
  public void constructorTest15() {
    // Arrange and Act
    FEELParser.PositionalParametersContext actualPositionalParametersContext = new FEELParser.PositionalParametersContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualPositionalParametersContext.invokingState);
    assertEquals(2, actualPositionalParametersContext.depth());
  }

  @Test
  public void constructorTest16() {
    // Arrange and Act
    FEELParser.ExpressionRootContext actualExpressionRootContext = new FEELParser.ExpressionRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualExpressionRootContext.invokingState);
    assertEquals(2, actualExpressionRootContext.depth());
  }

  @Test
  public void constructorTest17() {
    // Arrange and Act
    FEELParser.QualifiedNameContext actualQualifiedNameContext = new FEELParser.QualifiedNameContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualQualifiedNameContext.invokingState);
    assertEquals(2, actualQualifiedNameContext.depth());
  }

  @Test
  public void constructorTest18() {
    // Arrange and Act
    FEELParser.PostfixExpressionContext actualPostfixExpressionContext = new FEELParser.PostfixExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualPostfixExpressionContext.invokingState);
    assertEquals(2, actualPostfixExpressionContext.depth());
  }

  @Test
  public void constructorTest19() {
    // Arrange and Act
    FEELParser.SimplePositiveUnaryTestsContext actualSimplePositiveUnaryTestsContext = new FEELParser.SimplePositiveUnaryTestsContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimplePositiveUnaryTestsContext.invokingState);
    assertEquals(2, actualSimplePositiveUnaryTestsContext.depth());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    FEELParser.TextualExpressionsRootContext actualTextualExpressionsRootContext = new FEELParser.TextualExpressionsRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualTextualExpressionsRootContext.invokingState);
    assertEquals(2, actualTextualExpressionsRootContext.depth());
  }

  @Test
  public void constructorTest20() {
    // Arrange and Act
    FEELParser.ConjunctionContext actualConjunctionContext = new FEELParser.ConjunctionContext(new ParserRuleContext(),
        1);

    // Assert
    assertEquals(1, actualConjunctionContext.invokingState);
    assertEquals(2, actualConjunctionContext.depth());
  }

  @Test
  public void constructorTest21() {
    // Arrange and Act
    FEELParser.DisjunctionContext actualDisjunctionContext = new FEELParser.DisjunctionContext(new ParserRuleContext(),
        1);

    // Assert
    assertEquals(1, actualDisjunctionContext.invokingState);
    assertEquals(2, actualDisjunctionContext.depth());
  }

  @Test
  public void constructorTest22() {
    // Arrange and Act
    FEELParser.PositiveUnaryTestsContext actualPositiveUnaryTestsContext = new FEELParser.PositiveUnaryTestsContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualPositiveUnaryTestsContext.invokingState);
    assertEquals(2, actualPositiveUnaryTestsContext.depth());
  }

  @Test
  public void constructorTest23() {
    // Arrange and Act
    FEELParser.ForExpressionContext actualForExpressionContext = new FEELParser.ForExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualForExpressionContext.invokingState);
    assertEquals(2, actualForExpressionContext.depth());
  }

  @Test
  public void constructorTest24() {
    // Arrange and Act
    FEELParser.LiteralContext actualLiteralContext = new FEELParser.LiteralContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualLiteralContext.invokingState);
    assertEquals(2, actualLiteralContext.depth());
  }

  @Test
  public void constructorTest25() {
    // Arrange and Act
    FEELParser.ArithmeticNegationContext actualArithmeticNegationContext = new FEELParser.ArithmeticNegationContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualArithmeticNegationContext.invokingState);
    assertEquals(2, actualArithmeticNegationContext.depth());
  }

  @Test
  public void constructorTest26() {
    // Arrange and Act
    FEELParser.ContextContext actualContextContext = new FEELParser.ContextContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualContextContext.invokingState);
    assertEquals(2, actualContextContext.depth());
  }

  @Test
  public void constructorTest27() {
    // Arrange and Act
    FEELParser.SimpleValueContext actualSimpleValueContext = new FEELParser.SimpleValueContext(new ParserRuleContext(),
        1);

    // Assert
    assertEquals(1, actualSimpleValueContext.invokingState);
    assertEquals(2, actualSimpleValueContext.depth());
  }

  @Test
  public void constructorTest28() {
    // Arrange and Act
    FEELParser.UnaryTestsContext actualUnaryTestsContext = new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualUnaryTestsContext.invokingState);
    assertEquals(2, actualUnaryTestsContext.depth());
  }

  @Test
  public void constructorTest29() {
    // Arrange and Act
    FEELParser.PrimaryExpressionContext actualPrimaryExpressionContext = new FEELParser.PrimaryExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualPrimaryExpressionContext.invokingState);
    assertEquals(2, actualPrimaryExpressionContext.depth());
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    FEELParser.ParametersContext actualParametersContext = new FEELParser.ParametersContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualParametersContext.invokingState);
    assertEquals(2, actualParametersContext.depth());
  }

  @Test
  public void constructorTest30() {
    // Arrange and Act
    FEELParser.ExponentiationContext actualExponentiationContext = new FEELParser.ExponentiationContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualExponentiationContext.invokingState);
    assertEquals(2, actualExponentiationContext.depth());
  }

  @Test
  public void constructorTest31() {
    // Arrange and Act
    FEELParser.ExpressionContext actualExpressionContext = new FEELParser.ExpressionContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualExpressionContext.invokingState);
    assertEquals(2, actualExpressionContext.depth());
  }

  @Test
  public void constructorTest32() {
    // Arrange and Act
    FEELParser.ListContext actualListContext = new FEELParser.ListContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualListContext.invokingState);
    assertEquals(2, actualListContext.depth());
  }

  @Test
  public void constructorTest33() {
    // Arrange and Act
    FEELParser.ComparisonContext actualComparisonContext = new FEELParser.ComparisonContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualComparisonContext.invokingState);
    assertEquals(2, actualComparisonContext.depth());
  }

  @Test
  public void constructorTest34() {
    // Arrange and Act
    FEELParser.IntervalStartParContext actualIntervalStartParContext = new FEELParser.IntervalStartParContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIntervalStartParContext.invokingState);
    assertEquals(2, actualIntervalStartParContext.depth());
  }

  @Test
  public void constructorTest35() {
    // Arrange and Act
    FEELParser.ParameterNameContext actualParameterNameContext = new FEELParser.ParameterNameContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualParameterNameContext.invokingState);
    assertEquals(2, actualParameterNameContext.depth());
  }

  @Test
  public void constructorTest36() {
    // Arrange and Act
    FEELParser.SimpleExpressionContext actualSimpleExpressionContext = new FEELParser.SimpleExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleExpressionContext.invokingState);
    assertEquals(2, actualSimpleExpressionContext.depth());
  }

  @Test
  public void constructorTest37() {
    // Arrange and Act
    FEELParser.FormalParameterContext actualFormalParameterContext = new FEELParser.FormalParameterContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualFormalParameterContext.invokingState);
    assertEquals(2, actualFormalParameterContext.depth());
  }

  @Test
  public void constructorTest38() {
    // Arrange and Act
    FEELParser.TextualExpressionsContext actualTextualExpressionsContext = new FEELParser.TextualExpressionsContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualTextualExpressionsContext.invokingState);
    assertEquals(2, actualTextualExpressionsContext.depth());
  }

  @Test
  public void constructorTest39() {
    // Arrange and Act
    FEELParser.InstanceOfContext actualInstanceOfContext = new FEELParser.InstanceOfContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualInstanceOfContext.invokingState);
    assertEquals(2, actualInstanceOfContext.depth());
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    FEELParser.SimpleUnaryTestsContext actualSimpleUnaryTestsContext = new FEELParser.SimpleUnaryTestsContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleUnaryTestsContext.invokingState);
    assertEquals(2, actualSimpleUnaryTestsContext.depth());
  }

  @Test
  public void constructorTest40() {
    // Arrange and Act
    FEELParser.EndpointContext actualEndpointContext = new FEELParser.EndpointContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualEndpointContext.invokingState);
    assertEquals(2, actualEndpointContext.depth());
  }

  @Test
  public void constructorTest41() {
    // Arrange and Act
    FEELParser.SimpleExpressionsRootContext actualSimpleExpressionsRootContext = new FEELParser.SimpleExpressionsRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleExpressionsRootContext.invokingState);
    assertEquals(2, actualSimpleExpressionsRootContext.depth());
  }

  @Test
  public void constructorTest42() {
    // Arrange and Act
    FEELParser.IfExpressionContext actualIfExpressionContext = new FEELParser.IfExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIfExpressionContext.invokingState);
    assertEquals(2, actualIfExpressionContext.depth());
  }

  @Test
  public void constructorTest43() {
    // Arrange and Act
    FEELParser.DateTimeLiteralContext actualDateTimeLiteralContext = new FEELParser.DateTimeLiteralContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualDateTimeLiteralContext.invokingState);
    assertEquals(2, actualDateTimeLiteralContext.depth());
  }

  @Test
  public void constructorTest44() {
    // Arrange and Act
    FEELParser.ArithmeticExpressionContext actualArithmeticExpressionContext = new FEELParser.ArithmeticExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualArithmeticExpressionContext.invokingState);
    assertEquals(2, actualArithmeticExpressionContext.depth());
  }

  @Test
  public void constructorTest45() {
    // Arrange and Act
    FEELParser.BoxedExpressionRootContext actualBoxedExpressionRootContext = new FEELParser.BoxedExpressionRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualBoxedExpressionRootContext.invokingState);
    assertEquals(2, actualBoxedExpressionRootContext.depth());
  }

  @Test
  public void constructorTest46() {
    // Arrange and Act
    FEELParser.IntervalEndParContext actualIntervalEndParContext = new FEELParser.IntervalEndParContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIntervalEndParContext.invokingState);
    assertEquals(2, actualIntervalEndParContext.depth());
  }

  @Test
  public void constructorTest47() {
    // Arrange and Act
    FEELParser.TextualExpressionContext actualTextualExpressionContext = new FEELParser.TextualExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualTextualExpressionContext.invokingState);
    assertEquals(2, actualTextualExpressionContext.depth());
  }

  @Test
  public void constructorTest48() {
    // Arrange and Act
    FEELParser.PositiveUnaryTestContext actualPositiveUnaryTestContext = new FEELParser.PositiveUnaryTestContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualPositiveUnaryTestContext.invokingState);
    assertEquals(2, actualPositiveUnaryTestContext.depth());
  }

  @Test
  public void constructorTest49() {
    // Arrange and Act
    FEELParser.UnaryTestsRootContext actualUnaryTestsRootContext = new FEELParser.UnaryTestsRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualUnaryTestsRootContext.invokingState);
    assertEquals(2, actualUnaryTestsRootContext.depth());
  }

  @Test
  public void constructorTest5() {
    // Arrange and Act
    FEELParser.MultiplicationContext actualMultiplicationContext = new FEELParser.MultiplicationContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualMultiplicationContext.invokingState);
    assertEquals(2, actualMultiplicationContext.depth());
  }

  @Test
  public void constructorTest50() {
    // Arrange and Act
    FEELParser.KeyContext actualKeyContext = new FEELParser.KeyContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualKeyContext.invokingState);
    assertEquals(2, actualKeyContext.depth());
  }

  @Test
  public void constructorTest51() {
    // Arrange and Act
    FEELParser.IterationDomainContext actualIterationDomainContext = new FEELParser.IterationDomainContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIterationDomainContext.invokingState);
    assertEquals(2, actualIterationDomainContext.depth());
  }

  @Test
  public void constructorTest52() {
    // Arrange and Act
    FEELParser.IntervalContext actualIntervalContext = new FEELParser.IntervalContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIntervalContext.invokingState);
    assertEquals(2, actualIntervalContext.depth());
  }

  @Test
  public void constructorTest53() {
    // Arrange and Act
    FEELParser.BoxedExpressionContext actualBoxedExpressionContext = new FEELParser.BoxedExpressionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualBoxedExpressionContext.invokingState);
    assertEquals(2, actualBoxedExpressionContext.depth());
  }

  @Test
  public void constructorTest54() {
    // Arrange and Act
    FEELParser.StringLiteralContext actualStringLiteralContext = new FEELParser.StringLiteralContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualStringLiteralContext.invokingState);
    assertEquals(2, actualStringLiteralContext.depth());
  }

  @Test
  public void constructorTest55() {
    // Arrange and Act
    FEELParser.BooleanLiteralContext actualBooleanLiteralContext = new FEELParser.BooleanLiteralContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualBooleanLiteralContext.invokingState);
    assertEquals(2, actualBooleanLiteralContext.depth());
  }

  @Test
  public void constructorTest56() {
    // Arrange and Act
    FEELParser.ContextEntryContext actualContextEntryContext = new FEELParser.ContextEntryContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualContextEntryContext.invokingState);
    assertEquals(2, actualContextEntryContext.depth());
  }

  @Test
  public void constructorTest57() {
    // Arrange and Act
    FEELParser.IdentifierContext actualIdentifierContext = new FEELParser.IdentifierContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualIdentifierContext.invokingState);
    assertEquals(2, actualIdentifierContext.depth());
  }

  @Test
  public void constructorTest6() {
    // Arrange and Act
    FEELParser.SimplePositiveUnaryTestContext actualSimplePositiveUnaryTestContext = new FEELParser.SimplePositiveUnaryTestContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimplePositiveUnaryTestContext.invokingState);
    assertEquals(2, actualSimplePositiveUnaryTestContext.depth());
  }

  @Test
  public void constructorTest7() {
    // Arrange and Act
    FEELParser.FunctionDefinitionContext actualFunctionDefinitionContext = new FEELParser.FunctionDefinitionContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualFunctionDefinitionContext.invokingState);
    assertEquals(2, actualFunctionDefinitionContext.depth());
  }

  @Test
  public void constructorTest8() {
    // Arrange and Act
    FEELParser.AdditionContext actualAdditionContext = new FEELParser.AdditionContext(new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualAdditionContext.invokingState);
    assertEquals(2, actualAdditionContext.depth());
  }

  @Test
  public void constructorTest9() {
    // Arrange and Act
    FEELParser.SimpleUnaryTestsRootContext actualSimpleUnaryTestsRootContext = new FEELParser.SimpleUnaryTestsRootContext(
        new ParserRuleContext(), 1);

    // Assert
    assertEquals(1, actualSimpleUnaryTestsRootContext.invokingState);
    assertEquals(2, actualSimpleUnaryTestsRootContext.depth());
  }

  @Test
  public void contextEntryTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextContext(new ParserRuleContext(), 1)).contextEntry(1));
  }

  @Test
  public void contextEntryTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ContextContext(new ParserRuleContext(), 1)).contextEntry().size());
  }

  @Test
  public void contextEntryTest3() throws RecognitionException {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(feelLexer);
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.ContextEntryContext actualContextEntryResult = feelParser.contextEntry();

    // Assert
    FEELParser.KeyContext keyResult = actualContextEntryResult.key();
    RecognitionException recognitionException = actualContextEntryResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualContextEntryResult.getChildCount());
    assertEquals(1, actualContextEntryResult.depth());
    assertSame(keyResult, actualContextEntryResult.key);
    assertEquals(-1, actualContextEntryResult.invokingState);
    Token expectedStart = feelLexer._token;
    Token start = actualContextEntryResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualContextEntryResult.getStop());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(747, recognitionException.getOffendingState());
    assertTrue(keyResult.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertSame(actualContextEntryResult, recognitionException.getCtx());
    assertEquals(746, keyResult.invokingState);
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(feelParser, recognitionException.getRecognizer());
    assertSame(start, keyResult.getStart());
    assertEquals(2, keyResult.depth());
    assertNull(keyResult.getStop());
    assertEquals(0, start.getStartIndex());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals("[@0,0:-1='<EOF>',<-1>,1:0]", ((CommonToken) start).toString());
    assertEquals(-1, start.getStopIndex());
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
  }

  @Test
  public void contextTest() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new FEELLexer(new ANTLRInputStream()));
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.ContextContext actualContextResult = feelParser.context();

    // Assert
    RecognitionException recognitionException = actualContextResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualContextResult.getParent());
    Token expectedStart = actualContextResult.start;
    Token start = actualContextResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualContextResult.getStop());
    assertTrue(actualContextResult.isEmpty());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    ParserRuleContext actualRuleContext = ((FEELParser) recognizer).getRuleContext();
    assertEquals(0, start.getTokenIndex());
    assertSame(actualContextResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(729, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getStartIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertNull(actualRuleContext);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(-1, recognizer.getState());
  }

  @Test
  public void contextTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BoxedExpressionContext(new ParserRuleContext(), 1)).context());
  }

  @Test
  public void dateTimeLiteralTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleLiteralContext(new ParserRuleContext(), 1)).dateTimeLiteral());
  }

  @Test
  public void dateTimeLiteralTest2() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new FEELLexer(new ANTLRInputStream()));
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.DateTimeLiteralContext actualDateTimeLiteralResult = feelParser.dateTimeLiteral();

    // Assert
    FEELParser.IdentifierContext identifierContext = actualDateTimeLiteralResult.kind;
    RecognitionException recognitionException = actualDateTimeLiteralResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualDateTimeLiteralResult.getParent());
    Token expectedStart = actualDateTimeLiteralResult.start;
    Token start = actualDateTimeLiteralResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(1, actualDateTimeLiteralResult.getChildCount());
    assertNull(actualDateTimeLiteralResult.getStop());
    assertTrue(actualDateTimeLiteralResult.isEmpty());
    assertEquals(-1, start.getType());
    assertEquals(760, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualDateTimeLiteralResult, recognitionException.getCtx());
    assertEquals(759, identifierContext.invokingState);
    assertSame(start, identifierContext.getStart());
    assertEquals(2, identifierContext.depth());
    assertNull(identifierContext.getStop());
    assertSame(feelParser, recognitionException.getRecognizer());
    assertTrue(identifierContext.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getStartIndex());
    assertEquals("[@0,0:-1='<EOF>',<-1>,1:0]", ((CommonToken) start).toString());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(-1, start.getStopIndex());
    boolean actualResultBoolean = ((FEELLexer) start.getTokenSource())._hitEOF;
    assertEquals(0, start.getChannel());
    assertTrue(actualResultBoolean);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
  }

  @Test
  public void disjunctionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionContext(new ParserRuleContext(), 1)).disjunction());
  }

  @Test
  public void endpointTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).endpoint());
  }

  @Test
  public void endpointTest2() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new FEELLexer(new ANTLRInputStream()));
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.EndpointContext actualEndpointResult = feelParser.endpoint();

    // Assert
    RecognitionException recognitionException = actualEndpointResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualEndpointResult.getParent());
    Token expectedStart = actualEndpointResult.start;
    Token start = actualEndpointResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(-1, actualEndpointResult.invokingState);
    assertNull(actualEndpointResult.getStop());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    ParserRuleContext actualRuleContext = ((FEELParser) recognizer).getRuleContext();
    assertEquals("<EOF>", start.getText());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualEndpointResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(233, recognitionException.getOffendingState());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getStartIndex());
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertEquals(-1, recognizer.getState());
    assertNull(actualRuleContext);
  }

  @Test
  public void endpointTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalContext(new ParserRuleContext(), 1)).endpoint(1));
  }

  @Test
  public void endpointTest4() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.IntervalContext(new ParserRuleContext(), 1)).endpoint().size());
  }

  @Test
  public void exponentiationTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).exponentiation(1));
  }

  @Test
  public void exponentiationTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).exponentiation().size());
  }

  @Test
  public void exponentiationTest3() throws RecognitionException {
    // Arrange and Act
    FEELParser.ExponentiationContext actualExponentiationResult = (new FEELParser(
        new BufferedTokenStream(new FEELLexer(new ANTLRInputStream())))).exponentiation();

    // Assert
    FEELParser.ArithmeticNegationContext arithmeticNegationContext = actualExponentiationResult.left;
    assertNull(actualExponentiationResult.getParent());
    Token expectedStart = actualExponentiationResult.start;
    Token start = actualExponentiationResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualExponentiationResult.ast);
    assertNull(actualExponentiationResult.getStop());
    assertEquals(1, actualExponentiationResult.getChildCount());
    assertTrue(actualExponentiationResult.isEmpty());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(472, arithmeticNegationContext.invokingState);
    assertSame(start, arithmeticNegationContext.getStart());
    assertEquals(2, arithmeticNegationContext.depth());
    assertNull(arithmeticNegationContext.getStop());
    assertEquals(0, start.getTokenIndex());
    RecognitionException recognitionException = arithmeticNegationContext.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(0, start.getStartIndex());
    assertEquals(1, start.getLine());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(490, recognitionException.getOffendingState());
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertSame(arithmeticNegationContext, recognitionException.getCtx());
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
  }

  @Test
  public void expressionTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test
  public void expressionTest10() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void expressionTest11() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).expression());
  }

  @Test
  public void expressionTest12() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).expression());
  }

  @Test
  public void expressionTest13() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ListContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test
  public void expressionTest14() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ListContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void expressionTest15() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test
  public void expressionTest16() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void expressionTest17() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test
  public void expressionTest18() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void expressionTest19() throws RecognitionException {
    // Arrange and Act
    FEELParser.ExpressionContext actualExpressionResult = (new FEELParser(
        new BufferedTokenStream(new FEELLexer(new ANTLRInputStream())))).expression();

    // Assert
    FEELParser.TextualExpressionContext textualExpressionContext = actualExpressionResult.textualExpression;
    RecognitionException recognitionException = textualExpressionContext.exception;
    assertNull(actualExpressionResult.ast);
    assertNull(actualExpressionResult.getParent());
    Token expectedStart = actualExpressionResult.start;
    Token start = actualExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualExpressionResult.getStop());
    assertEquals(1, actualExpressionResult.getChildCount());
    assertTrue(actualExpressionResult.isEmpty());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, start.getLine());
    assertEquals(260, textualExpressionContext.invokingState);
    assertNull(textualExpressionContext.getStop());
    assertEquals(2, textualExpressionContext.depth());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getTokenIndex());
    assertSame(start, textualExpressionContext.getStart());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertSame(textualExpressionContext, recognitionException.getCtx());
    assertEquals(289, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
  }

  @Test
  public void expressionTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void expressionTest20() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PositiveUnaryTestContext(new ParserRuleContext(), 1)).expression());
  }

  @Test
  public void expressionTest21() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.IterationDomainContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test
  public void expressionTest22() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IterationDomainContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void expressionTest23() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextEntryContext(new ParserRuleContext(), 1)).expression());
  }

  @Test
  public void expressionTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).expression());
  }

  @Test
  public void expressionTest4() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test
  public void expressionTest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void expressionTest6() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PositionalParametersContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test
  public void expressionTest7() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PositionalParametersContext(new ParserRuleContext(), 1)).expression(1));
  }

  @Test
  public void expressionTest8() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ExpressionRootContext(new ParserRuleContext(), 1)).expression());
  }

  @Test
  public void expressionTest9() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).expression().size());
  }

  @Test
  public void forExpressionTest() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new FEELLexer(new ANTLRInputStream()));
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.ForExpressionContext actualForExpressionResult = feelParser.forExpression();

    // Assert
    RecognitionException recognitionException = actualForExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualForExpressionResult.getParent());
    Token expectedStart = actualForExpressionResult.start;
    Token start = actualForExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualForExpressionResult.getStop());
    assertTrue(actualForExpressionResult.isEmpty());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    assertEquals("<EOF>", start.getText());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualForExpressionResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(327, recognitionException.getOffendingState());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getStartIndex());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getStopIndex());
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertEquals(-1, recognizer.getState());
  }

  @Test
  public void forExpressionTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionContext(new ParserRuleContext(), 1)).forExpression());
  }

  @Test
  public void formalParameterTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).formalParameter().size());
  }

  @Test
  public void formalParameterTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).formalParameter(1));
  }

  @Test
  public void functionDefinitionTest() throws RecognitionException {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(feelLexer);
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.FunctionDefinitionContext actualFunctionDefinitionResult = feelParser.functionDefinition();

    // Assert
    RecognitionException recognitionException = actualFunctionDefinitionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualFunctionDefinitionResult.getParent());
    Token expectedStart = feelLexer._token;
    Token start = actualFunctionDefinitionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualFunctionDefinitionResult.getStop());
    assertTrue(actualFunctionDefinitionResult.isEmpty());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    assertEquals("<EOF>", start.getText());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualFunctionDefinitionResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(293, recognitionException.getOffendingState());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getChannel());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertEquals(-1, recognizer.getState());
  }

  @Test
  public void functionDefinitionTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BoxedExpressionContext(new ParserRuleContext(), 1)).functionDefinition());
  }

  @Test
  public void getATNTest() {
    // Arrange
    FEELParser feelParser = new FEELParser(new BufferedTokenStream(new FEELLexer(new ANTLRInputStream())));

    // Act and Assert
    assertSame(feelParser._ATN, feelParser.getATN());
  }

  @Test
  public void getGrammarFileNameTest() {
    // Arrange, Act and Assert
    assertEquals("FEELParser.g4",
        (new FEELParser(new BufferedTokenStream(new FEELLexer(new ANTLRInputStream())))).getGrammarFileName());
  }

  @Test
  public void getRuleIndexTest() {
    // Arrange, Act and Assert
    assertEquals(39, (new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest10() {
    // Arrange, Act and Assert
    assertEquals(36, (new FEELParser.TypeContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest11() {
    // Arrange, Act and Assert
    assertEquals(26, (new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest12() {
    // Arrange, Act and Assert
    assertEquals(49, (new FEELParser.NumericLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest13() {
    // Arrange, Act and Assert
    assertEquals(16, (new FEELParser.SimpleExpressionsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest14() {
    // Arrange, Act and Assert
    assertEquals(46, (new FEELParser.SimpleLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest15() {
    // Arrange, Act and Assert
    assertEquals(41, (new FEELParser.PositionalParametersContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest16() {
    // Arrange, Act and Assert
    assertEquals(2, (new FEELParser.ExpressionRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest17() {
    // Arrange, Act and Assert
    assertEquals(44, (new FEELParser.QualifiedNameContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest18() {
    // Arrange, Act and Assert
    assertEquals(37, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest19() {
    // Arrange, Act and Assert
    assertEquals(10, (new FEELParser.SimplePositiveUnaryTestsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest2() {
    // Arrange, Act and Assert
    assertEquals(4, (new FEELParser.TextualExpressionsRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest20() {
    // Arrange, Act and Assert
    assertEquals(28, (new FEELParser.ConjunctionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest21() {
    // Arrange, Act and Assert
    assertEquals(27, (new FEELParser.DisjunctionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest22() {
    // Arrange, Act and Assert
    assertEquals(7, (new FEELParser.PositiveUnaryTestsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest23() {
    // Arrange, Act and Assert
    assertEquals(23, (new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest24() {
    // Arrange, Act and Assert
    assertEquals(45, (new FEELParser.LiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest25() {
    // Arrange, Act and Assert
    assertEquals(34, (new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest26() {
    // Arrange, Act and Assert
    assertEquals(52, (new FEELParser.ContextContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest27() {
    // Arrange, Act and Assert
    assertEquals(43, (new FEELParser.SimpleValueContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest28() {
    // Arrange, Act and Assert
    assertEquals(6, (new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest29() {
    // Arrange, Act and Assert
    assertEquals(42, (new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest3() {
    // Arrange, Act and Assert
    assertEquals(38, (new FEELParser.ParametersContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest30() {
    // Arrange, Act and Assert
    assertEquals(33, (new FEELParser.ExponentiationContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest31() {
    // Arrange, Act and Assert
    assertEquals(18, (new FEELParser.ExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest32() {
    // Arrange, Act and Assert
    assertEquals(51, (new FEELParser.ListContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest33() {
    // Arrange, Act and Assert
    assertEquals(29, (new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest34() {
    // Arrange, Act and Assert
    assertEquals(13, (new FEELParser.IntervalStartParContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest35() {
    // Arrange, Act and Assert
    assertEquals(40, (new FEELParser.ParameterNameContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest36() {
    // Arrange, Act and Assert
    assertEquals(17, (new FEELParser.SimpleExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest37() {
    // Arrange, Act and Assert
    assertEquals(22, (new FEELParser.FormalParameterContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest38() {
    // Arrange, Act and Assert
    assertEquals(19, (new FEELParser.TextualExpressionsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest39() {
    // Arrange, Act and Assert
    assertEquals(35, (new FEELParser.InstanceOfContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest4() {
    // Arrange, Act and Assert
    assertEquals(9, (new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest40() {
    // Arrange, Act and Assert
    assertEquals(15, (new FEELParser.EndpointContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest41() {
    // Arrange, Act and Assert
    assertEquals(3, (new FEELParser.SimpleExpressionsRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest42() {
    // Arrange, Act and Assert
    assertEquals(25, (new FEELParser.IfExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest43() {
    // Arrange, Act and Assert
    assertEquals(55, (new FEELParser.DateTimeLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest44() {
    // Arrange, Act and Assert
    assertEquals(30, (new FEELParser.ArithmeticExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest45() {
    // Arrange, Act and Assert
    assertEquals(5, (new FEELParser.BoxedExpressionRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest46() {
    // Arrange, Act and Assert
    assertEquals(14, (new FEELParser.IntervalEndParContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest47() {
    // Arrange, Act and Assert
    assertEquals(20, (new FEELParser.TextualExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest48() {
    // Arrange, Act and Assert
    assertEquals(8, (new FEELParser.PositiveUnaryTestContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest49() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.UnaryTestsRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest5() {
    // Arrange, Act and Assert
    assertEquals(32, (new FEELParser.MultiplicationContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest50() {
    // Arrange, Act and Assert
    assertEquals(54, (new FEELParser.KeyContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest51() {
    // Arrange, Act and Assert
    assertEquals(24, (new FEELParser.IterationDomainContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest52() {
    // Arrange, Act and Assert
    assertEquals(12, (new FEELParser.IntervalContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest53() {
    // Arrange, Act and Assert
    assertEquals(50, (new FEELParser.BoxedExpressionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest54() {
    // Arrange, Act and Assert
    assertEquals(47, (new FEELParser.StringLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest55() {
    // Arrange, Act and Assert
    assertEquals(48, (new FEELParser.BooleanLiteralContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest56() {
    // Arrange, Act and Assert
    assertEquals(53, (new FEELParser.ContextEntryContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest57() {
    // Arrange, Act and Assert
    assertEquals(56, (new FEELParser.IdentifierContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest6() {
    // Arrange, Act and Assert
    assertEquals(11, (new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest7() {
    // Arrange, Act and Assert
    assertEquals(21, (new FEELParser.FunctionDefinitionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest8() {
    // Arrange, Act and Assert
    assertEquals(31, (new FEELParser.AdditionContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleIndexTest9() {
    // Arrange, Act and Assert
    assertEquals(1, (new FEELParser.SimpleUnaryTestsRootContext(new ParserRuleContext(), 1)).getRuleIndex());
  }

  @Test
  public void getRuleNamesTest() {
    // Arrange
    FEELParser feelParser = new FEELParser(new BufferedTokenStream(new FEELLexer(new ANTLRInputStream())));

    // Act
    String[] actualRuleNames = feelParser.getRuleNames();

    // Assert
    assertSame(feelParser.ruleNames, actualRuleNames);
    assertEquals(57, actualRuleNames.length);
    assertEquals("unaryTestsRoot", actualRuleNames[0]);
    assertEquals("simpleUnaryTestsRoot", actualRuleNames[1]);
    assertEquals("expressionRoot", actualRuleNames[2]);
    assertEquals("simpleExpressionsRoot", actualRuleNames[3]);
    assertEquals("textualExpressionsRoot", actualRuleNames[4]);
    assertEquals("boxedExpressionRoot", actualRuleNames[5]);
    assertEquals("list", actualRuleNames[51]);
    assertEquals("context", actualRuleNames[52]);
    assertEquals("contextEntry", actualRuleNames[53]);
    assertEquals("key", actualRuleNames[54]);
    assertEquals("dateTimeLiteral", actualRuleNames[55]);
    assertEquals("identifier", actualRuleNames[56]);
  }

  @Test
  public void getTokenNamesTest() {
    // Arrange
    FEELParser feelParser = new FEELParser(new BufferedTokenStream(new FEELLexer(new ANTLRInputStream())));

    // Act
    String[] actualTokenNames = feelParser.getTokenNames();

    // Assert
    assertSame(feelParser.tokenNames, actualTokenNames);
    assertEquals(48, actualTokenNames.length);
    assertEquals("<INVALID>", actualTokenNames[0]);
    assertEquals("BLOCK_COMMENT", actualTokenNames[1]);
    assertEquals("LINE_COMMENT", actualTokenNames[2]);
    assertEquals("WS", actualTokenNames[3]);
    assertEquals("STRING", actualTokenNames[4]);
    assertEquals("NUMBER", actualTokenNames[5]);
    assertEquals("'satisfies'", actualTokenNames[42]);
    assertEquals("'and'", actualTokenNames[43]);
    assertEquals("'or'", actualTokenNames[44]);
    assertEquals("'between'", actualTokenNames[45]);
    assertEquals("'instance of'", actualTokenNames[46]);
    assertEquals("NAME", actualTokenNames[47]);
  }

  @Test
  public void getVocabularyTest() {
    // Arrange
    FEELParser feelParser = new FEELParser(new BufferedTokenStream(new FEELLexer(new ANTLRInputStream())));

    // Act and Assert
    assertSame(feelParser.VOCABULARY, feelParser.getVocabulary());
  }

  @Test
  public void identifierTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void identifierTest10() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).identifier().size());
  }

  @Test
  public void identifierTest11() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void identifierTest12() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ParameterNameContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void identifierTest13() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DateTimeLiteralContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void identifierTest14() throws RecognitionException {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(feelLexer);
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.IdentifierContext actualIdentifierResult = feelParser.identifier();

    // Assert
    RecognitionException recognitionException = actualIdentifierResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualIdentifierResult.getParent());
    Token expectedStart = feelLexer._token;
    Token start = actualIdentifierResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualIdentifierResult.getStop());
    assertTrue(actualIdentifierResult.isEmpty());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    ParserRuleContext actualRuleContext = ((FEELParser) recognizer).getRuleContext();
    assertEquals(0, start.getTokenIndex());
    assertSame(actualIdentifierResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(773, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getStartIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertNull(actualRuleContext);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(-1, recognizer.getState());
  }

  @Test
  public void identifierTest15() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.KeyContext(new ParserRuleContext(), 1)).identifier());
  }

  @Test
  public void identifierTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TypeContext(new ParserRuleContext(), 1)).identifier().size());
  }

  @Test
  public void identifierTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void identifierTest4() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.QuantifiedExpressionContext(new ParserRuleContext(), 1)).identifier().size());
  }

  @Test
  public void identifierTest5() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.QualifiedNameContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void identifierTest6() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.QualifiedNameContext(new ParserRuleContext(), 1)).identifier().size());
  }

  @Test
  public void identifierTest7() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void identifierTest8() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).identifier().size());
  }

  @Test
  public void identifierTest9() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).identifier(1));
  }

  @Test
  public void ifExpressionTest() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new FEELLexer(new ANTLRInputStream()));
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.IfExpressionContext actualIfExpressionResult = feelParser.ifExpression();

    // Assert
    RecognitionException recognitionException = actualIfExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualIfExpressionResult.getParent());
    Token expectedStart = actualIfExpressionResult.start;
    Token start = actualIfExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(-1, actualIfExpressionResult.invokingState);
    assertNull(actualIfExpressionResult.getStop());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualIfExpressionResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals("<EOF>", start.getText());
    assertEquals(1, start.getLine());
    assertEquals(357, recognitionException.getOffendingState());
    assertEquals(0, start.getTokenIndex());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertEquals(-1, recognizer.getState());
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
  }

  @Test
  public void ifExpressionTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionContext(new ParserRuleContext(), 1)).ifExpression());
  }

  @Test
  public void instanceOfTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ArithmeticNegationContext(new ParserRuleContext(), 1)).instanceOf());
  }

  @Test
  public void intervalEndParTest() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new FEELLexer(new ANTLRInputStream()));
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.IntervalEndParContext actualIntervalEndParResult = feelParser.intervalEndPar();

    // Assert
    RecognitionException recognitionException = actualIntervalEndParResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualIntervalEndParResult.getParent());
    Token expectedStart = actualIntervalEndParResult.start;
    Token start = actualIntervalEndParResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualIntervalEndParResult.getStop());
    assertTrue(actualIntervalEndParResult.isEmpty());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    ParserRuleContext actualRuleContext = ((FEELParser) recognizer).getRuleContext();
    assertEquals(0, start.getTokenIndex());
    assertSame(actualIntervalEndParResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(230, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getStartIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertNull(actualRuleContext);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(-1, recognizer.getState());
  }

  @Test
  public void intervalEndParTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalContext(new ParserRuleContext(), 1)).intervalEndPar());
  }

  @Test
  public void intervalStartParTest() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new FEELLexer(new ANTLRInputStream()));
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.IntervalStartParContext actualIntervalStartParResult = feelParser.intervalStartPar();

    // Assert
    RecognitionException recognitionException = actualIntervalStartParResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualIntervalStartParResult.getParent());
    Token expectedStart = actualIntervalStartParResult.start;
    Token start = actualIntervalStartParResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualIntervalStartParResult.getStop());
    assertTrue(actualIntervalStartParResult.isEmpty());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    ParserRuleContext actualRuleContext = ((FEELParser) recognizer).getRuleContext();
    assertEquals(0, start.getTokenIndex());
    assertSame(actualIntervalStartParResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(222, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getStartIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertNull(actualRuleContext);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(-1, recognizer.getState());
  }

  @Test
  public void intervalStartParTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.IntervalContext(new ParserRuleContext(), 1)).intervalStartPar());
  }

  @Test
  public void intervalTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestContext(new ParserRuleContext(), 1)).interval());
  }

  @Test
  public void intervalTest2() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new FEELLexer(new ANTLRInputStream()));
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.IntervalContext actualIntervalResult = feelParser.interval();

    // Assert
    RecognitionException recognitionException = actualIntervalResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualIntervalResult.getParent());
    Token expectedStart = actualIntervalResult.start;
    Token start = actualIntervalResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(-1, actualIntervalResult.invokingState);
    FEELParser.IntervalStartParContext intervalStartParContext = actualIntervalResult.leftPar;
    FEELParser.EndpointContext endpointContext = actualIntervalResult.ep1;
    assertNull(actualIntervalResult.getStop());
    assertEquals("", actualIntervalResult.getText());
    assertEquals(2, actualIntervalResult.getChildCount());
    assertEquals("([] [209] ([210] [235 210]))", actualIntervalResult.toStringTree());
    assertEquals(-1, start.getType());
    assertEquals(209, intervalStartParContext.invokingState);
    assertSame(start, intervalStartParContext.getStart());
    assertEquals(2, intervalStartParContext.depth());
    assertNull(intervalStartParContext.getStop());
    assertEquals(210, endpointContext.invokingState);
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(feelParser, recognitionException.getRecognizer());
    FEELParser.SimpleValueContext simpleValueContext = endpointContext.opd;
    assertTrue(intervalStartParContext.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(211, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualIntervalResult, recognitionException.getCtx());
    assertEquals("[@0,0:-1='<EOF>',<-1>,1:0]", ((CommonToken) start).toString());
    assertEquals(0, start.getChannel());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertNull(endpointContext.ast);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertEquals(235, simpleValueContext.invokingState);
    assertTrue(simpleValueContext.exception instanceof org.antlr.v4.runtime.NoViableAltException);
  }

  @Test
  public void iterationDomainTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).iterationDomain(1));
  }

  @Test
  public void iterationDomainTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.ForExpressionContext(new ParserRuleContext(), 1)).iterationDomain().size());
  }

  @Test
  public void keyTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ContextEntryContext(new ParserRuleContext(), 1)).key());
  }

  @Test
  public void listTest() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new FEELLexer(new ANTLRInputStream()));
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.ListContext actualListResult = feelParser.list();

    // Assert
    RecognitionException recognitionException = actualListResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualListResult.getParent());
    Token expectedStart = actualListResult.start;
    Token start = actualListResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualListResult.getStop());
    assertTrue(actualListResult.isEmpty());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    assertEquals(0, start.getTokenIndex());
    assertSame(actualListResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(711, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertEquals(-1, recognizer.getState());
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
  }

  @Test
  public void listTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.BoxedExpressionContext(new ParserRuleContext(), 1)).list());
  }

  @Test
  public void literalTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).literal());
  }

  @Test
  public void literalTest2() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new FEELLexer(new ANTLRInputStream()));
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.LiteralContext actualLiteralResult = feelParser.literal();

    // Assert
    RecognitionException recognitionException = actualLiteralResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualLiteralResult.getParent());
    Token expectedStart = actualLiteralResult.start;
    Token start = actualLiteralResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualLiteralResult.getStop());
    assertTrue(actualLiteralResult.isEmpty());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    ParserRuleContext actualRuleContext = ((FEELParser) recognizer).getRuleContext();
    assertEquals(0, start.getTokenIndex());
    assertSame(actualLiteralResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(671, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getStartIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertNull(actualRuleContext);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(-1, recognizer.getState());
  }

  @Test
  public void multiplicationTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.AdditionContext(new ParserRuleContext(), 1)).multiplication(1));
  }

  @Test
  public void multiplicationTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.AdditionContext(new ParserRuleContext(), 1)).multiplication().size());
  }

  @Test
  public void multiplicationTest3() throws RecognitionException {
    // Arrange and Act
    FEELParser.MultiplicationContext actualMultiplicationResult = (new FEELParser(
        new BufferedTokenStream(new FEELLexer(new ANTLRInputStream())))).multiplication();

    // Assert
    assertNull(actualMultiplicationResult.ast);
    assertEquals(1, actualMultiplicationResult.depth());
    assertEquals(-1, actualMultiplicationResult.invokingState);
    Token expectedStart = actualMultiplicationResult.start;
    Token start = actualMultiplicationResult.getStart();
    assertSame(expectedStart, start);
    FEELParser.ExponentiationContext exponentiationContext = actualMultiplicationResult.left;
    assertEquals(1, actualMultiplicationResult.getChildCount());
    assertNull(actualMultiplicationResult.getStop());
    assertEquals("([458] [472 458])", exponentiationContext.toStringTree());
    assertSame(start, exponentiationContext.getStart());
    assertEquals(2, exponentiationContext.depth());
    assertFalse(exponentiationContext.isEmpty());
    assertNull(exponentiationContext.getStop());
    assertEquals(1, exponentiationContext.getChildCount());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getChannel());
    assertEquals(0, start.getTokenIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getStartIndex());
    FEELParser.ArithmeticNegationContext arithmeticNegationContext = exponentiationContext.left;
    assertNull(exponentiationContext.ast);
    assertEquals(-1, start.getType());
    assertEquals(472, arithmeticNegationContext.invokingState);
    assertEquals(-1, ((FEELLexer) start.getTokenSource()).getType());
    assertTrue(arithmeticNegationContext.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
  }

  @Test
  public void namedParametersTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ParametersContext(new ParserRuleContext(), 1)).namedParameters());
  }

  @Test
  public void namedParametersTest2() throws RecognitionException {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(feelLexer);
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.NamedParametersContext actualNamedParametersResult = feelParser.namedParameters();

    // Assert
    RecognitionException recognitionException = actualNamedParametersResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualNamedParametersResult.getParent());
    Token expectedStart = feelLexer._token;
    Token start = actualNamedParametersResult.getStart();
    assertSame(expectedStart, start);
    FEELParser.ParameterNameContext parameterNameContext = actualNamedParametersResult.name;
    assertNull(actualNamedParametersResult.getStop());
    assertEquals(1, actualNamedParametersResult.getChildCount());
    assertTrue(actualNamedParametersResult.isEmpty());
    assertEquals("([589] [606 589])", parameterNameContext.toStringTree());
    assertSame(start, parameterNameContext.getStart());
    assertEquals(2, parameterNameContext.depth());
    assertFalse(parameterNameContext.isEmpty());
    assertNull(parameterNameContext.getStop());
    FEELParser.IdentifierContext identifierResult = parameterNameContext.identifier();
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(1, parameterNameContext.getChildCount());
    assertSame(actualNamedParametersResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(feelParser, recognitionException.getRecognizer());
    assertEquals(590, recognitionException.getOffendingState());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertEquals("", parameterNameContext.ast);
    assertEquals(0, start.getChannel());
    TokenSource tokenSource = start.getTokenSource();
    assertSame(feelLexer, tokenSource);
    assertSame(identifierResult, parameterNameContext.name);
    boolean actualResultBoolean = ((FEELLexer) tokenSource)._hitEOF;
    assertEquals(-1, start.getType());
    assertTrue(actualResultBoolean);
    assertEquals(0, ((FEELLexer) tokenSource)._tokenStartCharPositionInLine);
    assertNull(((FEELLexer) tokenSource)._text);
    assertEquals(0, ((FEELLexer) tokenSource)._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) tokenSource)._tokenStartLine);
    assertTrue(identifierResult.exception instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(606, identifierResult.invokingState);
  }

  @Test
  public void numericLiteralTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleLiteralContext(new ParserRuleContext(), 1)).numericLiteral());
  }

  @Test
  public void parameterNameTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).parameterName(1));
  }

  @Test
  public void parameterNameTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.NamedParametersContext(new ParserRuleContext(), 1)).parameterName().size());
  }

  @Test
  public void parameterNameTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FormalParameterContext(new ParserRuleContext(), 1)).parameterName());
  }

  @Test
  public void parametersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).parameters().size());
  }

  @Test
  public void parametersTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).parameters(1));
  }

  @Test
  public void positionalParametersTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ParametersContext(new ParserRuleContext(), 1)).positionalParameters());
  }

  @Test
  public void positiveUnaryTestTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.PositiveUnaryTestsContext(new ParserRuleContext(), 1)).positiveUnaryTest().size());
  }

  @Test
  public void positiveUnaryTestTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PositiveUnaryTestsContext(new ParserRuleContext(), 1)).positiveUnaryTest(1));
  }

  @Test
  public void positiveUnaryTestTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).positiveUnaryTest());
  }

  @Test
  public void positiveUnaryTestsTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsContext(new ParserRuleContext(), 1)).positiveUnaryTests());
  }

  @Test
  public void positiveUnaryTestsTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ComparisonContext(new ParserRuleContext(), 1)).positiveUnaryTests());
  }

  @Test
  public void postfixExpressionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.InstanceOfContext(new ParserRuleContext(), 1)).postfixExpression());
  }

  @Test
  public void postfixExpressionTest2() throws RecognitionException {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());

    // Act
    FEELParser.PostfixExpressionContext actualPostfixExpressionResult = (new FEELParser(
        new BufferedTokenStream(feelLexer))).postfixExpression();

    // Assert
    FEELParser.PrimaryExpressionContext primaryExpressionContext = actualPostfixExpressionResult.primaryExpression;
    RecognitionException recognitionException = primaryExpressionContext.exception;
    assertNull(actualPostfixExpressionResult.getParent());
    Token expectedStart = feelLexer._token;
    Token start = actualPostfixExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualPostfixExpressionResult.getStop());
    assertEquals(1, actualPostfixExpressionResult.getChildCount());
    assertTrue(actualPostfixExpressionResult.isEmpty());
    assertNull(actualPostfixExpressionResult.ast);
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    assertEquals(557, primaryExpressionContext.invokingState);
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(primaryExpressionContext.getStop());
    assertSame(start, primaryExpressionContext.getStart());
    assertEquals(2, primaryExpressionContext.depth());
    assertEquals(0, start.getStartIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getTokenIndex());
    assertEquals(-1, start.getStopIndex());
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(-1, ((FEELLexer) start.getTokenSource()).getType());
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertEquals(0, ((FEELLexer) start.getTokenSource()).getChannel());
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
  }

  @Test
  public void primaryExpressionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PostfixExpressionContext(new ParserRuleContext(), 1)).primaryExpression());
  }

  @Test
  public void primaryExpressionTest2() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new FEELLexer(new ANTLRInputStream()));
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.PrimaryExpressionContext actualPrimaryExpressionResult = feelParser.primaryExpression();

    // Assert
    RecognitionException recognitionException = actualPrimaryExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualPrimaryExpressionResult.getParent());
    Token expectedStart = actualPrimaryExpressionResult.start;
    Token start = actualPrimaryExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(-1, actualPrimaryExpressionResult.invokingState);
    assertNull(actualPrimaryExpressionResult.getStop());
    assertEquals(-1, start.getType());
    assertEquals("<EOF>", start.getText());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(642, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(0, start.getTokenIndex());
    assertSame(feelParser, recognitionException.getRecognizer());
    assertSame(actualPrimaryExpressionResult, recognitionException.getCtx());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getChannel());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getStopIndex());
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
  }

  @Test
  public void qualifiedNameTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void qualifiedNameTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleValueContext(new ParserRuleContext(), 1)).qualifiedName());
  }

  @Test
  public void quantifiedExpressionTest() throws RecognitionException {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(feelLexer);
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.QuantifiedExpressionContext actualQuantifiedExpressionResult = feelParser.quantifiedExpression();

    // Assert
    RecognitionException recognitionException = actualQuantifiedExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualQuantifiedExpressionResult.getParent());
    Token expectedStart = feelLexer._token;
    Token start = actualQuantifiedExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualQuantifiedExpressionResult.getStop());
    assertTrue(actualQuantifiedExpressionResult.isEmpty());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    assertEquals(1, start.getLine());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(368, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(actualQuantifiedExpressionResult, recognitionException.getCtx());
    assertEquals(0, start.getTokenIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getChannel());
    assertEquals(0, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(-1, start.getType());
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertEquals(-1, recognizer.getState());
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
  }

  @Test
  public void quantifiedExpressionTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionContext(new ParserRuleContext(), 1)).quantifiedExpression());
  }

  @Test
  public void simpleExpressionTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.SimpleExpressionsContext(new ParserRuleContext(), 1)).simpleExpression().size());
  }

  @Test
  public void simpleExpressionTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionsContext(new ParserRuleContext(), 1)).simpleExpression(1));
  }

  @Test
  public void simpleExpressionTest3() throws RecognitionException {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(feelLexer);
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.SimpleExpressionContext actualSimpleExpressionResult = feelParser.simpleExpression();

    // Assert
    RecognitionException recognitionException = actualSimpleExpressionResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualSimpleExpressionResult.getParent());
    Token expectedStart = feelLexer._token;
    Token start = actualSimpleExpressionResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualSimpleExpressionResult.getStop());
    assertTrue(actualSimpleExpressionResult.isEmpty());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    ParserRuleContext actualRuleContext = ((FEELParser) recognizer).getRuleContext();
    assertEquals(0, start.getTokenIndex());
    assertSame(actualSimpleExpressionResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(258, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getStartIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertNull(actualRuleContext);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(-1, recognizer.getState());
  }

  @Test
  public void simpleExpressionsTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionsRootContext(new ParserRuleContext(), 1)).simpleExpressions());
  }

  @Test
  public void simpleLiteralTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.LiteralContext(new ParserRuleContext(), 1)).simpleLiteral());
  }

  @Test
  public void simpleLiteralTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleValueContext(new ParserRuleContext(), 1)).simpleLiteral());
  }

  @Test
  public void simpleLiteralTest3() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new FEELLexer(new ANTLRInputStream()));
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.SimpleLiteralContext actualSimpleLiteralResult = feelParser.simpleLiteral();

    // Assert
    RecognitionException recognitionException = actualSimpleLiteralResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualSimpleLiteralResult.getParent());
    Token expectedStart = actualSimpleLiteralResult.start;
    Token start = actualSimpleLiteralResult.getStart();
    assertSame(expectedStart, start);
    assertEquals(-1, actualSimpleLiteralResult.invokingState);
    assertNull(actualSimpleLiteralResult.getStop());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    ParserRuleContext actualRuleContext = ((FEELParser) recognizer).getRuleContext();
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualSimpleLiteralResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals("<EOF>", start.getText());
    assertEquals(1, start.getLine());
    assertEquals(685, recognitionException.getOffendingState());
    assertEquals(0, start.getTokenIndex());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getStartIndex());
    assertEquals(0, start.getCharPositionInLine());
    boolean actualResultBoolean = ((FEELLexer) start.getTokenSource())._hitEOF;
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertTrue(actualResultBoolean);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertEquals(-1, recognizer.getState());
    assertNull(actualRuleContext);
  }

  @Test
  public void simplePositiveUnaryTestTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimplePositiveUnaryTestsContext(new ParserRuleContext(), 1)).simplePositiveUnaryTest(1));
  }

  @Test
  public void simplePositiveUnaryTestTest2() {
    // Arrange, Act and Assert
    assertEquals(0,
        (new FEELParser.SimplePositiveUnaryTestsContext(new ParserRuleContext(), 1)).simplePositiveUnaryTest().size());
  }

  @Test
  public void simplePositiveUnaryTestTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.PrimaryExpressionContext(new ParserRuleContext(), 1)).simplePositiveUnaryTest());
  }

  @Test
  public void simplePositiveUnaryTestTest4() throws RecognitionException {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(feelLexer);
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.SimplePositiveUnaryTestContext actualSimplePositiveUnaryTestResult = feelParser
        .simplePositiveUnaryTest();

    // Assert
    RecognitionException recognitionException = actualSimplePositiveUnaryTestResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(1, actualSimplePositiveUnaryTestResult.depth());
    assertEquals(-1, actualSimplePositiveUnaryTestResult.invokingState);
    Token expectedStart = feelLexer._token;
    Token start = actualSimplePositiveUnaryTestResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualSimplePositiveUnaryTestResult.getStop());
    assertEquals(0, start.getTokenIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(-1, start.getStopIndex());
    assertSame(feelParser, recognitionException.getRecognizer());
    assertEquals(0, start.getStartIndex());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(-1, start.getType());
    assertEquals(0, start.getCharPositionInLine());
    assertSame(actualSimplePositiveUnaryTestResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(0, start.getChannel());
    assertEquals(207, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
  }

  @Test
  public void simplePositiveUnaryTestsTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsContext(new ParserRuleContext(), 1)).simplePositiveUnaryTests());
  }

  @Test
  public void simpleUnaryTestsTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleUnaryTestsRootContext(new ParserRuleContext(), 1)).simpleUnaryTests());
  }

  @Test
  public void simpleUnaryTestsTest2() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new FEELLexer(new ANTLRInputStream()));
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.SimpleUnaryTestsContext actualSimpleUnaryTestsResult = feelParser.simpleUnaryTests();

    // Assert
    RecognitionException recognitionException = actualSimpleUnaryTestsResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualSimpleUnaryTestsResult.invokingState);
    assertNull(actualSimpleUnaryTestsResult.getParent());
    Token expectedStart = actualSimpleUnaryTestsResult.start;
    Token start = actualSimpleUnaryTestsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualSimpleUnaryTestsResult.getStop());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    ParserRuleContext actualRuleContext = ((FEELParser) recognizer).getRuleContext();
    assertEquals(0, start.getTokenIndex());
    assertSame(actualSimpleUnaryTestsResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(179, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getStartIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertNull(actualRuleContext);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(-1, recognizer.getState());
  }

  @Test
  public void simpleValueTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleExpressionContext(new ParserRuleContext(), 1)).simpleValue());
  }

  @Test
  public void simpleValueTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.EndpointContext(new ParserRuleContext(), 1)).simpleValue());
  }

  @Test
  public void simpleValueTest3() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new FEELLexer(new ANTLRInputStream()));
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.SimpleValueContext actualSimpleValueResult = feelParser.simpleValue();

    // Assert
    RecognitionException recognitionException = actualSimpleValueResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualSimpleValueResult.getParent());
    Token expectedStart = actualSimpleValueResult.start;
    Token start = actualSimpleValueResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualSimpleValueResult.getStop());
    assertTrue(actualSimpleValueResult.isEmpty());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    ParserRuleContext actualRuleContext = ((FEELParser) recognizer).getRuleContext();
    assertEquals("<EOF>", start.getText());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertSame(actualSimpleValueResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(650, recognitionException.getOffendingState());
    assertEquals(0, start.getTokenIndex());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(0, start.getStartIndex());
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertEquals(-1, recognizer.getState());
    assertNull(actualRuleContext);
  }

  @Test
  public void stringLiteralTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.SimpleLiteralContext(new ParserRuleContext(), 1)).stringLiteral());
  }

  @Test
  public void stringLiteralTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.DateTimeLiteralContext(new ParserRuleContext(), 1)).stringLiteral());
  }

  @Test
  public void stringLiteralTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.KeyContext(new ParserRuleContext(), 1)).stringLiteral());
  }

  @Test
  public void textualExpressionTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.ExpressionContext(new ParserRuleContext(), 1)).textualExpression());
  }

  @Test
  public void textualExpressionTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionsContext(new ParserRuleContext(), 1)).textualExpression(1));
  }

  @Test
  public void textualExpressionTest3() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TextualExpressionsContext(new ParserRuleContext(), 1)).textualExpression().size());
  }

  @Test
  public void textualExpressionsTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TextualExpressionsRootContext(new ParserRuleContext(), 1)).textualExpressions());
  }

  @Test
  public void typeTest() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.TypeContext(new ParserRuleContext(), 1)).type(1));
  }

  @Test
  public void typeTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new FEELParser.TypeContext(new ParserRuleContext(), 1)).type().size());
  }

  @Test
  public void typeTest3() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.FormalParameterContext(new ParserRuleContext(), 1)).type());
  }

  @Test
  public void typeTest4() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.InstanceOfContext(new ParserRuleContext(), 1)).type());
  }

  @Test
  public void typeTest5() throws RecognitionException {
    // Arrange
    FEELLexer feelLexer = new FEELLexer(new ANTLRInputStream());
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(feelLexer);
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.TypeContext actualTypeResult = feelParser.type();

    // Assert
    RecognitionException recognitionException = actualTypeResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertEquals(-1, actualTypeResult.invokingState);
    assertNull(actualTypeResult.getParent());
    Token expectedStart = feelLexer._token;
    Token start = actualTypeResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualTypeResult.getStop());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(0, start.getTokenIndex());
    assertEquals(555, recognitionException.getOffendingState());
    assertSame(start, recognitionException.getOffendingToken());
    assertEquals(1, start.getLine());
    assertSame(actualTypeResult, recognitionException.getCtx());
    assertEquals("<EOF>", start.getText());
    assertSame(feelParser, recognitionException.getRecognizer());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertEquals(0, start.getChannel());
    assertEquals(0, start.getStartIndex());
    assertEquals(-1, start.getType());
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
  }

  @Test
  public void unaryTestsTest() throws RecognitionException {
    // Arrange
    BufferedTokenStream bufferedTokenStream = new BufferedTokenStream(new FEELLexer(new ANTLRInputStream()));
    FEELParser feelParser = new FEELParser(bufferedTokenStream);

    // Act
    FEELParser.UnaryTestsContext actualUnaryTestsResult = feelParser.unaryTests();

    // Assert
    RecognitionException recognitionException = actualUnaryTestsResult.exception;
    assertTrue(recognitionException instanceof org.antlr.v4.runtime.InputMismatchException);
    assertNull(actualUnaryTestsResult.getParent());
    Token expectedStart = actualUnaryTestsResult.start;
    Token start = actualUnaryTestsResult.getStart();
    assertSame(expectedStart, start);
    assertNull(actualUnaryTestsResult.getStop());
    assertTrue(actualUnaryTestsResult.isEmpty());
    assertEquals(0, start.getChannel());
    assertEquals(-1, start.getType());
    Recognizer<?, ?> recognizer = recognitionException.getRecognizer();
    assertSame(feelParser, recognizer);
    ParserRuleContext actualRuleContext = ((FEELParser) recognizer).getRuleContext();
    assertEquals(0, start.getTokenIndex());
    assertSame(actualUnaryTestsResult, recognitionException.getCtx());
    assertSame(start, recognitionException.getOffendingToken());
    assertSame(bufferedTokenStream, recognitionException.getInputStream());
    assertEquals(149, recognitionException.getOffendingState());
    assertEquals(1, start.getLine());
    assertEquals(0, start.getStartIndex());
    assertEquals("<EOF>", start.getText());
    assertEquals(0, start.getCharPositionInLine());
    assertEquals(-1, start.getStopIndex());
    assertNull(((FEELLexer) start.getTokenSource())._text);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharIndex);
    assertEquals(1, ((FEELLexer) start.getTokenSource())._tokenStartLine);
    assertTrue(((FEELLexer) start.getTokenSource())._hitEOF);
    assertNull(actualRuleContext);
    assertEquals(0, ((FEELLexer) start.getTokenSource())._tokenStartCharPositionInLine);
    assertEquals(-1, recognizer.getState());
  }

  @Test
  public void unaryTestsTest2() {
    // Arrange, Act and Assert
    assertNull((new FEELParser.UnaryTestsRootContext(new ParserRuleContext(), 1)).unaryTests());
  }
}

