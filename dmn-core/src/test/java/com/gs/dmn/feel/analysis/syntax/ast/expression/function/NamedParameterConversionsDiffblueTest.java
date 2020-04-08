package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class NamedParameterConversionsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("NamedParameterConversions({})", (new NamedParameterConversions()).toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    HashMap<String, Conversion> stringConversionMap = new HashMap<String, Conversion>();
    stringConversionMap.put("foo", new Conversion(ConversionKind.NONE, new AnyType()));

    // Act and Assert
    assertEquals("NamedParameterConversions({foo=Conversion(NONE," + " Any)})",
        (new NamedParameterConversions(stringConversionMap)).toString());
  }

  @Test
  public void testConstructor3() {
    // Arrange, Act and Assert
    assertEquals("NamedParameterConversions({})",
        (new NamedParameterConversions((Map<String, Conversion>) null)).toString());
  }

  @Test
  public void testGetConversions() {
    // Arrange
    NamedParameterConversions namedParameterConversions = new NamedParameterConversions();
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("name", new AnyType()));

    // Act and Assert
    assertEquals(1, namedParameterConversions.getConversions(formalParameterList).size());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new NamedParameterConversions()).equals(null));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new NamedParameterConversions()).equals("o"));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(31, (new NamedParameterConversions()).hashCode());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("NamedParameterConversions({})", (new NamedParameterConversions()).toString());
  }
}

