package com.gs.dmn.feel.analysis.syntax.ast.expression.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.runtime.Pair;
import java.util.ArrayList;
import org.junit.Test;

public class ContextTypeExpressionDiffblueTest {
  @Test
  public void testConstructor() {
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
  public void testAccept() {
    // Arrange
    ArrayList<Pair<String, TypeExpression>> pairList = new ArrayList<Pair<String, TypeExpression>>();
    pairList.add(new Pair<String, TypeExpression>("left", new NamedTypeExpression("qualifiedName")));
    ContextTypeExpression contextTypeExpression = new ContextTypeExpression(pairList);
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(contextTypeExpression, contextTypeExpression.accept(new NopVisitor(), params));
  }

  @Test
  public void testAccept2() {
    // Arrange
    ArrayList<Pair<String, TypeExpression>> pairList = new ArrayList<Pair<String, TypeExpression>>();
    pairList.add(new Pair<String, TypeExpression>("left", new NamedTypeExpression("qualifiedName")));
    ContextTypeExpression contextTypeExpression = new ContextTypeExpression(pairList);
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = contextTypeExpression.accept(new CloneVisitor(), params);

    // Assert
    assertTrue(((ContextTypeExpression) actualAcceptResult)
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ContextTypeExpression(left: NamedTypeExpression" + "(qualifiedName))", actualAcceptResult.toString());
  }

  @Test
  public void testToString() {
    // Arrange
    ArrayList<Pair<String, TypeExpression>> pairList = new ArrayList<Pair<String, TypeExpression>>(1);
    pairList.add(new Pair<String, TypeExpression>("left", new NamedTypeExpression("qualifiedName")));
    pairList.add(new Pair<String, TypeExpression>("left", new NamedTypeExpression("qualifiedName")));

    // Act and Assert
    assertEquals("ContextTypeExpression(left: NamedTypeExpression" + "(qualifiedName), left: NamedTypeExpression"
        + "(qualifiedName))", (new ContextTypeExpression(pairList)).toString());
  }

  @Test
  public void testToString2() {
    // Arrange
    ArrayList<Pair<String, TypeExpression>> pairList = new ArrayList<Pair<String, TypeExpression>>();
    ArrayList<Pair<String, TypeExpression>> pairList1 = new ArrayList<Pair<String, TypeExpression>>();
    pairList1.add(new Pair<String, TypeExpression>("left", new NamedTypeExpression("qualifiedName")));
    pairList.add(new Pair<String, TypeExpression>("left", new ContextTypeExpression(pairList1)));

    // Act and Assert
    assertEquals("ContextTypeExpression(left: ContextTypeExpression(left:" + " NamedTypeExpression(qualifiedName)))",
        (new ContextTypeExpression(pairList)).toString());
  }

  @Test
  public void testToString3() {
    // Arrange
    ArrayList<Pair<String, TypeExpression>> pairList = new ArrayList<Pair<String, TypeExpression>>();
    pairList.add(new Pair<String, TypeExpression>("left", new NamedTypeExpression("qualifiedName")));

    // Act and Assert
    assertEquals("ContextTypeExpression(left: NamedTypeExpression" + "(qualifiedName))",
        (new ContextTypeExpression(pairList)).toString());
  }
}

