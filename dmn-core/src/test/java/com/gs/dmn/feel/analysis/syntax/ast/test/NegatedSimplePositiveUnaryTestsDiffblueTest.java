package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.ListLiteral;
import java.util.ArrayList;
import org.junit.Test;

public class NegatedSimplePositiveUnaryTestsDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    simplePositiveUnaryTestList.add(new ListTest(new ListLiteral(null)));

    // Act
    NegatedSimplePositiveUnaryTests actualNegatedSimplePositiveUnaryTests = new NegatedSimplePositiveUnaryTests(
        new SimplePositiveUnaryTests(simplePositiveUnaryTestList));

    // Assert
    assertTrue(
        actualNegatedSimplePositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("NegatedSimpleUnaryTests(SimplePositiveUnaryTests" + "(ListTest(ListLiteral())))",
        actualNegatedSimplePositiveUnaryTests.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange
    ListTest param0 = new ListTest(null);
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    simplePositiveUnaryTestList.add(param0);

    // Act and Assert
    assertEquals("NegatedSimpleUnaryTests(SimplePositiveUnaryTests" + "(ListTest(null)))",
        (new NegatedSimplePositiveUnaryTests(new SimplePositiveUnaryTests(simplePositiveUnaryTestList))).toString());
  }
}

