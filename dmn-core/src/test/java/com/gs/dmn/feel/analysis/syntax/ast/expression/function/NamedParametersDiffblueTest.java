package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.runtime.interpreter.NamedArguments;
import java.util.HashMap;
import org.junit.Test;

public class NamedParametersDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());

    // Act and Assert
    assertFalse((new NamedParameters(stringExpressionMap)).isEmpty());
  }

  @Test
  public void testConstructor2() {
    // Arrange, Act and Assert
    assertTrue((new NamedParameters(null)).isEmpty());
  }

  @Test
  public void testIsEmpty() {
    // Arrange
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());

    // Act and Assert
    assertFalse((new NamedParameters(stringExpressionMap)).isEmpty());
  }

  @Test
  public void testGetSignature() {
    // Arrange
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());

    // Act and Assert
    assertEquals(1, (new NamedParameters(stringExpressionMap)).getSignature().size());
  }

  @Test
  public void testGetSignature2() {
    // Arrange, Act and Assert
    assertEquals("NamedParameterTypes()", (new NamedParameters(null)).getSignature().toString());
  }

  @Test
  public void testSetOriginalArguments() {
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
  public void testSetParameterConversions() {
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
  public void testSetConvertedParameterTypes() {
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
  public void testConvertArguments() {
    // Arrange
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    NamedParameters namedParameters = new NamedParameters(stringExpressionMap);

    // Act and Assert
    assertNull(namedParameters.convertArguments(null));
    assertNull(namedParameters.getConvertedArguments());
  }

  @Test
  public void testAccept() {
    // Arrange
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    NamedParameters namedParameters = new NamedParameters(stringExpressionMap);
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = namedParameters.accept(new CloneVisitor(), params);

    // Assert
    assertFalse(((NamedParameters) actualAcceptResult).isEmpty());
    assertTrue(((NamedParameters) actualAcceptResult).getSignature() instanceof NamedParameterTypes);
    assertEquals("NamedParameters(foo : ExpressionList())", actualAcceptResult.toString());
  }

  @Test
  public void testAccept2() {
    // Arrange
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());
    NamedParameters namedParameters = new NamedParameters(stringExpressionMap);
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(namedParameters, namedParameters.accept(new NopVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("NamedParameters()", (new NamedParameters(null)).toString());
  }

  @Test
  public void testToString2() {
    // Arrange
    HashMap<String, Expression> stringExpressionMap = new HashMap<String, Expression>();
    stringExpressionMap.put("foo", new ExpressionList());

    // Act and Assert
    assertEquals("NamedParameters(foo : ExpressionList())", (new NamedParameters(stringExpressionMap)).toString());
  }
}

