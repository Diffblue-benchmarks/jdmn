package com.gs.dmn.transformation;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.runtime.Pair;
import org.junit.Test;

public class CompositeDMNTransformerDiffblueTest {
  @Test(timeout=10000)
  public void transformTest2() {
    // Arrange
    CompositeDMNTransformer<Object> compositeDMNTransformer = new CompositeDMNTransformer<Object>(null);
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act
    Pair<DMNModelRepository, Object> actualTransformResult = compositeDMNTransformer.transform(dmnModelRepository,
        "foo");

    // Assert
    DMNModelRepository actualLeft = actualTransformResult.getLeft();
    assertTrue(actualTransformResult.getRight() instanceof String);
    assertSame(dmnModelRepository, actualLeft);
  }

  @Test(timeout=10000)
  public void transformTest() {
    // Arrange
    CompositeDMNTransformer<Object> compositeDMNTransformer = new CompositeDMNTransformer<Object>(null);
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertSame(dmnModelRepository, compositeDMNTransformer.transform(dmnModelRepository));
  }
}

