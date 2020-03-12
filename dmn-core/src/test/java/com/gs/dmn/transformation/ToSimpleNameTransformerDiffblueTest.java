package com.gs.dmn.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.log.NopBuildLogger;
import org.junit.Test;

public class ToSimpleNameTransformerDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new ToSimpleNameTransformer()).logger instanceof com.gs.dmn.log.Slf4jBuildLogger);
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertTrue((new ToSimpleNameTransformer(new NopBuildLogger())).logger instanceof NopBuildLogger);
  }

  @Test
  public void transformNameTest() {
    // Arrange, Act and Assert
    assertEquals("Test01Xml", (new ToSimpleNameTransformer()).transformName("-test-01.xml"));
  }

  @Test
  public void transformNameTest2() {
    // Arrange, Act and Assert
    assertEquals("", (new ToSimpleNameTransformer()).transformName(""));
  }

  @Test
  public void transformNameTest3() {
    // Arrange, Act and Assert
    assertEquals("Test01Xml", (new ToSimpleNameTransformer()).transformName("Test01Xml"));
  }
}

