package com.gs.dmn.feel.analysis.scanner;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public class LexicalContextDiffblueTest {
  @Test
  public void orderedNamesTest() {
    // Arrange and Act
    List<String> actualOrderedNamesResult = (new LexicalContext("foo", "foo", "foo")).orderedNames();

    // Assert
    assertEquals(3, actualOrderedNamesResult.size());
    assertEquals("foo", actualOrderedNamesResult.get(0));
    assertEquals("foo", actualOrderedNamesResult.get(1));
    assertEquals("foo", actualOrderedNamesResult.get(2));
  }
}

