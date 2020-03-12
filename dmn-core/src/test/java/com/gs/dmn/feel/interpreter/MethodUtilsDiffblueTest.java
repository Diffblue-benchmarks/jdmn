package com.gs.dmn.feel.interpreter;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class MethodUtilsDiffblueTest {
  @Test
  public void resolveMethodTest() {
    // Arrange
    Class<?> forNameResult = Object.class;
    Class<?> forNameResult1 = Object.class;

    // Act and Assert
    assertNull(MethodUtils.resolveMethod("methodName", forNameResult,
        new Class[]{forNameResult1, forNameResult, Object.class}));
  }

  @Test
  public void resolveMethodTest2() {
    // Arrange
    Class<?> forNameResult = Object.class;
    Class<?> forNameResult1 = Object.class;

    // Act and Assert
    assertNull(
        MethodUtils.resolveMethod("wait", forNameResult, new Class[]{forNameResult1, forNameResult, Object.class}));
  }
}

