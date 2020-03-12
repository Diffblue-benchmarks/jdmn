package com.gs.dmn.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.log.NopBuildLogger;
import org.junit.Test;

public class DefaultDMNValidatorDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new DefaultDMNValidator()).logger instanceof com.gs.dmn.log.Slf4jBuildLogger);
  }

  @Test
  public void constructorTest2() {
    // Arrange
    NopBuildLogger nopBuildLogger = new NopBuildLogger();

    // Act and Assert
    assertSame(nopBuildLogger, (new DefaultDMNValidator(nopBuildLogger)).logger);
  }

  @Test
  public void validateTest() {
    // Arrange
    DefaultDMNValidator defaultDMNValidator = new DefaultDMNValidator();

    // Act and Assert
    assertEquals(0, defaultDMNValidator.validate(new DMNModelRepository()).size());
  }
}

