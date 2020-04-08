package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionDefinition;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;

public class FEELFunctionTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));

    // Act
    FEELFunctionType actualFeelFunctionType = new FEELFunctionType(formalParameterList, anyType, true);

    // Assert
    assertEquals("FEELFunctionType(FormalParameter(name, Any)," + " Any, true)", actualFeelFunctionType.toString());
    List<Type> expectedParameterTypes = actualFeelFunctionType.parameterTypes;
    assertSame(expectedParameterTypes, actualFeelFunctionType.getParameterTypes());
    assertTrue(actualFeelFunctionType.isExternal());
    assertNull(actualFeelFunctionType.getFunctionDefinition());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    AnyType anyType = new AnyType();
    FormalParameter formalParameter = new FormalParameter("name", anyType);
    formalParameterList.add(formalParameter);
    ArrayList<FormalParameter> formalParameterList1 = new ArrayList<FormalParameter>();
    formalParameterList1.add(formalParameter);
    FunctionDefinition functionDefinition = new FunctionDefinition(formalParameterList1, new ExpressionList(), true);

    // Act
    FEELFunctionType actualFeelFunctionType = new FEELFunctionType(formalParameterList, anyType, true,
        functionDefinition);

    // Assert
    assertEquals("FEELFunctionType(FormalParameter(name, Any)," + " Any, true)", actualFeelFunctionType.toString());
    List<Type> expectedParameterTypes = actualFeelFunctionType.parameterTypes;
    assertSame(expectedParameterTypes, actualFeelFunctionType.getParameterTypes());
    assertTrue(actualFeelFunctionType.isExternal());
    assertSame(functionDefinition, actualFeelFunctionType.getFunctionDefinition());
  }

  @Test
  public void testEquivalentTo() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));

    // Act and Assert
    assertFalse((new FEELFunctionType(formalParameterList, anyType, true)).equivalentTo(anyType));
  }

  @Test
  public void testMatch() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>(1);
    formalParameterList.add(new FormalParameter("name", new AnyType()));
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));
    FEELFunctionType feelFunctionType = new FEELFunctionType(formalParameterList, anyType, true);
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", anyType);

    // Act and Assert
    assertFalse(feelFunctionType.match(new NamedParameterTypes(stringTypeMap)));
  }

  @Test
  public void testEquals() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));

    // Act and Assert
    assertFalse((new FEELFunctionType(formalParameterList, anyType, true)).equals("o"));
  }

  @Test
  public void testHashCode() {
    // Arrange
    FormalParameter param0 = new FormalParameter("name", (Type) null);
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(param0);

    // Act and Assert
    assertEquals(1722781911, (new FEELFunctionType(formalParameterList, null, true)).hashCode());
  }

  @Test
  public void testToString() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));

    // Act and Assert
    assertEquals("FEELFunctionType(, Any, true)", (new FEELFunctionType(null, anyType, true)).toString());
  }

  @Test
  public void testToString2() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));

    // Act and Assert
    assertEquals("FEELFunctionType(FormalParameter(name, Any)," + " Any, true)",
        (new FEELFunctionType(formalParameterList, anyType, true)).toString());
  }

  @Test
  public void testToString3() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>(1);
    formalParameterList.add(new FormalParameter("name", new AnyType()));
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));

    // Act and Assert
    assertEquals("FEELFunctionType(FormalParameter(name, Any)," + " FormalParameter(name, Any), Any, true)",
        (new FEELFunctionType(formalParameterList, anyType, true)).toString());
  }
}

