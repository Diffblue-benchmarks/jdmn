package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import java.util.ArrayList;
import org.junit.Test;

public class PositiveUnaryTestsDiffblueTest {
  @Test
  public void acceptTest() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());
    PositiveUnaryTests positiveUnaryTests = new PositiveUnaryTests(positiveUnaryTestList);
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = positiveUnaryTests.accept(new CloneVisitor(), params);

    // Assert
    assertTrue(
        ((PositiveUnaryTests) actualAcceptResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PositiveUnaryTests(NullTest())", actualAcceptResult.toString());
  }

  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());

    // Act
    PositiveUnaryTests actualPositiveUnaryTests = new PositiveUnaryTests(positiveUnaryTestList);

    // Assert
    assertTrue(actualPositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PositiveUnaryTests(NullTest())", actualPositiveUnaryTests.toString());
  }

  @Test
  public void deriveTypeTest() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());
    PositiveUnaryTests positiveUnaryTests = new PositiveUnaryTests(positiveUnaryTestList);

    // Act
    positiveUnaryTests.deriveType(null);

    // Assert
    Type type = positiveUnaryTests.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType(Any)", type.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());

    // Act and Assert
    assertEquals("PositiveUnaryTests(NullTest())", (new PositiveUnaryTests(positiveUnaryTestList)).toString());
  }
}

