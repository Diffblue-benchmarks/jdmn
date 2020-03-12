package com.gs.dmn.feel.analysis.syntax.ast.expression.textual;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Iterator;
import java.util.ArrayList;
import org.junit.Test;

public class ForExpressionDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    ExpressionList expressionList = new ExpressionList();
    iteratorList.add(new Iterator("name", new ExpressionIteratorDomain(expressionList)));

    // Act
    ForExpression actualForExpression = new ForExpression(iteratorList, expressionList);

    // Assert
    assertTrue(actualForExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("ForExpression(Iterator(name in ExpressionIteratorDomain" + "(ExpressionList())) -> ExpressionList())",
        actualForExpression.toString());
  }

  @Test
  public void toNestedForExpressionTest() {
    // Arrange
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new ExpressionIteratorDomain(null)));
    ForExpression forExpression = new ForExpression(iteratorList, new ExpressionList());

    // Act and Assert
    assertSame(forExpression, forExpression.toNestedForExpression());
  }

  @Test
  public void toStringTest() {
    // Arrange
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new ExpressionIteratorDomain(null)));

    // Act and Assert
    assertEquals("ForExpression(Iterator(name in ExpressionIteratorDomain" + "(null)) -> ExpressionList())",
        (new ForExpression(iteratorList, new ExpressionList())).toString());
  }
}

