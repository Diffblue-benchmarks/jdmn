package com.gs.dmn.transformation;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.runtime.Pair;
import org.junit.Test;

public class NopDMNTransformerDiffblueTest {
  @Test(timeout=10000)
  public void transformTest2() {
    // Arrange
    NopDMNTransformer<Object> nopDMNTransformer = new NopDMNTransformer<Object>();
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act
    Pair<DMNModelRepository, Object> actualTransformResult = nopDMNTransformer.transform(dmnModelRepository, "foo");

    // Assert
    DMNModelRepository actualLeft = actualTransformResult.getLeft();
    assertTrue(actualTransformResult.getRight() instanceof String);
    assertSame(dmnModelRepository, actualLeft);
  }

  @Test(timeout=10000)
  public void transformTest() {
    // Arrange
    NopDMNTransformer<Object> nopDMNTransformer = new NopDMNTransformer<Object>();
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertSame(dmnModelRepository, nopDMNTransformer.transform(dmnModelRepository));
  }
}

