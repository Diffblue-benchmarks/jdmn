package com.gs.dmn.feel.synthesis.type;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class StandardFEELTypeTranslatorDiffblueTest {
  @Test(timeout=10000)
  public void toQualifiedJavaTypeTest() {
    // Arrange, Act and Assert
    assertNull((new StandardFEELTypeTranslator()).toQualifiedJavaType("foo"));
  }

  @Test(timeout=10000)
  public void toJavaTypeTest() {
    // Arrange, Act and Assert
    assertNull((new StandardFEELTypeTranslator()).toJavaType("foo"));
  }
}

