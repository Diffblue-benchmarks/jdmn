package com.gs.dmn.runtime.interpreter.environment;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.runtime.interpreter.InputClausePair;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RuntimeEnvironmentFactoryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void makeEnvironmentTest() {
    // Arrange
    RuntimeEnvironmentFactory runtimeEnvironmentFactory = new RuntimeEnvironmentFactory();
    RuntimeEnvironment runtimeEnvironment = new RuntimeEnvironment(
        new Environment<String, Object>(new Environment<String, Object>(new Environment<String, Object>(null))));

    // Act and Assert
    assertSame(runtimeEnvironment, runtimeEnvironmentFactory.makeEnvironment(runtimeEnvironment).getParent());
  }

  @Test
  public void makeEnvironmentTest2() {
    // Arrange, Act and Assert
    assertNull((new RuntimeEnvironmentFactory()).makeEnvironment().getParent());
  }

  @Test
  public void makeInputEntryEnvironmentTest() {
    // Arrange
    RuntimeEnvironmentFactory runtimeEnvironmentFactory = new RuntimeEnvironmentFactory();
    ArrayList<InputClausePair> inputClausePairList = new ArrayList<InputClausePair>();
    inputClausePairList.add(new InputClausePair(new ExpressionList(), "value"));

    // Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    runtimeEnvironmentFactory.makeInputEntryEnvironment(inputClausePairList,
        new RuntimeEnvironment(
            new Environment<String, Object>(new Environment<String, Object>(new Environment<String, Object>(null)))),
        1);
  }

  @Test
  public void makeInputEntryEnvironmentTest2() {
    // Arrange
    RuntimeEnvironmentFactory runtimeEnvironmentFactory = new RuntimeEnvironmentFactory();
    ArrayList<InputClausePair> inputClausePairList = new ArrayList<InputClausePair>();
    inputClausePairList.add(new InputClausePair(new ExpressionList(), "value"));
    RuntimeEnvironment runtimeEnvironment = new RuntimeEnvironment(
        new Environment<String, Object>(new Environment<String, Object>(new Environment<String, Object>(null))));

    // Act and Assert
    assertSame(runtimeEnvironment,
        runtimeEnvironmentFactory.makeInputEntryEnvironment(inputClausePairList, runtimeEnvironment, 0).getParent());
  }
}

