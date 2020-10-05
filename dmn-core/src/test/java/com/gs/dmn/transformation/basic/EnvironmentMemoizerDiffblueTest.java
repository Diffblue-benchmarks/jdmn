package com.gs.dmn.transformation.basic;

import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDecision;
import org.omg.spec.dmn._20180521.model.TInputData;

public class EnvironmentMemoizerDiffblueTest {
  @Test
  public void testGet() {
    // Arrange
    TDecision tdrgElement = new TDecision();

    // Act and Assert
    assertNull((new EnvironmentMemoizer()).get(tdrgElement));
  }

  @Test
  public void testGet2() {
    // Arrange
    TInputData tdrgElement = new TInputData();

    // Act and Assert
    assertNull((new EnvironmentMemoizer()).get(tdrgElement));
  }

  @Test
  public void testGet3() {
    // Arrange
    TInputData tdrgElement = new TInputData();

    // Act and Assert
    assertNull((new EnvironmentMemoizer()).get(tdrgElement));
  }
}

