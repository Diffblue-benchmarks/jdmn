package com.gs.dmn.transformation;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.runtime.Pair;
import java.util.ArrayList;
import org.junit.Test;

public class CompositeDMNTransformerDiffblueTest {
  @Test
  public void transformTest() {
    // Arrange
    ArrayList<DMNTransformer> dmnTransformerList = new ArrayList<DMNTransformer>();
    dmnTransformerList.add(new NopDMNTransformer<Object>());
    CompositeDMNTransformer<Object> compositeDMNTransformer = new CompositeDMNTransformer<Object>(dmnTransformerList);
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertSame(dmnModelRepository, compositeDMNTransformer.transform(dmnModelRepository));
  }

  @Test
  public void transformTest2() {
    // Arrange
    ArrayList<DMNTransformer> dmnTransformerList = new ArrayList<DMNTransformer>();
    dmnTransformerList.add(new NopDMNTransformer<Object>());
    CompositeDMNTransformer<Object> compositeDMNTransformer = new CompositeDMNTransformer<Object>(dmnTransformerList);
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act
    Pair<DMNModelRepository, Object> actualTransformResult = compositeDMNTransformer.transform(dmnModelRepository,
        "testCases");

    // Assert
    assertTrue(actualTransformResult.getRight() instanceof String);
    assertSame(dmnModelRepository, actualTransformResult.getLeft());
  }
}

