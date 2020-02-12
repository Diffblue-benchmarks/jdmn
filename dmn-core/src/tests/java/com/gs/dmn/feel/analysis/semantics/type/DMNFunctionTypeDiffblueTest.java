package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.NamedParameterTypes;
import java.util.List;
import org.junit.Test;

public class DMNFunctionTypeDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new DMNFunctionType(null, new AnyType())).equals("foo"));
  }

  @Test(timeout=10000)
  public void equivalentToTest() {
    // Arrange
    DMNFunctionType dmnFunctionType = new DMNFunctionType(null, new AnyType());

    // Act and Assert
    assertFalse(dmnFunctionType.equivalentTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    DMNFunctionType actualDmnFunctionType = new DMNFunctionType(null, new AnyType());

    // Assert
    List<Type> expectedParameterTypes = actualDmnFunctionType.parameterTypes;
    String actualToStringResult = actualDmnFunctionType.toString();
    assertEquals("DMNFunctionType(, Any)", actualToStringResult);
    assertSame(expectedParameterTypes, actualDmnFunctionType.getParameterTypes());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("DMNFunctionType(, Any)", (new DMNFunctionType(null, new AnyType())).toString());
  }

  @Test(timeout=10000)
  public void matchTest() {
    // Arrange
    DMNFunctionType dmnFunctionType = new DMNFunctionType(null, new AnyType());

    // Act and Assert
    assertTrue(dmnFunctionType.match(new NamedParameterTypes(null)));
  }
}

