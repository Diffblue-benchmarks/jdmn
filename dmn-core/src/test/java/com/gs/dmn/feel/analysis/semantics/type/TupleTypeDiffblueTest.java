package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

public class TupleTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("TupleType()", (new TupleType()).toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange, Act and Assert
    assertEquals("TupleType()", (new TupleType(null)).toString());
  }

  @Test
  public void testConstructor3() {
    // Arrange
    ArrayList<Type> typeList = new ArrayList<Type>();
    typeList.add(new AnyType());

    // Act and Assert
    assertEquals("TupleType(Any)", (new TupleType(typeList)).toString());
  }

  @Test
  public void testEquivalentTo() {
    // Arrange
    TupleType tupleType = new TupleType();

    // Act and Assert
    assertFalse(tupleType.equivalentTo(new AnyType()));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    TupleType tupleType = new TupleType();
    ArrayList<Type> typeList = new ArrayList<Type>();
    typeList.add(new AnyType());

    // Act and Assert
    assertFalse(tupleType.equivalentTo(new TupleType(typeList)));
  }

  @Test
  public void testEquivalentTo3() {
    // Arrange
    ArrayList<Type> typeList = new ArrayList<Type>();
    typeList.add(new AnyType());
    TupleType tupleType = new TupleType(typeList);
    ArrayList<Type> typeList1 = new ArrayList<Type>();
    typeList1.add(new AnyType());

    // Act and Assert
    assertFalse(tupleType.equivalentTo(new TupleType(typeList1)));
  }

  @Test
  public void testEquivalentTo4() {
    // Arrange
    TupleType tupleType = new TupleType();

    // Act and Assert
    assertTrue(tupleType.equivalentTo(new TupleType()));
  }

  @Test
  public void testConformsTo() {
    // Arrange
    TupleType tupleType = new TupleType();
    ArrayList<Type> typeList = new ArrayList<Type>();
    typeList.add(new AnyType());

    // Act and Assert
    assertFalse(tupleType.conformsTo(new TupleType(typeList)));
  }

  @Test
  public void testConformsTo2() {
    // Arrange
    TupleType tupleType = new TupleType();

    // Act and Assert
    assertFalse(tupleType.conformsTo(new AnyType()));
  }

  @Test
  public void testConformsTo3() {
    // Arrange
    ArrayList<Type> typeList = new ArrayList<Type>();
    typeList.add(new AnyType());
    TupleType tupleType = new TupleType(typeList);
    ArrayList<Type> typeList1 = new ArrayList<Type>();
    typeList1.add(new AnyType());

    // Act and Assert
    assertFalse(tupleType.conformsTo(new TupleType(typeList1)));
  }

  @Test
  public void testConformsTo4() {
    // Arrange
    TupleType tupleType = new TupleType();

    // Act and Assert
    assertTrue(tupleType.conformsTo(new TupleType()));
  }

  @Test
  public void testIsValid() {
    // Arrange, Act and Assert
    assertFalse((new TupleType()).isValid());
  }

  @Test
  public void testIsValid2() {
    // Arrange
    ArrayList<Type> typeList = new ArrayList<Type>();
    typeList.add(new AnyType());

    // Act and Assert
    assertTrue((new TupleType(typeList)).isValid());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new TupleType()).equals("o"));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new TupleType()).equals(null));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(1, (new TupleType()).hashCode());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("TupleType()", (new TupleType()).toString());
  }
}

