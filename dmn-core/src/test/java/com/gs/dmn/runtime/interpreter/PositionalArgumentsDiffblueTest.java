package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class PositionalArgumentsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    List<Object> arguments = (new PositionalArguments()).getArguments();
    assertTrue(arguments instanceof java.util.ArrayList);
    assertEquals(0, arguments.size());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act and Assert
    assertSame(objectList, (new PositionalArguments(objectList)).getArguments());
  }

  @Test
  public void testConstructor3() {
    // Arrange, Act and Assert
    List<Object> arguments = (new PositionalArguments(null)).getArguments();
    assertTrue(arguments instanceof ArrayList);
    assertEquals(0, arguments.size());
  }

  @Test
  public void testArgumentList() {
    // Arrange
    PositionalArguments positionalArguments = new PositionalArguments();
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("name", new AnyType()));

    // Act and Assert
    assertEquals(0, positionalArguments.argumentList(formalParameterList).size());
  }
}

