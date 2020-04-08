package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class TypeDeserializerDiffblueTest {
  @Test
  public void testDeserialize() {
    // Arrange and Act
    Type actualDeserializeResult = (new TypeDeserializer()).deserialize("enumeration");

    // Assert
    assertSame(((EnumerationType) actualDeserializeResult).ENUMERATION, actualDeserializeResult);
  }
}

