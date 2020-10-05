package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import java.util.LinkedHashMap;
import org.junit.Test;

public class ContextTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("ContextType()", (new ContextType()).toString());
    assertEquals("ContextType()", (new ContextType(new LinkedHashMap<String, Type>())).toString());
  }

  @Test
  public void testGetMembers() {
    // Arrange, Act and Assert
    assertEquals(0, (new ContextType()).getMembers().size());
    assertEquals(0, (new ContextType()).getMembers().size());
    assertEquals(0, (new ContextType()).getMembers().size());
  }
}

