package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import org.junit.Test;

public class ResultDiffblueTest {
  @Test(timeout=10000)
  public void getValueTest() {
    // Arrange, Act and Assert
    assertEquals("value", (new Result("value", new AnyType())).getValue());
  }

  @Test(timeout=10000)
  public void valueTest() {
    // Arrange, Act and Assert
    assertEquals("value", Result.value(new Result("value", new AnyType())));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act
    Result actualResult = new Result("value", anyType);

    // Assert
    Type actualType = actualResult.getType();
    assertSame(anyType, actualType);
    assertTrue(actualResult.getValue() instanceof String);
  }

  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act and Assert
    assertSame(anyType, (new Result("value", anyType)).getType());
  }

  @Test(timeout=10000)
  public void typeTest() {
    // Arrange
    AnyType anyType = new AnyType();

    // Act and Assert
    assertSame(anyType, Result.type(new Result("value", anyType)));
  }
}

