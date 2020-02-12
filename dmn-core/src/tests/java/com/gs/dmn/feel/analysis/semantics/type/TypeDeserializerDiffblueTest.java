package com.gs.dmn.feel.analysis.semantics.type;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TypeDeserializerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void deserializeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new TypeDeserializer()).deserialize("foo");
  }
}

