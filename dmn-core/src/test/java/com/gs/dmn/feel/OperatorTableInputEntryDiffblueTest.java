package com.gs.dmn.feel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.ContextType;
import org.junit.Test;

public class OperatorTableInputEntryDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    OperatorTableInputEntry actualOperatorTableInputEntry = new OperatorTableInputEntry("operator", new AnyType(),
        new AnyType());

    // Assert
    assertEquals("operator", actualOperatorTableInputEntry.getOperator());
    assertEquals("operator(Any, Any)", actualOperatorTableInputEntry.toString());
  }

  @Test
  public void testEquivalentTo() {
    // Arrange
    AnyType anyType = new AnyType();
    OperatorTableInputEntry operatorTableInputEntry = new OperatorTableInputEntry("operator", anyType, anyType);

    // Act and Assert
    assertFalse(operatorTableInputEntry.equivalentTo(new OperatorTableInputEntry("operator", anyType, anyType)));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    ContextType contextType = new ContextType();
    OperatorTableInputEntry operatorTableInputEntry = new OperatorTableInputEntry("operator", contextType, contextType);

    // Act and Assert
    assertTrue(operatorTableInputEntry.equivalentTo(new OperatorTableInputEntry("operator", contextType, contextType)));
  }

  @Test
  public void testConformsTo() {
    // Arrange
    AnyType anyType = new AnyType();
    OperatorTableInputEntry operatorTableInputEntry = new OperatorTableInputEntry("operator", anyType, anyType);

    // Act and Assert
    assertFalse(operatorTableInputEntry.conformsTo(new OperatorTableInputEntry("operator", anyType, anyType)));
  }

  @Test
  public void testConformsTo2() {
    // Arrange
    AnyType anyType = new AnyType();
    OperatorTableInputEntry operatorTableInputEntry = new OperatorTableInputEntry("", anyType, anyType);

    // Act and Assert
    assertFalse(operatorTableInputEntry.conformsTo(new OperatorTableInputEntry("operator", anyType, anyType)));
  }

  @Test
  public void testConformsTo3() {
    // Arrange
    ContextType contextType = new ContextType();
    OperatorTableInputEntry operatorTableInputEntry = new OperatorTableInputEntry("operator", contextType, contextType);

    // Act and Assert
    assertTrue(operatorTableInputEntry.conformsTo(new OperatorTableInputEntry("operator", contextType, contextType)));
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new OperatorTableInputEntry("operator", new AnyType(), new AnyType())).equals("o"));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new OperatorTableInputEntry("operator", new AnyType(), new AnyType())).equals(null));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(4362148, (new OperatorTableInputEntry("operator", null, null)).hashCode());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("operator(Any, Any)",
        (new OperatorTableInputEntry("operator", new AnyType(), new AnyType())).toString());
  }
}

