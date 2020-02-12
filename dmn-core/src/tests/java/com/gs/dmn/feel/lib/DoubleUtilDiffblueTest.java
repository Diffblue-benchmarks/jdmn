package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DoubleUtilDiffblueTest {
  @Test(timeout=10000)
  public void logTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(2.302585092994046), DoubleUtil.log(Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void expTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(22026.465794806718), DoubleUtil.exp(Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void intModuloTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(0.0), DoubleUtil.intModulo(Double.valueOf(10.0), Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void evenTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), DoubleUtil.even(Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void sqrtTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(3.1622776601683795), DoubleUtil.sqrt(Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void stddevTest() {
    // Arrange, Act and Assert
    assertNull(DoubleUtil.stddev(null));
  }

  @Test(timeout=10000)
  public void productTest() {
    // Arrange, Act and Assert
    assertNull(DoubleUtil.product(null));
  }

  @Test(timeout=10000)
  public void sumTest() {
    // Arrange, Act and Assert
    assertNull(DoubleUtil.sum(null));
  }

  @Test(timeout=10000)
  public void floorTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(10.0), DoubleUtil.floor(Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void modeTest() {
    // Arrange, Act and Assert
    assertNull(DoubleUtil.mode(null));
  }

  @Test(timeout=10000)
  public void medianTest() {
    // Arrange, Act and Assert
    assertNull(DoubleUtil.median(null));
  }

  @Test(timeout=10000)
  public void numericDivideTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(1.0), DoubleUtil.numericDivide(Double.valueOf(10.0), Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void ceilingTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(10.0), DoubleUtil.ceiling(Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void absTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(10.0), DoubleUtil.abs(Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void minTest() {
    // Arrange, Act and Assert
    assertNull(DoubleUtil.min(null));
  }

  @Test(timeout=10000)
  public void decimalTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(10.0), DoubleUtil.decimal(Double.valueOf(10.0), Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void meanTest() {
    // Arrange, Act and Assert
    assertNull(DoubleUtil.mean(null));
  }

  @Test(timeout=10000)
  public void oddTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(false), DoubleUtil.odd(Double.valueOf(10.0)));
  }

  @Test(timeout=10000)
  public void moduloTest() {
    // Arrange, Act and Assert
    assertEquals(Double.valueOf(0.0), DoubleUtil.modulo(Double.valueOf(10.0), Double.valueOf(10.0)));
  }
}

