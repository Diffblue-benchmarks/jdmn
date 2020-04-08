package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;

public class DMNFunctionTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));

    // Act
    DMNFunctionType actualDmnFunctionType = new DMNFunctionType(formalParameterList, anyType);

    // Assert
    assertEquals("DMNFunctionType(FormalParameter(name, Any), Any)", actualDmnFunctionType.toString());
    List<Type> expectedParameterTypes = actualDmnFunctionType.parameterTypes;
    assertSame(expectedParameterTypes, actualDmnFunctionType.getParameterTypes());
  }

  @Test
  public void testEquivalentTo() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));

    // Act and Assert
    assertFalse((new DMNFunctionType(formalParameterList, anyType)).equivalentTo(anyType));
  }

  @Test
  public void testMatch() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>(1);
    formalParameterList.add(new FormalParameter("name", new AnyType()));
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));
    DMNFunctionType dmnFunctionType = new DMNFunctionType(formalParameterList, anyType);
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", anyType);

    // Act and Assert
    assertFalse(dmnFunctionType.match(new NamedParameterTypes(stringTypeMap)));
  }

  @Test
  public void testEquals() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));

    // Act and Assert
    assertFalse((new DMNFunctionType(formalParameterList, anyType)).equals("o"));
  }

  @Test
  public void testHashCode() {
    // Arrange
    FormalParameter param0 = new FormalParameter("name", (Type) null);
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(param0);

    // Act and Assert
    assertEquals(1722781911, (new DMNFunctionType(formalParameterList, null)).hashCode());
  }

  @Test
  public void testToString() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));

    // Act and Assert
    assertEquals("DMNFunctionType(FormalParameter(name, Any), Any)",
        (new DMNFunctionType(formalParameterList, anyType)).toString());
  }

  @Test
  public void testToString2() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));

    // Act and Assert
    assertEquals("DMNFunctionType(, Any)", (new DMNFunctionType(null, anyType)).toString());
  }
}

