package org.omg.spec.dmn._20151101.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20151101.model.TInputData
 *
 * @author Diffblue JCover
 */

public class TInputDataTest {

    @Test(timeout=10000)
    public void getVariableReturnsNull() {
        assertThat(new TInputData().getVariable(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setVariable() {
        TInputData obj = new TInputData();
        TInformationItem value = new TInformationItem();
        obj.setVariable(value);
        assertThat(obj.getVariable(), sameInstance(value));
    }
}
