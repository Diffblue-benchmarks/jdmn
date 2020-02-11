package com.gs.dmn.runtime.listener;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.gs.dmn.runtime.annotation.DRGElementKind;
import com.gs.dmn.runtime.annotation.ExpressionKind;
import com.gs.dmn.runtime.annotation.HitPolicy;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.listener.DRGElement
 *
 * @author Diffblue JCover
 */

public class DRGElementTest {

    @Test(timeout=10000)
    public void getElementKindReturnsDECISION() {
        assertThat(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1).getElementKind(), is(DRGElementKind.DECISION));
    }

    @Test(timeout=10000)
    public void getExpressionKindReturnsFUNCTION_DEFINITION() {
        assertThat(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1).getExpressionKind(), is(ExpressionKind.FUNCTION_DEFINITION));
    }

    @Test(timeout=10000)
    public void getHitPolicyReturnsUNIQUE() {
        assertThat(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1).getHitPolicy(), is(HitPolicy.UNIQUE));
    }

    @Test(timeout=10000)
    public void getLabelReturnsFoo() {
        assertThat(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1).getLabel(), is("foo"));
    }

    @Test(timeout=10000)
    public void getName() {
        assertThat(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1).getName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void getNamespaceReturnsFoo() {
        assertThat(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1).getNamespace(), is("foo"));
    }

    @Test(timeout=10000)
    public void getRulesCount() {
        assertThat(new DRGElement("foo", "bar", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 1).getRulesCount(), is(1));
        assertThat(new DRGElement("foo", "/bin/bash", "foo", DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 0).getRulesCount(), is(0));
    }
}
