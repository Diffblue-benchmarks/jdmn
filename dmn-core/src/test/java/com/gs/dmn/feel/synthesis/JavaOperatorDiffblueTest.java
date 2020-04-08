package com.gs.dmn.feel.synthesis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class JavaOperatorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    JavaOperator actualJavaOperator = new JavaOperator("name", 1, true, JavaOperator.Associativity.LEFT_RIGHT,
        JavaOperator.Notation.INFIX);

    // Assert
    assertTrue(actualJavaOperator.isCommutative());
    assertEquals(1, actualJavaOperator.getCardinality());
    assertEquals(JavaOperator.Associativity.LEFT_RIGHT, actualJavaOperator.getAssociativity());
    assertEquals("name", actualJavaOperator.getName());
    assertEquals(JavaOperator.Notation.INFIX, actualJavaOperator.getNotation());
  }
}

