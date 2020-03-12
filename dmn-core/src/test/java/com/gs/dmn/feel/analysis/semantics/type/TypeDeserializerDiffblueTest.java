package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TypeDeserializerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void deserializeTest() {
    // Arrange and Act
    Type actualDeserializeResult = (new TypeDeserializer()).deserialize("FEELFunctionType");

    // Assert
    List<Type> expectedParameterTypes = ((FunctionType) actualDeserializeResult).parameterTypes;
    List<Type> actualParameterTypes = ((FEELFunctionType) actualDeserializeResult).getParameterTypes();
    assertEquals("FEELFunctionType(, null, false)", actualDeserializeResult.toString());
    assertSame(expectedParameterTypes, actualParameterTypes);
    assertNull(((FEELFunctionType) actualDeserializeResult).getFunctionDefinition());
    assertNull(((FEELFunctionType) actualDeserializeResult).getReturnType());
    assertFalse(((FEELFunctionType) actualDeserializeResult).isExternal());
  }

  @Test
  public void deserializeTest10() {
    // Arrange, Act and Assert
    assertEquals("RangeType(number)", (new TypeDeserializer()).deserialize("RangeType").toString());
  }

  @Test
  public void deserializeTest11() {
    // Arrange, Act and Assert
    assertEquals("TupleType()", (new TypeDeserializer()).deserialize("TupleType").toString());
  }

  @Test
  public void deserializeTest12() {
    // Arrange, Act and Assert
    thrown.expect(NoSuchElementException.class);
    (new TypeDeserializer()).deserialize("(,=)");
  }

  @Test
  public void deserializeTest2() {
    // Arrange and Act
    Type actualDeserializeResult = (new TypeDeserializer()).deserialize("ItemDefinitionType");

    // Assert
    String actualName = ((ItemDefinitionType) actualDeserializeResult).getName();
    assertEquals("ItemDefinitionType()", actualDeserializeResult.toString());
    assertEquals("", actualName);
  }

  @Test
  public void deserializeTest3() {
    // Arrange and Act
    Type actualDeserializeResult = (new TypeDeserializer()).deserialize("enumeration");

    // Assert
    assertSame(((EnumerationType) actualDeserializeResult).ENUMERATION, actualDeserializeResult);
  }

  @Test
  public void deserializeTest4() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new TypeDeserializer()).deserialize("FormalParameter");
  }

  @Test
  public void deserializeTest5() {
    // Arrange, Act and Assert
    assertEquals("ContextType()", (new TypeDeserializer()).deserialize("ContextType").toString());
  }

  @Test
  public void deserializeTest6() {
    // Arrange, Act and Assert
    assertTrue((new TypeDeserializer()).deserialize("ListType").isValid());
  }

  @Test
  public void deserializeTest7() {
    // Arrange and Act
    Type actualDeserializeResult = (new TypeDeserializer()).deserialize("NullType");

    // Assert
    assertSame(((NullType) actualDeserializeResult).NULL, actualDeserializeResult);
  }

  @Test
  public void deserializeTest8() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new TypeDeserializer()).deserialize("text");
  }

  @Test
  public void deserializeTest9() {
    // Arrange, Act and Assert
    thrown.expect(NoSuchElementException.class);
    (new TypeDeserializer()).deserialize("");
  }
}

