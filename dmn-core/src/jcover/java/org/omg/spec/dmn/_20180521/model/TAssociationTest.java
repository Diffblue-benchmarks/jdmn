package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.TAssociation
 *
 * @author Diffblue JCover
 */

public class TAssociationTest {

    @Test(timeout=10000)
    public void getAssociationDirectionReturnsNONE() {
        assertThat(new TAssociation().getAssociationDirection(), is(TAssociationDirection.NONE));
    }

    @Test(timeout=10000)
    public void getSourceRefReturnsNull() {
        assertThat(new TAssociation().getSourceRef(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTargetRefReturnsNull() {
        assertThat(new TAssociation().getTargetRef(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setAssociationDirectionToNONE() {
        new TAssociation().setAssociationDirection(TAssociationDirection.NONE);
    }

    @Test(timeout=10000)
    public void setSourceRef() {
        TAssociation obj = new TAssociation();
        TDMNElementReference value = new TDMNElementReference();
        obj.setSourceRef(value);
        assertThat(obj.getSourceRef(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setTargetRef() {
        TAssociation obj = new TAssociation();
        TDMNElementReference value = new TDMNElementReference();
        obj.setTargetRef(value);
        assertThat(obj.getTargetRef(), sameInstance(value));
    }
}
