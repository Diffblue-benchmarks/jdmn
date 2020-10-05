package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import java.util.ArrayList;
import org.junit.Test;

public class PositionalParameterConversionsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("PositionalParameterConversions([])", (new PositionalParameterConversions()).toString());
    assertEquals("PositionalParameterConversions([])", (new PositionalParameterConversions()).toString());
    assertEquals("PositionalParameterConversions([])", (new PositionalParameterConversions()).toString());
    assertEquals("PositionalParameterConversions([])",
        (new PositionalParameterConversions(new ArrayList<Type>())).toString());
    assertEquals("PositionalParameterConversions([])",
        (new PositionalParameterConversions(new ArrayList<Type>())).toString());
    assertEquals("PositionalParameterConversions([])",
        (new PositionalParameterConversions(new ArrayList<Type>())).toString());
  }
}

