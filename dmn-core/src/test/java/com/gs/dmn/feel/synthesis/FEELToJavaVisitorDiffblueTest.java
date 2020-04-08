package com.gs.dmn.feel.synthesis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.PathExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.QualifiedName;
import com.gs.dmn.feel.analysis.syntax.ast.expression.RangeIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.ArithmeticNegation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Exponentiation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.Context;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntry;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntryKey;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.Conversion;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ConversionKind;
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
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.InstanceOfExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.NamedTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.test.Any;
import com.gs.dmn.feel.analysis.syntax.ast.test.ExpressionTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.NegatedPositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.NegatedSimplePositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTests;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class FEELToJavaVisitorDiffblueTest {
  @Test
  public void testConvertArgument() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertEquals("asList(?)",
        feelToJavaVisitor.convertArgument("?", new Conversion(ConversionKind.ELEMENT_TO_LIST, new AnyType())));
  }

  @Test
  public void testConvertArgument2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertEquals("?", feelToJavaVisitor.convertArgument("?", new Conversion(ConversionKind.NONE, new AnyType())));
  }

  @Test
  public void testVisit() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    NegatedPositiveUnaryTests element = new NegatedPositiveUnaryTests(new PositiveUnaryTests(null));

    // Act and Assert
    assertEquals("booleanNot(booleanOr())", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit10() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation element = new LogicNegation(new BooleanLiteral("true"));

    // Act and Assert
    assertEquals("booleanNot(Boolean.TRUE)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit100() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    PathExpression element = new PathExpression(new QualifiedName(stringList), "foo");

    // Act and Assert
    assertEquals("((com.gs.dmn.runtime.Context)(foo)).get(\"foo\"," + " asList())",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit101() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    PathExpression element = new PathExpression(new StringLiteral("value"), "foo");

    // Act and Assert
    assertEquals("((com.gs.dmn.runtime.Context)(\"value\")).get(\"foo\"," + " asList())",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit102() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    PathExpression element = new PathExpression(new NumericLiteral("value"), "foo");

    // Act and Assert
    assertEquals("((com.gs.dmn.runtime.Context)(number(\"value\"))).get(\"foo\"," + " asList())",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit103() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    NegatedSimplePositiveUnaryTests element = new NegatedSimplePositiveUnaryTests(new SimplePositiveUnaryTests(null));

    // Act and Assert
    assertEquals("booleanNot(booleanOr())", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit11() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    LogicNegation element = new LogicNegation(new QualifiedName(stringList));

    // Act and Assert
    assertEquals("booleanNot(foo)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit12() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation element = new LogicNegation(new BooleanLiteral("value"));

    // Act and Assert
    assertEquals("booleanNot(Boolean.FALSE)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit13() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation element = new LogicNegation(new ArithmeticNegation(new Name("name")));

    // Act and Assert
    assertEquals("booleanNot(numericUnaryMinus(name))",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit14() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation element = new LogicNegation(new StringLiteral("value"));

    // Act and Assert
    assertEquals("booleanNot(\"value\")", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit15() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation element = new LogicNegation(new ArithmeticNegation(new Any()));

    // Act and Assert
    assertEquals("booleanNot(numericUnaryMinus(true))",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit16() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation element = new LogicNegation(new ArithmeticNegation(new NumericLiteral("value")));

    // Act and Assert
    assertEquals("booleanNot(numericUnaryMinus(number(\"value\")))",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit17() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    LogicNegation element = new LogicNegation(new ArithmeticNegation(new QualifiedName(stringList)));

    // Act and Assert
    assertEquals("booleanNot(numericUnaryMinus(foo))", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit18() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation element = new LogicNegation(new NullLiteral());

    // Act and Assert
    assertEquals("booleanNot(null)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit19() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Name leftOperand = new Name("name");
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("qualifiedName"));

    // Act and Assert
    assertEquals("name instanceof Object", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    StringLiteral element = new StringLiteral("value");

    // Act and Assert
    assertEquals("\"value\"", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit20() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    NamedTypeExpression rightOperand = new NamedTypeExpression("qualifiedName");
    InstanceOfExpression element = new InstanceOfExpression(new Any(), rightOperand);

    // Act and Assert
    assertEquals("true instanceof Object", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit21() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    NamedTypeExpression rightOperand = new NamedTypeExpression("qualifiedName");
    InstanceOfExpression element = new InstanceOfExpression(new QualifiedName(stringList), rightOperand);

    // Act and Assert
    assertEquals("foo instanceof Object", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit22() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    BooleanLiteral leftOperand = new BooleanLiteral("value");
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("qualifiedName"));

    // Act and Assert
    assertEquals("Boolean.FALSE instanceof Object", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit23() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    NumericLiteral leftOperand = new NumericLiteral("value");
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("qualifiedName"));

    // Act and Assert
    assertEquals("number(\"value\") instanceof Object",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit24() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    NamedTypeExpression rightOperand = new NamedTypeExpression("qualifiedName");
    InstanceOfExpression element = new InstanceOfExpression(new NullLiteral(), rightOperand);

    // Act and Assert
    assertEquals("null instanceof Object", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit25() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    StringLiteral leftOperand = new StringLiteral("value");
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("qualifiedName"));

    // Act and Assert
    assertEquals("\"value\" instanceof Object", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit26() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ListLiteral leftOperand = new ListLiteral(null);
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("qualifiedName"));

    // Act and Assert
    assertEquals("asList() instanceof Object", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit27() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    NumericLiteral element = new NumericLiteral("value");

    // Act and Assert
    assertEquals("number(\"value\")", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit28() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertEquals("foo", feelToJavaVisitor.visit(new QualifiedName(stringList), context));
  }

  @Test
  public void testVisit29() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    PositionalParameters positionalParameters = new PositionalParameters(null);

    // Act and Assert
    assertSame(positionalParameters, feelToJavaVisitor.visit(positionalParameters, FEELContext.makeContext(null)));
    assertTrue(((PositionalParameters) feelToJavaVisitor.visit(positionalParameters, FEELContext.makeContext(null)))
        .getOriginalArguments() instanceof com.gs.dmn.runtime.interpreter.PositionalArguments);
  }

  @Test
  public void testVisit3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation element = new LogicNegation(new Context(null));

    // Act and Assert
    assertEquals("booleanNot(new com.gs.dmn.runtime.Context())",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit30() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    NumericLiteral expression = new NumericLiteral("value");
    ContextEntry element = new ContextEntry(new ContextEntryKey("foo"), expression);

    // Act and Assert
    assertEquals(".add(\"foo\", number(\"value\"))", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit31() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    BooleanLiteral expression = new BooleanLiteral("value");
    ContextEntry element = new ContextEntry(new ContextEntryKey("foo"), expression);

    // Act and Assert
    assertEquals(".add(\"foo\", Boolean.FALSE)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit32() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ContextEntryKey key = new ContextEntryKey("foo");
    ContextEntry element = new ContextEntry(key, new NullLiteral());

    // Act and Assert
    assertEquals(".add(\"foo\", null)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit33() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Name expression = new Name("name");
    ContextEntry element = new ContextEntry(new ContextEntryKey("foo"), expression);

    // Act and Assert
    assertEquals(".add(\"foo\", name)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit34() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ContextEntryKey key = new ContextEntryKey("foo");
    ContextEntry element = new ContextEntry(key, new Any());

    // Act and Assert
    assertEquals(".add(\"foo\", true)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit35() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    StringLiteral expression = new StringLiteral("value");
    ContextEntry element = new ContextEntry(new ContextEntryKey("foo"), expression);

    // Act and Assert
    assertEquals(".add(\"foo\", \"value\")", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit36() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertEquals("null", feelToJavaVisitor.visit(new NullLiteral(), context));
  }

  @Test
  public void testVisit37() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    Conjunction element = new Conjunction(new QualifiedName(stringList), new QualifiedName(stringList));

    // Act and Assert
    assertEquals("booleanAnd(foo, foo)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit38() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Conjunction element = new Conjunction(new BooleanLiteral("value"), new BooleanLiteral("value"));

    // Act and Assert
    assertEquals("booleanAnd(Boolean.FALSE, Boolean.FALSE)",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit39() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Conjunction element = new Conjunction(new NullLiteral(), new NullLiteral());

    // Act and Assert
    assertEquals("booleanAnd(null, null)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation element = new LogicNegation(new NumericLiteral("value"));

    // Act and Assert
    assertEquals("booleanNot(number(\"value\"))", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit40() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Conjunction element = new Conjunction(new Name("name"), new Name("name"));

    // Act and Assert
    assertEquals("booleanAnd(name, name)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit41() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Conjunction element = new Conjunction(new NumericLiteral("value"), new NumericLiteral("value"));

    // Act and Assert
    assertEquals("booleanAnd(number(\"value\"), number(\"value\"))",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit42() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Conjunction element = new Conjunction(new Any(), new Any());

    // Act and Assert
    assertEquals("booleanAnd(true, true)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit43() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Conjunction element = new Conjunction(new StringLiteral("value"), new StringLiteral("value"));

    // Act and Assert
    assertEquals("booleanAnd(\"value\", \"value\")", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit44() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    BooleanLiteral element = new BooleanLiteral("value");

    // Act and Assert
    assertEquals("Boolean.FALSE", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit45() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new ListLiteral(null));

    // Act and Assert
    assertEquals("asList()", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit46() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new Name("name"));

    // Act and Assert
    assertEquals("name", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit47() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionTest element = new ExpressionTest(new NullLiteral());

    // Act and Assert
    assertEquals("null", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit48() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionTest element = new ExpressionTest(new Any());

    // Act and Assert
    assertEquals("true", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit49() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionTest element = new ExpressionTest(new StringLiteral("value"));

    // Act and Assert
    assertEquals("\"value\"", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation element = new LogicNegation(new ArithmeticNegation(new StringLiteral("value")));

    // Act and Assert
    assertEquals("booleanNot(numericUnaryMinus(\"value\"))",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit50() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    ExpressionTest element = new ExpressionTest(new QualifiedName(stringList));

    // Act and Assert
    assertEquals("foo", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit51() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionTest element = new ExpressionTest(new NumericLiteral("value"));

    // Act and Assert
    assertEquals("number(\"value\")", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit52() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ExpressionTest element = new ExpressionTest(new Name("name"));

    // Act and Assert
    assertEquals("name", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit53() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertEquals("true", feelToJavaVisitor.visit(new Any(), context));
  }

  @Test
  public void testVisit54() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Exponentiation element = new Exponentiation(new Any(), new Any());

    // Act and Assert
    assertEquals("numericExponentiation(true, true)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit55() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Exponentiation element = new Exponentiation(new NullLiteral(), new NullLiteral());

    // Act and Assert
    assertEquals("numericExponentiation(null, null)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit56() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    Exponentiation element = new Exponentiation(new QualifiedName(stringList), new QualifiedName(stringList));

    // Act and Assert
    assertEquals("numericExponentiation(foo, foo)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit57() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Exponentiation element = new Exponentiation(new ArithmeticNegation(new NullLiteral()),
        new ArithmeticNegation(new NullLiteral()));

    // Act and Assert
    assertEquals("numericExponentiation(numericUnaryMinus(null)," + " numericUnaryMinus(null))",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit58() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Exponentiation element = new Exponentiation(new BooleanLiteral("value"), new BooleanLiteral("value"));

    // Act and Assert
    assertEquals("numericExponentiation(Boolean.FALSE," + " Boolean.FALSE)",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit59() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Exponentiation element = new Exponentiation(new NumericLiteral("value"), new NumericLiteral("value"));

    // Act and Assert
    assertEquals("numericExponentiation(number(\"value\")," + " number(\"value\"))",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation element = new LogicNegation(new Any());

    // Act and Assert
    assertEquals("booleanNot(true)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit60() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Exponentiation element = new Exponentiation(new Name("name"), new Name("name"));

    // Act and Assert
    assertEquals("numericExponentiation(name, name)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit61() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Exponentiation element = new Exponentiation(new Context(null), new Context(null));

    // Act and Assert
    assertEquals("numericExponentiation(new com.gs.dmn.runtime.Context()," + " new com.gs.dmn.runtime.Context())",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit62() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Exponentiation element = new Exponentiation(new LogicNegation(new NullLiteral()),
        new LogicNegation(new NullLiteral()));

    // Act and Assert
    assertEquals("numericExponentiation(booleanNot(null)," + " booleanNot(null))",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit63() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Exponentiation element = new Exponentiation(new StringLiteral("value"), new StringLiteral("value"));

    // Act and Assert
    assertEquals("numericExponentiation(\"value\", \"value\")",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit64() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Name element = new Name("name");

    // Act and Assert
    assertEquals("name", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit65() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    IfExpression element = new IfExpression(new NumericLiteral("value"), new NumericLiteral("value"),
        new NumericLiteral("value"));

    // Act and Assert
    assertEquals("(booleanEqual(number(\"value\"), Boolean.TRUE)) ?" + " number(\"value\") : number(\"value\")",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit66() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    IfExpression element = new IfExpression(new Name("name"), new Name("name"), new Name("name"));

    // Act and Assert
    assertEquals("(booleanEqual(name, Boolean.TRUE)) ? name : name",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit67() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    IfExpression element = new IfExpression(new ArithmeticNegation(new NullLiteral()),
        new ArithmeticNegation(new NullLiteral()), new ArithmeticNegation(new NullLiteral()));

    // Act and Assert
    assertEquals("(booleanEqual(numericUnaryMinus(null), Boolean.TRUE))"
        + " ? numericUnaryMinus(null) : numericUnaryMinus" + "(null)",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit68() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    IfExpression element = new IfExpression(new StringLiteral("value"), new StringLiteral("value"),
        new StringLiteral("value"));

    // Act and Assert
    assertEquals("(booleanEqual(\"value\", Boolean.TRUE)) ? \"value\"" + " : \"value\"",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit69() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    IfExpression element = new IfExpression(new ListLiteral(null), new ListLiteral(null), new ListLiteral(null));

    // Act and Assert
    assertEquals("(booleanEqual(asList(), Boolean.TRUE)) ? asList() :" + " asList()",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit7() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation element = new LogicNegation(new ArithmeticNegation(new NullLiteral()));

    // Act and Assert
    assertEquals("booleanNot(numericUnaryMinus(null))",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit70() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    IfExpression element = new IfExpression(new Any(), new Any(), new Any());

    // Act and Assert
    assertEquals("(booleanEqual(true, Boolean.TRUE)) ? true : true",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit71() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    IfExpression element = new IfExpression(new Context(null), new Context(null), new Context(null));

    // Act and Assert
    assertEquals("(booleanEqual(new com.gs.dmn.runtime.Context(),"
        + " Boolean.TRUE)) ? new com.gs.dmn.runtime.Context()" + " : new com.gs.dmn.runtime.Context()",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit72() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    IfExpression element = new IfExpression(new QualifiedName(stringList), new QualifiedName(stringList),
        new QualifiedName(stringList));

    // Act and Assert
    assertEquals("(booleanEqual(foo, Boolean.TRUE)) ? foo : foo",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit73() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    IfExpression element = new IfExpression(new NullLiteral(), new NullLiteral(), new NullLiteral());

    // Act and Assert
    assertEquals("(booleanEqual(null, Boolean.TRUE)) ? null : null",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit74() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    IfExpression element = new IfExpression(new LogicNegation(new NullLiteral()), new LogicNegation(new NullLiteral()),
        new LogicNegation(new NullLiteral()));

    // Act and Assert
    assertEquals("(booleanEqual(booleanNot(null), Boolean.TRUE)) ?" + " booleanNot(null) : booleanNot(null)",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit75() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    IfExpression element = new IfExpression(new BooleanLiteral("value"), new BooleanLiteral("value"),
        new BooleanLiteral("value"));

    // Act and Assert
    assertEquals("(booleanEqual(Boolean.FALSE, Boolean.TRUE)) ?" + " Boolean.FALSE : Boolean.FALSE",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit76() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    NamedParameters namedParameters = new NamedParameters(null);

    // Act and Assert
    assertSame(namedParameters, feelToJavaVisitor.visit(namedParameters, FEELContext.makeContext(null)));
    assertTrue(((NamedParameters) feelToJavaVisitor.visit(namedParameters, FEELContext.makeContext(null)))
        .getOriginalArguments() instanceof com.gs.dmn.runtime.interpreter.NamedArguments);
  }

  @Test
  public void testVisit77() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain element = new RangeIteratorDomain(new BooleanLiteral("value"), new BooleanLiteral("value"));

    // Act and Assert
    assertEquals("rangeToList(Boolean.FALSE, Boolean.FALSE)",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit78() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain element = new RangeIteratorDomain(new ArithmeticNegation(new NullLiteral()),
        new ArithmeticNegation(new NullLiteral()));

    // Act and Assert
    assertEquals("rangeToList(numericUnaryMinus(null), numericUnaryMinus" + "(null))",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit79() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain element = new RangeIteratorDomain(new Any(), new Any());

    // Act and Assert
    assertEquals("rangeToList(true, true)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit8() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation element = new LogicNegation(new Name("name"));

    // Act and Assert
    assertEquals("booleanNot(name)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit80() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain element = new RangeIteratorDomain(new LogicNegation(new NullLiteral()),
        new LogicNegation(new NullLiteral()));

    // Act and Assert
    assertEquals("rangeToList(booleanNot(null), booleanNot(null))",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit81() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain element = new RangeIteratorDomain(new ListLiteral(null), new ListLiteral(null));

    // Act and Assert
    assertEquals("rangeToList(asList(), asList())", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit82() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain element = new RangeIteratorDomain(new NumericLiteral("value"), new NumericLiteral("value"));

    // Act and Assert
    assertEquals("rangeToList(number(\"value\"), number(\"value\"))",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit83() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain element = new RangeIteratorDomain(new NullLiteral(), new NullLiteral());

    // Act and Assert
    assertEquals("rangeToList(null, null)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit84() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain element = new RangeIteratorDomain(new Name("name"), new Name("name"));

    // Act and Assert
    assertEquals("rangeToList(name, name)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit85() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    RangeIteratorDomain element = new RangeIteratorDomain(new QualifiedName(stringList), new QualifiedName(stringList));

    // Act and Assert
    assertEquals("rangeToList(foo, foo)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit86() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain element = new RangeIteratorDomain(new Context(null), new Context(null));

    // Act and Assert
    assertEquals("rangeToList(new com.gs.dmn.runtime.Context(), new" + " com.gs.dmn.runtime.Context())",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit87() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    RangeIteratorDomain element = new RangeIteratorDomain(new StringLiteral("value"), new StringLiteral("value"));

    // Act and Assert
    assertEquals("rangeToList(\"value\", \"value\")", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit88() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Disjunction element = new Disjunction(new NullLiteral(), new NullLiteral());

    // Act and Assert
    assertEquals("booleanOr(null, null)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit89() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Disjunction element = new Disjunction(new Name("name"), new Name("name"));

    // Act and Assert
    assertEquals("booleanOr(name, name)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit9() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    LogicNegation element = new LogicNegation(new ArithmeticNegation(new BooleanLiteral("value")));

    // Act and Assert
    assertEquals("booleanNot(numericUnaryMinus(Boolean.FALSE))",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit90() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Disjunction element = new Disjunction(new StringLiteral("value"), new StringLiteral("value"));

    // Act and Assert
    assertEquals("booleanOr(\"value\", \"value\")", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit91() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Disjunction element = new Disjunction(new Any(), new Any());

    // Act and Assert
    assertEquals("booleanOr(true, true)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit92() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Disjunction element = new Disjunction(new BooleanLiteral("value"), new BooleanLiteral("value"));

    // Act and Assert
    assertEquals("booleanOr(Boolean.FALSE, Boolean.FALSE)",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit93() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    Disjunction element = new Disjunction(new QualifiedName(stringList), new QualifiedName(stringList));

    // Act and Assert
    assertEquals("booleanOr(foo, foo)", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit94() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    Disjunction element = new Disjunction(new NumericLiteral("value"), new NumericLiteral("value"));

    // Act and Assert
    assertEquals("booleanOr(number(\"value\"), number(\"value\"))",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit95() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    ArrayList<ContextEntry> contextEntryList = new ArrayList<ContextEntry>();
    ContextEntryKey key = new ContextEntryKey("foo");
    contextEntryList.add(new ContextEntry(key, new NullLiteral()));
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertEquals("new com.gs.dmn.runtime.Context().add(\"foo\", null)",
        feelToJavaVisitor.visit(new Context(contextEntryList), context));
  }

  @Test
  public void testVisit96() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    SimplePositiveUnaryTests element = new SimplePositiveUnaryTests(null);

    // Act and Assert
    assertEquals("booleanOr()", feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit97() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    PathExpression element = new PathExpression(new Any(), "foo");

    // Act and Assert
    assertEquals("((com.gs.dmn.runtime.Context)(true)).get(\"foo\"," + " asList())",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit98() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    PathExpression element = new PathExpression(new NullLiteral(), "foo");

    // Act and Assert
    assertEquals("((com.gs.dmn.runtime.Context)(null)).get(\"foo\"," + " asList())",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit99() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaVisitor feelToJavaVisitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));
    PathExpression element = new PathExpression(new Name("name"), "foo");

    // Act and Assert
    assertEquals("((com.gs.dmn.runtime.Context)(name)).get(\"foo\"," + " asList())",
        feelToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }
}

