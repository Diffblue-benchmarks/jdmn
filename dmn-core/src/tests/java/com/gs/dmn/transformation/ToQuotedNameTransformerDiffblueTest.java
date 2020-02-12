package com.gs.dmn.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.log.NopBuildLogger;
import org.junit.Test;

public class ToQuotedNameTransformerDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertTrue((new ToQuotedNameTransformer(new NopBuildLogger())).logger instanceof NopBuildLogger);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new ToQuotedNameTransformer()).logger instanceof com.gs.dmn.log.Slf4jBuildLogger);
  }

  @Test(timeout=10000)
  public void transformNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new ToQuotedNameTransformer()).transformName("name"));
  }
}

