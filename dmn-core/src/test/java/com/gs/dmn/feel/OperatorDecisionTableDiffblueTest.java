package com.gs.dmn.feel;

import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.BooleanType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.runtime.DMNRuntimeException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OperatorDecisionTableDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void javaOperatorTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    OperatorDecisionTable.javaOperator("*", new AnyType(), new AnyType());
  }
  @Test
  public void resultTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    OperatorDecisionTable.resultType("*", new AnyType(), new AnyType());
  }
  @Test
  public void resultTypeTest2() {
    // Arrange and Act
    Type actualResultTypeResult = OperatorDecisionTable.resultType("!=", new AnyType(), new AnyType());

    // Assert
    assertSame(((BooleanType) actualResultTypeResult).BOOLEAN, actualResultTypeResult);
  }
}

