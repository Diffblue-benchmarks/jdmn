package com.gs.dmn.runtime.annotation;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AnnotationSetDiffblueTest {
  @Test(timeout=10000)
  public void toSetTest() {
    // Arrange
    AnnotationSet annotationSet = new AnnotationSet();
    annotationSet.add(new Annotation("name", 1, "foo"));

    // Act and Assert
    assertEquals(1, annotationSet.toSet().size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new AnnotationSet()).size());
  }

  @Test(timeout=10000)
  public void addAnnotationTest() {
    // Arrange
    AnnotationSet annotationSet = new AnnotationSet();
    annotationSet.add(new Annotation("name", 1, "foo"));

    // Act
    annotationSet.addAnnotation("name", 1, "foo");

    // Assert
    Annotation getResult = annotationSet.get(1);
    String actualDecisionName = getResult.getDecisionName();
    String actualAnnotation = getResult.getAnnotation();
    assertEquals(1, getResult.getRuleIndex());
    assertEquals("foo", actualAnnotation);
    assertEquals("name", actualDecisionName);
  }
}

