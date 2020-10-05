package com.gs.dmn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.gs.dmn.runtime.interpreter.ImportPath;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDRGElement;
import org.omg.spec.dmn._20180521.model.TInputData;

public class DRGElementReferenceDiffblueTest {
  @Test
  public void testGetElementName() {
    // Arrange
    ImportPath importPath = new ImportPath(new ImportPath(), null);

    // Act and Assert
    assertNull((new DRGElementReference<TDRGElement>(importPath, "https://github.com/agilepro/dmn-tck",
        "0001-input-data-string", new TInputData())).getElementName());
  }

  @Test
  public void testGetElementName2() {
    // Arrange
    ImportPath importPath = new ImportPath(new ImportPath(), null);

    // Act and Assert
    assertNull((new DRGElementReference<TDRGElement>(importPath, "https://github.com/agilepro/dmn-tck",
        "0001-input-data-string", new TInputData())).getElementName());
  }

  @Test
  public void testGetElementName3() {
    // Arrange
    ImportPath importPath = new ImportPath(new ImportPath(), null);

    // Act and Assert
    assertNull((new DRGElementReference<TDRGElement>(importPath, "https://github.com/agilepro/dmn-tck",
        "0001-input-data-string", new TInputData())).getElementName());
  }

  @Test
  public void testGetQualifiedHref() {
    // Arrange
    ImportPath importPath = new ImportPath(new ImportPath(), null);

    // Act and Assert
    assertEquals("https://github.com/agilepro/dmn-tck#null", (new DRGElementReference<TDRGElement>(importPath,
        "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TInputData())).getQualifiedHref());
  }

  @Test
  public void testGetQualifiedHref2() {
    // Arrange
    ImportPath importPath = new ImportPath(new ImportPath(), null);

    // Act and Assert
    assertEquals("https://github.com/agilepro/dmn-tck#null", (new DRGElementReference<TDRGElement>(importPath,
        "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TInputData())).getQualifiedHref());
  }

  @Test
  public void testGetQualifiedHref3() {
    // Arrange
    ImportPath importPath = new ImportPath(new ImportPath(), null);

    // Act and Assert
    assertEquals("https://github.com/agilepro/dmn-tck#null", (new DRGElementReference<TDRGElement>(importPath,
        "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TInputData())).getQualifiedHref());
  }
}

