package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class ContextTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("ContextType()", (new ContextType()).toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertEquals("ContextType(foo = Any)", (new ContextType(stringTypeMap)).toString());
  }

  @Test
  public void testAddMember() {
    // Arrange
    ContextType contextType = new ContextType();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act and Assert
    assertSame(contextType, contextType.addMember("name", stringList, new AnyType()));
  }

  @Test
  public void testGetMembers() {
    // Arrange, Act and Assert
    assertEquals(0, (new ContextType()).getMembers().size());
  }

  @Test
  public void testGetMemberType() {
    // Arrange, Act and Assert
    assertNull((new ContextType()).getMemberType("key"));
  }

  @Test
  public void testGetAliases() {
    // Arrange, Act and Assert
    assertEquals(0, (new ContextType()).getAliases("name").size());
  }

  @Test
  public void testEquivalentTo() {
    // Arrange
    ContextType contextType = new ContextType();

    // Act and Assert
    assertTrue(contextType.equivalentTo(new ContextType()));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());
    ContextType contextType = new ContextType(stringTypeMap);
    HashMap<String, Type> stringTypeMap1 = new HashMap<String, Type>();
    stringTypeMap1.put("foo", new AnyType());

    // Act and Assert
    assertFalse(contextType.equivalentTo(new ContextType(stringTypeMap1)));
  }

  @Test
  public void testEquivalentTo3() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());
    ItemDefinitionType other = new ItemDefinitionType("");

    // Act and Assert
    assertFalse((new ContextType(stringTypeMap)).equivalentTo(other));
  }

  @Test
  public void testEquivalentTo4() {
    // Arrange
    ItemDefinitionType other = new ItemDefinitionType("");

    // Act and Assert
    assertTrue((new ContextType()).equivalentTo(other));
  }

  @Test
  public void testEquivalentTo5() {
    // Arrange
    ContextType contextType = new ContextType();
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertFalse(contextType.equivalentTo(new ContextType(stringTypeMap)));
  }

  @Test
  public void testEquivalentTo6() {
    // Arrange
    ContextType contextType = new ContextType();

    // Act and Assert
    assertFalse(contextType.equivalentTo(new AnyType()));
  }

  @Test
  public void testConformsTo() {
    // Arrange
    ContextType contextType = new ContextType();

    // Act and Assert
    assertFalse(contextType.conformsTo(new AnyType()));
  }

  @Test
  public void testConformsTo2() {
    // Arrange
    ItemDefinitionType other = new ItemDefinitionType("");

    // Act and Assert
    assertTrue((new ContextType()).conformsTo(other));
  }

  @Test
  public void testConformsTo3() {
    // Arrange
    ContextType contextType = new ContextType();
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertFalse(contextType.conformsTo(new ContextType(stringTypeMap)));
  }

  @Test
  public void testConformsTo4() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());
    ContextType contextType = new ContextType(stringTypeMap);
    HashMap<String, Type> stringTypeMap1 = new HashMap<String, Type>();
    stringTypeMap1.put("foo", new AnyType());

    // Act and Assert
    assertFalse(contextType.conformsTo(new ContextType(stringTypeMap1)));
  }

  @Test
  public void testConformsTo5() {
    // Arrange
    ContextType contextType = new ContextType();

    // Act and Assert
    assertTrue(contextType.conformsTo(new ContextType()));
  }

  @Test
  public void testIsValid() {
    // Arrange, Act and Assert
    assertFalse((new ContextType()).isValid());
  }

  @Test
  public void testIsValid2() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertTrue((new ContextType(stringTypeMap)).isValid());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new ContextType()).equals("o"));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new ContextType()).equals(null));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(0, (new ContextType()).hashCode());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("ContextType()", (new ContextType()).toString());
  }

  @Test
  public void testToString2() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertEquals("ContextType(foo = Any)", (new ContextType(stringTypeMap)).toString());
  }
}

