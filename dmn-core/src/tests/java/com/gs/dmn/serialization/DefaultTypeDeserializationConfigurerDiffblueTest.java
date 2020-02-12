package com.gs.dmn.serialization;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.serialization.DefaultTypeDeserializationConfigurer
 *
 * @author Diffblue JCover
 */

public class DefaultTypeDeserializationConfigurerDiffblueTest {

    @Test(timeout=10000)
    public void deserializeTypeAsQualifiedInterfaceNameIsIntReturnsIntImpl() {
        assertThat(new DefaultTypeDeserializationConfigurer().deserializeTypeAs("int"), is("intImpl"));
    }
}
