package com.gs.dmn.feel.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import ch.qos.logback.classic.spi.TurboFilterList;
import ch.qos.logback.classic.turbo.DuplicateMessageFilter;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.PathExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.ArithmeticNegation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.Context;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntryKey;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.Conversion;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ConversionKind;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionDefinition;
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
import com.gs.dmn.feel.lib.DefaultFEELLib;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.runtime.interpreter.StandardDMNInterpreter;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class FEELInterpreterVisitorDiffblueTest {
  @Test
  public void testConvertArgument() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    TurboFilterList turboFilterList = new TurboFilterList();
    DuplicateMessageFilter duplicateMessageFilter = new DuplicateMessageFilter();
    turboFilterList.add(duplicateMessageFilter);

    // Act and Assert
    assertSame(duplicateMessageFilter, feelInterpreterVisitor.convertArgument(turboFilterList,
        new Conversion(ConversionKind.LIST_TO_ELEMENT, new AnyType())));
  }

  @Test
  public void testConvertArgument2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));

    // Act and Assert
    assertEquals("value",
        feelInterpreterVisitor.convertArgument("value", new Conversion(ConversionKind.NONE, new AnyType())));
  }

  @Test
  public void testVisit() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    NegatedPositiveUnaryTests element = new NegatedPositiveUnaryTests(new PositiveUnaryTests(null));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit10() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    NullLiteral leftOperand = new NullLiteral();
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("foo"));

    // Act and Assert
    assertFalse(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit11() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    NumericLiteral leftOperand = new NumericLiteral("value");
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("foo"));

    // Act and Assert
    assertFalse(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit12() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    StringLiteral leftOperand = new StringLiteral("value");
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("foo"));

    // Act and Assert
    assertTrue(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit13() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("foo", new AnyType()));
    FunctionDefinition functionDefinition = new FunctionDefinition(formalParameterList, new ExpressionList(), true);

    // Act and Assert
    assertSame(functionDefinition, feelInterpreterVisitor.visit(functionDefinition, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit14() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(new NumericLiteral("foo"), context));
  }

  @Test
  public void testVisit15() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    PositionalParameters positionalParameters = new PositionalParameters(null);

    // Act and Assert
    assertSame(positionalParameters, feelInterpreterVisitor.visit(positionalParameters, FEELContext.makeContext(null)));
    assertTrue(
        ((PositionalParameters) feelInterpreterVisitor.visit(positionalParameters, FEELContext.makeContext(null)))
            .getOriginalArguments() instanceof com.gs.dmn.runtime.interpreter.PositionalArguments);
  }

  @Test
  public void testVisit16() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(new NullLiteral(), context));
  }

  @Test
  public void testVisit17() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Conjunction element = new Conjunction(new Any(), new Any());

    // Act and Assert
    assertTrue(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit18() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Conjunction element = new Conjunction(new Context(null), new Context(null));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit19() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Conjunction element = new Conjunction(new ArithmeticNegation(new NullLiteral()),
        new ArithmeticNegation(new NullLiteral()));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertEquals("foo", feelInterpreterVisitor.visit(new StringLiteral("foo"), context));
  }

  @Test
  public void testVisit20() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Conjunction element = new Conjunction(new NumericLiteral("value"), new NumericLiteral("value"));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit21() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Conjunction element = new Conjunction(new ArithmeticNegation(new NumericLiteral("value")),
        new ArithmeticNegation(new NumericLiteral("value")));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit22() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Conjunction element = new Conjunction(new NullLiteral(), new NullLiteral());

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit23() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Conjunction element = new Conjunction(new ListLiteral(null), new ListLiteral(null));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit24() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Conjunction element = new Conjunction(new BooleanLiteral("value"), new BooleanLiteral("value"));

    // Act and Assert
    assertFalse(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit25() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Conjunction element = new Conjunction(new StringLiteral("value"), new StringLiteral("value"));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit26() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertFalse(feelInterpreterVisitor.visit(new BooleanLiteral("foo"), context));
  }

  @Test
  public void testVisit27() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new ListLiteral(null));

    // Act and Assert
    assertEquals(0, ((ArrayList) feelInterpreterVisitor.visit(element, FEELContext.makeContext(null))).size());
  }

  @Test
  public void testVisit28() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    ExpressionTest element = new ExpressionTest(new NullLiteral());

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit29() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    ExpressionTest element = new ExpressionTest(new BooleanLiteral("value"));

    // Act and Assert
    assertFalse(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    LogicNegation element = new LogicNegation(new BooleanLiteral("value"));

    // Act and Assert
    assertTrue(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit30() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    ExpressionTest element = new ExpressionTest(new NumericLiteral("value"));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit31() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    ExpressionTest element = new ExpressionTest(new Any());

    // Act and Assert
    assertTrue(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit32() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertTrue(feelInterpreterVisitor.visit(new Any(), context));
  }

  @Test
  public void testVisit33() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    IfExpression element = new IfExpression(new BooleanLiteral("value"), new BooleanLiteral("value"),
        new BooleanLiteral("value"));

    // Act and Assert
    assertFalse(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit34() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    IfExpression element = new IfExpression(new NullLiteral(), new NullLiteral(), new NullLiteral());

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit35() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    IfExpression element = new IfExpression(new ArithmeticNegation(new NullLiteral()),
        new ArithmeticNegation(new NullLiteral()), new ArithmeticNegation(new NullLiteral()));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit36() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    IfExpression element = new IfExpression(new Context(null), new Context(null), new Context(null));

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Context@0",
        feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)).toString());
  }

  @Test
  public void testVisit37() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    IfExpression element = new IfExpression(new Any(), new Any(), new Any());

    // Act and Assert
    assertTrue(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit38() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    IfExpression element = new IfExpression(new NumericLiteral("value"), new NumericLiteral("value"),
        new NumericLiteral("value"));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit39() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    IfExpression element = new IfExpression(new StringLiteral("value"), new StringLiteral("value"),
        new StringLiteral("value"));

    // Act and Assert
    assertEquals("value", feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    LogicNegation element = new LogicNegation(new NullLiteral());

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit40() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    IfExpression element = new IfExpression(new ListLiteral(null), new ListLiteral(null), new ListLiteral(null));

    // Act and Assert
    assertEquals(0, ((ArrayList) feelInterpreterVisitor.visit(element, FEELContext.makeContext(null))).size());
  }

  @Test
  public void testVisit41() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    IfExpression element = new IfExpression(new LogicNegation(new NullLiteral()), new LogicNegation(new NullLiteral()),
        new LogicNegation(new NullLiteral()));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit42() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    IfExpression element = new IfExpression(new LogicNegation(new BooleanLiteral("value")),
        new LogicNegation(new BooleanLiteral("value")), new LogicNegation(new BooleanLiteral("value")));

    // Act and Assert
    assertTrue(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit43() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    NamedParameters namedParameters = new NamedParameters(null);

    // Act and Assert
    assertSame(namedParameters, feelInterpreterVisitor.visit(namedParameters, FEELContext.makeContext(null)));
    assertTrue(((NamedParameters) feelInterpreterVisitor.visit(namedParameters, FEELContext.makeContext(null)))
        .getOriginalArguments() instanceof com.gs.dmn.runtime.interpreter.NamedArguments);
  }

  @Test
  public void testVisit44() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Disjunction element = new Disjunction(new NullLiteral(), new NullLiteral());

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit45() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Disjunction element = new Disjunction(new Any(), new Any());

    // Act and Assert
    assertTrue(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit46() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Disjunction element = new Disjunction(new BooleanLiteral("value"), new BooleanLiteral("value"));

    // Act and Assert
    assertFalse(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit47() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Disjunction element = new Disjunction(new ArithmeticNegation(new NullLiteral()),
        new ArithmeticNegation(new NullLiteral()));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit48() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Disjunction element = new Disjunction(new NumericLiteral("value"), new NumericLiteral("value"));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit49() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Disjunction element = new Disjunction(new ListLiteral(null), new ListLiteral(null));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    LogicNegation element = new LogicNegation(new Any());

    // Act and Assert
    assertFalse(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit50() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Disjunction element = new Disjunction(new StringLiteral("value"), new StringLiteral("value"));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit51() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Disjunction element = new Disjunction(new Context(null), new Context(null));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit52() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertEquals("foo", feelInterpreterVisitor.visit(new ContextEntryKey("foo"), context));
  }

  @Test
  public void testVisit53() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    SimplePositiveUnaryTests element = new SimplePositiveUnaryTests(null);

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit54() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    PathExpression element = new PathExpression(new Context(null), "member");

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit55() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    NegatedSimplePositiveUnaryTests element = new NegatedSimplePositiveUnaryTests(new SimplePositiveUnaryTests(null));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    LogicNegation element = new LogicNegation(new StringLiteral("value"));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit7() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    LogicNegation element = new LogicNegation(new Context(null));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit8() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    LogicNegation element = new LogicNegation(new NumericLiteral("value"));

    // Act and Assert
    assertNull(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit9() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    FEELInterpreterVisitor feelInterpreterVisitor = new FEELInterpreterVisitor(
        new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()));
    Any leftOperand = new Any();
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("foo"));

    // Act and Assert
    assertTrue(feelInterpreterVisitor.visit(element, FEELContext.makeContext(null)));
  }
}

