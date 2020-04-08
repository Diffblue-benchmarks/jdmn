package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class NamedParameterTypesDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("NamedParameterTypes()", (new NamedParameterTypes(null)).toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertEquals(1, (new NamedParameterTypes(stringTypeMap)).size());
  }

  @Test
  public void testSize() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertEquals(1, (new NamedParameterTypes(stringTypeMap)).size());
  }

  @Test
  public void testCompatible() {
    // Arrange
    NamedParameterTypes namedParameterTypes = new NamedParameterTypes(null);
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("name", new AnyType()));

    // Act and Assert
    assertFalse(namedParameterTypes.compatible(formalParameterList));
  }

  @Test
  public void testCandidates() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertEquals(0, (new NamedParameterTypes(stringTypeMap)).candidates().size());
  }

  @Test
  public void testGetType() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertNull((new NamedParameterTypes(stringTypeMap)).getType("name"));
  }

  @Test
  public void testEquals() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertFalse((new NamedParameterTypes(stringTypeMap)).equals(null));
  }

  @Test
  public void testEquals2() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertFalse((new NamedParameterTypes(stringTypeMap)).equals("o"));
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("NamedParameterTypes()", (new NamedParameterTypes(null)).toString());
  }

  @Test
  public void testToString2() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertEquals("NamedParameterTypes(foo : Any)", (new NamedParameterTypes(stringTypeMap)).toString());
  }
}

