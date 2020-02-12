package com.gs.dmn.runtime.annotation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class AnnotationDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Annotation("name", 1, "foo")).equals("foo"));
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-1052733264, (new Annotation("name", 1, "foo")).hashCode());
  }

  @Test(timeout=10000)
  public void getRuleIndexTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new Annotation("name", 1, "foo")).getRuleIndex());
  }

  @Test(timeout=10000)
  public void getAnnotationTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new Annotation("name", 1, "foo")).getAnnotation());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Annotation actualAnnotation = new Annotation("name", 1, "foo");

    // Assert
    String actualDecisionName = actualAnnotation.getDecisionName();
    String actualAnnotation1 = actualAnnotation.getAnnotation();
    assertEquals("name", actualDecisionName);
    assertEquals(1, actualAnnotation.getRuleIndex());
    assertEquals("foo", actualAnnotation1);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Annotation('name', 1, 'foo')", (new Annotation("name", 1, "foo")).toString());
  }

  @Test(timeout=10000)
  public void getDecisionNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new Annotation("name", 1, "foo")).getDecisionName());
  }
}

