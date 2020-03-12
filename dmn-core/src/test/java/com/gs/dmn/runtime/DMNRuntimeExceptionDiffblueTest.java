package com.gs.dmn.runtime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class DMNRuntimeExceptionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    Throwable throwable = new Throwable();

    // Act and Assert
    assertSame((new DMNRuntimeException("An error occurred", throwable)).getCause(), throwable);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    DMNRuntimeException actualDmnRuntimeException = new DMNRuntimeException("An error occurred");

    // Assert
    assertEquals("com.gs.dmn.runtime.DMNRuntimeException: An error" + " occurred",
        actualDmnRuntimeException.toString());
    assertEquals("An error occurred", actualDmnRuntimeException.getLocalizedMessage());
    assertNull(actualDmnRuntimeException.getCause());
    assertEquals("An error occurred", actualDmnRuntimeException.getMessage());
    assertEquals(0, actualDmnRuntimeException.getSuppressed().length);
  }

  @Test
  public void constructorTest3() {
    // Arrange
    Throwable throwable = new Throwable();

    // Act and Assert
    assertSame((new DMNRuntimeException(throwable)).getCause(), throwable);
  }
}

