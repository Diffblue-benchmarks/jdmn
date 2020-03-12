package com.gs.dmn.transformation.lazy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Set;
import org.junit.Test;

public class LazyEvaluationOptimisationDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    Set<String> lazyEvaluatedDecisions = (new LazyEvaluationOptimisation()).getLazyEvaluatedDecisions();
    assertTrue(lazyEvaluatedDecisions instanceof java.util.LinkedHashSet);
    assertEquals(0, lazyEvaluatedDecisions.size());
  }

  @Test
  public void isLazyEvaluatedTest() {
    // Arrange, Act and Assert
    assertFalse((new LazyEvaluationOptimisation()).isLazyEvaluated("name"));
  }
}

