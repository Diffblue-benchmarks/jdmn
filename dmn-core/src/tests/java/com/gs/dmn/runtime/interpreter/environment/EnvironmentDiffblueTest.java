package com.gs.dmn.runtime.interpreter.environment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class EnvironmentDiffblueTest {
  @Test(timeout=10000)
  public void isBoundTest() {
    // Arrange, Act and Assert
    assertFalse((new Environment<Object, Object>(
        new Environment<Object, Object>(new Environment<Object, Object>(new Environment<Object, Object>(null)))))
            .isBound("foo"));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    Environment<Object, Object> environment = new Environment<Object, Object>(
        new Environment<Object, Object>(new Environment<Object, Object>(new Environment<Object, Object>(null))));

    // Act and Assert
    assertSame(environment, (new Environment<Object, Object>(environment)).getParent());
  }

  @Test(timeout=10000)
  public void getParentTest() {
    // Arrange
    Environment<Object, Object> environment = new Environment<Object, Object>(
        new Environment<Object, Object>(new Environment<Object, Object>(null)));

    // Act and Assert
    assertSame(environment, (new Environment<Object, Object>(environment)).getParent());
  }

  @Test(timeout=10000)
  public void lookupBindingTest() {
    // Arrange, Act and Assert
    assertNull((new Environment<Object, Object>(
        new Environment<Object, Object>(new Environment<Object, Object>(new Environment<Object, Object>(null)))))
            .lookupBinding("foo"));
  }
}

