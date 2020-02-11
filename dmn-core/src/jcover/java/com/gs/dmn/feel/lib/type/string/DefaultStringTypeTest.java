package com.gs.dmn.feel.lib.type.string;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.slf4j.Logger;

/**
 * Unit tests for com.gs.dmn.feel.lib.type.string.DefaultStringType
 *
 * @author Diffblue JCover
 */

public class DefaultStringTypeTest {

    @Test(timeout=10000)
    public void stringAddFirstIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringAdd(null, "gif"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void stringAddReturnsAnnagif() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringAdd("Anna", "gif"), is("Annagif"));
    }

    @Test(timeout=10000)
    public void stringAddSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringAdd("Anna", null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void stringEqualFirstIsAnnaAndSecondIsGif() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringEqual("Anna", "gif"), is(false));
    }

    @Test(timeout=10000)
    public void stringEqualFirstIsAnnaAndSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringEqual("Anna", null), is(false));
    }

    @Test(timeout=10000)
    public void stringEqualFirstIsBarAndSecondIsBarReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringEqual("bar", "bar"), is(true));
    }

    @Test(timeout=10000)
    public void stringEqualFirstIsNullAndSecondIsGif() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringEqual(null, "gif"), is(false));
    }

    @Test(timeout=10000)
    public void stringEqualFirstIsNullAndSecondIsNullReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringEqual(null, null), is(true));
    }

    @Test(timeout=10000)
    public void stringGreaterEqualThanFirstIsNullAndSecondIsGifReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringGreaterEqualThan(null, "gif"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void stringGreaterEqualThanFirstIsNullAndSecondIsNullReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringGreaterEqualThan(null, null), is(true));
    }

    @Test(timeout=10000)
    public void stringGreaterEqualThanSecondIsEmptyReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringGreaterEqualThan("Anna", ""), is(true));
    }

    @Test(timeout=10000)
    public void stringGreaterEqualThanSecondIsGifReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringGreaterEqualThan("Anna", "gif"), is(false));
    }

    @Test(timeout=10000)
    public void stringGreaterEqualThanSecondIsNullReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringGreaterEqualThan("Anna", null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void stringGreaterThanFirstIsNullAndSecondIsGif() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringGreaterThan(null, "gif"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void stringGreaterThanFirstIsNullAndSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringGreaterThan(null, null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void stringGreaterThanSecondIsEmptyReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringGreaterThan("Anna", ""), is(true));
    }

    @Test(timeout=10000)
    public void stringGreaterThanSecondIsGifReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringGreaterThan("Anna", "gif"), is(false));
    }

    @Test(timeout=10000)
    public void stringGreaterThanSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringGreaterThan("Anna", null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void stringLessEqualThanFirstIsNullAndSecondIsGifReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringLessEqualThan(null, "gif"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void stringLessEqualThanFirstIsNullAndSecondIsNullReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringLessEqualThan(null, null), is(true));
    }

    @Test(timeout=10000)
    public void stringLessEqualThanSecondIsEmptyReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringLessEqualThan("Anna", ""), is(false));
    }

    @Test(timeout=10000)
    public void stringLessEqualThanSecondIsGifReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringLessEqualThan("Anna", "gif"), is(true));
    }

    @Test(timeout=10000)
    public void stringLessEqualThanSecondIsNullReturnsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringLessEqualThan("Anna", null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void stringLessThanFirstIsNullAndSecondIsGif() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringLessThan(null, "gif"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void stringLessThanFirstIsNullAndSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringLessThan(null, null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void stringLessThanSecondIsEmptyReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringLessThan("Anna", ""), is(false));
    }

    @Test(timeout=10000)
    public void stringLessThanSecondIsGifReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringLessThan("Anna", "gif"), is(true));
    }

    @Test(timeout=10000)
    public void stringLessThanSecondIsNull() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringLessThan("Anna", null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void stringNotEqualFirstIsAnnaAndSecondIsGifReturnsTrue() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringNotEqual("Anna", "gif"), is(true));
    }

    @Test(timeout=10000)
    public void stringNotEqualFirstIsBarAndSecondIsBarReturnsFalse() {
        Logger logger = mock(Logger.class);
        assertThat(new DefaultStringType(logger).stringNotEqual("bar", "bar"), is(false));
    }
}
