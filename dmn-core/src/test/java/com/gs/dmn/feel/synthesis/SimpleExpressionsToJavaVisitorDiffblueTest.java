package com.gs.dmn.feel.synthesis;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.QualifiedName;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.ArithmeticNegation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Exponentiation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.BooleanLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.ListLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NullLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.StringLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.test.Any;
import com.gs.dmn.feel.analysis.syntax.ast.test.ExpressionTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.OperatorTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class SimpleExpressionsToJavaVisitorDiffblueTest {
  @Test
  public void testVisit() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertEquals("-", simpleExpressionsToJavaVisitor.visit(new Any(), context));
  }

  @Test
  public void testVisit10() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    Exponentiation element = new Exponentiation(new ArithmeticNegation(new NullLiteral()),
        new ArithmeticNegation(new NullLiteral()));

    // Act and Assert
    assertEquals("numericExponentiation(numericUnaryMinus(null)," + " numericUnaryMinus(null))",
        simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit11() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    Exponentiation element = new Exponentiation(new BooleanLiteral("value"), new BooleanLiteral("value"));

    // Act and Assert
    assertEquals("numericExponentiation(Boolean.FALSE," + " Boolean.FALSE)",
        simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit12() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    Name element = new Name("name");

    // Act and Assert
    assertEquals("name", simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit13() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertEquals("foo", simpleExpressionsToJavaVisitor.visit(new QualifiedName(stringList), context));
  }

  @Test
  public void testVisit14() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertEquals("null", simpleExpressionsToJavaVisitor.visit(new NullLiteral(), context));
  }

  @Test
  public void testVisit15() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    PositiveUnaryTests element = new PositiveUnaryTests(null);

    // Act and Assert
    assertEquals("", simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit16() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    OperatorTest element = new OperatorTest("operator", new NullLiteral());

    // Act and Assert
    assertEquals("null", simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit17() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    OperatorTest element = new OperatorTest("operator", new QualifiedName(stringList));

    // Act and Assert
    assertEquals("foo", simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit18() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    OperatorTest element = new OperatorTest("operator", new NumericLiteral("value"));

    // Act and Assert
    assertEquals("number(\"value\")", simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit19() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    BooleanLiteral element = new BooleanLiteral("value");

    // Act and Assert
    assertEquals("Boolean.FALSE", simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    StringLiteral element = new StringLiteral("value");

    // Act and Assert
    assertEquals("value", simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit20() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    ExpressionTest element = new ExpressionTest(new NullLiteral());

    // Act and Assert
    assertEquals("null", simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit21() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    ExpressionTest element = new ExpressionTest(new QualifiedName(stringList));

    // Act and Assert
    assertEquals("foo", simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit22() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    ExpressionTest element = new ExpressionTest(new Name("name"));

    // Act and Assert
    assertEquals("name", simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit23() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    ExpressionTest element = new ExpressionTest(new StringLiteral("value"));

    // Act and Assert
    assertEquals("value", simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit24() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    ExpressionTest element = new ExpressionTest(new BooleanLiteral("value"));

    // Act and Assert
    assertEquals("Boolean.FALSE", simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    NumericLiteral element = new NumericLiteral("value");

    // Act and Assert
    assertEquals("number(\"value\")", simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    Exponentiation element = new Exponentiation(new ListLiteral(null), new ListLiteral(null));

    // Act and Assert
    assertEquals("numericExponentiation(asList(), asList())",
        simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    Exponentiation element = new Exponentiation(new Any(), new Any());

    // Act and Assert
    assertEquals("numericExponentiation(-, -)",
        simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    Exponentiation element = new Exponentiation(new NumericLiteral("value"), new NumericLiteral("value"));

    // Act and Assert
    assertEquals("numericExponentiation(number(\"value\")," + " number(\"value\"))",
        simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit7() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    Exponentiation element = new Exponentiation(new Name("name"), new Name("name"));

    // Act and Assert
    assertEquals("numericExponentiation(name, name)",
        simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit8() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    Exponentiation element = new Exponentiation(new StringLiteral("value"), new StringLiteral("value"));

    // Act and Assert
    assertEquals("numericExponentiation(value, value)",
        simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit9() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector,
            stringStringMap));
    Exponentiation element = new Exponentiation(new NullLiteral(), new NullLiteral());

    // Act and Assert
    assertEquals("numericExponentiation(null, null)",
        simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(null)));
  }
}

