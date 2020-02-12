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
  @Test(timeout=10000)
  public void resultTypeTest2() {
    // Arrange
    AnyType leftType = new AnyType();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    OperatorDecisionTable.resultType("name", leftType, new AnyType());
  }
  @Test(timeout=10000)
  public void resultTypeTest() {
    // Arrange
    AnyType leftType = new AnyType();
    Type resultTypeResult = OperatorDecisionTable.resultType("==", leftType, new AnyType());
    AnyType leftType1 = new AnyType();

    // Act
    Type actualResultTypeResult = OperatorDecisionTable.resultType("=", leftType1, new AnyType());

    // Assert
    assertSame(((BooleanType) resultTypeResult).BOOLEAN, resultTypeResult);
    assertSame(((BooleanType) actualResultTypeResult).BOOLEAN, actualResultTypeResult);
  }
  @Test(timeout=10000)
  public void javaOperatorTest() {
    // Arrange
    AnyType leftType = new AnyType();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    OperatorDecisionTable.javaOperator("name", leftType, new AnyType());
  }
}

