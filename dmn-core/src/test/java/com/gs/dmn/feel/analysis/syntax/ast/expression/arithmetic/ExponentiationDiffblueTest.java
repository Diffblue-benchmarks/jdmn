package com.gs.dmn.feel.analysis.syntax.ast.expression.arithmetic;

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
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NullLiteral;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.HashMap;
import org.junit.Test;

public class ExponentiationDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Exponentiation actualExponentiation = new Exponentiation(new ExpressionList(), new ExpressionList());

    // Assert
    assertEquals("**", actualExponentiation.getOperator());
    assertTrue(actualExponentiation.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Exponentiation(ExpressionList(),ExpressionList())", actualExponentiation.toString());
  }

  @Test
  public void testAccept() {
    // Arrange
    Exponentiation exponentiation = new Exponentiation(new NullLiteral(), new NullLiteral());
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(exponentiation, exponentiation.accept(visitor, FEELContext.makeContext(null)));
    Type type = ((Exponentiation) exponentiation.accept(visitor, FEELContext.makeContext(null))).getRightOperand()
        .getType();
    assertTrue(((Exponentiation) exponentiation.accept(visitor, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NumberType);
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }

  @Test
  public void testAccept2() {
    // Arrange
    Exponentiation exponentiation = new Exponentiation(new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = exponentiation.accept(new CloneVisitor(), params);

    // Assert
    assertEquals("**", ((Exponentiation) actualAcceptResult).getOperator());
    Expression rightOperand = ((Exponentiation) actualAcceptResult).getRightOperand();
    String actualToStringResult = rightOperand.toString();
    Type type = ((Exponentiation) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression leftOperand = ((Exponentiation) actualAcceptResult).getLeftOperand();
    String actualToStringResult1 = leftOperand.toString();
    assertEquals("Exponentiation(ExpressionList(),ExpressionList())", actualAcceptResult.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, leftOperand.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, rightOperand.getType());
  }

  @Test
  public void testAccept3() {
    // Arrange
    Exponentiation exponentiation = new Exponentiation(new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(exponentiation, exponentiation.accept(new NopVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("Exponentiation(ExpressionList(),ExpressionList())",
        (new Exponentiation(new ExpressionList(), new ExpressionList())).toString());
  }
}

