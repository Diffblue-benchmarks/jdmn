package com.gs.dmn.runtime.listener;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.runtime.annotation.DRGElementKind;
import com.gs.dmn.runtime.annotation.ExpressionKind;
import com.gs.dmn.runtime.annotation.HitPolicy;
import org.junit.Test;

public class DRGElementDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    DRGElement actualDrgElement = new DRGElement("namespace", "name", "label", DRGElementKind.DECISION,
        ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 3);

    // Assert
    assertEquals("namespace", actualDrgElement.getNamespace());
    assertEquals(HitPolicy.UNIQUE, actualDrgElement.getHitPolicy());
    assertEquals(ExpressionKind.FUNCTION_DEFINITION, actualDrgElement.getExpressionKind());
    assertEquals("label", actualDrgElement.getLabel());
    assertEquals(DRGElementKind.DECISION, actualDrgElement.getElementKind());
    assertEquals("name", actualDrgElement.getName());
    assertEquals(3, actualDrgElement.getRulesCount());
  }
}

