package com.gs.dmn.feel.analysis.semantics;

import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.PathExpression;
import org.junit.Test;

public class AddItemFilterVisitorDiffblueTest {
  @Test(timeout=10000)
  public void visitTest2() {
    // Arrange
    AddItemFilterVisitor addItemFilterVisitor = new AddItemFilterVisitor("name", new AnyType());
    PathExpression pathExpression = new PathExpression(new ExpressionList(), "foo");

    // Act and Assert
    assertSame(pathExpression, addItemFilterVisitor.visit(pathExpression, FEELContext.makeContext(null)));
  }

  @Test(timeout=10000)
  public void visitTest() {
    // Arrange
    AddItemFilterVisitor addItemFilterVisitor = new AddItemFilterVisitor("name", new AnyType());
    Name name = new Name("name");

    // Act and Assert
    assertSame(name, addItemFilterVisitor.visit(name, FEELContext.makeContext(null)));
  }
}

