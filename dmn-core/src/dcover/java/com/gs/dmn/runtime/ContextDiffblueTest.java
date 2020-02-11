package com.gs.dmn.runtime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ContextDiffblueTest {
  @Test(timeout=10000)
  public void putTest() {
    // Arrange
    Context context = new Context();

    // Act and Assert
    assertNull(context.put("foo", "value"));
    assertEquals("{foo=value}", context.toString());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    Context actualContext = new Context("name");

    // Assert
    String actualName = actualContext.getName();
    assertEquals("com.gs.dmn.runtime.Context@0", actualContext.toString());
    assertEquals("name", actualName);
  }

  @Test(timeout=10000)
  public void keySetTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Context()).keySet().size());
  }

  @Test(timeout=10000)
  public void addTest() {
    // Arrange
    Context context = new Context();

    // Act and Assert
    assertSame(context, context.add("foo", "value"));
  }

  @Test(timeout=10000)
  public void isEquivalentTest() {
    // Arrange
    Context context = new Context();

    // Act and Assert
    assertTrue(context.isEquivalent(new Context()));
  }

  @Test(timeout=10000)
  public void getBindingsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Context()).getBindings().size());
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Context()).equals("foo"));
  }

  @Test(timeout=10000)
  public void getTest2() {
    // Arrange, Act and Assert
    assertNull((new Context()).get("name"));
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Context()).hashCode());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.Context@0", (new Context()).toString());
  }

  @Test(timeout=10000)
  public void getTest() {
    // Arrange, Act and Assert
    assertNull((new Context()).get("name", "name", "foo", "name"));
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.Context@0", (new Context()).toString());
  }

  @Test(timeout=10000)
  public void getNameTest() {
    // Arrange, Act and Assert
    assertNull((new Context()).getName());
  }
}

