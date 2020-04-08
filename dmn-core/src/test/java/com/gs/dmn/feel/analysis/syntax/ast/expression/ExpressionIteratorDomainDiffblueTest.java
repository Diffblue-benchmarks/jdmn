package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.type.TupleType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.HashMap;
import org.junit.Test;

public class ExpressionIteratorDomainDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("ExpressionIteratorDomain(ExpressionList())",
        (new ExpressionIteratorDomain(new ExpressionList())).toString());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new ExpressionList());

    // Act
    expressionIteratorDomain.deriveType(null);

    // Assert
    assertTrue(expressionIteratorDomain.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testAccept() {
    // Arrange
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new ExpressionList());
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(expressionIteratorDomain, expressionIteratorDomain.accept(visitor, FEELContext.makeContext(null)));
    Type type = ((ExpressionIteratorDomain) expressionIteratorDomain.accept(visitor, FEELContext.makeContext(null)))
        .getType();
    assertTrue(type instanceof TupleType);
    assertSame(type,
        ((ExpressionIteratorDomain) expressionIteratorDomain.accept(visitor, FEELContext.makeContext(null)))
            .getExpression().getType());
    assertEquals("TupleType()", type.toString());
  }

  @Test
  public void testAccept2() {
    // Arrange
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(expressionIteratorDomain, expressionIteratorDomain.accept(new NopVisitor(), params));
  }

  @Test
  public void testAccept3() {
    // Arrange
    ExpressionIteratorDomain expressionIteratorDomain = new ExpressionIteratorDomain(new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = expressionIteratorDomain.accept(new CloneVisitor(), params);

    // Assert
    Expression expression = ((ExpressionIteratorDomain) actualAcceptResult).getExpression();
    assertEquals("ExpressionIteratorDomain(ExpressionList())", actualAcceptResult.toString());
    assertTrue(expression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", expression.toString());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("ExpressionIteratorDomain(ExpressionList())",
        (new ExpressionIteratorDomain(new ExpressionList())).toString());
  }
}

