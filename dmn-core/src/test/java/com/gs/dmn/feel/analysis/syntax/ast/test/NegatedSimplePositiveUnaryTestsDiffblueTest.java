package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.TupleType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.ListLiteral;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class NegatedSimplePositiveUnaryTestsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    simplePositiveUnaryTestList.add(new ListTest(new ListLiteral(null)));

    // Act
    NegatedSimplePositiveUnaryTests actualNegatedSimplePositiveUnaryTests = new NegatedSimplePositiveUnaryTests(
        new SimplePositiveUnaryTests(simplePositiveUnaryTestList));

    // Assert
    assertTrue(
        actualNegatedSimplePositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("NegatedSimpleUnaryTests(SimplePositiveUnaryTests" + "(ListTest(ListLiteral())))",
        actualNegatedSimplePositiveUnaryTests.toString());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    ListTest param0 = new ListTest(null);
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    simplePositiveUnaryTestList.add(param0);
    NegatedSimplePositiveUnaryTests negatedSimplePositiveUnaryTests = new NegatedSimplePositiveUnaryTests(
        new SimplePositiveUnaryTests(simplePositiveUnaryTestList));

    // Act
    negatedSimplePositiveUnaryTests.deriveType(null);

    // Assert
    assertTrue(negatedSimplePositiveUnaryTests.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testAccept() {
    // Arrange
    NegatedSimplePositiveUnaryTests negatedSimplePositiveUnaryTests = new NegatedSimplePositiveUnaryTests(
        new SimplePositiveUnaryTests(null));
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = negatedSimplePositiveUnaryTests.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((NegatedSimplePositiveUnaryTests) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    SimplePositiveUnaryTests simplePositiveUnaryTests = ((NegatedSimplePositiveUnaryTests) actualAcceptResult)
        .getSimplePositiveUnaryTests();
    String actualToStringResult = simplePositiveUnaryTests.toString();
    assertEquals("NegatedSimpleUnaryTests(SimplePositiveUnaryTests" + "())", actualAcceptResult.toString());
    assertEquals("SimplePositiveUnaryTests()", actualToStringResult);
    assertSame(type, simplePositiveUnaryTests.getType());
  }

  @Test
  public void testAccept2() {
    // Arrange
    NegatedSimplePositiveUnaryTests negatedSimplePositiveUnaryTests = new NegatedSimplePositiveUnaryTests(
        new SimplePositiveUnaryTests(null));
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(negatedSimplePositiveUnaryTests,
        negatedSimplePositiveUnaryTests.accept(visitor, FEELContext.makeContext(null)));
    Type type = ((NegatedSimplePositiveUnaryTests) negatedSimplePositiveUnaryTests.accept(visitor,
        FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof TupleType);
    Type actualType = ((NegatedSimplePositiveUnaryTests) negatedSimplePositiveUnaryTests.accept(visitor,
        FEELContext.makeContext(null))).getSimplePositiveUnaryTests().getType();
    assertEquals("TupleType()", type.toString());
    assertSame(type, actualType);
  }

  @Test
  public void testAccept3() {
    // Arrange
    ListTest param0 = new ListTest(null);
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    simplePositiveUnaryTestList.add(param0);
    NegatedSimplePositiveUnaryTests negatedSimplePositiveUnaryTests = new NegatedSimplePositiveUnaryTests(
        new SimplePositiveUnaryTests(simplePositiveUnaryTestList));
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(negatedSimplePositiveUnaryTests, negatedSimplePositiveUnaryTests.accept(new NopVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange
    ListTest param0 = new ListTest(null);
    ArrayList<SimplePositiveUnaryTest> simplePositiveUnaryTestList = new ArrayList<SimplePositiveUnaryTest>();
    simplePositiveUnaryTestList.add(param0);

    // Act and Assert
    assertEquals("NegatedSimpleUnaryTests(SimplePositiveUnaryTests" + "(ListTest(null)))",
        (new NegatedSimplePositiveUnaryTests(new SimplePositiveUnaryTests(simplePositiveUnaryTestList))).toString());
  }
}

