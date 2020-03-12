package com.gs.dmn.transformation.lazy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.log.NopBuildLogger;
import java.util.HashMap;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDecisionTable;

public class SparseDecisionDetectorDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    NopBuildLogger nopBuildLogger = new NopBuildLogger();

    // Act
    SparseDecisionDetector actualSparseDecisionDetector = new SparseDecisionDetector(stringStringMap, nopBuildLogger);

    // Assert
    assertSame(nopBuildLogger, actualSparseDecisionDetector.logger);
    assertSame(stringStringMap, actualSparseDecisionDetector.inputParameters);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    SparseDecisionDetector actualSparseDecisionDetector = new SparseDecisionDetector();

    // Assert
    assertTrue(actualSparseDecisionDetector.logger instanceof com.gs.dmn.log.Slf4jBuildLogger);
    assertNull(actualSparseDecisionDetector.inputParameters);
  }

  @Test
  public void isSparseDecisionTableTest() {
    // Arrange
    SparseDecisionDetector sparseDecisionDetector = new SparseDecisionDetector();

    // Act and Assert
    assertFalse(sparseDecisionDetector.isSparseDecisionTable(new TDecisionTable(), 1.0));
  }
}

