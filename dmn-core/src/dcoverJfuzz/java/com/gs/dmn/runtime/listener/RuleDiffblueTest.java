package com.gs.dmn.runtime.listener;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RuleDiffblueTest {
  @Test(timeout=10000)
  public void getIndexTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new Rule(1, "foo")).getIndex());
  }

  @Test(timeout=10000)
  public void getAnnotationTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new Rule(1, "foo")).getAnnotation());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Rule actualRule = new Rule(1, "foo");

    // Assert
    String actualAnnotation = actualRule.getAnnotation();
    assertEquals("foo", actualAnnotation);
    assertEquals(1, actualRule.getIndex());
  }
}

