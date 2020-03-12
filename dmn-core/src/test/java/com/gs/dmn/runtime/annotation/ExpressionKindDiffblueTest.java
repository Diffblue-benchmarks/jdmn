package com.gs.dmn.runtime.annotation;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TExpression;

public class ExpressionKindDiffblueTest {
  @Test
  public void kindByClassTest() {
    // Arrange, Act and Assert
    assertEquals(ExpressionKind.OTHER, ExpressionKind.kindByClass(new TExpression()));
  }
}

