package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import org.junit.Test;

public class ConversionDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Conversion(ConversionKind.NONE, new AnyType())).equals("foo"));
  }

  @Test(timeout=10000)
  public void getTargetTypeTest() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act and Assert
    assertSame(anyType, (new Conversion(ConversionKind.NONE, anyType)).getTargetType());
  }

  @Test(timeout=10000)
  public void conversionFunctionTest() {
    // Arrange
    Conversion conversion = new Conversion(ConversionKind.NONE, new AnyType());

    // Act and Assert
    assertNull(conversion.conversionFunction(new Conversion(ConversionKind.NONE, new AnyType()), "foo"));
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Conversion(NONE, Any)", (new Conversion(ConversionKind.NONE, new AnyType())).toString());
  }

  @Test(timeout=10000)
  public void getKindTest() {
    // Arrange, Act and Assert
    assertEquals(ConversionKind.NONE, (new Conversion(ConversionKind.NONE, new AnyType())).getKind());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Conversion actualConversion = new Conversion(ConversionKind.NONE, new AnyType());

    // Assert
    ConversionKind actualKind = actualConversion.getKind();
    assertEquals(ConversionKind.NONE, actualKind);
    assertEquals("Conversion(NONE, Any)", actualConversion.toString());
  }
}

