package com.gs.dmn.transformation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.transformation.InputParamUtil
 *
 * @author Diffblue JCover
 */

public class InputParamUtilTest {

    @Test(timeout=10000)
    public void getOptionalBooleanParam() {
        assertThat(InputParamUtil.getOptionalBooleanParam(new HashMap<String, String>(), "name"), is(false));
        assertThat(InputParamUtil.getOptionalBooleanParam(null, "name"), is(false));
    }

    @Test(timeout=10000)
    public void getOptionalBooleanParamParamKeyIsBarAndParametersIsFoo() {
        Map<String, String> parameters = new HashMap<String, String>();
        ((HashMap<String, String>)parameters).put("bar", "foo");
        assertThat(InputParamUtil.getOptionalBooleanParam(parameters, "bar"), is(false));
    }

    @Test(timeout=10000)
    public void getOptionalBooleanParamParamKeyIsFooAndParametersIsEmpty() {
        Map<String, String> parameters = new HashMap<String, String>();
        ((HashMap<String, String>)parameters).put("foo", "");
        assertThat(InputParamUtil.getOptionalBooleanParam(parameters, "foo"), is(false));
    }

    @Test(timeout=10000)
    public void getRequiredParamParameterKeyIsFooAndParametersIsBarReturnsBar() {
        Map<String, String> parameters = new HashMap<String, String>();
        ((HashMap<String, String>)parameters).put("foo", "bar");
        assertThat(InputParamUtil.getRequiredParam(parameters, "foo"), is("bar"));
    }
}
