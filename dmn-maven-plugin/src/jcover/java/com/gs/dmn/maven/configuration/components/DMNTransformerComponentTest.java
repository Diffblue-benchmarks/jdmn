package com.gs.dmn.maven.configuration.components;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.maven.configuration.components.DMNTransformerComponent
 *
 * @author Diffblue JCover
 */

public class DMNTransformerComponentTest {

    @Test(timeout=10000)
    public void getElementNameReturnsDmnTransformer() {
        assertThat(new DMNTransformerComponent().getElementName(), is("dmnTransformer"));
    }
}
