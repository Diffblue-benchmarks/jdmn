package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.SemanticError;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DateTimeLiteralDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    DateTimeLiteral dateTimeLiteral = new DateTimeLiteral("foo", "foo");
    CloneVisitor visitor = new CloneVisitor();

    // Act and Assert
    Type type = ((DateTimeLiteral) dateTimeLiteral.accept(visitor, FEELContext.makeContext(null))).getType();
    String actualLexeme = ((DateTimeLiteral) dateTimeLiteral.accept(visitor, FEELContext.makeContext(null)))
        .getLexeme();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("foo",
        ((DateTimeLiteral) dateTimeLiteral.accept(visitor, FEELContext.makeContext(null))).getConversionFunction());
    assertEquals("foo", actualLexeme);
  }

  @Test(timeout=10000)
  public void getConversionFunctionTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new DateTimeLiteral("foo", "foo")).getConversionFunction());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("DateTimeLiteral(foo, foo)", (new DateTimeLiteral("foo", "foo")).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest2() {
    // Arrange, Act and Assert
    thrown.expect(SemanticError.class);
    (new DateTimeLiteral("foo", "foo")).deriveType(null);
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(SemanticError.class);
    (new DateTimeLiteral("duration", "foo")).deriveType(null);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    DateTimeLiteral actualDateTimeLiteral = new DateTimeLiteral("foo", "foo");

    // Assert
    Type type = actualDateTimeLiteral.getType();
    String actualLexeme = actualDateTimeLiteral.getLexeme();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("foo", actualDateTimeLiteral.getConversionFunction());
    assertEquals("foo", actualLexeme);
  }
}

