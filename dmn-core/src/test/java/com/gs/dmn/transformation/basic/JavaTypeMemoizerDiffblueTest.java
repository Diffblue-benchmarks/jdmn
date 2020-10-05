package com.gs.dmn.transformation.basic;

import static org.junit.Assert.assertNull;
import com.gs.dmn.feel.analysis.semantics.type.StringType;
import org.junit.Test;

public class JavaTypeMemoizerDiffblueTest {
  @Test
  public void testGet() {
    // Arrange
    StringType type = new StringType();

    // Act and Assert
    assertNull((new JavaTypeMemoizer()).get(type));
  }

  @Test
  public void testGet2() {
    // Arrange
    StringType type = new StringType();

    // Act and Assert
    assertNull((new JavaTypeMemoizer()).get(type));
  }

  @Test
  public void testGet3() {
    // Arrange
    StringType type = new StringType();

    // Act and Assert
    assertNull((new JavaTypeMemoizer()).get(type));
  }
}

