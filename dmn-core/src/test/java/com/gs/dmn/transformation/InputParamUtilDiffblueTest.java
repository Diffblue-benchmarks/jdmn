package com.gs.dmn.transformation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.gs.dmn.runtime.DMNRuntimeException;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class InputParamUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getOptionalBooleanParamTest() {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertFalse(InputParamUtil.getOptionalBooleanParam(stringStringMap, "paramKey"));
  }
  @Test
  public void getOptionalParamTest() {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertNull(InputParamUtil.getOptionalParam(stringStringMap, "parameterKey"));
  }
  @Test
  public void getRequiredParamTest() {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    InputParamUtil.getRequiredParam(stringStringMap, "parameterKey");
  }
}

