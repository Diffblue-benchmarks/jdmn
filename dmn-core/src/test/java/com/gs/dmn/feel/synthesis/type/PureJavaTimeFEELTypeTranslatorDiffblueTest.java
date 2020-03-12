package com.gs.dmn.feel.synthesis.type;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class PureJavaTimeFEELTypeTranslatorDiffblueTest {
  @Test
  public void toJavaTypeTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELTypeTranslator()).toJavaType("feelType"));
  }

  @Test
  public void toQualifiedJavaTypeTest() {
    // Arrange, Act and Assert
    assertNull((new PureJavaTimeFEELTypeTranslator()).toQualifiedJavaType("feelType"));
  }
}

