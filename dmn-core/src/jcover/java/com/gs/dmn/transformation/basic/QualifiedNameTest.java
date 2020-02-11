package com.gs.dmn.transformation.basic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import javax.xml.namespace.QName;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.transformation.basic.QualifiedName
 *
 * @author Diffblue JCover
 */

public class QualifiedNameTest {

    @Test(timeout=10000)
    public void toQualifiedName1() {
        QualifiedName result = QualifiedName.toQualifiedName(new QName("545321456"));
        assertThat(result.getLocalPart(), is("545321456"));
        assertThat(result.getNamespace(), is(""));
    }

    @Test(timeout=10000)
    public void toQualifiedName2() {
        assertThat(QualifiedName.toQualifiedName((String)null), is(nullValue()));
        assertThat(QualifiedName.toQualifiedName((QName)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void toQualifiedNameQNameIsBar() {
        QualifiedName result = QualifiedName.toQualifiedName("bar");
        assertThat(result.getLocalPart(), is("bar"));
        assertThat(result.getNamespace(), is(nullValue()));
    }
}
