package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FunctionInvocationDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void acceptTest() {
    // Arrange
    ExpressionList function = new ExpressionList();
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    FunctionInvocation functionInvocation = new FunctionInvocation(function, new NamedParameters(stringExpressionMap));
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = functionInvocation.accept(new CloneVisitor(), params);

    // Assert
    Expression function1 = ((FunctionInvocation) actualAcceptResult).getFunction();
    Parameters parameters = ((FunctionInvocation) actualAcceptResult).getParameters();
    boolean actualIsEmptyResult = parameters.isEmpty();
    Type type = ((FunctionInvocation) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    assertEquals("FunctionInvocation(ExpressionList() -> NamedParameters(foo" + " : ExpressionList()))",
        actualAcceptResult.toString());
    assertFalse(actualIsEmptyResult);
    assertTrue(parameters.getSignature() instanceof NamedParameterTypes);
    assertEquals("NamedParameters(foo : ExpressionList())", parameters.toString());
    assertSame(type, function1.getType());
    assertEquals("ExpressionList()", function1.toString());
  }
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
  public void deriveTypeTest() {
    // Arrange
    ExpressionList function = new ExpressionList();
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());

    // Act and Assert
    thrown.expect(ClassCastException.class);
    (new FunctionInvocation(function, new NamedParameters(stringExpressionMap))).deriveType(null);
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

