package com.gs.dmn.feel.synthesis.type;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class StandardFEELTypeTranslatorDiffblueTest {
  @Test
  public void testToJavaType() {
    // Arrange, Act and Assert
    assertNull((new StandardFEELTypeTranslator()).toJavaType("feelType"));
  }

  @Test
  public void testToQualifiedJavaType() {
    // Arrange, Act and Assert
    assertNull((new StandardFEELTypeTranslator()).toQualifiedJavaType("feelType"));
  }
}

