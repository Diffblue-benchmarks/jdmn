package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.runtime.Context;
import com.gs.dmn.runtime.Pair;
import com.gs.dmn.runtime.RuleOutput;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class InterpretedRuleOutputDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    InterpretedRuleOutput actualInterpretedRuleOutput = new InterpretedRuleOutput(true, "(matched=");

    // Assert
    assertEquals("(matched=true, result='(matched=')", actualInterpretedRuleOutput.toString());
    assertTrue(actualInterpretedRuleOutput.isMatched());
  }

  @Test
  public void testSort() {
    // Arrange
    Pair pair = new Pair("left", "left");
    InterpretedRuleOutput interpretedRuleOutput = new InterpretedRuleOutput(true, pair);
    InterpretedRuleOutput param0 = new InterpretedRuleOutput(true, pair);
    ArrayList<RuleOutput> ruleOutputList = new ArrayList<RuleOutput>();
    ruleOutputList.add(param0);

    // Act
    List<RuleOutput> actualSortResult = interpretedRuleOutput.sort(ruleOutputList);

    // Assert
    assertEquals(1, actualSortResult.size());
    RuleOutput getResult = actualSortResult.get(0);
    assertEquals(interpretedRuleOutput, getResult);
    assertTrue(getResult.isMatched());
  }

  @Test
  public void testSort2() {
    // Arrange
    InterpretedRuleOutput interpretedRuleOutput = new InterpretedRuleOutput(true, "(matched=");
    InterpretedRuleOutput param0 = new InterpretedRuleOutput(true, "(matched=");
    ArrayList<RuleOutput> ruleOutputList = new ArrayList<RuleOutput>();
    ruleOutputList.add(param0);

    // Act
    List<RuleOutput> actualSortResult = interpretedRuleOutput.sort(ruleOutputList);

    // Assert
    assertSame(ruleOutputList, actualSortResult);
    assertEquals(1, actualSortResult.size());
  }

  @Test
  public void testSort3() {
    // Arrange
    Context context = new Context();
    InterpretedRuleOutput interpretedRuleOutput = new InterpretedRuleOutput(true, context);
    InterpretedRuleOutput param0 = new InterpretedRuleOutput(true, context);
    ArrayList<RuleOutput> ruleOutputList = new ArrayList<RuleOutput>();
    ruleOutputList.add(param0);

    // Act
    List<RuleOutput> actualSortResult = interpretedRuleOutput.sort(ruleOutputList);

    // Assert
    assertEquals(1, actualSortResult.size());
    RuleOutput getResult = actualSortResult.get(0);
    Object result = ((InterpretedRuleOutput) getResult).getResult();
    assertEquals("(matched=true, result='com.gs.dmn.runtime" + ".Context@0')", getResult.toString());
    assertTrue(getResult.isMatched());
    assertEquals("com.gs.dmn.runtime.Context@0", result.toString());
  }

  @Test
  public void testEquals() {
    // Arrange
    InterpretedRuleOutput interpretedRuleOutput = new InterpretedRuleOutput(true, "(matched=");

    // Act and Assert
    assertFalse((new InterpretedRuleOutput(false, interpretedRuleOutput)).equals(interpretedRuleOutput));
  }

  @Test
  public void testEquals2() {
    // Arrange
    InterpretedRuleOutput interpretedRuleOutput = new InterpretedRuleOutput(true, "(matched=");

    // Act and Assert
    assertFalse((new InterpretedRuleOutput(true, interpretedRuleOutput)).equals(interpretedRuleOutput));
  }

  @Test
  public void testEquals3() {
    // Arrange, Act and Assert
    assertFalse((new InterpretedRuleOutput(true, "(matched=")).equals("(matched="));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(1013222547, (new InterpretedRuleOutput(true, "(matched=")).hashCode());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("(matched=true, result='(matched=')", (new InterpretedRuleOutput(true, "(matched=")).toString());
  }
}

