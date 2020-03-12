package com.gs.dmn.runtime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.runtime.annotation.HitPolicy;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RuleOutputListDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void applyMultipleTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RuleOutputList()).applyMultiple(HitPolicy.RULE_ORDER).size());
  }

  @Test
  public void applyMultipleTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new RuleOutputList()).applyMultiple(HitPolicy.OUTPUT_ORDER).size());
  }

  @Test
  public void applyMultipleTest3() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new RuleOutputList()).applyMultiple(HitPolicy.UNIQUE);
  }

  @Test
  public void applyMultipleTest4() {
    // Arrange, Act and Assert
    assertEquals(0, (new RuleOutputList()).applyMultiple(HitPolicy.COLLECT).size());
  }

  @Test
  public void applySingleTest() {
    // Arrange, Act and Assert
    assertNull((new RuleOutputList()).applySingle(HitPolicy.PRIORITY));
  }

  @Test
  public void applySingleTest2() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new RuleOutputList()).applySingle(HitPolicy.COLLECT);
  }

  @Test
  public void applySingleTest3() {
    // Arrange, Act and Assert
    assertNull((new RuleOutputList()).applySingle(HitPolicy.FIRST));
  }

  @Test
  public void applySingleTest4() {
    // Arrange, Act and Assert
    assertNull((new RuleOutputList()).applySingle(HitPolicy.ANY));
  }

  @Test
  public void applySingleTest5() {
    // Arrange, Act and Assert
    assertNull((new RuleOutputList()).applySingle(HitPolicy.UNIQUE));
  }

  @Test
  public void applySingleTest6() {
    // Arrange, Act and Assert
    assertNull((new RuleOutputList()).applySingle(HitPolicy.RULE_ORDER));
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    List<RuleOutput> matchedRuleResults = (new RuleOutputList()).getMatchedRuleResults();
    assertTrue(matchedRuleResults instanceof java.util.ArrayList);
    assertEquals(0, matchedRuleResults.size());
  }

  @Test
  public void noMatchedRulesTest() {
    // Arrange, Act and Assert
    assertTrue((new RuleOutputList()).noMatchedRules());
  }
}

