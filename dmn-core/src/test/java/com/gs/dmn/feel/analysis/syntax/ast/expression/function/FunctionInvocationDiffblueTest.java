package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import java.util.HashMap;
import org.junit.Test;

public class FunctionInvocationDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    ExpressionList function = new ExpressionList();
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());

    // Act
    FunctionInvocation actualFunctionInvocation = new FunctionInvocation(function,
        new NamedParameters(stringExpressionMap));

    // Assert
    assertTrue(actualFunctionInvocation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FunctionInvocation(ExpressionList() -> NamedParameters(foo" + " : ExpressionList()))",
        actualFunctionInvocation.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange
    ExpressionList function = new ExpressionList();
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());

    // Act and Assert
    assertEquals("FunctionInvocation(ExpressionList() -> NamedParameters(foo" + " : ExpressionList()))",
        (new FunctionInvocation(function, new NamedParameters(stringExpressionMap))).toString());
  }
}

