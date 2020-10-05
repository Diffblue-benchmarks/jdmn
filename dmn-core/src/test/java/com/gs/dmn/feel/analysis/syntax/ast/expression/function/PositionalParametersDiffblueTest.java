package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertTrue;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Expression;
import java.util.ArrayList;
import org.junit.Test;

public class PositionalParametersDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new PositionalParameters(new ArrayList<Expression>())).isEmpty());
    assertTrue((new PositionalParameters(new ArrayList<Expression>())).isEmpty());
    assertTrue((new PositionalParameters(new ArrayList<Expression>())).isEmpty());
  }
}

