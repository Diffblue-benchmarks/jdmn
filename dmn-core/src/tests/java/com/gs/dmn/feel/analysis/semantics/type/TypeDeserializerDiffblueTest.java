package com.gs.dmn.feel.analysis.semantics.type;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.semantics.type.TypeDeserializer
 *
 * @author Diffblue JCover
 */

public class TypeDeserializerDiffblueTest {

    @Test(timeout=10000)
    public void isValid() {
        assertThat(new TypeDeserializer().deserialize("enumeration").isValid(), is(true));
        assertThat(TypeDeserializer.instance().deserialize("enumeration").isValid(), is(true));
    }
}
