package com.gs.dmn.feel.synthesis.type;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class MixedJavaTimeFEELTypeTranslatorDiffblueTest {
  @Test
  public void testToJavaType() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELTypeTranslator()).toJavaType("feelType"));
  }

  @Test
  public void testToQualifiedJavaType() {
    // Arrange, Act and Assert
    assertNull((new MixedJavaTimeFEELTypeTranslator()).toQualifiedJavaType("feelType"));
  }
}

