package com.gs.dmn.runtime.annotation;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDRGElement;

public class DRGElementKindDiffblueTest {
  @Test(timeout=10000)
  public void kindByClassTest() {
    // Arrange, Act and Assert
    assertEquals(DRGElementKind.OTHER, DRGElementKind.kindByClass(new TDRGElement()));
  }
}

