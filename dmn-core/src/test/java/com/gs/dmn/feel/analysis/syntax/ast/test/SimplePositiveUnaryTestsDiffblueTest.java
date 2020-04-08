package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.ListLiteral;
import java.util.ArrayList;
import org.junit.Test;

public class SimplePositiveUnaryTestsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    SimplePositiveUnaryTests actualSimplePositiveUnaryTests = new SimplePositiveUnaryTests(null);

    // Assert
    assertTrue(actualSimplePositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("SimplePositiveUnaryTests()", actualSimplePositiveUnaryTests.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(null);
    simplePositiveUnaryTestList.add(new ListTest(new ListLiteral(expressionList)));

    // Act
    SimplePositiveUnaryTests actualSimplePositiveUnaryTests = new SimplePositiveUnaryTests(simplePositiveUnaryTestList);

    // Assert
    assertTrue(actualSimplePositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertSame(simplePositiveUnaryTestList, actualSimplePositiveUnaryTests.getSimplePositiveUnaryTests());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    simplePositiveUnaryTestList.add(new ListTest(new ListLiteral(null)));
    SimplePositiveUnaryTests simplePositiveUnaryTests = new SimplePositiveUnaryTests(simplePositiveUnaryTestList);

    // Act
    simplePositiveUnaryTests.deriveType(null);

    // Assert
    Type type = simplePositiveUnaryTests.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType(Any)", type.toString());
  }

  @Test
  public void testAccept() {
    // Arrange
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    simplePositiveUnaryTestList.add(new ListTest(new ListLiteral(null)));
    SimplePositiveUnaryTests simplePositiveUnaryTests = new SimplePositiveUnaryTests(simplePositiveUnaryTestList);
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(simplePositiveUnaryTests, simplePositiveUnaryTests.accept(new NopVisitor(), params));
  }

  @Test
  public void testAccept2() {
    // Arrange
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    simplePositiveUnaryTestList.add(new ListTest(new ListLiteral(null)));
    SimplePositiveUnaryTests simplePositiveUnaryTests = new SimplePositiveUnaryTests(simplePositiveUnaryTestList);
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = simplePositiveUnaryTests.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((SimplePositiveUnaryTests) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    SimplePositiveUnaryTest getResult = ((SimplePositiveUnaryTests) actualAcceptResult).getSimplePositiveUnaryTests()
        .get(0);
    assertEquals("SimplePositiveUnaryTests(ListTest(ListLiteral()))", actualAcceptResult.toString());
    ListLiteral listLiteral = ((ListTest) getResult).getListLiteral();
    assertEquals("ListTest(ListLiteral())", getResult.toString());
    assertSame(type, getResult.getType());
    assertSame(type, listLiteral.getType());
    assertEquals("ListLiteral()", listLiteral.toString());
  }

  @Test
  public void testToString() {
    // Arrange
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    simplePositiveUnaryTestList.add(new ListTest(new ListLiteral(null)));

    // Act and Assert
    assertEquals("SimplePositiveUnaryTests(ListTest(ListLiteral()))",
        (new SimplePositiveUnaryTests(simplePositiveUnaryTestList)).toString());
  }
}

