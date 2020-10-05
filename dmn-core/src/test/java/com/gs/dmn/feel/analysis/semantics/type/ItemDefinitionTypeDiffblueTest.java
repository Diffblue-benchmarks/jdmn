package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ItemDefinitionTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ItemDefinitionType actualItemDefinitionType = new ItemDefinitionType("");

    // Assert
    assertNull(actualItemDefinitionType.getModelName());
    assertFalse(actualItemDefinitionType.isValid());
    assertEquals("", actualItemDefinitionType.getName());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    ItemDefinitionType actualItemDefinitionType = new ItemDefinitionType("", null);

    // Assert
    assertNull(actualItemDefinitionType.getModelName());
    assertFalse(actualItemDefinitionType.isValid());
    assertEquals("", actualItemDefinitionType.getName());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    ItemDefinitionType actualItemDefinitionType = new ItemDefinitionType("tLoan", "literal - arithmetic");

    // Assert
    assertEquals("literal - arithmetic", actualItemDefinitionType.getModelName());
    assertFalse(actualItemDefinitionType.isValid());
    assertEquals("tLoan", actualItemDefinitionType.getName());
  }

  @Test
  public void testConstructor4() {
    // Arrange and Act
    ItemDefinitionType actualItemDefinitionType = new ItemDefinitionType("tLoan", "literal - arithmetic");

    // Assert
    assertEquals("literal - arithmetic", actualItemDefinitionType.getModelName());
    assertFalse(actualItemDefinitionType.isValid());
    assertEquals("tLoan", actualItemDefinitionType.getName());
  }

  @Test
  public void testGetMembers() {
    // Arrange, Act and Assert
    assertEquals(0, (new ItemDefinitionType("")).getMembers().size());
    assertEquals(0, (new ItemDefinitionType("")).getMembers().size());
    assertEquals(0, (new ItemDefinitionType("")).getMembers().size());
  }

  @Test
  public void testConformsTo() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("");

    // Act and Assert
    assertTrue(itemDefinitionType.conformsTo(new ContextType()));
  }

  @Test
  public void testConformsTo2() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("");

    // Act and Assert
    assertTrue(itemDefinitionType.conformsTo(new ContextType()));
  }

  @Test
  public void testConformsTo3() {
    // Arrange
    ItemDefinitionType itemDefinitionType = new ItemDefinitionType("");

    // Act and Assert
    assertTrue(itemDefinitionType.conformsTo(new ContextType()));
  }
}

