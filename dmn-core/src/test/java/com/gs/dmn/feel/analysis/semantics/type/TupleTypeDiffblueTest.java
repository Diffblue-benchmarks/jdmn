package com.gs.dmn.feel.analysis.semantics.type;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class TupleTypeDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("TupleType()", (new TupleType(new ArrayList<Type>())).toString());
    assertEquals("TupleType()", (new TupleType(new ArrayList<Type>())).toString());
    assertEquals("TupleType()", (new TupleType(new ArrayList<Type>())).toString());
  }
}

