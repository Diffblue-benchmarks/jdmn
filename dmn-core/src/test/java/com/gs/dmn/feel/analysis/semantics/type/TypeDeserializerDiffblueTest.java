package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertSame;
import java.util.NoSuchElementException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TypeDeserializerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void deserializeTest() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new TypeDeserializer()).deserialize("(");
  }
  @Test
  public void deserializeTest2() {
    // Arrange, Act and Assert
    thrown.expect(ClassCastException.class);
    (new TypeDeserializer()).deserialize("text");
  }
  @Test
  public void deserializeTest3() {
    // Arrange and Act
    Type actualDeserializeResult = (new TypeDeserializer()).deserialize("enumeration");

    // Assert
    assertSame(((EnumerationType) actualDeserializeResult).ENUMERATION, actualDeserializeResult);
  }
  @Test
  public void deserializeTest4() {
    // Arrange, Act and Assert
    thrown.expect(NoSuchElementException.class);
    (new TypeDeserializer()).deserialize("");
  }
  @Test
  public void deserializeTest5() {
    // Arrange, Act and Assert
    thrown.expect(NoSuchElementException.class);
    (new TypeDeserializer()).deserialize("(,=)");
  }
}

