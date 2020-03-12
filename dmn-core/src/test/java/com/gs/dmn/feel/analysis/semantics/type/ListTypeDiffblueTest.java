package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ListTypeDiffblueTest {
  @Test
  public void conformsToTest() {
    // Arrange
    ListType listType = new ListType();

    // Act and Assert
    assertFalse(listType.conformsTo(new AnyType()));
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new ListType()).isValid());
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertTrue((new ListType(new AnyType())).isValid());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ListType()).equals("o"));
  }

  @Test
  public void equivalentToTest() {
    // Arrange
    ListType listType = new ListType();

    // Act and Assert
    assertFalse(listType.equivalentTo(new AnyType()));
  }

  @Test
  public void isValidTest() {
    // Arrange, Act and Assert
    assertTrue((new ListType()).isValid());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ListType(Any)", (new ListType()).toString());
  }
}

