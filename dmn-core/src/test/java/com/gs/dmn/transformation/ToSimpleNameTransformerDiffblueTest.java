package com.gs.dmn.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.log.NopBuildLogger;
import org.junit.Test;

public class ToSimpleNameTransformerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new ToSimpleNameTransformer()).logger instanceof com.gs.dmn.log.Slf4jBuildLogger);
  }

  @Test
  public void testConstructor2() {
    // Arrange, Act and Assert
    assertTrue((new ToSimpleNameTransformer(new NopBuildLogger())).logger instanceof NopBuildLogger);
  }

  @Test
  public void testTransformName() {
    // Arrange, Act and Assert
    assertNull((new ToSimpleNameTransformer()).transformName(null));
  }

  @Test
  public void testTransformName2() {
    // Arrange, Act and Assert
    assertEquals("Test01Xml", (new ToSimpleNameTransformer()).transformName("Test01Xml"));
  }

  @Test
  public void testTransformName3() {
    // Arrange, Act and Assert
    assertEquals("Test01Xml", (new ToSimpleNameTransformer()).transformName("-test-01.xml"));
  }
}

