package com.gs.dmn.feel.synthesis.type;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.synthesis.type.PureJavaTimeFEELTypeTranslator
 *
 * @author Diffblue JCover
 */

public class PureJavaTimeFEELTypeTranslatorDiffblueTest {

    @Test(timeout=10000)
    public void toJavaTypeFeelTypeIsGifReturnsNull() {
        assertThat(new PureJavaTimeFEELTypeTranslator().toJavaType("gif"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void toQualifiedJavaTypeFeelTypeIsGifReturnsNull() {
        assertThat(new PureJavaTimeFEELTypeTranslator().toQualifiedJavaType("gif"), is(nullValue()));
    }
}
