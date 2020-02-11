package com.gs.dmn.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.log.NopBuildLogger;
import org.junit.Test;

public class ToSimpleNameTransformerDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertTrue((new ToSimpleNameTransformer(new NopBuildLogger())).logger instanceof NopBuildLogger);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new ToSimpleNameTransformer()).logger instanceof com.gs.dmn.log.Slf4jBuildLogger);
  }

  @Test(timeout=10000)
  public void transformNameTest2() {
    // Arrange, Act and Assert
    assertEquals("", (new ToSimpleNameTransformer()).transformName(""));
  }

  @Test(timeout=10000)
  public void transformNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new ToSimpleNameTransformer()).transformName("name"));
  }
}

