package com.gs.dmn.serialization;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DefaultTypeDeserializationConfigurerDiffblueTest {
  @Test
  public void deserializeTypeAsTest() {
    // Arrange, Act and Assert
    assertEquals("qualifiedInterfaceNameImpl",
        (new DefaultTypeDeserializationConfigurer()).deserializeTypeAs("qualifiedInterfaceName"));
  }
}

