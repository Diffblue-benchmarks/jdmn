package com.gs.dmn.runtime.annotation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class AnnotationDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Annotation actualAnnotation = new Annotation("decisionName", 1, "annotation");

    // Assert
    assertEquals("decisionName", actualAnnotation.getDecisionName());
    assertEquals(1, actualAnnotation.getRuleIndex());
    assertEquals("annotation", actualAnnotation.getAnnotation());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new Annotation("decisionName", 1, "annotation")).equals(null));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new Annotation("decisionName", 1, "annotation")).equals("o"));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(-530074091, (new Annotation("decisionName", 1, "annotation")).hashCode());
  }

  @Test
  public void testHashCode2() {
    // Arrange, Act and Assert
    assertEquals(-1555043506, (new Annotation(null, 1, "annotation")).hashCode());
  }

  @Test
  public void testHashCode3() {
    // Arrange, Act and Assert
    assertEquals(1024969446, (new Annotation("decisionName", 1, null)).hashCode());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("Annotation('decisionName', 1, 'annotation')",
        (new Annotation("decisionName", 1, "annotation")).toString());
  }
}

