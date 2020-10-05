package com.gs.dmn.serialization;

import static org.junit.Assert.assertTrue;
import java.io.File;
import java.nio.file.Paths;
import org.junit.Test;

public class DMNReaderDiffblueTest {
  @Test
  public void testIsDMNFile() {
    // Arrange, Act and Assert
    assertTrue(DMNReader.isDMNFile(new File(Paths.get(System.getProperty("user.home"), "x", "devel", "diffblue",
        "benchmarks", "jdmn", "dmn-tck-it", "dmn-tck-it-translator", "..", "dmn-tck-it-interpreter", "src", "main",
        "resources", "tck", "cl2", "0001-input-data-string.dmn").toString())));
    assertTrue(DMNReader.isDMNFile(new File(Paths.get(System.getProperty("user.home"), "x", "devel", "diffblue",
        "benchmarks", "jdmn", "dmn-tck-it", "dmn-tck-it-translator", "..", "dmn-tck-it-interpreter", "src", "main",
        "resources", "tck", "cl2", "0001-input-data-string.dmn").toString())));
    assertTrue(DMNReader.isDMNFile(new File(Paths.get(System.getProperty("user.home"), "x", "devel", "diffblue",
        "benchmarks", "jdmn", "dmn-tck-it", "dmn-tck-it-translator", "..", "dmn-tck-it-interpreter", "src", "main",
        "resources", "tck", "cl2", "0001-input-data-string.dmn").toString())));
  }
}

