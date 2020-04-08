package com.gs.dmn.feel.analysis.semantics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import org.junit.Test;

public class ReplaceItemFilterVisitorDiffblueTest {
  @Test
  public void testVisit() {
    // Arrange
    ReplaceItemFilterVisitor replaceItemFilterVisitor = new ReplaceItemFilterVisitor("oldLambdaParameterName",
        "newLambdaParameterName");
    Name name = new Name("name");

    // Act and Assert
    assertSame(name, replaceItemFilterVisitor.visit(name, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit2() {
    // Arrange
    ReplaceItemFilterVisitor replaceItemFilterVisitor = new ReplaceItemFilterVisitor("name", "newLambdaParameterName");
    Name name = new Name("name");

    // Act
    Object actualVisitResult = replaceItemFilterVisitor.visit(name, FEELContext.makeContext(null));

    // Assert
    assertSame(name, actualVisitResult);
    assertEquals("Name(newLambdaParameterName)", actualVisitResult.toString());
  }
}

