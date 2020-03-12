package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import org.junit.Test;

public class ConversionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    Conversion actualConversion = new Conversion(ConversionKind.NONE, new AnyType());

    // Assert
    assertEquals(ConversionKind.NONE, actualConversion.getKind());
    assertEquals("Conversion(NONE, Any)", actualConversion.toString());
  }

  @Test
  public void conversionFunctionTest() {
    // Arrange
    Conversion conversion = new Conversion(ConversionKind.NONE, new AnyType());

    // Act and Assert
    assertEquals("asList",
        conversion.conversionFunction(new Conversion(ConversionKind.ELEMENT_TO_LIST, new AnyType()), "asList"));
  }

  @Test
  public void conversionFunctionTest2() {
    // Arrange
    Conversion conversion = new Conversion(ConversionKind.NONE, new AnyType());

    // Act and Assert
    assertEquals("this.<asList>asElement",
        conversion.conversionFunction(new Conversion(ConversionKind.LIST_TO_ELEMENT, new AnyType()), "asList"));
  }

  @Test
  public void conversionFunctionTest3() {
    // Arrange
    Conversion conversion = new Conversion(ConversionKind.NONE, new AnyType());

    // Act and Assert
    assertNull(conversion.conversionFunction(new Conversion(ConversionKind.NONE, new AnyType()), "asList"));
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Conversion(ConversionKind.NONE, new AnyType())).equals("asList"));
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Conversion(NONE, Any)", (new Conversion(ConversionKind.NONE, new AnyType())).toString());
  }
}

