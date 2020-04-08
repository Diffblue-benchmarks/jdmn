package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.HashMap;
import org.junit.Test;

public class RangeIteratorDomainDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())",
        (new RangeIteratorDomain(new ExpressionList(), new ExpressionList())).toString());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(new ExpressionList(), new ExpressionList());

    // Act
    rangeIteratorDomain.deriveType(null);

    // Assert
    Type type = rangeIteratorDomain.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    assertTrue(type.isValid());
  }

  @Test
  public void testAccept() {
    // Arrange
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = rangeIteratorDomain.accept(new CloneVisitor(), params);

    // Assert
    Expression end = ((RangeIteratorDomain) actualAcceptResult).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) actualAcceptResult).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", actualAcceptResult.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    Type type = start.getType();
    assertTrue(type instanceof AnyType);
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testAccept2() {
    // Arrange
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(rangeIteratorDomain, rangeIteratorDomain.accept(new NopVisitor(), params));
  }

  @Test
  public void testAccept3() {
    // Arrange
    RangeIteratorDomain rangeIteratorDomain = new RangeIteratorDomain(new ExpressionList(), new ExpressionList());
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(rangeIteratorDomain, rangeIteratorDomain.accept(visitor, FEELContext.makeContext(null)));
    Type type = ((RangeIteratorDomain) rangeIteratorDomain.accept(visitor, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.RangeType);
    Type type1 = ((RangeIteratorDomain) rangeIteratorDomain.accept(visitor, FEELContext.makeContext(null))).getEnd()
        .getType();
    assertTrue(type1 instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertFalse(type.isValid());
    assertEquals("TupleType()", type1.toString());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())",
        (new RangeIteratorDomain(new ExpressionList(), new ExpressionList())).toString());
  }
}

