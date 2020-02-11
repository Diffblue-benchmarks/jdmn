package com.gs.dmn.serialization;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.serialization.XMLUtil
 *
 * @author Diffblue JCover
 */

public class XMLUtilTest {

    @Test(timeout=10000)
    public void makeDocumentBuilderFactory() throws javax.xml.parsers.ParserConfigurationException {
        DocumentBuilderFactory result = XMLUtil.makeDocumentBuilderFactory();
        assertThat(result.getSchema(), is(nullValue()));
        assertThat(result.isCoalescing(), is(false));
        assertThat(result.isExpandEntityReferences(), is(false));
        assertThat(result.isIgnoringComments(), is(false));
        assertThat(result.isIgnoringElementContentWhitespace(), is(false));
        assertThat(result.isNamespaceAware(), is(false));
        assertThat(result.isValidating(), is(false));
        assertThat(result.isXIncludeAware(), is(false));
    }
}
