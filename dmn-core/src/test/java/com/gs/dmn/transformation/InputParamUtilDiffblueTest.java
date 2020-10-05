package com.gs.dmn.transformation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.TreeMap;
import org.junit.Test;

public class InputParamUtilDiffblueTest {
  @Test
  public void testGetRequiredParam() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("dmnVersion", "1.3");

    // Act and Assert
    assertEquals("1.3", InputParamUtil.getRequiredParam(stringStringMap, "dmnVersion"));
  }

  @Test
  public void testGetRequiredParam2() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("modelVersion", "1.0");

    // Act and Assert
    assertEquals("1.0", InputParamUtil.getRequiredParam(stringStringMap, "modelVersion"));
  }

  @Test
  public void testGetRequiredParam3() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("platformVersion", "3.10.0");

    // Act and Assert
    assertEquals("3.10.0", InputParamUtil.getRequiredParam(stringStringMap, "platformVersion"));
  }

  @Test
  public void testGetOptionalParam() {
    // Arrange, Act and Assert
    assertNull(InputParamUtil.getOptionalParam(new TreeMap<String, String>(), "onePackage"));
    assertNull(InputParamUtil.getOptionalParam(new TreeMap<String, String>(), "singletonInputData"));
    assertEquals("true", InputParamUtil.getOptionalParam(new TreeMap<String, String>(), "onePackage", "true"));
    assertEquals("1", InputParamUtil.getOptionalParam(new TreeMap<String, String>(), "cachingThreshold", "1"));
    assertEquals("true", InputParamUtil.getOptionalParam(new TreeMap<String, String>(), "singletonInputData", "true"));
  }

  @Test
  public void testGetOptionalParam2() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");

    // Act and Assert
    assertEquals("true", InputParamUtil.getOptionalParam(stringStringMap, "caching"));
  }

  @Test
  public void testGetOptionalBooleanParam() {
    // Arrange, Act and Assert
    assertFalse(InputParamUtil.getOptionalBooleanParam(new TreeMap<String, String>(), "onePackage"));
    assertTrue(InputParamUtil.getOptionalBooleanParam(new TreeMap<String, String>(), "onePackage", "true"));
    assertTrue(InputParamUtil.getOptionalBooleanParam(new TreeMap<String, String>(), "singletonInputData", "true"));
    assertFalse(InputParamUtil.getOptionalBooleanParam(new TreeMap<String, String>(), "parallelStream", "false"));
  }

  @Test
  public void testGetOptionalBooleanParam2() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("xsdValidation", "false");

    // Act and Assert
    assertFalse(InputParamUtil.getOptionalBooleanParam(stringStringMap, "xsdValidation"));
  }

  @Test
  public void testGetOptionalBooleanParam3() {
    // Arrange
    TreeMap<String, String> stringStringMap = new TreeMap<String, String>();
    stringStringMap.put("caching", "true");

    // Act and Assert
    assertTrue(InputParamUtil.getOptionalBooleanParam(stringStringMap, "caching"));
  }
}

