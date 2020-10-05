package com.gs.dmn.tck;

import static org.junit.Assert.assertTrue;
import java.io.File;
import java.nio.file.Paths;
import org.junit.Test;

public class TestCasesReaderDiffblueTest {
  @Test
  public void testIsTCKFile() {
    // Arrange, Act and Assert
    assertTrue(TestCasesReader.isTCKFile(new File(Paths.get(System.getProperty("user.home"), "x", "devel", "diffblue",
        "benchmarks", "jdmn", "dmn-tck-it", "dmn-tck-it-translator", "..", "dmn-tck-it-interpreter", "src", "main",
        "resources", "tck", "cl2", "0001-input-data-string-test-01.xml").toString())));
    assertTrue(TestCasesReader.isTCKFile(new File(Paths.get(System.getProperty("user.home"), "x", "devel", "diffblue",
        "benchmarks", "jdmn", "dmn-tck-it", "dmn-tck-it-translator", "..", "dmn-tck-it-interpreter", "src", "main",
        "resources", "tck", "cl2", "0002-input-data-number-test-01.xml").toString())));
    assertTrue(TestCasesReader.isTCKFile(new File(Paths.get(System.getProperty("user.home"), "x", "devel", "diffblue",
        "benchmarks", "jdmn", "dmn-tck-it", "dmn-tck-it-translator", "..", "dmn-tck-it-interpreter", "src", "main",
        "resources", "tck", "cl2", "0003-input-data-string-allowed-values-test-01.xml").toString())));
  }
}

