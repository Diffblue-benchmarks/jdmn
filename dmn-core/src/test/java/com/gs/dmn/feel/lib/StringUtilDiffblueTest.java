package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class StringUtilDiffblueTest {
  @Test
  public void testContains() {
    // Arrange
    Boolean actualContainsResult = StringUtil.contains("\"", "\"");
    Boolean actualContainsResult1 = StringUtil.contains(null, "\"");

    // Act and Assert
    assertTrue(actualContainsResult);
    assertNull(actualContainsResult1);
    assertNull(StringUtil.contains("\"", null));
  }

  @Test
  public void testStartsWith() {
    // Arrange
    Boolean actualStartsWithResult = StringUtil.startsWith("\"", "\"");
    Boolean actualStartsWithResult1 = StringUtil.startsWith(null, "\"");

    // Act and Assert
    assertTrue(actualStartsWithResult);
    assertNull(actualStartsWithResult1);
    assertNull(StringUtil.startsWith("\"", null));
  }

  @Test
  public void testEndsWith() {
    // Arrange
    Boolean actualEndsWithResult = StringUtil.endsWith("\"", "\"");
    Boolean actualEndsWithResult1 = StringUtil.endsWith(null, "\"");

    // Act and Assert
    assertTrue(actualEndsWithResult);
    assertNull(actualEndsWithResult1);
    assertNull(StringUtil.endsWith("\"", null));
  }

  @Test
  public void testStringLength() {
    // Arrange, Act and Assert
    assertEquals(1L, StringUtil.stringLength("\""));
  }

  @Test
  public void testSubstring() {
    // Arrange
    String actualSubstringResult = StringUtil.substring("\"", new Integer(1), new Integer(1));
    String actualSubstringResult1 = StringUtil.substring(null, new Integer(1), new Integer(1));
    String actualSubstringResult2 = StringUtil.substring("string", new Integer(1), new Integer(1));
    String actualSubstringResult3 = StringUtil.substring("\"", null, null);
    String actualSubstringResult4 = StringUtil.substring("\"", new Integer(-1), new Integer(-1));

    // Act and Assert
    assertEquals("\"", actualSubstringResult);
    assertNull(actualSubstringResult1);
    assertEquals("s", actualSubstringResult2);
    assertNull(actualSubstringResult3);
    assertEquals("", actualSubstringResult4);
    assertEquals("g", StringUtil.substring("string", new Integer(6), new Integer(6)));
  }

  @Test
  public void testSubstring2() {
    // Arrange, Act and Assert
    assertEquals("\"", StringUtil.substring("\"", new Integer(-1)));
  }

  @Test
  public void testSubstring3() {
    // Arrange, Act and Assert
    assertNull(StringUtil.substring("\"", null));
  }

  @Test
  public void testSubstring4() {
    // Arrange, Act and Assert
    assertNull(StringUtil.substring(null, new Integer(1)));
  }

  @Test
  public void testSubstring5() {
    // Arrange, Act and Assert
    assertEquals("\"", StringUtil.substring("\"", new Integer(1)));
  }

  @Test
  public void testUpperCase() {
    // Arrange
    String actualUpperCaseResult = StringUtil.upperCase("\"");

    // Act and Assert
    assertEquals("\"", actualUpperCaseResult);
    assertNull(StringUtil.upperCase(null));
  }

  @Test
  public void testLowerCase() {
    // Arrange
    String actualLowerCaseResult = StringUtil.lowerCase("\"");

    // Act and Assert
    assertEquals("\"", actualLowerCaseResult);
    assertNull(StringUtil.lowerCase(null));
  }

  @Test
  public void testSubstringBefore() {
    // Arrange
    String actualSubstringBeforeResult = StringUtil.substringBefore("\"", "\"");
    String actualSubstringBeforeResult1 = StringUtil.substringBefore(null, "\"");
    String actualSubstringBeforeResult2 = StringUtil.substringBefore("string", "\"");

    // Act and Assert
    assertEquals("", actualSubstringBeforeResult);
    assertNull(actualSubstringBeforeResult1);
    assertEquals("", actualSubstringBeforeResult2);
    assertNull(StringUtil.substringBefore("\"", null));
  }

  @Test
  public void testSubstringAfter() {
    // Arrange
    String actualSubstringAfterResult = StringUtil.substringAfter("\"", "\"");
    String actualSubstringAfterResult1 = StringUtil.substringAfter(null, "\"");
    String actualSubstringAfterResult2 = StringUtil.substringAfter("string", "\"");

    // Act and Assert
    assertEquals("", actualSubstringAfterResult);
    assertNull(actualSubstringAfterResult1);
    assertEquals("", actualSubstringAfterResult2);
    assertNull(StringUtil.substringAfter("\"", null));
  }

  @Test
  public void testReplace() throws Exception {
    // Arrange
    String actualReplaceResult = StringUtil.replace(null, "\"", "\"", "\"");
    String actualReplaceResult1 = StringUtil.replace("\"", null, "\"", "\"");
    String actualReplaceResult2 = StringUtil.replace("\"", "\"", null, "\"");

    // Act and Assert
    assertNull(actualReplaceResult);
    assertNull(actualReplaceResult1);
    assertNull(actualReplaceResult2);
    assertEquals("\"", StringUtil.replace("\"", "\"", "\"", null));
  }

  @Test
  public void testMatches() throws Exception {
    // Arrange
    Boolean actualMatchesResult = StringUtil.matches(null, "\"", "\"");
    Boolean actualMatchesResult1 = StringUtil.matches("\"", null, "\"");

    // Act and Assert
    assertFalse(actualMatchesResult);
    assertFalse(actualMatchesResult1);
    assertTrue(StringUtil.matches("\"", "\"", null));
  }

  @Test
  public void testSplit() {
    // Arrange
    List splitResult = StringUtil.split("\"", "\"");
    List actualSplitResult = StringUtil.split(null, "\"");
    List actualSplitResult1 = StringUtil.split("\"", null);
    List actualSplitResult2 = StringUtil.split("", "\"");

    // Act
    List actualSplitResult3 = StringUtil.split("\"", "");

    // Assert
    assertEquals(2, splitResult.size());
    assertNull(actualSplitResult);
    assertNull(actualSplitResult1);
    assertNull(actualSplitResult2);
    assertNull(actualSplitResult3);
  }

  @Test
  public void testStripQuotes() {
    // Arrange
    String actualStripQuotesResult = StringUtil.stripQuotes("value");

    // Act and Assert
    assertEquals("value", actualStripQuotesResult);
    assertEquals("", StringUtil.stripQuotes(""));
  }

  @Test
  public void testStripQuotes2() {
    // Arrange, Act and Assert
    assertEquals("", StringUtil.stripQuotes(""));
  }
}

