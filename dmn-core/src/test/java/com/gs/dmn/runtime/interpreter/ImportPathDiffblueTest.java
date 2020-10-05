package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ImportPathDiffblueTest {
  @Test
  public void testIsEmpty() {
    // Arrange, Act and Assert
    assertTrue(ImportPath.isEmpty((String) null));
    assertTrue(ImportPath.isEmpty((String) null));
    assertTrue(ImportPath.isEmpty((String) null));
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("[]", (new ImportPath()).toString());
    assertEquals("[]", (new ImportPath()).toString());
    assertEquals("[]", (new ImportPath()).toString());
    assertEquals("[]", (new ImportPath(new ImportPath(), null)).toString());
    assertEquals("[]", (new ImportPath(new ImportPath(), null)).toString());
    assertEquals("[]", (new ImportPath(new ImportPath(), null)).toString());
    assertEquals("[]", (new ImportPath(null)).toString());
    assertEquals("[]", (new ImportPath(null)).toString());
    assertEquals("[]", (new ImportPath(null)).toString());
  }
}

