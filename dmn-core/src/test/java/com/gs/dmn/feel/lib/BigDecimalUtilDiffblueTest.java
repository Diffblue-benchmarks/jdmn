package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BigDecimalUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void absTest() {
    // Arrange and Act
    BigDecimal actualAbsResult = BigDecimalUtil.abs(BigDecimal.valueOf(1L));

    // Assert
    assertSame(actualAbsResult.ONE, actualAbsResult);
    assertEquals("1", actualAbsResult.toString());
  }

  @Test
  public void ceilingTest() {
    // Arrange and Act
    BigDecimal actualCeilingResult = BigDecimalUtil.ceiling(BigDecimal.valueOf(1L));

    // Assert
    assertSame(actualCeilingResult.ONE, actualCeilingResult);
    assertEquals("1", actualCeilingResult.toString());
  }

  @Test
  public void decimalTest() {
    // Arrange, Act and Assert
    assertEquals("1.0", BigDecimalUtil.decimal(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)).toString());
  }

  @Test
  public void evenTest() {
    // Arrange, Act and Assert
    assertFalse(BigDecimalUtil.even(BigDecimal.valueOf(1L)));
  }

  @Test
  public void evenTest2() {
    // Arrange, Act and Assert
    assertTrue(BigDecimalUtil.even(BigDecimal.valueOf(15834L)));
  }

  @Test
  public void expTest() {
    // Arrange, Act and Assert
    assertEquals("2.718281828459045", BigDecimalUtil.exp(BigDecimal.valueOf(1L)).toString());
  }

  @Test
  public void floorTest() {
    // Arrange and Act
    BigDecimal actualFloorResult = BigDecimalUtil.floor(BigDecimal.valueOf(1L));

    // Assert
    assertSame(actualFloorResult.ONE, actualFloorResult);
    assertEquals("1", actualFloorResult.toString());
  }

  @Test
  public void intModuloTest() {
    // Arrange, Act and Assert
    assertEquals("0", BigDecimalUtil.intModulo(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L)).toString());
  }

  @Test
  public void logTest() {
    // Arrange, Act and Assert
    assertEquals("0.0", BigDecimalUtil.log(BigDecimal.valueOf(1L)).toString());
  }

  @Test
  public void maxTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    BigDecimalUtil.max(objectList);
  }

  @Test
  public void meanTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    BigDecimalUtil.mean(objectList);
  }

  @Test
  public void medianTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    BigDecimalUtil.median(objectList);
  }

  @Test
  public void minTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    BigDecimalUtil.min(objectList);
  }

  @Test
  public void modeTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertNull(BigDecimalUtil.mode(objectList));
  }

  @Test
  public void moduloTest() {
    // Arrange and Act
    BigDecimal actualModuloResult = BigDecimalUtil.modulo(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L));

    // Assert
    assertSame(actualModuloResult.ZERO, actualModuloResult);
    assertEquals("0", actualModuloResult.toString());
  }

  @Test
  public void moduloTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    BigDecimalUtil.modulo(BigDecimal.valueOf(0L), BigDecimal.valueOf(0L));
  }

  @Test
  public void numericDivideTest() {
    // Arrange, Act and Assert
    assertNull(BigDecimalUtil.numericDivide(BigDecimal.valueOf(0L), BigDecimal.valueOf(0L)));
  }

  @Test
  public void numericDivideTest2() {
    // Arrange and Act
    BigDecimal actualNumericDivideResult = BigDecimalUtil.numericDivide(BigDecimal.valueOf(1L), BigDecimal.valueOf(1L));

    // Assert
    assertSame(actualNumericDivideResult.ONE, actualNumericDivideResult);
    assertEquals("1", actualNumericDivideResult.toString());
  }

  @Test
  public void oddTest() {
    // Arrange, Act and Assert
    assertTrue(BigDecimalUtil.odd(BigDecimal.valueOf(1L)));
  }

  @Test
  public void oddTest2() {
    // Arrange, Act and Assert
    assertFalse(BigDecimalUtil.odd(BigDecimal.valueOf(15824L)));
  }

  @Test
  public void productTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    BigDecimalUtil.product(objectList);
  }

  @Test
  public void sqrtTest() {
    // Arrange, Act and Assert
    assertEquals("1.0", BigDecimalUtil.sqrt(BigDecimal.valueOf(1L)).toString());
  }

  @Test
  public void stddevTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    BigDecimalUtil.stddev(objectList);
  }

  @Test
  public void sumTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    thrown.expect(ClassCastException.class);
    BigDecimalUtil.sum(objectList);
  }
}

