package com.gs.dmn.runtime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.runtime.annotation.HitPolicy;
import java.util.List;
import org.junit.Test;

public class RuleOutputListDiffblueTest {
  @Test
  public void testApplyMultiple() {
    // Arrange, Act and Assert
    assertEquals(0, (new RuleOutputList()).applyMultiple(HitPolicy.COLLECT).size());
  }

  @Test
  public void testApplyMultiple2() {
    // Arrange, Act and Assert
    assertEquals(0, (new RuleOutputList()).applyMultiple(HitPolicy.OUTPUT_ORDER).size());
  }

  @Test
  public void testApplyMultiple3() {
    // Arrange, Act and Assert
    assertEquals(0, (new RuleOutputList()).applyMultiple(HitPolicy.RULE_ORDER).size());
  }

  @Test
  public void testApplySingle() {
    // Arrange, Act and Assert
    assertNull((new RuleOutputList()).applySingle(HitPolicy.UNIQUE));
  }

  @Test
  public void testApplySingle2() {
    // Arrange, Act and Assert
    assertNull((new RuleOutputList()).applySingle(null));
  }

  @Test
  public void testApplySingle3() {
    // Arrange, Act and Assert
    assertNull((new RuleOutputList()).applySingle(HitPolicy.ANY));
  }

  @Test
  public void testApplySingle4() {
    // Arrange, Act and Assert
    assertNull((new RuleOutputList()).applySingle(HitPolicy.FIRST));
  }

  @Test
  public void testApplySingle5() {
    // Arrange, Act and Assert
    assertNull((new RuleOutputList()).applySingle(HitPolicy.RULE_ORDER));
  }

  @Test
  public void testApplySingle6() {
    // Arrange, Act and Assert
    assertNull((new RuleOutputList()).applySingle(HitPolicy.PRIORITY));
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    List<RuleOutput> matchedRuleResults = (new RuleOutputList()).getMatchedRuleResults();
    assertTrue(matchedRuleResults instanceof java.util.ArrayList);
    assertEquals(0, matchedRuleResults.size());
  }

  @Test
  public void testNoMatchedRules() {
    // Arrange, Act and Assert
    assertTrue((new RuleOutputList()).noMatchedRules());
  }
}

