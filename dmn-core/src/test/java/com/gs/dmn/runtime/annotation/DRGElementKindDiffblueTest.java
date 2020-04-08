package com.gs.dmn.runtime.annotation;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TBusinessKnowledgeModel;
import org.omg.spec.dmn._20180521.model.TDRGElement;
import org.omg.spec.dmn._20180521.model.TDecision;
import org.omg.spec.dmn._20180521.model.TDecisionService;
import org.omg.spec.dmn._20180521.model.TInputData;
import org.omg.spec.dmn._20180521.model.TKnowledgeSource;

public class DRGElementKindDiffblueTest {
  @Test
  public void testKindByClass() {
    // Arrange
    DRGElementKind actualKindByClassResult = DRGElementKind.kindByClass(new TDRGElement());
    DRGElementKind actualKindByClassResult1 = DRGElementKind.kindByClass(new TDecision());
    DRGElementKind actualKindByClassResult2 = DRGElementKind.kindByClass(new TDecisionService());
    DRGElementKind actualKindByClassResult3 = DRGElementKind.kindByClass(new TBusinessKnowledgeModel());
    DRGElementKind actualKindByClassResult4 = DRGElementKind.kindByClass(new TInputData());

    // Act and Assert
    assertEquals(DRGElementKind.OTHER, actualKindByClassResult);
    assertEquals(DRGElementKind.DECISION, actualKindByClassResult1);
    assertEquals(DRGElementKind.DECISION_SERVICE, actualKindByClassResult2);
    assertEquals(DRGElementKind.BUSINESS_KNOWLEDGE_MODEL, actualKindByClassResult3);
    assertEquals(DRGElementKind.INPUT_DATA, actualKindByClassResult4);
    assertEquals(DRGElementKind.KNOWLEDGE_SOURCE, DRGElementKind.kindByClass(new TKnowledgeSource()));
  }
}

