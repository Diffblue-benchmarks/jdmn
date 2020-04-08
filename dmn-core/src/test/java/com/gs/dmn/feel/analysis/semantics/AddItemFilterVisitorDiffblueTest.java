package com.gs.dmn.feel.analysis.semantics;

import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.ContextType;
import com.gs.dmn.feel.analysis.semantics.type.ItemDefinitionType;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.PathExpression;
import org.junit.Test;

public class AddItemFilterVisitorDiffblueTest {
  @Test
  public void testVisit() {
    // Arrange
    AddItemFilterVisitor addItemFilterVisitor = new AddItemFilterVisitor("lambdaParameterName", new ContextType());
    FEELContext context = FEELContext.makeContext(null);
    Name name = new Name("lambdaParameterName");

    // Act and Assert
    assertSame(name, addItemFilterVisitor.visit(name, context));
  }

  @Test
  public void testVisit2() {
    // Arrange
    AddItemFilterVisitor addItemFilterVisitor = new AddItemFilterVisitor("lambdaParameterName",
        new ItemDefinitionType(""));
    FEELContext context = FEELContext.makeContext(null);
    Name name = new Name("lambdaParameterName");

    // Act and Assert
    assertSame(name, addItemFilterVisitor.visit(name, context));
  }

  @Test
  public void testVisit3() {
    // Arrange
    AddItemFilterVisitor addItemFilterVisitor = new AddItemFilterVisitor("lambdaParameterName", new AnyType());
    FEELContext context = FEELContext.makeContext(null);
    Name name = new Name("lambdaParameterName");

    // Act and Assert
    assertSame(name, addItemFilterVisitor.visit(name, context));
  }

  @Test
  public void testVisit4() {
    // Arrange
    AddItemFilterVisitor addItemFilterVisitor = new AddItemFilterVisitor("lambdaParameterName", new AnyType());
    PathExpression pathExpression = new PathExpression(new ExpressionList(), "member");

    // Act and Assert
    assertSame(pathExpression, addItemFilterVisitor.visit(pathExpression, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit5() {
    // Arrange
    AddItemFilterVisitor addItemFilterVisitor = new AddItemFilterVisitor("lambdaParameterName", new AnyType());
    PathExpression pathExpression = new PathExpression(new Name("name"), "member");

    // Act and Assert
    assertSame(pathExpression, addItemFilterVisitor.visit(pathExpression, FEELContext.makeContext(null)));
  }
}

