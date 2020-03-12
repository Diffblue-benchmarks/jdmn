package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class DMNFunctionTypeDiffblueTest {
  @Test
  public void constructorTest() {
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
  public void equalsTest() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));

    // Act and Assert
    assertFalse((new DMNFunctionType(formalParameterList, anyType)).equals("o"));
  }

  @Test
  public void equivalentToTest() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));

    // Act and Assert
    assertFalse((new DMNFunctionType(formalParameterList, anyType)).equivalentTo(anyType));
  }

  @Test
  public void toStringTest() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    AnyType anyType = new AnyType();
    formalParameterList.add(new FormalParameter("name", anyType));

    // Act and Assert
    assertEquals("DMNFunctionType(FormalParameter(name, Any), Any)",
        (new DMNFunctionType(formalParameterList, anyType)).toString());
  }
}

