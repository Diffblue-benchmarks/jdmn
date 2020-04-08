package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.FEELFunctionType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import java.util.ArrayList;
import org.junit.Test;

public class FunctionDefinitionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));

    // Act
    FunctionDefinition actualFunctionDefinition = new FunctionDefinition(formalParameterList, new ExpressionList(),
        true);

    // Assert
    assertSame(anyType.ANY, actualFunctionDefinition.getType());
    assertEquals("FunctionDefinition(FormalParameter(name, Any)," + " ExpressionList(), true)",
        actualFunctionDefinition.toString());
    assertTrue(actualFunctionDefinition.isExternal());
  }

  @Test
  public void testIsStaticTyped() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("name", new AnyType()));

    // Act and Assert
    assertTrue((new FunctionDefinition(formalParameterList, new ExpressionList(), true)).isStaticTyped());
  }

  @Test
  public void testIsStaticTyped2() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>(1);
    formalParameterList.add(new FormalParameter("name", new AnyType()));
    formalParameterList.add(new FormalParameter("name", new AnyType()));

    // Act and Assert
    assertTrue((new FunctionDefinition(formalParameterList, new ExpressionList(), true)).isStaticTyped());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("name", new AnyType()));
    FunctionDefinition functionDefinition = new FunctionDefinition(formalParameterList, new ExpressionList(), true);

    // Act
    functionDefinition.deriveType(null);

    // Assert
    Type type = functionDefinition.getType();
    assertTrue(type instanceof FEELFunctionType);
    assertSame(functionDefinition, ((FEELFunctionType) type).getFunctionDefinition());
    assertEquals("FEELFunctionType(FormalParameter(name, Any)," + " Any, true)", type.toString());
    assertTrue(((FEELFunctionType) type).isExternal());
  }

  @Test
  public void testAccept() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("name", new AnyType()));
    FunctionDefinition functionDefinition = new FunctionDefinition(formalParameterList, new ExpressionList(), true);
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(functionDefinition, functionDefinition.accept(new CloneVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("name", new AnyType()));

    // Act and Assert
    assertEquals("FunctionDefinition(FormalParameter(name, Any)," + " ExpressionList(), true)",
        (new FunctionDefinition(formalParameterList, new ExpressionList(), true)).toString());
  }
}

