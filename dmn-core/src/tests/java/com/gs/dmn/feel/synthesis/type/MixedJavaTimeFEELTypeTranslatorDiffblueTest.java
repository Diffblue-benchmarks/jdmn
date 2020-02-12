package com.gs.dmn.feel.synthesis.type;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.synthesis.type.MixedJavaTimeFEELTypeTranslator
 *
 * @author Diffblue JCover
 */

public class MixedJavaTimeFEELTypeTranslatorDiffblueTest {

    @Test(timeout=10000)
    public void toJavaTypeFeelTypeIsGifReturnsNull() {
        assertThat(new MixedJavaTimeFEELTypeTranslator().toJavaType("gif"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void toQualifiedJavaTypeFeelTypeIsGifReturnsNull() {
        assertThat(new MixedJavaTimeFEELTypeTranslator().toQualifiedJavaType("gif"), is(nullValue()));
    }
}
