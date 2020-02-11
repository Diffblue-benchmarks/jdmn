package com.gs.dmn.serialization;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DMNVersionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void fromVersionTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    DMNVersion.fromVersion("foo");
  }
}

