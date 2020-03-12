package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import com.gs.dmn.runtime.DMNRuntimeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NamedArgumentsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void argumentListTest() {
    // Arrange
    NamedArguments namedArguments = new NamedArguments();
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("name", new AnyType()));

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    namedArguments.argumentList(formalParameterList);
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    Map<String, Object> arguments = (new NamedArguments()).getArguments();
    assertTrue(arguments instanceof java.util.LinkedHashMap);
    assertEquals(0, arguments.size());
  }

  @Test
  public void constructorTest2() {
    // Arrange
    HashMap<String, Object> stringObjectMap = new HashMap<String, Object>();
    stringObjectMap.put("foo", "foo");

    // Act and Assert
    assertSame(stringObjectMap, (new NamedArguments(stringObjectMap)).getArguments());
  }
}

