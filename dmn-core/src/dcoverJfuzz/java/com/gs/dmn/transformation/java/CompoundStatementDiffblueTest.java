package com.gs.dmn.transformation.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class CompoundStatementDiffblueTest {
  @Test(timeout=10000)
  public void getStatementsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new CompoundStatement()).getStatements().size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    List<Statement> statements = (new CompoundStatement()).getStatements();
    assertTrue(statements instanceof java.util.ArrayList);
    assertEquals(0, statements.size());
  }
}

