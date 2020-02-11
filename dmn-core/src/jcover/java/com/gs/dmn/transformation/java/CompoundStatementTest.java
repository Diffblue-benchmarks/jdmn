package com.gs.dmn.transformation.java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.transformation.java.CompoundStatement
 *
 * @author Diffblue JCover
 */

public class CompoundStatementTest {

    @Test(timeout=10000)
    public void add() {
        CompoundStatement compoundStatement = new CompoundStatement();
        Statement statement = mock(Statement.class);
        compoundStatement.add(statement);
        assertThat(compoundStatement.getStatements().size(), is(1));
        assertThat(compoundStatement.getStatements().get(0), sameInstance(statement));
    }

    @Test(timeout=10000)
    public void getStatementsReturnsEmpty() {
        CompoundStatement compoundStatement = new CompoundStatement();
        List<Statement> result = compoundStatement.getStatements();
        assertTrue(result.isEmpty());
        assertThat(compoundStatement.getStatements(), sameInstance(result));
    }
}
