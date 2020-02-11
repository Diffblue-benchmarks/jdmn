package com.gs.dmn.feel.lib.type.list;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;

import org.junit.Test;
import org.slf4j.Logger;

/**
 * Unit tests for com.gs.dmn.feel.lib.type.list.DefaultListType
 *
 * @author Diffblue JCover
 */

public class DefaultListTypeTest {

    @Test(timeout=10000)
    public void listEqualList1IsEmptyAndList2IsEmptyReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultListType(logger).listEqual(new ArrayList(), new ArrayList()), is(true));
    }

    @Test(timeout=10000)
    public void listEqualList1IsEmptyAndList2IsNullReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultListType(logger).listEqual(new ArrayList(), null), is(false));
    }

    @Test(timeout=10000)
    public void listEqualList1IsNullAndList2IsEmptyReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultListType(logger).listEqual(null, new ArrayList()), is(false));
    }

    @Test(timeout=10000)
    public void listEqualList1IsNullAndList2IsNullReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultListType(logger).listEqual(null, null), is(true));
    }

    @Test(timeout=10000)
    public void listNotEqualList1IsEmptyAndList2IsEmptyReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultListType(logger).listNotEqual(new ArrayList(), new ArrayList()), is(false));
    }
}
