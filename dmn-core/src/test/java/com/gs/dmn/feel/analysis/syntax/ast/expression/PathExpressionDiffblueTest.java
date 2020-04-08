package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
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

public class PathExpressionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    PathExpression actualPathExpression = new PathExpression(new ExpressionList(), "member");

    // Assert
    assertTrue(actualPathExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("PathExpression(ExpressionList(), member)", actualPathExpression.toString());
    assertEquals("member", actualPathExpression.getMember());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    PathExpression pathExpression = new PathExpression(new ExpressionList(), "member");

    // Act
    pathExpression.deriveType(null);

    // Assert
    assertTrue(pathExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testAccept() {
    // Arrange
    PathExpression pathExpression = new PathExpression(new ExpressionList(), "member");
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(pathExpression, pathExpression.accept(new NopVisitor(), params));
  }

  @Test
  public void testAccept2() {
    // Arrange
    PathExpression pathExpression = new PathExpression(new ExpressionList(), "member");
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = pathExpression.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((PathExpression) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((PathExpression) actualAcceptResult).getSource();
    String actualToStringResult = source.toString();
    assertEquals("PathExpression(ExpressionList(), member)", actualAcceptResult.toString());
    assertEquals("member", ((PathExpression) actualAcceptResult).getMember());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, source.getType());
  }

  @Test
  public void testAccept3() {
    // Arrange
    PathExpression pathExpression = new PathExpression(new ExpressionList(), "member");
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(pathExpression, pathExpression.accept(visitor, FEELContext.makeContext(null)));
    assertTrue(((PathExpression) pathExpression.accept(visitor, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    Type type = ((PathExpression) pathExpression.accept(visitor, FEELContext.makeContext(null))).getSource().getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type.toString());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("PathExpression(ExpressionList(), member)",
        (new PathExpression(new ExpressionList(), "member")).toString());
  }
}

