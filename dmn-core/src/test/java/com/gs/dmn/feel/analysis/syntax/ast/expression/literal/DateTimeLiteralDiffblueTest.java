package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.SemanticError;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DateTimeLiteralDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void acceptTest() {
    // Arrange
    DateTimeLiteral dateTimeLiteral = new DateTimeLiteral(
        "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"");
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertTrue(((DateTimeLiteral) dateTimeLiteral.accept(new CloneVisitor(), params))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) dateTimeLiteral.accept(new CloneVisitor(), params)).getConversionFunction());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) dateTimeLiteral.accept(new CloneVisitor(), params)).getLexeme());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    DateTimeLiteral actualDateTimeLiteral = new DateTimeLiteral(
        "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"");

    // Assert
    assertTrue(actualDateTimeLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        actualDateTimeLiteral.getConversionFunction());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        actualDateTimeLiteral.getLexeme());
  }

  @Test
  public void deriveTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(SemanticError.class);
    (new DateTimeLiteral("duration", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""))
        .deriveType(null);
  }

  @Test
  public void deriveTypeTest2() {
    // Arrange, Act and Assert
    thrown.expect(SemanticError.class);
    (new DateTimeLiteral("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"")).deriveType(null);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals(
        "DateTimeLiteral(\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9" + "]+M)?([0-9]+H)?([0-9]+(\\.[0-9]*)?S)?\", \"[-]?P([0-9"
            + "]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0" + "-9]*)?S)?\")",
        (new DateTimeLiteral("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
            "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"")).toString());
  }
}

