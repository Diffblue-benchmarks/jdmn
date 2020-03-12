package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.runtime.RuleOutput;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class InterpretedRuleOutputDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    InterpretedRuleOutput actualInterpretedRuleOutput = new InterpretedRuleOutput(true, "(matched=");

    // Assert
    assertEquals("(matched=true, result='(matched=')", actualInterpretedRuleOutput.toString());
    assertTrue(actualInterpretedRuleOutput.isMatched());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new InterpretedRuleOutput(true, "(matched=")).equals("(matched="));
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1013222547, (new InterpretedRuleOutput(true, "(matched=")).hashCode());
  }

  @Test
  public void sortTest() {
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
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("(matched=true, result='(matched=')", (new InterpretedRuleOutput(true, "(matched=")).toString());
  }
}

