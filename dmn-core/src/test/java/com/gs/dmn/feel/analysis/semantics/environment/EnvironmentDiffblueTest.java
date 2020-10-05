package com.gs.dmn.feel.analysis.semantics.environment;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.NumberType;
import com.gs.dmn.feel.analysis.semantics.type.StringType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import org.junit.Test;

public class EnvironmentDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Environment actualEnvironment = new Environment();

    // Assert
    assertNull(actualEnvironment.getInputExpression());
    assertNull(actualEnvironment.getParent());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    Environment actualEnvironment = new Environment(null, null);

    // Assert
    assertNull(actualEnvironment.getInputExpression());
    assertNull(actualEnvironment.getParent());
  }

  @Test
  public void testConstructor3() {
    // Arrange
    Environment environment = new Environment();

    // Act
    Environment actualEnvironment = new Environment(environment, null);

    // Assert
    assertNull(actualEnvironment.getInputExpression());
    assertSame(environment, actualEnvironment.getParent());
  }

  @Test
  public void testConstructor4() {
    // Arrange
    Environment environment = new Environment();

    // Act
    Environment actualEnvironment = new Environment(environment, null);

    // Assert
    assertNull(actualEnvironment.getInputExpression());
    assertSame(environment, actualEnvironment.getParent());
  }

  @Test
  public void testGetInputExpressionType() {
    // Arrange
    Environment parent = new Environment(new Environment(), null);

    // Act
    Type actualInputExpressionType = (new Environment(parent, new Name("Age"))).getInputExpressionType();

    // Assert
    assertSame(((AnyType) actualInputExpressionType).ANY, actualInputExpressionType);
  }

  @Test
  public void testGetInputExpressionType2() {
    // Arrange
    Environment parent = new Environment(new Environment(), null);

    // Act
    Type actualInputExpressionType = (new Environment(parent, new Name("RiskCategory"))).getInputExpressionType();

    // Assert
    assertSame(((AnyType) actualInputExpressionType).ANY, actualInputExpressionType);
  }

  @Test
  public void testGetInputExpressionType3() {
    // Arrange
    Environment parent = new Environment(new Environment(), null);

    // Act
    Type actualInputExpressionType = (new Environment(parent, new Name("RiskCategory"))).getInputExpressionType();

    // Assert
    assertSame(((AnyType) actualInputExpressionType).ANY, actualInputExpressionType);
  }

  @Test
  public void testLookupVariableDeclaration() {
    // Arrange
    StringType stringType = new StringType();
    Environment environment = new Environment(new Environment(), null);
    VariableDeclaration variableDeclaration = new VariableDeclaration("'Full Name'", stringType);
    environment.addDeclaration(variableDeclaration);

    // Act and Assert
    assertSame(variableDeclaration, environment.lookupVariableDeclaration("'Full Name'"));
  }

  @Test
  public void testLookupVariableDeclaration2() {
    // Arrange
    NumberType numberType = new NumberType();
    Parameter parameter = new Parameter("year", numberType);
    Parameter parameter1 = new Parameter("month", numberType);
    Environment environment = new Environment(new Environment(), null);
    VariableDeclaration variableDeclaration = new VariableDeclaration("'Monthly Salary'", numberType);
    environment.addDeclaration(variableDeclaration);

    // Act and Assert
    assertSame(variableDeclaration, environment.lookupVariableDeclaration("'Monthly Salary'"));
  }

  @Test
  public void testLookupVariableDeclaration3() {
    // Arrange
    StringType stringType = new StringType();
    Environment environment = new Environment(new Environment(), null);
    VariableDeclaration variableDeclaration = new VariableDeclaration("'Employment Status'", stringType);
    environment.addDeclaration(variableDeclaration);

    // Act and Assert
    assertSame(variableDeclaration, environment.lookupVariableDeclaration("'Employment Status'"));
  }
}

