package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class ContextTypeDiffblueTest {
  @Test
  public void addMemberTest() {
    // Arrange
    ContextType contextType = new ContextType();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act and Assert
    assertSame(contextType, contextType.addMember("name", stringList, new AnyType()));
  }

  @Test
  public void conformsToTest() {
    // Arrange
    ContextType contextType = new ContextType();

    // Act and Assert
    assertFalse(contextType.conformsTo(new AnyType()));
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("ContextType()", (new ContextType()).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange
    HashMap<String, Type> stringTypeMap = new HashMap<String, Type>();
    stringTypeMap.put("foo", new AnyType());

    // Act and Assert
    assertEquals("ContextType(foo = Any)", (new ContextType(stringTypeMap)).toString());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ContextType()).equals("o"));
  }

  @Test
  public void equivalentToTest() {
    // Arrange
    ContextType contextType = new ContextType();

    // Act and Assert
    assertFalse(contextType.equivalentTo(new AnyType()));
  }

  @Test
  public void getAliasesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ContextType()).getAliases("name").size());
  }

  @Test
  public void getMemberTypeTest() {
    // Arrange, Act and Assert
    assertNull((new ContextType()).getMemberType("key"));
  }

  @Test
  public void getMembersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ContextType()).getMembers().size());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ContextType()).hashCode());
  }

  @Test
  public void isValidTest() {
    // Arrange, Act and Assert
    assertFalse((new ContextType()).isValid());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ContextType()", (new ContextType()).toString());
  }
}

