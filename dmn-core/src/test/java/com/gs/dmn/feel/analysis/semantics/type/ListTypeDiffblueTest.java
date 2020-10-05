package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ListTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new ListType(new AnyType())).isValid());
    assertEquals("ListType(number)", (new ListType(new NumberType())).toString());
    assertEquals("ListType(string)", (new ListType(new StringType())).toString());
  }

  @Test
  public void testConformsTo() {
    // Arrange, Act and Assert
    assertFalse((new ListType(new StringType())).conformsTo(new ListType(new StringType())));
  }

  @Test
  public void testConformsTo2() {
    // Arrange
    ListType listType = new ListType(new StringType());

    // Act and Assert
    assertFalse(listType.conformsTo(new AnyType()));
  }

  @Test
  public void testConformsTo3() {
    // Arrange
    ListType other = new ListType(new AnyType());

    // Act and Assert
    assertFalse((new ListType(new ListType(new StringType()))).conformsTo(other));
  }

  @Test
  public void testIsValid() {
    // Arrange, Act and Assert
    assertTrue((new ListType(new StringType())).isValid());
  }

  @Test
  public void testEquals() {
    // Arrange
    StringType stringType = new StringType();

    // Act and Assert
    assertFalse((new ListType(stringType)).equals(stringType));
  }

  @Test
  public void testEquals2() {
    // Arrange
    StringType stringType = new StringType();

    // Act and Assert
    assertFalse((new ListType(stringType)).equals(stringType));
  }
}

