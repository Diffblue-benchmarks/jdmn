package com.gs.dmn.feel.synthesis.type;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class UniformJavaTimeFEELTypeTranslatorDiffblueTest {
  @Test
  public void toJavaTypeTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELTypeTranslator()).toJavaType("feelType"));
  }

  @Test
  public void toQualifiedJavaTypeTest() {
    // Arrange, Act and Assert
    assertNull((new UniformJavaTimeFEELTypeTranslator()).toQualifiedJavaType("feelType"));
  }
}

