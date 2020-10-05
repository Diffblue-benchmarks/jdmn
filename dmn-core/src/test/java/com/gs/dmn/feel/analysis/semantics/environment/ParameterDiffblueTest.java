package com.gs.dmn.feel.analysis.semantics.environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.gs.dmn.feel.analysis.semantics.type.DateTimeType;
import com.gs.dmn.feel.analysis.semantics.type.DateType;
import com.gs.dmn.feel.analysis.semantics.type.StringType;
import org.junit.Test;

public class ParameterDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Parameter actualParameter = new Parameter("from", new StringType());

    // Assert
    assertFalse(actualParameter.isOptional());
    assertFalse(actualParameter.isVarArg());
    assertEquals("from -> string, false, false)", actualParameter.toString());
    assertEquals("from", actualParameter.getName());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    Parameter actualParameter = new Parameter("from", new DateType());

    // Assert
    assertFalse(actualParameter.isOptional());
    assertFalse(actualParameter.isVarArg());
    assertEquals("from -> date, false, false)", actualParameter.toString());
    assertEquals("from", actualParameter.getName());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    Parameter actualParameter = new Parameter("from", new DateTimeType("date and time"));

    // Assert
    assertFalse(actualParameter.isOptional());
    assertFalse(actualParameter.isVarArg());
    assertEquals("from -> date and time, false, false)", actualParameter.toString());
    assertEquals("from", actualParameter.getName());
  }

  @Test
  public void testConstructor4() {
    // Arrange and Act
    Parameter actualParameter = new Parameter("from", new StringType(), false, false);

    // Assert
    assertFalse(actualParameter.isOptional());
    assertFalse(actualParameter.isVarArg());
    assertEquals("from -> string, false, false)", actualParameter.toString());
    assertEquals("from", actualParameter.getName());
  }

  @Test
  public void testConstructor5() {
    // Arrange and Act
    Parameter actualParameter = new Parameter("from", new DateType(), false, false);

    // Assert
    assertFalse(actualParameter.isOptional());
    assertFalse(actualParameter.isVarArg());
    assertEquals("from -> date, false, false)", actualParameter.toString());
    assertEquals("from", actualParameter.getName());
  }

  @Test
  public void testConstructor6() {
    // Arrange and Act
    Parameter actualParameter = new Parameter("from", new DateTimeType("date and time"), false, false);

    // Assert
    assertFalse(actualParameter.isOptional());
    assertFalse(actualParameter.isVarArg());
    assertEquals("from -> date and time, false, false)", actualParameter.toString());
    assertEquals("from", actualParameter.getName());
  }
}

