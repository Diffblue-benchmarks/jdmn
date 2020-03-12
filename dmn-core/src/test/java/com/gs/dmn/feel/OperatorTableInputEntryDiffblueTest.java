package com.gs.dmn.feel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import org.junit.Test;

public class OperatorTableInputEntryDiffblueTest {
  @Test
  public void conformsToTest() {
    // Arrange
    AnyType anyType = new AnyType();
    OperatorTableInputEntry operatorTableInputEntry = new OperatorTableInputEntry("", anyType, anyType);

    // Act and Assert
    assertFalse(operatorTableInputEntry.conformsTo(new OperatorTableInputEntry("operator", anyType, anyType)));
  }

  @Test
  public void conformsToTest2() {
    // Arrange
    AnyType anyType = new AnyType();
    OperatorTableInputEntry operatorTableInputEntry = new OperatorTableInputEntry("operator", anyType, anyType);

    // Act and Assert
    assertFalse(operatorTableInputEntry.conformsTo(new OperatorTableInputEntry("operator", anyType, anyType)));
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    OperatorTableInputEntry actualOperatorTableInputEntry = new OperatorTableInputEntry("operator", new AnyType(),
        new AnyType());

    // Assert
    assertEquals("operator", actualOperatorTableInputEntry.getOperator());
    assertEquals("operator(Any, Any)", actualOperatorTableInputEntry.toString());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new OperatorTableInputEntry("operator", new AnyType(), new AnyType())).equals("o"));
  }

  @Test
  public void equivalentToTest() {
    // Arrange
    AnyType anyType = new AnyType();
    OperatorTableInputEntry operatorTableInputEntry = new OperatorTableInputEntry("operator", anyType, anyType);

    // Act and Assert
    assertFalse(operatorTableInputEntry.equivalentTo(new OperatorTableInputEntry("operator", anyType, anyType)));
  }

  @Test
  public void equivalentToTest2() {
    // Arrange
    AnyType anyType = new AnyType();
    OperatorTableInputEntry operatorTableInputEntry = new OperatorTableInputEntry("", anyType, anyType);

    // Act and Assert
    assertFalse(operatorTableInputEntry.equivalentTo(new OperatorTableInputEntry("operator", anyType, anyType)));
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("operator(Any, Any)",
        (new OperatorTableInputEntry("operator", new AnyType(), new AnyType())).toString());
  }
}

