package com.gs.dmn.feel;

import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.NumberType;
import com.gs.dmn.feel.analysis.semantics.type.StringType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import org.junit.Test;

public class OperatorDecisionTableDiffblueTest {
  @Test
  public void testResultType() {
    // Arrange and Act
    Type actualResultTypeResult = OperatorDecisionTable.resultType("+", new StringType(), new StringType());

    // Assert
    assertSame(((StringType) actualResultTypeResult).STRING, actualResultTypeResult);
  }

  @Test
  public void testResultType2() {
    // Arrange and Act
    Type actualResultTypeResult = OperatorDecisionTable.resultType("*", new NumberType(), new NumberType());

    // Assert
    assertSame(((NumberType) actualResultTypeResult).NUMBER, actualResultTypeResult);
  }

  @Test
  public void testResultType3() {
    // Arrange and Act
    Type actualResultTypeResult = OperatorDecisionTable.resultType("+", new StringType(), new StringType());

    // Assert
    assertSame(((StringType) actualResultTypeResult).STRING, actualResultTypeResult);
  }
}

