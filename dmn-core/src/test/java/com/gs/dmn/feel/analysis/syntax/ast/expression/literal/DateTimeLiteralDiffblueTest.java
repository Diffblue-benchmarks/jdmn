package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Test;

public class DateTimeLiteralDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    DateTimeLiteral actualDateTimeLiteral = new DateTimeLiteral("0.8.9",
        "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"");

    // Assert
    assertTrue(actualDateTimeLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("0.8.9", actualDateTimeLiteral.getConversionFunction());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        actualDateTimeLiteral.getLexeme());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    DateTimeLiteral dateTimeLiteral = new DateTimeLiteral("duration", "\"P444D444H444M444H444.44S\"");

    // Act
    dateTimeLiteral.deriveType(null);

    // Assert
    assertTrue(dateTimeLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.DurationType);
  }

  @Test
  public void testDeriveType2() {
    // Arrange
    DateTimeLiteral dateTimeLiteral = new DateTimeLiteral("duration", "\"P444Y444M\"");

    // Act
    dateTimeLiteral.deriveType(null);

    // Assert
    assertTrue(dateTimeLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.DurationType);
  }

  @Test
  public void testAccept() {
    // Arrange
    DateTimeLiteral dateTimeLiteral = new DateTimeLiteral("0.8.9",
        "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"");
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertTrue(((DateTimeLiteral) dateTimeLiteral.accept(new CloneVisitor(), params))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("0.8.9",
        ((DateTimeLiteral) dateTimeLiteral.accept(new CloneVisitor(), params)).getConversionFunction());
    assertEquals("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
        ((DateTimeLiteral) dateTimeLiteral.accept(new CloneVisitor(), params)).getLexeme());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals(
        "DateTimeLiteral(0.8.9, \"[-]?P([0-9]+D)?T?([0-9]+H)" + "?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0-9]*)?S)?\")",
        (new DateTimeLiteral("0.8.9", "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\""))
            .toString());
  }
}

