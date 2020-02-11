package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TInputClause
 *
 * @author Diffblue JCover
 */

public class TInputClauseTest {

    @Test(timeout=10000)
    public void getInputExpressionReturnsNull() {
        assertThat(new TInputClause().getInputExpression(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getInputValuesReturnsNull() {
        assertThat(new TInputClause().getInputValues(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setInputExpression() {
        TInputClause obj = new TInputClause();
        TLiteralExpression value = new TLiteralExpression();
        obj.setInputExpression(value);
        assertThat(obj.getInputExpression(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setInputValues() {
        TInputClause obj = new TInputClause();
        TUnaryTests value = new TUnaryTests();
        obj.setInputValues(value);
        assertThat(obj.getInputValues(), sameInstance(value));
    }
}
