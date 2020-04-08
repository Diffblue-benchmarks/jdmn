package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.junit.Test;

public class BigDecimalUtilDiffblueTest {
  @Test
  public void testDecimal() {
    // Arrange, Act and Assert
    assertEquals("1.0", BigDecimalUtil.decimal(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)).toString());
  }

  @Test
  public void testFloor() {
    // Arrange and Act
    BigDecimal actualFloorResult = BigDecimalUtil.floor(BigDecimal.valueOf(1L));

    // Assert
    assertSame(actualFloorResult.ONE, actualFloorResult);
    assertEquals("1", actualFloorResult.toString());
  }

  @Test
  public void testCeiling() {
    // Arrange and Act
    BigDecimal actualCeilingResult = BigDecimalUtil.ceiling(BigDecimal.valueOf(1L));

    // Assert
    assertSame(actualCeilingResult.ONE, actualCeilingResult);
    assertEquals("1", actualCeilingResult.toString());
  }

  @Test
  public void testAbs() {
    // Arrange and Act
    BigDecimal actualAbsResult = BigDecimalUtil.abs(BigDecimal.valueOf(1L));

    // Assert
    assertSame(actualAbsResult.ONE, actualAbsResult);
    assertEquals("1", actualAbsResult.toString());
  }

  @Test
  public void testIntModulo() {
    // Arrange, Act and Assert
    assertEquals("0", BigDecimalUtil.intModulo(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)).toString());
  }

  @Test
  public void testModulo() {
    // Arrange and Act
    BigDecimal actualModuloResult = BigDecimalUtil.modulo(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L));

    // Assert
    assertSame(actualModuloResult.ZERO, actualModuloResult);
    assertEquals("0", actualModuloResult.toString());
  }

  @Test
  public void testSqrt() {
    // Arrange, Act and Assert
    assertEquals("1.0", BigDecimalUtil.sqrt(BigDecimal.valueOf(1L)).toString());
  }

  @Test
  public void testLog() {
    // Arrange, Act and Assert
    assertEquals("0.0", BigDecimalUtil.log(BigDecimal.valueOf(1L)).toString());
  }

  @Test
  public void testExp() {
    // Arrange, Act and Assert
    assertEquals("2.718281828459045", BigDecimalUtil.exp(BigDecimal.valueOf(1L)).toString());
  }

  @Test
  public void testOdd() {
    // Arrange, Act and Assert
    assertTrue(BigDecimalUtil.odd(BigDecimal.valueOf(1L)));
  }

  @Test
  public void testOdd2() {
    // Arrange, Act and Assert
    assertFalse(BigDecimalUtil.odd(BigDecimal.valueOf(0L)));
  }

  @Test
  public void testEven() {
    // Arrange, Act and Assert
    assertTrue(BigDecimalUtil.even(BigDecimal.valueOf(0L)));
  }

  @Test
  public void testEven2() {
    // Arrange, Act and Assert
    assertFalse(BigDecimalUtil.even(BigDecimal.valueOf(1L)));
  }

  @Test
  public void testMin() {
    // Arrange, Act and Assert
    assertNull(BigDecimalUtil.min(null));
  }

  @Test
  public void testMin2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(null);

    // Act and Assert
    assertNull(BigDecimalUtil.min(objectList));
  }

  @Test
  public void testMax() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(null);

    // Act and Assert
    assertNull(BigDecimalUtil.max(objectList));
  }

  @Test
  public void testMax2() {
    // Arrange, Act and Assert
    assertNull(BigDecimalUtil.max(null));
  }

  @Test
  public void testSum() {
    // Arrange, Act and Assert
    assertNull(BigDecimalUtil.sum(null));
  }

  @Test
  public void testMean() {
    // Arrange, Act and Assert
    assertNull(BigDecimalUtil.mean(null));
  }

  @Test
  public void testProduct() {
    // Arrange, Act and Assert
    assertNull(BigDecimalUtil.product(null));
  }

  @Test
  public void testMedian() {
    // Arrange, Act and Assert
    assertNull(BigDecimalUtil.median(null));
  }

  @Test
  public void testMedian2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add(null);

    // Act and Assert
    assertNull(BigDecimalUtil.median(objectList));
  }

  @Test
  public void testStddev() {
    // Arrange, Act and Assert
    assertNull(BigDecimalUtil.stddev(null));
  }

  @Test
  public void testMode() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(BigDecimalUtil.mode(objectList));
  }

  @Test
  public void testMode2() {
    // Arrange, Act and Assert
    assertNull(BigDecimalUtil.mode(null));
  }

  @Test
  public void testNumericDivide() {
    // Arrange, Act and Assert
    assertNull(BigDecimalUtil.numericDivide(BigDecimal.valueOf(0L), BigDecimal.valueOf(0L)));
  }

  @Test
  public void testNumericDivide2() {
    // Arrange and Act
    BigDecimal actualNumericDivideResult = BigDecimalUtil.numericDivide(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L));

    // Assert
    assertSame(actualNumericDivideResult.ONE, actualNumericDivideResult);
    assertEquals("1", actualNumericDivideResult.toString());
  }
}

