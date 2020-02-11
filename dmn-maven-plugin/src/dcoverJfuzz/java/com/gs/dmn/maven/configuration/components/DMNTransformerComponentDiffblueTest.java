package com.gs.dmn.maven.configuration.components;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DMNTransformerComponentDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange, Act and Assert
    assertEquals("name", (new DMNTransformerComponent("name")).getName());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("", (new DMNTransformerComponent()).getName());
  }

  @Test(timeout=10000)
  public void getElementNameTest() {
    // Arrange, Act and Assert
    assertEquals("dmnTransformer", (new DMNTransformerComponent()).getElementName());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    DMNTransformerComponent actualDmnTransformerComponent = new DMNTransformerComponent("name", null);

    // Assert
    String actualName = actualDmnTransformerComponent.getName();
    assertEquals("name", actualName);
    assertNull(actualDmnTransformerComponent.getConfiguration());
  }
}

