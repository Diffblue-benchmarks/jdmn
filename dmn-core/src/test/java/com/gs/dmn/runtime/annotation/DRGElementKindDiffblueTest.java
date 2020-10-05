package com.gs.dmn.runtime.annotation;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDecision;

public class DRGElementKindDiffblueTest {
  @Test
  public void testKindByClass() {
    // Arrange, Act and Assert
    assertEquals(DRGElementKind.DECISION, DRGElementKind.kindByClass(TDecision.class));
    assertEquals(DRGElementKind.DECISION, DRGElementKind.kindByClass(TDecision.class));
    assertEquals(DRGElementKind.DECISION, DRGElementKind.kindByClass(TDecision.class));
  }
}

