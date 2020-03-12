package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DoubleUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void absTest() {
    // Arrange, Act and Assert
    assertEquals(1.0, DoubleUtil.abs(1.0).doubleValue(), 0.0);
  }

  @Test
  public void ceilingTest() {
    // Arrange, Act and Assert
    assertEquals(1.0, DoubleUtil.ceiling(1.0).doubleValue(), 0.0);
  }

  @Test
  public void decimalTest() {
    // Arrange, Act and Assert
    assertEquals(1.0, DoubleUtil.decimal(1.0, 1.0).doubleValue(), 0.0);
  }

  @Test
  public void evenTest() {
    // Arrange
    Boolean actualEvenResult = DoubleUtil.even(1.0);
    Boolean actualEvenResult1 = DoubleUtil.even(10.0);

    // Act and Assert
    assertFalse(actualEvenResult);
    assertTrue(actualEvenResult1);
    assertNull(DoubleUtil.even(0.5));
  }

  @Test
  public void expTest() {
    // Arrange, Act and Assert
    assertEquals(2.718281828459045, DoubleUtil.exp(1.0).doubleValue(), 0.0);
  }

  @Test
  public void floorTest() {
    // Arrange, Act and Assert
    assertEquals(1.0, DoubleUtil.floor(1.0).doubleValue(), 0.0);
  }

  @Test
  public void intModuloTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, DoubleUtil.intModulo(1.0, 1.0).doubleValue(), 0.0);
  }

  @Test
  public void logTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, DoubleUtil.log(1.0).doubleValue(), 0.0);
  }

  @Test
  public void maxTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    DoubleUtil.max(objectList);
  }

  @Test
  public void meanTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    DoubleUtil.mean(objectList);
  }

  @Test
  public void medianTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    DoubleUtil.median(objectList);
  }

  @Test
  public void minTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    DoubleUtil.min(objectList);
  }

  @Test
  public void modeTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(DoubleUtil.mode(objectList));
  }

  @Test
  public void moduloTest() {
    // Arrange, Act and Assert
    assertEquals(0.0, DoubleUtil.modulo(1.0, 1.0).doubleValue(), 0.0);
  }

  @Test
  public void numericDivideTest() {
    // Arrange
    Double numericDivideResult = DoubleUtil.numericDivide(1.0, 1.0);

    // Act
    Double actualNumericDivideResult = DoubleUtil.numericDivide(1.0, 0.0);

    // Assert
    assertEquals(1.0, numericDivideResult.doubleValue(), 0.0);
    assertNull(actualNumericDivideResult);
  }

  @Test
  public void oddTest() {
    // Arrange
    Boolean actualOddResult = DoubleUtil.odd(1.0);
    Boolean actualOddResult1 = DoubleUtil.odd(10.0);

    // Act and Assert
    assertTrue(actualOddResult);
    assertFalse(actualOddResult1);
    assertNull(DoubleUtil.odd(0.5));
  }

  @Test
  public void productTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    DoubleUtil.product(objectList);
  }

  @Test
  public void sqrtTest() {
    // Arrange, Act and Assert
    assertEquals(1.0, DoubleUtil.sqrt(1.0).doubleValue(), 0.0);
  }

  @Test
  public void stddevTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    DoubleUtil.stddev(objectList);
  }

  @Test
  public void sumTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    DoubleUtil.sum(objectList);
  }
}

