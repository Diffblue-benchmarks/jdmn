package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class ContextTypeDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ContextType()).equals("foo"));
  }

  @Test(timeout=10000)
  public void getAliasesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ContextType()).getAliases("name").size());
  }

  @Test(timeout=10000)
  public void addMemberTest() {
    // Arrange
    ContextType contextType = new ContextType();

    // Act and Assert
    assertSame(contextType, contextType.addMember("name", null, new AnyType()));
  }

  @Test(timeout=10000)
  public void isValidTest() {
    // Arrange, Act and Assert
    assertFalse((new ContextType()).isValid());
  }

  @Test(timeout=10000)
  public void equivalentToTest() {
    // Arrange
    ContextType contextType = new ContextType();

    // Act and Assert
    assertFalse(contextType.equivalentTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ContextType()).hashCode());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("ContextType()", (new ContextType()).toString());
  }

  @Test(timeout=10000)
  public void conformsToTest() {
    // Arrange
    ContextType contextType = new ContextType();

    // Act and Assert
    assertFalse(contextType.conformsTo(new AnyType()));
  }

  @Test(timeout=10000)
  public void getMembersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ContextType()).getMembers().size());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ContextType()", (new ContextType()).toString());
  }

  @Test(timeout=10000)
  public void getMemberTypeTest() {
    // Arrange, Act and Assert
    assertNull((new ContextType()).getMemberType("foo"));
  }
}

