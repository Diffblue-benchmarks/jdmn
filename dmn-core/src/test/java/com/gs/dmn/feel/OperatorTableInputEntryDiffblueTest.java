package com.gs.dmn.feel;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.ContextType;
import com.gs.dmn.feel.analysis.semantics.type.ItemDefinitionType;
import com.gs.dmn.feel.analysis.semantics.type.ListType;
import com.gs.dmn.feel.analysis.semantics.type.StringType;
import org.junit.Test;

public class OperatorTableInputEntryDiffblueTest {
  @Test
  public void testEquivalentTo() {
    // Arrange
    OperatorTableInputEntry other = new OperatorTableInputEntry("or", new AnyType(), new AnyType());

    // Act and Assert
    assertFalse((new OperatorTableInputEntry("+", new StringType(), new StringType())).equivalentTo(other));
  }

  @Test
  public void testEquivalentTo2() {
    // Arrange
    OperatorTableInputEntry other = new OperatorTableInputEntry("and", new AnyType(), new AnyType());

    // Act and Assert
    assertFalse((new OperatorTableInputEntry("+", new StringType(), new StringType())).equivalentTo(other));
  }

  @Test
  public void testEquivalentTo3() {
    // Arrange
    OperatorTableInputEntry other = new OperatorTableInputEntry("not", new AnyType(), null);

    // Act and Assert
    assertFalse((new OperatorTableInputEntry("+", new StringType(), new StringType())).equivalentTo(other));
  }

  @Test
  public void testConformsTo() {
    // Arrange
    OperatorTableInputEntry other = new OperatorTableInputEntry("or", new AnyType(), new AnyType());

    // Act and Assert
    assertFalse((new OperatorTableInputEntry("+", new StringType(), new StringType())).conformsTo(other));
  }

  @Test
  public void testConformsTo2() {
    // Arrange
    OperatorTableInputEntry other = new OperatorTableInputEntry("and", new AnyType(), new AnyType());

    // Act and Assert
    assertFalse((new OperatorTableInputEntry("+", new StringType(), new StringType())).conformsTo(other));
  }

  @Test
  public void testConformsTo3() {
    // Arrange
    OperatorTableInputEntry other = new OperatorTableInputEntry("not", new AnyType(), null);

    // Act and Assert
    assertFalse((new OperatorTableInputEntry("+", new StringType(), new StringType())).conformsTo(other));
  }

  @Test
  public void testEquals() {
    // Arrange
    OperatorTableInputEntry o = new OperatorTableInputEntry("=", new ContextType(), new ContextType());

    // Act and Assert
    assertTrue((new OperatorTableInputEntry("=", new ItemDefinitionType(""), new ItemDefinitionType(""))).equals(o));
  }

  @Test
  public void testEquals2() {
    // Arrange
    AnyType anyType = new AnyType();
    OperatorTableInputEntry o = new OperatorTableInputEntry("=", new ListType(anyType), new ListType(anyType));

    // Act and Assert
    assertFalse((new OperatorTableInputEntry("=", anyType, anyType)).equals(o));
  }

  @Test
  public void testEquals3() {
    // Arrange
    ItemDefinitionType leftOperandType = new ItemDefinitionType("");
    OperatorTableInputEntry o = new OperatorTableInputEntry("!=", new ContextType(), new ContextType());

    // Act and Assert
    assertTrue((new OperatorTableInputEntry("!=", leftOperandType, leftOperandType)).equals(o));
  }
}

