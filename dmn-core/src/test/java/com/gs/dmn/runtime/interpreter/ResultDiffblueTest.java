package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import org.junit.Test;

public class ResultDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act
    Result actualResult = new Result("value", anyType);

    // Assert
    assertSame(anyType, actualResult.getType());
    assertTrue(actualResult.getValue() instanceof String);
  }

  @Test
  public void typeTest() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act and Assert
    assertSame(anyType, Result.type(new Result("value", anyType)));
  }

  @Test
  public void valueTest() {
    // Arrange, Act and Assert
    assertEquals("value", Result.value(new Result("value", new AnyType())));
  }
}

