package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

public class DoubleUtilDiffblueTest {
  @Test
  public void testDecimal() {
    // Arrange
    Double decimalResult = DoubleUtil.decimal(1.0, 1.0);

    // Act
    Double actualDecimalResult = DoubleUtil.decimal(1.0, null);

    // Assert
    assertEquals(1.0, decimalResult.doubleValue(), 0.0);
    assertNull(actualDecimalResult);
  }

  @Test
  public void testFloor() {
    // Arrange
    Double floorResult = DoubleUtil.floor(1.0);

    // Act
    Double actualFloorResult = DoubleUtil.floor(null);

    // Assert
    assertEquals(1.0, floorResult.doubleValue(), 0.0);
    assertNull(actualFloorResult);
  }

  @Test
  public void testCeiling() {
    // Arrange
    Double ceilingResult = DoubleUtil.ceiling(1.0);

    // Act
    Double actualCeilingResult = DoubleUtil.ceiling(null);

    // Assert
    assertEquals(1.0, ceilingResult.doubleValue(), 0.0);
    assertNull(actualCeilingResult);
  }

  @Test
  public void testAbs() {
    // Arrange
    Double absResult = DoubleUtil.abs(1.0);

    // Act
    Double actualAbsResult = DoubleUtil.abs(null);

    // Assert
    assertEquals(1.0, absResult.doubleValue(), 0.0);
    assertNull(actualAbsResult);
  }

  @Test
  public void testIntModulo() {
    // Arrange
    Double intModuloResult = DoubleUtil.intModulo(1.0, 1.0);

    // Act
    Double actualIntModuloResult = DoubleUtil.intModulo(null, 1.0);

    // Assert
    assertEquals(0.0, intModuloResult.doubleValue(), 0.0);
    assertNull(actualIntModuloResult);
  }

  @Test
  public void testModulo() {
    // Arrange
    Double moduloResult = DoubleUtil.modulo(1.0, 1.0);

    // Act
    Double actualModuloResult = DoubleUtil.modulo(null, 1.0);

    // Assert
    assertEquals(0.0, moduloResult.doubleValue(), 0.0);
    assertNull(actualModuloResult);
  }

  @Test
  public void testSqrt() {
    // Arrange
    Double sqrtResult = DoubleUtil.sqrt(1.0);

    // Act
    Double actualSqrtResult = DoubleUtil.sqrt(null);

    // Assert
    assertEquals(1.0, sqrtResult.doubleValue(), 0.0);
    assertNull(actualSqrtResult);
  }

  @Test
  public void testLog() {
    // Arrange, Act and Assert
    assertEquals(0.0, DoubleUtil.log(1.0).doubleValue(), 0.0);
  }

  @Test
  public void testExp() {
    // Arrange
    Double expResult = DoubleUtil.exp(1.0);

    // Act
    Double actualExpResult = DoubleUtil.exp(null);

    // Assert
    assertEquals(2.718281828459045, expResult.doubleValue(), 0.0);
    assertNull(actualExpResult);
  }

  @Test
  public void testOdd() {
    // Arrange
    Boolean actualOddResult = DoubleUtil.odd(1.0);
    Boolean actualOddResult1 = DoubleUtil.odd(null);
    Boolean actualOddResult2 = DoubleUtil.odd(10.0);

    // Act and Assert
    assertTrue(actualOddResult);
    assertNull(actualOddResult1);
    assertFalse(actualOddResult2);
    assertNull(DoubleUtil.odd(0.5));
  }

  @Test
  public void testEven() {
    // Arrange
    Boolean actualEvenResult = DoubleUtil.even(1.0);
    Boolean actualEvenResult1 = DoubleUtil.even(null);

    // Act and Assert
    assertFalse(actualEvenResult);
    assertNull(actualEvenResult1);
    assertTrue(DoubleUtil.even(10.0));
  }

  @Test
  public void testMin() {
    // Arrange, Act and Assert
    assertNull(DoubleUtil.min(null));
  }

  @Test
  public void testMin2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(null);

    // Act and Assert
    assertNull(DoubleUtil.min(objectList));
  }

  @Test
  public void testSum() {
    // Arrange, Act and Assert
    assertNull(DoubleUtil.sum(null));
  }

  @Test
  public void testMean() {
    // Arrange, Act and Assert
    assertNull(DoubleUtil.mean(null));
  }

  @Test
  public void testProduct() {
    // Arrange, Act and Assert
    assertNull(DoubleUtil.product(null));
  }

  @Test
  public void testMedian() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(null);

    // Act and Assert
    assertNull(DoubleUtil.median(objectList));
  }

  @Test
  public void testMedian2() {
    // Arrange, Act and Assert
    assertNull(DoubleUtil.median(null));
  }

  @Test
  public void testStddev() {
    // Arrange, Act and Assert
    assertNull(DoubleUtil.stddev(null));
  }

  @Test
  public void testMode() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(DoubleUtil.mode(objectList));
  }

  @Test
  public void testNumericDivide() {
    // Arrange
    Double numericDivideResult = DoubleUtil.numericDivide(1.0, 1.0);
    Double actualNumericDivideResult = DoubleUtil.numericDivide(null, 1.0);
    Double actualNumericDivideResult1 = DoubleUtil.numericDivide(1.0, 0.0);

    // Act
    Double actualNumericDivideResult2 = DoubleUtil.numericDivide(1.0, null);

    // Assert
    assertEquals(1.0, numericDivideResult.doubleValue(), 0.0);
    assertNull(actualNumericDivideResult);
    assertNull(actualNumericDivideResult1);
    assertNull(actualNumericDivideResult2);
  }
}

