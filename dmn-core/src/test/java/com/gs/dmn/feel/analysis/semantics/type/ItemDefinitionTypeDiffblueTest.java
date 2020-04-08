package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class ItemDefinitionTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ItemDefinitionType actualItemDefinitionType = new ItemDefinitionType("");

    // Assert
    assertEquals("ItemDefinitionType()", actualItemDefinitionType.toString());
    assertEquals("", actualItemDefinitionType.getName());
  }

  @Test
  public void testAddMember() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("");
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act and Assert
    assertSame(itemDefinitionType, itemDefinitionType.addMember("", stringList, new AnyType()));
  }

  @Test
  public void testGetMembers() {
    // Arrange, Act and Assert
    assertEquals(0, (new ItemDefinitionType("")).getMembers().size());
  }

  @Test
  public void testGetMemberType() {
    // Arrange, Act and Assert
    assertNull((new ItemDefinitionType("")).getMemberType(""));
  }

  @Test
  public void testGetAliases() {
    // Arrange, Act and Assert
    assertEquals(0, (new ItemDefinitionType("")).getAliases("").size());
  }

  @Test
  public void testEquivalentTo() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("");

    // Act and Assert
    assertFalse(itemDefinitionType.equivalentTo(new AnyType()));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("");

    // Act and Assert
    assertTrue(itemDefinitionType.equivalentTo(new ContextType()));
  }

  @Test
  public void testEquivalentTo3() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("");
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertFalse(itemDefinitionType.equivalentTo(new ContextType(stringTypeMap)));
  }

  @Test
  public void testEquivalentTo4() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("");

    // Act and Assert
    assertTrue(itemDefinitionType.equivalentTo(new ItemDefinitionType("")));
  }

  @Test
  public void testToContextType() {
    // Arrange, Act and Assert
    assertEquals("ContextType()", (new ItemDefinitionType("")).toContextType().toString());
  }

  @Test
  public void testConformsTo() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("");

    // Act and Assert
    assertFalse(itemDefinitionType.conformsTo(new AnyType()));
  }

  @Test
  public void testConformsTo2() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("");
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertFalse(itemDefinitionType.conformsTo(new ContextType(stringTypeMap)));
  }

  @Test
  public void testConformsTo3() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("");

    // Act and Assert
    assertTrue(itemDefinitionType.conformsTo(new ItemDefinitionType("")));
  }

  @Test
  public void testConformsTo4() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("");

    // Act and Assert
    assertTrue(itemDefinitionType.conformsTo(new ContextType()));
  }

  @Test
  public void testIsValid() {
    // Arrange, Act and Assert
    assertFalse((new ItemDefinitionType("")).isValid());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new ItemDefinitionType("")).equals(null));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new ItemDefinitionType("")).equals(""));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(0, (new ItemDefinitionType("")).hashCode());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("ItemDefinitionType()", (new ItemDefinitionType("")).toString());
  }
}

