package com.gs.dmn.runtime.interpreter.environment;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.runtime.interpreter.InputClausePair;
import java.util.ArrayList;
import org.junit.Test;

public class RuntimeEnvironmentFactoryDiffblueTest {
  @Test
  public void testMakeEnvironment() {
    // Arrange
    RuntimeEnvironmentFactory runtimeEnvironmentFactory = new RuntimeEnvironmentFactory();
    RuntimeEnvironment runtimeEnvironment = new RuntimeEnvironment(
        new Environment<String, Object>(new Environment<String, Object>(new Environment<String, Object>(null))));

    // Act and Assert
    assertSame(runtimeEnvironment, runtimeEnvironmentFactory.makeEnvironment(runtimeEnvironment).getParent());
  }

  @Test
  public void testMakeEnvironment2() {
    // Arrange, Act and Assert
    assertNull((new RuntimeEnvironmentFactory()).makeEnvironment().getParent());
  }

  @Test
  public void testMakeInputEntryEnvironment() {
    // Arrange
    RuntimeEnvironmentFactory runtimeEnvironmentFactory = new RuntimeEnvironmentFactory();
    ArrayList<InputClausePair> inputClausePairList = new ArrayList<InputClausePair>(1);
    inputClausePairList.add(new InputClausePair(new ExpressionList(), "value"));
    inputClausePairList.add(new InputClausePair(new ExpressionList(), "value"));
    RuntimeEnvironment runtimeEnvironment = new RuntimeEnvironment(
        new Environment<String, Object>(new Environment<String, Object>(new Environment<String, Object>(null))));

    // Act and Assert
    assertSame(runtimeEnvironment,
        runtimeEnvironmentFactory.makeInputEntryEnvironment(inputClausePairList, runtimeEnvironment, 1).getParent());
  }
}

