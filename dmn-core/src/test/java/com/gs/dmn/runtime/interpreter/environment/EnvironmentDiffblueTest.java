package com.gs.dmn.runtime.interpreter.environment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class EnvironmentDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    Environment<Object, Object> environment = new Environment<Object, Object>(
        new Environment<Object, Object>(new Environment<Object, Object>(new Environment<Object, Object>(null))));

    // Act and Assert
    assertSame(environment, (new Environment<Object, Object>(environment)).getParent());
  }

  @Test
  public void testLookupBinding() {
    // Arrange, Act and Assert
    assertNull((new Environment<Object, Object>(
        new Environment<Object, Object>(new Environment<Object, Object>(new Environment<Object, Object>(null)))))
            .lookupBinding("key"));
  }

  @Test
  public void testIsBound() {
    // Arrange, Act and Assert
    assertFalse((new Environment<Object, Object>(
        new Environment<Object, Object>(new Environment<Object, Object>(new Environment<Object, Object>(null)))))
            .isBound("key"));
  }
}

