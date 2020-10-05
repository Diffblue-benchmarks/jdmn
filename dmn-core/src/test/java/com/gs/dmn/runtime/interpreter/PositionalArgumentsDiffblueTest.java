package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FormalParameter;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class PositionalArgumentsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();

    // Act and Assert
    assertSame(objectList, (new PositionalArguments(objectList)).getArguments());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();

    // Act and Assert
    assertSame(objectList, (new PositionalArguments(objectList)).getArguments());
  }

  @Test
  public void testConstructor3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();

    // Act and Assert
    assertSame(objectList, (new PositionalArguments(objectList)).getArguments());
  }

  @Test
  public void testArgumentList() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    PositionalArguments positionalArguments = new PositionalArguments(objectList);

    // Act
    List<Object> actualArgumentListResult = positionalArguments.argumentList(new ArrayList<FormalParameter>());

    // Assert
    assertSame(objectList, actualArgumentListResult);
    assertEquals(0, actualArgumentListResult.size());
  }

  @Test
  public void testArgumentList2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    PositionalArguments positionalArguments = new PositionalArguments(objectList);

    // Act
    List<Object> actualArgumentListResult = positionalArguments.argumentList(new ArrayList<FormalParameter>());

    // Assert
    assertSame(objectList, actualArgumentListResult);
    assertEquals(0, actualArgumentListResult.size());
  }

  @Test
  public void testArgumentList3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<Object>();
    PositionalArguments positionalArguments = new PositionalArguments(objectList);

    // Act
    List<Object> actualArgumentListResult = positionalArguments.argumentList(new ArrayList<FormalParameter>());

    // Assert
    assertSame(objectList, actualArgumentListResult);
    assertEquals(0, actualArgumentListResult.size());
  }
}

