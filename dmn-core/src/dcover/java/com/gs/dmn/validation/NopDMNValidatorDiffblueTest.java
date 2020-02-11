package com.gs.dmn.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import org.junit.Test;

public class NopDMNValidatorDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new NopDMNValidator()).logger instanceof com.gs.dmn.log.Slf4jBuildLogger);
  }

  @Test(timeout=10000)
  public void validateTest() {
    // Arrange
    NopDMNValidator nopDMNValidator = new NopDMNValidator();

    // Act and Assert
    assertEquals(0, nopDMNValidator.validate(new DMNModelRepository()).size());
  }
}

