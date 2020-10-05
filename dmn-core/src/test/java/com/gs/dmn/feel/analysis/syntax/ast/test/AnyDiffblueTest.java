package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AnyDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new Any()).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue((new Any()).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue((new Any()).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }
}

