package com.gs.dmn.transformation.lazy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDecisionTable;

public class SparseDecisionDetectorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    SparseDecisionDetector actualSparseDecisionDetector = new SparseDecisionDetector();

    // Assert
    assertTrue(actualSparseDecisionDetector.logger instanceof com.gs.dmn.log.Slf4jBuildLogger);
    assertNull(actualSparseDecisionDetector.inputParameters);
  }

  @Test
  public void testIsSparseDecisionTable() {
    // Arrange
    SparseDecisionDetector sparseDecisionDetector = new SparseDecisionDetector();

    // Act and Assert
    assertFalse(sparseDecisionDetector.isSparseDecisionTable(new TDecisionTable(), 0.0));
  }
}

