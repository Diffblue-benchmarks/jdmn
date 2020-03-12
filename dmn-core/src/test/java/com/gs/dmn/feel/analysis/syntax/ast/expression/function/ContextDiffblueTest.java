package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import java.util.ArrayList;
import org.junit.Test;

public class ContextDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<ContextEntry> contextEntryList = new ArrayList<ContextEntry>();
    contextEntryList.add(new ContextEntry(null, new ExpressionList()));

    // Act and Assert
    assertTrue((new Context(contextEntryList)).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }
}

