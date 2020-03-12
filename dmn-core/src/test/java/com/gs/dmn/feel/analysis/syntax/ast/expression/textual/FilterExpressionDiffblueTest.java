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

  @Test
  public void acceptTest() {
    // Arrange
    FilterExpression filterExpression = new FilterExpression(new ExpressionList(), new ExpressionList());
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = filterExpression.accept(new CloneVisitor(), params);

    // Assert
    Type type = ((FilterExpression) actualAcceptResult).getType();
    assertTrue(type instanceof AnyType);
    Expression source = ((FilterExpression) actualAcceptResult).getSource();
    assertEquals("FilterExpression(ExpressionList()," + " ExpressionList())", actualAcceptResult.toString());
    Expression filter = ((FilterExpression) actualAcceptResult).getFilter();
    assertEquals("ExpressionList()", filter.toString());
    assertSame(type, filter.getType());
    assertSame(type, source.getType());
    assertEquals("ExpressionList()", source.toString());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    FilterExpression actualFilterExpression = new FilterExpression(new ExpressionList(), new ExpressionList());

    // Assert
    assertTrue(actualFilterExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FilterExpression(ExpressionList()," + " ExpressionList())", actualFilterExpression.toString());
  }

  @Test
  public void deriveTypeTest() {
    // Arrange, Act and Assert
    thrown.expect(SemanticError.class);
    (new FilterExpression(new ExpressionList(), new ExpressionList())).deriveType(null);
  }

  @Test
  public void setFilterTest() {
    // Arrange
    ExpressionList expressionList = new ExpressionList();
    FilterExpression filterExpression = new FilterExpression(expressionList, expressionList);

    // Act
    filterExpression.setFilter(expressionList);

    // Assert
    assertEquals("FilterExpression(ExpressionList()," + " ExpressionList())", filterExpression.toString());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("FilterExpression(ExpressionList()," + " ExpressionList())",
        (new FilterExpression(new ExpressionList(), new ExpressionList())).toString());
  }
}

