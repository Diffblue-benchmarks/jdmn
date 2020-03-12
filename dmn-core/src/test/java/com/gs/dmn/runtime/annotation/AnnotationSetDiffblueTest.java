package com.gs.dmn.runtime.annotation;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class AnnotationSetDiffblueTest {
  @Test
  public void addAnnotationTest() {
    // Arrange
    Annotation param0 = new Annotation("decisionName", 1, "annotation");
    AnnotationSet annotationSet = new AnnotationSet();
    annotationSet.add(param0);

    // Act
    annotationSet.addAnnotation("decisionName", 1, "annotation");

    // Assert
    Annotation getResult = annotationSet.get(1);
    assertEquals(1, getResult.getRuleIndex());
    assertEquals("annotation", getResult.getAnnotation());
    assertEquals("decisionName", getResult.getDecisionName());
  }

  @Test
  public void addAnnotationTest2() {
    // Arrange
    Annotation param0 = new Annotation("decisionName", 1, "annotation");
    AnnotationSet annotationSet = new AnnotationSet();
    annotationSet.add(param0);
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("decisionName");

    // Act
    annotationSet.addAnnotation("decisionName", 1, stringList);

    // Assert
    Annotation getResult = annotationSet.get(1);
    assertEquals(1, getResult.getRuleIndex());
    assertEquals("decisionName", getResult.getAnnotation());
    assertEquals("decisionName", getResult.getDecisionName());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new AnnotationSet()).size());
  }

  @Test
  public void toSetTest() {
    // Arrange
    Annotation param0 = new Annotation("decisionName", 1, "annotation");
    AnnotationSet annotationSet = new AnnotationSet();
    annotationSet.add(param0);

    // Act and Assert
    assertEquals(1, annotationSet.toSet().size());
  }
}

