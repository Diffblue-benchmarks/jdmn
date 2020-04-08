package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import org.junit.Test;

public class ConversionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Conversion actualConversion = new Conversion(ConversionKind.NONE, new AnyType());

    // Assert
    assertEquals(ConversionKind.NONE, actualConversion.getKind());
    assertEquals("Conversion(NONE, Any)", actualConversion.toString());
  }

  @Test
  public void testConversionFunction() {
    // Arrange
    Conversion conversion = new Conversion(ConversionKind.NONE, new AnyType());

    // Act and Assert
    assertEquals("asList",
        conversion.conversionFunction(new Conversion(ConversionKind.ELEMENT_TO_LIST, new AnyType()), "asList"));
  }

  @Test
  public void testConversionFunction2() {
    // Arrange
    Conversion conversion = new Conversion(ConversionKind.NONE, new AnyType());

    // Act and Assert
    assertNull(conversion.conversionFunction(new Conversion(ConversionKind.NONE, new AnyType()), "asList"));
  }

  @Test
  public void testConversionFunction3() {
    // Arrange
    Conversion conversion = new Conversion(ConversionKind.NONE, new AnyType());

    // Act and Assert
    assertEquals("this.<asList>asElement",
        conversion.conversionFunction(new Conversion(ConversionKind.LIST_TO_ELEMENT, new AnyType()), "asList"));
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new Conversion(ConversionKind.NONE, new AnyType())).equals("asList"));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new Conversion(ConversionKind.NONE, new AnyType())).equals(null));
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("Conversion(NONE, Any)", (new Conversion(ConversionKind.NONE, new AnyType())).toString());
  }
}

