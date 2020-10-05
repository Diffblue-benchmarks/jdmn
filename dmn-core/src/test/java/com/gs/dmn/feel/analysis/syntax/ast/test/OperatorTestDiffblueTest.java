package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.StringLiteral;
import org.junit.Test;

public class OperatorTestDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    OperatorTest actualOperatorTest = new OperatorTest(">=", new NumericLiteral("18"));

    // Assert
    assertTrue(actualOperatorTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals(">=", actualOperatorTest.getOperator());
    assertEquals("OperatorTest(>=,NumericLiteral(18))", actualOperatorTest.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    OperatorTest actualOperatorTest = new OperatorTest(null, new StringLiteral("\"Medium\""));

    // Assert
    assertTrue(actualOperatorTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(actualOperatorTest.getOperator());
    assertEquals("OperatorTest(null,StringLiteral(\"Medium\"))", actualOperatorTest.toString());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    OperatorTest actualOperatorTest = new OperatorTest(null, new StringLiteral("\"Low\""));

    // Assert
    assertTrue(actualOperatorTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertNull(actualOperatorTest.getOperator());
    assertEquals("OperatorTest(null,StringLiteral(\"Low\"))", actualOperatorTest.toString());
  }
}

