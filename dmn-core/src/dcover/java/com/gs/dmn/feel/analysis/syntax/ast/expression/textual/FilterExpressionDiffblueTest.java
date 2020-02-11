package com.gs.dmn.feel.analysis.syntax.ast.expression.textual;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.semantics.SemanticError;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FilterExpressionDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void acceptTest() {
    // Arrange
    ExpressionList source = new ExpressionList();
    FilterExpression filterExpression = new FilterExpression(source, new ExpressionList());
    CloneVisitor visitor = new CloneVisitor();

    // Act
    Object actualAcceptResult = filterExpression.accept(visitor, FEELContext.makeContext(null));

    // Assert
    Type type = ((FilterExpression) actualAcceptResult).getType();
    String actualToStringResult = actualAcceptResult.toString();
    Expression filter = ((FilterExpression) actualAcceptResult).getFilter();
    Expression source1 = ((FilterExpression) actualAcceptResult).getSource();
    assertTrue(type instanceof AnyType);
    Type actualType = source1.getType();
    String actualToStringResult1 = source1.toString();
    assertEquals("FilterExpression(ExpressionList()," + " ExpressionList())", actualToStringResult);
    Type actualType1 = filter.getType();
    assertEquals("ExpressionList()", filter.toString());
    assertSame(type, actualType1);
    assertSame(type, actualType);
    assertEquals("ExpressionList()", actualToStringResult1);
  }

  @Test(timeout=10000)
  public void getSourceTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new FilterExpression(expressionList, new ExpressionList())).getSource());
  }

  @Test(timeout=10000)
  public void getFilterTest() {
    // Arrange
    ExpressionList source = new ExpressionList();
    ExpressionList expressionList = new ExpressionList();

    // Act and Assert
    assertSame(expressionList, (new FilterExpression(source, expressionList)).getFilter());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ExpressionList source = new ExpressionList();

    // Act
    FilterExpression actualFilterExpression = new FilterExpression(source, new ExpressionList());

    // Assert
    Type type = actualFilterExpression.getType();
    assertTrue(type instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FilterExpression(ExpressionList()," + " ExpressionList())", actualFilterExpression.toString());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    ExpressionList source = new ExpressionList();

    // Act and Assert
    assertEquals("FilterExpression(ExpressionList()," + " ExpressionList())",
        (new FilterExpression(source, new ExpressionList())).toString());
  }

  @Test(timeout=10000)
  public void deriveTypeTest() {
    // Arrange
    ExpressionList source = new ExpressionList();

    // Act and Assert
    thrown.expect(SemanticError.class);
    (new FilterExpression(source, new ExpressionList())).deriveType(null);
  }

  @Test(timeout=10000)
  public void setFilterTest() {
    // Arrange
    ExpressionList source = new ExpressionList();
    FilterExpression filterExpression = new FilterExpression(source, new ExpressionList());

    // Act
    filterExpression.setFilter(new ExpressionList());

    // Assert
    assertEquals("FilterExpression(ExpressionList()," + " ExpressionList())", filterExpression.toString());
  }
}

