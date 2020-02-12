package com.gs.dmn.transformation.formatter;

import com.gs.dmn.runtime.DMNRuntimeException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GoogleJavaFormatterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void formatSourceTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new GoogleJavaFormatter()).formatSource("foo");
  }
}

