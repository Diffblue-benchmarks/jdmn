package com.gs.dmn.serialization;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DefaultTypeDeserializationConfigurerDiffblueTest {
  @Test
  public void testDeserializeTypeAs() {
    // Arrange, Act and Assert
    assertEquals("com.gs.dmn.generated.tck.cl2_0008_LX_arithmetic.type.TLoanImpl",
        (new DefaultTypeDeserializationConfigurer())
            .deserializeTypeAs("com.gs.dmn.generated.tck.cl2_0008_LX_arithmetic.type.TLoan"));
    assertEquals("com.gs.dmn.generated.tck.cl2_0008_LX_arithmetic.type.TLoanImpl",
        (new DefaultTypeDeserializationConfigurer())
            .deserializeTypeAs("com.gs.dmn.generated.tck.cl2_0008_LX_arithmetic.type.TLoan"));
    assertEquals("com.gs.dmn.generated.tck.cl2_0009_invocation_arithmetic.type.TLoanImpl",
        (new DefaultTypeDeserializationConfigurer())
            .deserializeTypeAs("com.gs.dmn.generated.tck.cl2_0009_invocation_arithmetic.type.TLoan"));
  }
}

