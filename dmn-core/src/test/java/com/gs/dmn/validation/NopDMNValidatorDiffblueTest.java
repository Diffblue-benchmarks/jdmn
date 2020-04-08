package com.gs.dmn.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import org.junit.Test;

public class NopDMNValidatorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new NopDMNValidator()).logger instanceof com.gs.dmn.log.Slf4jBuildLogger);
  }

  @Test
  public void testValidate() {
    // Arrange
    NopDMNValidator nopDMNValidator = new NopDMNValidator();

    // Act and Assert
    assertEquals(0, nopDMNValidator.validate(new DMNModelRepository()).size());
  }
}

