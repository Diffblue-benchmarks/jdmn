package com.gs.dmn.feel.analysis.syntax.ast.expression.textual;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionIteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Iterator;
import com.gs.dmn.feel.analysis.syntax.ast.expression.IteratorDomain;
import com.gs.dmn.feel.analysis.syntax.ast.expression.RangeIteratorDomain;
import java.util.ArrayList;
import org.junit.Test;

public class ForExpressionDiffblueTest {
  @Test
  public void testConstructor() {
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
  public void testDeriveType() {
    // Arrange
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new ExpressionIteratorDomain(null)));
    ForExpression forExpression = new ForExpression(iteratorList, new ExpressionList());

    // Act
    forExpression.deriveType(null);

    // Assert
    Type type = forExpression.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.ListType);
    assertTrue(type.isValid());
  }

  @Test
  public void testAccept() {
    // Arrange
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new RangeIteratorDomain(new ExpressionList(), new ExpressionList())));
    ForExpression forExpression = new ForExpression(iteratorList, new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = forExpression.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((ForExpression) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Iterator getResult = ((ForExpression) actualAcceptResult).getIterators().get(0);
    assertEquals("ForExpression(Iterator(name in RangeIteratorDomain" + "(ExpressionList(), ExpressionList())) ->"
        + " ExpressionList())", actualAcceptResult.toString());
    Expression body = ((ForExpression) actualAcceptResult).getBody();
    assertEquals("ExpressionList()", body.toString());
    assertSame(type, body.getType());
    IteratorDomain domain = getResult.getDomain();
    assertEquals("Iterator(name in RangeIteratorDomain(ExpressionList()," + " ExpressionList()))",
        getResult.toString());
    Expression end = ((RangeIteratorDomain) domain).getEnd();
    assertEquals("name", getResult.getName());
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
  public void testToNestedForExpression() {
    // Arrange
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new ExpressionIteratorDomain(null)));
    ForExpression forExpression = new ForExpression(iteratorList, new ExpressionList());

    // Act and Assert
    assertSame(forExpression, forExpression.toNestedForExpression());
  }

  @Test
  public void testToNestedForExpression2() {
    // Arrange
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>(1);
    iteratorList.add(new Iterator("name", new ExpressionIteratorDomain(new ExpressionList())));
    iteratorList.add(new Iterator("name", new ExpressionIteratorDomain(null)));

    // Act
    ForExpression actualToNestedForExpressionResult = (new ForExpression(iteratorList, new ExpressionList()))
        .toNestedForExpression();

    // Assert
    Type type = actualToNestedForExpressionResult.getType();
    assertTrue(type instanceof AnyType);
    Expression body = actualToNestedForExpressionResult.getBody();
    String actualToStringResult = body.toString();
    assertEquals(
        "ForExpression(Iterator(name in ExpressionIteratorDomain" + "(ExpressionList())) -> ForExpression(Iterator(name"
            + " in ExpressionIteratorDomain(null)) -> ExpressionList" + "()))",
        actualToNestedForExpressionResult.toString());
    assertEquals("ForExpression(Iterator(name in ExpressionIteratorDomain" + "(null)) -> ExpressionList())",
        actualToStringResult);
    assertSame(type, body.getType());
  }

  @Test
  public void testToString() {
    // Arrange
    ArrayList<Iterator> iteratorList = new ArrayList<Iterator>();
    iteratorList.add(new Iterator("name", new ExpressionIteratorDomain(null)));

    // Act and Assert
    assertEquals("ForExpression(Iterator(name in ExpressionIteratorDomain" + "(null)) -> ExpressionList())",
        (new ForExpression(iteratorList, new ExpressionList())).toString());
  }
}

