package com.gs.dmn.maven;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Map;
import org.apache.maven.plugin.MojoExecutionException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TCKToJUnitMojoDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void executeTest() throws MojoExecutionException {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new TCKToJUnitMojo()).execute();
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    TCKToJUnitMojo actualTckToJUnitMojo = new TCKToJUnitMojo();

    // Assert
    Map actualPluginContext = actualTckToJUnitMojo.getPluginContext();
    assertNull(actualPluginContext);
    assertNull(actualTckToJUnitMojo.templateProvider);
    assertNull(actualTckToJUnitMojo.inputModelFileDirectory);
    assertNull(actualTckToJUnitMojo.dmnDialect);
    assertNull(actualTckToJUnitMojo.outputFileDirectory);
    assertNull(actualTckToJUnitMojo.lazyEvaluationDetectors);
    assertNull(actualTckToJUnitMojo.typeDeserializationConfigurer);
    assertNull(actualTckToJUnitMojo.dmnValidators);
    assertNull(actualTckToJUnitMojo.project);
    assertNull(actualTckToJUnitMojo.dmnTransformers);
    assertNull(actualTckToJUnitMojo.inputParameters);
    assertNull(actualTckToJUnitMojo.inputTestFileDirectory);
    assertTrue(actualTckToJUnitMojo.getLog() instanceof org.apache.maven.plugin.logging.SystemStreamLog);
  }
}

