package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.environment.Environment;
import com.gs.dmn.feel.analysis.semantics.environment.EnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import java.util.ArrayList;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDecision;

public class ListLiteralDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ListLiteral actualListLiteral = new ListLiteral(new ArrayList<Expression>());

    // Assert
    assertTrue(actualListLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListLiteral()", actualListLiteral.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    ListLiteral actualListLiteral = new ListLiteral(new ArrayList<Expression>());

    // Assert
    assertTrue(actualListLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListLiteral()", actualListLiteral.toString());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    ListLiteral actualListLiteral = new ListLiteral(new ArrayList<Expression>());

    // Assert
    assertTrue(actualListLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListLiteral()", actualListLiteral.toString());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    Environment environment = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    FEELContext context = FEELContext.makeContext(new TDecision(), environment);
    ListLiteral listLiteral = new ListLiteral(new ArrayList<Expression>());

    // Act
    listLiteral.deriveType(context);

    // Assert
    Type type = listLiteral.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.ListType);
    assertTrue(type.isValid());
  }

  @Test
  public void testDeriveType2() {
    // Arrange
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    Environment environment = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    FEELContext context = FEELContext.makeContext(new TDecision(), environment);
    ListLiteral listLiteral = new ListLiteral(new ArrayList<Expression>());

    // Act
    listLiteral.deriveType(context);

    // Assert
    Type type = listLiteral.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.ListType);
    assertTrue(type.isValid());
  }

  @Test
  public void testDeriveType3() {
    // Arrange
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    Environment environment = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    FEELContext context = FEELContext.makeContext(new TDecision(), environment);
    ListLiteral listLiteral = new ListLiteral(new ArrayList<Expression>());

    // Act
    listLiteral.deriveType(context);

    // Assert
    Type type = listLiteral.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.ListType);
    assertTrue(type.isValid());
  }
}

