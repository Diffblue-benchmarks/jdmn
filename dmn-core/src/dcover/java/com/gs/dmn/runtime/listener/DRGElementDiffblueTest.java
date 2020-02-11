package com.gs.dmn.runtime.listener;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.runtime.annotation.DRGElementKind;
import com.gs.dmn.runtime.annotation.ExpressionKind;
import com.gs.dmn.runtime.annotation.HitPolicy;
import org.junit.Test;

public class DRGElementDiffblueTest {
  @Test(timeout=10000)
  public void getHitPolicyTest() {
    // Arrange, Act and Assert
    assertEquals(HitPolicy.UNIQUE, (new DRGElement("foo", "name", "foo", DRGElementKind.DECISION,
        ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 3)).getHitPolicy());
  }

  @Test(timeout=10000)
  public void getExpressionKindTest() {
    // Arrange, Act and Assert
    assertEquals(ExpressionKind.FUNCTION_DEFINITION, (new DRGElement("foo", "name", "foo", DRGElementKind.DECISION,
        ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 3)).getExpressionKind());
  }

  @Test(timeout=10000)
  public void getLabelTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new DRGElement("foo", "name", "foo", DRGElementKind.DECISION,
        ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 3)).getLabel());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    DRGElement actualDrgElement = new DRGElement("foo", "name", "foo", DRGElementKind.DECISION,
        ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 3);

    // Assert
    String actualNamespace = actualDrgElement.getNamespace();
    int actualRulesCount = actualDrgElement.getRulesCount();
    String actualName = actualDrgElement.getName();
    DRGElementKind actualElementKind = actualDrgElement.getElementKind();
    String actualLabel = actualDrgElement.getLabel();
    ExpressionKind actualExpressionKind = actualDrgElement.getExpressionKind();
    assertEquals("foo", actualNamespace);
    assertEquals(HitPolicy.UNIQUE, actualDrgElement.getHitPolicy());
    assertEquals(ExpressionKind.FUNCTION_DEFINITION, actualExpressionKind);
    assertEquals("foo", actualLabel);
    assertEquals(DRGElementKind.DECISION, actualElementKind);
    assertEquals("name", actualName);
    assertEquals(3, actualRulesCount);
  }

  @Test(timeout=10000)
  public void getElementKindTest() {
    // Arrange, Act and Assert
    assertEquals(DRGElementKind.DECISION, (new DRGElement("foo", "name", "foo", DRGElementKind.DECISION,
        ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 3)).getElementKind());
  }

  @Test(timeout=10000)
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new DRGElement("foo", "name", "foo", DRGElementKind.DECISION,
        ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 3)).getName());
  }

  @Test(timeout=10000)
  public void getRulesCountTest() {
    // Arrange, Act and Assert
    assertEquals(3, (new DRGElement("foo", "name", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION,
        HitPolicy.UNIQUE, 3)).getRulesCount());
  }

  @Test(timeout=10000)
  public void getNamespaceTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new DRGElement("foo", "name", "foo", DRGElementKind.DECISION,
        ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 3)).getNamespace());
  }
}

