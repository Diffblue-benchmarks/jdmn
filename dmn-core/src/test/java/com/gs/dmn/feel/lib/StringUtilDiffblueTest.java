package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import javax.xml.xpath.XPathExpressionException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void containsTest() {
    // Arrange, Act and Assert
    assertTrue(StringUtil.contains("\"", "\""));
  }

  @Test
  public void endsWithTest() {
    // Arrange, Act and Assert
    assertTrue(StringUtil.endsWith("\"", "\""));
  }

  @Test
  public void lowerCaseTest() {
    // Arrange, Act and Assert
    assertEquals("\"", StringUtil.lowerCase("\""));
  }

  @Test
  public void matchesTest() throws Exception {
    // Arrange, Act and Assert
    assertTrue(StringUtil.matches("\"", "\"", ""));
  }

  @Test
  public void matchesTest2() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(XPathExpressionException.class);
    StringUtil.matches("\"", "\"", "\"");
  }

  @Test
  public void replaceTest() throws Exception {
    // Arrange, Act and Assert
    assertEquals("\"", StringUtil.replace("\"", "\"", "\"", ""));
  }

  @Test
  public void replaceTest2() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(XPathExpressionException.class);
    StringUtil.replace("\"", "\"", "\"", "\"");
  }

  @Test
  public void splitTest() {
    // Arrange
    List splitResult = StringUtil.split("\"", "\"");
    List actualSplitResult = StringUtil.split("", "\"");

    // Act
    List actualSplitResult1 = StringUtil.split("\"", "");

    // Assert
    assertEquals(2, splitResult.size());
    assertNull(actualSplitResult);
    assertNull(actualSplitResult1);
  }

  @Test
  public void startsWithTest() {
    // Arrange, Act and Assert
    assertTrue(StringUtil.startsWith("\"", "\""));
  }

  @Test
  public void stringLengthTest() {
    // Arrange, Act and Assert
    assertEquals(1L, StringUtil.stringLength("\""));
  }

  @Test
  public void stripQuotesTest() {
    // Arrange, Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    StringUtil.stripQuotes("\"");
  }

  @Test
  public void stripQuotesTest2() {
    // Arrange, Act and Assert
    assertEquals("value", StringUtil.stripQuotes("value"));
  }

  @Test
  public void substringAfterTest() {
    // Arrange
    String actualSubstringAfterResult = StringUtil.substringAfter("\"", "\"");

    // Act and Assert
    assertEquals("", actualSubstringAfterResult);
    assertEquals("", StringUtil.substringAfter("string", "\""));
  }

  @Test
  public void substringBeforeTest() {
    // Arrange
    String actualSubstringBeforeResult = StringUtil.substringBefore("\"", "\"");

    // Act and Assert
    assertEquals("", actualSubstringBeforeResult);
    assertEquals("", StringUtil.substringBefore("string", "\""));
  }

  @Test
  public void upperCaseTest() {
    // Arrange, Act and Assert
    assertEquals("\"", StringUtil.upperCase("\""));
  }
}

