package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.runtime.interpreter.NamedArguments;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PositionalParametersDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act and Assert
    assertFalse((new PositionalParameters(expressionList)).isEmpty());
  }

  @Test
  public void getSignatureTest() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act and Assert
    assertEquals(1, (new PositionalParameters(expressionList)).getSignature().size());
  }

  @Test
  public void isEmptyTest() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act and Assert
    assertFalse((new PositionalParameters(expressionList)).isEmpty());
  }

  @Test
  public void setConvertedParameterTypesTest() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    PositionalParameters positionalParameters = new PositionalParameters(expressionList);
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    thrown.expect(ClassCastException.class);
    positionalParameters.setConvertedParameterTypes(new NamedParameterTypes(stringTypeMap));
  }

  @Test
  public void setOriginalArgumentsTest() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    PositionalParameters positionalParameters = new PositionalParameters(expressionList);

    // Act and Assert
    thrown.expect(ClassCastException.class);
    positionalParameters.setOriginalArguments(new NamedArguments());
  }

  @Test
  public void setParameterConversionsTest() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    PositionalParameters positionalParameters = new PositionalParameters(expressionList);

    // Act and Assert
    thrown.expect(ClassCastException.class);
    positionalParameters.setParameterConversions(new NamedParameterConversions());
  }

  @Test
  public void toStringTest() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act and Assert
    assertEquals("PositionalParameters(ExpressionList())", (new PositionalParameters(expressionList)).toString());
  }
}

