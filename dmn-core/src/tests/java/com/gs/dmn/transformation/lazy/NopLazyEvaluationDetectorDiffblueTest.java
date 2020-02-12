package com.gs.dmn.transformation.lazy;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class NopLazyEvaluationDetectorDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    NopLazyEvaluationDetector actualNopLazyEvaluationDetector = new NopLazyEvaluationDetector();

    // Assert
    assertTrue(actualNopLazyEvaluationDetector.logger instanceof com.gs.dmn.log.Slf4jBuildLogger);
    assertNull(actualNopLazyEvaluationDetector.inputParameters);
  }
}

