package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DateTimeLiteralDiffblueTest {
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
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals(
        "DateTimeLiteral(\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9" + "]+M)?([0-9]+H)?([0-9]+(\\.[0-9]*)?S)?\", \"[-]?P([0-9"
            + "]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0-9]+(\\.[0" + "-9]*)?S)?\")",
        (new DateTimeLiteral("\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"",
            "\"[-]?P([0-9]+D)?T?([0-9]+H)?([0-9]+M)?([0-9]+H)?([0" + "-9]+(\\.[0-9]*)?S)?\"")).toString());
  }
}

