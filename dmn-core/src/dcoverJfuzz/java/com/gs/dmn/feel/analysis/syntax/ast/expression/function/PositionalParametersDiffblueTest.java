package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.runtime.interpreter.NamedArguments;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PositionalParametersDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    PositionalParameters positionalParameters = new PositionalParameters(null);
    CloneVisitor visitor = new CloneVisitor();

    // Act and Assert
    assertTrue(((PositionalParameters) positionalParameters.accept(visitor, FEELContext.makeContext(null))).isEmpty());
  }

  @Test(timeout=10000)
  public void setConvertedParameterTypesTest() {
    // Arrange
    PositionalParameters positionalParameters = new PositionalParameters(null);

    // Act and Assert
    thrown.expect(ClassCastException.class);
    positionalParameters.setConvertedParameterTypes(new NamedParameterTypes(null));
  }

  @Test(timeout=10000)
  public void setOriginalArgumentsTest() {
    // Arrange
    PositionalParameters positionalParameters = new PositionalParameters(null);

    // Act and Assert
    thrown.expect(ClassCastException.class);
    positionalParameters.setOriginalArguments(new NamedArguments());
  }

  @Test(timeout=10000)
  public void setParameterConversionsTest() {
    // Arrange
    PositionalParameters positionalParameters = new PositionalParameters(null);

    // Act and Assert
    thrown.expect(ClassCastException.class);
    positionalParameters.setParameterConversions(new NamedParameterConversions());
  }

  @Test(timeout=10000)
  public void getConvertedArgumentsTest() {
    // Arrange, Act and Assert
    assertNull((new PositionalParameters(null)).getConvertedArguments());
  }

  @Test(timeout=10000)
  public void getParameterConversionsTest() {
    // Arrange, Act and Assert
    assertNull((new PositionalParameters(null)).getParameterConversions());
  }

  @Test(timeout=10000)
  public void getConvertedParameterTypesTest() {
    // Arrange, Act and Assert
    assertNull((new PositionalParameters(null)).getConvertedParameterTypes());
  }

  @Test(timeout=10000)
  public void getOriginalArgumentsTest() {
    // Arrange, Act and Assert
    assertNull((new PositionalParameters(null)).getOriginalArguments());
  }

  @Test(timeout=10000)
  public void getParametersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PositionalParameters(null)).getParameters().size());
  }

  @Test(timeout=10000)
  public void isEmptyTest() {
    // Arrange, Act and Assert
    assertTrue((new PositionalParameters(null)).isEmpty());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new PositionalParameters(null)).isEmpty());
  }

  @Test(timeout=10000)
  public void getSignatureTest() {
    // Arrange, Act and Assert
    assertEquals("PositionalParameterTypes()", (new PositionalParameters(null)).getSignature().toString());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("PositionalParameters()", (new PositionalParameters(null)).toString());
  }
}

