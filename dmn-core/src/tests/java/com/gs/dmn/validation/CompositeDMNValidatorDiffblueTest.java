package com.gs.dmn.validation;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.DMNModelRepository;
import org.junit.Test;

public class CompositeDMNValidatorDiffblueTest {
  @Test(timeout=10000)
  public void validateTest() {
    // Arrange
    CompositeDMNValidator compositeDMNValidator = new CompositeDMNValidator(null);

    // Act and Assert
    assertEquals(0, compositeDMNValidator.validate(new DMNModelRepository()).size());
  }
}

