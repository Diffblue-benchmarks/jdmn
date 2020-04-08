package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.ListType;
import com.gs.dmn.feel.analysis.semantics.type.TupleType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class ListLiteralDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act
    ListLiteral actualListLiteral = new ListLiteral(expressionList);

    // Assert
    assertTrue(actualListLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ListLiteral(ExpressionList())", actualListLiteral.toString());
  }

  @Test
  public void testAdd() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    ExpressionList expressionList1 = new ExpressionList();
    expressionList.add(expressionList1);
    ListLiteral listLiteral = new ListLiteral(expressionList);

    // Act
    listLiteral.add(expressionList1);

    // Assert
    assertEquals("ListLiteral(ExpressionList(),ExpressionList())", listLiteral.toString());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>(1);
    expressionList.add(new ExpressionList());
    expressionList.add(new ExpressionList());
    ListLiteral listLiteral = new ListLiteral(expressionList);

    // Act
    listLiteral.deriveType(null);

    // Assert
    Type type = listLiteral.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.ListType);
    assertTrue(type.isValid());
  }

  @Test
  public void testDeriveType2() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    ListLiteral listLiteral = new ListLiteral(expressionList);

    // Act
    listLiteral.deriveType(null);

    // Assert
    Type type = listLiteral.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.ListType);
    assertTrue(type.isValid());
  }

  @Test
  public void testDeriveType3() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>(1);
    expressionList.add(new ExpressionList());
    ExpressionList expressionList1 = new ExpressionList();
    expressionList1.setType(new AnyType());
    expressionList.add(expressionList1);
    ListLiteral listLiteral = new ListLiteral(expressionList);

    // Act
    listLiteral.deriveType(null);

    // Assert
    assertTrue(listLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.ListType);
  }

  @Test
  public void testAccept() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    ListLiteral listLiteral = new ListLiteral(expressionList);
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(listLiteral, listLiteral.accept(new NopVisitor(), params));
  }

  @Test
  public void testAccept2() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    ListLiteral listLiteral = new ListLiteral(expressionList);
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = listLiteral.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((ListLiteral) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression getResult = ((ListLiteral) actualAcceptResult).getExpressionList().get(0);
    assertEquals("ListLiteral(ExpressionList())", actualAcceptResult.toString());
    assertEquals("ExpressionList()", getResult.toString());
    assertSame(type, getResult.getType());
  }

  @Test
  public void testAccept3() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());
    ListLiteral listLiteral = new ListLiteral(expressionList);
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(listLiteral, listLiteral.accept(visitor, FEELContext.makeContext(null)));
    Type type = ((ListLiteral) listLiteral.accept(visitor, FEELContext.makeContext(null))).getType();
    assertTrue(type instanceof ListType);
    Type elementType = ((ListType) type).getElementType();
    Expression getResult = ((ListLiteral) listLiteral.accept(visitor, FEELContext.makeContext(null)))
        .getExpressionList().get(0);
    assertFalse(type.isValid());
    Type actualType = getResult.getType();
    assertEquals("TupleType()", elementType.toString());
    assertSame(elementType, actualType);
  }

  @Test
  public void testToString() {
    // Arrange
    ArrayList<Expression> expressionList = new ArrayList<Expression>();
    expressionList.add(new ExpressionList());

    // Act and Assert
    assertEquals("ListLiteral(ExpressionList())", (new ListLiteral(expressionList)).toString());
  }
}

