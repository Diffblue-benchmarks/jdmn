package com.gs.dmn.feel.analysis.syntax.ast.expression.textual;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
import com.gs.dmn.feel.analysis.syntax.ast.expression.PathExpression;
import com.gs.dmn.feel.analysis.syntax.ast.expression.comparison.Relational;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.NumericLiteral;
import org.junit.Test;

public class FilterExpressionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    Name source = new Name("Employees");
    Name leftOperand = new Name("dept");

    // Act
    FilterExpression actualFilterExpression = new FilterExpression(source,
        new Relational("=", leftOperand, new NumericLiteral("20")));

    // Assert
    assertTrue(actualFilterExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FilterExpression(Name(Employees), Relational(=,Name(dept),NumericLiteral(20)))",
        actualFilterExpression.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange
    Name source = new Name("EmployeeTable");
    Name leftOperand = new Name("name");

    // Act
    FilterExpression actualFilterExpression = new FilterExpression(source,
        new Relational("=", leftOperand, new Name("LastName")));

    // Assert
    assertTrue(actualFilterExpression.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("FilterExpression(Name(EmployeeTable), Relational(=,Name(name),Name(LastName)))",
        actualFilterExpression.toString());
  }

  @Test
  public void testSetFilter() {
    // Arrange
    Name source = new Name("Employees");
    Name leftOperand = new Name("dept");
    FilterExpression filterExpression = new FilterExpression(source,
        new Relational("=", leftOperand, new NumericLiteral("20")));
    PathExpression leftOperand1 = new PathExpression(new Name("item"), "dept");

    // Act
    filterExpression.setFilter(new Relational("=", leftOperand1, new NumericLiteral("20")));

    // Assert
    assertEquals("FilterExpression(Name(Employees), Relational(=,PathExpression(Name(item), dept),NumericLiteral(20)))",
        filterExpression.toString());
  }
}

