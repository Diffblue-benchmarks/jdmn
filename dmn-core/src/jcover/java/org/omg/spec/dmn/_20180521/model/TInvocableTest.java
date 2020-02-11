package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TInvocable
 *
 * @author Diffblue JCover
 */

public class TInvocableTest {

    @Test(timeout=10000)
    public void getVariableReturnsNull() {
        assertThat(new TInvocable().getVariable(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setVariable() {
        TInvocable obj = new TInvocable();
        TInformationItem value = new TInformationItem();
        obj.setVariable(value);
        assertThat(obj.getVariable(), sameInstance(value));
    }
}
