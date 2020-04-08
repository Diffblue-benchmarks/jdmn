package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.BooleanType;
import com.gs.dmn.feel.analysis.semantics.type.TupleType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;

public class NegatedPositiveUnaryTestsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());

    // Act
    NegatedPositiveUnaryTests actualNegatedPositiveUnaryTests = new NegatedPositiveUnaryTests(
        new PositiveUnaryTests(positiveUnaryTestList));

    // Assert
    assertTrue(actualNegatedPositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("NegatedUnaryTests(PositiveUnaryTests(NullTest()))", actualNegatedPositiveUnaryTests.toString());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());
    NegatedPositiveUnaryTests negatedPositiveUnaryTests = new NegatedPositiveUnaryTests(
        new PositiveUnaryTests(positiveUnaryTestList));

    // Act
    negatedPositiveUnaryTests.deriveType(null);

    // Assert
    assertTrue(negatedPositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testAccept() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());
    NegatedPositiveUnaryTests negatedPositiveUnaryTests = new NegatedPositiveUnaryTests(
        new PositiveUnaryTests(positiveUnaryTestList));
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = negatedPositiveUnaryTests.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((NegatedPositiveUnaryTests) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    PositiveUnaryTests positiveUnaryTests = ((NegatedPositiveUnaryTests) actualAcceptResult).getPositiveUnaryTests();
    String actualToStringResult = positiveUnaryTests.toString();
    assertEquals("NegatedUnaryTests(PositiveUnaryTests(NullTest()))", actualAcceptResult.toString());
    assertEquals("PositiveUnaryTests(NullTest())", actualToStringResult);
    assertSame(type, positiveUnaryTests.getType());
  }

  @Test
  public void testAccept2() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());
    NegatedPositiveUnaryTests negatedPositiveUnaryTests = new NegatedPositiveUnaryTests(
        new PositiveUnaryTests(positiveUnaryTestList));
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(negatedPositiveUnaryTests, negatedPositiveUnaryTests.accept(new NopVisitor(), params));
  }

  @Test
  public void testAccept3() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());
    NegatedPositiveUnaryTests negatedPositiveUnaryTests = new NegatedPositiveUnaryTests(
        new PositiveUnaryTests(positiveUnaryTestList));
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(negatedPositiveUnaryTests, negatedPositiveUnaryTests.accept(visitor, FEELContext.makeContext(null)));
    Type type = ((NegatedPositiveUnaryTests) negatedPositiveUnaryTests.accept(visitor, FEELContext.makeContext(null)))
        .getType();
    assertTrue(type instanceof TupleType);
    PositiveUnaryTests positiveUnaryTests = ((NegatedPositiveUnaryTests) negatedPositiveUnaryTests.accept(visitor,
        FEELContext.makeContext(null))).getPositiveUnaryTests();
    List<Type> types = ((TupleType) type).getTypes();
    assertEquals("TupleType(boolean)", type.toString());
    Type getResult = types.get(0);
    assertSame(type, positiveUnaryTests.getType());
    assertSame(getResult, positiveUnaryTests.getPositiveUnaryTests().get(0).getType());
  }

  @Test
  public void testToString() {
    // Arrange
    ArrayList<PositiveUnaryTest> positiveUnaryTestList = new ArrayList<PositiveUnaryTest>();
    positiveUnaryTestList.add(new NullTest());

    // Act and Assert
    assertEquals("NegatedUnaryTests(PositiveUnaryTests(NullTest()))",
        (new NegatedPositiveUnaryTests(new PositiveUnaryTests(positiveUnaryTestList))).toString());
  }
}

