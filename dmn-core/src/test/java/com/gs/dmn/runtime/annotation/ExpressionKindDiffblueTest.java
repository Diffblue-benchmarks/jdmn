package com.gs.dmn.runtime.annotation;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TContext;
import org.omg.spec.dmn._20180521.model.TDecisionTable;
import org.omg.spec.dmn._20180521.model.TExpression;
import org.omg.spec.dmn._20180521.model.TFunctionDefinition;
import org.omg.spec.dmn._20180521.model.TInvocation;
import org.omg.spec.dmn._20180521.model.TList;
import org.omg.spec.dmn._20180521.model.TLiteralExpression;
import org.omg.spec.dmn._20180521.model.TRelation;

public class ExpressionKindDiffblueTest {
  @Test
  public void testKindByClass() {
    // Arrange
    ExpressionKind actualKindByClassResult = ExpressionKind.kindByClass(new TExpression());
    ExpressionKind actualKindByClassResult1 = ExpressionKind.kindByClass(new TFunctionDefinition());
    ExpressionKind actualKindByClassResult2 = ExpressionKind.kindByClass(new TDecisionTable());
    ExpressionKind actualKindByClassResult3 = ExpressionKind.kindByClass(new TRelation());
    ExpressionKind actualKindByClassResult4 = ExpressionKind.kindByClass(new TList());
    ExpressionKind actualKindByClassResult5 = ExpressionKind.kindByClass(new TContext());
    ExpressionKind actualKindByClassResult6 = ExpressionKind.kindByClass(new TInvocation());

    // Act and Assert
    assertEquals(ExpressionKind.OTHER, actualKindByClassResult);
    assertEquals(ExpressionKind.FUNCTION_DEFINITION, actualKindByClassResult1);
    assertEquals(ExpressionKind.DECISION_TABLE, actualKindByClassResult2);
    assertEquals(ExpressionKind.RELATION, actualKindByClassResult3);
    assertEquals(ExpressionKind.LIST, actualKindByClassResult4);
    assertEquals(ExpressionKind.CONTEXT, actualKindByClassResult5);
    assertEquals(ExpressionKind.INVOCATION, actualKindByClassResult6);
    assertEquals(ExpressionKind.LITERAL_EXPRESSION, ExpressionKind.kindByClass(new TLiteralExpression()));
  }
}

