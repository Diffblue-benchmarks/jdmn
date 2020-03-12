package com.gs.dmn;

import static org.junit.Assert.assertSame;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDecision;

public class StartMarkerDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    TDecision tDecision = new TDecision();

    // Act and Assert
    assertSame(tDecision, (new StartMarker(tDecision)).getDecision());
  }
}

