package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class ItemDefinitionTypeDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ItemDefinitionType("name")).equals("foo"));
  }

  @Test(timeout=10000)
  public void getAliasesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ItemDefinitionType("name")).getAliases("name").size());
  }

  @Test(timeout=10000)
  public void addMemberTest() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("name");

    // Act and Assert
    assertSame(itemDefinitionType, itemDefinitionType.addMember("name", null, new AnyType()));
  }

  @Test(timeout=10000)
  public void isValidTest() {
    // Arrange, Act and Assert
    assertFalse((new ItemDefinitionType("name")).isValid());
  }

  @Test(timeout=10000)
  public void equivalentToTest() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("name");

    // Act and Assert
    assertFalse(itemDefinitionType.equivalentTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ItemDefinitionType actualItemDefinitionType = new ItemDefinitionType("name");

    // Assert
    String actualToStringResult = actualItemDefinitionType.toString();
    assertEquals("ItemDefinitionType()", actualToStringResult);
    assertEquals("name", actualItemDefinitionType.getName());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ItemDefinitionType("name")).hashCode());
  }

  @Test(timeout=10000)
  public void toContextTypeTest() {
    // Arrange, Act and Assert
    assertEquals("ContextType()", (new ItemDefinitionType("name")).toContextType().toString());
  }

  @Test(timeout=10000)
  public void conformsToTest() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("name");

    // Act and Assert
    assertFalse(itemDefinitionType.conformsTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void getMembersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ItemDefinitionType("name")).getMembers().size());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ItemDefinitionType()", (new ItemDefinitionType("name")).toString());
  }

  @Test(timeout=10000)
  public void getMemberTypeTest() {
    // Arrange, Act and Assert
    assertNull((new ItemDefinitionType("name")).getMemberType("foo"));
  }
}

