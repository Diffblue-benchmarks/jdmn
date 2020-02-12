package com.gs.dmn.feel.synthesis.type;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DoubleMixedJavaTimeFEELTypeTranslatorDiffblueTest {
  @Test(timeout=10000)
  public void toQualifiedJavaTypeTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELTypeTranslator()).toQualifiedJavaType("foo"));
  }

  @Test(timeout=10000)
  public void toJavaTypeTest() {
    // Arrange, Act and Assert
    assertNull((new DoubleMixedJavaTimeFEELTypeTranslator()).toJavaType("foo"));
  }
}

