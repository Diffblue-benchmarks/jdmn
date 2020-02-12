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

  @Test(timeout=10000)
  public void getMatchedRuleResultsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RuleOutputList()).getMatchedRuleResults().size());
  }

  @Test(timeout=10000)
  public void applySingleTest() {
    // Arrange, Act and Assert
    assertNull((new RuleOutputList()).applySingle(HitPolicy.UNIQUE));
  }

  @Test(timeout=10000)
  public void applyMultipleTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    (new RuleOutputList()).applyMultiple(HitPolicy.UNIQUE);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    List<RuleOutput> matchedRuleResults = (new RuleOutputList()).getMatchedRuleResults();
    assertTrue(matchedRuleResults instanceof java.util.ArrayList);
    assertEquals(0, matchedRuleResults.size());
  }

  @Test(timeout=10000)
  public void noMatchedRulesTest() {
    // Arrange, Act and Assert
    assertTrue((new RuleOutputList()).noMatchedRules());
  }
}

