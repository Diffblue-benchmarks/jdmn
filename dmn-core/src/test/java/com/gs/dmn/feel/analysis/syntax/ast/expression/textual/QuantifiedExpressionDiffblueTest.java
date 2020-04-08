package com.gs.dmn.feel.analysis.syntax.ast.expression.textual;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Iterator;
import com.gs.dmn.feel.analysis.syntax.ast.expression.IteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.RangeIteratorDomain;
import java.util.ArrayList;
import org.junit.Test;

public class QuantifiedExpressionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    ExpressionList expressionList = new ExpressionList();
    iteratorList.add(new Iterator("predicate", new ExpressionIteratorDomain(expressionList)));

    // Act
    QuantifiedExpression actualQuantifiedExpression = new QuantifiedExpression("predicate", iteratorList,
        expressionList);

    // Assert
    assertTrue(actualQuantifiedExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("predicate", actualQuantifiedExpression.getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate"
        + " in ExpressionIteratorDomain(ExpressionList())) ->" + " ExpressionList())",
        actualQuantifiedExpression.toString());
  }

  @Test
  public void testToForExpression() {
    // Arrange
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new ExpressionIteratorDomain(null)));

    // Act
    ForExpression actualToForExpressionResult = (new QuantifiedExpression("predicate", iteratorList,
        new ExpressionList())).toForExpression();

    // Assert
    assertTrue(actualToForExpressionResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ForExpression(Iterator(predicate in ExpressionIter" + "atorDomain(null)) -> ExpressionList())",
        actualToForExpressionResult.toString());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new ExpressionIteratorDomain(null)));
    QuantifiedExpression quantifiedExpression = new QuantifiedExpression("predicate", iteratorList,
        new ExpressionList());

    // Act
    quantifiedExpression.deriveType(null);

    // Assert
    assertTrue(quantifiedExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testAccept() {
    // Arrange
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new ExpressionIteratorDomain(null)));
    QuantifiedExpression quantifiedExpression = new QuantifiedExpression("predicate", iteratorList,
        new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(quantifiedExpression, quantifiedExpression.accept(new NopVisitor(), params));
  }

  @Test
  public void testAccept2() {
    // Arrange
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    QuantifiedExpression quantifiedExpression = new QuantifiedExpression("predicate", iteratorList,
        new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = quantifiedExpression.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((QuantifiedExpression) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((QuantifiedExpression) actualAcceptResult).getIterators().get(0);
    assertEquals("predicate", ((QuantifiedExpression) actualAcceptResult).getPredicate());
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate" + " in RangeIteratorDomain(ExpressionList(),"
        + " ExpressionList())) -> ExpressionList())", actualAcceptResult.toString());
    Expression body = ((QuantifiedExpression) actualAcceptResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    assertEquals("predicate", getResult.getName());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(predicate in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    String actualToStringResult = end.toString();
    Expression start = ((RangeIteratorDomain) domain).getStart();
    String actualToStringResult1 = start.toString();
    assertEquals("RangeIteratorDomain(ExpressionList()," + " ExpressionList())", domain.toString());
    assertEquals("ExpressionList()", actualToStringResult1);
    assertSame(type, start.getType());
    assertEquals("ExpressionList()", actualToStringResult);
    assertSame(type, end.getType());
  }

  @Test
  public void testToString() {
    // Arrange
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new ExpressionIteratorDomain(null)));

    // Act and Assert
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate"
        + " in ExpressionIteratorDomain(null)) -> ExpressionList" + "())",
        (new QuantifiedExpression("predicate", iteratorList, new ExpressionList())).toString());
  }
}

