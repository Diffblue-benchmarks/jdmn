package com.gs.dmn.runtime.external;

import com.gs.dmn.runtime.DMNRuntimeException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DefaultExternalFunctionExecutorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void executeTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DefaultExternalFunctionExecutor()).execute("name", "name", new Object[]{"foo", "foo", "foo"});
  }
}

