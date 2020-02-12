package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TupleTypeDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new TupleType()).equals("foo"));
  }

  @Test(timeout=10000)
  public void getTypesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new TupleType()).getTypes().size());
  }

  @Test(timeout=10000)
  public void isValidTest() {
    // Arrange, Act and Assert
    assertFalse((new TupleType()).isValid());
  }

  @Test(timeout=10000)
  public void equivalentToTest() {
    // Arrange
    TupleType tupleType = new TupleType();

    // Act and Assert
    assertFalse(tupleType.equivalentTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("TupleType()", (new TupleType(null)).toString());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new TupleType()).hashCode());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("TupleType()", (new TupleType()).toString());
  }

  @Test(timeout=10000)
  public void conformsToTest() {
    // Arrange
    TupleType tupleType = new TupleType();

    // Act and Assert
    assertFalse(tupleType.conformsTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("TupleType()", (new TupleType()).toString());
  }
}

