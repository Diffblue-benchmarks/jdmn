package com.gs.dmn.runtime.interpreter.environment;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.interpreter.environment.RuntimeEnvironmentFactory
 *
 * @author Diffblue JCover
 */

public class RuntimeEnvironmentFactoryTest {

    @Test(timeout=10000)
    public void instance() {
        // pojo RuntimeEnvironmentFactory
    }

    @Test(timeout=10000)
    public void makeEnvironment() {
        assertThat((Environment<String, Object>)new RuntimeEnvironmentFactory().makeEnvironment().getParent(), is(nullValue()));
    }
}
