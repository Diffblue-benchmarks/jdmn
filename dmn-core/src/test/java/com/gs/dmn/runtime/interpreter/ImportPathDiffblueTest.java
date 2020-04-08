package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ImportPathDiffblueTest {
  @Test
  public void testIsEmpty() {
    // Arrange, Act and Assert
    assertFalse((new ImportPath("pathElement")).isEmpty());
  }

  @Test
  public void testIsEmpty2() {
    // Arrange, Act and Assert
    assertTrue(ImportPath.isEmpty((ImportPath) null));
  }

  @Test
  public void testIsEmpty3() {
    // Arrange, Act and Assert
    assertTrue(ImportPath.isEmpty(new ImportPath(null)));
  }

  @Test
  public void testIsEmpty4() {
    // Arrange, Act and Assert
    assertFalse(ImportPath.isEmpty(new ImportPath("pathElement")));
  }

  @Test
  public void testIsEmpty5() {
    // Arrange, Act and Assert
    assertFalse(ImportPath.isEmpty("importName"));
  }

  @Test
  public void testConstructor() {
    // Arrange
    ImportPath importPath = new ImportPath("pathElement");

    // Act
    ImportPath actualImportPath = new ImportPath("");

    // Assert
    assertEquals("pathElement", importPath.toString());
    assertEquals("", actualImportPath.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange, Act and Assert
    assertEquals("pathElement", (new ImportPath(new ImportPath("pathElement"), null)).toString());
  }

  @Test
  public void testConstructor3() {
    // Arrange, Act and Assert
    assertEquals("pathElement", (new ImportPath(null, "pathElement")).toString());
  }

  @Test
  public void testConstructor4() {
    // Arrange, Act and Assert
    assertEquals("pathElement.pathElement", (new ImportPath(new ImportPath("pathElement"), "pathElement")).toString());
  }

  @Test
  public void testAsString() {
    // Arrange, Act and Assert
    assertEquals("pathElement", (new ImportPath("pathElement")).asString());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("pathElement", (new ImportPath("pathElement")).toString());
  }
}

