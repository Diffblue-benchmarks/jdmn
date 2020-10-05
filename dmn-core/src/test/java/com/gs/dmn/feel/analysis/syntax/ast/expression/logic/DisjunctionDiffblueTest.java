package com.gs.dmn.feel.analysis.syntax.ast.expression.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import org.junit.Test;

public class DisjunctionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    Name leftOperand = new Name("A");

    // Act
    Disjunction actualDisjunction = new Disjunction(leftOperand, new Name("B"));

    // Assert
    assertEquals("or", actualDisjunction.getOperator());
    assertTrue(actualDisjunction.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Disjunction(Name(A),Name(B))", actualDisjunction.toString());
  }
}

