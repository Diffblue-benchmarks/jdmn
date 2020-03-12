package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import java.util.ArrayList;
import org.junit.Test;

public class QualifiedNameDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    QualifiedName qualifiedName = new QualifiedName(stringList);
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = qualifiedName.accept(new CloneVisitor(), params);

    // Assert
    assertTrue(((Name) actualAcceptResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(foo)", actualAcceptResult.toString());
  }

  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    QualifiedName actualQualifiedName = new QualifiedName(stringList);

    // Assert
    assertEquals("foo", actualQualifiedName.getQualifiedName());
    assertTrue(actualQualifiedName.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void getNameTest() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act and Assert
    assertEquals("foo", (new QualifiedName(stringList)).getName());
  }

  @Test
  public void getQualifiedNameTest() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act and Assert
    assertEquals("foo", (new QualifiedName(stringList)).getQualifiedName());
  }

  @Test
  public void toStringTest() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act and Assert
    assertEquals("QualifiedName(foo, 1)", (new QualifiedName(stringList)).toString());
  }
}

