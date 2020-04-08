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
import com.gs.dmn.runtime.interpreter.PositionalArguments;
import java.util.ArrayList;
import org.junit.Test;

public class PositionalParametersDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act and Assert
    assertFalse((new PositionalParameters(expressionList)).isEmpty());
  }

  @Test
  public void testConstructor2() {
    // Arrange, Act and Assert
    assertTrue((new PositionalParameters(null)).isEmpty());
  }

  @Test
  public void testIsEmpty() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act and Assert
    assertFalse((new PositionalParameters(expressionList)).isEmpty());
  }

  @Test
  public void testGetSignature() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act and Assert
    assertEquals(1, (new PositionalParameters(expressionList)).getSignature().size());
  }

  @Test
  public void testSetOriginalArguments() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    PositionalParameters positionalParameters = new PositionalParameters(expressionList);
    PositionalArguments positionalArguments = new PositionalArguments();

    // Act
    positionalParameters.setOriginalArguments(positionalArguments);

    // Assert
    assertSame(positionalArguments, positionalParameters.getOriginalArguments());
  }

  @Test
  public void testSetConvertedParameterTypes() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    PositionalParameters positionalParameters = new PositionalParameters(expressionList);
    ArrayList<Type> typeList = new ArrayList<Type>();
    typeList.add(new AnyType());
    PositionalParameterTypes positionalParameterTypes = new PositionalParameterTypes(typeList);

    // Act
    positionalParameters.setConvertedParameterTypes(positionalParameterTypes);

    // Assert
    assertSame(positionalParameterTypes, positionalParameters.getConvertedParameterTypes());
  }

  @Test
  public void testConvertArguments() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    PositionalParameters positionalParameters = new PositionalParameters(expressionList);

    // Act and Assert
    assertNull(positionalParameters.convertArguments(null));
    assertNull(positionalParameters.getConvertedArguments());
  }

  @Test
  public void testAccept() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    PositionalParameters positionalParameters = new PositionalParameters(expressionList);
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertFalse(((PositionalParameters) positionalParameters.accept(new CloneVisitor(), params)).isEmpty());
    Expression getResult = ((PositionalParameters) positionalParameters.accept(new CloneVisitor(), params))
        .getParameters().get(0);
    assertEquals("ExpressionList()", getResult.toString());
    assertTrue(getResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testAccept2() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    PositionalParameters positionalParameters = new PositionalParameters(expressionList);
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(positionalParameters, positionalParameters.accept(new NopVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act and Assert
    assertEquals("PositionalParameters(ExpressionList())", (new PositionalParameters(expressionList)).toString());
  }
}

