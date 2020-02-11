package com.gs.dmn;

import static org.junit.Assert.assertSame;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDecision;

public class StartMarkerDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    TDecision tDecision = new TDecision();

    // Act and Assert
    assertSame(tDecision, (new StartMarker(tDecision)).getDecision());
  }

  @Test(timeout=10000)
  public void getDecisionTest() {
    // Arrange
    TDecision tDecision = new TDecision();

    // Act and Assert
    assertSame(tDecision, (new StartMarker(tDecision)).getDecision());
  }
}

