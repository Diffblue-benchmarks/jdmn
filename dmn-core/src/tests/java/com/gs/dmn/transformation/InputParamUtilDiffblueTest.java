package com.gs.dmn.transformation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.gs.dmn.runtime.DMNRuntimeException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class InputParamUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void getOptionalParamTest() {
    // Arrange, Act and Assert
    assertNull(InputParamUtil.getOptionalParam(null, "foo"));
  }
  @Test(timeout=10000)
  public void getOptionalBooleanParamTest() {
    // Arrange, Act and Assert
    assertFalse(InputParamUtil.getOptionalBooleanParam(null, "foo"));
  }
  @Test(timeout=10000)
  public void getRequiredParamTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    InputParamUtil.getRequiredParam(null, "foo");
  }
}

