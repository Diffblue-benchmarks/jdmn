package com.gs.dmn.feel.analysis.semantics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import org.junit.Test;

public class ReplaceItemFilterVisitorDiffblueTest {
  @Test(timeout=10000)
  public void visitTest() {
    // Arrange
    ReplaceItemFilterVisitor replaceItemFilterVisitor = new ReplaceItemFilterVisitor("name", "name");
    Name name = new Name("name");

    // Act
    Object actualVisitResult = replaceItemFilterVisitor.visit(name, FEELContext.makeContext(null));

    // Assert
    assertSame(name, actualVisitResult);
    assertEquals("Name(name)", actualVisitResult.toString());
  }
}

