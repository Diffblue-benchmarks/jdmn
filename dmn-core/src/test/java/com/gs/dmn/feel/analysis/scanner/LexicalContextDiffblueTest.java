package com.gs.dmn.feel.analysis.scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class LexicalContextDiffblueTest {
  @Test
  public void testOrderedNames() {
    // Arrange and Act
    List<String> actualOrderedNamesResult = (new LexicalContext("foo", "foo", "foo")).orderedNames();

    // Assert
    assertEquals(3, actualOrderedNamesResult.size());
    assertEquals("foo", actualOrderedNamesResult.get(0));
    assertEquals("foo", actualOrderedNamesResult.get(1));
    assertEquals("foo", actualOrderedNamesResult.get(2));
  }

  @Test
  public void testOrderedNames2() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    List<String> actualOrderedNamesResult = (new LexicalContext(stringList)).orderedNames();

    // Assert
    assertSame(stringList, actualOrderedNamesResult);
    assertEquals(1, actualOrderedNamesResult.size());
    assertEquals("foo", actualOrderedNamesResult.get(0));
  }
}

