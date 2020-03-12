package com.gs.dmn.serialization;

import com.gs.dmn.runtime.DMNRuntimeException;
import java.io.File;
import java.nio.file.Paths;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SchemaValidatorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void validateFileTest() {
    // Arrange
    File toFileResult = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new SchemaValidator(toFileResult, ".xml")).validateFile(toFileResult, "");
  }
  @Test
  public void validateFileTest2() {
    // Arrange
    File toFileResult = Paths.get(System.getProperty("java.io.tmpdir"), "").toFile();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new SchemaValidator(toFileResult, ".xml")).validateFile(toFileResult, ".xml");
  }
}

