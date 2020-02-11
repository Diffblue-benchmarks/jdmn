package com.gs.dmn.feel.analysis.syntax.ast;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Iterator;
import com.gs.dmn.feel.analysis.syntax.ast.expression.IteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.PathExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.QualifiedName;
import com.gs.dmn.feel.analysis.syntax.ast.expression.RangeIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Addition;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.ArithmeticNegation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Exponentiation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic.Multiplication;
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.BetweenExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.InExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.Relational;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.Context;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntry;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.ContextEntryKey;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionDefinition;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionInvocation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameters;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.Parameters;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.PositionalParameters;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.BooleanLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.DateTimeLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.ListLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NullLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.StringLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.Conjunction;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.Disjunction;
import com.gs.dmn.feel.analysis.syntax.ast.expression.logic.LogicNegation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.FilterExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.IfExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.InstanceOfExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.ContextTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.FunctionTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.ListTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.NamedTypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.TypeExpression;
import com.gs.dmn.feel.analysis.syntax.ast.test.Any;
import com.gs.dmn.feel.analysis.syntax.ast.test.ExpressionTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.ListTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.NegatedPositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.NegatedSimplePositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.NullTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.OperatorTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.RangeTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTests;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CloneVisitorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void visitTest48() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NegatedSimplePositiveUnaryTests element = new NegatedSimplePositiveUnaryTests(new SimplePositiveUnaryTests(null));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((NegatedSimplePositiveUnaryTests) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    SimplePositiveUnaryTests simplePositiveUnaryTests = ((NegatedSimplePositiveUnaryTests) actualVisitResult)
        .getSimplePositiveUnaryTests();
    assertTrue(type instanceof AnyType);
    Type actualType = simplePositiveUnaryTests.getType();
    assertEquals("NegatedSimpleUnaryTests(SimplePositiveUnaryTests" + "())", actualToStringResult);
    assertEquals("SimplePositiveUnaryTests()", simplePositiveUnaryTests.toString());
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest47() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    PathExpression element = new PathExpression(new ExpressionList(), "foo");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((PathExpression) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    String actualMember = ((PathExpression) actualVisitResult).getMember();
    Expression source = ((PathExpression) actualVisitResult).getSource();
    assertTrue(type instanceof AnyType);
    Type actualType = source.getType();
    assertEquals("PathExpression(ExpressionList(), foo)", actualToStringResult);
    assertEquals("foo", actualMember);
    assertEquals("ExpressionList()", source.toString());
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest46() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Iterator element = new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    String actualName = ((Iterator) actualVisitResult).getName();
    String actualToStringResult = actualVisitResult.toString();
    IteratorDomain domain = ((Iterator) actualVisitResult).getDomain();
    assertEquals("name", actualName);
    assertEquals("Iterator(name in ExpressionIteratorDomain(ExpressionList" + "()))", actualToStringResult);
    String actualToStringResult1 = domain.toString();
    Expression expression = ((ExpressionIteratorDomain) domain).getExpression();
    assertEquals("ExpressionIteratorDomain(ExpressionList())", actualToStringResult1);
    Type type = expression.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", expression.toString());
  }

  @Test(timeout=10000)
  public void visitTest45() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ListTest element = new ListTest(new ListLiteral(null));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ListTest) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    ListLiteral listLiteral = ((ListTest) actualVisitResult).getListLiteral();
    assertTrue(type instanceof AnyType);
    Type actualType = listLiteral.getType();
    assertEquals("ListTest(ListLiteral())", actualToStringResult);
    assertEquals("ListLiteral()", listLiteral.toString());
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest44() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    SimplePositiveUnaryTests element = new SimplePositiveUnaryTests(null);

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((SimplePositiveUnaryTests) actualVisitResult).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("SimplePositiveUnaryTests()", actualVisitResult.toString());
  }

  @Test(timeout=10000)
  public void visitTest43() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList element = new ExpressionList();

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ExpressionList) actualVisitResult).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", actualVisitResult.toString());
  }

  @Test(timeout=10000)
  public void visitTest42() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ContextEntryKey element = new ContextEntryKey("foo");

    // Act and Assert
    assertEquals("foo", ((ContextEntryKey) cloneVisitor.visit(element, FEELContext.makeContext(null))).getKey());
  }

  @Test(timeout=10000)
  public void visitTest41() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("name");
    FunctionTypeExpression element = new FunctionTypeExpression(null, namedTypeExpression);

    // Act and Assert
    Type type = ((FunctionTypeExpression) cloneVisitor.visit(element, FEELContext.makeContext(null))).getType();
    TypeExpression actualReturnType = ((FunctionTypeExpression) cloneVisitor.visit(element,
        FEELContext.makeContext(null))).getReturnType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(((FunctionTypeExpression) cloneVisitor.visit(element, FEELContext.makeContext(null))).getParameters());
    assertSame(namedTypeExpression, actualReturnType);
  }

  @Test(timeout=10000)
  public void visitTest40() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Context element = new Context(null);

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((Context) actualVisitResult).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Context()", actualVisitResult.toString());
  }

  @Test(timeout=10000)
  public void visitTest39() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList function = new ExpressionList();
    FunctionInvocation element = new FunctionInvocation(function, new NamedParameters(null));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression function1 = ((FunctionInvocation) actualVisitResult).getFunction();
    Type type = ((FunctionInvocation) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    Parameters parameters = ((FunctionInvocation) actualVisitResult).getParameters();
    Type actualType = function1.getType();
    String actualToStringResult1 = function1.toString();
    assertTrue(type instanceof AnyType);
    assertEquals("FunctionInvocation(ExpressionList() ->" + " NamedParameters())", actualToStringResult);
    assertTrue(parameters.isEmpty());
    assertSame(type, actualType);
    assertEquals("ExpressionList()", actualToStringResult1);
  }

  @Test(timeout=10000)
  public void visitTest38() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList leftOperand = new ExpressionList();
    Disjunction element = new Disjunction(leftOperand, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Disjunction) actualVisitResult).getRightOperand();
    Type type = ((Disjunction) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    Expression leftOperand1 = ((Disjunction) actualVisitResult).getLeftOperand();
    assertEquals("or", ((Disjunction) actualVisitResult).getOperator());
    Type actualType = rightOperand.getType();
    String actualToStringResult1 = rightOperand.toString();
    assertTrue(type instanceof AnyType);
    Type actualType1 = leftOperand1.getType();
    assertEquals("Disjunction(ExpressionList(),ExpressionList())", actualToStringResult);
    assertEquals("ExpressionList()", leftOperand1.toString());
    assertSame(type, actualType1);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest37() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList start = new ExpressionList();
    RangeIteratorDomain element = new RangeIteratorDomain(start, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    String actualToStringResult = actualVisitResult.toString();
    Expression start1 = ((RangeIteratorDomain) actualVisitResult).getStart();
    Expression end = ((RangeIteratorDomain) actualVisitResult).getEnd();
    Type actualType = end.getType();
    String actualToStringResult1 = end.toString();
    Type type = start1.getType();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", actualToStringResult);
    assertEquals("ExpressionList()", start1.toString());
    assertTrue(type instanceof AnyType);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest36() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NamedParameters element = new NamedParameters(null);

    // Act and Assert
    assertTrue(((NamedParameters) cloneVisitor.visit(element, FEELContext.makeContext(null))).isEmpty());
  }

  @Test(timeout=10000)
  public void visitTest35() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ListLiteral element = new ListLiteral(null);

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ListLiteral) actualVisitResult).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListLiteral()", actualVisitResult.toString());
  }

  @Test(timeout=10000)
  public void visitTest34() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    OperatorTest element = new OperatorTest("foo", new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((OperatorTest) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    Expression endpoint = ((OperatorTest) actualVisitResult).getEndpoint();
    assertTrue(type instanceof AnyType);
    assertEquals("foo", ((OperatorTest) actualVisitResult).getOperator());
    assertEquals("OperatorTest(foo,ExpressionList())", actualToStringResult);
    Type actualType = endpoint.getType();
    assertEquals("ExpressionList()", endpoint.toString());
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest33() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NamedTypeExpression element = new NamedTypeExpression("name");

    // Act and Assert
    String actualQualifiedName = ((NamedTypeExpression) cloneVisitor.visit(element, FEELContext.makeContext(null)))
        .getQualifiedName();
    assertEquals("name", actualQualifiedName);
    assertTrue(((NamedTypeExpression) cloneVisitor.visit(element, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void visitTest32() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList condition = new ExpressionList();
    ExpressionList thenExpression = new ExpressionList();
    IfExpression element = new IfExpression(condition, thenExpression, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((IfExpression) actualVisitResult).getType();
    Expression thenExpression1 = ((IfExpression) actualVisitResult).getThenExpression();
    String actualToStringResult = actualVisitResult.toString();
    Expression elseExpression = ((IfExpression) actualVisitResult).getElseExpression();
    Expression condition1 = ((IfExpression) actualVisitResult).getCondition();
    assertTrue(type instanceof AnyType);
    Type actualType = condition1.getType();
    String actualToStringResult1 = condition1.toString();
    Type actualType1 = thenExpression1.getType();
    String actualToStringResult2 = thenExpression1.toString();
    Type actualType2 = elseExpression.getType();
    assertEquals("IfExpression(ExpressionList(), ExpressionList()," + " ExpressionList())", actualToStringResult);
    assertEquals("ExpressionList()", elseExpression.toString());
    assertSame(type, actualType2);
    assertEquals("ExpressionList()", actualToStringResult2);
    assertSame(type, actualType1);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest31() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArithmeticNegation element = new ArithmeticNegation(new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression actualRightOperand = ((ArithmeticNegation) actualVisitResult).getRightOperand();
    Type type = ((ArithmeticNegation) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    Expression leftOperand = ((ArithmeticNegation) actualVisitResult).getLeftOperand();
    assertNull(actualRightOperand);
    assertEquals("-", ((ArithmeticNegation) actualVisitResult).getOperator());
    assertEquals("ArithmeticNegation(ExpressionList())", actualToStringResult);
    Type actualType = leftOperand.getType();
    assertTrue(type instanceof AnyType);
    assertSame(type, actualType);
    assertEquals("ExpressionList()", leftOperand.toString());
  }

  @Test(timeout=10000)
  public void visitTest30() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FormalParameter formalParameter = new FormalParameter("name", new AnyType());

    // Act and Assert
    assertSame(formalParameter, cloneVisitor.visit(formalParameter, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest29() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Name element = new Name("name");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((Name) actualVisitResult).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(name)", actualVisitResult.toString());
  }

  @Test(timeout=10000)
  public void visitTest28() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList leftOperand = new ExpressionList();
    Exponentiation element = new Exponentiation(leftOperand, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Exponentiation) actualVisitResult).getRightOperand();
    Type type = ((Exponentiation) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    Expression leftOperand1 = ((Exponentiation) actualVisitResult).getLeftOperand();
    assertEquals("**", ((Exponentiation) actualVisitResult).getOperator());
    Type actualType = rightOperand.getType();
    String actualToStringResult1 = rightOperand.toString();
    assertTrue(type instanceof AnyType);
    Type actualType1 = leftOperand1.getType();
    assertEquals("Exponentiation(ExpressionList(),ExpressionList())", actualToStringResult);
    assertEquals("ExpressionList()", leftOperand1.toString());
    assertSame(type, actualType1);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest27() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    InExpression element = new InExpression(value, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    Type type = ((InExpression) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    Type actualType = value1.getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), NullTest())", actualToStringResult);
    assertEquals("ExpressionList()", value1.toString());
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest26() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList leftOperand = new ExpressionList();
    Relational element = new Relational("foo", leftOperand, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Relational) actualVisitResult).getRightOperand();
    Type type = ((Relational) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    Expression leftOperand1 = ((Relational) actualVisitResult).getLeftOperand();
    assertEquals("foo", ((Relational) actualVisitResult).getOperator());
    Type actualType = rightOperand.getType();
    String actualToStringResult1 = rightOperand.toString();
    assertTrue(type instanceof AnyType);
    Type actualType1 = leftOperand1.getType();
    assertEquals("Relational(foo,ExpressionList(),ExpressionList())", actualToStringResult);
    assertEquals("ExpressionList()", leftOperand1.toString());
    assertSame(type, actualType1);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest25() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ContextTypeExpression element = new ContextTypeExpression(null);

    // Act and Assert
    Type type = ((ContextTypeExpression) cloneVisitor.visit(element, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(((ContextTypeExpression) cloneVisitor.visit(element, FEELContext.makeContext(null))).getMembers());
  }

  @Test(timeout=10000)
  public void visitTest24() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ListTypeExpression element = new ListTypeExpression(new NamedTypeExpression("name"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ListTypeExpression) actualVisitResult).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListTypeExpression(NamedTypeExpression(name))", actualVisitResult.toString());
  }

  @Test(timeout=10000)
  public void visitTest23() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Any any = new Any();

    // Act and Assert
    assertSame(any, cloneVisitor.visit(any, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest22() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    ExpressionList leftEndpoint = new ExpressionList();
    BetweenExpression element = new BetweenExpression(value, leftEndpoint, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((BetweenExpression) actualVisitResult).getValue();
    Type type = ((BetweenExpression) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    Expression leftEndpoint1 = ((BetweenExpression) actualVisitResult).getLeftEndpoint();
    Expression rightEndpoint = ((BetweenExpression) actualVisitResult).getRightEndpoint();
    Type actualType = value1.getType();
    String actualToStringResult1 = value1.toString();
    Type actualType1 = rightEndpoint.getType();
    String actualToStringResult2 = rightEndpoint.toString();
    assertTrue(type instanceof AnyType);
    Type actualType2 = leftEndpoint1.getType();
    assertEquals("BetweenExpression(ExpressionList(), ExpressionList()," + " ExpressionList())", actualToStringResult);
    assertEquals("ExpressionList()", leftEndpoint1.toString());
    assertSame(type, actualType2);
    assertEquals("ExpressionList()", actualToStringResult2);
    assertSame(type, actualType1);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest21() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionTest element = new ExpressionTest(new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ExpressionTest) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    Expression expression = ((ExpressionTest) actualVisitResult).getExpression();
    assertTrue(type instanceof AnyType);
    Type actualType = expression.getType();
    assertEquals("ExpressionTest(ExpressionList())", actualToStringResult);
    assertEquals("ExpressionList()", expression.toString());
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest20() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    String actualToStringResult = actualVisitResult.toString();
    Expression expression = ((ExpressionIteratorDomain) actualVisitResult).getExpression();
    assertEquals("ExpressionIteratorDomain(ExpressionList())", actualToStringResult);
    Type type = expression.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", expression.toString());
  }

  @Test(timeout=10000)
  public void visitTest19() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BooleanLiteral element = new BooleanLiteral("value");

    // Act and Assert
    Type type = ((BooleanLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", ((BooleanLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null))).getLexeme());
  }

  @Test(timeout=10000)
  public void visitTest18() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList leftOperand = new ExpressionList();
    Conjunction element = new Conjunction(leftOperand, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Conjunction) actualVisitResult).getRightOperand();
    Type type = ((Conjunction) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    Expression leftOperand1 = ((Conjunction) actualVisitResult).getLeftOperand();
    assertEquals("and", ((Conjunction) actualVisitResult).getOperator());
    Type actualType = rightOperand.getType();
    String actualToStringResult1 = rightOperand.toString();
    assertTrue(type instanceof AnyType);
    Type actualType1 = leftOperand1.getType();
    assertEquals("Conjunction(ExpressionList(),ExpressionList())", actualToStringResult);
    assertEquals("ExpressionList()", leftOperand1.toString());
    assertSame(type, actualType1);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest17() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NullTest nullTest = new NullTest();

    // Act and Assert
    assertSame(nullTest, cloneVisitor.visit(nullTest, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest16() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    PositiveUnaryTests element = new PositiveUnaryTests(null);

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((PositiveUnaryTests) actualVisitResult).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PositiveUnaryTests()", actualVisitResult.toString());
  }

  @Test(timeout=10000)
  public void visitTest15() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NullLiteral element = new NullLiteral();

    // Act and Assert
    assertTrue(((NullLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void visitTest14() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    PositionalParameters element = new PositionalParameters(null);

    // Act and Assert
    assertTrue(((PositionalParameters) cloneVisitor.visit(element, FEELContext.makeContext(null))).isEmpty());
  }

  @Test(timeout=10000)
  public void visitTest13() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ContextEntryKey key = new ContextEntryKey("foo");
    ContextEntry element = new ContextEntry(key, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    String actualToStringResult = actualVisitResult.toString();
    ContextEntryKey key1 = ((ContextEntry) actualVisitResult).getKey();
    Expression expression = ((ContextEntry) actualVisitResult).getExpression();
    assertEquals("ContextEntry(ContextEntryKey(foo) =" + " ExpressionList())", actualToStringResult);
    String actualToStringResult1 = key1.toString();
    Type type = expression.getType();
    assertEquals("ContextEntryKey(foo)", actualToStringResult1);
    assertEquals("ExpressionList()", expression.toString());
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void visitTest12() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList leftOperand = new ExpressionList();
    Multiplication element = new Multiplication("foo", leftOperand, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Multiplication) actualVisitResult).getRightOperand();
    Type type = ((Multiplication) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    Expression leftOperand1 = ((Multiplication) actualVisitResult).getLeftOperand();
    assertEquals("foo", ((Multiplication) actualVisitResult).getOperator());
    Type actualType = rightOperand.getType();
    String actualToStringResult1 = rightOperand.toString();
    assertTrue(type instanceof AnyType);
    Type actualType1 = leftOperand1.getType();
    assertEquals("Multiplication(foo,ExpressionList(),ExpressionList" + "())", actualToStringResult);
    assertEquals("ExpressionList()", leftOperand1.toString());
    assertSame(type, actualType1);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest11() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList leftOperand = new ExpressionList();
    Addition element = new Addition("foo", leftOperand, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Addition) actualVisitResult).getRightOperand();
    Type type = ((Addition) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    Expression leftOperand1 = ((Addition) actualVisitResult).getLeftOperand();
    assertEquals("foo", ((Addition) actualVisitResult).getOperator());
    Type actualType = rightOperand.getType();
    String actualToStringResult1 = rightOperand.toString();
    assertTrue(type instanceof AnyType);
    Type actualType1 = leftOperand1.getType();
    assertEquals("Addition(foo,ExpressionList(),ExpressionList())", actualToStringResult);
    assertEquals("ExpressionList()", leftOperand1.toString());
    assertSame(type, actualType1);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest10() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    QualifiedName element = new QualifiedName(null);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    cloneVisitor.visit(element, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void visitTest9() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList source = new ExpressionList();
    FilterExpression element = new FilterExpression(source, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((FilterExpression) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    Expression filter = ((FilterExpression) actualVisitResult).getFilter();
    Expression source1 = ((FilterExpression) actualVisitResult).getSource();
    assertTrue(type instanceof AnyType);
    Type actualType = source1.getType();
    String actualToStringResult1 = source1.toString();
    assertEquals("FilterExpression(ExpressionList()," + " ExpressionList())", actualToStringResult);
    Type actualType1 = filter.getType();
    assertEquals("ExpressionList()", filter.toString());
    assertSame(type, actualType1);
    assertSame(type, actualType);
    assertEquals("ExpressionList()", actualToStringResult1);
  }

  @Test(timeout=10000)
  public void visitTest8() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NumericLiteral element = new NumericLiteral("value");

    // Act and Assert
    Type type = ((NumericLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", ((NumericLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null))).getLexeme());
  }

  @Test(timeout=10000)
  public void visitTest7() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    DateTimeLiteral element = new DateTimeLiteral("foo", "foo");

    // Act and Assert
    Type type = ((DateTimeLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null))).getType();
    String actualLexeme = ((DateTimeLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null))).getLexeme();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("foo",
        ((DateTimeLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null))).getConversionFunction());
    assertEquals("foo", actualLexeme);
  }

  @Test(timeout=10000)
  public void visitTest6() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FunctionDefinition functionDefinition = new FunctionDefinition(null, new ExpressionList(), true);

    // Act and Assert
    assertSame(functionDefinition, cloneVisitor.visit(functionDefinition, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest5() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList leftOperand = new ExpressionList();
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("name"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    Expression leftOperand1 = ((InstanceOfExpression) actualVisitResult).getLeftOperand();
    TypeExpression rightOperand = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    assertTrue(type instanceof AnyType);
    Type actualType = rightOperand.getType();
    String actualToStringResult1 = rightOperand.toString();
    assertEquals("InstanceOfExpression(ExpressionList(), NamedTypeExpression" + "(name))", actualToStringResult);
    Type actualType1 = leftOperand1.getType();
    assertEquals("NamedTypeExpression(name)", actualToStringResult1);
    assertEquals("ExpressionList()", leftOperand1.toString());
    assertSame(type, actualType1);
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest4() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    LogicNegation element = new LogicNegation(new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression actualRightOperand = ((LogicNegation) actualVisitResult).getRightOperand();
    Type type = ((LogicNegation) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    Expression leftOperand = ((LogicNegation) actualVisitResult).getLeftOperand();
    assertNull(actualRightOperand);
    assertEquals("not", ((LogicNegation) actualVisitResult).getOperator());
    assertEquals("LogicNegation(ExpressionList())", actualToStringResult);
    Type actualType = leftOperand.getType();
    assertTrue(type instanceof AnyType);
    assertSame(type, actualType);
    assertEquals("ExpressionList()", leftOperand.toString());
  }

  @Test(timeout=10000)
  public void visitTest3() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    StringLiteral element = new StringLiteral("value");

    // Act and Assert
    Type type = ((StringLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", ((StringLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null))).getLexeme());
  }

  @Test(timeout=10000)
  public void visitTest2() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NegatedPositiveUnaryTests element = new NegatedPositiveUnaryTests(new PositiveUnaryTests(null));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((NegatedPositiveUnaryTests) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    PositiveUnaryTests positiveUnaryTests = ((NegatedPositiveUnaryTests) actualVisitResult).getPositiveUnaryTests();
    assertTrue(type instanceof AnyType);
    Type actualType = positiveUnaryTests.getType();
    assertEquals("NegatedUnaryTests(PositiveUnaryTests())", actualToStringResult);
    assertEquals("PositiveUnaryTests()", positiveUnaryTests.toString());
    assertSame(type, actualType);
  }

  @Test(timeout=10000)
  public void visitTest() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList start = new ExpressionList();
    RangeTest element = new RangeTest(true, start, true, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    String actualToStringResult = actualVisitResult.toString();
    boolean actualIsOpenStartResult = ((RangeTest) actualVisitResult).isOpenStart();
    Expression start1 = ((RangeTest) actualVisitResult).getStart();
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())", actualToStringResult);
    Type actualType = end.getType();
    String actualToStringResult1 = end.toString();
    assertTrue(actualIsOpenStartResult);
    Type actualType1 = start1.getType();
    assertEquals("ExpressionList()", actualToStringResult1);
    assertEquals("ExpressionList()", start1.toString());
    assertSame(type, actualType1);
    assertSame(type, actualType);
  }
}

