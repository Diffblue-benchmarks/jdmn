package com.gs.dmn.runtime.external;

import com.gs.dmn.runtime.DMNRuntimeException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DefaultExternalFunctionExecutorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void executeTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DefaultExternalFunctionExecutor()).execute("className", "methodName", new Object[]{"foo", "foo", "foo"});
  }
  @Test
  public void executeTest2() {
    // Arrange
    Object[] objectArray = new Object[1485];
    objectArray[0] = "foo";
    objectArray[1] = "foo";
    objectArray[2] = "foo";

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DefaultExternalFunctionExecutor()).execute("className", "methodName", objectArray);
  }
}

