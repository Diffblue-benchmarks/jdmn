package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.runtime.interpreter.NamedArguments;
import java.util.HashMap;
import org.junit.Test;

public class NamedParametersDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());

    // Act and Assert
    assertFalse((new NamedParameters(stringExpressionMap)).isEmpty());
  }

  @Test
  public void getSignatureTest() {
    // Arrange
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());

    // Act and Assert
    assertEquals(1, (new NamedParameters(stringExpressionMap)).getSignature().size());
  }

  @Test
  public void isEmptyTest() {
    // Arrange
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());

    // Act and Assert
    assertFalse((new NamedParameters(stringExpressionMap)).isEmpty());
  }

  @Test
  public void setConvertedParameterTypesTest() {
    // Arrange
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    NamedParameters namedParameters = new NamedParameters(stringExpressionMap);
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());
    NamedParameterTypes namedParameterTypes = new NamedParameterTypes(stringTypeMap);

    // Act
    namedParameters.setConvertedParameterTypes(namedParameterTypes);

    // Assert
    assertSame(namedParameterTypes, namedParameters.getConvertedParameterTypes());
  }

  @Test
  public void setOriginalArgumentsTest() {
    // Arrange
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    NamedParameters namedParameters = new NamedParameters(stringExpressionMap);
    NamedArguments namedArguments = new NamedArguments();

    // Act
    namedParameters.setOriginalArguments(namedArguments);

    // Assert
    assertSame(namedArguments, namedParameters.getOriginalArguments());
  }

  @Test
  public void setParameterConversionsTest() {
    // Arrange
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    NamedParameters namedParameters = new NamedParameters(stringExpressionMap);
    NamedParameterConversions namedParameterConversions = new NamedParameterConversions();

    // Act
    namedParameters.setParameterConversions(namedParameterConversions);

    // Assert
    assertSame(namedParameterConversions, namedParameters.getParameterConversions());
  }

  @Test
  public void toStringTest() {
    // Arrange
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());

    // Act and Assert
    assertEquals("NamedParameters(foo : ExpressionList())", (new NamedParameters(stringExpressionMap)).toString());
  }
}

