package com.gs.dmn.feel.analysis.syntax.ast;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.ForExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.IfExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.InstanceOfExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.textual.QuantifiedExpression;
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
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.PositiveUnaryTests;
import com.gs.dmn.feel.analysis.syntax.ast.test.RangeTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTest;
import com.gs.dmn.feel.analysis.syntax.ast.test.SimplePositiveUnaryTests;
import com.gs.dmn.runtime.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.collections.FastArrayList;
import org.junit.Test;

public class CloneVisitorDiffblueTest {
  @Test
  public void testVisit() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new ListLiteral(null), true, new ListLiteral(null));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    assertEquals("IntervalTest(true,ListLiteral(),true" + ",ListLiteral())", actualVisitResult.toString());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    String actualToStringResult = end.toString();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertEquals("ListLiteral()", actualToStringResult);
    assertEquals("ListLiteral()", start.toString());
    assertSame(type, start.getType());
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit10() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new LogicNegation(new ArithmeticNegation(new ExpressionList())), true,
        new LogicNegation(new ArithmeticNegation(new ExpressionList())));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals(
        "IntervalTest(true,LogicNegation(ArithmeticNegation"
            + "(ExpressionList())),true,LogicNegation(ArithmeticNegation" + "(ExpressionList())))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    String actualOperator = ((LogicNegation) start).getOperator();
    Expression leftOperand = ((LogicNegation) end).getLeftOperand();
    assertEquals("not", actualOperator);
    String actualOperator1 = ((ArithmeticNegation) leftOperand).getOperator();
    Expression leftOperand1 = ((LogicNegation) start).getLeftOperand();
    assertEquals("LogicNegation(ArithmeticNegation(ExpressionList" + "()))", end.toString());
    String actualOperator2 = ((ArithmeticNegation) leftOperand1).getOperator();
    assertNull(((LogicNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("LogicNegation(ArithmeticNegation(ExpressionList" + "()))", start.toString());
    assertEquals("not", ((LogicNegation) end).getOperator());
    assertNull(((LogicNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("-", actualOperator2);
    assertSame(type, leftOperand.getType());
    assertEquals("-", actualOperator1);
    Expression leftOperand2 = ((ArithmeticNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand2.toString();
    assertNull(((ArithmeticNegation) leftOperand1).getRightOperand());
    assertEquals("ArithmeticNegation(ExpressionList())", leftOperand1.toString());
    assertEquals("ArithmeticNegation(ExpressionList())", leftOperand.toString());
    assertSame(type, leftOperand1.getType());
    Expression leftOperand3 = ((ArithmeticNegation) leftOperand1).getLeftOperand();
    String actualToStringResult1 = leftOperand3.toString();
    assertNull(((ArithmeticNegation) leftOperand).getRightOperand());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand3.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand2.getType());
  }

  @Test
  public void testVisit100() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    Addition element = new Addition("operator", new QualifiedName(stringList), new QualifiedName(stringList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Addition) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Addition) actualVisitResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    Expression leftOperand = ((Addition) actualVisitResult).getLeftOperand();
    Type type = ((Addition) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualName1 = ((Name) leftOperand).getName();
    assertEquals("Addition(operator,Name(foo),Name(foo))", actualVisitResult.toString());
    assertEquals("foo", actualName1);
    assertSame(type, leftOperand.getType());
    assertEquals("foo", actualName);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit101() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Multiplication element = new Multiplication("operator", new BooleanLiteral("value"), new BooleanLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Multiplication) actualVisitResult).getOperator());
    Expression rightOperand = ((Multiplication) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Multiplication) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Multiplication) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Multiplication(operator,BooleanLiteral(value)" + ",BooleanLiteral(value))",
        actualVisitResult.toString());
    assertEquals("BooleanLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("BooleanLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit102() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Multiplication element = new Multiplication("operator",
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""),
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Multiplication) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Multiplication) actualVisitResult).getOperator());
    Expression leftOperand = ((Multiplication) actualVisitResult).getLeftOperand();
    Type type = ((Multiplication) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Multiplication(operator,DateTimeLiteral(0.8.9,"
        + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?(" + "[0-9]+(\\.[0-9]*)?S)?\"),DateTimeLiteral(0.8.9,"
        + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?(" + "[0-9]+(\\.[0-9]*)?S)?\"))",
        actualVisitResult.toString());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) leftOperand).getLexeme());
    assertSame(type, leftOperand.getType());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) rightOperand).getLexeme());
    assertSame(type, rightOperand.getType());
    assertEquals("0.8.9", ((DateTimeLiteral) leftOperand).getConversionFunction());
    assertEquals("0.8.9", ((DateTimeLiteral) rightOperand).getConversionFunction());
  }

  @Test
  public void testVisit103() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Multiplication element = new Multiplication("operator", new ArithmeticNegation(new ExpressionList()),
        new ArithmeticNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Multiplication) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Multiplication) actualVisitResult).getOperator());
    String actualOperator = ((ArithmeticNegation) rightOperand).getOperator();
    Expression leftOperand = ((Multiplication) actualVisitResult).getLeftOperand();
    Type type = ((Multiplication) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals(
        "Multiplication(operator,ArithmeticNegation(ExpressionList" + "()),ArithmeticNegation(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("ArithmeticNegation(ExpressionList())", leftOperand.toString());
    Expression leftOperand1 = ((ArithmeticNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand1.toString();
    assertSame(type, leftOperand.getType());
    assertEquals("-", actualOperator);
    assertNull(((ArithmeticNegation) rightOperand).getRightOperand());
    assertNull(((ArithmeticNegation) leftOperand).getRightOperand());
    assertSame(type, rightOperand.getType());
    assertEquals("ArithmeticNegation(ExpressionList())", rightOperand.toString());
    Expression leftOperand2 = ((ArithmeticNegation) rightOperand).getLeftOperand();
    String actualToStringResult1 = leftOperand2.toString();
    assertEquals("-", ((ArithmeticNegation) leftOperand).getOperator());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit104() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Multiplication element = new Multiplication("operator", new NamedTypeExpression("qualifiedName"),
        new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Multiplication) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Multiplication) actualVisitResult).getOperator());
    String actualQualifiedName = ((NamedTypeExpression) rightOperand).getQualifiedName();
    Expression leftOperand = ((Multiplication) actualVisitResult).getLeftOperand();
    Type type = ((Multiplication) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualQualifiedName1 = ((NamedTypeExpression) leftOperand).getQualifiedName();
    assertEquals("Multiplication(operator,NamedTypeExpression(qualifiedName" + "),NamedTypeExpression(qualifiedName))",
        actualVisitResult.toString());
    assertSame(type, leftOperand.getType());
    assertEquals("qualifiedName", actualQualifiedName1);
    assertSame(type, rightOperand.getType());
    assertEquals("qualifiedName", actualQualifiedName);
  }

  @Test
  public void testVisit105() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Multiplication element = new Multiplication("operator", new ExpressionList(), new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Multiplication) actualVisitResult).getOperator());
    Expression rightOperand = ((Multiplication) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Multiplication) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Multiplication) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Multiplication(operator,ExpressionList(),ExpressionList" + "())", actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit106() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Multiplication element = new Multiplication("operator", new Name("name"), new Name("name"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Multiplication) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Multiplication) actualVisitResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    Expression leftOperand = ((Multiplication) actualVisitResult).getLeftOperand();
    Type type = ((Multiplication) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualName1 = ((Name) leftOperand).getName();
    assertEquals("Multiplication(operator,Name(name),Name(name))", actualVisitResult.toString());
    assertEquals("name", actualName1);
    assertSame(type, leftOperand.getType());
    assertEquals("name", actualName);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit107() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Multiplication element = new Multiplication("operator", new LogicNegation(new ExpressionList()),
        new LogicNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Multiplication) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Multiplication) actualVisitResult).getOperator());
    String actualOperator = ((LogicNegation) rightOperand).getOperator();
    Expression leftOperand = ((Multiplication) actualVisitResult).getLeftOperand();
    Type type = ((Multiplication) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Multiplication(operator,LogicNegation(ExpressionList" + "()),LogicNegation(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("LogicNegation(ExpressionList())", leftOperand.toString());
    Expression leftOperand1 = ((LogicNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand1.toString();
    assertSame(type, leftOperand.getType());
    assertEquals("not", actualOperator);
    assertNull(((LogicNegation) rightOperand).getRightOperand());
    assertNull(((LogicNegation) leftOperand).getRightOperand());
    assertSame(type, rightOperand.getType());
    assertEquals("LogicNegation(ExpressionList())", rightOperand.toString());
    Expression leftOperand2 = ((LogicNegation) rightOperand).getLeftOperand();
    String actualToStringResult1 = leftOperand2.toString();
    assertEquals("not", ((LogicNegation) leftOperand).getOperator());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit108() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    Multiplication element = new Multiplication("operator", new QualifiedName(stringList),
        new QualifiedName(stringList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Multiplication) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Multiplication) actualVisitResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    Expression leftOperand = ((Multiplication) actualVisitResult).getLeftOperand();
    Type type = ((Multiplication) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualName1 = ((Name) leftOperand).getName();
    assertEquals("Multiplication(operator,Name(foo),Name(foo))", actualVisitResult.toString());
    assertEquals("foo", actualName1);
    assertSame(type, leftOperand.getType());
    assertEquals("foo", actualName);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit109() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    Multiplication element = new Multiplication("operator", new ListLiteral(expressionList),
        new ListLiteral(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Multiplication) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Multiplication) actualVisitResult).getOperator());
    List<Expression> expressionList1 = ((ListLiteral) rightOperand).getExpressionList();
    Expression leftOperand = ((Multiplication) actualVisitResult).getLeftOperand();
    Type type = ((Multiplication) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    List<Expression> expressionList2 = ((ListLiteral) leftOperand).getExpressionList();
    assertEquals("Multiplication(operator,ListLiteral(ExpressionList" + "()),ListLiteral(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("ListLiteral(ExpressionList())", leftOperand.toString());
    assertSame(type, leftOperand.getType());
    assertEquals("ListLiteral(ExpressionList())", rightOperand.toString());
    assertSame(type, rightOperand.getType());
    Expression getResult = expressionList2.get(0);
    Expression getResult1 = expressionList1.get(0);
    String actualToStringResult = getResult.toString();
    assertEquals("ExpressionList()", getResult1.toString());
    assertSame(type, getResult1.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, getResult.getType());
  }

  @Test
  public void testVisit11() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true,
        new ArithmeticNegation(new DateTimeLiteral("0.8.9",
            "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"")),
        true, new ArithmeticNegation(new DateTimeLiteral("0.8.9",
            "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals(
        "IntervalTest(true,ArithmeticNegation(DateTimeLiteral" + "(0.8.9, \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0"
            + "-9]+H)?([0-9]+(\\.[0-9]*)?S)?\")),true,ArithmeticNegation"
            + "(DateTimeLiteral(0.8.9, \"[-]?P([0-9]+D)?T?([0-9]" + "+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0-9]*)?S)?\"))"
            + ")",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    String actualOperator = ((ArithmeticNegation) start).getOperator();
    Expression leftOperand = ((ArithmeticNegation) end).getLeftOperand();
    assertEquals("-", actualOperator);
    String actualConversionFunction = ((DateTimeLiteral) leftOperand).getConversionFunction();
    Expression leftOperand1 = ((ArithmeticNegation) start).getLeftOperand();
    String actualConversionFunction1 = ((DateTimeLiteral) leftOperand1).getConversionFunction();
    assertEquals("ArithmeticNegation(DateTimeLiteral(0.8.9," + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?("
        + "[0-9]+(\\.[0-9]*)?S)?\"))", end.toString());
    assertNull(((ArithmeticNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("ArithmeticNegation(DateTimeLiteral(0.8.9," + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?("
        + "[0-9]+(\\.[0-9]*)?S)?\"))", start.toString());
    assertEquals("-", ((ArithmeticNegation) end).getOperator());
    assertNull(((ArithmeticNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) leftOperand).getLexeme());
    assertEquals("0.8.9", actualConversionFunction);
    assertSame(type, leftOperand.getType());
    assertSame(type, leftOperand1.getType());
    assertEquals("0.8.9", actualConversionFunction1);
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) leftOperand1).getLexeme());
  }

  @Test
  public void testVisit110() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Multiplication element = new Multiplication("operator", new NumericLiteral("value"), new NumericLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Multiplication) actualVisitResult).getOperator());
    Expression rightOperand = ((Multiplication) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Multiplication) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Multiplication) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Multiplication(operator,NumericLiteral(value)" + ",NumericLiteral(value))",
        actualVisitResult.toString());
    assertEquals("NumericLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("NumericLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit111() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Multiplication element = new Multiplication("operator", new NullTest(), new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Multiplication) actualVisitResult).getOperator());
    assertTrue(
        ((Multiplication) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Multiplication(operator,NullTest(),NullTest())", actualVisitResult.toString());
  }

  @Test
  public void testVisit112() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Multiplication element = new Multiplication("operator", new NullLiteral(), new NullLiteral());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Multiplication) actualVisitResult).getOperator());
    Type actualType = ((Multiplication) actualVisitResult).getRightOperand().getType();
    Type type = ((Multiplication) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Type actualType1 = ((Multiplication) actualVisitResult).getLeftOperand().getType();
    assertEquals("Multiplication(operator,NullLiteral()" + ",NullLiteral())", actualVisitResult.toString());
    assertSame(type, actualType1);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit113() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Multiplication element = new Multiplication("operator", new Any(), new Any());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Multiplication) actualVisitResult).getOperator());
    assertTrue(
        ((Multiplication) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Multiplication(operator,Any(),Any())", actualVisitResult.toString());
  }

  @Test
  public void testVisit114() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Multiplication element = new Multiplication("operator", new StringLiteral("value"), new StringLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Multiplication) actualVisitResult).getOperator());
    Expression rightOperand = ((Multiplication) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Multiplication) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Multiplication) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Multiplication(operator,StringLiteral(value)" + ",StringLiteral(value))",
        actualVisitResult.toString());
    assertEquals("StringLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("StringLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit115() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Multiplication element = new Multiplication("operator", new Context(null), new Context(null));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Multiplication) actualVisitResult).getOperator());
    Expression rightOperand = ((Multiplication) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Multiplication) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Multiplication) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Multiplication(operator,Context(),Context())", actualVisitResult.toString());
    assertEquals("Context()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("Context()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit116() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>(1);
    expressionList.add(new ExpressionList());
    expressionList.add(new ExpressionList());
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertFalse(
        ((PositionalParameters) cloneVisitor.visit(new PositionalParameters(expressionList), context)).isEmpty());
    List<Expression> parameters = ((PositionalParameters) cloneVisitor.visit(new PositionalParameters(expressionList),
        context)).getParameters();
    Expression getResult = parameters.get(0);
    Expression getResult1 = parameters.get(1);
    assertTrue(((PositionalParameters) cloneVisitor.visit(new PositionalParameters(expressionList), context))
        .getSignature() instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.function.PositionalParameterTypes);
    String actualToStringResult = getResult1.toString();
    assertEquals("ExpressionList()", getResult.toString());
    assertTrue(getResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", actualToStringResult);
  }

  @Test
  public void testVisit117() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertFalse(
        ((PositionalParameters) cloneVisitor.visit(new PositionalParameters(expressionList), context)).isEmpty());
    Expression getResult = ((PositionalParameters) cloneVisitor.visit(new PositionalParameters(expressionList),
        context)).getParameters().get(0);
    assertEquals("ExpressionList()", getResult.toString());
    assertTrue(getResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testVisit118() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FastArrayList fastArrayList = new FastArrayList();
    fastArrayList.add("foo");
    fastArrayList.add(new ExpressionList());
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertTrue(((PositionalParameters) cloneVisitor.visit(new PositionalParameters(fastArrayList), context)).isEmpty());
  }

  @Test
  public void testVisit119() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FEELContext context = FEELContext.makeContext(null);

    // Act and Assert
    assertTrue(((NullLiteral) cloneVisitor.visit(new NullLiteral(), context))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testVisit12() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new ArithmeticNegation(new NamedTypeExpression("qualifiedName")), true,
        new ArithmeticNegation(new NamedTypeExpression("qualifiedName")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals(
        "IntervalTest(true,ArithmeticNegation(NamedTypeExpression"
            + "(qualifiedName)),true,ArithmeticNegation(NamedType" + "Expression(qualifiedName)))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    String actualOperator = ((ArithmeticNegation) start).getOperator();
    Expression leftOperand = ((ArithmeticNegation) end).getLeftOperand();
    assertEquals("-", actualOperator);
    String actualQualifiedName = ((NamedTypeExpression) leftOperand).getQualifiedName();
    Expression leftOperand1 = ((ArithmeticNegation) start).getLeftOperand();
    assertEquals("ArithmeticNegation(NamedTypeExpression" + "(qualifiedName))", end.toString());
    assertNull(((ArithmeticNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("ArithmeticNegation(NamedTypeExpression" + "(qualifiedName))", start.toString());
    assertEquals("-", ((ArithmeticNegation) end).getOperator());
    assertNull(((ArithmeticNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertSame(type, leftOperand.getType());
    assertSame(type, leftOperand1.getType());
    assertEquals("qualifiedName", actualQualifiedName);
    assertEquals("NamedTypeExpression(qualifiedName)", leftOperand1.toString());
  }

  @Test
  public void testVisit120() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());
    FEELContext context = FEELContext.makeContext(null);

    // Act
    Object actualVisitResult = cloneVisitor.visit(new PositiveUnaryTests(positiveUnaryTestList), context);

    // Assert
    assertTrue(
        ((PositiveUnaryTests) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PositiveUnaryTests(NullTest())", actualVisitResult.toString());
  }

  @Test
  public void testVisit121() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FEELContext context = FEELContext.makeContext(null);
    NullTest nullTest = new NullTest();

    // Act and Assert
    assertSame(nullTest, cloneVisitor.visit(nullTest, context));
  }

  @Test
  public void testVisit122() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Conjunction element = new Conjunction(new LogicNegation(new ExpressionList()),
        new LogicNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Conjunction) actualVisitResult).getRightOperand();
    assertEquals("and", ((Conjunction) actualVisitResult).getOperator());
    String actualOperator = ((LogicNegation) rightOperand).getOperator();
    Expression leftOperand = ((Conjunction) actualVisitResult).getLeftOperand();
    Type type = ((Conjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Conjunction(LogicNegation(ExpressionList()),LogicNegation" + "(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("LogicNegation(ExpressionList())", leftOperand.toString());
    Expression leftOperand1 = ((LogicNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand1.toString();
    assertSame(type, leftOperand.getType());
    assertEquals("not", actualOperator);
    assertNull(((LogicNegation) rightOperand).getRightOperand());
    assertNull(((LogicNegation) leftOperand).getRightOperand());
    assertSame(type, rightOperand.getType());
    assertEquals("LogicNegation(ExpressionList())", rightOperand.toString());
    Expression leftOperand2 = ((LogicNegation) rightOperand).getLeftOperand();
    String actualToStringResult1 = leftOperand2.toString();
    assertEquals("not", ((LogicNegation) leftOperand).getOperator());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit123() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    Conjunction element = new Conjunction(new ListLiteral(expressionList), new ListLiteral(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Conjunction) actualVisitResult).getRightOperand();
    assertEquals("and", ((Conjunction) actualVisitResult).getOperator());
    List<Expression> expressionList1 = ((ListLiteral) rightOperand).getExpressionList();
    Expression leftOperand = ((Conjunction) actualVisitResult).getLeftOperand();
    Type type = ((Conjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    List<Expression> expressionList2 = ((ListLiteral) leftOperand).getExpressionList();
    assertEquals("Conjunction(ListLiteral(ExpressionList()),ListLiteral" + "(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("ListLiteral(ExpressionList())", leftOperand.toString());
    assertSame(type, leftOperand.getType());
    assertEquals("ListLiteral(ExpressionList())", rightOperand.toString());
    assertSame(type, rightOperand.getType());
    Expression getResult = expressionList2.get(0);
    Expression getResult1 = expressionList1.get(0);
    String actualToStringResult = getResult.toString();
    assertEquals("ExpressionList()", getResult1.toString());
    assertSame(type, getResult1.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, getResult.getType());
  }

  @Test
  public void testVisit124() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Conjunction element = new Conjunction(new StringLiteral("value"), new StringLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("and", ((Conjunction) actualVisitResult).getOperator());
    Expression rightOperand = ((Conjunction) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Conjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Conjunction) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Conjunction(StringLiteral(value),StringLiteral" + "(value))", actualVisitResult.toString());
    assertEquals("StringLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("StringLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit125() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Conjunction element = new Conjunction(new Name("name"), new Name("name"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Conjunction) actualVisitResult).getRightOperand();
    assertEquals("and", ((Conjunction) actualVisitResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    Expression leftOperand = ((Conjunction) actualVisitResult).getLeftOperand();
    Type type = ((Conjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualName1 = ((Name) leftOperand).getName();
    assertEquals("Conjunction(Name(name),Name(name))", actualVisitResult.toString());
    assertEquals("name", actualName1);
    assertSame(type, leftOperand.getType());
    assertEquals("name", actualName);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit126() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Conjunction element = new Conjunction(new NamedTypeExpression("qualifiedName"),
        new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Conjunction) actualVisitResult).getRightOperand();
    assertEquals("and", ((Conjunction) actualVisitResult).getOperator());
    String actualQualifiedName = ((NamedTypeExpression) rightOperand).getQualifiedName();
    Expression leftOperand = ((Conjunction) actualVisitResult).getLeftOperand();
    Type type = ((Conjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualQualifiedName1 = ((NamedTypeExpression) leftOperand).getQualifiedName();
    assertEquals("Conjunction(NamedTypeExpression(qualifiedName)" + ",NamedTypeExpression(qualifiedName))",
        actualVisitResult.toString());
    assertSame(type, leftOperand.getType());
    assertEquals("qualifiedName", actualQualifiedName1);
    assertSame(type, rightOperand.getType());
    assertEquals("qualifiedName", actualQualifiedName);
  }

  @Test
  public void testVisit127() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Conjunction element = new Conjunction(new NullTest(), new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("and", ((Conjunction) actualVisitResult).getOperator());
    assertTrue(((Conjunction) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Conjunction(NullTest(),NullTest())", actualVisitResult.toString());
  }

  @Test
  public void testVisit128() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Conjunction element = new Conjunction(
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""),
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Conjunction) actualVisitResult).getRightOperand();
    assertEquals("and", ((Conjunction) actualVisitResult).getOperator());
    Expression leftOperand = ((Conjunction) actualVisitResult).getLeftOperand();
    Type type = ((Conjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Conjunction(DateTimeLiteral(0.8.9, \"[-]?P([0-9]+D"
        + ")?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0-9" + "]*)?S)?\"),DateTimeLiteral(0.8.9, \"[-]?P([0-9]+D)"
        + "?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0-9]" + "*)?S)?\"))", actualVisitResult.toString());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) leftOperand).getLexeme());
    assertSame(type, leftOperand.getType());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) rightOperand).getLexeme());
    assertSame(type, rightOperand.getType());
    assertEquals("0.8.9", ((DateTimeLiteral) leftOperand).getConversionFunction());
    assertEquals("0.8.9", ((DateTimeLiteral) rightOperand).getConversionFunction());
  }

  @Test
  public void testVisit129() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    Conjunction element = new Conjunction(new QualifiedName(stringList), new QualifiedName(stringList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Conjunction) actualVisitResult).getRightOperand();
    assertEquals("and", ((Conjunction) actualVisitResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    Expression leftOperand = ((Conjunction) actualVisitResult).getLeftOperand();
    Type type = ((Conjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualName1 = ((Name) leftOperand).getName();
    assertEquals("Conjunction(Name(foo),Name(foo))", actualVisitResult.toString());
    assertEquals("foo", actualName1);
    assertSame(type, leftOperand.getType());
    assertEquals("foo", actualName);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit13() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new LogicNegation(new LogicNegation(new ExpressionList())), true,
        new LogicNegation(new LogicNegation(new ExpressionList())));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,LogicNegation(LogicNegation"
        + "(ExpressionList())),true,LogicNegation(LogicNegation" + "(ExpressionList())))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    String actualOperator = ((LogicNegation) start).getOperator();
    Expression leftOperand = ((LogicNegation) end).getLeftOperand();
    assertEquals("not", actualOperator);
    String actualOperator1 = ((LogicNegation) leftOperand).getOperator();
    Expression leftOperand1 = ((LogicNegation) start).getLeftOperand();
    assertEquals("LogicNegation(LogicNegation(ExpressionList()))", end.toString());
    String actualOperator2 = ((LogicNegation) leftOperand1).getOperator();
    assertNull(((LogicNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("LogicNegation(LogicNegation(ExpressionList()))", start.toString());
    assertEquals("not", ((LogicNegation) end).getOperator());
    assertNull(((LogicNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("not", actualOperator2);
    assertSame(type, leftOperand.getType());
    assertEquals("not", actualOperator1);
    Expression leftOperand2 = ((LogicNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand2.toString();
    assertNull(((LogicNegation) leftOperand1).getRightOperand());
    assertEquals("LogicNegation(ExpressionList())", leftOperand1.toString());
    assertEquals("LogicNegation(ExpressionList())", leftOperand.toString());
    assertSame(type, leftOperand1.getType());
    Expression leftOperand3 = ((LogicNegation) leftOperand1).getLeftOperand();
    String actualToStringResult1 = leftOperand3.toString();
    assertNull(((LogicNegation) leftOperand).getRightOperand());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand3.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand2.getType());
  }

  @Test
  public void testVisit130() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Conjunction element = new Conjunction(new BooleanLiteral("value"), new BooleanLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("and", ((Conjunction) actualVisitResult).getOperator());
    Expression rightOperand = ((Conjunction) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Conjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Conjunction) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Conjunction(BooleanLiteral(value),BooleanLiteral" + "(value))", actualVisitResult.toString());
    assertEquals("BooleanLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("BooleanLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit131() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Conjunction element = new Conjunction(new ArithmeticNegation(new ExpressionList()),
        new ArithmeticNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Conjunction) actualVisitResult).getRightOperand();
    assertEquals("and", ((Conjunction) actualVisitResult).getOperator());
    String actualOperator = ((ArithmeticNegation) rightOperand).getOperator();
    Expression leftOperand = ((Conjunction) actualVisitResult).getLeftOperand();
    Type type = ((Conjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Conjunction(ArithmeticNegation(ExpressionList())" + ",ArithmeticNegation(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("ArithmeticNegation(ExpressionList())", leftOperand.toString());
    Expression leftOperand1 = ((ArithmeticNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand1.toString();
    assertSame(type, leftOperand.getType());
    assertEquals("-", actualOperator);
    assertNull(((ArithmeticNegation) rightOperand).getRightOperand());
    assertNull(((ArithmeticNegation) leftOperand).getRightOperand());
    assertSame(type, rightOperand.getType());
    assertEquals("ArithmeticNegation(ExpressionList())", rightOperand.toString());
    Expression leftOperand2 = ((ArithmeticNegation) rightOperand).getLeftOperand();
    String actualToStringResult1 = leftOperand2.toString();
    assertEquals("-", ((ArithmeticNegation) leftOperand).getOperator());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit132() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Conjunction element = new Conjunction(new NullLiteral(), new NullLiteral());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("and", ((Conjunction) actualVisitResult).getOperator());
    Type actualType = ((Conjunction) actualVisitResult).getRightOperand().getType();
    Type type = ((Conjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Type actualType1 = ((Conjunction) actualVisitResult).getLeftOperand().getType();
    assertEquals("Conjunction(NullLiteral(),NullLiteral())", actualVisitResult.toString());
    assertSame(type, actualType1);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit133() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Conjunction element = new Conjunction(new NumericLiteral("value"), new NumericLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("and", ((Conjunction) actualVisitResult).getOperator());
    Expression rightOperand = ((Conjunction) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Conjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Conjunction) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Conjunction(NumericLiteral(value),NumericLiteral" + "(value))", actualVisitResult.toString());
    assertEquals("NumericLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("NumericLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit134() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Conjunction element = new Conjunction(new ExpressionList(), new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("and", ((Conjunction) actualVisitResult).getOperator());
    Expression rightOperand = ((Conjunction) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Conjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Conjunction) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Conjunction(ExpressionList(),ExpressionList())", actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit135() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Conjunction element = new Conjunction(new Any(), new Any());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("and", ((Conjunction) actualVisitResult).getOperator());
    assertTrue(((Conjunction) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Conjunction(Any(),Any())", actualVisitResult.toString());
  }

  @Test
  public void testVisit136() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Conjunction element = new Conjunction(new Context(null), new Context(null));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("and", ((Conjunction) actualVisitResult).getOperator());
    Expression rightOperand = ((Conjunction) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Conjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Conjunction) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Conjunction(Context(),Context())", actualVisitResult.toString());
    assertEquals("Context()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("Context()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit137() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BooleanLiteral element = new BooleanLiteral("value");

    // Act and Assert
    assertTrue(((BooleanLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", ((BooleanLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null))).getLexeme());
  }

  @Test
  public void testVisit138() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new LogicNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression expression = ((ExpressionIteratorDomain) actualVisitResult).getExpression();
    assertEquals("ExpressionIteratorDomain(LogicNegation(ExpressionList" + "()))", actualVisitResult.toString());
    assertNull(((LogicNegation) expression).getRightOperand());
    assertEquals("not", ((LogicNegation) expression).getOperator());
    assertEquals("LogicNegation(ExpressionList())", expression.toString());
    Expression leftOperand = ((LogicNegation) expression).getLeftOperand();
    Type type = expression.getType();
    assertTrue(type instanceof AnyType);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", leftOperand.toString());
  }

  @Test
  public void testVisit139() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new NumericLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression expression = ((ExpressionIteratorDomain) actualVisitResult).getExpression();
    assertEquals("ExpressionIteratorDomain(NumericLiteral(value))", actualVisitResult.toString());
    String actualLexeme = ((NumericLiteral) expression).getLexeme();
    assertTrue(expression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", actualLexeme);
  }

  @Test
  public void testVisit14() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new Context(null), true, new Context(null));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    assertEquals("IntervalTest(true,Context(),true,Context())", actualVisitResult.toString());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    String actualToStringResult = end.toString();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertEquals("Context()", actualToStringResult);
    assertEquals("Context()", start.toString());
    assertSame(type, start.getType());
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit140() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new NullLiteral());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression expression = ((ExpressionIteratorDomain) actualVisitResult).getExpression();
    assertEquals("ExpressionIteratorDomain(NullLiteral())", actualVisitResult.toString());
    assertTrue(expression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testVisit141() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new QualifiedName(stringList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression expression = ((ExpressionIteratorDomain) actualVisitResult).getExpression();
    assertEquals("ExpressionIteratorDomain(Name(foo))", actualVisitResult.toString());
    assertTrue(expression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(foo)", expression.toString());
  }

  @Test
  public void testVisit142() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new ListLiteral(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression expression = ((ExpressionIteratorDomain) actualVisitResult).getExpression();
    assertEquals("ExpressionIteratorDomain(ListLiteral(ExpressionList" + "()))", actualVisitResult.toString());
    List<Expression> expressionList1 = ((ListLiteral) expression).getExpressionList();
    Type type = expression.getType();
    assertTrue(type instanceof AnyType);
    Expression getResult = expressionList1.get(0);
    assertEquals("ListLiteral(ExpressionList())", expression.toString());
    assertEquals("ExpressionList()", getResult.toString());
    assertSame(type, getResult.getType());
  }

  @Test
  public void testVisit143() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new StringLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression expression = ((ExpressionIteratorDomain) actualVisitResult).getExpression();
    assertEquals("ExpressionIteratorDomain(StringLiteral(value))", actualVisitResult.toString());
    String actualLexeme = ((StringLiteral) expression).getLexeme();
    assertTrue(expression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", actualLexeme);
  }

  @Test
  public void testVisit144() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new ArithmeticNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression expression = ((ExpressionIteratorDomain) actualVisitResult).getExpression();
    assertEquals("ExpressionIteratorDomain(ArithmeticNegation" + "(ExpressionList()))", actualVisitResult.toString());
    assertNull(((ArithmeticNegation) expression).getRightOperand());
    assertEquals("-", ((ArithmeticNegation) expression).getOperator());
    assertEquals("ArithmeticNegation(ExpressionList())", expression.toString());
    Expression leftOperand = ((ArithmeticNegation) expression).getLeftOperand();
    Type type = expression.getType();
    assertTrue(type instanceof AnyType);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", leftOperand.toString());
  }

  @Test
  public void testVisit145() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new Any());

    // Act and Assert
    assertEquals("ExpressionIteratorDomain(Any())",
        cloneVisitor.visit(element, FEELContext.makeContext(null)).toString());
  }

  @Test
  public void testVisit146() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new Name("name"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression expression = ((ExpressionIteratorDomain) actualVisitResult).getExpression();
    assertEquals("ExpressionIteratorDomain(Name(name))", actualVisitResult.toString());
    assertTrue(expression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(name)", expression.toString());
  }

  @Test
  public void testVisit147() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new BooleanLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression expression = ((ExpressionIteratorDomain) actualVisitResult).getExpression();
    assertEquals("ExpressionIteratorDomain(BooleanLiteral(value))", actualVisitResult.toString());
    String actualLexeme = ((BooleanLiteral) expression).getLexeme();
    assertTrue(expression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", actualLexeme);
  }

  @Test
  public void testVisit148() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression expression = ((ExpressionIteratorDomain) actualVisitResult).getExpression();
    assertEquals("ExpressionIteratorDomain(DateTimeLiteral(0.8.9,"
        + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?(" + "[0-9]+(\\.[0-9]*)?S)?\"))",
        actualVisitResult.toString());
    String actualConversionFunction = ((DateTimeLiteral) expression).getConversionFunction();
    assertTrue(expression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("0.8.9", actualConversionFunction);
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) expression).getLexeme());
  }

  @Test
  public void testVisit149() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new NullTest());

    // Act and Assert
    assertEquals("ExpressionIteratorDomain(NullTest())",
        cloneVisitor.visit(element, FEELContext.makeContext(null)).toString());
  }

  @Test
  public void testVisit15() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new LogicNegation(new Any()), true, new LogicNegation(new Any()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,LogicNegation(Any()),true,LogicNegation" + "(Any()))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("not", ((LogicNegation) start).getOperator());
    assertEquals("LogicNegation(Any())", start.toString());
    assertSame(type, start.getType());
    assertEquals("LogicNegation(Any())", end.toString());
    assertNull(((LogicNegation) start).getRightOperand());
    assertSame(type, end.getType());
    assertNull(((LogicNegation) end).getRightOperand());
    assertEquals("not", ((LogicNegation) end).getOperator());
  }

  @Test
  public void testVisit150() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression expression = ((ExpressionIteratorDomain) actualVisitResult).getExpression();
    assertEquals("ExpressionIteratorDomain(NamedTypeExpression" + "(qualifiedName))", actualVisitResult.toString());
    assertEquals("qualifiedName", ((NamedTypeExpression) expression).getQualifiedName());
    assertTrue(expression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testVisit151() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionIteratorDomain element = new ExpressionIteratorDomain(new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression expression = ((ExpressionIteratorDomain) actualVisitResult).getExpression();
    assertEquals("ExpressionIteratorDomain(ExpressionList())", actualVisitResult.toString());
    assertTrue(expression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", expression.toString());
  }

  @Test
  public void testVisit152() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    ExpressionTest element = new ExpressionTest(new QualifiedName(stringList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ExpressionTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression expression = ((ExpressionTest) actualVisitResult).getExpression();
    String actualToStringResult = expression.toString();
    assertEquals("ExpressionTest(Name(foo))", actualVisitResult.toString());
    assertEquals("Name(foo)", actualToStringResult);
    assertSame(type, expression.getType());
  }

  @Test
  public void testVisit153() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionTest element = new ExpressionTest(new ArithmeticNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ExpressionTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression expression = ((ExpressionTest) actualVisitResult).getExpression();
    String actualOperator = ((ArithmeticNegation) expression).getOperator();
    assertEquals("ExpressionTest(ArithmeticNegation(ExpressionList" + "()))", actualVisitResult.toString());
    assertEquals("-", actualOperator);
    assertEquals("ArithmeticNegation(ExpressionList())", expression.toString());
    Expression leftOperand = ((ArithmeticNegation) expression).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertSame(type, expression.getType());
    assertNull(((ArithmeticNegation) expression).getRightOperand());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand.getType());
  }

  @Test
  public void testVisit154() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionTest element = new ExpressionTest(new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertTrue(
        ((ExpressionTest) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionTest(NullTest())", actualVisitResult.toString());
  }

  @Test
  public void testVisit155() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionTest element = new ExpressionTest(
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ExpressionTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression expression = ((ExpressionTest) actualVisitResult).getExpression();
    String actualConversionFunction = ((DateTimeLiteral) expression).getConversionFunction();
    assertEquals("ExpressionTest(DateTimeLiteral(0.8.9, \"[-]?P([0-9]"
        + "+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0-9" + "]*)?S)?\"))", actualVisitResult.toString());
    assertEquals("0.8.9", actualConversionFunction);
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) expression).getLexeme());
    assertSame(type, expression.getType());
  }

  @Test
  public void testVisit156() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionTest element = new ExpressionTest(new Name("name"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ExpressionTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression expression = ((ExpressionTest) actualVisitResult).getExpression();
    String actualToStringResult = expression.toString();
    assertEquals("ExpressionTest(Name(name))", actualVisitResult.toString());
    assertEquals("Name(name)", actualToStringResult);
    assertSame(type, expression.getType());
  }

  @Test
  public void testVisit157() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionTest element = new ExpressionTest(new StringLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ExpressionTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression expression = ((ExpressionTest) actualVisitResult).getExpression();
    String actualLexeme = ((StringLiteral) expression).getLexeme();
    assertEquals("ExpressionTest(StringLiteral(value))", actualVisitResult.toString());
    assertEquals("value", actualLexeme);
    assertSame(type, expression.getType());
  }

  @Test
  public void testVisit158() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionTest element = new ExpressionTest(new NullLiteral());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ExpressionTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Type actualType = ((ExpressionTest) actualVisitResult).getExpression().getType();
    assertEquals("ExpressionTest(NullLiteral())", actualVisitResult.toString());
    assertSame(type, actualType);
  }

  @Test
  public void testVisit159() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionTest element = new ExpressionTest(new Any());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertTrue(
        ((ExpressionTest) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionTest(Any())", actualVisitResult.toString());
  }

  @Test
  public void testVisit16() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    RangeTest element = new RangeTest(true, new LogicNegation(new QualifiedName(stringList)), true,
        new LogicNegation(new QualifiedName(stringList)));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,LogicNegation(Name(foo)),true" + ",LogicNegation(Name(foo)))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    String actualOperator = ((LogicNegation) start).getOperator();
    Expression leftOperand = ((LogicNegation) end).getLeftOperand();
    assertEquals("not", actualOperator);
    String actualName = ((Name) leftOperand).getName();
    Expression leftOperand1 = ((LogicNegation) start).getLeftOperand();
    String actualName1 = ((Name) leftOperand1).getName();
    assertEquals("LogicNegation(Name(foo))", end.toString());
    assertNull(((LogicNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("LogicNegation(Name(foo))", start.toString());
    assertEquals("not", ((LogicNegation) end).getOperator());
    assertNull(((LogicNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("foo", actualName);
    assertEquals("foo", actualName1);
    assertSame(type, leftOperand.getType());
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit160() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionTest element = new ExpressionTest(new LogicNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ExpressionTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression expression = ((ExpressionTest) actualVisitResult).getExpression();
    String actualOperator = ((LogicNegation) expression).getOperator();
    assertEquals("ExpressionTest(LogicNegation(ExpressionList()))", actualVisitResult.toString());
    assertEquals("not", actualOperator);
    assertEquals("LogicNegation(ExpressionList())", expression.toString());
    Expression leftOperand = ((LogicNegation) expression).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertSame(type, expression.getType());
    assertNull(((LogicNegation) expression).getRightOperand());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand.getType());
  }

  @Test
  public void testVisit161() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionTest element = new ExpressionTest(new BooleanLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ExpressionTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression expression = ((ExpressionTest) actualVisitResult).getExpression();
    String actualLexeme = ((BooleanLiteral) expression).getLexeme();
    assertEquals("ExpressionTest(BooleanLiteral(value))", actualVisitResult.toString());
    assertEquals("value", actualLexeme);
    assertSame(type, expression.getType());
  }

  @Test
  public void testVisit162() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionTest element = new ExpressionTest(new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ExpressionTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression expression = ((ExpressionTest) actualVisitResult).getExpression();
    String actualToStringResult = expression.toString();
    assertEquals("ExpressionTest(NamedTypeExpression(qualifiedName))", actualVisitResult.toString());
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertSame(type, expression.getType());
  }

  @Test
  public void testVisit163() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionTest element = new ExpressionTest(new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ExpressionTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression expression = ((ExpressionTest) actualVisitResult).getExpression();
    String actualToStringResult = expression.toString();
    assertEquals("ExpressionTest(ExpressionList())", actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, expression.getType());
  }

  @Test
  public void testVisit164() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    ExpressionTest element = new ExpressionTest(new ListLiteral(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ExpressionTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression expression = ((ExpressionTest) actualVisitResult).getExpression();
    List<Expression> expressionList1 = ((ListLiteral) expression).getExpressionList();
    assertEquals("ExpressionTest(ListLiteral(ExpressionList()))", actualVisitResult.toString());
    assertEquals("ListLiteral(ExpressionList())", expression.toString());
    Expression getResult = expressionList1.get(0);
    assertSame(type, expression.getType());
    assertSame(type, getResult.getType());
    assertEquals("ExpressionList()", getResult.toString());
  }

  @Test
  public void testVisit165() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionTest element = new ExpressionTest(new NumericLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ExpressionTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression expression = ((ExpressionTest) actualVisitResult).getExpression();
    String actualLexeme = ((NumericLiteral) expression).getLexeme();
    assertEquals("ExpressionTest(NumericLiteral(value))", actualVisitResult.toString());
    assertEquals("value", actualLexeme);
    assertSame(type, expression.getType());
  }

  @Test
  public void testVisit166() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BetweenExpression element = new BetweenExpression(new LogicNegation(new ExpressionList()),
        new LogicNegation(new ExpressionList()), new LogicNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value = ((BetweenExpression) actualVisitResult).getValue();
    Expression rightEndpoint = ((BetweenExpression) actualVisitResult).getRightEndpoint();
    String actualOperator = ((LogicNegation) value).getOperator();
    String actualOperator1 = ((LogicNegation) rightEndpoint).getOperator();
    Type type = ((BetweenExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftEndpoint = ((BetweenExpression) actualVisitResult).getLeftEndpoint();
    assertEquals("BetweenExpression(LogicNegation(ExpressionList()),"
        + " LogicNegation(ExpressionList()), LogicNegation" + "(ExpressionList()))", actualVisitResult.toString());
    assertEquals("not", ((LogicNegation) leftEndpoint).getOperator());
    assertEquals("LogicNegation(ExpressionList())", leftEndpoint.toString());
    Expression leftOperand = ((LogicNegation) leftEndpoint).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertSame(type, leftEndpoint.getType());
    assertEquals("not", actualOperator1);
    assertEquals("not", actualOperator);
    assertNull(((LogicNegation) leftEndpoint).getRightOperand());
    Expression leftOperand1 = ((LogicNegation) value).getLeftOperand();
    assertNull(((LogicNegation) rightEndpoint).getRightOperand());
    assertNull(((LogicNegation) value).getRightOperand());
    assertSame(type, rightEndpoint.getType());
    assertEquals("LogicNegation(ExpressionList())", rightEndpoint.toString());
    assertSame(type, value.getType());
    Expression leftOperand2 = ((LogicNegation) rightEndpoint).getLeftOperand();
    String actualToStringResult1 = leftOperand2.toString();
    assertEquals("LogicNegation(ExpressionList())", value.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
    assertEquals("ExpressionList()", leftOperand1.toString());
    assertSame(type, leftOperand.getType());
  }

  @Test
  public void testVisit167() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BetweenExpression element = new BetweenExpression(
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""),
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""),
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value = ((BetweenExpression) actualVisitResult).getValue();
    Expression rightEndpoint = ((BetweenExpression) actualVisitResult).getRightEndpoint();
    Type type = ((BetweenExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftEndpoint = ((BetweenExpression) actualVisitResult).getLeftEndpoint();
    String actualConversionFunction = ((DateTimeLiteral) leftEndpoint).getConversionFunction();
    assertEquals("BetweenExpression(DateTimeLiteral(0.8.9," + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?"
        + "([0-9]+(\\.[0-9]*)?S)?\"), DateTimeLiteral(0.8.9," + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?"
        + "([0-9]+(\\.[0-9]*)?S)?\"), DateTimeLiteral(0.8.9," + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?"
        + "([0-9]+(\\.[0-9]*)?S)?\"))", actualVisitResult.toString());
    assertEquals("0.8.9", actualConversionFunction);
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) leftEndpoint).getLexeme());
    assertSame(type, leftEndpoint.getType());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) rightEndpoint).getLexeme());
    assertSame(type, rightEndpoint.getType());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) value).getLexeme());
    assertSame(type, value.getType());
    assertEquals("0.8.9", ((DateTimeLiteral) value).getConversionFunction());
    assertEquals("0.8.9", ((DateTimeLiteral) rightEndpoint).getConversionFunction());
  }

  @Test
  public void testVisit168() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BetweenExpression element = new BetweenExpression(new Context(null), new Context(null), new Context(null));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value = ((BetweenExpression) actualVisitResult).getValue();
    String actualToStringResult = value.toString();
    Expression rightEndpoint = ((BetweenExpression) actualVisitResult).getRightEndpoint();
    String actualToStringResult1 = rightEndpoint.toString();
    Type type = ((BetweenExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftEndpoint = ((BetweenExpression) actualVisitResult).getLeftEndpoint();
    String actualToStringResult2 = leftEndpoint.toString();
    assertEquals("BetweenExpression(Context(), Context(), Context())", actualVisitResult.toString());
    assertEquals("Context()", actualToStringResult2);
    assertSame(type, leftEndpoint.getType());
    assertEquals("Context()", actualToStringResult1);
    assertSame(type, rightEndpoint.getType());
    assertEquals("Context()", actualToStringResult);
    assertSame(type, value.getType());
  }

  @Test
  public void testVisit169() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BetweenExpression element = new BetweenExpression(new ExpressionList(), new ExpressionList(), new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value = ((BetweenExpression) actualVisitResult).getValue();
    String actualToStringResult = value.toString();
    Expression rightEndpoint = ((BetweenExpression) actualVisitResult).getRightEndpoint();
    String actualToStringResult1 = rightEndpoint.toString();
    Type type = ((BetweenExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftEndpoint = ((BetweenExpression) actualVisitResult).getLeftEndpoint();
    String actualToStringResult2 = leftEndpoint.toString();
    assertEquals("BetweenExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult2);
    assertSame(type, leftEndpoint.getType());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, rightEndpoint.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value.getType());
  }

  @Test
  public void testVisit17() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new ArithmeticNegation(new NullTest()), true,
        new ArithmeticNegation(new NullTest()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,ArithmeticNegation(NullTest())" + ",true,ArithmeticNegation(NullTest()))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("-", ((ArithmeticNegation) start).getOperator());
    assertEquals("ArithmeticNegation(NullTest())", start.toString());
    assertSame(type, start.getType());
    assertEquals("ArithmeticNegation(NullTest())", end.toString());
    assertNull(((ArithmeticNegation) start).getRightOperand());
    assertSame(type, end.getType());
    assertNull(((ArithmeticNegation) end).getRightOperand());
    assertEquals("-", ((ArithmeticNegation) end).getOperator());
  }

  @Test
  public void testVisit170() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BetweenExpression element = new BetweenExpression(new NumericLiteral("value"), new NumericLiteral("value"),
        new NumericLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value = ((BetweenExpression) actualVisitResult).getValue();
    String actualToStringResult = value.toString();
    Expression rightEndpoint = ((BetweenExpression) actualVisitResult).getRightEndpoint();
    String actualToStringResult1 = rightEndpoint.toString();
    Type type = ((BetweenExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftEndpoint = ((BetweenExpression) actualVisitResult).getLeftEndpoint();
    String actualLexeme = ((NumericLiteral) leftEndpoint).getLexeme();
    assertEquals("BetweenExpression(NumericLiteral(value), NumericLiteral" + "(value), NumericLiteral(value))",
        actualVisitResult.toString());
    assertEquals("value", actualLexeme);
    assertSame(type, leftEndpoint.getType());
    assertEquals("NumericLiteral(value)", actualToStringResult1);
    assertSame(type, rightEndpoint.getType());
    assertEquals("NumericLiteral(value)", actualToStringResult);
    assertSame(type, value.getType());
  }

  @Test
  public void testVisit171() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BetweenExpression element = new BetweenExpression(new StringLiteral("value"), new StringLiteral("value"),
        new StringLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value = ((BetweenExpression) actualVisitResult).getValue();
    String actualToStringResult = value.toString();
    Expression rightEndpoint = ((BetweenExpression) actualVisitResult).getRightEndpoint();
    String actualToStringResult1 = rightEndpoint.toString();
    Type type = ((BetweenExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftEndpoint = ((BetweenExpression) actualVisitResult).getLeftEndpoint();
    String actualLexeme = ((StringLiteral) leftEndpoint).getLexeme();
    assertEquals("BetweenExpression(StringLiteral(value), StringLiteral" + "(value), StringLiteral(value))",
        actualVisitResult.toString());
    assertEquals("value", actualLexeme);
    assertSame(type, leftEndpoint.getType());
    assertEquals("StringLiteral(value)", actualToStringResult1);
    assertSame(type, rightEndpoint.getType());
    assertEquals("StringLiteral(value)", actualToStringResult);
    assertSame(type, value.getType());
  }

  @Test
  public void testVisit172() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    BetweenExpression element = new BetweenExpression(new QualifiedName(stringList), new QualifiedName(stringList),
        new QualifiedName(stringList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value = ((BetweenExpression) actualVisitResult).getValue();
    Expression rightEndpoint = ((BetweenExpression) actualVisitResult).getRightEndpoint();
    String actualName = ((Name) value).getName();
    String actualName1 = ((Name) rightEndpoint).getName();
    Type type = ((BetweenExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftEndpoint = ((BetweenExpression) actualVisitResult).getLeftEndpoint();
    String actualToStringResult = leftEndpoint.toString();
    assertEquals("BetweenExpression(Name(foo), Name(foo), Name(foo))", actualVisitResult.toString());
    assertEquals("Name(foo)", actualToStringResult);
    assertSame(type, leftEndpoint.getType());
    assertEquals("foo", actualName1);
    assertSame(type, rightEndpoint.getType());
    assertEquals("foo", actualName);
    assertSame(type, value.getType());
  }

  @Test
  public void testVisit173() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BetweenExpression element = new BetweenExpression(new NullLiteral(), new NullLiteral(), new NullLiteral());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type actualType = ((BetweenExpression) actualVisitResult).getValue().getType();
    Type actualType1 = ((BetweenExpression) actualVisitResult).getRightEndpoint().getType();
    Type type = ((BetweenExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Type actualType2 = ((BetweenExpression) actualVisitResult).getLeftEndpoint().getType();
    assertEquals("BetweenExpression(NullLiteral(), NullLiteral()," + " NullLiteral())", actualVisitResult.toString());
    assertSame(type, actualType2);
    assertSame(type, actualType1);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit174() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BetweenExpression element = new BetweenExpression(new ArithmeticNegation(new ExpressionList()),
        new ArithmeticNegation(new ExpressionList()), new ArithmeticNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value = ((BetweenExpression) actualVisitResult).getValue();
    Expression rightEndpoint = ((BetweenExpression) actualVisitResult).getRightEndpoint();
    String actualOperator = ((ArithmeticNegation) value).getOperator();
    String actualOperator1 = ((ArithmeticNegation) rightEndpoint).getOperator();
    Type type = ((BetweenExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftEndpoint = ((BetweenExpression) actualVisitResult).getLeftEndpoint();
    assertEquals(
        "BetweenExpression(ArithmeticNegation(ExpressionList()),"
            + " ArithmeticNegation(ExpressionList()), ArithmeticNegation" + "(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("-", ((ArithmeticNegation) leftEndpoint).getOperator());
    assertEquals("ArithmeticNegation(ExpressionList())", leftEndpoint.toString());
    Expression leftOperand = ((ArithmeticNegation) leftEndpoint).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertSame(type, leftEndpoint.getType());
    assertEquals("-", actualOperator1);
    assertEquals("-", actualOperator);
    assertNull(((ArithmeticNegation) leftEndpoint).getRightOperand());
    Expression leftOperand1 = ((ArithmeticNegation) value).getLeftOperand();
    assertNull(((ArithmeticNegation) rightEndpoint).getRightOperand());
    assertNull(((ArithmeticNegation) value).getRightOperand());
    assertSame(type, rightEndpoint.getType());
    assertEquals("ArithmeticNegation(ExpressionList())", rightEndpoint.toString());
    assertSame(type, value.getType());
    Expression leftOperand2 = ((ArithmeticNegation) rightEndpoint).getLeftOperand();
    String actualToStringResult1 = leftOperand2.toString();
    assertEquals("ArithmeticNegation(ExpressionList())", value.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
    assertEquals("ExpressionList()", leftOperand1.toString());
    assertSame(type, leftOperand.getType());
  }

  @Test
  public void testVisit175() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BetweenExpression element = new BetweenExpression(new BooleanLiteral("value"), new BooleanLiteral("value"),
        new BooleanLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value = ((BetweenExpression) actualVisitResult).getValue();
    String actualToStringResult = value.toString();
    Expression rightEndpoint = ((BetweenExpression) actualVisitResult).getRightEndpoint();
    String actualToStringResult1 = rightEndpoint.toString();
    Type type = ((BetweenExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftEndpoint = ((BetweenExpression) actualVisitResult).getLeftEndpoint();
    String actualLexeme = ((BooleanLiteral) leftEndpoint).getLexeme();
    assertEquals("BetweenExpression(BooleanLiteral(value), BooleanLiteral" + "(value), BooleanLiteral(value))",
        actualVisitResult.toString());
    assertEquals("value", actualLexeme);
    assertSame(type, leftEndpoint.getType());
    assertEquals("BooleanLiteral(value)", actualToStringResult1);
    assertSame(type, rightEndpoint.getType());
    assertEquals("BooleanLiteral(value)", actualToStringResult);
    assertSame(type, value.getType());
  }

  @Test
  public void testVisit176() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BetweenExpression element = new BetweenExpression(new Any(), new Any(), new Any());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertTrue(
        ((BetweenExpression) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("BetweenExpression(Any(), Any(), Any())", actualVisitResult.toString());
  }

  @Test
  public void testVisit177() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BetweenExpression element = new BetweenExpression(new Name("name"), new Name("name"), new Name("name"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value = ((BetweenExpression) actualVisitResult).getValue();
    Expression rightEndpoint = ((BetweenExpression) actualVisitResult).getRightEndpoint();
    String actualName = ((Name) value).getName();
    String actualName1 = ((Name) rightEndpoint).getName();
    Type type = ((BetweenExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftEndpoint = ((BetweenExpression) actualVisitResult).getLeftEndpoint();
    String actualToStringResult = leftEndpoint.toString();
    assertEquals("BetweenExpression(Name(name), Name(name)," + " Name(name))", actualVisitResult.toString());
    assertEquals("Name(name)", actualToStringResult);
    assertSame(type, leftEndpoint.getType());
    assertEquals("name", actualName1);
    assertSame(type, rightEndpoint.getType());
    assertEquals("name", actualName);
    assertSame(type, value.getType());
  }

  @Test
  public void testVisit178() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    BetweenExpression element = new BetweenExpression(new ListLiteral(expressionList), new ListLiteral(expressionList),
        new ListLiteral(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value = ((BetweenExpression) actualVisitResult).getValue();
    Expression rightEndpoint = ((BetweenExpression) actualVisitResult).getRightEndpoint();
    List<Expression> expressionList1 = ((ListLiteral) value).getExpressionList();
    List<Expression> expressionList2 = ((ListLiteral) rightEndpoint).getExpressionList();
    Type type = ((BetweenExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftEndpoint = ((BetweenExpression) actualVisitResult).getLeftEndpoint();
    List<Expression> expressionList3 = ((ListLiteral) leftEndpoint).getExpressionList();
    assertEquals("BetweenExpression(ListLiteral(ExpressionList())," + " ListLiteral(ExpressionList()), ListLiteral"
        + "(ExpressionList()))", actualVisitResult.toString());
    assertEquals("ListLiteral(ExpressionList())", leftEndpoint.toString());
    Expression getResult = expressionList3.get(0);
    assertSame(type, leftEndpoint.getType());
    Expression getResult1 = expressionList2.get(0);
    assertEquals("ListLiteral(ExpressionList())", rightEndpoint.toString());
    assertSame(type, value.getType());
    assertSame(type, rightEndpoint.getType());
    assertEquals("ListLiteral(ExpressionList())", value.toString());
    Expression getResult2 = expressionList1.get(0);
    String actualToStringResult = getResult.toString();
    assertSame(type, getResult2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, getResult.getType());
    assertEquals("ExpressionList()", getResult1.toString());
    assertSame(type, getResult1.getType());
    assertEquals("ExpressionList()", getResult2.toString());
  }

  @Test
  public void testVisit179() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BetweenExpression element = new BetweenExpression(new NamedTypeExpression("qualifiedName"),
        new NamedTypeExpression("qualifiedName"), new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value = ((BetweenExpression) actualVisitResult).getValue();
    Expression rightEndpoint = ((BetweenExpression) actualVisitResult).getRightEndpoint();
    String actualQualifiedName = ((NamedTypeExpression) value).getQualifiedName();
    String actualQualifiedName1 = ((NamedTypeExpression) rightEndpoint).getQualifiedName();
    Type type = ((BetweenExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftEndpoint = ((BetweenExpression) actualVisitResult).getLeftEndpoint();
    String actualToStringResult = leftEndpoint.toString();
    assertEquals(
        "BetweenExpression(NamedTypeExpression(qualifiedName),"
            + " NamedTypeExpression(qualifiedName), NamedTypeExpression" + "(qualifiedName))",
        actualVisitResult.toString());
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertSame(type, leftEndpoint.getType());
    assertSame(type, rightEndpoint.getType());
    assertEquals("qualifiedName", actualQualifiedName1);
    assertSame(type, value.getType());
    assertEquals("qualifiedName", actualQualifiedName);
  }

  @Test
  public void testVisit18() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new NamedTypeExpression("qualifiedName"), true,
        new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,NamedTypeExpression(qualifiedName" + "),true,NamedTypeExpression(qualifiedName))",
        actualVisitResult.toString());
    String actualQualifiedName = ((NamedTypeExpression) end).getQualifiedName();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    String actualToStringResult = start.toString();
    assertSame(type, end.getType());
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertSame(type, start.getType());
    assertEquals("qualifiedName", actualQualifiedName);
  }

  @Test
  public void testVisit180() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BetweenExpression element = new BetweenExpression(new NullTest(), new NullTest(), new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertTrue(
        ((BetweenExpression) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("BetweenExpression(NullTest(), NullTest()," + " NullTest())", actualVisitResult.toString());
  }

  @Test
  public void testVisit181() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(ExpressionList(),"
        + " ExpressionList())) -> ExpressionList())", actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit182() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new NullTest(), new NullTest())));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate"
        + " in RangeIteratorDomain(NullTest(), NullTest())) ->" + " ExpressionList())", actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    assertEquals("Iterator(predicate in RangeIteratorDomain(NullTest()," + " NullTest()))", getResult.toString());
    assertEquals("RangeIteratorDomain(NullTest(), NullTest())", getResult.getDomain().toString());
  }

  @Test
  public void testVisit183() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(
        new Iterator("predicate", new RangeIteratorDomain(new BooleanLiteral("value"), new BooleanLiteral("value"))));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(BooleanLiteral(value),"
        + " BooleanLiteral(value))) -> ExpressionList())", actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(BooleanLiteral" + "(value), BooleanLiteral(value)))",
        getResult.toString());
    Expression start = ((RangeIteratorDomain) domain).getStart();
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult = end.toString();
    String actualLexeme = ((BooleanLiteral) start).getLexeme();
    assertEquals("RangeIteratorDomain(BooleanLiteral(value)," + " BooleanLiteral(value))", domain.toString());
    assertEquals("value", actualLexeme);
    assertSame(type, start.getType());
    assertEquals("BooleanLiteral(value)", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit184() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(
        new Iterator("predicate", new RangeIteratorDomain(new NumericLiteral("value"), new NumericLiteral("value"))));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(NumericLiteral(value),"
        + " NumericLiteral(value))) -> ExpressionList())", actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(NumericLiteral" + "(value), NumericLiteral(value)))",
        getResult.toString());
    Expression start = ((RangeIteratorDomain) domain).getStart();
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult = end.toString();
    String actualLexeme = ((NumericLiteral) start).getLexeme();
    assertEquals("RangeIteratorDomain(NumericLiteral(value)," + " NumericLiteral(value))", domain.toString());
    assertEquals("value", actualLexeme);
    assertSame(type, start.getType());
    assertEquals("NumericLiteral(value)", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit185() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new ArithmeticNegation(new ExpressionList()),
        new ArithmeticNegation(new ExpressionList()))));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate"
        + " in RangeIteratorDomain(ArithmeticNegation(ExpressionList" + "()), ArithmeticNegation(ExpressionList()))) ->"
        + " ExpressionList())", actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain"
        + "(ArithmeticNegation(ExpressionList()), ArithmeticNegation" + "(ExpressionList())))", getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualOperator = ((ArithmeticNegation) end).getOperator();
    String actualOperator1 = ((ArithmeticNegation) start).getOperator();
    assertEquals("RangeIteratorDomain(ArithmeticNegation(ExpressionList())," + " ArithmeticNegation(ExpressionList()))",
        domain.toString());
    assertEquals("-", actualOperator1);
    assertEquals("ArithmeticNegation(ExpressionList())", start.toString());
    Expression leftOperand = ((ArithmeticNegation) start).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertSame(type, start.getType());
    assertEquals("-", actualOperator);
    assertSame(type, end.getType());
    assertEquals("ArithmeticNegation(ExpressionList())", end.toString());
    assertNull(((ArithmeticNegation) start).getRightOperand());
    assertNull(((ArithmeticNegation) end).getRightOperand());
    Expression leftOperand1 = ((ArithmeticNegation) end).getLeftOperand();
    assertEquals("ExpressionList()", leftOperand1.toString());
    assertSame(type, leftOperand1.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand.getType());
  }

  @Test
  public void testVisit186() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new BooleanLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(ExpressionList(),"
        + " ExpressionList())) -> BooleanLiteral(value))", actualVisitResult.toString());
    assertEquals("value", ((BooleanLiteral) body).getLexeme());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit187() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate",
        new RangeIteratorDomain(new LogicNegation(new ExpressionList()), new LogicNegation(new ExpressionList()))));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate"
        + " in RangeIteratorDomain(LogicNegation(ExpressionList()),"
        + " LogicNegation(ExpressionList()))) -> ExpressionList" + "())", actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(LogicNegation"
        + "(ExpressionList()), LogicNegation(ExpressionList(" + "))))", getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualOperator = ((LogicNegation) end).getOperator();
    String actualOperator1 = ((LogicNegation) start).getOperator();
    assertEquals("RangeIteratorDomain(LogicNegation(ExpressionList())," + " LogicNegation(ExpressionList()))",
        domain.toString());
    assertEquals("not", actualOperator1);
    assertEquals("LogicNegation(ExpressionList())", start.toString());
    Expression leftOperand = ((LogicNegation) start).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertSame(type, start.getType());
    assertEquals("not", actualOperator);
    assertSame(type, end.getType());
    assertEquals("LogicNegation(ExpressionList())", end.toString());
    assertNull(((LogicNegation) start).getRightOperand());
    assertNull(((LogicNegation) end).getRightOperand());
    Expression leftOperand1 = ((LogicNegation) end).getLeftOperand();
    assertEquals("ExpressionList()", leftOperand1.toString());
    assertSame(type, leftOperand1.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand.getType());
  }

  @Test
  public void testVisit188() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new StringLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(ExpressionList(),"
        + " ExpressionList())) -> StringLiteral(value))", actualVisitResult.toString());
    assertEquals("value", ((StringLiteral) body).getLexeme());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit189() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    iteratorList.add(new Iterator("predicate",
        new RangeIteratorDomain(new ListLiteral(expressionList), new ListLiteral(expressionList))));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals(
        "QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(ListLiteral(ExpressionList()),"
            + " ListLiteral(ExpressionList()))) -> ExpressionList" + "())",
        actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(ListLiteral"
        + "(ExpressionList()), ListLiteral(ExpressionList(" + "))))", getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    List<Expression> expressionList1 = ((ListLiteral) end).getExpressionList();
    List<Expression> expressionList2 = ((ListLiteral) start).getExpressionList();
    assertEquals("RangeIteratorDomain(ListLiteral(ExpressionList())," + " ListLiteral(ExpressionList()))",
        domain.toString());
    assertEquals("ListLiteral(ExpressionList())", start.toString());
    Expression getResult1 = expressionList2.get(0);
    assertSame(type, start.getType());
    assertEquals("ListLiteral(ExpressionList())", end.toString());
    Expression getResult2 = expressionList1.get(0);
    assertSame(type, end.getType());
    String actualToStringResult = getResult2.toString();
    assertEquals("ExpressionList()", getResult1.toString());
    assertSame(type, getResult1.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, getResult2.getType());
  }

  @Test
  public void testVisit19() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new LogicNegation(new ExpressionList()), true,
        new LogicNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,LogicNegation(ExpressionList())" + ",true,LogicNegation(ExpressionList()))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("not", ((LogicNegation) start).getOperator());
    Expression leftOperand = ((LogicNegation) end).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    Expression leftOperand1 = ((LogicNegation) start).getLeftOperand();
    String actualToStringResult1 = leftOperand1.toString();
    assertEquals("LogicNegation(ExpressionList())", end.toString());
    assertNull(((LogicNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("LogicNegation(ExpressionList())", start.toString());
    assertEquals("not", ((LogicNegation) end).getOperator());
    assertNull(((LogicNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit190() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList,
        new ArithmeticNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(ExpressionList(),"
        + " ExpressionList())) -> ArithmeticNegation" + "(ExpressionList()))", actualVisitResult.toString());
    assertEquals("-", ((ArithmeticNegation) body).getOperator());
    assertEquals("ArithmeticNegation(ExpressionList())", body.toString());
    Expression leftOperand = ((ArithmeticNegation) body).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertSame(type, body.getType());
    assertNull(((ArithmeticNegation) body).getRightOperand());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand.getType());
    assertEquals("Iterator(predicate in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("predicate", getResult.getName());
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    Expression start = ((RangeIteratorDomain) domain).getStart();
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    assertEquals("ExpressionList()", end.toString());
    assertSame(type, end.getType());
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", start.toString());
  }

  @Test
  public void testVisit191() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new NullLiteral(), new NullLiteral())));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate"
        + " in RangeIteratorDomain(NullLiteral(), NullLiteral()))" + " -> ExpressionList())",
        actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(NullLiteral()," + " NullLiteral()))", getResult.toString());
    Type actualType = ((RangeIteratorDomain) domain).getEnd().getType();
    Type actualType1 = ((RangeIteratorDomain) domain).getStart().getType();
    assertEquals("RangeIteratorDomain(NullLiteral(), NullLiteral())", domain.toString());
    assertSame(type, actualType1);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit192() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList,
        new LogicNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(ExpressionList(),"
        + " ExpressionList())) -> LogicNegation(ExpressionList" + "()))", actualVisitResult.toString());
    assertEquals("not", ((LogicNegation) body).getOperator());
    assertEquals("LogicNegation(ExpressionList())", body.toString());
    Expression leftOperand = ((LogicNegation) body).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertSame(type, body.getType());
    assertNull(((LogicNegation) body).getRightOperand());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand.getType());
    assertEquals("Iterator(predicate in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("predicate", getResult.getName());
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    Expression start = ((RangeIteratorDomain) domain).getStart();
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    assertEquals("ExpressionList()", end.toString());
    assertSame(type, end.getType());
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", start.toString());
  }

  @Test
  public void testVisit193() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new Name("name"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(ExpressionList(),"
        + " ExpressionList())) -> Name(name))", actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("Name(name)", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit194() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new NullLiteral());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(ExpressionList(),"
        + " ExpressionList())) -> NullLiteral())", actualVisitResult.toString());
    assertSame(type, ((QuantifiedExpression) actualVisitResult).getBody().getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit195() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new Name("name"), new Name("name"))));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate"
        + " in RangeIteratorDomain(Name(name), Name(name))) ->" + " ExpressionList())", actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(Name(name)," + " Name(name)))", getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualName = ((Name) end).getName();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult = start.toString();
    assertEquals("RangeIteratorDomain(Name(name), Name(name))", domain.toString());
    assertEquals("Name(name)", actualToStringResult);
    assertSame(type, start.getType());
    assertEquals("name", actualName);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit196() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new Any(), new Any())));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(Any(), Any())) ->"
        + " ExpressionList())", actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    assertEquals("Iterator(predicate in RangeIteratorDomain(Any()," + " Any()))", getResult.toString());
    assertEquals("RangeIteratorDomain(Any(), Any())", getResult.getDomain().toString());
  }

  @Test
  public void testVisit197() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate",
        new RangeIteratorDomain(
            new DateTimeLiteral("0.8.9",
                "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""),
            new DateTimeLiteral("0.8.9",
                "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""))));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals(
        "QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(DateTimeLiteral(0.8.9,"
            + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?(" + "[0-9]+(\\.[0-9]*)?S)?\"), DateTimeLiteral(0.8.9,"
            + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?(" + "[0-9]+(\\.[0-9]*)?S)?\"))) -> ExpressionList())",
        actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals(
        "Iterator(predicate in RangeIteratorDomain(DateTimeLiteral"
            + "(0.8.9, \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9"
            + "]+H)?([0-9]+(\\.[0-9]*)?S)?\"), DateTimeLiteral(0.8.9,"
            + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?(" + "[0-9]+(\\.[0-9]*)?S)?\")))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualConversionFunction = ((DateTimeLiteral) start).getConversionFunction();
    assertEquals("RangeIteratorDomain(DateTimeLiteral(0.8.9," + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?("
        + "[0-9]+(\\.[0-9]*)?S)?\"), DateTimeLiteral(0.8.9," + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?("
        + "[0-9]+(\\.[0-9]*)?S)?\"))", domain.toString());
    assertEquals("0.8.9", actualConversionFunction);
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) start).getLexeme());
    assertSame(type, start.getType());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) end).getLexeme());
    assertSame(type, end.getType());
    assertEquals("0.8.9", ((DateTimeLiteral) end).getConversionFunction());
  }

  @Test
  public void testVisit198() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new NumericLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(ExpressionList(),"
        + " ExpressionList())) -> NumericLiteral(value))", actualVisitResult.toString());
    assertEquals("value", ((NumericLiteral) body).getLexeme());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit199() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new Any());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(ExpressionList(),"
        + " ExpressionList())) -> Any())", actualVisitResult.toString());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit2() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new ArithmeticNegation(new NullLiteral()), true,
        new ArithmeticNegation(new NullLiteral()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,ArithmeticNegation(NullLiteral()" + "),true,ArithmeticNegation(NullLiteral()))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("-", ((ArithmeticNegation) start).getOperator());
    Type actualType = ((ArithmeticNegation) end).getLeftOperand().getType();
    Type actualType1 = ((ArithmeticNegation) start).getLeftOperand().getType();
    assertEquals("ArithmeticNegation(NullLiteral())", end.toString());
    assertNull(((ArithmeticNegation) start).getRightOperand());
    assertEquals("ArithmeticNegation(NullLiteral())", start.toString());
    assertSame(type, start.getType());
    assertEquals("-", ((ArithmeticNegation) end).getOperator());
    assertSame(type, end.getType());
    assertNull(((ArithmeticNegation) end).getRightOperand());
    assertSame(type, actualType1);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit20() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new LogicNegation(new StringLiteral("value")), true,
        new LogicNegation(new StringLiteral("value")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,LogicNegation(StringLiteral(value" + ")),true,LogicNegation(StringLiteral(value)))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("not", ((LogicNegation) start).getOperator());
    Expression leftOperand = ((LogicNegation) end).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    Expression leftOperand1 = ((LogicNegation) start).getLeftOperand();
    String actualToStringResult1 = leftOperand1.toString();
    assertEquals("LogicNegation(StringLiteral(value))", end.toString());
    assertNull(((LogicNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("LogicNegation(StringLiteral(value))", start.toString());
    assertEquals("not", ((LogicNegation) end).getOperator());
    assertNull(((LogicNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("StringLiteral(value)", actualToStringResult);
    assertEquals("StringLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit200() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList,
        new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(ExpressionList(),"
        + " ExpressionList())) -> NamedTypeExpression(qualifiedName" + "))", actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("NamedTypeExpression(qualifiedName)", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit201() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    iteratorList.add(new Iterator("predicate",
        new RangeIteratorDomain(new QualifiedName(stringList), new QualifiedName(stringList))));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate"
        + " in RangeIteratorDomain(Name(foo), Name(foo))) ->" + " ExpressionList())", actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(Name(foo)," + " Name(foo)))", getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualName = ((Name) end).getName();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult = start.toString();
    assertEquals("RangeIteratorDomain(Name(foo), Name(foo))", domain.toString());
    assertEquals("Name(foo)", actualToStringResult);
    assertSame(type, start.getType());
    assertEquals("foo", actualName);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit202() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new ListLiteral(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(ExpressionList(),"
        + " ExpressionList())) -> ListLiteral(ExpressionList(" + ")))", actualVisitResult.toString());
    List<Expression> expressionList1 = ((ListLiteral) body).getExpressionList();
    assertEquals("ListLiteral(ExpressionList())", body.toString());
    Expression getResult1 = expressionList1.get(0);
    assertSame(type, body.getType());
    IteratorDomain domain = getResult.getDomain();
    String actualToStringResult = getResult1.toString();
    assertEquals("Iterator(predicate in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    assertEquals("predicate", getResult.getName());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, getResult1.getType());
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    Expression start = ((RangeIteratorDomain) domain).getStart();
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    assertEquals("ExpressionList()", end.toString());
    assertSame(type, end.getType());
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", start.toString());
  }

  @Test
  public void testVisit203() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FastArrayList fastArrayList = new FastArrayList();
    fastArrayList.add("foo");
    fastArrayList.add(new Iterator("predicate", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    QuantifiedExpression element = new QuantifiedExpression("predicate", fastArrayList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate,  ->" + " ExpressionList())", actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
  }

  @Test
  public void testVisit204() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(
        new Iterator("predicate", new RangeIteratorDomain(new StringLiteral("value"), new StringLiteral("value"))));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(StringLiteral(value),"
        + " StringLiteral(value))) -> ExpressionList())", actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(StringLiteral" + "(value), StringLiteral(value)))",
        getResult.toString());
    Expression start = ((RangeIteratorDomain) domain).getStart();
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult = end.toString();
    String actualLexeme = ((StringLiteral) start).getLexeme();
    assertEquals("RangeIteratorDomain(StringLiteral(value)," + " StringLiteral(value))", domain.toString());
    assertEquals("value", actualLexeme);
    assertSame(type, start.getType());
    assertEquals("StringLiteral(value)", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit205() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(ExpressionList(),"
        + " ExpressionList())) -> NullTest())", actualVisitResult.toString());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit206() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new Context(null), new Context(null))));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate"
        + " in RangeIteratorDomain(Context(), Context())) ->" + " ExpressionList())", actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(Context()," + " Context()))", getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(Context(), Context())", domain.toString());
    assertEquals("Context()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("Context()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit207() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList,
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(ExpressionList(),"
        + " ExpressionList())) -> DateTimeLiteral(0.8.9," + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?"
        + "([0-9]+(\\.[0-9]*)?S)?\"))", actualVisitResult.toString());
    assertEquals("0.8.9", ((DateTimeLiteral) body).getConversionFunction());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) body).getLexeme());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit208() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate",
        new RangeIteratorDomain(new NamedTypeExpression("qualifiedName"), new NamedTypeExpression("qualifiedName"))));
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate"
        + " in RangeIteratorDomain(NamedTypeExpression(qualifiedName),"
        + " NamedTypeExpression(qualifiedName))) -> ExpressionList" + "())", actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain"
        + "(NamedTypeExpression(qualifiedName), NamedTypeExpression" + "(qualifiedName)))", getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualQualifiedName = ((NamedTypeExpression) end).getQualifiedName();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult = start.toString();
    assertEquals("RangeIteratorDomain(NamedTypeExpression(qualifiedName)," + " NamedTypeExpression(qualifiedName))",
        domain.toString());
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertSame(type, start.getType());
    assertSame(type, end.getType());
    assertEquals("qualifiedName", actualQualifiedName);
  }

  @Test
  public void testVisit209() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    QuantifiedExpression element = new QuantifiedExpression("predicate", iteratorList, new QualifiedName(stringList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((QuantifiedExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualVisitResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualVisitResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(ExpressionList(),"
        + " ExpressionList())) -> Name(foo))", actualVisitResult.toString());
    Expression body = ((QuantifiedExpression) actualVisitResult).getBody();
    assertEquals("Name(foo)", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit21() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new NullLiteral(), true, new NullLiteral());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    assertEquals("IntervalTest(true,NullLiteral(),true" + ",NullLiteral())", actualVisitResult.toString());
    Type actualType = ((RangeTest) actualVisitResult).getEnd().getType();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertSame(type, actualType);
    assertSame(type, ((RangeTest) actualVisitResult).getStart().getType());
  }

  @Test
  public void testVisit210() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FEELContext context = FEELContext.makeContext(null);
    Any any = new Any();

    // Act and Assert
    assertSame(any, cloneVisitor.visit(any, context));
  }

  @Test
  public void testVisit211() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ListTypeExpression element = new ListTypeExpression(new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertTrue(
        ((ListTypeExpression) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListTypeExpression(NamedTypeExpression" + "(qualifiedName))", actualVisitResult.toString());
  }

  @Test
  public void testVisit212() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Pair<String, TypeExpression>> pairList = new ArrayList<Pair<String, TypeExpression>>();
    pairList.add(new Pair<String, TypeExpression>("left", new NamedTypeExpression("qualifiedName")));
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualVisitResult = cloneVisitor.visit(new ContextTypeExpression(pairList), params);

    // Assert
    assertTrue(((ContextTypeExpression) actualVisitResult)
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ContextTypeExpression(left: NamedTypeExpression" + "(qualifiedName))", actualVisitResult.toString());
  }

  @Test
  public void testVisit213() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Relational element = new Relational("operator", new LogicNegation(new ExpressionList()),
        new LogicNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Relational) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Relational) actualVisitResult).getOperator());
    String actualOperator = ((LogicNegation) rightOperand).getOperator();
    Expression leftOperand = ((Relational) actualVisitResult).getLeftOperand();
    Type type = ((Relational) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Relational(operator,LogicNegation(ExpressionList()" + "),LogicNegation(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("LogicNegation(ExpressionList())", leftOperand.toString());
    Expression leftOperand1 = ((LogicNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand1.toString();
    assertSame(type, leftOperand.getType());
    assertEquals("not", actualOperator);
    assertNull(((LogicNegation) rightOperand).getRightOperand());
    assertNull(((LogicNegation) leftOperand).getRightOperand());
    assertSame(type, rightOperand.getType());
    assertEquals("LogicNegation(ExpressionList())", rightOperand.toString());
    Expression leftOperand2 = ((LogicNegation) rightOperand).getLeftOperand();
    String actualToStringResult1 = leftOperand2.toString();
    assertEquals("not", ((LogicNegation) leftOperand).getOperator());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit214() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Relational element = new Relational("operator", new NamedTypeExpression("qualifiedName"),
        new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Relational) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Relational) actualVisitResult).getOperator());
    String actualQualifiedName = ((NamedTypeExpression) rightOperand).getQualifiedName();
    Expression leftOperand = ((Relational) actualVisitResult).getLeftOperand();
    Type type = ((Relational) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualQualifiedName1 = ((NamedTypeExpression) leftOperand).getQualifiedName();
    assertEquals("Relational(operator,NamedTypeExpression(qualifiedName" + "),NamedTypeExpression(qualifiedName))",
        actualVisitResult.toString());
    assertSame(type, leftOperand.getType());
    assertEquals("qualifiedName", actualQualifiedName1);
    assertSame(type, rightOperand.getType());
    assertEquals("qualifiedName", actualQualifiedName);
  }

  @Test
  public void testVisit215() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Relational element = new Relational("operator", new NullLiteral(), new NullLiteral());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Relational) actualVisitResult).getOperator());
    Type actualType = ((Relational) actualVisitResult).getRightOperand().getType();
    Type type = ((Relational) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Type actualType1 = ((Relational) actualVisitResult).getLeftOperand().getType();
    assertEquals("Relational(operator,NullLiteral(),NullLiteral())", actualVisitResult.toString());
    assertSame(type, actualType1);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit216() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Relational element = new Relational("operator", new Context(null), new Context(null));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Relational) actualVisitResult).getOperator());
    Expression rightOperand = ((Relational) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Relational) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Relational) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Relational(operator,Context(),Context())", actualVisitResult.toString());
    assertEquals("Context()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("Context()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit217() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Relational element = new Relational("operator", new NumericLiteral("value"), new NumericLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Relational) actualVisitResult).getOperator());
    Expression rightOperand = ((Relational) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Relational) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Relational) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Relational(operator,NumericLiteral(value),NumericLiteral" + "(value))", actualVisitResult.toString());
    assertEquals("NumericLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("NumericLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit218() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Relational element = new Relational("operator", new ArithmeticNegation(new ExpressionList()),
        new ArithmeticNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Relational) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Relational) actualVisitResult).getOperator());
    String actualOperator = ((ArithmeticNegation) rightOperand).getOperator();
    Expression leftOperand = ((Relational) actualVisitResult).getLeftOperand();
    Type type = ((Relational) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Relational(operator,ArithmeticNegation(ExpressionList" + "()),ArithmeticNegation(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("ArithmeticNegation(ExpressionList())", leftOperand.toString());
    Expression leftOperand1 = ((ArithmeticNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand1.toString();
    assertSame(type, leftOperand.getType());
    assertEquals("-", actualOperator);
    assertNull(((ArithmeticNegation) rightOperand).getRightOperand());
    assertNull(((ArithmeticNegation) leftOperand).getRightOperand());
    assertSame(type, rightOperand.getType());
    assertEquals("ArithmeticNegation(ExpressionList())", rightOperand.toString());
    Expression leftOperand2 = ((ArithmeticNegation) rightOperand).getLeftOperand();
    String actualToStringResult1 = leftOperand2.toString();
    assertEquals("-", ((ArithmeticNegation) leftOperand).getOperator());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit219() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Relational element = new Relational("operator", new ExpressionList(), new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Relational) actualVisitResult).getOperator());
    Expression rightOperand = ((Relational) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Relational) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Relational) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Relational(operator,ExpressionList(),ExpressionList" + "())", actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit22() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    RangeTest element = new RangeTest(true, new ListLiteral(expressionList), true, new ListLiteral(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,ListLiteral(ExpressionList()),true" + ",ListLiteral(ExpressionList()))",
        actualVisitResult.toString());
    List<Expression> expressionList1 = ((ListLiteral) end).getExpressionList();
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    List<Expression> expressionList2 = ((ListLiteral) start).getExpressionList();
    assertEquals("ListLiteral(ExpressionList())", end.toString());
    assertEquals("ListLiteral(ExpressionList())", start.toString());
    Expression getResult = expressionList2.get(0);
    assertSame(type, start.getType());
    assertSame(type, end.getType());
    Expression getResult1 = expressionList1.get(0);
    String actualToStringResult = getResult.toString();
    assertEquals("ExpressionList()", getResult1.toString());
    assertSame(type, getResult1.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, getResult.getType());
  }

  @Test
  public void testVisit220() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Relational element = new Relational("operator",
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""),
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Relational) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Relational) actualVisitResult).getOperator());
    Expression leftOperand = ((Relational) actualVisitResult).getLeftOperand();
    Type type = ((Relational) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Relational(operator,DateTimeLiteral(0.8.9," + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?("
        + "[0-9]+(\\.[0-9]*)?S)?\"),DateTimeLiteral(0.8.9," + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?("
        + "[0-9]+(\\.[0-9]*)?S)?\"))", actualVisitResult.toString());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) leftOperand).getLexeme());
    assertSame(type, leftOperand.getType());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) rightOperand).getLexeme());
    assertSame(type, rightOperand.getType());
    assertEquals("0.8.9", ((DateTimeLiteral) leftOperand).getConversionFunction());
    assertEquals("0.8.9", ((DateTimeLiteral) rightOperand).getConversionFunction());
  }

  @Test
  public void testVisit221() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Relational element = new Relational("operator", new Any(), new Any());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Relational) actualVisitResult).getOperator());
    assertTrue(((Relational) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Relational(operator,Any(),Any())", actualVisitResult.toString());
  }

  @Test
  public void testVisit222() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    Relational element = new Relational("operator", new ListLiteral(expressionList), new ListLiteral(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Relational) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Relational) actualVisitResult).getOperator());
    List<Expression> expressionList1 = ((ListLiteral) rightOperand).getExpressionList();
    Expression leftOperand = ((Relational) actualVisitResult).getLeftOperand();
    Type type = ((Relational) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    List<Expression> expressionList2 = ((ListLiteral) leftOperand).getExpressionList();
    assertEquals("Relational(operator,ListLiteral(ExpressionList())" + ",ListLiteral(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("ListLiteral(ExpressionList())", leftOperand.toString());
    assertSame(type, leftOperand.getType());
    assertEquals("ListLiteral(ExpressionList())", rightOperand.toString());
    assertSame(type, rightOperand.getType());
    Expression getResult = expressionList2.get(0);
    Expression getResult1 = expressionList1.get(0);
    String actualToStringResult = getResult.toString();
    assertEquals("ExpressionList()", getResult1.toString());
    assertSame(type, getResult1.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, getResult.getType());
  }

  @Test
  public void testVisit223() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Relational element = new Relational("operator", new StringLiteral("value"), new StringLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Relational) actualVisitResult).getOperator());
    Expression rightOperand = ((Relational) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Relational) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Relational) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Relational(operator,StringLiteral(value),StringLiteral" + "(value))", actualVisitResult.toString());
    assertEquals("StringLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("StringLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit224() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Relational element = new Relational("operator", new Name("name"), new Name("name"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Relational) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Relational) actualVisitResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    Expression leftOperand = ((Relational) actualVisitResult).getLeftOperand();
    Type type = ((Relational) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualName1 = ((Name) leftOperand).getName();
    assertEquals("Relational(operator,Name(name),Name(name))", actualVisitResult.toString());
    assertEquals("name", actualName1);
    assertSame(type, leftOperand.getType());
    assertEquals("name", actualName);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit225() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Relational element = new Relational("operator", new BooleanLiteral("value"), new BooleanLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Relational) actualVisitResult).getOperator());
    Expression rightOperand = ((Relational) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Relational) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Relational) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Relational(operator,BooleanLiteral(value),BooleanLiteral" + "(value))", actualVisitResult.toString());
    assertEquals("BooleanLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("BooleanLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit226() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    Relational element = new Relational("operator", new QualifiedName(stringList), new QualifiedName(stringList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Relational) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Relational) actualVisitResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    Expression leftOperand = ((Relational) actualVisitResult).getLeftOperand();
    Type type = ((Relational) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualName1 = ((Name) leftOperand).getName();
    assertEquals("Relational(operator,Name(foo),Name(foo))", actualVisitResult.toString());
    assertEquals("foo", actualName1);
    assertSame(type, leftOperand.getType());
    assertEquals("foo", actualName);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit227() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    InExpression element = new InExpression(value, new OperatorTest("operator", new Any()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), OperatorTest(operator" + ",Any()))", actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    assertEquals("operator", ((OperatorTest) getResult).getOperator());
    assertEquals("OperatorTest(operator,Any())", getResult.toString());
    assertSame(type, getResult.getType());
  }

  @Test
  public void testVisit228() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NullTest value = new NullTest();
    InExpression element = new InExpression(value, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertTrue(((InExpression) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("InExpression(NullTest(), NullTest())", actualVisitResult.toString());
  }

  @Test
  public void testVisit229() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NamedTypeExpression value = new NamedTypeExpression("qualifiedName");
    InExpression element = new InExpression(value, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualQualifiedName = ((NamedTypeExpression) value1).getQualifiedName();
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(NamedTypeExpression(qualifiedName)," + " NullTest())", actualVisitResult.toString());
    assertSame(type, value1.getType());
    assertEquals("qualifiedName", actualQualifiedName);
  }

  @Test
  public void testVisit23() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new LogicNegation(new NullTest()), true, new LogicNegation(new NullTest()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,LogicNegation(NullTest()),true" + ",LogicNegation(NullTest()))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("not", ((LogicNegation) start).getOperator());
    assertEquals("LogicNegation(NullTest())", start.toString());
    assertSame(type, start.getType());
    assertEquals("LogicNegation(NullTest())", end.toString());
    assertNull(((LogicNegation) start).getRightOperand());
    assertSame(type, end.getType());
    assertNull(((LogicNegation) end).getRightOperand());
    assertEquals("not", ((LogicNegation) end).getOperator());
  }

  @Test
  public void testVisit230() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    DateTimeLiteral value = new DateTimeLiteral("0.8.9",
        "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"");
    InExpression element = new InExpression(value, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals(
        "InExpression(DateTimeLiteral(0.8.9, \"[-]?P([0-9]+D"
            + ")?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0-9]*)?S)?\")," + " NullTest())",
        actualVisitResult.toString());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) value1).getLexeme());
    assertSame(type, value1.getType());
    assertEquals("0.8.9", ((DateTimeLiteral) value1).getConversionFunction());
  }

  @Test
  public void testVisit231() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    InExpression element = new InExpression(new ExpressionList(), (PositiveUnaryTest) null);

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value = ((InExpression) actualVisitResult).getValue();
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), )", actualVisitResult.toString());
    assertSame(type, value.getType());
    assertEquals("ExpressionList()", value.toString());
  }

  @Test
  public void testVisit232() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Name value = new Name("name");
    InExpression element = new InExpression(value, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualName = ((Name) value1).getName();
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(Name(name), NullTest())", actualVisitResult.toString());
    assertEquals("name", actualName);
    assertSame(type, value1.getType());
  }

  @Test
  public void testVisit233() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NumericLiteral value = new NumericLiteral("value");
    InExpression element = new InExpression(value, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(NumericLiteral(value), NullTest())", actualVisitResult.toString());
    assertEquals("NumericLiteral(value)", actualToStringResult);
    assertSame(type, value1.getType());
  }

  @Test
  public void testVisit234() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    InExpression element = new InExpression(value, new OperatorTest("operator", new Name("name")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), OperatorTest(operator" + ",Name(name)))",
        actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    assertEquals("operator", ((OperatorTest) getResult).getOperator());
    assertEquals("OperatorTest(operator,Name(name))", getResult.toString());
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    String actualToStringResult1 = endpoint.toString();
    assertSame(type, getResult.getType());
    assertEquals("Name(name)", actualToStringResult1);
    assertSame(type, endpoint.getType());
  }

  @Test
  public void testVisit235() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    InExpression element = new InExpression(value, new OperatorTest("operator", new NullTest()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), OperatorTest(operator" + ",NullTest()))",
        actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    assertEquals("operator", ((OperatorTest) getResult).getOperator());
    assertEquals("OperatorTest(operator,NullTest())", getResult.toString());
    assertSame(type, getResult.getType());
  }

  @Test
  public void testVisit236() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    InExpression element = new InExpression(value, new OperatorTest("operator", new NumericLiteral("value")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), OperatorTest(operator" + ",NumericLiteral(value)))",
        actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    assertEquals("operator", ((OperatorTest) getResult).getOperator());
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    assertEquals("OperatorTest(operator,NumericLiteral(value))", getResult.toString());
    String actualLexeme = ((NumericLiteral) endpoint).getLexeme();
    assertSame(type, getResult.getType());
    assertEquals("value", actualLexeme);
    assertSame(type, endpoint.getType());
  }

  @Test
  public void testVisit237() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NullLiteral value = new NullLiteral();
    InExpression element = new InExpression(value, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type actualType = ((InExpression) actualVisitResult).getValue().getType();
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(NullLiteral(), NullTest())", actualVisitResult.toString());
    assertSame(type, actualType);
  }

  @Test
  public void testVisit238() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    InExpression element = new InExpression(value, new OperatorTest("operator", new QualifiedName(stringList)));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), OperatorTest(operator" + ",Name(foo)))", actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    assertEquals("operator", ((OperatorTest) getResult).getOperator());
    assertEquals("OperatorTest(operator,Name(foo))", getResult.toString());
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    String actualToStringResult1 = endpoint.toString();
    assertSame(type, getResult.getType());
    assertEquals("Name(foo)", actualToStringResult1);
    assertSame(type, endpoint.getType());
  }

  @Test
  public void testVisit239() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BooleanLiteral value = new BooleanLiteral("value");
    InExpression element = new InExpression(value, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(BooleanLiteral(value), NullTest())", actualVisitResult.toString());
    assertEquals("BooleanLiteral(value)", actualToStringResult);
    assertSame(type, value1.getType());
  }

  @Test
  public void testVisit24() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>(1);
    expressionList.add(new ExpressionList());
    expressionList.add(new ExpressionList());
    RangeTest element = new RangeTest(true, new ExpressionList(expressionList), true,
        new ExpressionList(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,ExpressionList(ExpressionList()"
        + ",ExpressionList()),true,ExpressionList(ExpressionList" + "(),ExpressionList()))",
        actualVisitResult.toString());
    List<Expression> expressionList1 = ((ExpressionList) end).getExpressionList();
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    List<Expression> expressionList2 = ((ExpressionList) start).getExpressionList();
    assertEquals("ExpressionList(ExpressionList(),ExpressionList())", end.toString());
    assertEquals("ExpressionList(ExpressionList(),ExpressionList())", start.toString());
    Expression getResult = expressionList2.get(0);
    Expression getResult1 = expressionList2.get(1);
    assertSame(type, start.getType());
    assertSame(type, end.getType());
    Expression getResult2 = expressionList1.get(0);
    Expression getResult3 = expressionList1.get(1);
    String actualToStringResult = getResult.toString();
    assertEquals("ExpressionList()", getResult2.toString());
    assertSame(type, getResult2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, getResult.getType());
    assertEquals("ExpressionList()", getResult3.toString());
    assertSame(type, getResult3.getType());
    assertEquals("ExpressionList()", getResult1.toString());
    assertSame(type, getResult1.getType());
  }

  @Test
  public void testVisit240() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    InExpression element = new InExpression(value, new OperatorTest("operator", new DateTimeLiteral("0.8.9",
        "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), OperatorTest(operator"
        + ",DateTimeLiteral(0.8.9, \"[-]?P([0-9]+D)?T?([0-9]+H" + ")?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0-9]*)?S)?\")))",
        actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    assertEquals("operator", ((OperatorTest) getResult).getOperator());
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    assertEquals("OperatorTest(operator,DateTimeLiteral(0.8.9," + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?("
        + "[0-9]+(\\.[0-9]*)?S)?\"))", getResult.toString());
    String actualConversionFunction = ((DateTimeLiteral) endpoint).getConversionFunction();
    assertSame(type, getResult.getType());
    assertEquals("0.8.9", actualConversionFunction);
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) endpoint).getLexeme());
    assertSame(type, endpoint.getType());
  }

  @Test
  public void testVisit241() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    InExpression element = new InExpression(value,
        new OperatorTest("operator", new LogicNegation(new ExpressionList())));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), OperatorTest(operator" + ",LogicNegation(ExpressionList())))",
        actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    assertEquals("operator", ((OperatorTest) getResult).getOperator());
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    assertEquals("OperatorTest(operator,LogicNegation(ExpressionList" + "()))", getResult.toString());
    String actualOperator = ((LogicNegation) endpoint).getOperator();
    assertSame(type, getResult.getType());
    assertEquals("not", actualOperator);
    assertEquals("LogicNegation(ExpressionList())", endpoint.toString());
    Expression leftOperand = ((LogicNegation) endpoint).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertSame(type, endpoint.getType());
    assertNull(((LogicNegation) endpoint).getRightOperand());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
  }

  @Test
  public void testVisit242() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    InExpression element = new InExpression(value,
        new RangeTest(true, new ExpressionList(), true, new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), IntervalTest(true" + ",ExpressionList(),true,ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    assertTrue(((RangeTest) getResult).isOpenEnd());
    Expression end = ((RangeTest) getResult).getEnd();
    String actualToStringResult1 = end.toString();
    Expression start = ((RangeTest) getResult).getStart();
    assertSame(type, getResult.getType());
    assertTrue(((RangeTest) getResult).isOpenStart());
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())", getResult.toString());
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, end.getType());
    assertEquals("ExpressionList()", start.toString());
  }

  @Test
  public void testVisit243() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    QualifiedName value = new QualifiedName(stringList);
    InExpression element = new InExpression(value, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualName = ((Name) value1).getName();
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(Name(foo), NullTest())", actualVisitResult.toString());
    assertEquals("foo", actualName);
    assertSame(type, value1.getType());
  }

  @Test
  public void testVisit244() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    LogicNegation value = new LogicNegation(new ExpressionList());
    InExpression element = new InExpression(value, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(LogicNegation(ExpressionList())," + " NullTest())", actualVisitResult.toString());
    Expression leftOperand = ((LogicNegation) value1).getLeftOperand();
    assertNull(((LogicNegation) value1).getRightOperand());
    assertEquals("not", ((LogicNegation) value1).getOperator());
    assertSame(type, value1.getType());
    assertEquals("LogicNegation(ExpressionList())", value1.toString());
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", leftOperand.toString());
  }

  @Test
  public void testVisit245() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    InExpression element = new InExpression(value, new OperatorTest("operator", new StringLiteral("value")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), OperatorTest(operator" + ",StringLiteral(value)))",
        actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    assertEquals("operator", ((OperatorTest) getResult).getOperator());
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    assertEquals("OperatorTest(operator,StringLiteral(value))", getResult.toString());
    String actualLexeme = ((StringLiteral) endpoint).getLexeme();
    assertSame(type, getResult.getType());
    assertEquals("value", actualLexeme);
    assertSame(type, endpoint.getType());
  }

  @Test
  public void testVisit246() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    InExpression element = new InExpression(value, new OperatorTest("operator", new NullLiteral()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), OperatorTest(operator" + ",NullLiteral()))",
        actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    assertEquals("operator", ((OperatorTest) getResult).getOperator());
    assertEquals("OperatorTest(operator,NullLiteral())", getResult.toString());
    Type actualType = ((OperatorTest) getResult).getEndpoint().getType();
    assertSame(type, getResult.getType());
    assertSame(type, actualType);
  }

  @Test
  public void testVisit247() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    StringLiteral value = new StringLiteral("value");
    InExpression element = new InExpression(value, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(StringLiteral(value), NullTest())", actualVisitResult.toString());
    assertEquals("StringLiteral(value)", actualToStringResult);
    assertSame(type, value1.getType());
  }

  @Test
  public void testVisit248() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    InExpression element = new InExpression(value, new ListTest(new ListLiteral(expressionList)));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), ListTest(ListLiteral" + "(ExpressionList())))",
        actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    ListLiteral listLiteral = ((ListTest) getResult).getListLiteral();
    assertEquals("ListTest(ListLiteral(ExpressionList()))", getResult.toString());
    assertSame(type, getResult.getType());
    assertEquals("ListLiteral(ExpressionList())", listLiteral.toString());
    assertSame(type, listLiteral.getType());
    Expression getResult1 = listLiteral.getExpressionList().get(0);
    assertSame(type, getResult1.getType());
    assertEquals("ExpressionList()", getResult1.toString());
  }

  @Test
  public void testVisit249() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    InExpression element = new InExpression(value, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), NullTest())", actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
  }

  @Test
  public void testVisit25() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new StringLiteral("value"), true, new StringLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    assertEquals("IntervalTest(true,StringLiteral(value),true,StringLiteral" + "(value))",
        actualVisitResult.toString());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("StringLiteral(value)", actualToStringResult);
    assertEquals("value", ((StringLiteral) start).getLexeme());
    assertSame(type, start.getType());
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit250() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArithmeticNegation value = new ArithmeticNegation(new ExpressionList());
    InExpression element = new InExpression(value, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ArithmeticNegation(ExpressionList())," + " NullTest())", actualVisitResult.toString());
    Expression leftOperand = ((ArithmeticNegation) value1).getLeftOperand();
    assertNull(((ArithmeticNegation) value1).getRightOperand());
    assertEquals("-", ((ArithmeticNegation) value1).getOperator());
    assertSame(type, value1.getType());
    assertEquals("ArithmeticNegation(ExpressionList())", value1.toString());
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", leftOperand.toString());
  }

  @Test
  public void testVisit251() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    InExpression element = new InExpression(value, new ExpressionTest(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), ExpressionTest" + "(ExpressionList()))", actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    Expression expression = ((ExpressionTest) getResult).getExpression();
    assertEquals("ExpressionTest(ExpressionList())", getResult.toString());
    String actualToStringResult1 = expression.toString();
    assertSame(type, getResult.getType());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, expression.getType());
  }

  @Test
  public void testVisit252() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    InExpression element = new InExpression(value,
        new OperatorTest("operator", new ArithmeticNegation(new ExpressionList())));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), OperatorTest(operator" + ",ArithmeticNegation(ExpressionList())))",
        actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    assertEquals("operator", ((OperatorTest) getResult).getOperator());
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    assertEquals("OperatorTest(operator,ArithmeticNegation(ExpressionList" + "()))", getResult.toString());
    String actualOperator = ((ArithmeticNegation) endpoint).getOperator();
    assertSame(type, getResult.getType());
    assertEquals("-", actualOperator);
    assertEquals("ArithmeticNegation(ExpressionList())", endpoint.toString());
    Expression leftOperand = ((ArithmeticNegation) endpoint).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertSame(type, endpoint.getType());
    assertNull(((ArithmeticNegation) endpoint).getRightOperand());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
  }

  @Test
  public void testVisit253() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    InExpression element = new InExpression(value, new OperatorTest("operator", new BooleanLiteral("value")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), OperatorTest(operator" + ",BooleanLiteral(value)))",
        actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    assertEquals("operator", ((OperatorTest) getResult).getOperator());
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    assertEquals("OperatorTest(operator,BooleanLiteral(value))", getResult.toString());
    String actualLexeme = ((BooleanLiteral) endpoint).getLexeme();
    assertSame(type, getResult.getType());
    assertEquals("value", actualLexeme);
    assertSame(type, endpoint.getType());
  }

  @Test
  public void testVisit254() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    InExpression element = new InExpression(value, new OperatorTest("operator", new ListLiteral(expressionList)));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), OperatorTest(operator" + ",ListLiteral(ExpressionList())))",
        actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    assertEquals("operator", ((OperatorTest) getResult).getOperator());
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    assertEquals("OperatorTest(operator,ListLiteral(ExpressionList" + "()))", getResult.toString());
    List<Expression> expressionList1 = ((ListLiteral) endpoint).getExpressionList();
    assertSame(type, getResult.getType());
    assertEquals("ListLiteral(ExpressionList())", endpoint.toString());
    Expression getResult1 = expressionList1.get(0);
    assertSame(type, endpoint.getType());
    assertSame(type, getResult1.getType());
    assertEquals("ExpressionList()", getResult1.toString());
  }

  @Test
  public void testVisit255() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    InExpression element = new InExpression(value,
        new OperatorTest("operator", new NamedTypeExpression("qualifiedName")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), OperatorTest(operator" + ",NamedTypeExpression(qualifiedName)))",
        actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    assertEquals("operator", ((OperatorTest) getResult).getOperator());
    assertEquals("OperatorTest(operator,NamedTypeExpression" + "(qualifiedName))", getResult.toString());
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    String actualToStringResult1 = endpoint.toString();
    assertSame(type, getResult.getType());
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult1);
    assertSame(type, endpoint.getType());
  }

  @Test
  public void testVisit256() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList value = new ExpressionList();
    InExpression element = new InExpression(value, new OperatorTest("operator", new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    String actualToStringResult = value1.toString();
    PositiveUnaryTest getResult = ((InExpression) actualVisitResult).getTests().get(0);
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ExpressionList(), OperatorTest(operator" + ",ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, value1.getType());
    assertEquals("operator", ((OperatorTest) getResult).getOperator());
    assertEquals("OperatorTest(operator,ExpressionList())", getResult.toString());
    Expression endpoint = ((OperatorTest) getResult).getEndpoint();
    String actualToStringResult1 = endpoint.toString();
    assertSame(type, getResult.getType());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, endpoint.getType());
  }

  @Test
  public void testVisit257() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    ListLiteral value = new ListLiteral(expressionList);
    InExpression element = new InExpression(value, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression value1 = ((InExpression) actualVisitResult).getValue();
    List<Expression> expressionList1 = ((ListLiteral) value1).getExpressionList();
    Type type = ((InExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("InExpression(ListLiteral(ExpressionList())," + " NullTest())", actualVisitResult.toString());
    assertEquals("ListLiteral(ExpressionList())", value1.toString());
    assertSame(type, value1.getType());
    Expression getResult = expressionList1.get(0);
    assertSame(type, getResult.getType());
    assertEquals("ExpressionList()", getResult.toString());
  }

  @Test
  public void testVisit258() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Any value = new Any();
    InExpression element = new InExpression(value, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertTrue(((InExpression) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("InExpression(Any(), NullTest())", actualVisitResult.toString());
  }

  @Test
  public void testVisit259() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Exponentiation element = new Exponentiation(new StringLiteral("value"), new StringLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("**", ((Exponentiation) actualVisitResult).getOperator());
    Expression rightOperand = ((Exponentiation) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Exponentiation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Exponentiation) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Exponentiation(StringLiteral(value),StringLiteral" + "(value))", actualVisitResult.toString());
    assertEquals("StringLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("StringLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit26() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new ArithmeticNegation(new Any()), true, new ArithmeticNegation(new Any()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,ArithmeticNegation(Any()),true" + ",ArithmeticNegation(Any()))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("-", ((ArithmeticNegation) start).getOperator());
    assertEquals("ArithmeticNegation(Any())", start.toString());
    assertSame(type, start.getType());
    assertEquals("ArithmeticNegation(Any())", end.toString());
    assertNull(((ArithmeticNegation) start).getRightOperand());
    assertSame(type, end.getType());
    assertNull(((ArithmeticNegation) end).getRightOperand());
    assertEquals("-", ((ArithmeticNegation) end).getOperator());
  }

  @Test
  public void testVisit260() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Exponentiation element = new Exponentiation(new BooleanLiteral("value"), new BooleanLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("**", ((Exponentiation) actualVisitResult).getOperator());
    Expression rightOperand = ((Exponentiation) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Exponentiation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Exponentiation) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Exponentiation(BooleanLiteral(value),BooleanLiteral" + "(value))", actualVisitResult.toString());
    assertEquals("BooleanLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("BooleanLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit261() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Exponentiation element = new Exponentiation(new Context(null), new Context(null));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("**", ((Exponentiation) actualVisitResult).getOperator());
    Expression rightOperand = ((Exponentiation) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Exponentiation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Exponentiation) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Exponentiation(Context(),Context())", actualVisitResult.toString());
    assertEquals("Context()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("Context()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit262() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Exponentiation element = new Exponentiation(new Name("name"), new Name("name"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Exponentiation) actualVisitResult).getRightOperand();
    assertEquals("**", ((Exponentiation) actualVisitResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    Expression leftOperand = ((Exponentiation) actualVisitResult).getLeftOperand();
    Type type = ((Exponentiation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualName1 = ((Name) leftOperand).getName();
    assertEquals("Exponentiation(Name(name),Name(name))", actualVisitResult.toString());
    assertEquals("name", actualName1);
    assertSame(type, leftOperand.getType());
    assertEquals("name", actualName);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit263() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    Exponentiation element = new Exponentiation(new QualifiedName(stringList), new QualifiedName(stringList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Exponentiation) actualVisitResult).getRightOperand();
    assertEquals("**", ((Exponentiation) actualVisitResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    Expression leftOperand = ((Exponentiation) actualVisitResult).getLeftOperand();
    Type type = ((Exponentiation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualName1 = ((Name) leftOperand).getName();
    assertEquals("Exponentiation(Name(foo),Name(foo))", actualVisitResult.toString());
    assertEquals("foo", actualName1);
    assertSame(type, leftOperand.getType());
    assertEquals("foo", actualName);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit264() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Exponentiation element = new Exponentiation(
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""),
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Exponentiation) actualVisitResult).getRightOperand();
    assertEquals("**", ((Exponentiation) actualVisitResult).getOperator());
    Expression leftOperand = ((Exponentiation) actualVisitResult).getLeftOperand();
    Type type = ((Exponentiation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Exponentiation(DateTimeLiteral(0.8.9, \"[-]?P([0-9"
        + "]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0" + "-9]*)?S)?\"),DateTimeLiteral(0.8.9, \"[-]?P([0-9]+D"
        + ")?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0-9" + "]*)?S)?\"))", actualVisitResult.toString());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) leftOperand).getLexeme());
    assertSame(type, leftOperand.getType());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) rightOperand).getLexeme());
    assertSame(type, rightOperand.getType());
    assertEquals("0.8.9", ((DateTimeLiteral) leftOperand).getConversionFunction());
    assertEquals("0.8.9", ((DateTimeLiteral) rightOperand).getConversionFunction());
  }

  @Test
  public void testVisit265() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Exponentiation element = new Exponentiation(new ExpressionList(), new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("**", ((Exponentiation) actualVisitResult).getOperator());
    Expression rightOperand = ((Exponentiation) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Exponentiation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Exponentiation) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Exponentiation(ExpressionList(),ExpressionList())", actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit266() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Exponentiation element = new Exponentiation(new NumericLiteral("value"), new NumericLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("**", ((Exponentiation) actualVisitResult).getOperator());
    Expression rightOperand = ((Exponentiation) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Exponentiation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Exponentiation) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Exponentiation(NumericLiteral(value),NumericLiteral" + "(value))", actualVisitResult.toString());
    assertEquals("NumericLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("NumericLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit267() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Exponentiation element = new Exponentiation(new Any(), new Any());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("**", ((Exponentiation) actualVisitResult).getOperator());
    assertTrue(
        ((Exponentiation) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Exponentiation(Any(),Any())", actualVisitResult.toString());
  }

  @Test
  public void testVisit268() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Exponentiation element = new Exponentiation(new NullLiteral(), new NullLiteral());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("**", ((Exponentiation) actualVisitResult).getOperator());
    Type actualType = ((Exponentiation) actualVisitResult).getRightOperand().getType();
    Type type = ((Exponentiation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Type actualType1 = ((Exponentiation) actualVisitResult).getLeftOperand().getType();
    assertEquals("Exponentiation(NullLiteral(),NullLiteral())", actualVisitResult.toString());
    assertSame(type, actualType1);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit269() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    Exponentiation element = new Exponentiation(new ListLiteral(expressionList), new ListLiteral(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Exponentiation) actualVisitResult).getRightOperand();
    assertEquals("**", ((Exponentiation) actualVisitResult).getOperator());
    List<Expression> expressionList1 = ((ListLiteral) rightOperand).getExpressionList();
    Expression leftOperand = ((Exponentiation) actualVisitResult).getLeftOperand();
    Type type = ((Exponentiation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    List<Expression> expressionList2 = ((ListLiteral) leftOperand).getExpressionList();
    assertEquals("Exponentiation(ListLiteral(ExpressionList()),ListLiteral" + "(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("ListLiteral(ExpressionList())", leftOperand.toString());
    assertSame(type, leftOperand.getType());
    assertEquals("ListLiteral(ExpressionList())", rightOperand.toString());
    assertSame(type, rightOperand.getType());
    Expression getResult = expressionList2.get(0);
    Expression getResult1 = expressionList1.get(0);
    String actualToStringResult = getResult.toString();
    assertEquals("ExpressionList()", getResult1.toString());
    assertSame(type, getResult1.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, getResult.getType());
  }

  @Test
  public void testVisit27() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new ArithmeticNegation(new ArithmeticNegation(new ExpressionList())), true,
        new ArithmeticNegation(new ArithmeticNegation(new ExpressionList())));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,ArithmeticNegation(ArithmeticNegation"
        + "(ExpressionList())),true,ArithmeticNegation" + "(ArithmeticNegation(ExpressionList())))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    String actualOperator = ((ArithmeticNegation) start).getOperator();
    Expression leftOperand = ((ArithmeticNegation) end).getLeftOperand();
    assertEquals("-", actualOperator);
    String actualOperator1 = ((ArithmeticNegation) leftOperand).getOperator();
    Expression leftOperand1 = ((ArithmeticNegation) start).getLeftOperand();
    assertEquals("ArithmeticNegation(ArithmeticNegation(ExpressionList" + "()))", end.toString());
    String actualOperator2 = ((ArithmeticNegation) leftOperand1).getOperator();
    assertNull(((ArithmeticNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("ArithmeticNegation(ArithmeticNegation(ExpressionList" + "()))", start.toString());
    assertEquals("-", ((ArithmeticNegation) end).getOperator());
    assertNull(((ArithmeticNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("-", actualOperator2);
    assertSame(type, leftOperand.getType());
    assertEquals("-", actualOperator1);
    Expression leftOperand2 = ((ArithmeticNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand2.toString();
    assertNull(((ArithmeticNegation) leftOperand1).getRightOperand());
    assertEquals("ArithmeticNegation(ExpressionList())", leftOperand1.toString());
    assertEquals("ArithmeticNegation(ExpressionList())", leftOperand.toString());
    assertSame(type, leftOperand1.getType());
    Expression leftOperand3 = ((ArithmeticNegation) leftOperand1).getLeftOperand();
    String actualToStringResult1 = leftOperand3.toString();
    assertNull(((ArithmeticNegation) leftOperand).getRightOperand());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand3.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand2.getType());
  }

  @Test
  public void testVisit270() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Exponentiation element = new Exponentiation(new NullTest(), new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("**", ((Exponentiation) actualVisitResult).getOperator());
    assertTrue(
        ((Exponentiation) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Exponentiation(NullTest(),NullTest())", actualVisitResult.toString());
  }

  @Test
  public void testVisit271() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Exponentiation element = new Exponentiation(new LogicNegation(new ExpressionList()),
        new LogicNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Exponentiation) actualVisitResult).getRightOperand();
    assertEquals("**", ((Exponentiation) actualVisitResult).getOperator());
    String actualOperator = ((LogicNegation) rightOperand).getOperator();
    Expression leftOperand = ((Exponentiation) actualVisitResult).getLeftOperand();
    Type type = ((Exponentiation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Exponentiation(LogicNegation(ExpressionList())" + ",LogicNegation(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("LogicNegation(ExpressionList())", leftOperand.toString());
    Expression leftOperand1 = ((LogicNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand1.toString();
    assertSame(type, leftOperand.getType());
    assertEquals("not", actualOperator);
    assertNull(((LogicNegation) rightOperand).getRightOperand());
    assertNull(((LogicNegation) leftOperand).getRightOperand());
    assertSame(type, rightOperand.getType());
    assertEquals("LogicNegation(ExpressionList())", rightOperand.toString());
    Expression leftOperand2 = ((LogicNegation) rightOperand).getLeftOperand();
    String actualToStringResult1 = leftOperand2.toString();
    assertEquals("not", ((LogicNegation) leftOperand).getOperator());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit272() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Exponentiation element = new Exponentiation(new NamedTypeExpression("qualifiedName"),
        new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Exponentiation) actualVisitResult).getRightOperand();
    assertEquals("**", ((Exponentiation) actualVisitResult).getOperator());
    String actualQualifiedName = ((NamedTypeExpression) rightOperand).getQualifiedName();
    Expression leftOperand = ((Exponentiation) actualVisitResult).getLeftOperand();
    Type type = ((Exponentiation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualQualifiedName1 = ((NamedTypeExpression) leftOperand).getQualifiedName();
    assertEquals("Exponentiation(NamedTypeExpression(qualifiedName)" + ",NamedTypeExpression(qualifiedName))",
        actualVisitResult.toString());
    assertSame(type, leftOperand.getType());
    assertEquals("qualifiedName", actualQualifiedName1);
    assertSame(type, rightOperand.getType());
    assertEquals("qualifiedName", actualQualifiedName);
  }

  @Test
  public void testVisit273() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Exponentiation element = new Exponentiation(new ArithmeticNegation(new ExpressionList()),
        new ArithmeticNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Exponentiation) actualVisitResult).getRightOperand();
    assertEquals("**", ((Exponentiation) actualVisitResult).getOperator());
    String actualOperator = ((ArithmeticNegation) rightOperand).getOperator();
    Expression leftOperand = ((Exponentiation) actualVisitResult).getLeftOperand();
    Type type = ((Exponentiation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Exponentiation(ArithmeticNegation(ExpressionList()" + "),ArithmeticNegation(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("ArithmeticNegation(ExpressionList())", leftOperand.toString());
    Expression leftOperand1 = ((ArithmeticNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand1.toString();
    assertSame(type, leftOperand.getType());
    assertEquals("-", actualOperator);
    assertNull(((ArithmeticNegation) rightOperand).getRightOperand());
    assertNull(((ArithmeticNegation) leftOperand).getRightOperand());
    assertSame(type, rightOperand.getType());
    assertEquals("ArithmeticNegation(ExpressionList())", rightOperand.toString());
    Expression leftOperand2 = ((ArithmeticNegation) rightOperand).getLeftOperand();
    String actualToStringResult1 = leftOperand2.toString();
    assertEquals("-", ((ArithmeticNegation) leftOperand).getOperator());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit274() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Name element = new Name("name");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertTrue(((Name) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(name)", actualVisitResult.toString());
  }

  @Test
  public void testVisit275() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FormalParameter formalParameter = new FormalParameter("name", new AnyType());

    // Act and Assert
    assertSame(formalParameter, cloneVisitor.visit(formalParameter, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit276() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArithmeticNegation element = new ArithmeticNegation(new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertNull(((ArithmeticNegation) actualVisitResult).getRightOperand());
    assertEquals("-", ((ArithmeticNegation) actualVisitResult).getOperator());
    assertEquals("ArithmeticNegation(ExpressionList())", actualVisitResult.toString());
    Expression leftOperand = ((ArithmeticNegation) actualVisitResult).getLeftOperand();
    Type type = ((ArithmeticNegation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", leftOperand.toString());
  }

  @Test
  public void testVisit277() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    IfExpression element = new IfExpression(new ExpressionList(), new ExpressionList(), new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((IfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression condition = ((IfExpression) actualVisitResult).getCondition();
    String actualToStringResult = condition.toString();
    Expression thenExpression = ((IfExpression) actualVisitResult).getThenExpression();
    String actualToStringResult1 = thenExpression.toString();
    Expression elseExpression = ((IfExpression) actualVisitResult).getElseExpression();
    String actualToStringResult2 = elseExpression.toString();
    assertEquals("IfExpression(ExpressionList(), ExpressionList()," + " ExpressionList())",
        actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult2);
    assertSame(type, elseExpression.getType());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, thenExpression.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, condition.getType());
  }

  @Test
  public void testVisit278() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    IfExpression element = new IfExpression(new Name("name"), new Name("name"), new Name("name"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((IfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression condition = ((IfExpression) actualVisitResult).getCondition();
    String actualName = ((Name) condition).getName();
    Expression thenExpression = ((IfExpression) actualVisitResult).getThenExpression();
    String actualName1 = ((Name) thenExpression).getName();
    Expression elseExpression = ((IfExpression) actualVisitResult).getElseExpression();
    String actualToStringResult = elseExpression.toString();
    assertEquals("IfExpression(Name(name), Name(name), Name(name))", actualVisitResult.toString());
    assertEquals("Name(name)", actualToStringResult);
    assertSame(type, elseExpression.getType());
    assertEquals("name", actualName1);
    assertSame(type, thenExpression.getType());
    assertEquals("name", actualName);
    assertSame(type, condition.getType());
  }

  @Test
  public void testVisit279() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    IfExpression element = new IfExpression(new NullLiteral(), new NullLiteral(), new NullLiteral());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((IfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Type actualType = ((IfExpression) actualVisitResult).getCondition().getType();
    Type actualType1 = ((IfExpression) actualVisitResult).getThenExpression().getType();
    Type actualType2 = ((IfExpression) actualVisitResult).getElseExpression().getType();
    assertEquals("IfExpression(NullLiteral(), NullLiteral()," + " NullLiteral())", actualVisitResult.toString());
    assertSame(type, actualType2);
    assertSame(type, actualType1);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit28() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new ArithmeticNegation(new ExpressionList()), true,
        new ArithmeticNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals(
        "IntervalTest(true,ArithmeticNegation(ExpressionList" + "()),true,ArithmeticNegation(ExpressionList()))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("-", ((ArithmeticNegation) start).getOperator());
    Expression leftOperand = ((ArithmeticNegation) end).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    Expression leftOperand1 = ((ArithmeticNegation) start).getLeftOperand();
    String actualToStringResult1 = leftOperand1.toString();
    assertEquals("ArithmeticNegation(ExpressionList())", end.toString());
    assertNull(((ArithmeticNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("ArithmeticNegation(ExpressionList())", start.toString());
    assertEquals("-", ((ArithmeticNegation) end).getOperator());
    assertNull(((ArithmeticNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit280() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    IfExpression element = new IfExpression(new NumericLiteral("value"), new NumericLiteral("value"),
        new NumericLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((IfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression condition = ((IfExpression) actualVisitResult).getCondition();
    String actualToStringResult = condition.toString();
    Expression elseExpression = ((IfExpression) actualVisitResult).getElseExpression();
    Expression thenExpression = ((IfExpression) actualVisitResult).getThenExpression();
    String actualToStringResult1 = thenExpression.toString();
    String actualLexeme = ((NumericLiteral) elseExpression).getLexeme();
    assertEquals("IfExpression(NumericLiteral(value), NumericLiteral(value)," + " NumericLiteral(value))",
        actualVisitResult.toString());
    assertEquals("value", actualLexeme);
    assertSame(type, elseExpression.getType());
    assertEquals("NumericLiteral(value)", actualToStringResult1);
    assertSame(type, thenExpression.getType());
    assertEquals("NumericLiteral(value)", actualToStringResult);
    assertSame(type, condition.getType());
  }

  @Test
  public void testVisit281() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    IfExpression element = new IfExpression(new ArithmeticNegation(new ExpressionList()),
        new ArithmeticNegation(new ExpressionList()), new ArithmeticNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((IfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression condition = ((IfExpression) actualVisitResult).getCondition();
    String actualOperator = ((ArithmeticNegation) condition).getOperator();
    Expression thenExpression = ((IfExpression) actualVisitResult).getThenExpression();
    Expression elseExpression = ((IfExpression) actualVisitResult).getElseExpression();
    String actualOperator1 = ((ArithmeticNegation) elseExpression).getOperator();
    assertEquals(
        "IfExpression(ArithmeticNegation(ExpressionList()),"
            + " ArithmeticNegation(ExpressionList()), ArithmeticNegation" + "(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("-", actualOperator1);
    assertEquals("ArithmeticNegation(ExpressionList())", elseExpression.toString());
    Expression leftOperand = ((ArithmeticNegation) elseExpression).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertSame(type, elseExpression.getType());
    assertEquals("-", actualOperator);
    assertSame(type, condition.getType());
    assertNull(((ArithmeticNegation) elseExpression).getRightOperand());
    assertEquals("ArithmeticNegation(ExpressionList())", thenExpression.toString());
    Expression leftOperand1 = ((ArithmeticNegation) thenExpression).getLeftOperand();
    String actualToStringResult1 = leftOperand1.toString();
    assertSame(type, thenExpression.getType());
    assertEquals("ArithmeticNegation(ExpressionList())", condition.toString());
    assertNull(((ArithmeticNegation) thenExpression).getRightOperand());
    Expression leftOperand2 = ((ArithmeticNegation) condition).getLeftOperand();
    assertEquals("-", ((ArithmeticNegation) thenExpression).getOperator());
    assertNull(((ArithmeticNegation) condition).getRightOperand());
    assertSame(type, leftOperand2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", leftOperand2.toString());
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit282() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    IfExpression element = new IfExpression(new NamedTypeExpression("qualifiedName"),
        new NamedTypeExpression("qualifiedName"), new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((IfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression condition = ((IfExpression) actualVisitResult).getCondition();
    String actualQualifiedName = ((NamedTypeExpression) condition).getQualifiedName();
    Expression thenExpression = ((IfExpression) actualVisitResult).getThenExpression();
    String actualQualifiedName1 = ((NamedTypeExpression) thenExpression).getQualifiedName();
    Expression elseExpression = ((IfExpression) actualVisitResult).getElseExpression();
    String actualToStringResult = elseExpression.toString();
    assertEquals("IfExpression(NamedTypeExpression(qualifiedName),"
        + " NamedTypeExpression(qualifiedName), NamedTypeExpression" + "(qualifiedName))",
        actualVisitResult.toString());
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertSame(type, elseExpression.getType());
    assertSame(type, thenExpression.getType());
    assertEquals("qualifiedName", actualQualifiedName1);
    assertSame(type, condition.getType());
    assertEquals("qualifiedName", actualQualifiedName);
  }

  @Test
  public void testVisit283() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    IfExpression element = new IfExpression(new QualifiedName(stringList), new QualifiedName(stringList),
        new QualifiedName(stringList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((IfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression condition = ((IfExpression) actualVisitResult).getCondition();
    String actualName = ((Name) condition).getName();
    Expression thenExpression = ((IfExpression) actualVisitResult).getThenExpression();
    String actualName1 = ((Name) thenExpression).getName();
    Expression elseExpression = ((IfExpression) actualVisitResult).getElseExpression();
    String actualToStringResult = elseExpression.toString();
    assertEquals("IfExpression(Name(foo), Name(foo), Name(foo))", actualVisitResult.toString());
    assertEquals("Name(foo)", actualToStringResult);
    assertSame(type, elseExpression.getType());
    assertEquals("foo", actualName1);
    assertSame(type, thenExpression.getType());
    assertEquals("foo", actualName);
    assertSame(type, condition.getType());
  }

  @Test
  public void testVisit284() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    IfExpression element = new IfExpression(new ListLiteral(expressionList), new ListLiteral(expressionList),
        new ListLiteral(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((IfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression condition = ((IfExpression) actualVisitResult).getCondition();
    List<Expression> expressionList1 = ((ListLiteral) condition).getExpressionList();
    Expression thenExpression = ((IfExpression) actualVisitResult).getThenExpression();
    Expression elseExpression = ((IfExpression) actualVisitResult).getElseExpression();
    List<Expression> expressionList2 = ((ListLiteral) thenExpression).getExpressionList();
    List<Expression> expressionList3 = ((ListLiteral) elseExpression).getExpressionList();
    assertEquals("IfExpression(ListLiteral(ExpressionList())," + " ListLiteral(ExpressionList()), ListLiteral"
        + "(ExpressionList()))", actualVisitResult.toString());
    assertEquals("ListLiteral(ExpressionList())", elseExpression.toString());
    Expression getResult = expressionList3.get(0);
    assertSame(type, elseExpression.getType());
    assertEquals("ListLiteral(ExpressionList())", thenExpression.toString());
    Expression getResult1 = expressionList1.get(0);
    assertSame(type, thenExpression.getType());
    assertEquals("ListLiteral(ExpressionList())", condition.toString());
    assertSame(type, condition.getType());
    Expression getResult2 = expressionList2.get(0);
    String actualToStringResult = getResult.toString();
    assertSame(type, getResult1.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, getResult.getType());
    assertEquals("ExpressionList()", getResult2.toString());
    assertSame(type, getResult2.getType());
    assertEquals("ExpressionList()", getResult1.toString());
  }

  @Test
  public void testVisit285() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    IfExpression element = new IfExpression(new StringLiteral("value"), new StringLiteral("value"),
        new StringLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((IfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression condition = ((IfExpression) actualVisitResult).getCondition();
    String actualToStringResult = condition.toString();
    Expression elseExpression = ((IfExpression) actualVisitResult).getElseExpression();
    Expression thenExpression = ((IfExpression) actualVisitResult).getThenExpression();
    String actualToStringResult1 = thenExpression.toString();
    String actualLexeme = ((StringLiteral) elseExpression).getLexeme();
    assertEquals("IfExpression(StringLiteral(value), StringLiteral(value)," + " StringLiteral(value))",
        actualVisitResult.toString());
    assertEquals("value", actualLexeme);
    assertSame(type, elseExpression.getType());
    assertEquals("StringLiteral(value)", actualToStringResult1);
    assertSame(type, thenExpression.getType());
    assertEquals("StringLiteral(value)", actualToStringResult);
    assertSame(type, condition.getType());
  }

  @Test
  public void testVisit286() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    IfExpression element = new IfExpression(
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""),
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""),
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((IfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression condition = ((IfExpression) actualVisitResult).getCondition();
    Expression thenExpression = ((IfExpression) actualVisitResult).getThenExpression();
    Expression elseExpression = ((IfExpression) actualVisitResult).getElseExpression();
    String actualConversionFunction = ((DateTimeLiteral) elseExpression).getConversionFunction();
    assertEquals("IfExpression(DateTimeLiteral(0.8.9, \"[-]?P([0-9]"
        + "+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0" + "-9]*)?S)?\"), DateTimeLiteral(0.8.9, \"[-]?P([0-9]"
        + "+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0" + "-9]*)?S)?\"), DateTimeLiteral(0.8.9, \"[-]?P([0-9]"
        + "+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0" + "-9]*)?S)?\"))", actualVisitResult.toString());
    assertEquals("0.8.9", actualConversionFunction);
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) elseExpression).getLexeme());
    assertSame(type, elseExpression.getType());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) thenExpression).getLexeme());
    assertSame(type, thenExpression.getType());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) condition).getLexeme());
    assertSame(type, condition.getType());
    assertEquals("0.8.9", ((DateTimeLiteral) thenExpression).getConversionFunction());
    assertEquals("0.8.9", ((DateTimeLiteral) condition).getConversionFunction());
  }

  @Test
  public void testVisit287() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    IfExpression element = new IfExpression(new Context(null), new Context(null), new Context(null));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((IfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression condition = ((IfExpression) actualVisitResult).getCondition();
    String actualToStringResult = condition.toString();
    Expression thenExpression = ((IfExpression) actualVisitResult).getThenExpression();
    String actualToStringResult1 = thenExpression.toString();
    Expression elseExpression = ((IfExpression) actualVisitResult).getElseExpression();
    String actualToStringResult2 = elseExpression.toString();
    assertEquals("IfExpression(Context(), Context(), Context())", actualVisitResult.toString());
    assertEquals("Context()", actualToStringResult2);
    assertSame(type, elseExpression.getType());
    assertEquals("Context()", actualToStringResult1);
    assertSame(type, thenExpression.getType());
    assertEquals("Context()", actualToStringResult);
    assertSame(type, condition.getType());
  }

  @Test
  public void testVisit288() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    IfExpression element = new IfExpression(new LogicNegation(new ExpressionList()),
        new LogicNegation(new ExpressionList()), new LogicNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((IfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression condition = ((IfExpression) actualVisitResult).getCondition();
    String actualOperator = ((LogicNegation) condition).getOperator();
    Expression thenExpression = ((IfExpression) actualVisitResult).getThenExpression();
    Expression elseExpression = ((IfExpression) actualVisitResult).getElseExpression();
    String actualOperator1 = ((LogicNegation) elseExpression).getOperator();
    assertEquals("IfExpression(LogicNegation(ExpressionList())," + " LogicNegation(ExpressionList()), LogicNegation"
        + "(ExpressionList()))", actualVisitResult.toString());
    assertEquals("not", actualOperator1);
    assertEquals("LogicNegation(ExpressionList())", elseExpression.toString());
    Expression leftOperand = ((LogicNegation) elseExpression).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertSame(type, elseExpression.getType());
    assertEquals("not", actualOperator);
    assertSame(type, condition.getType());
    assertNull(((LogicNegation) elseExpression).getRightOperand());
    assertEquals("LogicNegation(ExpressionList())", thenExpression.toString());
    Expression leftOperand1 = ((LogicNegation) thenExpression).getLeftOperand();
    String actualToStringResult1 = leftOperand1.toString();
    assertSame(type, thenExpression.getType());
    assertEquals("LogicNegation(ExpressionList())", condition.toString());
    assertNull(((LogicNegation) thenExpression).getRightOperand());
    Expression leftOperand2 = ((LogicNegation) condition).getLeftOperand();
    assertEquals("not", ((LogicNegation) thenExpression).getOperator());
    assertNull(((LogicNegation) condition).getRightOperand());
    assertSame(type, leftOperand2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", leftOperand2.toString());
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit289() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    IfExpression element = new IfExpression(new Any(), new Any(), new Any());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertTrue(((IfExpression) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("IfExpression(Any(), Any(), Any())", actualVisitResult.toString());
  }

  @Test
  public void testVisit29() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new ExpressionList(), true, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())", actualVisitResult.toString());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    String actualToStringResult = end.toString();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertEquals("ExpressionList()", actualToStringResult);
    assertEquals("ExpressionList()", start.toString());
    assertSame(type, start.getType());
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit290() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    IfExpression element = new IfExpression(new BooleanLiteral("value"), new BooleanLiteral("value"),
        new BooleanLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((IfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression condition = ((IfExpression) actualVisitResult).getCondition();
    String actualToStringResult = condition.toString();
    Expression elseExpression = ((IfExpression) actualVisitResult).getElseExpression();
    Expression thenExpression = ((IfExpression) actualVisitResult).getThenExpression();
    String actualToStringResult1 = thenExpression.toString();
    String actualLexeme = ((BooleanLiteral) elseExpression).getLexeme();
    assertEquals("IfExpression(BooleanLiteral(value), BooleanLiteral(value)," + " BooleanLiteral(value))",
        actualVisitResult.toString());
    assertEquals("value", actualLexeme);
    assertSame(type, elseExpression.getType());
    assertEquals("BooleanLiteral(value)", actualToStringResult1);
    assertSame(type, thenExpression.getType());
    assertEquals("BooleanLiteral(value)", actualToStringResult);
    assertSame(type, condition.getType());
  }

  @Test
  public void testVisit291() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NamedTypeExpression element = new NamedTypeExpression("qualifiedName");

    // Act and Assert
    assertEquals("qualifiedName",
        ((NamedTypeExpression) cloneVisitor.visit(element, FEELContext.makeContext(null))).getQualifiedName());
    assertTrue(((NamedTypeExpression) cloneVisitor.visit(element, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testVisit292() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    OperatorTest element = new OperatorTest("operator", new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((OperatorTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("operator", ((OperatorTest) actualVisitResult).getOperator());
    assertEquals("OperatorTest(operator,ExpressionList())", actualVisitResult.toString());
    Expression endpoint = ((OperatorTest) actualVisitResult).getEndpoint();
    assertEquals("ExpressionList()", endpoint.toString());
    assertSame(type, endpoint.getType());
  }

  @Test
  public void testVisit293() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    FEELContext context = FEELContext.makeContext(null);

    // Act
    Object actualVisitResult = cloneVisitor.visit(new ListLiteral(expressionList), context);

    // Assert
    Type type = ((ListLiteral) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression getResult = ((ListLiteral) actualVisitResult).getExpressionList().get(0);
    assertEquals("ListLiteral(ExpressionList())", actualVisitResult.toString());
    assertEquals("ExpressionList()", getResult.toString());
    assertSame(type, getResult.getType());
  }

  @Test
  public void testVisit294() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NamedParameters element = new NamedParameters(null);

    // Act and Assert
    assertTrue(((NamedParameters) cloneVisitor.visit(element, FEELContext.makeContext(null))).isEmpty());
  }

  @Test
  public void testVisit295() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FEELContext context = FEELContext.makeContext(null);

    // Act
    Object actualVisitResult = cloneVisitor.visit(new NamedParameters(stringExpressionMap), context);

    // Assert
    assertFalse(((NamedParameters) actualVisitResult).isEmpty());
    assertTrue(((NamedParameters) actualVisitResult)
        .getSignature() instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes);
    assertEquals("NamedParameters(foo : ExpressionList())", actualVisitResult.toString());
  }

  @Test
  public void testVisit296() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeIteratorDomain element = new RangeIteratorDomain(new ExpressionList(), new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression end = ((RangeIteratorDomain) actualVisitResult).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) actualVisitResult).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    Type type = start.getType();
    assertTrue(type instanceof AnyType);
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit297() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    Disjunction element = new Disjunction(new ListLiteral(expressionList), new ListLiteral(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Disjunction) actualVisitResult).getRightOperand();
    assertEquals("or", ((Disjunction) actualVisitResult).getOperator());
    List<Expression> expressionList1 = ((ListLiteral) rightOperand).getExpressionList();
    Expression leftOperand = ((Disjunction) actualVisitResult).getLeftOperand();
    Type type = ((Disjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    List<Expression> expressionList2 = ((ListLiteral) leftOperand).getExpressionList();
    assertEquals("Disjunction(ListLiteral(ExpressionList()),ListLiteral" + "(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("ListLiteral(ExpressionList())", leftOperand.toString());
    assertSame(type, leftOperand.getType());
    assertEquals("ListLiteral(ExpressionList())", rightOperand.toString());
    assertSame(type, rightOperand.getType());
    Expression getResult = expressionList2.get(0);
    Expression getResult1 = expressionList1.get(0);
    String actualToStringResult = getResult.toString();
    assertEquals("ExpressionList()", getResult1.toString());
    assertSame(type, getResult1.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, getResult.getType());
  }

  @Test
  public void testVisit298() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Disjunction element = new Disjunction(new ExpressionList(), new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("or", ((Disjunction) actualVisitResult).getOperator());
    Expression rightOperand = ((Disjunction) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Disjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Disjunction) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Disjunction(ExpressionList(),ExpressionList())", actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit299() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Disjunction element = new Disjunction(new Name("name"), new Name("name"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Disjunction) actualVisitResult).getRightOperand();
    assertEquals("or", ((Disjunction) actualVisitResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    Expression leftOperand = ((Disjunction) actualVisitResult).getLeftOperand();
    Type type = ((Disjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualName1 = ((Name) leftOperand).getName();
    assertEquals("Disjunction(Name(name),Name(name))", actualVisitResult.toString());
    assertEquals("name", actualName1);
    assertSame(type, leftOperand.getType());
    assertEquals("name", actualName);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit3() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    RangeTest element = new RangeTest(true, new ExpressionList(expressionList), true,
        new ExpressionList(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())", actualVisitResult.toString());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    String actualToStringResult = end.toString();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertEquals("ExpressionList()", actualToStringResult);
    assertEquals("ExpressionList()", start.toString());
    assertSame(type, start.getType());
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit30() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new Any(), true, new Any());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertTrue(((RangeTest) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    assertEquals("IntervalTest(true,Any(),true,Any())", actualVisitResult.toString());
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
  }

  @Test
  public void testVisit300() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Disjunction element = new Disjunction(new NamedTypeExpression("qualifiedName"),
        new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Disjunction) actualVisitResult).getRightOperand();
    assertEquals("or", ((Disjunction) actualVisitResult).getOperator());
    String actualQualifiedName = ((NamedTypeExpression) rightOperand).getQualifiedName();
    Expression leftOperand = ((Disjunction) actualVisitResult).getLeftOperand();
    Type type = ((Disjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualQualifiedName1 = ((NamedTypeExpression) leftOperand).getQualifiedName();
    assertEquals("Disjunction(NamedTypeExpression(qualifiedName)" + ",NamedTypeExpression(qualifiedName))",
        actualVisitResult.toString());
    assertSame(type, leftOperand.getType());
    assertEquals("qualifiedName", actualQualifiedName1);
    assertSame(type, rightOperand.getType());
    assertEquals("qualifiedName", actualQualifiedName);
  }

  @Test
  public void testVisit301() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Disjunction element = new Disjunction(new NullLiteral(), new NullLiteral());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("or", ((Disjunction) actualVisitResult).getOperator());
    Type actualType = ((Disjunction) actualVisitResult).getRightOperand().getType();
    Type type = ((Disjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Type actualType1 = ((Disjunction) actualVisitResult).getLeftOperand().getType();
    assertEquals("Disjunction(NullLiteral(),NullLiteral())", actualVisitResult.toString());
    assertSame(type, actualType1);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit302() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Disjunction element = new Disjunction(
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""),
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Disjunction) actualVisitResult).getRightOperand();
    assertEquals("or", ((Disjunction) actualVisitResult).getOperator());
    Expression leftOperand = ((Disjunction) actualVisitResult).getLeftOperand();
    Type type = ((Disjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Disjunction(DateTimeLiteral(0.8.9, \"[-]?P([0-9]+D"
        + ")?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0-9" + "]*)?S)?\"),DateTimeLiteral(0.8.9, \"[-]?P([0-9]+D)"
        + "?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0-9]" + "*)?S)?\"))", actualVisitResult.toString());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) leftOperand).getLexeme());
    assertSame(type, leftOperand.getType());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) rightOperand).getLexeme());
    assertSame(type, rightOperand.getType());
    assertEquals("0.8.9", ((DateTimeLiteral) leftOperand).getConversionFunction());
    assertEquals("0.8.9", ((DateTimeLiteral) rightOperand).getConversionFunction());
  }

  @Test
  public void testVisit303() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Disjunction element = new Disjunction(new ArithmeticNegation(new ExpressionList()),
        new ArithmeticNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Disjunction) actualVisitResult).getRightOperand();
    assertEquals("or", ((Disjunction) actualVisitResult).getOperator());
    String actualOperator = ((ArithmeticNegation) rightOperand).getOperator();
    Expression leftOperand = ((Disjunction) actualVisitResult).getLeftOperand();
    Type type = ((Disjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Disjunction(ArithmeticNegation(ExpressionList())" + ",ArithmeticNegation(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("ArithmeticNegation(ExpressionList())", leftOperand.toString());
    Expression leftOperand1 = ((ArithmeticNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand1.toString();
    assertSame(type, leftOperand.getType());
    assertEquals("-", actualOperator);
    assertNull(((ArithmeticNegation) rightOperand).getRightOperand());
    assertNull(((ArithmeticNegation) leftOperand).getRightOperand());
    assertSame(type, rightOperand.getType());
    assertEquals("ArithmeticNegation(ExpressionList())", rightOperand.toString());
    Expression leftOperand2 = ((ArithmeticNegation) rightOperand).getLeftOperand();
    String actualToStringResult1 = leftOperand2.toString();
    assertEquals("-", ((ArithmeticNegation) leftOperand).getOperator());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit304() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Disjunction element = new Disjunction(new StringLiteral("value"), new StringLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("or", ((Disjunction) actualVisitResult).getOperator());
    Expression rightOperand = ((Disjunction) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Disjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Disjunction) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Disjunction(StringLiteral(value),StringLiteral" + "(value))", actualVisitResult.toString());
    assertEquals("StringLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("StringLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit305() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Disjunction element = new Disjunction(new Any(), new Any());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("or", ((Disjunction) actualVisitResult).getOperator());
    assertTrue(((Disjunction) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Disjunction(Any(),Any())", actualVisitResult.toString());
  }

  @Test
  public void testVisit306() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Disjunction element = new Disjunction(new NumericLiteral("value"), new NumericLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("or", ((Disjunction) actualVisitResult).getOperator());
    Expression rightOperand = ((Disjunction) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Disjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Disjunction) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Disjunction(NumericLiteral(value),NumericLiteral" + "(value))", actualVisitResult.toString());
    assertEquals("NumericLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("NumericLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit307() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Disjunction element = new Disjunction(new NullTest(), new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("or", ((Disjunction) actualVisitResult).getOperator());
    assertTrue(((Disjunction) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Disjunction(NullTest(),NullTest())", actualVisitResult.toString());
  }

  @Test
  public void testVisit308() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Disjunction element = new Disjunction(new LogicNegation(new ExpressionList()),
        new LogicNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Disjunction) actualVisitResult).getRightOperand();
    assertEquals("or", ((Disjunction) actualVisitResult).getOperator());
    String actualOperator = ((LogicNegation) rightOperand).getOperator();
    Expression leftOperand = ((Disjunction) actualVisitResult).getLeftOperand();
    Type type = ((Disjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Disjunction(LogicNegation(ExpressionList()),LogicNegation" + "(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("LogicNegation(ExpressionList())", leftOperand.toString());
    Expression leftOperand1 = ((LogicNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand1.toString();
    assertSame(type, leftOperand.getType());
    assertEquals("not", actualOperator);
    assertNull(((LogicNegation) rightOperand).getRightOperand());
    assertNull(((LogicNegation) leftOperand).getRightOperand());
    assertSame(type, rightOperand.getType());
    assertEquals("LogicNegation(ExpressionList())", rightOperand.toString());
    Expression leftOperand2 = ((LogicNegation) rightOperand).getLeftOperand();
    String actualToStringResult1 = leftOperand2.toString();
    assertEquals("not", ((LogicNegation) leftOperand).getOperator());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit309() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Disjunction element = new Disjunction(new Context(null), new Context(null));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("or", ((Disjunction) actualVisitResult).getOperator());
    Expression rightOperand = ((Disjunction) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Disjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Disjunction) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Disjunction(Context(),Context())", actualVisitResult.toString());
    assertEquals("Context()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("Context()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit31() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new LogicNegation(new BooleanLiteral("value")), true,
        new LogicNegation(new BooleanLiteral("value")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals(
        "IntervalTest(true,LogicNegation(BooleanLiteral(value" + ")),true,LogicNegation(BooleanLiteral(value)))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("not", ((LogicNegation) start).getOperator());
    Expression leftOperand = ((LogicNegation) end).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    Expression leftOperand1 = ((LogicNegation) start).getLeftOperand();
    String actualToStringResult1 = leftOperand1.toString();
    assertEquals("LogicNegation(BooleanLiteral(value))", end.toString());
    assertNull(((LogicNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("LogicNegation(BooleanLiteral(value))", start.toString());
    assertEquals("not", ((LogicNegation) end).getOperator());
    assertNull(((LogicNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("BooleanLiteral(value)", actualToStringResult);
    assertEquals("BooleanLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit310() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Disjunction element = new Disjunction(new BooleanLiteral("value"), new BooleanLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("or", ((Disjunction) actualVisitResult).getOperator());
    Expression rightOperand = ((Disjunction) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Disjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Disjunction) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Disjunction(BooleanLiteral(value),BooleanLiteral" + "(value))", actualVisitResult.toString());
    assertEquals("BooleanLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("BooleanLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit311() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    Disjunction element = new Disjunction(new QualifiedName(stringList), new QualifiedName(stringList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Disjunction) actualVisitResult).getRightOperand();
    assertEquals("or", ((Disjunction) actualVisitResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    Expression leftOperand = ((Disjunction) actualVisitResult).getLeftOperand();
    Type type = ((Disjunction) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualName1 = ((Name) leftOperand).getName();
    assertEquals("Disjunction(Name(foo),Name(foo))", actualVisitResult.toString());
    assertEquals("foo", actualName1);
    assertSame(type, leftOperand.getType());
    assertEquals("foo", actualName);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit312() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BooleanLiteral function = new BooleanLiteral("value");
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FunctionInvocation element = new FunctionInvocation(function, new NamedParameters(stringExpressionMap));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression function1 = ((FunctionInvocation) actualVisitResult).getFunction();
    String actualLexeme = ((BooleanLiteral) function1).getLexeme();
    Parameters parameters = ((FunctionInvocation) actualVisitResult).getParameters();
    boolean actualIsEmptyResult = parameters.isEmpty();
    Type type = ((FunctionInvocation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("FunctionInvocation(BooleanLiteral(value) ->" + " NamedParameters(foo : ExpressionList()))",
        actualVisitResult.toString());
    assertFalse(actualIsEmptyResult);
    assertTrue(parameters
        .getSignature() instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes);
    assertEquals("NamedParameters(foo : ExpressionList())", parameters.toString());
    assertEquals("value", actualLexeme);
    assertSame(type, function1.getType());
  }

  @Test
  public void testVisit313() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArithmeticNegation function = new ArithmeticNegation(new ExpressionList());
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FunctionInvocation element = new FunctionInvocation(function, new NamedParameters(stringExpressionMap));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression function1 = ((FunctionInvocation) actualVisitResult).getFunction();
    String actualOperator = ((ArithmeticNegation) function1).getOperator();
    Parameters parameters = ((FunctionInvocation) actualVisitResult).getParameters();
    boolean actualIsEmptyResult = parameters.isEmpty();
    Type type = ((FunctionInvocation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals(
        "FunctionInvocation(ArithmeticNegation(ExpressionList())" + " -> NamedParameters(foo : ExpressionList()))",
        actualVisitResult.toString());
    assertFalse(actualIsEmptyResult);
    assertTrue(parameters
        .getSignature() instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes);
    assertEquals("NamedParameters(foo : ExpressionList())", parameters.toString());
    assertEquals("-", actualOperator);
    assertNull(((ArithmeticNegation) function1).getRightOperand());
    assertEquals("ArithmeticNegation(ExpressionList())", function1.toString());
    assertSame(type, function1.getType());
    Expression leftOperand = ((ArithmeticNegation) function1).getLeftOperand();
    assertEquals("ExpressionList()", leftOperand.toString());
    assertSame(type, leftOperand.getType());
  }

  @Test
  public void testVisit314() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NullTest function = new NullTest();
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FunctionInvocation element = new FunctionInvocation(function, new NamedParameters(stringExpressionMap));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((FunctionInvocation) actualVisitResult).getType();
    Parameters parameters = ((FunctionInvocation) actualVisitResult).getParameters();
    boolean actualIsEmptyResult = parameters.isEmpty();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FunctionInvocation(NullTest() -> NamedParameters(foo" + " : ExpressionList()))",
        actualVisitResult.toString());
    assertFalse(actualIsEmptyResult);
    assertTrue(parameters
        .getSignature() instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes);
    assertEquals("NamedParameters(foo : ExpressionList())", parameters.toString());
  }

  @Test
  public void testVisit315() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NamedTypeExpression function = new NamedTypeExpression("qualifiedName");
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FunctionInvocation element = new FunctionInvocation(function, new NamedParameters(stringExpressionMap));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression function1 = ((FunctionInvocation) actualVisitResult).getFunction();
    String actualToStringResult = function1.toString();
    Parameters parameters = ((FunctionInvocation) actualVisitResult).getParameters();
    boolean actualIsEmptyResult = parameters.isEmpty();
    Type type = ((FunctionInvocation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals(
        "FunctionInvocation(NamedTypeExpression(qualifiedName)" + " -> NamedParameters(foo : ExpressionList()))",
        actualVisitResult.toString());
    assertFalse(actualIsEmptyResult);
    assertTrue(parameters
        .getSignature() instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes);
    assertEquals("NamedParameters(foo : ExpressionList())", parameters.toString());
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertSame(type, function1.getType());
  }

  @Test
  public void testVisit316() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Name function = new Name("name");
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FunctionInvocation element = new FunctionInvocation(function, new NamedParameters(stringExpressionMap));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression function1 = ((FunctionInvocation) actualVisitResult).getFunction();
    String actualToStringResult = function1.toString();
    Parameters parameters = ((FunctionInvocation) actualVisitResult).getParameters();
    boolean actualIsEmptyResult = parameters.isEmpty();
    Type type = ((FunctionInvocation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("FunctionInvocation(Name(name) -> NamedParameters(foo" + " : ExpressionList()))",
        actualVisitResult.toString());
    assertFalse(actualIsEmptyResult);
    assertTrue(parameters
        .getSignature() instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes);
    assertEquals("NamedParameters(foo : ExpressionList())", parameters.toString());
    assertEquals("Name(name)", actualToStringResult);
    assertSame(type, function1.getType());
  }

  @Test
  public void testVisit317() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList function = new ExpressionList();
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FunctionInvocation element = new FunctionInvocation(function, new NamedParameters(stringExpressionMap));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression function1 = ((FunctionInvocation) actualVisitResult).getFunction();
    Parameters parameters = ((FunctionInvocation) actualVisitResult).getParameters();
    boolean actualIsEmptyResult = parameters.isEmpty();
    Type type = ((FunctionInvocation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("FunctionInvocation(ExpressionList() -> NamedParameters(foo" + " : ExpressionList()))",
        actualVisitResult.toString());
    assertFalse(actualIsEmptyResult);
    assertTrue(parameters
        .getSignature() instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes);
    assertEquals("NamedParameters(foo : ExpressionList())", parameters.toString());
    assertSame(type, function1.getType());
    assertEquals("ExpressionList()", function1.toString());
  }

  @Test
  public void testVisit318() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    LogicNegation function = new LogicNegation(new ExpressionList());
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FunctionInvocation element = new FunctionInvocation(function, new NamedParameters(stringExpressionMap));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression function1 = ((FunctionInvocation) actualVisitResult).getFunction();
    String actualOperator = ((LogicNegation) function1).getOperator();
    Parameters parameters = ((FunctionInvocation) actualVisitResult).getParameters();
    boolean actualIsEmptyResult = parameters.isEmpty();
    Type type = ((FunctionInvocation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("FunctionInvocation(LogicNegation(ExpressionList())" + " -> NamedParameters(foo : ExpressionList()))",
        actualVisitResult.toString());
    assertFalse(actualIsEmptyResult);
    assertTrue(parameters
        .getSignature() instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes);
    assertEquals("NamedParameters(foo : ExpressionList())", parameters.toString());
    assertEquals("not", actualOperator);
    assertNull(((LogicNegation) function1).getRightOperand());
    assertEquals("LogicNegation(ExpressionList())", function1.toString());
    assertSame(type, function1.getType());
    Expression leftOperand = ((LogicNegation) function1).getLeftOperand();
    assertEquals("ExpressionList()", leftOperand.toString());
    assertSame(type, leftOperand.getType());
  }

  @Test
  public void testVisit319() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList function = new ExpressionList();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    FunctionInvocation element = new FunctionInvocation(function, new PositionalParameters(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Parameters parameters = ((FunctionInvocation) actualVisitResult).getParameters();
    Expression function1 = ((FunctionInvocation) actualVisitResult).getFunction();
    List<Expression> parameters1 = ((PositionalParameters) parameters).getParameters();
    Type type = ((FunctionInvocation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("FunctionInvocation(ExpressionList() -> PositionalParameters" + "(ExpressionList()))",
        actualVisitResult.toString());
    Expression getResult = parameters1.get(0);
    assertFalse(parameters.isEmpty());
    assertSame(type, function1.getType());
    assertEquals("ExpressionList()", function1.toString());
    assertEquals("ExpressionList()", getResult.toString());
    assertSame(type, getResult.getType());
  }

  @Test
  public void testVisit32() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new ArithmeticNegation(new Name("name")), true,
        new ArithmeticNegation(new Name("name")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,ArithmeticNegation(Name(name))" + ",true,ArithmeticNegation(Name(name)))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    String actualOperator = ((ArithmeticNegation) start).getOperator();
    Expression leftOperand = ((ArithmeticNegation) end).getLeftOperand();
    assertEquals("-", actualOperator);
    String actualName = ((Name) leftOperand).getName();
    Expression leftOperand1 = ((ArithmeticNegation) start).getLeftOperand();
    String actualName1 = ((Name) leftOperand1).getName();
    assertEquals("ArithmeticNegation(Name(name))", end.toString());
    assertNull(((ArithmeticNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("ArithmeticNegation(Name(name))", start.toString());
    assertEquals("-", ((ArithmeticNegation) end).getOperator());
    assertNull(((ArithmeticNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("name", actualName);
    assertEquals("name", actualName1);
    assertSame(type, leftOperand.getType());
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit320() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    StringLiteral function = new StringLiteral("value");
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FunctionInvocation element = new FunctionInvocation(function, new NamedParameters(stringExpressionMap));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression function1 = ((FunctionInvocation) actualVisitResult).getFunction();
    String actualLexeme = ((StringLiteral) function1).getLexeme();
    Parameters parameters = ((FunctionInvocation) actualVisitResult).getParameters();
    boolean actualIsEmptyResult = parameters.isEmpty();
    Type type = ((FunctionInvocation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("FunctionInvocation(StringLiteral(value) ->" + " NamedParameters(foo : ExpressionList()))",
        actualVisitResult.toString());
    assertFalse(actualIsEmptyResult);
    assertTrue(parameters
        .getSignature() instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes);
    assertEquals("NamedParameters(foo : ExpressionList())", parameters.toString());
    assertEquals("value", actualLexeme);
    assertSame(type, function1.getType());
  }

  @Test
  public void testVisit321() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    ListLiteral function = new ListLiteral(expressionList);
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FunctionInvocation element = new FunctionInvocation(function, new NamedParameters(stringExpressionMap));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression function1 = ((FunctionInvocation) actualVisitResult).getFunction();
    List<Expression> expressionList1 = ((ListLiteral) function1).getExpressionList();
    Parameters parameters = ((FunctionInvocation) actualVisitResult).getParameters();
    boolean actualIsEmptyResult = parameters.isEmpty();
    Type type = ((FunctionInvocation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("FunctionInvocation(ListLiteral(ExpressionList()) ->" + " NamedParameters(foo : ExpressionList()))",
        actualVisitResult.toString());
    assertFalse(actualIsEmptyResult);
    assertTrue(parameters
        .getSignature() instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes);
    assertEquals("NamedParameters(foo : ExpressionList())", parameters.toString());
    assertSame(type, function1.getType());
    Expression getResult = expressionList1.get(0);
    assertEquals("ListLiteral(ExpressionList())", function1.toString());
    assertSame(type, getResult.getType());
    assertEquals("ExpressionList()", getResult.toString());
  }

  @Test
  public void testVisit322() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    QualifiedName function = new QualifiedName(stringList);
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FunctionInvocation element = new FunctionInvocation(function, new NamedParameters(stringExpressionMap));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression function1 = ((FunctionInvocation) actualVisitResult).getFunction();
    String actualToStringResult = function1.toString();
    Parameters parameters = ((FunctionInvocation) actualVisitResult).getParameters();
    boolean actualIsEmptyResult = parameters.isEmpty();
    Type type = ((FunctionInvocation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("FunctionInvocation(Name(foo) -> NamedParameters(foo" + " : ExpressionList()))",
        actualVisitResult.toString());
    assertFalse(actualIsEmptyResult);
    assertTrue(parameters
        .getSignature() instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes);
    assertEquals("NamedParameters(foo : ExpressionList())", parameters.toString());
    assertEquals("Name(foo)", actualToStringResult);
    assertSame(type, function1.getType());
  }

  @Test
  public void testVisit323() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NumericLiteral function = new NumericLiteral("value");
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FunctionInvocation element = new FunctionInvocation(function, new NamedParameters(stringExpressionMap));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression function1 = ((FunctionInvocation) actualVisitResult).getFunction();
    String actualLexeme = ((NumericLiteral) function1).getLexeme();
    Parameters parameters = ((FunctionInvocation) actualVisitResult).getParameters();
    boolean actualIsEmptyResult = parameters.isEmpty();
    Type type = ((FunctionInvocation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("FunctionInvocation(NumericLiteral(value) ->" + " NamedParameters(foo : ExpressionList()))",
        actualVisitResult.toString());
    assertFalse(actualIsEmptyResult);
    assertTrue(parameters
        .getSignature() instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes);
    assertEquals("NamedParameters(foo : ExpressionList())", parameters.toString());
    assertEquals("value", actualLexeme);
    assertSame(type, function1.getType());
  }

  @Test
  public void testVisit324() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NullLiteral function = new NullLiteral();
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FunctionInvocation element = new FunctionInvocation(function, new NamedParameters(stringExpressionMap));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type actualType = ((FunctionInvocation) actualVisitResult).getFunction().getType();
    Parameters parameters = ((FunctionInvocation) actualVisitResult).getParameters();
    boolean actualIsEmptyResult = parameters.isEmpty();
    Type type = ((FunctionInvocation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("FunctionInvocation(NullLiteral() -> NamedParameters(foo" + " : ExpressionList()))",
        actualVisitResult.toString());
    assertFalse(actualIsEmptyResult);
    assertTrue(parameters
        .getSignature() instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes);
    assertSame(type, actualType);
    assertEquals("NamedParameters(foo : ExpressionList())", parameters.toString());
  }

  @Test
  public void testVisit325() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Any function = new Any();
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FunctionInvocation element = new FunctionInvocation(function, new NamedParameters(stringExpressionMap));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((FunctionInvocation) actualVisitResult).getType();
    Parameters parameters = ((FunctionInvocation) actualVisitResult).getParameters();
    boolean actualIsEmptyResult = parameters.isEmpty();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FunctionInvocation(Any() -> NamedParameters(foo :" + " ExpressionList()))",
        actualVisitResult.toString());
    assertFalse(actualIsEmptyResult);
    assertTrue(parameters
        .getSignature() instanceof com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes);
    assertEquals("NamedParameters(foo : ExpressionList())", parameters.toString());
  }

  @Test
  public void testVisit326() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("qualifiedName");
    ArrayList<TypeExpression> typeExpressionList = new ArrayList<TypeExpression>();
    typeExpressionList.add(namedTypeExpression);
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualVisitResult = cloneVisitor.visit(new FunctionTypeExpression(typeExpressionList, namedTypeExpression),
        params);

    // Assert
    assertTrue(((FunctionTypeExpression) actualVisitResult)
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals(
        "FunctionTypeExpression(NamedTypeExpression(qualifiedName)" + " -> NamedTypeExpression(qualifiedName))",
        actualVisitResult.toString());
  }

  @Test
  public void testVisit327() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ForExpression element = new ForExpression(iteratorList, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ForExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((ForExpression) actualVisitResult).getIterators().get(0);
    assertEquals("ForExpression(Iterator(name in RangeIteratorDomain" + "(ExpressionList(), ExpressionList())) ->"
        + " NullTest())", actualVisitResult.toString());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(name in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    assertEquals("name", getResult.getName());
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit328() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ForExpression element = new ForExpression(iteratorList, new BooleanLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ForExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((ForExpression) actualVisitResult).getIterators().get(0);
    assertEquals("ForExpression(Iterator(name in RangeIteratorDomain"
        + "(ExpressionList(), ExpressionList())) -> BooleanLiteral" + "(value))", actualVisitResult.toString());
    Expression body = ((ForExpression) actualVisitResult).getBody();
    assertEquals("value", ((BooleanLiteral) body).getLexeme());
    assertSame(type, body.getType());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(name in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    assertEquals("name", getResult.getName());
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit329() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ForExpression element = new ForExpression(iteratorList, new NullLiteral());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ForExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((ForExpression) actualVisitResult).getIterators().get(0);
    assertEquals("ForExpression(Iterator(name in RangeIteratorDomain" + "(ExpressionList(), ExpressionList())) ->"
        + " NullLiteral())", actualVisitResult.toString());
    assertSame(type, ((ForExpression) actualVisitResult).getBody().getType());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(name in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    assertEquals("name", getResult.getName());
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit33() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new ArithmeticNegation(new StringLiteral("value")), true,
        new ArithmeticNegation(new StringLiteral("value")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,ArithmeticNegation(StringLiteral" + "(value)),true,ArithmeticNegation(StringLiteral"
        + "(value)))", actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("-", ((ArithmeticNegation) start).getOperator());
    Expression leftOperand = ((ArithmeticNegation) end).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    Expression leftOperand1 = ((ArithmeticNegation) start).getLeftOperand();
    String actualToStringResult1 = leftOperand1.toString();
    assertEquals("ArithmeticNegation(StringLiteral(value))", end.toString());
    assertNull(((ArithmeticNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("ArithmeticNegation(StringLiteral(value))", start.toString());
    assertEquals("-", ((ArithmeticNegation) end).getOperator());
    assertNull(((ArithmeticNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("StringLiteral(value)", actualToStringResult);
    assertEquals("StringLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit330() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ForExpression element = new ForExpression(iteratorList, new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ForExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((ForExpression) actualVisitResult).getIterators().get(0);
    assertEquals("ForExpression(Iterator(name in RangeIteratorDomain"
        + "(ExpressionList(), ExpressionList())) -> NamedType" + "Expression(qualifiedName))",
        actualVisitResult.toString());
    Expression body = ((ForExpression) actualVisitResult).getBody();
    assertEquals("NamedTypeExpression(qualifiedName)", body.toString());
    assertSame(type, body.getType());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(name in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    assertEquals("name", getResult.getName());
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit331() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ForExpression element = new ForExpression(iteratorList, new ArithmeticNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ForExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((ForExpression) actualVisitResult).getIterators().get(0);
    assertEquals(
        "ForExpression(Iterator(name in RangeIteratorDomain"
            + "(ExpressionList(), ExpressionList())) -> ArithmeticNegation" + "(ExpressionList()))",
        actualVisitResult.toString());
    Expression body = ((ForExpression) actualVisitResult).getBody();
    assertEquals("-", ((ArithmeticNegation) body).getOperator());
    assertEquals("ArithmeticNegation(ExpressionList())", body.toString());
    Expression leftOperand = ((ArithmeticNegation) body).getLeftOperand();
    assertSame(type, body.getType());
    assertNull(((ArithmeticNegation) body).getRightOperand());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(name in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    assertSame(type, leftOperand.getType());
    assertEquals("name", getResult.getName());
    assertEquals("ExpressionList()", leftOperand.toString());
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult = start.toString();
    assertSame(type, end.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", end.toString());
  }

  @Test
  public void testVisit332() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    ForExpression element = new ForExpression(iteratorList, new ListLiteral(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ForExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((ForExpression) actualVisitResult).getIterators().get(0);
    assertEquals("ForExpression(Iterator(name in RangeIteratorDomain"
        + "(ExpressionList(), ExpressionList())) -> ListLiteral" + "(ExpressionList()))", actualVisitResult.toString());
    Expression body = ((ForExpression) actualVisitResult).getBody();
    List<Expression> expressionList1 = ((ListLiteral) body).getExpressionList();
    assertEquals("ListLiteral(ExpressionList())", body.toString());
    Expression getResult1 = expressionList1.get(0);
    assertSame(type, body.getType());
    IteratorDomain domain = getResult.getDomain();
    String actualToStringResult = getResult1.toString();
    assertEquals("name", getResult.getName());
    assertEquals("Iterator(name in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    Expression start = ((RangeIteratorDomain) domain).getStart();
    assertSame(type, getResult1.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult1 = end.toString();
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, end.getType());
    assertEquals("ExpressionList()", start.toString());
  }

  @Test
  public void testVisit333() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ForExpression element = new ForExpression(iteratorList,
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ForExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((ForExpression) actualVisitResult).getIterators().get(0);
    assertEquals(
        "ForExpression(Iterator(name in RangeIteratorDomain"
            + "(ExpressionList(), ExpressionList())) -> DateTimeLiteral"
            + "(0.8.9, \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9" + "]+H)?([0-9]+(\\.[0-9]*)?S)?\"))",
        actualVisitResult.toString());
    Expression body = ((ForExpression) actualVisitResult).getBody();
    assertEquals("0.8.9", ((DateTimeLiteral) body).getConversionFunction());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) body).getLexeme());
    assertSame(type, body.getType());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(name in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    assertEquals("name", getResult.getName());
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit334() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ForExpression element = new ForExpression(iteratorList, new StringLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ForExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((ForExpression) actualVisitResult).getIterators().get(0);
    assertEquals("ForExpression(Iterator(name in RangeIteratorDomain"
        + "(ExpressionList(), ExpressionList())) -> StringLiteral" + "(value))", actualVisitResult.toString());
    Expression body = ((ForExpression) actualVisitResult).getBody();
    assertEquals("value", ((StringLiteral) body).getLexeme());
    assertSame(type, body.getType());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(name in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    assertEquals("name", getResult.getName());
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit335() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ForExpression element = new ForExpression(iteratorList, new Any());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ForExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((ForExpression) actualVisitResult).getIterators().get(0);
    assertEquals(
        "ForExpression(Iterator(name in RangeIteratorDomain" + "(ExpressionList(), ExpressionList())) -> Any())",
        actualVisitResult.toString());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(name in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    assertEquals("name", getResult.getName());
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit336() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ForExpression element = new ForExpression(iteratorList, new Name("name"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ForExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((ForExpression) actualVisitResult).getIterators().get(0);
    assertEquals("ForExpression(Iterator(name in RangeIteratorDomain" + "(ExpressionList(), ExpressionList())) ->"
        + " Name(name))", actualVisitResult.toString());
    Expression body = ((ForExpression) actualVisitResult).getBody();
    assertEquals("Name(name)", body.toString());
    assertSame(type, body.getType());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(name in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    assertEquals("name", getResult.getName());
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit337() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ForExpression element = new ForExpression(iteratorList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ForExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((ForExpression) actualVisitResult).getIterators().get(0);
    assertEquals("ForExpression(Iterator(name in RangeIteratorDomain" + "(ExpressionList(), ExpressionList())) ->"
        + " ExpressionList())", actualVisitResult.toString());
    Expression body = ((ForExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(name in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    assertEquals("name", getResult.getName());
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit338() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ForExpression element = new ForExpression(iteratorList, new NumericLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ForExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((ForExpression) actualVisitResult).getIterators().get(0);
    assertEquals("ForExpression(Iterator(name in RangeIteratorDomain"
        + "(ExpressionList(), ExpressionList())) -> NumericLiteral" + "(value))", actualVisitResult.toString());
    Expression body = ((ForExpression) actualVisitResult).getBody();
    assertEquals("value", ((NumericLiteral) body).getLexeme());
    assertSame(type, body.getType());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(name in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    assertEquals("name", getResult.getName());
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit339() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    ForExpression element = new ForExpression(iteratorList, new QualifiedName(stringList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ForExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((ForExpression) actualVisitResult).getIterators().get(0);
    assertEquals("ForExpression(Iterator(name in RangeIteratorDomain" + "(ExpressionList(), ExpressionList())) ->"
        + " Name(foo))", actualVisitResult.toString());
    Expression body = ((ForExpression) actualVisitResult).getBody();
    assertEquals("Name(foo)", body.toString());
    assertSame(type, body.getType());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(name in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    assertEquals("name", getResult.getName());
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit34() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    RangeTest element = new RangeTest(true, new LogicNegation(new ListLiteral(expressionList)), true,
        new LogicNegation(new ListLiteral(expressionList)));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,LogicNegation(ListLiteral" + "(ExpressionList())),true,LogicNegation(ListLiteral"
        + "(ExpressionList())))", actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    String actualOperator = ((LogicNegation) start).getOperator();
    Expression leftOperand = ((LogicNegation) end).getLeftOperand();
    assertEquals("not", actualOperator);
    List<Expression> expressionList1 = ((ListLiteral) leftOperand).getExpressionList();
    Expression leftOperand1 = ((LogicNegation) start).getLeftOperand();
    List<Expression> expressionList2 = ((ListLiteral) leftOperand1).getExpressionList();
    assertEquals("LogicNegation(ListLiteral(ExpressionList()))", end.toString());
    assertNull(((LogicNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("LogicNegation(ListLiteral(ExpressionList()))", start.toString());
    assertEquals("not", ((LogicNegation) end).getOperator());
    assertNull(((LogicNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("ListLiteral(ExpressionList())", leftOperand.toString());
    assertEquals("ListLiteral(ExpressionList())", leftOperand1.toString());
    assertSame(type, leftOperand.getType());
    Expression getResult = expressionList2.get(0);
    Expression getResult1 = expressionList1.get(0);
    assertSame(type, leftOperand1.getType());
    String actualToStringResult = getResult1.toString();
    assertEquals("ExpressionList()", getResult.toString());
    assertSame(type, getResult.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, getResult1.getType());
  }

  @Test
  public void testVisit340() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ForExpression element = new ForExpression(iteratorList, new LogicNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ForExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((ForExpression) actualVisitResult).getIterators().get(0);
    assertEquals("ForExpression(Iterator(name in RangeIteratorDomain"
        + "(ExpressionList(), ExpressionList())) -> LogicNegation" + "(ExpressionList()))",
        actualVisitResult.toString());
    Expression body = ((ForExpression) actualVisitResult).getBody();
    assertEquals("not", ((LogicNegation) body).getOperator());
    assertEquals("LogicNegation(ExpressionList())", body.toString());
    Expression leftOperand = ((LogicNegation) body).getLeftOperand();
    assertSame(type, body.getType());
    assertNull(((LogicNegation) body).getRightOperand());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(name in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    assertSame(type, leftOperand.getType());
    assertEquals("name", getResult.getName());
    assertEquals("ExpressionList()", leftOperand.toString());
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult = start.toString();
    assertSame(type, end.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", end.toString());
  }

  @Test
  public void testVisit341() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FastArrayList fastArrayList = new FastArrayList();
    fastArrayList.add("foo");
    fastArrayList.add(new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ForExpression element = new ForExpression(fastArrayList, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ForExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("ForExpression( -> ExpressionList())", actualVisitResult.toString());
    Expression body = ((ForExpression) actualVisitResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
  }

  @Test
  public void testVisit342() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FEELContext context = FEELContext.makeContext(null);

    // Act
    Object actualVisitResult = cloneVisitor.visit(new ExpressionList(), context);

    // Assert
    assertTrue(
        ((ExpressionList) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", actualVisitResult.toString());
  }

  @Test
  public void testVisit343() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FastArrayList fastArrayList = new FastArrayList();
    fastArrayList.add("foo");
    fastArrayList.add(new ListTest(new ListLiteral(null)));
    FEELContext context = FEELContext.makeContext(null);

    // Act
    Object actualVisitResult = cloneVisitor.visit(new SimplePositiveUnaryTests(fastArrayList), context);

    // Assert
    assertTrue(((SimplePositiveUnaryTests) actualVisitResult)
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("SimplePositiveUnaryTests()", actualVisitResult.toString());
  }

  @Test
  public void testVisit344() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    ListTest listTest = new ListTest(new ListLiteral(null));
    simplePositiveUnaryTestList.add(listTest);
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList1 = new ArrayList<SimplePositiveUnaryTest>(
        simplePositiveUnaryTestList);
    simplePositiveUnaryTestList1.add(listTest);
    simplePositiveUnaryTestList1.add(new ListTest(new ListLiteral(null)));
    FEELContext context = FEELContext.makeContext(null);

    // Act
    Object actualVisitResult = cloneVisitor.visit(new SimplePositiveUnaryTests(simplePositiveUnaryTestList1), context);

    // Assert
    Type type = ((SimplePositiveUnaryTests) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    List<SimplePositiveUnaryTest> simplePositiveUnaryTests = ((SimplePositiveUnaryTests) actualVisitResult)
        .getSimplePositiveUnaryTests();
    SimplePositiveUnaryTest getResult = simplePositiveUnaryTests.get(0);
    SimplePositiveUnaryTest getResult1 = simplePositiveUnaryTests.get(1);
    SimplePositiveUnaryTest getResult2 = simplePositiveUnaryTests.get(2);
    assertEquals(
        "SimplePositiveUnaryTests(ListTest(ListLiteral())" + ",ListTest(ListLiteral()),ListTest(ListLiteral()))",
        actualVisitResult.toString());
    ListLiteral listLiteral = ((ListTest) getResult2).getListLiteral();
    ListLiteral listLiteral1 = ((ListTest) getResult1).getListLiteral();
    ListLiteral listLiteral2 = ((ListTest) getResult).getListLiteral();
    assertEquals("ListTest(ListLiteral())", getResult2.toString());
    assertEquals("ListTest(ListLiteral())", getResult.toString());
    assertEquals("ListTest(ListLiteral())", getResult1.toString());
    assertSame(type, getResult1.getType());
    assertSame(type, getResult2.getType());
    assertSame(type, getResult.getType());
    assertSame(type, listLiteral1.getType());
    assertSame(type, listLiteral.getType());
    assertSame(type, listLiteral2.getType());
    assertEquals("ListLiteral()", listLiteral.toString());
    assertEquals("ListLiteral()", listLiteral2.toString());
    assertEquals("ListLiteral()", listLiteral1.toString());
  }

  @Test
  public void testVisit345() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    simplePositiveUnaryTestList.add(new ListTest(new ListLiteral(null)));
    FEELContext context = FEELContext.makeContext(null);

    // Act
    Object actualVisitResult = cloneVisitor.visit(new SimplePositiveUnaryTests(simplePositiveUnaryTestList), context);

    // Assert
    Type type = ((SimplePositiveUnaryTests) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    SimplePositiveUnaryTest getResult = ((SimplePositiveUnaryTests) actualVisitResult).getSimplePositiveUnaryTests()
        .get(0);
    assertEquals("SimplePositiveUnaryTests(ListTest(ListLiteral()))", actualVisitResult.toString());
    ListLiteral listLiteral = ((ListTest) getResult).getListLiteral();
    assertEquals("ListTest(ListLiteral())", getResult.toString());
    assertSame(type, getResult.getType());
    assertSame(type, listLiteral.getType());
    assertEquals("ListLiteral()", listLiteral.toString());
  }

  @Test
  public void testVisit346() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    ListTest element = new ListTest(new ListLiteral(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((ListTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    ListLiteral listLiteral = ((ListTest) actualVisitResult).getListLiteral();
    assertEquals("ListTest(ListLiteral(ExpressionList()))", actualVisitResult.toString());
    assertEquals("ListLiteral(ExpressionList())", listLiteral.toString());
    assertSame(type, listLiteral.getType());
    Expression getResult = listLiteral.getExpressionList().get(0);
    assertSame(type, getResult.getType());
    assertEquals("ExpressionList()", getResult.toString());
  }

  @Test
  public void testVisit347() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Iterator element = new Iterator("name", new ExpressionIteratorDomain(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("name", ((Iterator) actualVisitResult).getName());
    IteratorDomain domain = ((Iterator) actualVisitResult).getDomain();
    assertEquals("Iterator(name in ExpressionIteratorDomain(ExpressionList" + "()))", actualVisitResult.toString());
    Expression expression = ((ExpressionIteratorDomain) domain).getExpression();
    assertEquals("ExpressionIteratorDomain(ExpressionList())", domain.toString());
    assertTrue(expression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", expression.toString());
  }

  @Test
  public void testVisit348() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    PathExpression element = new PathExpression(new BooleanLiteral("value"), "member");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((PathExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((PathExpression) actualVisitResult).getSource();
    String actualToStringResult = source.toString();
    assertEquals("PathExpression(BooleanLiteral(value), member)", actualVisitResult.toString());
    assertEquals("member", ((PathExpression) actualVisitResult).getMember());
    assertEquals("BooleanLiteral(value)", actualToStringResult);
    assertSame(type, source.getType());
  }

  @Test
  public void testVisit349() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    PathExpression element = new PathExpression(new NamedTypeExpression("qualifiedName"), "member");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((PathExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((PathExpression) actualVisitResult).getSource();
    String actualQualifiedName = ((NamedTypeExpression) source).getQualifiedName();
    assertEquals("PathExpression(NamedTypeExpression(qualifiedName)," + " member)", actualVisitResult.toString());
    assertEquals("member", ((PathExpression) actualVisitResult).getMember());
    assertSame(type, source.getType());
    assertEquals("qualifiedName", actualQualifiedName);
  }

  @Test
  public void testVisit35() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true,
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""),
        true,
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals(
        "IntervalTest(true,DateTimeLiteral(0.8.9, \"[-]?P([0" + "-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0"
            + "-9]*)?S)?\"),true,DateTimeLiteral(0.8.9, \"[-]?P([0-9"
            + "]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0-9" + "]*)?S)?\"))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    String actualConversionFunction = ((DateTimeLiteral) start).getConversionFunction();
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) end).getLexeme());
    assertEquals("0.8.9", actualConversionFunction);
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) start).getLexeme());
    assertSame(type, start.getType());
    assertSame(type, end.getType());
    assertEquals("0.8.9", ((DateTimeLiteral) end).getConversionFunction());
  }

  @Test
  public void testVisit350() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    PathExpression element = new PathExpression(new ArithmeticNegation(new ExpressionList()), "member");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((PathExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((PathExpression) actualVisitResult).getSource();
    assertEquals("PathExpression(ArithmeticNegation(ExpressionList())," + " member)", actualVisitResult.toString());
    assertEquals("member", ((PathExpression) actualVisitResult).getMember());
    assertEquals("ArithmeticNegation(ExpressionList())", source.toString());
    Expression leftOperand = ((ArithmeticNegation) source).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertSame(type, source.getType());
    assertNull(((ArithmeticNegation) source).getRightOperand());
    assertEquals("-", ((ArithmeticNegation) source).getOperator());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand.getType());
  }

  @Test
  public void testVisit351() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    PathExpression element = new PathExpression(new Name("name"), "member");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((PathExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((PathExpression) actualVisitResult).getSource();
    String actualName = ((Name) source).getName();
    assertEquals("PathExpression(Name(name), member)", actualVisitResult.toString());
    assertEquals("member", ((PathExpression) actualVisitResult).getMember());
    assertSame(type, source.getType());
    assertEquals("name", actualName);
  }

  @Test
  public void testVisit352() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    PathExpression element = new PathExpression(new NullLiteral(), "member");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((PathExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Type actualType = ((PathExpression) actualVisitResult).getSource().getType();
    assertEquals("PathExpression(NullLiteral(), member)", actualVisitResult.toString());
    assertEquals("member", ((PathExpression) actualVisitResult).getMember());
    assertSame(type, actualType);
  }

  @Test
  public void testVisit353() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    PathExpression element = new PathExpression(new ExpressionList(), "member");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((PathExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((PathExpression) actualVisitResult).getSource();
    String actualToStringResult = source.toString();
    assertEquals("PathExpression(ExpressionList(), member)", actualVisitResult.toString());
    assertEquals("member", ((PathExpression) actualVisitResult).getMember());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, source.getType());
  }

  @Test
  public void testVisit354() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    PathExpression element = new PathExpression(new NullTest(), "member");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertTrue(
        ((PathExpression) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PathExpression(NullTest(), member)", actualVisitResult.toString());
    assertEquals("member", ((PathExpression) actualVisitResult).getMember());
  }

  @Test
  public void testVisit355() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    PathExpression element = new PathExpression(new Any(), "member");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertTrue(
        ((PathExpression) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PathExpression(Any(), member)", actualVisitResult.toString());
    assertEquals("member", ((PathExpression) actualVisitResult).getMember());
  }

  @Test
  public void testVisit356() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    PathExpression element = new PathExpression(
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""),
        "member");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((PathExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((PathExpression) actualVisitResult).getSource();
    assertEquals("PathExpression(DateTimeLiteral(0.8.9, \"[-]?P([0-9]"
        + "+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0-9" + "]*)?S)?\"), member)", actualVisitResult.toString());
    assertEquals("member", ((PathExpression) actualVisitResult).getMember());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) source).getLexeme());
    assertSame(type, source.getType());
    assertEquals("0.8.9", ((DateTimeLiteral) source).getConversionFunction());
  }

  @Test
  public void testVisit357() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    PathExpression element = new PathExpression(new StringLiteral("value"), "member");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((PathExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((PathExpression) actualVisitResult).getSource();
    String actualToStringResult = source.toString();
    assertEquals("PathExpression(StringLiteral(value), member)", actualVisitResult.toString());
    assertEquals("member", ((PathExpression) actualVisitResult).getMember());
    assertEquals("StringLiteral(value)", actualToStringResult);
    assertSame(type, source.getType());
  }

  @Test
  public void testVisit358() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    PathExpression element = new PathExpression(new QualifiedName(stringList), "member");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((PathExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((PathExpression) actualVisitResult).getSource();
    String actualName = ((Name) source).getName();
    assertEquals("PathExpression(Name(foo), member)", actualVisitResult.toString());
    assertEquals("member", ((PathExpression) actualVisitResult).getMember());
    assertSame(type, source.getType());
    assertEquals("foo", actualName);
  }

  @Test
  public void testVisit359() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    PathExpression element = new PathExpression(new NumericLiteral("value"), "member");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((PathExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((PathExpression) actualVisitResult).getSource();
    String actualToStringResult = source.toString();
    assertEquals("PathExpression(NumericLiteral(value), member)", actualVisitResult.toString());
    assertEquals("member", ((PathExpression) actualVisitResult).getMember());
    assertEquals("NumericLiteral(value)", actualToStringResult);
    assertSame(type, source.getType());
  }

  @Test
  public void testVisit36() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new LogicNegation(new Name("name")), true,
        new LogicNegation(new Name("name")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,LogicNegation(Name(name)),true" + ",LogicNegation(Name(name)))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    String actualOperator = ((LogicNegation) start).getOperator();
    Expression leftOperand = ((LogicNegation) end).getLeftOperand();
    assertEquals("not", actualOperator);
    String actualName = ((Name) leftOperand).getName();
    Expression leftOperand1 = ((LogicNegation) start).getLeftOperand();
    String actualName1 = ((Name) leftOperand1).getName();
    assertEquals("LogicNegation(Name(name))", end.toString());
    assertNull(((LogicNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("LogicNegation(Name(name))", start.toString());
    assertEquals("not", ((LogicNegation) end).getOperator());
    assertNull(((LogicNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("name", actualName);
    assertEquals("name", actualName1);
    assertSame(type, leftOperand.getType());
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit360() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    PathExpression element = new PathExpression(new ListLiteral(expressionList), "member");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((PathExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((PathExpression) actualVisitResult).getSource();
    List<Expression> expressionList1 = ((ListLiteral) source).getExpressionList();
    assertEquals("PathExpression(ListLiteral(ExpressionList())," + " member)", actualVisitResult.toString());
    assertEquals("member", ((PathExpression) actualVisitResult).getMember());
    assertEquals("ListLiteral(ExpressionList())", source.toString());
    assertSame(type, source.getType());
    Expression getResult = expressionList1.get(0);
    assertSame(type, getResult.getType());
    assertEquals("ExpressionList()", getResult.toString());
  }

  @Test
  public void testVisit361() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    PathExpression element = new PathExpression(new LogicNegation(new ExpressionList()), "member");

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((PathExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((PathExpression) actualVisitResult).getSource();
    assertEquals("PathExpression(LogicNegation(ExpressionList())," + " member)", actualVisitResult.toString());
    assertEquals("member", ((PathExpression) actualVisitResult).getMember());
    assertEquals("LogicNegation(ExpressionList())", source.toString());
    Expression leftOperand = ((LogicNegation) source).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertSame(type, source.getType());
    assertNull(((LogicNegation) source).getRightOperand());
    assertEquals("not", ((LogicNegation) source).getOperator());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand.getType());
  }

  @Test
  public void testVisit362() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NegatedSimplePositiveUnaryTests element = new NegatedSimplePositiveUnaryTests(new SimplePositiveUnaryTests(null));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((NegatedSimplePositiveUnaryTests) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    SimplePositiveUnaryTests simplePositiveUnaryTests = ((NegatedSimplePositiveUnaryTests) actualVisitResult)
        .getSimplePositiveUnaryTests();
    String actualToStringResult = simplePositiveUnaryTests.toString();
    assertEquals("NegatedSimpleUnaryTests(SimplePositiveUnaryTests" + "())", actualVisitResult.toString());
    assertEquals("SimplePositiveUnaryTests()", actualToStringResult);
    assertSame(type, simplePositiveUnaryTests.getType());
  }

  @Test
  public void testVisit37() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    RangeTest element = new RangeTest(true, new ArithmeticNegation(new ListLiteral(expressionList)), true,
        new ArithmeticNegation(new ListLiteral(expressionList)));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,ArithmeticNegation(ListLiteral"
        + "(ExpressionList())),true,ArithmeticNegation(ListLiteral" + "(ExpressionList())))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    String actualOperator = ((ArithmeticNegation) start).getOperator();
    Expression leftOperand = ((ArithmeticNegation) end).getLeftOperand();
    assertEquals("-", actualOperator);
    List<Expression> expressionList1 = ((ListLiteral) leftOperand).getExpressionList();
    Expression leftOperand1 = ((ArithmeticNegation) start).getLeftOperand();
    List<Expression> expressionList2 = ((ListLiteral) leftOperand1).getExpressionList();
    assertEquals("ArithmeticNegation(ListLiteral(ExpressionList()))", end.toString());
    assertNull(((ArithmeticNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("ArithmeticNegation(ListLiteral(ExpressionList()))", start.toString());
    assertEquals("-", ((ArithmeticNegation) end).getOperator());
    assertNull(((ArithmeticNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("ListLiteral(ExpressionList())", leftOperand.toString());
    assertEquals("ListLiteral(ExpressionList())", leftOperand1.toString());
    assertSame(type, leftOperand.getType());
    Expression getResult = expressionList2.get(0);
    Expression getResult1 = expressionList1.get(0);
    assertSame(type, leftOperand1.getType());
    String actualToStringResult = getResult1.toString();
    assertEquals("ExpressionList()", getResult.toString());
    assertSame(type, getResult.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, getResult1.getType());
  }

  @Test
  public void testVisit38() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true,
        new LogicNegation(new DateTimeLiteral("0.8.9",
            "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"")),
        true, new LogicNegation(new DateTimeLiteral("0.8.9",
            "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals(
        "IntervalTest(true,LogicNegation(DateTimeLiteral(0.8.9," + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?("
            + "[0-9]+(\\.[0-9]*)?S)?\")),true,LogicNegation(DateTimeLiteral"
            + "(0.8.9, \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9" + "]+H)?([0-9]+(\\.[0-9]*)?S)?\")))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    String actualOperator = ((LogicNegation) start).getOperator();
    Expression leftOperand = ((LogicNegation) end).getLeftOperand();
    assertEquals("not", actualOperator);
    String actualConversionFunction = ((DateTimeLiteral) leftOperand).getConversionFunction();
    Expression leftOperand1 = ((LogicNegation) start).getLeftOperand();
    String actualConversionFunction1 = ((DateTimeLiteral) leftOperand1).getConversionFunction();
    assertEquals("LogicNegation(DateTimeLiteral(0.8.9, \"[-]?P([0-9]"
        + "+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0-9" + "]*)?S)?\"))", end.toString());
    assertNull(((LogicNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("LogicNegation(DateTimeLiteral(0.8.9, \"[-]?P([0-9]"
        + "+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0-9" + "]*)?S)?\"))", start.toString());
    assertEquals("not", ((LogicNegation) end).getOperator());
    assertNull(((LogicNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) leftOperand).getLexeme());
    assertEquals("0.8.9", actualConversionFunction);
    assertSame(type, leftOperand.getType());
    assertSame(type, leftOperand1.getType());
    assertEquals("0.8.9", actualConversionFunction1);
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) leftOperand1).getLexeme());
  }

  @Test
  public void testVisit39() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new ArithmeticNegation(new LogicNegation(new ExpressionList())), true,
        new ArithmeticNegation(new LogicNegation(new ExpressionList())));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals(
        "IntervalTest(true,ArithmeticNegation(LogicNegation"
            + "(ExpressionList())),true,ArithmeticNegation(LogicNegation" + "(ExpressionList())))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    String actualOperator = ((ArithmeticNegation) start).getOperator();
    Expression leftOperand = ((ArithmeticNegation) end).getLeftOperand();
    assertEquals("-", actualOperator);
    String actualOperator1 = ((LogicNegation) leftOperand).getOperator();
    Expression leftOperand1 = ((ArithmeticNegation) start).getLeftOperand();
    assertEquals("ArithmeticNegation(LogicNegation(ExpressionList" + "()))", end.toString());
    String actualOperator2 = ((LogicNegation) leftOperand1).getOperator();
    assertNull(((ArithmeticNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("ArithmeticNegation(LogicNegation(ExpressionList" + "()))", start.toString());
    assertEquals("-", ((ArithmeticNegation) end).getOperator());
    assertNull(((ArithmeticNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("not", actualOperator2);
    assertSame(type, leftOperand.getType());
    assertEquals("not", actualOperator1);
    Expression leftOperand2 = ((LogicNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand2.toString();
    assertNull(((LogicNegation) leftOperand1).getRightOperand());
    assertEquals("LogicNegation(ExpressionList())", leftOperand1.toString());
    assertEquals("LogicNegation(ExpressionList())", leftOperand.toString());
    assertSame(type, leftOperand1.getType());
    Expression leftOperand3 = ((LogicNegation) leftOperand1).getLeftOperand();
    String actualToStringResult1 = leftOperand3.toString();
    assertNull(((LogicNegation) leftOperand).getRightOperand());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand3.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand2.getType());
  }

  @Test
  public void testVisit4() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new NullTest(), true, new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertTrue(((RangeTest) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    assertEquals("IntervalTest(true,NullTest(),true,NullTest())", actualVisitResult.toString());
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
  }

  @Test
  public void testVisit40() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new NumericLiteral("value"), true, new NumericLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    assertEquals("IntervalTest(true,NumericLiteral(value),true" + ",NumericLiteral(value))",
        actualVisitResult.toString());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("NumericLiteral(value)", actualToStringResult);
    assertEquals("value", ((NumericLiteral) start).getLexeme());
    assertSame(type, start.getType());
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit41() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new LogicNegation(new NumericLiteral("value")), true,
        new LogicNegation(new NumericLiteral("value")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals(
        "IntervalTest(true,LogicNegation(NumericLiteral(value" + ")),true,LogicNegation(NumericLiteral(value)))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("not", ((LogicNegation) start).getOperator());
    Expression leftOperand = ((LogicNegation) end).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    Expression leftOperand1 = ((LogicNegation) start).getLeftOperand();
    String actualToStringResult1 = leftOperand1.toString();
    assertEquals("LogicNegation(NumericLiteral(value))", end.toString());
    assertNull(((LogicNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("LogicNegation(NumericLiteral(value))", start.toString());
    assertEquals("not", ((LogicNegation) end).getOperator());
    assertNull(((LogicNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("NumericLiteral(value)", actualToStringResult);
    assertEquals("NumericLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit42() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new ArithmeticNegation(new NumericLiteral("value")), true,
        new ArithmeticNegation(new NumericLiteral("value")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,ArithmeticNegation(NumericLiteral"
        + "(value)),true,ArithmeticNegation(NumericLiteral" + "(value)))", actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("-", ((ArithmeticNegation) start).getOperator());
    Expression leftOperand = ((ArithmeticNegation) end).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    Expression leftOperand1 = ((ArithmeticNegation) start).getLeftOperand();
    String actualToStringResult1 = leftOperand1.toString();
    assertEquals("ArithmeticNegation(NumericLiteral(value))", end.toString());
    assertNull(((ArithmeticNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("ArithmeticNegation(NumericLiteral(value))", start.toString());
    assertEquals("-", ((ArithmeticNegation) end).getOperator());
    assertNull(((ArithmeticNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("NumericLiteral(value)", actualToStringResult);
    assertEquals("NumericLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit43() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new Name("name"), true, new Name("name"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,Name(name),true,Name(name))", actualVisitResult.toString());
    String actualName = ((Name) end).getName();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertEquals("name", actualName);
    assertEquals("Name(name)", start.toString());
    assertSame(type, start.getType());
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit44() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new ArithmeticNegation(new BooleanLiteral("value")), true,
        new ArithmeticNegation(new BooleanLiteral("value")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,ArithmeticNegation(BooleanLiteral"
        + "(value)),true,ArithmeticNegation(BooleanLiteral" + "(value)))", actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("-", ((ArithmeticNegation) start).getOperator());
    Expression leftOperand = ((ArithmeticNegation) end).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    Expression leftOperand1 = ((ArithmeticNegation) start).getLeftOperand();
    String actualToStringResult1 = leftOperand1.toString();
    assertEquals("ArithmeticNegation(BooleanLiteral(value))", end.toString());
    assertNull(((ArithmeticNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("ArithmeticNegation(BooleanLiteral(value))", start.toString());
    assertEquals("-", ((ArithmeticNegation) end).getOperator());
    assertNull(((ArithmeticNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertEquals("BooleanLiteral(value)", actualToStringResult);
    assertEquals("BooleanLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit45() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());
    NegatedPositiveUnaryTests element = new NegatedPositiveUnaryTests(new PositiveUnaryTests(positiveUnaryTestList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((NegatedPositiveUnaryTests) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    PositiveUnaryTests positiveUnaryTests = ((NegatedPositiveUnaryTests) actualVisitResult).getPositiveUnaryTests();
    String actualToStringResult = positiveUnaryTests.toString();
    assertEquals("NegatedUnaryTests(PositiveUnaryTests(NullTest()))", actualVisitResult.toString());
    assertEquals("PositiveUnaryTests(NullTest())", actualToStringResult);
    assertSame(type, positiveUnaryTests.getType());
  }

  @Test
  public void testVisit46() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FastArrayList fastArrayList = new FastArrayList();
    fastArrayList.add("foo");
    fastArrayList.add(new NullTest());
    NegatedPositiveUnaryTests element = new NegatedPositiveUnaryTests(new PositiveUnaryTests(fastArrayList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((NegatedPositiveUnaryTests) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    PositiveUnaryTests positiveUnaryTests = ((NegatedPositiveUnaryTests) actualVisitResult).getPositiveUnaryTests();
    String actualToStringResult = positiveUnaryTests.toString();
    assertEquals("NegatedUnaryTests(PositiveUnaryTests())", actualVisitResult.toString());
    assertEquals("PositiveUnaryTests()", actualToStringResult);
    assertSame(type, positiveUnaryTests.getType());
  }

  @Test
  public void testVisit47() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>(1);
    positiveUnaryTestList.add(new NullTest());
    positiveUnaryTestList.add(new NullTest());
    NegatedPositiveUnaryTests element = new NegatedPositiveUnaryTests(new PositiveUnaryTests(positiveUnaryTestList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((NegatedPositiveUnaryTests) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    PositiveUnaryTests positiveUnaryTests = ((NegatedPositiveUnaryTests) actualVisitResult).getPositiveUnaryTests();
    String actualToStringResult = positiveUnaryTests.toString();
    assertEquals("NegatedUnaryTests(PositiveUnaryTests(NullTest()" + ",NullTest()))", actualVisitResult.toString());
    assertEquals("PositiveUnaryTests(NullTest(),NullTest())", actualToStringResult);
    assertSame(type, positiveUnaryTests.getType());
  }

  @Test
  public void testVisit48() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    StringLiteral element = new StringLiteral("value");

    // Act and Assert
    assertTrue(((StringLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", ((StringLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null))).getLexeme());
  }

  @Test
  public void testVisit49() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    LogicNegation element = new LogicNegation(new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertNull(((LogicNegation) actualVisitResult).getRightOperand());
    assertEquals("not", ((LogicNegation) actualVisitResult).getOperator());
    assertEquals("LogicNegation(ExpressionList())", actualVisitResult.toString());
    Expression leftOperand = ((LogicNegation) actualVisitResult).getLeftOperand();
    Type type = ((LogicNegation) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", leftOperand.toString());
  }

  @Test
  public void testVisit5() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new LogicNegation(new NullLiteral()), true,
        new LogicNegation(new NullLiteral()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,LogicNegation(NullLiteral()),true" + ",LogicNegation(NullLiteral()))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("not", ((LogicNegation) start).getOperator());
    Type actualType = ((LogicNegation) end).getLeftOperand().getType();
    Type actualType1 = ((LogicNegation) start).getLeftOperand().getType();
    assertEquals("LogicNegation(NullLiteral())", end.toString());
    assertNull(((LogicNegation) start).getRightOperand());
    assertEquals("LogicNegation(NullLiteral())", start.toString());
    assertSame(type, start.getType());
    assertEquals("not", ((LogicNegation) end).getOperator());
    assertSame(type, end.getType());
    assertNull(((LogicNegation) end).getRightOperand());
    assertSame(type, actualType1);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit50() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    NamedTypeExpression rightOperand = new NamedTypeExpression("qualifiedName");
    InstanceOfExpression element = new InstanceOfExpression(new QualifiedName(stringList), rightOperand);

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand1 = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand1.toString();
    assertEquals("InstanceOfExpression(Name(foo), NamedTypeExpression" + "(qualifiedName))",
        actualVisitResult.toString());
    Expression leftOperand = ((InstanceOfExpression) actualVisitResult).getLeftOperand();
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertEquals("Name(foo)", leftOperand.toString());
    assertSame(type, leftOperand.getType());
    assertSame(type, rightOperand1.getType());
  }

  @Test
  public void testVisit51() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    BooleanLiteral leftOperand = new BooleanLiteral("value");
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    assertEquals("InstanceOfExpression(BooleanLiteral(value)," + " NamedTypeExpression(qualifiedName))",
        actualVisitResult.toString());
    Expression leftOperand1 = ((InstanceOfExpression) actualVisitResult).getLeftOperand();
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertEquals("value", ((BooleanLiteral) leftOperand1).getLexeme());
    assertSame(type, leftOperand1.getType());
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit52() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    NamedTypeExpression rightOperand = new NamedTypeExpression("qualifiedName");
    InstanceOfExpression element = new InstanceOfExpression(new ListLiteral(expressionList), rightOperand);

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand1 = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand1.toString();
    assertEquals("InstanceOfExpression(ListLiteral(ExpressionList())," + " NamedTypeExpression(qualifiedName))",
        actualVisitResult.toString());
    Expression leftOperand = ((InstanceOfExpression) actualVisitResult).getLeftOperand();
    List<Expression> expressionList1 = ((ListLiteral) leftOperand).getExpressionList();
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertEquals("ListLiteral(ExpressionList())", leftOperand.toString());
    Expression getResult = expressionList1.get(0);
    assertSame(type, leftOperand.getType());
    assertSame(type, rightOperand1.getType());
    assertSame(type, getResult.getType());
    assertEquals("ExpressionList()", getResult.toString());
  }

  @Test
  public void testVisit53() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NamedTypeExpression leftOperand = new NamedTypeExpression("qualifiedName");
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    assertEquals("InstanceOfExpression(NamedTypeExpression(qualifiedName)," + " NamedTypeExpression(qualifiedName))",
        actualVisitResult.toString());
    Expression leftOperand1 = ((InstanceOfExpression) actualVisitResult).getLeftOperand();
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertEquals("NamedTypeExpression(qualifiedName)", leftOperand1.toString());
    assertSame(type, leftOperand1.getType());
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit54() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NamedTypeExpression rightOperand = new NamedTypeExpression("qualifiedName");
    InstanceOfExpression element = new InstanceOfExpression(new NullLiteral(), rightOperand);

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand1 = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand1.toString();
    assertEquals("InstanceOfExpression(NullLiteral(), NamedTypeExpression" + "(qualifiedName))",
        actualVisitResult.toString());
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertSame(type, ((InstanceOfExpression) actualVisitResult).getLeftOperand().getType());
    assertSame(type, rightOperand1.getType());
  }

  @Test
  public void testVisit55() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NamedTypeExpression rightOperand = new NamedTypeExpression("qualifiedName");
    InstanceOfExpression element = new InstanceOfExpression(new ExpressionList(), rightOperand);

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand1 = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand1.toString();
    assertEquals("InstanceOfExpression(ExpressionList(), NamedTypeExpression" + "(qualifiedName))",
        actualVisitResult.toString());
    Expression leftOperand = ((InstanceOfExpression) actualVisitResult).getLeftOperand();
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertEquals("ExpressionList()", leftOperand.toString());
    assertSame(type, leftOperand.getType());
    assertSame(type, rightOperand1.getType());
  }

  @Test
  public void testVisit56() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    LogicNegation leftOperand = new LogicNegation(new ExpressionList());
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    assertEquals("InstanceOfExpression(LogicNegation(ExpressionList())," + " NamedTypeExpression(qualifiedName))",
        actualVisitResult.toString());
    Expression leftOperand1 = ((InstanceOfExpression) actualVisitResult).getLeftOperand();
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertEquals("not", ((LogicNegation) leftOperand1).getOperator());
    assertEquals("LogicNegation(ExpressionList())", leftOperand1.toString());
    Expression leftOperand2 = ((LogicNegation) leftOperand1).getLeftOperand();
    String actualToStringResult1 = leftOperand2.toString();
    assertSame(type, leftOperand1.getType());
    assertNull(((LogicNegation) leftOperand1).getRightOperand());
    assertSame(type, rightOperand.getType());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand2.getType());
  }

  @Test
  public void testVisit57() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    DateTimeLiteral leftOperand = new DateTimeLiteral("0.8.9",
        "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"");
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    assertEquals("InstanceOfExpression(DateTimeLiteral(0.8.9," + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H"
        + ")?([0-9]+(\\.[0-9]*)?S)?\"), NamedTypeExpression" + "(qualifiedName))", actualVisitResult.toString());
    Expression leftOperand1 = ((InstanceOfExpression) actualVisitResult).getLeftOperand();
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertEquals("0.8.9", ((DateTimeLiteral) leftOperand1).getConversionFunction());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) leftOperand1).getLexeme());
    assertSame(type, leftOperand1.getType());
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit58() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArithmeticNegation leftOperand = new ArithmeticNegation(new ExpressionList());
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    assertEquals("InstanceOfExpression(ArithmeticNegation(ExpressionList())," + " NamedTypeExpression(qualifiedName))",
        actualVisitResult.toString());
    Expression leftOperand1 = ((InstanceOfExpression) actualVisitResult).getLeftOperand();
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertEquals("-", ((ArithmeticNegation) leftOperand1).getOperator());
    assertEquals("ArithmeticNegation(ExpressionList())", leftOperand1.toString());
    Expression leftOperand2 = ((ArithmeticNegation) leftOperand1).getLeftOperand();
    String actualToStringResult1 = leftOperand2.toString();
    assertSame(type, leftOperand1.getType());
    assertNull(((ArithmeticNegation) leftOperand1).getRightOperand());
    assertSame(type, rightOperand.getType());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand2.getType());
  }

  @Test
  public void testVisit59() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NamedTypeExpression rightOperand = new NamedTypeExpression("qualifiedName");
    InstanceOfExpression element = new InstanceOfExpression(new Any(), rightOperand);

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand1 = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand1.toString();
    assertEquals("InstanceOfExpression(Any(), NamedTypeExpression" + "(qualifiedName))", actualVisitResult.toString());
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertSame(type, rightOperand1.getType());
  }

  @Test
  public void testVisit6() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    RangeTest element = new RangeTest(true, new QualifiedName(stringList), true, new QualifiedName(stringList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals("IntervalTest(true,Name(foo),true,Name(foo))", actualVisitResult.toString());
    String actualName = ((Name) end).getName();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertEquals("foo", actualName);
    assertEquals("Name(foo)", start.toString());
    assertSame(type, start.getType());
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit60() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NumericLiteral leftOperand = new NumericLiteral("value");
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    assertEquals("InstanceOfExpression(NumericLiteral(value)," + " NamedTypeExpression(qualifiedName))",
        actualVisitResult.toString());
    Expression leftOperand1 = ((InstanceOfExpression) actualVisitResult).getLeftOperand();
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertEquals("value", ((NumericLiteral) leftOperand1).getLexeme());
    assertSame(type, leftOperand1.getType());
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit61() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Name leftOperand = new Name("name");
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    assertEquals("InstanceOfExpression(Name(name), NamedTypeExpression" + "(qualifiedName))",
        actualVisitResult.toString());
    Expression leftOperand1 = ((InstanceOfExpression) actualVisitResult).getLeftOperand();
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertEquals("Name(name)", leftOperand1.toString());
    assertSame(type, leftOperand1.getType());
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit62() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList leftOperand = new ExpressionList();
    ArrayList<Pair<String, TypeExpression>> pairList = new ArrayList<Pair<String, TypeExpression>>();
    pairList.add(new Pair<String, TypeExpression>("left", new NamedTypeExpression("qualifiedName")));
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new ContextTypeExpression(pairList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    assertEquals("InstanceOfExpression(ExpressionList()," + " ContextTypeExpression(left: NamedTypeExpression"
        + "(qualifiedName)))", actualVisitResult.toString());
    Expression leftOperand1 = ((InstanceOfExpression) actualVisitResult).getLeftOperand();
    assertSame(type, leftOperand1.getType());
    assertSame(type, rightOperand.getType());
    assertEquals("ExpressionList()", leftOperand1.toString());
    assertEquals("ContextTypeExpression(left: NamedTypeExpression" + "(qualifiedName))", rightOperand.toString());
  }

  @Test
  public void testVisit63() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NamedTypeExpression rightOperand = new NamedTypeExpression("qualifiedName");
    InstanceOfExpression element = new InstanceOfExpression(new NullTest(), rightOperand);

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand1 = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand1.toString();
    assertEquals("InstanceOfExpression(NullTest(), NamedTypeExpression" + "(qualifiedName))",
        actualVisitResult.toString());
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertSame(type, rightOperand1.getType());
  }

  @Test
  public void testVisit64() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList leftOperand = new ExpressionList();
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("qualifiedName");
    ArrayList<TypeExpression> typeExpressionList = new ArrayList<TypeExpression>();
    typeExpressionList.add(namedTypeExpression);
    InstanceOfExpression element = new InstanceOfExpression(leftOperand,
        new FunctionTypeExpression(typeExpressionList, namedTypeExpression));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    assertEquals("InstanceOfExpression(ExpressionList(), FunctionTyp"
        + "eExpression(NamedTypeExpression(qualifiedName) ->" + " NamedTypeExpression(qualifiedName)))",
        actualVisitResult.toString());
    Expression leftOperand1 = ((InstanceOfExpression) actualVisitResult).getLeftOperand();
    assertEquals("ExpressionList()", leftOperand1.toString());
    assertSame(type, leftOperand1.getType());
    assertEquals(
        "FunctionTypeExpression(NamedTypeExpression(qualifiedName)" + " -> NamedTypeExpression(qualifiedName))",
        actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit65() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ExpressionList leftOperand = new ExpressionList();
    InstanceOfExpression element = new InstanceOfExpression(leftOperand,
        new ListTypeExpression(new NamedTypeExpression("qualifiedName")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    assertEquals("InstanceOfExpression(ExpressionList(), ListTypeExpression" + "(NamedTypeExpression(qualifiedName)))",
        actualVisitResult.toString());
    Expression leftOperand1 = ((InstanceOfExpression) actualVisitResult).getLeftOperand();
    assertEquals("ExpressionList()", leftOperand1.toString());
    assertSame(type, leftOperand1.getType());
    assertSame(type, rightOperand.getType());
    assertEquals("ListTypeExpression(NamedTypeExpression" + "(qualifiedName))", rightOperand.toString());
  }

  @Test
  public void testVisit66() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    StringLiteral leftOperand = new StringLiteral("value");
    InstanceOfExpression element = new InstanceOfExpression(leftOperand, new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((InstanceOfExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    TypeExpression rightOperand = ((InstanceOfExpression) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    assertEquals("InstanceOfExpression(StringLiteral(value)," + " NamedTypeExpression(qualifiedName))",
        actualVisitResult.toString());
    Expression leftOperand1 = ((InstanceOfExpression) actualVisitResult).getLeftOperand();
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertEquals("value", ((StringLiteral) leftOperand1).getLexeme());
    assertSame(type, leftOperand1.getType());
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit67() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("name", new AnyType()));
    FunctionDefinition functionDefinition = new FunctionDefinition(formalParameterList, new ExpressionList(), true);

    // Act and Assert
    assertSame(functionDefinition, cloneVisitor.visit(functionDefinition, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit68() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    DateTimeLiteral element = new DateTimeLiteral("0.8.9",
        "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"");

    // Act and Assert
    assertTrue(((DateTimeLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("0.8.9",
        ((DateTimeLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null))).getConversionFunction());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null))).getLexeme());
  }

  @Test
  public void testVisit69() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    NumericLiteral element = new NumericLiteral("value");

    // Act and Assert
    assertTrue(((NumericLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", ((NumericLiteral) cloneVisitor.visit(element, FEELContext.makeContext(null))).getLexeme());
  }

  @Test
  public void testVisit7() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(false, new ExpressionList(), true, new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    assertEquals("IntervalTest(true,ExpressionList(),true,ExpressionList" + "())", actualVisitResult.toString());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    String actualToStringResult = end.toString();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertEquals("ExpressionList()", actualToStringResult);
    assertEquals("ExpressionList()", start.toString());
    assertSame(type, start.getType());
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit70() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FilterExpression element = new FilterExpression(
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""),
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((FilterExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((FilterExpression) actualVisitResult).getSource();
    String actualConversionFunction = ((DateTimeLiteral) source).getConversionFunction();
    assertEquals("FilterExpression(DateTimeLiteral(0.8.9, \"[-]?P([0"
        + "-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\." + "[0-9]*)?S)?\"), DateTimeLiteral(0.8.9, \"[-]?P([0-9"
        + "]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0" + "-9]*)?S)?\"))", actualVisitResult.toString());
    Expression filter = ((FilterExpression) actualVisitResult).getFilter();
    assertEquals("0.8.9", ((DateTimeLiteral) filter).getConversionFunction());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) filter).getLexeme());
    assertSame(type, filter.getType());
    assertSame(type, source.getType());
    assertEquals("0.8.9", actualConversionFunction);
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) source).getLexeme());
  }

  @Test
  public void testVisit71() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FilterExpression element = new FilterExpression(new LogicNegation(new ExpressionList()),
        new LogicNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((FilterExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((FilterExpression) actualVisitResult).getSource();
    assertEquals("FilterExpression(LogicNegation(ExpressionList())," + " LogicNegation(ExpressionList()))",
        actualVisitResult.toString());
    Expression filter = ((FilterExpression) actualVisitResult).getFilter();
    assertEquals("not", ((LogicNegation) filter).getOperator());
    assertEquals("LogicNegation(ExpressionList())", filter.toString());
    Expression leftOperand = ((LogicNegation) filter).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertSame(type, filter.getType());
    Expression leftOperand1 = ((LogicNegation) source).getLeftOperand();
    assertEquals("LogicNegation(ExpressionList())", source.toString());
    assertNull(((LogicNegation) filter).getRightOperand());
    assertEquals("not", ((LogicNegation) source).getOperator());
    assertNull(((LogicNegation) source).getRightOperand());
    assertSame(type, source.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", leftOperand1.toString());
  }

  @Test
  public void testVisit72() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FilterExpression element = new FilterExpression(new ArithmeticNegation(new ExpressionList()),
        new ArithmeticNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((FilterExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((FilterExpression) actualVisitResult).getSource();
    assertEquals("FilterExpression(ArithmeticNegation(ExpressionList())," + " ArithmeticNegation(ExpressionList()))",
        actualVisitResult.toString());
    Expression filter = ((FilterExpression) actualVisitResult).getFilter();
    assertEquals("-", ((ArithmeticNegation) filter).getOperator());
    assertEquals("ArithmeticNegation(ExpressionList())", filter.toString());
    Expression leftOperand = ((ArithmeticNegation) filter).getLeftOperand();
    String actualToStringResult = leftOperand.toString();
    assertSame(type, filter.getType());
    Expression leftOperand1 = ((ArithmeticNegation) source).getLeftOperand();
    assertEquals("ArithmeticNegation(ExpressionList())", source.toString());
    assertNull(((ArithmeticNegation) filter).getRightOperand());
    assertEquals("-", ((ArithmeticNegation) source).getOperator());
    assertNull(((ArithmeticNegation) source).getRightOperand());
    assertSame(type, source.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", leftOperand1.toString());
  }

  @Test
  public void testVisit73() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FilterExpression element = new FilterExpression(new NullTest(), new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertTrue(
        ((FilterExpression) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FilterExpression(NullTest(), NullTest())", actualVisitResult.toString());
  }

  @Test
  public void testVisit74() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FilterExpression element = new FilterExpression(new StringLiteral("value"), new StringLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((FilterExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((FilterExpression) actualVisitResult).getSource();
    String actualLexeme = ((StringLiteral) source).getLexeme();
    assertEquals("FilterExpression(StringLiteral(value), StringLiteral" + "(value))", actualVisitResult.toString());
    Expression filter = ((FilterExpression) actualVisitResult).getFilter();
    assertEquals("value", actualLexeme);
    assertEquals("value", ((StringLiteral) filter).getLexeme());
    assertSame(type, filter.getType());
    assertSame(type, source.getType());
  }

  @Test
  public void testVisit75() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FilterExpression element = new FilterExpression(new Any(), new Any());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertTrue(
        ((FilterExpression) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FilterExpression(Any(), Any())", actualVisitResult.toString());
  }

  @Test
  public void testVisit76() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    FilterExpression element = new FilterExpression(new ListLiteral(expressionList), new ListLiteral(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((FilterExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((FilterExpression) actualVisitResult).getSource();
    List<Expression> expressionList1 = ((ListLiteral) source).getExpressionList();
    assertEquals("FilterExpression(ListLiteral(ExpressionList())," + " ListLiteral(ExpressionList()))",
        actualVisitResult.toString());
    Expression filter = ((FilterExpression) actualVisitResult).getFilter();
    List<Expression> expressionList2 = ((ListLiteral) filter).getExpressionList();
    Expression getResult = expressionList1.get(0);
    Expression getResult1 = expressionList2.get(0);
    assertEquals("ListLiteral(ExpressionList())", filter.toString());
    assertSame(type, filter.getType());
    assertSame(type, source.getType());
    assertEquals("ListLiteral(ExpressionList())", source.toString());
    String actualToStringResult = getResult1.toString();
    assertEquals("ExpressionList()", getResult.toString());
    assertSame(type, getResult.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, getResult1.getType());
  }

  @Test
  public void testVisit77() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FilterExpression element = new FilterExpression(new Name("name"), new Name("name"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((FilterExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((FilterExpression) actualVisitResult).getSource();
    String actualToStringResult = source.toString();
    assertEquals("FilterExpression(Name(name), Name(name))", actualVisitResult.toString());
    Expression filter = ((FilterExpression) actualVisitResult).getFilter();
    assertEquals("Name(name)", actualToStringResult);
    assertEquals("Name(name)", filter.toString());
    assertSame(type, filter.getType());
    assertSame(type, source.getType());
  }

  @Test
  public void testVisit78() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    FilterExpression element = new FilterExpression(new QualifiedName(stringList), new QualifiedName(stringList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((FilterExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((FilterExpression) actualVisitResult).getSource();
    String actualToStringResult = source.toString();
    assertEquals("FilterExpression(Name(foo), Name(foo))", actualVisitResult.toString());
    Expression filter = ((FilterExpression) actualVisitResult).getFilter();
    assertEquals("Name(foo)", actualToStringResult);
    assertEquals("Name(foo)", filter.toString());
    assertSame(type, filter.getType());
    assertSame(type, source.getType());
  }

  @Test
  public void testVisit79() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FilterExpression element = new FilterExpression(new ExpressionList(), new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((FilterExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((FilterExpression) actualVisitResult).getSource();
    assertEquals("FilterExpression(ExpressionList()," + " ExpressionList())", actualVisitResult.toString());
    Expression filter = ((FilterExpression) actualVisitResult).getFilter();
    assertEquals("ExpressionList()", filter.toString());
    assertSame(type, filter.getType());
    assertSame(type, source.getType());
    assertEquals("ExpressionList()", source.toString());
  }

  @Test
  public void testVisit8() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new LogicNegation(new NamedTypeExpression("qualifiedName")), true,
        new LogicNegation(new NamedTypeExpression("qualifiedName")));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    assertEquals(
        "IntervalTest(true,LogicNegation(NamedTypeExpression"
            + "(qualifiedName)),true,LogicNegation(NamedTypeExpression" + "(qualifiedName)))",
        actualVisitResult.toString());
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    String actualOperator = ((LogicNegation) start).getOperator();
    Expression leftOperand = ((LogicNegation) end).getLeftOperand();
    assertEquals("not", actualOperator);
    String actualQualifiedName = ((NamedTypeExpression) leftOperand).getQualifiedName();
    Expression leftOperand1 = ((LogicNegation) start).getLeftOperand();
    assertEquals("LogicNegation(NamedTypeExpression(qualifiedName))", end.toString());
    assertNull(((LogicNegation) start).getRightOperand());
    assertSame(type, start.getType());
    assertEquals("LogicNegation(NamedTypeExpression(qualifiedName))", start.toString());
    assertEquals("not", ((LogicNegation) end).getOperator());
    assertNull(((LogicNegation) end).getRightOperand());
    assertSame(type, end.getType());
    assertSame(type, leftOperand.getType());
    assertSame(type, leftOperand1.getType());
    assertEquals("qualifiedName", actualQualifiedName);
    assertEquals("NamedTypeExpression(qualifiedName)", leftOperand1.toString());
  }

  @Test
  public void testVisit80() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FilterExpression element = new FilterExpression(new NullLiteral(), new NullLiteral());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((FilterExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Type actualType = ((FilterExpression) actualVisitResult).getSource().getType();
    assertEquals("FilterExpression(NullLiteral(), NullLiteral())", actualVisitResult.toString());
    assertSame(type, ((FilterExpression) actualVisitResult).getFilter().getType());
    assertSame(type, actualType);
  }

  @Test
  public void testVisit81() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FilterExpression element = new FilterExpression(new NamedTypeExpression("qualifiedName"),
        new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((FilterExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((FilterExpression) actualVisitResult).getSource();
    String actualToStringResult = source.toString();
    assertEquals("FilterExpression(NamedTypeExpression(qualifiedName)," + " NamedTypeExpression(qualifiedName))",
        actualVisitResult.toString());
    Expression filter = ((FilterExpression) actualVisitResult).getFilter();
    assertEquals("NamedTypeExpression(qualifiedName)", actualToStringResult);
    assertEquals("NamedTypeExpression(qualifiedName)", filter.toString());
    assertSame(type, filter.getType());
    assertSame(type, source.getType());
  }

  @Test
  public void testVisit82() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FilterExpression element = new FilterExpression(new Context(null), new Context(null));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((FilterExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((FilterExpression) actualVisitResult).getSource();
    assertEquals("FilterExpression(Context(), Context())", actualVisitResult.toString());
    Expression filter = ((FilterExpression) actualVisitResult).getFilter();
    assertEquals("Context()", filter.toString());
    assertSame(type, filter.getType());
    assertSame(type, source.getType());
    assertEquals("Context()", source.toString());
  }

  @Test
  public void testVisit83() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FilterExpression element = new FilterExpression(new BooleanLiteral("value"), new BooleanLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((FilterExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((FilterExpression) actualVisitResult).getSource();
    String actualLexeme = ((BooleanLiteral) source).getLexeme();
    assertEquals("FilterExpression(BooleanLiteral(value), BooleanLiteral" + "(value))", actualVisitResult.toString());
    Expression filter = ((FilterExpression) actualVisitResult).getFilter();
    assertEquals("value", actualLexeme);
    assertEquals("value", ((BooleanLiteral) filter).getLexeme());
    assertSame(type, filter.getType());
    assertSame(type, source.getType());
  }

  @Test
  public void testVisit84() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    FilterExpression element = new FilterExpression(new NumericLiteral("value"), new NumericLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((FilterExpression) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((FilterExpression) actualVisitResult).getSource();
    String actualLexeme = ((NumericLiteral) source).getLexeme();
    assertEquals("FilterExpression(NumericLiteral(value), NumericLiteral" + "(value))", actualVisitResult.toString());
    Expression filter = ((FilterExpression) actualVisitResult).getFilter();
    assertEquals("value", actualLexeme);
    assertEquals("value", ((NumericLiteral) filter).getLexeme());
    assertSame(type, filter.getType());
    assertSame(type, source.getType());
  }

  @Test
  public void testVisit85() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    FEELContext context = FEELContext.makeContext(null);

    // Act
    Object actualVisitResult = cloneVisitor.visit(new QualifiedName(stringList), context);

    // Assert
    assertTrue(((Name) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(foo)", actualVisitResult.toString());
  }

  @Test
  public void testVisit86() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Addition element = new Addition("operator", new NullLiteral(), new NullLiteral());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Addition) actualVisitResult).getOperator());
    Type actualType = ((Addition) actualVisitResult).getRightOperand().getType();
    Type type = ((Addition) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Type actualType1 = ((Addition) actualVisitResult).getLeftOperand().getType();
    assertEquals("Addition(operator,NullLiteral(),NullLiteral())", actualVisitResult.toString());
    assertSame(type, actualType1);
    assertSame(type, actualType);
  }

  @Test
  public void testVisit87() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Addition element = new Addition("operator",
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""),
        new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Addition) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Addition) actualVisitResult).getOperator());
    Expression leftOperand = ((Addition) actualVisitResult).getLeftOperand();
    Type type = ((Addition) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Addition(operator,DateTimeLiteral(0.8.9," + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?"
        + "([0-9]+(\\.[0-9]*)?S)?\"),DateTimeLiteral(0.8.9," + " \"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?"
        + "([0-9]+(\\.[0-9]*)?S)?\"))", actualVisitResult.toString());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) leftOperand).getLexeme());
    assertSame(type, leftOperand.getType());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) rightOperand).getLexeme());
    assertSame(type, rightOperand.getType());
    assertEquals("0.8.9", ((DateTimeLiteral) leftOperand).getConversionFunction());
    assertEquals("0.8.9", ((DateTimeLiteral) rightOperand).getConversionFunction());
  }

  @Test
  public void testVisit88() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Addition element = new Addition("operator", new StringLiteral("value"), new StringLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Addition) actualVisitResult).getOperator());
    Expression rightOperand = ((Addition) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Addition) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Addition) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Addition(operator,StringLiteral(value),StringLiteral" + "(value))", actualVisitResult.toString());
    assertEquals("StringLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("StringLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit89() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Addition element = new Addition("operator", new Name("name"), new Name("name"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Addition) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Addition) actualVisitResult).getOperator());
    String actualName = ((Name) rightOperand).getName();
    Expression leftOperand = ((Addition) actualVisitResult).getLeftOperand();
    Type type = ((Addition) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualName1 = ((Name) leftOperand).getName();
    assertEquals("Addition(operator,Name(name),Name(name))", actualVisitResult.toString());
    assertEquals("name", actualName1);
    assertSame(type, leftOperand.getType());
    assertEquals("name", actualName);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit9() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    RangeTest element = new RangeTest(true, new BooleanLiteral("value"), true, new BooleanLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Type type = ((RangeTest) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertTrue(((RangeTest) actualVisitResult).isOpenEnd());
    assertEquals("IntervalTest(true,BooleanLiteral(value),true" + ",BooleanLiteral(value))",
        actualVisitResult.toString());
    Expression end = ((RangeTest) actualVisitResult).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeTest) actualVisitResult).getStart();
    assertTrue(((RangeTest) actualVisitResult).isOpenStart());
    assertEquals("BooleanLiteral(value)", actualToStringResult);
    assertEquals("value", ((BooleanLiteral) start).getLexeme());
    assertSame(type, start.getType());
    assertSame(type, end.getType());
  }

  @Test
  public void testVisit90() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Addition element = new Addition("operator", new NumericLiteral("value"), new NumericLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Addition) actualVisitResult).getOperator());
    Expression rightOperand = ((Addition) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Addition) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Addition) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Addition(operator,NumericLiteral(value),NumericLiteral" + "(value))", actualVisitResult.toString());
    assertEquals("NumericLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("NumericLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit91() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Addition element = new Addition("operator", new NamedTypeExpression("qualifiedName"),
        new NamedTypeExpression("qualifiedName"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Addition) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Addition) actualVisitResult).getOperator());
    String actualQualifiedName = ((NamedTypeExpression) rightOperand).getQualifiedName();
    Expression leftOperand = ((Addition) actualVisitResult).getLeftOperand();
    Type type = ((Addition) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    String actualQualifiedName1 = ((NamedTypeExpression) leftOperand).getQualifiedName();
    assertEquals("Addition(operator,NamedTypeExpression(qualifiedName" + "),NamedTypeExpression(qualifiedName))",
        actualVisitResult.toString());
    assertSame(type, leftOperand.getType());
    assertEquals("qualifiedName", actualQualifiedName1);
    assertSame(type, rightOperand.getType());
    assertEquals("qualifiedName", actualQualifiedName);
  }

  @Test
  public void testVisit92() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Addition element = new Addition("operator", new BooleanLiteral("value"), new BooleanLiteral("value"));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Addition) actualVisitResult).getOperator());
    Expression rightOperand = ((Addition) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Addition) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Addition) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Addition(operator,BooleanLiteral(value),BooleanLiteral" + "(value))", actualVisitResult.toString());
    assertEquals("BooleanLiteral(value)", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("BooleanLiteral(value)", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit93() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Addition element = new Addition("operator", new ArithmeticNegation(new ExpressionList()),
        new ArithmeticNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Addition) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Addition) actualVisitResult).getOperator());
    String actualOperator = ((ArithmeticNegation) rightOperand).getOperator();
    Expression leftOperand = ((Addition) actualVisitResult).getLeftOperand();
    Type type = ((Addition) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Addition(operator,ArithmeticNegation(ExpressionList" + "()),ArithmeticNegation(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("ArithmeticNegation(ExpressionList())", leftOperand.toString());
    Expression leftOperand1 = ((ArithmeticNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand1.toString();
    assertSame(type, leftOperand.getType());
    assertEquals("-", actualOperator);
    assertNull(((ArithmeticNegation) rightOperand).getRightOperand());
    assertNull(((ArithmeticNegation) leftOperand).getRightOperand());
    assertSame(type, rightOperand.getType());
    assertEquals("ArithmeticNegation(ExpressionList())", rightOperand.toString());
    Expression leftOperand2 = ((ArithmeticNegation) rightOperand).getLeftOperand();
    String actualToStringResult1 = leftOperand2.toString();
    assertEquals("-", ((ArithmeticNegation) leftOperand).getOperator());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit94() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Addition element = new Addition("operator", new Context(null), new Context(null));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Addition) actualVisitResult).getOperator());
    Expression rightOperand = ((Addition) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Addition) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Addition) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Addition(operator,Context(),Context())", actualVisitResult.toString());
    assertEquals("Context()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("Context()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit95() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Addition element = new Addition("operator", new ExpressionList(), new ExpressionList());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Addition) actualVisitResult).getOperator());
    Expression rightOperand = ((Addition) actualVisitResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Addition) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Addition) actualVisitResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Addition(operator,ExpressionList(),ExpressionList" + "())", actualVisitResult.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testVisit96() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Addition element = new Addition("operator", new Any(), new Any());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Addition) actualVisitResult).getOperator());
    assertTrue(((Addition) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Addition(operator,Any(),Any())", actualVisitResult.toString());
  }

  @Test
  public void testVisit97() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Addition element = new Addition("operator", new NullTest(), new NullTest());

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    assertEquals("operator", ((Addition) actualVisitResult).getOperator());
    assertTrue(((Addition) actualVisitResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Addition(operator,NullTest(),NullTest())", actualVisitResult.toString());
  }

  @Test
  public void testVisit98() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    Addition element = new Addition("operator", new LogicNegation(new ExpressionList()),
        new LogicNegation(new ExpressionList()));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Addition) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Addition) actualVisitResult).getOperator());
    String actualOperator = ((LogicNegation) rightOperand).getOperator();
    Expression leftOperand = ((Addition) actualVisitResult).getLeftOperand();
    Type type = ((Addition) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("Addition(operator,LogicNegation(ExpressionList())" + ",LogicNegation(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("LogicNegation(ExpressionList())", leftOperand.toString());
    Expression leftOperand1 = ((LogicNegation) leftOperand).getLeftOperand();
    String actualToStringResult = leftOperand1.toString();
    assertSame(type, leftOperand.getType());
    assertEquals("not", actualOperator);
    assertNull(((LogicNegation) rightOperand).getRightOperand());
    assertNull(((LogicNegation) leftOperand).getRightOperand());
    assertSame(type, rightOperand.getType());
    assertEquals("LogicNegation(ExpressionList())", rightOperand.toString());
    Expression leftOperand2 = ((LogicNegation) rightOperand).getLeftOperand();
    String actualToStringResult1 = leftOperand2.toString();
    assertEquals("not", ((LogicNegation) leftOperand).getOperator());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand2.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, leftOperand1.getType());
  }

  @Test
  public void testVisit99() {
    // Arrange
    CloneVisitor cloneVisitor = new CloneVisitor();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    Addition element = new Addition("operator", new ListLiteral(expressionList), new ListLiteral(expressionList));

    // Act
    Object actualVisitResult = cloneVisitor.visit(element, FEELContext.makeContext(null));

    // Assert
    Expression rightOperand = ((Addition) actualVisitResult).getRightOperand();
    assertEquals("operator", ((Addition) actualVisitResult).getOperator());
    List<Expression> expressionList1 = ((ListLiteral) rightOperand).getExpressionList();
    Expression leftOperand = ((Addition) actualVisitResult).getLeftOperand();
    Type type = ((Addition) actualVisitResult).getType();
    assertTrue(type instanceof AnyType);
    List<Expression> expressionList2 = ((ListLiteral) leftOperand).getExpressionList();
    assertEquals("Addition(operator,ListLiteral(ExpressionList())" + ",ListLiteral(ExpressionList()))",
        actualVisitResult.toString());
    assertEquals("ListLiteral(ExpressionList())", leftOperand.toString());
    assertSame(type, leftOperand.getType());
    assertEquals("ListLiteral(ExpressionList())", rightOperand.toString());
    assertSame(type, rightOperand.getType());
    Expression getResult = expressionList2.get(0);
    Expression getResult1 = expressionList1.get(0);
    String actualToStringResult = getResult.toString();
    assertEquals("ExpressionList()", getResult1.toString());
    assertSame(type, getResult1.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, getResult.getType());
  }
}

