package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PositionalParameterConversionsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new PositionalParameterConversions()).equals("foo"));
  }

  @Test(timeout=10000)
  public void getConversionsTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new PositionalParameterConversions()).getConversions(null).size());
  }

  @Test(timeout=10000)
  public void getConversionsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PositionalParameterConversions()).getConversions().size());
  }

  @Test(timeout=10000)
  public void setTest() {
    // Arrange
    PositionalParameterConversions positionalParameterConversions = new PositionalParameterConversions();

    // Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    positionalParameterConversions.set(1, new Conversion(ConversionKind.NONE, new AnyType()));
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(32, (new PositionalParameterConversions()).hashCode());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("PositionalParameterConversions([])", (new PositionalParameterConversions()).toString());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("PositionalParameterConversions([])", (new PositionalParameterConversions()).toString());
  }
}

