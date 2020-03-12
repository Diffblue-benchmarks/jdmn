package com.gs.dmn.feel.synthesis.type;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DoubleMixedJavaTimeFEELTypeTranslatorDiffblueTest {
  @Test
  public void toJavaTypeTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELTypeTranslator()).toJavaType("feelType"));
  }

  @Test
  public void toQualifiedJavaTypeTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELTypeTranslator()).toQualifiedJavaType("feelType"));
  }
}

