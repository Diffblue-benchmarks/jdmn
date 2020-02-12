package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.List;
import org.junit.Test;

public class ImportPathDiffblueTest {
  @Test(timeout=10000)
  public void isEmptyTest3() {
    // Arrange, Act and Assert
    assertFalse(ImportPath.isEmpty("name"));
  }

  @Test(timeout=10000)
  public void isEmptyTest2() {
    // Arrange, Act and Assert
    assertFalse(ImportPath.isEmpty(new ImportPath("foo")));
  }

  @Test(timeout=10000)
  public void isEmptyTest() {
    // Arrange, Act and Assert
    assertFalse((new ImportPath("foo")).isEmpty());
  }

  @Test(timeout=10000)
  public void asStringTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new ImportPath("foo")).asString());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("foo.foo", (new ImportPath(new ImportPath("foo"), "foo")).toString());
  }

  @Test(timeout=10000)
  public void getPathElementsTest() {
    // Arrange and Act
    List<String> actualPathElements = (new ImportPath("foo")).getPathElements();

    // Assert
    assertEquals(1, actualPathElements.size());
    assertEquals("foo", actualPathElements.get(0));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new ImportPath("foo")).toString());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new ImportPath("foo")).toString());
  }
}

