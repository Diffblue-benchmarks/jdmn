package com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.NumberType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.HashMap;
import org.junit.Test;

public class ArithmeticNegationDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ArithmeticNegation actualArithmeticNegation = new ArithmeticNegation(new ExpressionList());

    // Assert
    assertNull(actualArithmeticNegation.getRightOperand());
    assertEquals("-", actualArithmeticNegation.getOperator());
    assertEquals("ArithmeticNegation(ExpressionList())", actualArithmeticNegation.toString());
    assertTrue(actualArithmeticNegation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testAccept() {
    // Arrange
    ArithmeticNegation arithmeticNegation = new ArithmeticNegation(new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = arithmeticNegation.accept(new CloneVisitor(), params);

    // Assert
    assertNull(((ArithmeticNegation) actualAcceptResult).getRightOperand());
    assertEquals("-", ((ArithmeticNegation) actualAcceptResult).getOperator());
    assertEquals("ArithmeticNegation(ExpressionList())", actualAcceptResult.toString());
    Expression leftOperand = ((ArithmeticNegation) actualAcceptResult).getLeftOperand();
    Type type = ((ArithmeticNegation) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", leftOperand.toString());
  }

  @Test
  public void testAccept2() {
    // Arrange
    ArithmeticNegation arithmeticNegation = new ArithmeticNegation(new NumericLiteral("value"));
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(arithmeticNegation, arithmeticNegation.accept(visitor, FEELContext.makeContext(null)));
    Type actualType = ((ArithmeticNegation) arithmeticNegation.accept(visitor, FEELContext.makeContext(null)))
        .getLeftOperand().getType();
    Type type = ((ArithmeticNegation) arithmeticNegation.accept(visitor, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof NumberType);
    assertSame(type, actualType);
  }

  @Test
  public void testAccept3() {
    // Arrange
    ArithmeticNegation arithmeticNegation = new ArithmeticNegation(new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(arithmeticNegation, arithmeticNegation.accept(new NopVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("ArithmeticNegation(ArithmeticNegation(ExpressionList" + "()))",
        (new ArithmeticNegation(new ArithmeticNegation(new ExpressionList()))).toString());
  }

  @Test
  public void testToString2() {
    // Arrange, Act and Assert
    assertEquals("ArithmeticNegation(ExpressionList())", (new ArithmeticNegation(new ExpressionList())).toString());
  }
}

