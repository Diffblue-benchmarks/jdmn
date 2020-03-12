package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class NamedParameterConversionsDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("NamedParameterConversions({})", (new NamedParameterConversions()).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("name", new AnyType()));

    // Act and Assert
    assertEquals("NamedParameterConversions({name=Conversion(NONE," + " Any)})",
        (new NamedParameterConversions(formalParameterList)).toString());
  }

  @Test
  public void constructorTest3() {
    // Arrange
    HashMap<String, Conversion> stringConversionMap = new HashMap<String, Conversion>();
    stringConversionMap.put("foo", new Conversion(ConversionKind.NONE, new AnyType()));

    // Act and Assert
    assertEquals("NamedParameterConversions({foo=Conversion(NONE," + " Any)})",
        (new NamedParameterConversions(stringConversionMap)).toString());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new NamedParameterConversions()).equals("o"));
  }

  @Test
  public void getConversionsTest() {
    // Arrange
    NamedParameterConversions namedParameterConversions = new NamedParameterConversions();
    ArrayList<FormalParameter> formalParameterList = new ArrayList<FormalParameter>();
    formalParameterList.add(new FormalParameter("name", new AnyType()));

    // Act and Assert
    assertEquals(1, namedParameterConversions.getConversions(formalParameterList).size());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(31, (new NamedParameterConversions()).hashCode());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("NamedParameterConversions({})", (new NamedParameterConversions()).toString());
  }
}

