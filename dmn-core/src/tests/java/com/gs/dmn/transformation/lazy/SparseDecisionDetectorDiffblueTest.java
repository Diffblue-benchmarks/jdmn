package com.gs.dmn.transformation.lazy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.log.NopBuildLogger;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDecisionTable;

public class SparseDecisionDetectorDiffblueTest {
  @Test(timeout=10000)
  public void isSparseDecisionTableTest() {
    // Arrange
    SparseDecisionDetector sparseDecisionDetector = new SparseDecisionDetector();

    // Act and Assert
    assertFalse(sparseDecisionDetector.isSparseDecisionTable(new TDecisionTable(), 10.0));
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    SparseDecisionDetector actualSparseDecisionDetector = new SparseDecisionDetector();

    // Assert
    assertTrue(actualSparseDecisionDetector.logger instanceof com.gs.dmn.log.Slf4jBuildLogger);
    assertNull(actualSparseDecisionDetector.inputParameters);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    SparseDecisionDetector actualSparseDecisionDetector = new SparseDecisionDetector(null, new NopBuildLogger());

    // Assert
    assertTrue(actualSparseDecisionDetector.logger instanceof NopBuildLogger);
    assertNull(actualSparseDecisionDetector.inputParameters);
  }
}

