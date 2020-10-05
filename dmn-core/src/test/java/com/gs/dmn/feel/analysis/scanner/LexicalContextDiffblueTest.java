package com.gs.dmn.feel.analysis.scanner;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class LexicalContextDiffblueTest {
  @Test
  public void testOrderedNames() {
    // Arrange
    LexicalContext lexicalContext = new LexicalContext(new ArrayList<String>());
    lexicalContext.addName("decimal separator");
    lexicalContext.addName("start position");

    // Act
    List<String> actualOrderedNamesResult = lexicalContext.orderedNames();

    // Assert
    assertEquals(2, actualOrderedNamesResult.size());
    assertEquals("decimal separator", actualOrderedNamesResult.get(0));
    assertEquals("start position", actualOrderedNamesResult.get(1));
  }

  @Test
  public void testOrderedNames2() {
    // Arrange
    LexicalContext lexicalContext = new LexicalContext(new ArrayList<String>());
    lexicalContext.addName("decimal separator");
    lexicalContext.addName("start position");

    // Act
    List<String> actualOrderedNamesResult = lexicalContext.orderedNames();

    // Assert
    assertEquals(2, actualOrderedNamesResult.size());
    assertEquals("decimal separator", actualOrderedNamesResult.get(0));
    assertEquals("start position", actualOrderedNamesResult.get(1));
  }

  @Test
  public void testOrderedNames3() {
    // Arrange
    LexicalContext lexicalContext = new LexicalContext(new ArrayList<String>());
    lexicalContext.addName("decimal separator");
    lexicalContext.addName("start position");

    // Act
    List<String> actualOrderedNamesResult = lexicalContext.orderedNames();

    // Assert
    assertEquals(2, actualOrderedNamesResult.size());
    assertEquals("decimal separator", actualOrderedNamesResult.get(0));
    assertEquals("start position", actualOrderedNamesResult.get(1));
  }
}

