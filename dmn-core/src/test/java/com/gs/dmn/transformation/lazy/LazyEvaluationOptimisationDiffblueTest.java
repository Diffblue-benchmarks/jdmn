package com.gs.dmn.transformation.lazy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Set;
import org.junit.Test;

public class LazyEvaluationOptimisationDiffblueTest {
  @Test
  public void testIsLazyEvaluated() {
    // Arrange, Act and Assert
    assertFalse((new LazyEvaluationOptimisation()).isLazyEvaluated("'Full Name'"));
    assertFalse((new LazyEvaluationOptimisation()).isLazyEvaluated("'Monthly Salary'"));
    assertFalse((new LazyEvaluationOptimisation()).isLazyEvaluated("'Employment Status'"));
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    Set<String> lazyEvaluatedDecisions = (new LazyEvaluationOptimisation()).getLazyEvaluatedDecisions();
    assertTrue(lazyEvaluatedDecisions instanceof java.util.LinkedHashSet);
    assertEquals(0, lazyEvaluatedDecisions.size());
  }

  @Test
  public void testConstructor2() {
    // Arrange, Act and Assert
    Set<String> lazyEvaluatedDecisions = (new LazyEvaluationOptimisation()).getLazyEvaluatedDecisions();
    assertTrue(lazyEvaluatedDecisions instanceof java.util.LinkedHashSet);
    assertEquals(0, lazyEvaluatedDecisions.size());
  }

  @Test
  public void testConstructor3() {
    // Arrange, Act and Assert
    Set<String> lazyEvaluatedDecisions = (new LazyEvaluationOptimisation()).getLazyEvaluatedDecisions();
    assertTrue(lazyEvaluatedDecisions instanceof java.util.LinkedHashSet);
    assertEquals(0, lazyEvaluatedDecisions.size());
  }
}

