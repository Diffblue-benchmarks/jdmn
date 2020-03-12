package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PositionalParameterConversionsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("PositionalParameterConversions([])", (new PositionalParameterConversions()).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange
    ArrayList<Type> typeList = new ArrayList<Type>();
    typeList.add(new AnyType());

    // Act
    PositionalParameterConversions actualPositionalParameterConversions = new PositionalParameterConversions(typeList);

    // Assert
    assertEquals("PositionalParameterConversions([Conversion(NONE," + " Any)])",
        actualPositionalParameterConversions.toString());
    Conversion getResult = actualPositionalParameterConversions.getConversions().get(0);
    assertEquals(ConversionKind.NONE, getResult.getKind());
    assertEquals("Conversion(NONE, Any)", getResult.toString());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new PositionalParameterConversions()).equals("o"));
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(32, (new PositionalParameterConversions()).hashCode());
  }

  @Test
  public void setTest() {
    // Arrange
    PositionalParameterConversions positionalParameterConversions = new PositionalParameterConversions();

    // Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    positionalParameterConversions.set(1, new Conversion(ConversionKind.NONE, new AnyType()));
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("PositionalParameterConversions([])", (new PositionalParameterConversions()).toString());
  }
}

