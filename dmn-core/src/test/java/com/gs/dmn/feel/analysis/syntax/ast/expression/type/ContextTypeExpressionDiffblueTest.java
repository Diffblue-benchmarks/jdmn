package com.gs.dmn.feel.analysis.syntax.ast.expression.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.runtime.Pair;
import java.util.ArrayList;
import org.junit.Test;

public class ContextTypeExpressionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<Pair<String, TypeExpression>> pairList = new ArrayList<Pair<String, TypeExpression>>();
    pairList.add(new Pair<String, TypeExpression>("left", new NamedTypeExpression("qualifiedName")));

    // Act
    ContextTypeExpression actualContextTypeExpression = new ContextTypeExpression(pairList);

    // Assert
    assertTrue(actualContextTypeExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ContextTypeExpression(left: NamedTypeExpression" + "(qualifiedName))",
        actualContextTypeExpression.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange
    ArrayList<Pair<String, TypeExpression>> pairList = new ArrayList<Pair<String, TypeExpression>>();
    pairList.add(new Pair<String, TypeExpression>("left", new NamedTypeExpression("qualifiedName")));

    // Act and Assert
    assertEquals("ContextTypeExpression(left: NamedTypeExpression" + "(qualifiedName))",
        (new ContextTypeExpression(pairList)).toString());
  }
}

