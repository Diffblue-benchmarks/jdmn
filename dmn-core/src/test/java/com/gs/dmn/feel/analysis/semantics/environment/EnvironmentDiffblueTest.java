package com.gs.dmn.feel.analysis.semantics.environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes;
import java.util.HashMap;
import org.junit.Test;

public class EnvironmentDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    Environment environment = new Environment();
    ExpressionList expressionList = new ExpressionList();

    // Act
    Environment actualEnvironment = new Environment(environment, expressionList);

    // Assert
    assertSame(expressionList, actualEnvironment.getInputExpression());
    assertSame(environment, actualEnvironment.getParent());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    Environment actualEnvironment = new Environment();

    // Assert
    assertNull(actualEnvironment.getInputExpression());
    assertNull(actualEnvironment.getParent());
  }

  @Test
  public void testConstructor3() {
    // Arrange
    Environment environment = new Environment();

    // Act
    Environment actualEnvironment = new Environment(environment);

    // Assert
    assertNull(actualEnvironment.getInputExpression());
    assertSame(environment, actualEnvironment.getParent());
  }

  @Test
  public void testGetInputExpressionType() {
    // Arrange, Act and Assert
    assertNull((new Environment()).getInputExpressionType());
  }

  @Test
  public void testLookupVariableDeclaration() {
    // Arrange, Act and Assert
    assertNull((new Environment()).lookupVariableDeclaration("name"));
  }

  @Test
  public void testLookupFunctionDeclaration() {
    // Arrange, Act and Assert
    assertEquals(0, (new Environment()).lookupFunctionDeclaration("name").size());
  }

  @Test
  public void testLookupFunctionDeclaration2() {
    // Arrange
    Environment environment = new Environment();
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("name", new AnyType());

    // Act and Assert
    assertNull(environment.lookupFunctionDeclaration("name", new NamedParameterTypes(stringTypeMap)));
  }
}

