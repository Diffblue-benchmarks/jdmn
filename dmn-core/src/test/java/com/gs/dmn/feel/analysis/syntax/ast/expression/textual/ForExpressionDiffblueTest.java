package com.gs.dmn.feel.analysis.syntax.ast.expression.textual;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Iterator;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionInvocation;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.PositionalParameters;
import java.util.ArrayList;
import org.junit.Test;

public class ForExpressionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    Name function = new Name("PMT2");
    FunctionInvocation body = new FunctionInvocation(function, new PositionalParameters(new ArrayList<Expression>()));

    // Act
    ForExpression actualForExpression = new ForExpression(new ArrayList<Iterator>(), body);

    // Assert
    assertTrue(actualForExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ForExpression( -> FunctionInvocation(Name(PMT2) -> PositionalParameters()))",
        actualForExpression.toString());
  }
}

