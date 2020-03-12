package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import org.junit.Test;

public class ItemDefinitionTypeDiffblueTest {
  @Test
  public void addMemberTest() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("");
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act and Assert
    assertSame(itemDefinitionType, itemDefinitionType.addMember("", stringList, new AnyType()));
  }

  @Test
  public void conformsToTest() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("");

    // Act and Assert
    assertFalse(itemDefinitionType.conformsTo(new AnyType()));
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ItemDefinitionType actualItemDefinitionType = new ItemDefinitionType("");

    // Assert
    assertEquals("ItemDefinitionType()", actualItemDefinitionType.toString());
    assertEquals("", actualItemDefinitionType.getName());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ItemDefinitionType("")).equals(""));
  }

  @Test
  public void equivalentToTest() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("");

    // Act and Assert
    assertFalse(itemDefinitionType.equivalentTo(new AnyType()));
  }

  @Test
  public void getAliasesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ItemDefinitionType("")).getAliases("").size());
  }

  @Test
  public void getMemberTypeTest() {
    // Arrange, Act and Assert
    assertNull((new ItemDefinitionType("")).getMemberType(""));
  }

  @Test
  public void getMembersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ItemDefinitionType("")).getMembers().size());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ItemDefinitionType("")).hashCode());
  }

  @Test
  public void isValidTest() {
    // Arrange, Act and Assert
    assertFalse((new ItemDefinitionType("")).isValid());
  }

  @Test
  public void toContextTypeTest() {
    // Arrange, Act and Assert
    assertEquals("ContextType()", (new ItemDefinitionType("")).toContextType().toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ItemDefinitionType()", (new ItemDefinitionType("")).toString());
  }
}

