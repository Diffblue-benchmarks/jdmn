package com.gs.dmn.feel.analysis.syntax.ast.expression.textual;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Iterator;
import java.util.ArrayList;
import org.junit.Test;

public class QuantifiedExpressionDiffblueTest {
  @Test
  public void constructorTest() {
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
  public void toForExpressionTest() {
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
  public void toStringTest() {
    // Arrange
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("predicate", new ExpressionIteratorDomain(null)));

    // Act and Assert
    assertEquals("QuantifiedExpression(predicate, Iterator(predicate"
        + " in ExpressionIteratorDomain(null)) -> ExpressionList" + "())",
        (new QuantifiedExpression("predicate", iteratorList, new ExpressionList())).toString());
  }
}

