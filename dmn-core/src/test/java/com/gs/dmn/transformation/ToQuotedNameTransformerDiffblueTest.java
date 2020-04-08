package com.gs.dmn.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.log.NopBuildLogger;
import org.junit.Test;

public class ToQuotedNameTransformerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new ToQuotedNameTransformer()).logger instanceof com.gs.dmn.log.Slf4jBuildLogger);
  }

  @Test
  public void testConstructor2() {
    // Arrange, Act and Assert
    assertTrue((new ToQuotedNameTransformer(new NopBuildLogger())).logger instanceof NopBuildLogger);
  }

  @Test
  public void testTransformName() {
    // Arrange, Act and Assert
    assertEquals("", (new ToQuotedNameTransformer()).transformName(""));
  }

  @Test
  public void testTransformName2() {
    // Arrange, Act and Assert
    assertEquals("name", (new ToQuotedNameTransformer()).transformName("name"));
  }
}

