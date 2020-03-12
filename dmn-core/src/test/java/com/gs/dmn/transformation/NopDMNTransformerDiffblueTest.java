package com.gs.dmn.transformation;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.runtime.Pair;
import org.junit.Test;

public class NopDMNTransformerDiffblueTest {
  @Test
  public void transformTest() {
    // Arrange
    NopDMNTransformer<Object> nopDMNTransformer = new NopDMNTransformer<Object>();
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertSame(dmnModelRepository, nopDMNTransformer.transform(dmnModelRepository));
  }

  @Test
  public void transformTest2() {
    // Arrange
    NopDMNTransformer<Object> nopDMNTransformer = new NopDMNTransformer<Object>();
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act
    Pair<DMNModelRepository, Object> actualTransformResult = nopDMNTransformer.transform(dmnModelRepository,
        "testCases");

    // Assert
    assertTrue(actualTransformResult.getRight() instanceof String);
    assertSame(dmnModelRepository, actualTransformResult.getLeft());
  }
}

