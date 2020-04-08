package com.gs.dmn.feel.analysis.semantics;

import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import org.junit.Test;

public class UpdatePartialVisitorDiffblueTest {
  @Test
  public void testVisit() {
    // Arrange
    UpdatePartialVisitor updatePartialVisitor = new UpdatePartialVisitor(new AnyType());
    Name name = new Name("name");

    // Act and Assert
    assertSame(name, updatePartialVisitor.visit(name, FEELContext.makeContext(null)));
  }

  @Test
  public void testVisit2() {
    // Arrange
    AnyType anyType = new AnyType();
    UpdatePartialVisitor updatePartialVisitor = new UpdatePartialVisitor(anyType);
    Name name = new Name("partial");

    // Act and Assert
    assertSame(name, updatePartialVisitor.visit(name, FEELContext.makeContext(null)));
    assertSame(anyType, ((Name) updatePartialVisitor.visit(name, FEELContext.makeContext(null))).getType());
  }
}

