package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;
import org.junit.Test;

public class TupleTypeDiffblueTest {
  @Test
  public void conformsToTest() {
    // Arrange
    TupleType tupleType = new TupleType();

    // Act and Assert
    assertFalse(tupleType.conformsTo(new AnyType()));
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("TupleType()", (new TupleType()).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange
    ArrayList<Type> typeList = new ArrayList<Type>();
    typeList.add(new AnyType());

    // Act and Assert
    assertEquals("TupleType(Any)", (new TupleType(typeList)).toString());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new TupleType()).equals("o"));
  }

  @Test
  public void equivalentToTest() {
    // Arrange
    TupleType tupleType = new TupleType();

    // Act and Assert
    assertFalse(tupleType.equivalentTo(new AnyType()));
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new TupleType()).hashCode());
  }

  @Test
  public void isValidTest() {
    // Arrange, Act and Assert
    assertFalse((new TupleType()).isValid());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("TupleType()", (new TupleType()).toString());
  }
}

