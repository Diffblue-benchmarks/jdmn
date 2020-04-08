package com.gs.dmn.feel.analysis.syntax.ast.expression;

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

public class ExpressionListDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ExpressionList actualExpressionList = new ExpressionList();

    // Assert
    assertTrue(actualExpressionList.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", actualExpressionList.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act
    ExpressionList actualExpressionList = new ExpressionList(expressionList);

    // Assert
    assertTrue(actualExpressionList.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList(ExpressionList())", actualExpressionList.toString());
  }

  @Test
  public void testAdd() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act
    expressionList.add(new ExpressionList());

    // Assert
    assertEquals("ExpressionList(ExpressionList())", expressionList.toString());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act
    expressionList.deriveType(null);

    // Assert
    Type type = expressionList.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type.toString());
  }

  @Test
  public void testAccept() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = expressionList.accept(new CloneVisitor(), params);

    // Assert
    assertTrue(
        ((ExpressionList) actualAcceptResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", actualAcceptResult.toString());
  }

  @Test
  public void testAccept2() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(expressionList, expressionList.accept(new NopVisitor(), params));
  }

  @Test
  public void testAccept3() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    ExpressionList expressionList1 = new ExpressionList(expressionList);
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = expressionList1.accept(new CloneVisitor(), params);

    // Assert
    assertTrue(
        ((ExpressionList) actualAcceptResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ExpressionList()", actualAcceptResult.toString());
  }

  @Test
  public void testAccept4() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(expressionList, expressionList.accept(visitor, FEELContext.makeContext(null)));
    Type type = ((ExpressionList) expressionList.accept(visitor, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.TupleType);
    assertEquals("TupleType()", type.toString());
  }

  @Test
  public void testToString() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>(1);
    expressionList.add(new ExpressionList());
    expressionList.add(new ExpressionList());

    // Act and Assert
    assertEquals("ExpressionList(ExpressionList(),ExpressionList())", (new ExpressionList(expressionList)).toString());
  }

  @Test
  public void testToString2() {
    // Arrange, Act and Assert
    assertEquals("ExpressionList()", (new ExpressionList()).toString());
  }

  @Test
  public void testToString3() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act and Assert
    assertEquals("ExpressionList(ExpressionList())", (new ExpressionList(expressionList)).toString());
  }
}

