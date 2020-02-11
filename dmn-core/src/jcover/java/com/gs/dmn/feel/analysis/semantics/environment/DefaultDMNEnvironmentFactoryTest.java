package com.gs.dmn.feel.analysis.semantics.environment;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.semantics.environment.DefaultDMNEnvironmentFactory
 *
 * @author Diffblue JCover
 */

public class DefaultDMNEnvironmentFactoryTest {

    @Test(timeout=10000)
    public void instance() {
        EnvironmentFactory result = DefaultDMNEnvironmentFactory.instance();
        assertThat(result.getRootEnvironment().getInputExpression(), is(nullValue()));
        assertThat(result.getRootEnvironment().getInputExpressionType(), is(nullValue()));
        assertThat(result.getRootEnvironment().getParent(), is(nullValue()));
    }
}
