package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.BooleanType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.HashMap;
import org.junit.Test;

public class ExpressionTestDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ExpressionTest actualExpressionTest = new ExpressionTest(new ExpressionList());

    // Assert
    assertTrue(actualExpressionTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionTest(ExpressionList())", actualExpressionTest.toString());
  }

  @Test
  public void testAccept() {
    // Arrange
    ExpressionTest expressionTest = new ExpressionTest(new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = expressionTest.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((ExpressionTest) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression expression = ((ExpressionTest) actualAcceptResult).getExpression();
    String actualToStringResult = expression.toString();
    assertEquals("ExpressionTest(ExpressionList())", actualAcceptResult.toString());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, expression.getType());
  }

  @Test
  public void testAccept2() {
    // Arrange
    ExpressionTest expressionTest = new ExpressionTest(new Any());
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(expressionTest, expressionTest.accept(visitor, FEELContext.makeContext(null)));
    Type type = ((ExpressionTest) expressionTest.accept(visitor, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof BooleanType);
    assertSame(type,
        ((ExpressionTest) expressionTest.accept(visitor, FEELContext.makeContext(null))).getExpression().getType());
  }

  @Test
  public void testAccept3() {
    // Arrange
    ExpressionTest expressionTest = new ExpressionTest(new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(expressionTest, expressionTest.accept(new NopVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("ExpressionTest(ExpressionList())", (new ExpressionTest(new ExpressionList())).toString());
  }
}

