package com.gs.dmn.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.runtime.Pair;
import com.gs.dmn.serialization.PrefixNamespaceMappings;
import java.util.ArrayList;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDefinitions;

public class NopDMNValidatorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new NopDMNValidator()).logger instanceof com.gs.dmn.log.Slf4jBuildLogger);
    assertTrue((new NopDMNValidator()).logger instanceof com.gs.dmn.log.Slf4jBuildLogger);
    assertTrue((new NopDMNValidator()).logger instanceof com.gs.dmn.log.Slf4jBuildLogger);
  }

  @Test
  public void testValidate() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, (new NopDMNValidator()).validate(dmnModelRepository).size());
  }

  @Test
  public void testValidate2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, (new NopDMNValidator()).validate(dmnModelRepository).size());
  }

  @Test
  public void testValidate3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, (new NopDMNValidator()).validate(dmnModelRepository).size());
  }
}

