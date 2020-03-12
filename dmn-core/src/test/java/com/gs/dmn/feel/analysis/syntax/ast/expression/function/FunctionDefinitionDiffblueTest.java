package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import java.util.ArrayList;
import org.junit.Test;

public class FunctionDefinitionDiffblueTest {
  @Test
  public void constructorTest() {
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
  public void isStaticTypedTest() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("name", new AnyType()));

    // Act and Assert
    assertTrue((new FunctionDefinition(formalParameterList, new ExpressionList(), true)).isStaticTyped());
  }

  @Test
  public void toStringTest() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("name", new AnyType()));

    // Act and Assert
    assertEquals("FunctionDefinition(FormalParameter(name, Any)," + " ExpressionList(), true)",
        (new FunctionDefinition(formalParameterList, new ExpressionList(), true)).toString());
  }
}

