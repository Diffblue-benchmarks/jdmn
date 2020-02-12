package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.List;
import javax.xml.xpath.XPathExpressionException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void matchesTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(XPathExpressionException.class);
    StringUtil.matches("foo", "foo", "foo");
  }

  @Test(timeout=10000)
  public void upperCaseTest() {
    // Arrange, Act and Assert
    assertEquals("FOO", StringUtil.upperCase("foo"));
  }

  @Test(timeout=10000)
  public void substringBeforeTest() {
    // Arrange
    String actualSubstringBeforeResult = StringUtil.substringBefore("foo", "foo");

    // Act and Assert
    assertEquals("", actualSubstringBeforeResult);
    assertEquals("", StringUtil.substringBefore("", "foo"));
  }

  @Test(timeout=10000)
  public void substringTest2() {
    // Arrange, Act and Assert
    assertNull(StringUtil.substring("foo", null));
  }

  @Test(timeout=10000)
  public void containsTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), StringUtil.contains("foo", "foo"));
  }

  @Test(timeout=10000)
  public void substringAfterTest() {
    // Arrange
    String actualSubstringAfterResult = StringUtil.substringAfter("foo", "foo");

    // Act and Assert
    assertEquals("", actualSubstringAfterResult);
    assertEquals("", StringUtil.substringAfter("", "foo"));
  }

  @Test(timeout=10000)
  public void endsWithTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), StringUtil.endsWith("foo", "foo"));
  }

  @Test(timeout=10000)
  public void replaceTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(XPathExpressionException.class);
    StringUtil.replace("foo", "foo", "foo", "foo");
  }

  @Test(timeout=10000)
  public void lowerCaseTest() {
    // Arrange, Act and Assert
    assertEquals("foo", StringUtil.lowerCase("foo"));
  }

  @Test(timeout=10000)
  public void stripQuotesTest2() {
    // Arrange, Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    StringUtil.stripQuotes("\"");
  }

  @Test(timeout=10000)
  public void stripQuotesTest() {
    // Arrange
    String actualStripQuotesResult = StringUtil.stripQuotes("value");

    // Act and Assert
    assertEquals("value", actualStripQuotesResult);
    assertEquals("", StringUtil.stripQuotes(""));
  }

  @Test(timeout=10000)
  public void substringTest() {
    // Arrange, Act and Assert
    assertNull(StringUtil.substring("foo", null, null));
  }

  @Test(timeout=10000)
  public void stringLengthTest() {
    // Arrange, Act and Assert
    assertEquals(3L, StringUtil.stringLength("foo"));
  }

  @Test(timeout=10000)
  public void startsWithTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), StringUtil.startsWith("foo", "foo"));
  }

  @Test(timeout=10000)
  public void splitTest() {
    // Arrange
    List splitResult = StringUtil.split("foo", "foo");

    // Act
    List actualSplitResult = StringUtil.split("", "foo");

    // Assert
    assertEquals(2, splitResult.size());
    assertNull(actualSplitResult);
  }
}

