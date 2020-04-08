package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ListTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new ListType()).isValid());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ListType listType = new ListType(new AnyType());

    // Act
    ListType actualListType = new ListType(null);

    // Assert
    assertTrue(listType.isValid());
    assertTrue(actualListType.isValid());
  }

  @Test
  public void testEquivalentTo() {
    // Arrange
    ListType listType = new ListType();

    // Act and Assert
    assertFalse(listType.equivalentTo(new AnyType()));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    ListType listType = new ListType();

    // Act and Assert
    assertTrue(listType.equivalentTo(new ListType()));
  }

  @Test
  public void testConformsTo() {
    // Arrange
    ListType listType = new ListType();

    // Act and Assert
    assertFalse(listType.conformsTo(new ListType(new AnyType())));
  }

  @Test
  public void testConformsTo2() {
    // Arrange
    ListType listType = new ListType();

    // Act and Assert
    assertTrue(listType.conformsTo(new ListType()));
  }

  @Test
  public void testConformsTo3() {
    // Arrange
    ListType listType = new ListType();

    // Act and Assert
    assertFalse(listType.conformsTo(new AnyType()));
  }

  @Test
  public void testIsValid() {
    // Arrange, Act and Assert
    assertTrue((new ListType()).isValid());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new ListType()).equals("o"));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(1207515905, (new ListType()).hashCode());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("ListType(Any)", (new ListType()).toString());
  }
}

