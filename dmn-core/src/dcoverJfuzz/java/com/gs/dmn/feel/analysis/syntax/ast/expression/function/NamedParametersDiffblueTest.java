package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.runtime.interpreter.NamedArguments;
import org.junit.Test;

public class NamedParametersDiffblueTest {
  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    NamedParameters namedParameters = new NamedParameters(null);
    CloneVisitor visitor = new CloneVisitor();

    // Act and Assert
    assertTrue(((NamedParameters) namedParameters.accept(visitor, FEELContext.makeContext(null))).isEmpty());
  }

  @Test(timeout=10000)
  public void setConvertedParameterTypesTest() {
    // Arrange
    NamedParameters namedParameters = new NamedParameters(null);
    NamedParameterTypes namedParameterTypes = new NamedParameterTypes(null);

    // Act
    namedParameters.setConvertedParameterTypes(namedParameterTypes);

    // Assert
    assertSame(namedParameterTypes, namedParameters.getConvertedParameterTypes());
  }

  @Test(timeout=10000)
  public void setOriginalArgumentsTest() {
    // Arrange
    NamedParameters namedParameters = new NamedParameters(null);
    NamedArguments namedArguments = new NamedArguments();

    // Act
    namedParameters.setOriginalArguments(namedArguments);

    // Assert
    assertSame(namedArguments, namedParameters.getOriginalArguments());
  }

  @Test(timeout=10000)
  public void setParameterConversionsTest() {
    // Arrange
    NamedParameters namedParameters = new NamedParameters(null);
    NamedParameterConversions namedParameterConversions = new NamedParameterConversions();

    // Act
    namedParameters.setParameterConversions(namedParameterConversions);

    // Assert
    assertSame(namedParameterConversions, namedParameters.getParameterConversions());
  }

  @Test(timeout=10000)
  public void getConvertedArgumentsTest() {
    // Arrange, Act and Assert
    assertNull((new NamedParameters(null)).getConvertedArguments());
  }

  @Test(timeout=10000)
  public void getParameterConversionsTest() {
    // Arrange, Act and Assert
    assertNull((new NamedParameters(null)).getParameterConversions());
  }

  @Test(timeout=10000)
  public void getConvertedParameterTypesTest() {
    // Arrange, Act and Assert
    assertNull((new NamedParameters(null)).getConvertedParameterTypes());
  }

  @Test(timeout=10000)
  public void getOriginalArgumentsTest() {
    // Arrange, Act and Assert
    assertNull((new NamedParameters(null)).getOriginalArguments());
  }

  @Test(timeout=10000)
  public void getParametersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NamedParameters(null)).getParameters().size());
  }

  @Test(timeout=10000)
  public void isEmptyTest() {
    // Arrange, Act and Assert
    assertTrue((new NamedParameters(null)).isEmpty());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new NamedParameters(null)).isEmpty());
  }

  @Test(timeout=10000)
  public void getSignatureTest() {
    // Arrange, Act and Assert
    assertEquals("NamedParameterTypes()", (new NamedParameters(null)).getSignature().toString());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("NamedParameters()", (new NamedParameters(null)).toString());
  }
}

