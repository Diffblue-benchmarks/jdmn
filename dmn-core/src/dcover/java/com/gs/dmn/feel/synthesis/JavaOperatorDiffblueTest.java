package com.gs.dmn.feel.synthesis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class JavaOperatorDiffblueTest {
  @Test(timeout=10000)
  public void getCardinalityTest() {
    // Arrange, Act and Assert
    assertEquals(1,
        (new JavaOperator("name", 1, true, JavaOperator.Associativity.LEFT_RIGHT, JavaOperator.Notation.INFIX))
            .getCardinality());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    JavaOperator actualJavaOperator = new JavaOperator("name", 1, true, JavaOperator.Associativity.LEFT_RIGHT,
        JavaOperator.Notation.INFIX);

    // Assert
    boolean actualIsCommutativeResult = actualJavaOperator.isCommutative();
    JavaOperator.Notation actualNotation = actualJavaOperator.getNotation();
    String actualName = actualJavaOperator.getName();
    JavaOperator.Associativity actualAssociativity = actualJavaOperator.getAssociativity();
    assertTrue(actualIsCommutativeResult);
    assertEquals(1, actualJavaOperator.getCardinality());
    assertEquals(JavaOperator.Associativity.LEFT_RIGHT, actualAssociativity);
    assertEquals("name", actualName);
    assertEquals(JavaOperator.Notation.INFIX, actualNotation);
  }

  @Test(timeout=10000)
  public void getAssociativityTest() {
    // Arrange, Act and Assert
    assertEquals(JavaOperator.Associativity.LEFT_RIGHT,
        (new JavaOperator("name", 1, true, JavaOperator.Associativity.LEFT_RIGHT, JavaOperator.Notation.INFIX))
            .getAssociativity());
  }

  @Test(timeout=10000)
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("name",
        (new JavaOperator("name", 1, true, JavaOperator.Associativity.LEFT_RIGHT, JavaOperator.Notation.INFIX))
            .getName());
  }

  @Test(timeout=10000)
  public void getNotationTest() {
    // Arrange, Act and Assert
    assertEquals(JavaOperator.Notation.INFIX,
        (new JavaOperator("name", 1, true, JavaOperator.Associativity.LEFT_RIGHT, JavaOperator.Notation.INFIX))
            .getNotation());
  }

  @Test(timeout=10000)
  public void isCommutativeTest() {
    // Arrange, Act and Assert
    assertTrue((new JavaOperator("name", 1, true, JavaOperator.Associativity.LEFT_RIGHT, JavaOperator.Notation.INFIX))
        .isCommutative());
  }
}

