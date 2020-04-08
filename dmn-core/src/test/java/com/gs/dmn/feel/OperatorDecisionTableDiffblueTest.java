package com.gs.dmn.feel;

import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.BooleanType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import org.junit.Test;

public class OperatorDecisionTableDiffblueTest {
  @Test
  public void testResultType() {
    // Arrange and Act
    Type actualResultTypeResult = OperatorDecisionTable.resultType("!=", new AnyType(), new AnyType());

    // Assert
    assertSame(((BooleanType) actualResultTypeResult).BOOLEAN, actualResultTypeResult);
  }
}

