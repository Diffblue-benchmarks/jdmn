package com.gs.dmn.runtime.annotation;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TLiteralExpression;

public class ExpressionKindDiffblueTest {
  @Test
  public void testKindByClass() {
    // Arrange, Act and Assert
    assertEquals(ExpressionKind.LITERAL_EXPRESSION, ExpressionKind.kindByClass(TLiteralExpression.class));
    assertEquals(ExpressionKind.LITERAL_EXPRESSION, ExpressionKind.kindByClass(TLiteralExpression.class));
    assertEquals(ExpressionKind.LITERAL_EXPRESSION, ExpressionKind.kindByClass(TLiteralExpression.class));
  }
}

