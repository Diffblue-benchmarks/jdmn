package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import org.junit.Test;

public class ResultDiffblueTest {
  @Test
  public void testValue() {
    // Arrange, Act and Assert
    assertNull(Result.value(null));
  }

  @Test
  public void testValue2() {
    // Arrange, Act and Assert
    assertEquals("value", Result.value(new Result("value", new AnyType())));
  }

  @Test
  public void testType() {
    // Arrange, Act and Assert
    assertNull(Result.type(null));
  }

  @Test
  public void testType2() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act and Assert
    assertSame(anyType, Result.type(new Result("value", anyType)));
  }

  @Test
  public void testConstructor() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act
    Result actualResult = new Result("value", anyType);

    // Assert
    assertSame(anyType, actualResult.getType());
    assertTrue(actualResult.getValue() instanceof String);
  }
}

