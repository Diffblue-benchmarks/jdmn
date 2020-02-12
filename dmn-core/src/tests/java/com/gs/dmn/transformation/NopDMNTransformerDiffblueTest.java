package com.gs.dmn.transformation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;

import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.runtime.Pair;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.transformation.NopDMNTransformer
 *
 * @author Diffblue JCover
 */

public class NopDMNTransformerDiffblueTest {

    @Test(timeout=10000)
    public void transform1() {
        DMNModelRepository repository = new DMNModelRepository();
        assertThat(new NopDMNTransformer<Object>().transform(repository), sameInstance(repository));
    }

    @Test(timeout=10000)
    public void transform2() {
        DMNModelRepository repository = new DMNModelRepository();
        Object testCases = new Object();
        Pair<DMNModelRepository, Object> result = new NopDMNTransformer<Object>().transform(repository, testCases);
        assertThat(result.getLeft(), sameInstance(repository));
        assertThat(result.getRight(), sameInstance(testCases));
    }
}
