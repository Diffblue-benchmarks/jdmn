package com.gs.dmn.runtime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ContextDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.Context@0", (new Context()).toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    Context actualContext = new Context("%s%s=%s");

    // Assert
    assertEquals("com.gs.dmn.runtime.Context@0", actualContext.toString());
    assertEquals("%s%s=%s", actualContext.getName());
  }

  @Test
  public void testGet() {
    // Arrange, Act and Assert
    assertNull((new Context()).get("%s%s=%s", "%s%s=%s", "foo", "%s%s=%s"));
  }

  @Test
  public void testGet2() {
    // Arrange, Act and Assert
    assertNull((new Context()).get("%s%s=%s"));
  }

  @Test
  public void testPut() {
    // Arrange
    Context context = new Context();

    // Act and Assert
    assertNull(context.put("%s%s=%s", "%s%s=%s"));
    assertEquals("{%s%s=%s=%s%s=%s}", context.toString());
  }

  @Test
  public void testAdd() {
    // Arrange
    Context context = new Context();

    // Act and Assert
    assertSame(context, context.add("%s%s=%s", "%s%s=%s"));
  }

  @Test
  public void testIsEquivalent() {
    // Arrange, Act and Assert
    assertTrue((new Context()).isEquivalent(new Context()));
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.runtime.Context@0", (new Context()).toString());
  }

  @Test
  public void testKeySet() {
    // Arrange, Act and Assert
    assertEquals(0, (new Context()).keySet().size());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new Context()).equals("%s%s=%s"));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new Context()).equals(null));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(0, (new Context()).hashCode());
  }
}

