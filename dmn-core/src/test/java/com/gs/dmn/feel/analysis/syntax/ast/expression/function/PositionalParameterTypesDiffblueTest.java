package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import java.util.ArrayList;
import org.junit.Test;

public class PositionalParameterTypesDiffblueTest {
  @Test
  public void candidatesTest() {
    // Arrange
    ArrayList<Type> typeList = new ArrayList<Type>();
    typeList.add(new AnyType());

    // Act and Assert
    assertEquals(0, (new PositionalParameterTypes(typeList)).candidates().size());
  }

  @Test
  public void compatibleTest() {
    // Arrange
    ArrayList<Type> typeList = new ArrayList<Type>();
    typeList.add(new AnyType());
    PositionalParameterTypes positionalParameterTypes = new PositionalParameterTypes(typeList);
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("name", new AnyType()));

    // Act and Assert
    assertFalse(positionalParameterTypes.compatible(formalParameterList));
  }

  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<Type> typeList = new ArrayList<Type>();
    typeList.add(new AnyType());

    // Act and Assert
    assertEquals(1, (new PositionalParameterTypes(typeList)).size());
  }

  @Test
  public void equalsTest() {
    // Arrange
    ArrayList<Type> typeList = new ArrayList<Type>();
    typeList.add(new AnyType());

    // Act and Assert
    assertFalse((new PositionalParameterTypes(typeList)).equals("o"));
  }

  @Test
  public void sizeTest() {
    // Arrange
    ArrayList<Type> typeList = new ArrayList<Type>();
    typeList.add(new AnyType());

    // Act and Assert
    assertEquals(1, (new PositionalParameterTypes(typeList)).size());
  }

  @Test
  public void toStringTest() {
    // Arrange
    ArrayList<Type> typeList = new ArrayList<Type>();
    typeList.add(new AnyType());

    // Act and Assert
    assertEquals("PositionalParameterTypes(Any)", (new PositionalParameterTypes(typeList)).toString());
  }
}

