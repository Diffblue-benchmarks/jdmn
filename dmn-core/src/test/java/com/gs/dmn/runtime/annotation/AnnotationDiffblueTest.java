package com.gs.dmn.runtime.annotation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class AnnotationDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    Annotation actualAnnotation = new Annotation("decisionName", 1, "annotation");

    // Assert
    assertEquals("decisionName", actualAnnotation.getDecisionName());
    assertEquals(1, actualAnnotation.getRuleIndex());
    assertEquals("annotation", actualAnnotation.getAnnotation());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Annotation("decisionName", 1, "annotation")).equals("o"));
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-530074091, (new Annotation("decisionName", 1, "annotation")).hashCode());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("Annotation('decisionName', 1, 'annotation')",
        (new Annotation("decisionName", 1, "annotation")).toString());
  }
}

