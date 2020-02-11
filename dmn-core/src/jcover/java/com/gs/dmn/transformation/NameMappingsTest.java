package com.gs.dmn.transformation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.transformation.NameMappings
 *
 * @author Diffblue JCover
 */

public class NameMappingsTest {

    @Test(timeout=10000)
    public void getReturnsNull() {
        assertThat(new NameMappings().get("/bin/bash"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void keysReturnsEmpty() {
        assertTrue(new NameMappings().keys().isEmpty());
    }

    @Test(timeout=10000)
    public void put() {
        new NameMappings().put("/bin/bash", "/bin/bash");
    }

    @Test(timeout=10000)
    public void valuesReturnsEmpty() {
        assertTrue(new NameMappings().values().isEmpty());
    }
}
