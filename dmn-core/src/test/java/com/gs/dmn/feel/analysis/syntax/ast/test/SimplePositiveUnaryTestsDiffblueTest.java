package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.ListLiteral;
import java.util.ArrayList;
import org.junit.Test;

public class SimplePositiveUnaryTestsDiffblueTest {
  @Test
  public void constructorTest() {
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
  public void toStringTest() {
    // Arrange
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    simplePositiveUnaryTestList.add(new ListTest(new ListLiteral(null)));

    // Act and Assert
    assertEquals("SimplePositiveUnaryTests(ListTest(ListLiteral()))",
        (new SimplePositiveUnaryTests(simplePositiveUnaryTestList)).toString());
  }
}

