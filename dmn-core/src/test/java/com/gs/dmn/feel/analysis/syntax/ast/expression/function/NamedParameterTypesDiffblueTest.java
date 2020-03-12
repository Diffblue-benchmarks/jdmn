package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import java.util.HashMap;
import org.junit.Test;

public class NamedParameterTypesDiffblueTest {
  @Test
  public void candidatesTest() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertEquals(0, (new NamedParameterTypes(stringTypeMap)).candidates().size());
  }

  @Test
  public void constructorTest() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertEquals(1, (new NamedParameterTypes(stringTypeMap)).size());
  }

  @Test
  public void equalsTest() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertFalse((new NamedParameterTypes(stringTypeMap)).equals("o"));
  }

  @Test
  public void getTypeTest() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertNull((new NamedParameterTypes(stringTypeMap)).getType("name"));
  }

  @Test
  public void sizeTest() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertEquals(1, (new NamedParameterTypes(stringTypeMap)).size());
  }

  @Test
  public void toStringTest() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertEquals("NamedParameterTypes(foo : Any)", (new NamedParameterTypes(stringTypeMap)).toString());
  }
}

