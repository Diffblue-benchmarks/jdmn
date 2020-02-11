package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TExpression
 *
 * @author Diffblue JCover
 */

public class TExpressionTest {

    @Test(timeout=10000)
    public void getTypeRefReturnsNull() {
        assertThat(new TExpression().getTypeRef(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setTypeRefToGif() {
        TExpression obj = new TExpression();
        obj.setTypeRef("gif");
        assertThat(obj.getTypeRef(), is("gif"));
    }
}
