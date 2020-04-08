package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class PositiveUnaryTestsDiffblueTest {
  @Test
  public void testConstructor() {
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
  public void testConstructor2() {
    // Arrange and Act
    PositiveUnaryTests actualPositiveUnaryTests = new PositiveUnaryTests(null);

    // Assert
    assertTrue(actualPositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PositiveUnaryTests()", actualPositiveUnaryTests.toString());
  }

  @Test
  public void testDeriveType() {
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
  public void testAccept() {
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
  public void testAccept2() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());
    PositiveUnaryTests positiveUnaryTests = new PositiveUnaryTests(positiveUnaryTestList);
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(positiveUnaryTests, positiveUnaryTests.accept(new NopVisitor(), params));
  }

  @Test
  public void testAccept3() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());
    PositiveUnaryTests positiveUnaryTests = new PositiveUnaryTests(positiveUnaryTestList);
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(positiveUnaryTests, positiveUnaryTests.accept(visitor, FEELContext.makeContext(null)));
    Type type = ((PositiveUnaryTests) positiveUnaryTests.accept(visitor, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    PositiveUnaryTest getResult = ((PositiveUnaryTests) positiveUnaryTests.accept(visitor,
        FEELContext.makeContext(null))).getPositiveUnaryTests().get(0);
    assertEquals("TupleType(boolean)", type.toString());
    assertTrue(getResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void testToString() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());

    // Act and Assert
    assertEquals("PositiveUnaryTests(NullTest())", (new PositiveUnaryTests(positiveUnaryTestList)).toString());
  }
}

