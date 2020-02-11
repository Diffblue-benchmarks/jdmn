package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class QualifiedNameDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    QualifiedName qualifiedName = new QualifiedName(null);
    CloneVisitor visitor = new CloneVisitor();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    qualifiedName.accept(visitor, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void getNamesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new QualifiedName(null)).getNames().size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    QualifiedName actualQualifiedName = new QualifiedName(null);

    // Assert
    String actualQualifiedName1 = actualQualifiedName.getQualifiedName();
    assertEquals("", actualQualifiedName1);
    assertTrue(actualQualifiedName.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("QualifiedName(, 0)", (new QualifiedName(null)).toString());
  }

  @Test(timeout=10000)
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("", (new QualifiedName(null)).getName());
  }

  @Test(timeout=10000)
  public void getQualifiedNameTest() {
    // Arrange, Act and Assert
    assertEquals("", (new QualifiedName(null)).getQualifiedName());
  }
}

