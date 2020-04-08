package com.gs.dmn.feel.analysis.semantics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.BooleanType;
import com.gs.dmn.feel.analysis.semantics.type.ListType;
import com.gs.dmn.feel.analysis.semantics.type.NullType;
import com.gs.dmn.feel.analysis.semantics.type.NumberType;
import com.gs.dmn.feel.analysis.semantics.type.StringType;
import com.gs.dmn.feel.analysis.semantics.type.TupleType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Iterator;
import com.gs.dmn.feel.analysis.syntax.ast.expression.PathExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.RangeIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.ArithmeticNegation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Exponentiation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.BetweenExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntryKey;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameters;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.PositionalParameters;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.BooleanLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.ListLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NullLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.StringLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.Conjunction;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.Disjunction;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.LogicNegation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.IfExpression;
import com.gs.dmn.feel.analysis.syntax.ast.test.Any;
import com.gs.dmn.feel.analysis.syntax.ast.test.ExpressionTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.NegatedPositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.NegatedSimplePositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.NullTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.RangeTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTests;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;

public class FEELSemanticVisitorDiffblueTest {
  @Test
  public void testVisit() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeTest rangeTest = new RangeTest(true, new StringLiteral("value"), true, new StringLiteral("value"));

    // Act and Assert
    assertSame(rangeTest, feelSemanticVisitor.visit(rangeTest, FEELContext.makeContext(null)));
    assertTrue(((RangeTest) feelSemanticVisitor.visit(rangeTest, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    assertTrue(((RangeTest) feelSemanticVisitor.visit(rangeTest, FEELContext.makeContext(null))).getEnd()
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
  }

  @Test
  public void testVisit10() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation logicNegation = new LogicNegation(new BooleanLiteral("value"));

    // Act and Assert
    assertSame(logicNegation, feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)));
    Type actualType = ((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)))
        .getLeftOperand().getType();
    Type type = ((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit11() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation logicNegation = new LogicNegation(new NullLiteral());

    // Act and Assert
    assertSame(logicNegation, feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)));
    Type type = ((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)))
        .getLeftOperand().getType();
    assertTrue(((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }

  @Test
  public void testVisit12() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation logicNegation = new LogicNegation(new NumericLiteral("value"));

    // Act and Assert
    assertSame(logicNegation, feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)));
    Type type = ((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)))
        .getLeftOperand().getType();
    assertTrue(((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
  }

  @Test
  public void testVisit13() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation logicNegation = new LogicNegation(new NullTest());

    // Act and Assert
    assertSame(logicNegation, feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)));
    Type actualType = ((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)))
        .getLeftOperand().getType();
    Type type = ((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit14() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation logicNegation = new LogicNegation(new Any());

    // Act and Assert
    assertSame(logicNegation, feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)));
    Type actualType = ((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)))
        .getLeftOperand().getType();
    Type type = ((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit15() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    LogicNegation logicNegation = new LogicNegation(new ListLiteral(expressionList));

    // Act and Assert
    assertSame(logicNegation, feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)));
    Expression leftOperand = ((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)))
        .getLeftOperand();
    List<Expression> expressionList1 = ((ListLiteral) leftOperand).getExpressionList();
    assertTrue(((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    Type type = leftOperand.getType();
    assertTrue(type instanceof ListType);
    Type elementType = ((ListType) type).getElementType();
    Expression getResult = expressionList1.get(0);
    assertFalse(type.isValid());
    assertSame(elementType, getResult.getType());
    assertEquals("TupleType()", elementType.toString());
  }

  @Test
  public void testVisit16() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<Expression> expressionList = new ArrayList<Expression>(1);
    expressionList.add(new ExpressionList());
    expressionList.add(new ExpressionList());
    LogicNegation logicNegation = new LogicNegation(new ListLiteral(expressionList));

    // Act and Assert
    assertSame(logicNegation, feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)));
    Expression leftOperand = ((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)))
        .getLeftOperand();
    List<Expression> expressionList1 = ((ListLiteral) leftOperand).getExpressionList();
    assertTrue(((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    Type type = leftOperand.getType();
    assertTrue(type instanceof ListType);
    Type elementType = ((ListType) type).getElementType();
    Expression getResult = expressionList1.get(0);
    Expression getResult1 = expressionList1.get(1);
    assertFalse(type.isValid());
    Type actualType = getResult.getType();
    String actualToStringResult = elementType.toString();
    Type type1 = getResult1.getType();
    assertTrue(type1 instanceof TupleType);
    assertEquals("TupleType()", actualToStringResult);
    assertSame(elementType, actualType);
    assertEquals("TupleType()", type1.toString());
  }

  @Test
  public void testVisit17() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    NumericLiteral numericLiteral = new NumericLiteral("value");

    // Act and Assert
    assertSame(numericLiteral, feelSemanticVisitor.visit(numericLiteral, FEELContext.makeContext(null)));
    assertTrue(((NumericLiteral) feelSemanticVisitor.visit(numericLiteral, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
  }

  @Test
  public void testVisit18() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    FEELContext context = FEELContext.makeContext(null);
    PositionalParameters positionalParameters = new PositionalParameters(expressionList);

    // Act and Assert
    assertSame(positionalParameters, feelSemanticVisitor.visit(positionalParameters, context));
  }

  @Test
  public void testVisit19() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    PositionalParameters positionalParameters = new PositionalParameters(null);

    // Act and Assert
    assertSame(positionalParameters, feelSemanticVisitor.visit(positionalParameters, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeTest rangeTest = new RangeTest(true, new ArithmeticNegation(new NumericLiteral("value")), true,
        new ArithmeticNegation(new NumericLiteral("value")));

    // Act and Assert
    assertSame(rangeTest, feelSemanticVisitor.visit(rangeTest, FEELContext.makeContext(null)));
    assertTrue(((RangeTest) feelSemanticVisitor.visit(rangeTest, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    Expression end = ((RangeTest) feelSemanticVisitor.visit(rangeTest, FEELContext.makeContext(null))).getEnd();
    Type actualType = ((ArithmeticNegation) end).getLeftOperand().getType();
    Type type = end.getType();
    assertTrue(type instanceof NumberType);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit20() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    FEELContext context = FEELContext.makeContext(null);
    NullLiteral nullLiteral = new NullLiteral();

    // Act and Assert
    assertSame(nullLiteral, feelSemanticVisitor.visit(nullLiteral, context));
    assertTrue(((NullLiteral) feelSemanticVisitor.visit(nullLiteral, context))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }

  @Test
  public void testVisit21() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());
    FEELContext context = FEELContext.makeContext(null);
    PositiveUnaryTests positiveUnaryTests = new PositiveUnaryTests(positiveUnaryTestList);

    // Act and Assert
    assertSame(positiveUnaryTests, feelSemanticVisitor.visit(positiveUnaryTests, context));
    Type type = ((PositiveUnaryTests) feelSemanticVisitor.visit(positiveUnaryTests, context)).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    PositiveUnaryTest getResult = ((PositiveUnaryTests) feelSemanticVisitor.visit(positiveUnaryTests, context))
        .getPositiveUnaryTests().get(0);
    assertEquals("TupleType(boolean)", type.toString());
    assertTrue(getResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void testVisit22() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    FEELContext context = FEELContext.makeContext(null);
    NullTest nullTest = new NullTest();

    // Act and Assert
    assertSame(nullTest, feelSemanticVisitor.visit(nullTest, context));
    assertTrue(((NullTest) feelSemanticVisitor.visit(nullTest, context))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void testVisit23() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Conjunction conjunction = new Conjunction(new NumericLiteral("value"), new NumericLiteral("value"));

    // Act and Assert
    assertSame(conjunction, feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)));
    Type type = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null))).getRightOperand()
        .getType();
    assertTrue(((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
  }

  @Test
  public void testVisit24() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Conjunction conjunction = new Conjunction(new ExpressionList(), new ExpressionList());

    // Act and Assert
    assertSame(conjunction, feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)));
    Type type = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null))).getRightOperand()
        .getType();
    assertTrue(((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type.toString());
  }

  @Test
  public void testVisit25() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    Conjunction conjunction = new Conjunction(new ListLiteral(expressionList), new ListLiteral(expressionList));

    // Act and Assert
    assertSame(conjunction, feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)));
    Expression rightOperand = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)))
        .getRightOperand();
    List<Expression> expressionList1 = ((ListLiteral) rightOperand).getExpressionList();
    assertTrue(((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    Type type = rightOperand.getType();
    assertTrue(type instanceof ListType);
    Type elementType = ((ListType) type).getElementType();
    Expression getResult = expressionList1.get(0);
    assertFalse(type.isValid());
    assertSame(elementType, getResult.getType());
    assertEquals("TupleType()", elementType.toString());
  }

  @Test
  public void testVisit26() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Conjunction conjunction = new Conjunction(new NullTest(), new NullTest());

    // Act and Assert
    assertSame(conjunction, feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)));
    Type actualType = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)))
        .getRightOperand().getType();
    Type type = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit27() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Conjunction conjunction = new Conjunction(new Any(), new Any());

    // Act and Assert
    assertSame(conjunction, feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)));
    Type actualType = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)))
        .getRightOperand().getType();
    Type type = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit28() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Conjunction conjunction = new Conjunction(new StringLiteral("value"), new StringLiteral("value"));

    // Act and Assert
    assertSame(conjunction, feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)));
    Type type = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null))).getRightOperand()
        .getType();
    assertTrue(((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
  }

  @Test
  public void testVisit29() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Conjunction conjunction = new Conjunction(new ArithmeticNegation(new NumericLiteral("value")),
        new ArithmeticNegation(new NumericLiteral("value")));

    // Act and Assert
    assertSame(conjunction, feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)));
    Expression rightOperand = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)))
        .getRightOperand();
    Expression leftOperand = ((ArithmeticNegation) rightOperand).getLeftOperand();
    assertTrue(((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    Type type = rightOperand.getType();
    assertTrue(type instanceof NumberType);
    assertSame(type, leftOperand.getType());
  }

  @Test
  public void testVisit3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeTest rangeTest = new RangeTest(true, new NumericLiteral("value"), true, new NumericLiteral("value"));

    // Act and Assert
    assertSame(rangeTest, feelSemanticVisitor.visit(rangeTest, FEELContext.makeContext(null)));
    assertTrue(((RangeTest) feelSemanticVisitor.visit(rangeTest, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    assertTrue(((RangeTest) feelSemanticVisitor.visit(rangeTest, FEELContext.makeContext(null))).getEnd()
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
  }

  @Test
  public void testVisit30() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Conjunction conjunction = new Conjunction(new BooleanLiteral("value"), new BooleanLiteral("value"));

    // Act and Assert
    assertSame(conjunction, feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)));
    Type actualType = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)))
        .getRightOperand().getType();
    Type type = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit31() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Conjunction conjunction = new Conjunction(new NullLiteral(), new NullLiteral());

    // Act and Assert
    assertSame(conjunction, feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)));
    Type type = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null))).getRightOperand()
        .getType();
    assertTrue(((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }

  @Test
  public void testVisit32() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Conjunction conjunction = new Conjunction(new LogicNegation(new ExpressionList()),
        new LogicNegation(new ExpressionList()));

    // Act and Assert
    assertSame(conjunction, feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)));
    Expression rightOperand = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null)))
        .getRightOperand();
    Expression leftOperand = ((LogicNegation) rightOperand).getLeftOperand();
    Type type = ((Conjunction) feelSemanticVisitor.visit(conjunction, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, rightOperand.getType());
    Type type1 = leftOperand.getType();
    assertTrue(type1 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type1.toString());
  }

  @Test
  public void testVisit33() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    BooleanLiteral booleanLiteral = new BooleanLiteral("value");

    // Act and Assert
    assertSame(booleanLiteral, feelSemanticVisitor.visit(booleanLiteral, FEELContext.makeContext(null)));
    assertTrue(((BooleanLiteral) feelSemanticVisitor.visit(booleanLiteral, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void testVisit34() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new ExpressionList());

    // Act and Assert
    assertSame(expressionIteratorDomain,
        feelSemanticVisitor.visit(expressionIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((ExpressionIteratorDomain) feelSemanticVisitor.visit(expressionIteratorDomain,
        FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof TupleType);
    assertSame(type,
        ((ExpressionIteratorDomain) feelSemanticVisitor.visit(expressionIteratorDomain, FEELContext.makeContext(null)))
            .getExpression().getType());
    assertEquals("TupleType()", type.toString());
  }

  @Test
  public void testVisit35() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new BooleanLiteral("value"));

    // Act and Assert
    assertSame(expressionIteratorDomain,
        feelSemanticVisitor.visit(expressionIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((ExpressionIteratorDomain) feelSemanticVisitor.visit(expressionIteratorDomain,
        FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type,
        ((ExpressionIteratorDomain) feelSemanticVisitor.visit(expressionIteratorDomain, FEELContext.makeContext(null)))
            .getExpression().getType());
  }

  @Test
  public void testVisit36() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new StringLiteral("value"));

    // Act and Assert
    assertSame(expressionIteratorDomain,
        feelSemanticVisitor.visit(expressionIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((ExpressionIteratorDomain) feelSemanticVisitor.visit(expressionIteratorDomain,
        FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof StringType);
    assertSame(type,
        ((ExpressionIteratorDomain) feelSemanticVisitor.visit(expressionIteratorDomain, FEELContext.makeContext(null)))
            .getExpression().getType());
  }

  @Test
  public void testVisit37() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new Any());

    // Act and Assert
    assertSame(expressionIteratorDomain,
        feelSemanticVisitor.visit(expressionIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((ExpressionIteratorDomain) feelSemanticVisitor.visit(expressionIteratorDomain,
        FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type,
        ((ExpressionIteratorDomain) feelSemanticVisitor.visit(expressionIteratorDomain, FEELContext.makeContext(null)))
            .getExpression().getType());
  }

  @Test
  public void testVisit38() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new NullLiteral());

    // Act and Assert
    assertSame(expressionIteratorDomain,
        feelSemanticVisitor.visit(expressionIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((ExpressionIteratorDomain) feelSemanticVisitor.visit(expressionIteratorDomain,
        FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof NullType);
    assertSame(type,
        ((ExpressionIteratorDomain) feelSemanticVisitor.visit(expressionIteratorDomain, FEELContext.makeContext(null)))
            .getExpression().getType());
  }

  @Test
  public void testVisit39() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new NumericLiteral("value"));

    // Act and Assert
    assertSame(expressionIteratorDomain,
        feelSemanticVisitor.visit(expressionIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((ExpressionIteratorDomain) feelSemanticVisitor.visit(expressionIteratorDomain,
        FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof NumberType);
    assertSame(type,
        ((ExpressionIteratorDomain) feelSemanticVisitor.visit(expressionIteratorDomain, FEELContext.makeContext(null)))
            .getExpression().getType());
  }

  @Test
  public void testVisit4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>(1);
    positiveUnaryTestList.add(new NullTest());
    positiveUnaryTestList.add(new NullTest());
    NegatedPositiveUnaryTests negatedPositiveUnaryTests = new NegatedPositiveUnaryTests(
        new PositiveUnaryTests(positiveUnaryTestList));

    // Act and Assert
    assertSame(negatedPositiveUnaryTests,
        feelSemanticVisitor.visit(negatedPositiveUnaryTests, FEELContext.makeContext(null)));
    Type type = ((NegatedPositiveUnaryTests) feelSemanticVisitor.visit(negatedPositiveUnaryTests,
        FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof TupleType);
    PositiveUnaryTests positiveUnaryTests = ((NegatedPositiveUnaryTests) feelSemanticVisitor
        .visit(negatedPositiveUnaryTests, FEELContext.makeContext(null))).getPositiveUnaryTests();
    List<Type> types = ((TupleType) type).getTypes();
    assertEquals("TupleType(boolean, boolean)", type.toString());
    Type getResult = types.get(0);
    assertSame(type, positiveUnaryTests.getType());
    List<PositiveUnaryTest> positiveUnaryTests1 = positiveUnaryTests.getPositiveUnaryTests();
    PositiveUnaryTest getResult1 = positiveUnaryTests1.get(0);
    PositiveUnaryTest getResult2 = positiveUnaryTests1.get(1);
    assertSame(getResult, getResult1.getType());
    assertSame(getResult, getResult2.getType());
  }

  @Test
  public void testVisit40() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(
        new LogicNegation(new ExpressionList()));

    // Act and Assert
    assertSame(expressionIteratorDomain,
        feelSemanticVisitor.visit(expressionIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((ExpressionIteratorDomain) feelSemanticVisitor.visit(expressionIteratorDomain,
        FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    Expression expression = ((ExpressionIteratorDomain) feelSemanticVisitor.visit(expressionIteratorDomain,
        FEELContext.makeContext(null))).getExpression();
    Type type1 = ((LogicNegation) expression).getLeftOperand().getType();
    assertSame(type, expression.getType());
    assertTrue(type1 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type1.toString());
  }

  @Test
  public void testVisit41() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionTest expressionTest = new ExpressionTest(new NullTest());

    // Act and Assert
    assertSame(expressionTest, feelSemanticVisitor.visit(expressionTest, FEELContext.makeContext(null)));
    Type type = ((ExpressionTest) feelSemanticVisitor.visit(expressionTest, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, ((ExpressionTest) feelSemanticVisitor.visit(expressionTest, FEELContext.makeContext(null)))
        .getExpression().getType());
  }

  @Test
  public void testVisit42() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionTest expressionTest = new ExpressionTest(new LogicNegation(new ExpressionList()));

    // Act and Assert
    assertSame(expressionTest, feelSemanticVisitor.visit(expressionTest, FEELContext.makeContext(null)));
    Type type = ((ExpressionTest) feelSemanticVisitor.visit(expressionTest, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    Expression expression = ((ExpressionTest) feelSemanticVisitor.visit(expressionTest, FEELContext.makeContext(null)))
        .getExpression();
    Type type1 = ((LogicNegation) expression).getLeftOperand().getType();
    assertSame(type, expression.getType());
    assertTrue(type1 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type1.toString());
  }

  @Test
  public void testVisit43() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionTest expressionTest = new ExpressionTest(new BooleanLiteral("value"));

    // Act and Assert
    assertSame(expressionTest, feelSemanticVisitor.visit(expressionTest, FEELContext.makeContext(null)));
    Type type = ((ExpressionTest) feelSemanticVisitor.visit(expressionTest, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, ((ExpressionTest) feelSemanticVisitor.visit(expressionTest, FEELContext.makeContext(null)))
        .getExpression().getType());
  }

  @Test
  public void testVisit44() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionTest expressionTest = new ExpressionTest(new Any());

    // Act and Assert
    assertSame(expressionTest, feelSemanticVisitor.visit(expressionTest, FEELContext.makeContext(null)));
    Type type = ((ExpressionTest) feelSemanticVisitor.visit(expressionTest, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, ((ExpressionTest) feelSemanticVisitor.visit(expressionTest, FEELContext.makeContext(null)))
        .getExpression().getType());
  }

  @Test
  public void testVisit45() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    BetweenExpression betweenExpression = new BetweenExpression(new ArithmeticNegation(new NumericLiteral("value")),
        new ArithmeticNegation(new NumericLiteral("value")), new ArithmeticNegation(new NumericLiteral("value")));

    // Act and Assert
    assertSame(betweenExpression, feelSemanticVisitor.visit(betweenExpression, FEELContext.makeContext(null)));
    Expression value = ((BetweenExpression) feelSemanticVisitor.visit(betweenExpression, FEELContext.makeContext(null)))
        .getValue();
    Expression leftOperand = ((ArithmeticNegation) value).getLeftOperand();
    assertTrue(((BetweenExpression) feelSemanticVisitor.visit(betweenExpression, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    Type type = value.getType();
    assertTrue(type instanceof NumberType);
    assertSame(type, leftOperand.getType());
  }

  @Test
  public void testVisit46() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    BetweenExpression betweenExpression = new BetweenExpression(new StringLiteral("value"), new StringLiteral("value"),
        new StringLiteral("value"));

    // Act and Assert
    assertSame(betweenExpression, feelSemanticVisitor.visit(betweenExpression, FEELContext.makeContext(null)));
    Type type = ((BetweenExpression) feelSemanticVisitor.visit(betweenExpression, FEELContext.makeContext(null)))
        .getValue().getType();
    assertTrue(((BetweenExpression) feelSemanticVisitor.visit(betweenExpression, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
  }

  @Test
  public void testVisit47() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    BetweenExpression betweenExpression = new BetweenExpression(new NumericLiteral("value"),
        new NumericLiteral("value"), new NumericLiteral("value"));

    // Act and Assert
    assertSame(betweenExpression, feelSemanticVisitor.visit(betweenExpression, FEELContext.makeContext(null)));
    Type type = ((BetweenExpression) feelSemanticVisitor.visit(betweenExpression, FEELContext.makeContext(null)))
        .getValue().getType();
    assertTrue(((BetweenExpression) feelSemanticVisitor.visit(betweenExpression, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
  }

  @Test
  public void testVisit48() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    FEELContext context = FEELContext.makeContext(null);
    Any any = new Any();

    // Act and Assert
    assertSame(any, feelSemanticVisitor.visit(any, context));
    assertTrue(((Any) feelSemanticVisitor.visit(any, context))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void testVisit49() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Exponentiation exponentiation = new Exponentiation(new NullLiteral(), new NullLiteral());

    // Act and Assert
    assertSame(exponentiation, feelSemanticVisitor.visit(exponentiation, FEELContext.makeContext(null)));
    Type type = ((Exponentiation) feelSemanticVisitor.visit(exponentiation, FEELContext.makeContext(null)))
        .getRightOperand().getType();
    assertTrue(((Exponentiation) feelSemanticVisitor.visit(exponentiation, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }

  @Test
  public void testVisit5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    NegatedPositiveUnaryTests negatedPositiveUnaryTests = new NegatedPositiveUnaryTests(new PositiveUnaryTests(null));

    // Act and Assert
    assertSame(negatedPositiveUnaryTests,
        feelSemanticVisitor.visit(negatedPositiveUnaryTests, FEELContext.makeContext(null)));
    Type type = ((NegatedPositiveUnaryTests) feelSemanticVisitor.visit(negatedPositiveUnaryTests,
        FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof TupleType);
    Type actualType = ((NegatedPositiveUnaryTests) feelSemanticVisitor.visit(negatedPositiveUnaryTests,
        FEELContext.makeContext(null))).getPositiveUnaryTests().getType();
    assertEquals("TupleType()", type.toString());
    assertSame(type, actualType);
  }

  @Test
  public void testVisit50() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Exponentiation exponentiation = new Exponentiation(new NumericLiteral("value"), new NumericLiteral("value"));

    // Act and Assert
    assertSame(exponentiation, feelSemanticVisitor.visit(exponentiation, FEELContext.makeContext(null)));
    Type actualType = ((Exponentiation) feelSemanticVisitor.visit(exponentiation, FEELContext.makeContext(null)))
        .getRightOperand().getType();
    Type type = ((Exponentiation) feelSemanticVisitor.visit(exponentiation, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof NumberType);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit51() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    FormalParameter formalParameter = new FormalParameter("name", new AnyType());

    // Act and Assert
    assertSame(formalParameter, feelSemanticVisitor.visit(formalParameter, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit52() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    IfExpression ifExpression = new IfExpression(new BooleanLiteral("value"), new BooleanLiteral("value"),
        new BooleanLiteral("value"));

    // Act and Assert
    assertSame(ifExpression, feelSemanticVisitor.visit(ifExpression, FEELContext.makeContext(null)));
    Type type = ((IfExpression) feelSemanticVisitor.visit(ifExpression, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, ((IfExpression) feelSemanticVisitor.visit(ifExpression, FEELContext.makeContext(null)))
        .getCondition().getType());
  }

  @Test
  public void testVisit53() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    IfExpression ifExpression = new IfExpression(new LogicNegation(new ExpressionList()),
        new LogicNegation(new ExpressionList()), new LogicNegation(new ExpressionList()));

    // Act and Assert
    assertSame(ifExpression, feelSemanticVisitor.visit(ifExpression, FEELContext.makeContext(null)));
    Type type = ((IfExpression) feelSemanticVisitor.visit(ifExpression, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    Expression condition = ((IfExpression) feelSemanticVisitor.visit(ifExpression, FEELContext.makeContext(null)))
        .getCondition();
    Expression leftOperand = ((LogicNegation) condition).getLeftOperand();
    assertSame(type, condition.getType());
    Type type1 = leftOperand.getType();
    assertTrue(type1 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type1.toString());
  }

  @Test
  public void testVisit54() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    IfExpression ifExpression = new IfExpression(new Any(), new Any(), new Any());

    // Act and Assert
    assertSame(ifExpression, feelSemanticVisitor.visit(ifExpression, FEELContext.makeContext(null)));
    Type type = ((IfExpression) feelSemanticVisitor.visit(ifExpression, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, ((IfExpression) feelSemanticVisitor.visit(ifExpression, FEELContext.makeContext(null)))
        .getCondition().getType());
  }

  @Test
  public void testVisit55() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    IfExpression ifExpression = new IfExpression(new NullTest(), new NullTest(), new NullTest());

    // Act and Assert
    assertSame(ifExpression, feelSemanticVisitor.visit(ifExpression, FEELContext.makeContext(null)));
    Type type = ((IfExpression) feelSemanticVisitor.visit(ifExpression, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, ((IfExpression) feelSemanticVisitor.visit(ifExpression, FEELContext.makeContext(null)))
        .getCondition().getType());
  }

  @Test
  public void testVisit56() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    FEELContext context = FEELContext.makeContext(null);
    ListLiteral listLiteral = new ListLiteral(expressionList);

    // Act and Assert
    assertSame(listLiteral, feelSemanticVisitor.visit(listLiteral, context));
    Type type = ((ListLiteral) feelSemanticVisitor.visit(listLiteral, context)).getType();
    assertTrue(type instanceof ListType);
    Type elementType = ((ListType) type).getElementType();
    Expression getResult = ((ListLiteral) feelSemanticVisitor.visit(listLiteral, context)).getExpressionList().get(0);
    assertFalse(type.isValid());
    Type actualType = getResult.getType();
    assertEquals("TupleType()", elementType.toString());
    assertSame(elementType, actualType);
  }

  @Test
  public void testVisit57() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FEELContext context = FEELContext.makeContext(null);
    NamedParameters namedParameters = new NamedParameters(stringExpressionMap);

    // Act and Assert
    assertSame(namedParameters, feelSemanticVisitor.visit(namedParameters, context));
  }

  @Test
  public void testVisit58() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(new ExpressionList(), new ExpressionList());

    // Act and Assert
    assertSame(rangeIteratorDomain, feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    Type type1 = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getEnd().getType();
    assertTrue(type1 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertFalse(type.isValid());
    assertEquals("TupleType()", type1.toString());
  }

  @Test
  public void testVisit59() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(new NullTest(), new NullTest());

    // Act and Assert
    assertSame(rangeIteratorDomain, feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    assertTrue(((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getEnd().getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type.isValid());
  }

  @Test
  public void testVisit6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());
    NegatedPositiveUnaryTests negatedPositiveUnaryTests = new NegatedPositiveUnaryTests(
        new PositiveUnaryTests(positiveUnaryTestList));

    // Act and Assert
    assertSame(negatedPositiveUnaryTests,
        feelSemanticVisitor.visit(negatedPositiveUnaryTests, FEELContext.makeContext(null)));
    Type type = ((NegatedPositiveUnaryTests) feelSemanticVisitor.visit(negatedPositiveUnaryTests,
        FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof TupleType);
    PositiveUnaryTests positiveUnaryTests = ((NegatedPositiveUnaryTests) feelSemanticVisitor
        .visit(negatedPositiveUnaryTests, FEELContext.makeContext(null))).getPositiveUnaryTests();
    List<Type> types = ((TupleType) type).getTypes();
    assertEquals("TupleType(boolean)", type.toString());
    Type getResult = types.get(0);
    assertSame(type, positiveUnaryTests.getType());
    assertSame(getResult, positiveUnaryTests.getPositiveUnaryTests().get(0).getType());
  }

  @Test
  public void testVisit60() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(
        new ArithmeticNegation(new NumericLiteral("value")), new ArithmeticNegation(new NumericLiteral("value")));

    // Act and Assert
    assertSame(rangeIteratorDomain, feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    Expression end = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain,
        FEELContext.makeContext(null))).getEnd();
    Type actualType = ((ArithmeticNegation) end).getLeftOperand().getType();
    Type type1 = end.getType();
    assertTrue(type1 instanceof NumberType);
    assertTrue(type.isValid());
    assertSame(type1, actualType);
  }

  @Test
  public void testVisit61() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(new Any(), new Any());

    // Act and Assert
    assertSame(rangeIteratorDomain, feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    assertTrue(((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getEnd().getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type.isValid());
  }

  @Test
  public void testVisit62() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(new NullLiteral(), new NullLiteral());

    // Act and Assert
    assertSame(rangeIteratorDomain, feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    assertTrue(((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getEnd().getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
    assertTrue(type.isValid());
  }

  @Test
  public void testVisit63() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(new StringLiteral("value"),
        new StringLiteral("value"));

    // Act and Assert
    assertSame(rangeIteratorDomain, feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    assertTrue(((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getEnd().getType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
    assertTrue(type.isValid());
  }

  @Test
  public void testVisit64() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(new LogicNegation(new ExpressionList()),
        new LogicNegation(new ExpressionList()));

    // Act and Assert
    assertSame(rangeIteratorDomain, feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    Expression end = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain,
        FEELContext.makeContext(null))).getEnd();
    Type type1 = ((LogicNegation) end).getLeftOperand().getType();
    assertTrue(end.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type.isValid());
    assertTrue(type1 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type1.toString());
  }

  @Test
  public void testVisit65() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(new BooleanLiteral("value"),
        new BooleanLiteral("value"));

    // Act and Assert
    assertSame(rangeIteratorDomain, feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    assertTrue(((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getEnd().getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type.isValid());
  }

  @Test
  public void testVisit66() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(new NumericLiteral("value"),
        new NumericLiteral("value"));

    // Act and Assert
    assertSame(rangeIteratorDomain, feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    assertTrue(((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getEnd().getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
    assertTrue(type.isValid());
  }

  @Test
  public void testVisit67() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(new ListLiteral(expressionList),
        new ListLiteral(expressionList));

    // Act and Assert
    assertSame(rangeIteratorDomain, feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)));
    Type type = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain, FEELContext.makeContext(null)))
        .getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    Expression end = ((RangeIteratorDomain) feelSemanticVisitor.visit(rangeIteratorDomain,
        FEELContext.makeContext(null))).getEnd();
    List<Expression> expressionList1 = ((ListLiteral) end).getExpressionList();
    Type type1 = end.getType();
    assertTrue(type1 instanceof ListType);
    Type elementType = ((ListType) type1).getElementType();
    assertFalse(type.isValid());
    Expression getResult = expressionList1.get(0);
    assertFalse(type1.isValid());
    assertSame(elementType, getResult.getType());
    assertEquals("TupleType()", elementType.toString());
  }

  @Test
  public void testVisit68() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Disjunction disjunction = new Disjunction(new StringLiteral("value"), new StringLiteral("value"));

    // Act and Assert
    assertSame(disjunction, feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)));
    Type type = ((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null))).getRightOperand()
        .getType();
    assertTrue(((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
  }

  @Test
  public void testVisit69() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    Disjunction disjunction = new Disjunction(new ListLiteral(expressionList), new ListLiteral(expressionList));

    // Act and Assert
    assertSame(disjunction, feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)));
    Expression rightOperand = ((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)))
        .getRightOperand();
    List<Expression> expressionList1 = ((ListLiteral) rightOperand).getExpressionList();
    assertTrue(((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    Type type = rightOperand.getType();
    assertTrue(type instanceof ListType);
    Type elementType = ((ListType) type).getElementType();
    Expression getResult = expressionList1.get(0);
    assertFalse(type.isValid());
    assertSame(elementType, getResult.getType());
    assertEquals("TupleType()", elementType.toString());
  }

  @Test
  public void testVisit7() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    StringLiteral stringLiteral = new StringLiteral("value");

    // Act and Assert
    assertSame(stringLiteral, feelSemanticVisitor.visit(stringLiteral, FEELContext.makeContext(null)));
    assertTrue(((StringLiteral) feelSemanticVisitor.visit(stringLiteral, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
  }

  @Test
  public void testVisit70() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Disjunction disjunction = new Disjunction(new NumericLiteral("value"), new NumericLiteral("value"));

    // Act and Assert
    assertSame(disjunction, feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)));
    Type type = ((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null))).getRightOperand()
        .getType();
    assertTrue(((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
  }

  @Test
  public void testVisit71() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Disjunction disjunction = new Disjunction(new Any(), new Any());

    // Act and Assert
    assertSame(disjunction, feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)));
    Type actualType = ((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)))
        .getRightOperand().getType();
    Type type = ((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit72() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Disjunction disjunction = new Disjunction(new NullLiteral(), new NullLiteral());

    // Act and Assert
    assertSame(disjunction, feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)));
    Type type = ((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null))).getRightOperand()
        .getType();
    assertTrue(((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }

  @Test
  public void testVisit73() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Disjunction disjunction = new Disjunction(new ExpressionList(), new ExpressionList());

    // Act and Assert
    assertSame(disjunction, feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)));
    Type type = ((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null))).getRightOperand()
        .getType();
    assertTrue(((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type.toString());
  }

  @Test
  public void testVisit74() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Disjunction disjunction = new Disjunction(new BooleanLiteral("value"), new BooleanLiteral("value"));

    // Act and Assert
    assertSame(disjunction, feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)));
    Type actualType = ((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)))
        .getRightOperand().getType();
    Type type = ((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit75() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Disjunction disjunction = new Disjunction(new LogicNegation(new ExpressionList()),
        new LogicNegation(new ExpressionList()));

    // Act and Assert
    assertSame(disjunction, feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)));
    Expression rightOperand = ((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)))
        .getRightOperand();
    Expression leftOperand = ((LogicNegation) rightOperand).getLeftOperand();
    Type type = ((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, rightOperand.getType());
    Type type1 = leftOperand.getType();
    assertTrue(type1 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type1.toString());
  }

  @Test
  public void testVisit76() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Disjunction disjunction = new Disjunction(new NullTest(), new NullTest());

    // Act and Assert
    assertSame(disjunction, feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)));
    Type actualType = ((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null)))
        .getRightOperand().getType();
    Type type = ((Disjunction) feelSemanticVisitor.visit(disjunction, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit77() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertNull(feelSemanticVisitor.visit((ContextEntryKey) null, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit78() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    FEELContext context = FEELContext.makeContext(null);
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, feelSemanticVisitor.visit(expressionList, context));
    Type type = ((ExpressionList) feelSemanticVisitor.visit(expressionList, context)).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type.toString());
  }

  @Test
  public void testVisit79() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    SimplePositiveUnaryTests simplePositiveUnaryTests = new SimplePositiveUnaryTests(null);

    // Act and Assert
    assertSame(simplePositiveUnaryTests,
        feelSemanticVisitor.visit(simplePositiveUnaryTests, FEELContext.makeContext(null)));
    Type type = ((SimplePositiveUnaryTests) feelSemanticVisitor.visit(simplePositiveUnaryTests,
        FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type.toString());
  }

  @Test
  public void testVisit8() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation logicNegation = new LogicNegation(new LogicNegation(new ExpressionList()));

    // Act and Assert
    assertSame(logicNegation, feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)));
    Expression leftOperand = ((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)))
        .getLeftOperand();
    Expression leftOperand1 = ((LogicNegation) leftOperand).getLeftOperand();
    Type type = ((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type, leftOperand.getType());
    Type type1 = leftOperand1.getType();
    assertTrue(type1 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type1.toString());
  }

  @Test
  public void testVisit80() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Iterator iterator = new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()));

    // Act and Assert
    assertSame(iterator, feelSemanticVisitor.visit(iterator, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit81() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Iterator iterator = new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList()));

    // Act and Assert
    assertSame(iterator, feelSemanticVisitor.visit(iterator, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit82() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    PathExpression pathExpression = new PathExpression(new BooleanLiteral("value"), "foo");

    // Act and Assert
    assertSame(pathExpression, feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null)));
    assertTrue(((PathExpression) feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue(((PathExpression) feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null))).getSource()
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void testVisit83() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    PathExpression pathExpression = new PathExpression(new ListLiteral(expressionList), "foo");

    // Act and Assert
    assertSame(pathExpression, feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null)));
    Type type = ((PathExpression) feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof ListType);
    Expression source = ((PathExpression) feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null)))
        .getSource();
    List<Expression> expressionList1 = ((ListLiteral) source).getExpressionList();
    Type type1 = source.getType();
    assertTrue(type1 instanceof ListType);
    assertTrue(type.isValid());
    Type elementType = ((ListType) type1).getElementType();
    Type actualType = expressionList1.get(0).getType();
    assertEquals("ListType(TupleType())", type1.toString());
    assertEquals("TupleType()", elementType.toString());
    assertSame(elementType, actualType);
  }

  @Test
  public void testVisit84() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    PathExpression pathExpression = new PathExpression(new Any(), "foo");

    // Act and Assert
    assertSame(pathExpression, feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null)));
    assertTrue(((PathExpression) feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue(((PathExpression) feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null))).getSource()
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void testVisit85() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    PathExpression pathExpression = new PathExpression(new NullLiteral(), "foo");

    // Act and Assert
    assertSame(pathExpression, feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null)));
    assertTrue(((PathExpression) feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue(((PathExpression) feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null))).getSource()
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }

  @Test
  public void testVisit86() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    PathExpression pathExpression = new PathExpression(new NumericLiteral("value"), "foo");

    // Act and Assert
    assertSame(pathExpression, feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null)));
    assertTrue(((PathExpression) feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue(((PathExpression) feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null))).getSource()
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
  }

  @Test
  public void testVisit87() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    PathExpression pathExpression = new PathExpression(new ExpressionList(), "foo");

    // Act and Assert
    assertSame(pathExpression, feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null)));
    assertTrue(((PathExpression) feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    Type type = ((PathExpression) feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null))).getSource()
        .getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type.toString());
  }

  @Test
  public void testVisit88() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    PathExpression pathExpression = new PathExpression(new NullTest(), "foo");

    // Act and Assert
    assertSame(pathExpression, feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null)));
    assertTrue(((PathExpression) feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue(((PathExpression) feelSemanticVisitor.visit(pathExpression, FEELContext.makeContext(null))).getSource()
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void testVisit89() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    NegatedSimplePositiveUnaryTests negatedSimplePositiveUnaryTests = new NegatedSimplePositiveUnaryTests(
        new SimplePositiveUnaryTests(null));

    // Act and Assert
    assertSame(negatedSimplePositiveUnaryTests,
        feelSemanticVisitor.visit(negatedSimplePositiveUnaryTests, FEELContext.makeContext(null)));
    Type type = ((NegatedSimplePositiveUnaryTests) feelSemanticVisitor.visit(negatedSimplePositiveUnaryTests,
        FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof TupleType);
    Type actualType = ((NegatedSimplePositiveUnaryTests) feelSemanticVisitor.visit(negatedSimplePositiveUnaryTests,
        FEELContext.makeContext(null))).getSimplePositiveUnaryTests().getType();
    assertEquals("TupleType()", type.toString());
    assertSame(type, actualType);
  }

  @Test
  public void testVisit9() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor feelSemanticVisitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation logicNegation = new LogicNegation(new ExpressionList());

    // Act and Assert
    assertSame(logicNegation, feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)));
    Type type = ((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)))
        .getLeftOperand().getType();
    assertTrue(((LogicNegation) feelSemanticVisitor.visit(logicNegation, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type.toString());
  }
}

