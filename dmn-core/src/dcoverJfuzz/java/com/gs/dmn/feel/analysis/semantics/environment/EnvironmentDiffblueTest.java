package com.gs.dmn.feel.analysis.semantics.environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes;
import org.junit.Test;

public class EnvironmentDiffblueTest {
  @Test(timeout=10000)
  public void getParentTest() {
    // Arrange, Act and Assert
    assertNull((new Environment()).getParent());
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange
    Environment environment = new Environment();

    // Act
    Environment actualEnvironment = new Environment(environment);

    // Assert
    Expression actualInputExpression = actualEnvironment.getInputExpression();
    assertNull(actualInputExpression);
    assertSame(environment, actualEnvironment.getParent());
  }

  @Test(timeout=10000)
  public void lookupFunctionDeclarationTest2() {
    // Arrange
    Environment environment = new Environment();

    // Act and Assert
    assertNull(environment.lookupFunctionDeclaration("name", new NamedParameterTypes(null)));
  }

  @Test(timeout=10000)
  public void lookupFunctionDeclarationTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Environment()).lookupFunctionDeclaration("name").size());
  }

  @Test(timeout=10000)
  public void getInputExpressionTypeTest() {
    // Arrange, Act and Assert
    assertNull((new Environment()).getInputExpressionType());
  }

  @Test(timeout=10000)
  public void lookupVariableDeclarationTest() {
    // Arrange, Act and Assert
    assertNull((new Environment()).lookupVariableDeclaration("name"));
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    Environment actualEnvironment = new Environment();

    // Assert
    Expression actualInputExpression = actualEnvironment.getInputExpression();
    assertNull(actualInputExpression);
    assertNull(actualEnvironment.getParent());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    Environment environment = new Environment();
    ExpressionList expressionList = new ExpressionList();

    // Act
    Environment actualEnvironment = new Environment(environment, expressionList);

    // Assert
    Expression actualInputExpression = actualEnvironment.getInputExpression();
    assertSame(expressionList, actualInputExpression);
    assertSame(environment, actualEnvironment.getParent());
  }

  @Test(timeout=10000)
  public void getInputExpressionTest() {
    // Arrange, Act and Assert
    assertNull((new Environment()).getInputExpression());
  }
}

