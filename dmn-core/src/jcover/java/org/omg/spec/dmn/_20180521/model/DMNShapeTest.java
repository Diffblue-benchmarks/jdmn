package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import javax.xml.namespace.QName;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.DMNShape
 *
 * @author Diffblue JCover
 */

public class DMNShapeTest {

    @Test(timeout=10000)
    public void getDMNDecisionServiceDividerLineReturnsNull() {
        assertThat(new DMNShape().getDMNDecisionServiceDividerLine(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDmnElementRefReturnsNull() {
        assertThat(new DMNShape().getDmnElementRef(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDMNLabelReturnsNull() {
        assertThat(new DMNShape().getDMNLabel(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isIsCollapsedReturnsFalse() {
        assertThat(new DMNShape().isIsCollapsed(), is(false));
    }

    @Test(timeout=10000)
    public void isIsListedInputDataReturnsNull() {
        assertThat(new DMNShape().isIsListedInputData(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setDMNDecisionServiceDividerLine() {
        DMNShape obj = new DMNShape();
        DMNDecisionServiceDividerLine value = new DMNDecisionServiceDividerLine();
        obj.setDMNDecisionServiceDividerLine(value);
        assertThat(obj.getDMNDecisionServiceDividerLine(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setDmnElementRef() {
        DMNShape obj = new DMNShape();
        QName value = new QName("545321456");
        obj.setDmnElementRef(value);
        assertThat(obj.getDmnElementRef(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setDMNLabel() {
        DMNShape obj = new DMNShape();
        DMNLabel value = new DMNLabel();
        obj.setDMNLabel(value);
        assertThat(obj.getDMNLabel(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setIsCollapsedToFalse() {
        new DMNShape().setIsCollapsed(false);
    }

    @Test(timeout=10000)
    public void setIsListedInputDataToFalse() {
        DMNShape obj = new DMNShape();
        obj.setIsListedInputData(false);
        assertThat(obj.isIsListedInputData(), is(false));
    }
}
