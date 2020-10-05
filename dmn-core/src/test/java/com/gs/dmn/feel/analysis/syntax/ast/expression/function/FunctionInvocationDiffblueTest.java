package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.transformation.basic.EnvironmentMemoizer;
import java.util.ArrayList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.omg.spec.dmn._20180521.model.TDecision;

public class FunctionInvocationDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testConstructor() {
    // Arrange
    Name function = new Name("PMT");

    // Act
    FunctionInvocation actualFunctionInvocation = new FunctionInvocation(function,
        new PositionalParameters(new ArrayList<Expression>()));

    // Assert
    assertTrue(actualFunctionInvocation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FunctionInvocation(Name(PMT) -> PositionalParameters())", actualFunctionInvocation.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    Name function = new Name("starts with");

    // Act
    FunctionInvocation actualFunctionInvocation = new FunctionInvocation(function,
        new PositionalParameters(new ArrayList<Expression>()));

    // Assert
    assertTrue(actualFunctionInvocation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FunctionInvocation(Name(starts with) -> PositionalParameters())",
        actualFunctionInvocation.toString());
  }

  @Test
  public void testConstructor3() {
    // Arrange
    Name function = new Name("starts with");

    // Act
    FunctionInvocation actualFunctionInvocation = new FunctionInvocation(function,
        new PositionalParameters(new ArrayList<Expression>()));

    // Assert
    assertTrue(actualFunctionInvocation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FunctionInvocation(Name(starts with) -> PositionalParameters())",
        actualFunctionInvocation.toString());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, (new EnvironmentMemoizer()).get(tDecision));
    Name function = new Name("PMT");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    (new FunctionInvocation(function, new PositionalParameters(new ArrayList<Expression>()))).deriveType(context);
  }
}

