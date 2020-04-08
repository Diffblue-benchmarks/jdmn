package com.gs.dmn.validation;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.DMNModelRepository;
import java.util.ArrayList;
import org.junit.Test;

public class CompositeDMNValidatorDiffblueTest {
  @Test
  public void testValidate() {
    // Arrange
    ArrayList<DMNValidator> dmnValidatorList = new ArrayList<DMNValidator>();
    dmnValidatorList.add(new DefaultDMNValidator());
    CompositeDMNValidator compositeDMNValidator = new CompositeDMNValidator(dmnValidatorList);

    // Act and Assert
    assertEquals(0, compositeDMNValidator.validate(new DMNModelRepository()).size());
  }
}

