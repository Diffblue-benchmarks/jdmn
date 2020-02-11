package org.omg.spec.dmn._20151101.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import javax.xml.namespace.QName;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20151101.model.TOutputClause
 *
 * @author Diffblue JCover
 */

public class TOutputClauseTest {

    @Test(timeout=10000)
    public void getDefaultOutputEntryReturnsNull() {
        assertThat(new TOutputClause().getDefaultOutputEntry(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getNameReturnsNull() {
        assertThat(new TOutputClause().getName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getOutputValuesReturnsNull() {
        assertThat(new TOutputClause().getOutputValues(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTypeRefReturnsNull() {
        assertThat(new TOutputClause().getTypeRef(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setDefaultOutputEntry() {
        TOutputClause obj = new TOutputClause();
        TLiteralExpression value = new TLiteralExpression();
        obj.setDefaultOutputEntry(value);
        assertThat(obj.getDefaultOutputEntry(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setName() {
        TOutputClause obj = new TOutputClause();
        obj.setName("/bin/bash");
        assertThat(obj.getName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setOutputValues() {
        TOutputClause obj = new TOutputClause();
        TUnaryTests value = new TUnaryTests();
        obj.setOutputValues(value);
        assertThat(obj.getOutputValues(), sameInstance(value));
    }

    @Test(timeout=10000)
    public void setTypeRef() {
        TOutputClause obj = new TOutputClause();
        QName value = new QName("545321456");
        obj.setTypeRef(value);
        assertThat(obj.getTypeRef(), sameInstance(value));
    }
}
