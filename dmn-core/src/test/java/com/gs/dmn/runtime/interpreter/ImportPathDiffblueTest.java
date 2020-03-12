package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ImportPathDiffblueTest {
  @Test
  public void asStringTest() {
    // Arrange, Act and Assert
    assertEquals("pathElement", (new ImportPath("pathElement")).asString());
  }

  @Test
  public void constructorTest() {
    // Arrange
    ImportPath importPath = new ImportPath("pathElement");

    // Act
    ImportPath actualImportPath = new ImportPath("");

    // Assert
    assertEquals("pathElement", importPath.toString());
    assertEquals("", actualImportPath.toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("pathElement.pathElement", (new ImportPath(new ImportPath("pathElement"), "pathElement")).toString());
  }

  @Test
  public void constructorTest3() {
    // Arrange, Act and Assert
    assertEquals("pathElement", (new ImportPath(new ImportPath("pathElement"), "")).toString());
  }

  @Test
  public void isEmptyTest() {
    // Arrange, Act and Assert
    assertFalse((new ImportPath("pathElement")).isEmpty());
  }

  @Test
  public void isEmptyTest2() {
    // Arrange, Act and Assert
    assertFalse(ImportPath.isEmpty(new ImportPath("pathElement")));
  }

  @Test
  public void isEmptyTest3() {
    // Arrange, Act and Assert
    assertTrue(ImportPath.isEmpty(new ImportPath("")));
  }

  @Test
  public void isEmptyTest4() {
    // Arrange, Act and Assert
    assertFalse(ImportPath.isEmpty("importName"));
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("pathElement", (new ImportPath("pathElement")).toString());
  }
}

