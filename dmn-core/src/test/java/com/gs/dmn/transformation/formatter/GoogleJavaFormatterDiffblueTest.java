package com.gs.dmn.transformation.formatter;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.runtime.DMNRuntimeException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GoogleJavaFormatterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void formatSourceTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new GoogleJavaFormatter()).formatSource("code");
  }
  @Test
  public void formatSourceTest2() {
    // Arrange, Act and Assert
    assertEquals("\n", (new GoogleJavaFormatter()).formatSource(""));
  }
}

