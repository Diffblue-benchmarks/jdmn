package com.gs.dmn.transformation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import java.util.HashMap;
import org.junit.Test;

public class InputParamUtilDiffblueTest {
  @Test
  public void testGetOptionalParam() {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertNull(InputParamUtil.getOptionalParam(stringStringMap, "parameterKey"));
  }

  @Test
  public void testGetOptionalBooleanParam() {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertFalse(InputParamUtil.getOptionalBooleanParam(stringStringMap, "paramKey"));
  }
}

