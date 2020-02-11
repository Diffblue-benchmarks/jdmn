package com.gs.dmn.serialization;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DefaultTypeDeserializationConfigurerDiffblueTest {
  @Test(timeout=10000)
  public void deserializeTypeAsTest() {
    // Arrange, Act and Assert
    assertEquals("nameImpl", (new DefaultTypeDeserializationConfigurer()).deserializeTypeAs("name"));
  }
}

