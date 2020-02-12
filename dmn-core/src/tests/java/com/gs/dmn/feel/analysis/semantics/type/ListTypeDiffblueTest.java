package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ListTypeDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ListType()).equals("foo"));
  }

  @Test(timeout=10000)
  public void getElementTypeTest() {
    // Arrange and Act
    Type actualElementType = (new ListType()).getElementType();

    // Assert
    assertSame(((AnyType) actualElementType).ANY, actualElementType);
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertTrue((new ListType(new AnyType())).isValid());
  }

  @Test(timeout=10000)
  public void isValidTest() {
    // Arrange, Act and Assert
    assertTrue((new ListType()).isValid());
  }

  @Test(timeout=10000)
  public void equivalentToTest() {
    // Arrange
    ListType listType = new ListType();

    // Act and Assert
    assertFalse(listType.equivalentTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new ListType()).isValid());
  }

  @Test(timeout=10000)
  public void conformsToTest() {
    // Arrange
    ListType listType = new ListType();

    // Act and Assert
    assertFalse(listType.conformsTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ListType(Any)", (new ListType()).toString());
  }
}

