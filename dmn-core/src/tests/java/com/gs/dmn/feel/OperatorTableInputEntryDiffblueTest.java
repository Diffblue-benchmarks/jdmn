package com.gs.dmn.feel;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import org.junit.Test;

public class OperatorTableInputEntryDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    AnyType leftOperandType = new AnyType();

    // Act
    OperatorTableInputEntry actualOperatorTableInputEntry = new OperatorTableInputEntry("foo", leftOperandType,
        new AnyType());

    // Assert
    String actualToStringResult = actualOperatorTableInputEntry.toString();
    assertEquals("foo", actualOperatorTableInputEntry.getOperator());
    assertEquals("foo(Any, Any)", actualToStringResult);
  }
}

