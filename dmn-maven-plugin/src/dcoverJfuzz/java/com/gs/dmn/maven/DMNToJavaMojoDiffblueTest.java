package com.gs.dmn.maven;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Map;
import org.apache.maven.plugin.MojoExecutionException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DMNToJavaMojoDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void executeTest() throws MojoExecutionException {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new DMNToJavaMojo()).execute();
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    DMNToJavaMojo actualDmnToJavaMojo = new DMNToJavaMojo();

    // Assert
    Map actualPluginContext = actualDmnToJavaMojo.getPluginContext();
    assertNull(actualPluginContext);
    assertNull(actualDmnToJavaMojo.dmnTransformers);
    assertNull(actualDmnToJavaMojo.dmnValidators);
    assertNull(actualDmnToJavaMojo.inputParameters);
    assertNull(actualDmnToJavaMojo.dmnDialect);
    assertNull(actualDmnToJavaMojo.project);
    assertNull(actualDmnToJavaMojo.templateProvider);
    assertNull(actualDmnToJavaMojo.typeDeserializationConfigurer);
    assertNull(actualDmnToJavaMojo.lazyEvaluationDetectors);
    assertNull(actualDmnToJavaMojo.outputFileDirectory);
    assertNull(actualDmnToJavaMojo.inputFileDirectory);
    assertTrue(actualDmnToJavaMojo.getLog() instanceof org.apache.maven.plugin.logging.SystemStreamLog);
  }
}

