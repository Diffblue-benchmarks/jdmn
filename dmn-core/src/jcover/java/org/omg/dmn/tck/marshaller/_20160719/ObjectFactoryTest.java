package org.omg.dmn.tck.marshaller._20160719;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import javax.xml.bind.JAXBElement;

import org.junit.Test;

/**
 * Unit tests for org.omg.dmn.tck.marshaller._20160719.ObjectFactory
 *
 * @author Diffblue JCover
 */

public class ObjectFactoryTest {

    @Test(timeout=10000)
    public void createTestCases() {
        TestCases result = new ObjectFactory().createTestCases();
        assertThat(result.getLabels(), is(nullValue()));
        assertThat(result.getModelName(), is(nullValue()));
        assertTrue(result.getTestCase().isEmpty());
    }

    @Test(timeout=10000)
    public void createTestCasesLabels() {
        assertTrue(new ObjectFactory().createTestCasesLabels().getLabel().isEmpty());
    }

    @Test(timeout=10000)
    public void createTestCasesTestCase() {
        TestCases.TestCase result = new ObjectFactory().createTestCasesTestCase();
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertTrue(result.getInputNode().isEmpty());
        assertThat(result.getInvocableName(), is(nullValue()));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
        assertTrue(result.getResultNode().isEmpty());
        assertThat(result.getType(), is(TestCaseType.DECISION));
    }

    @Test(timeout=10000)
    public void createTestCasesTestCaseInputNode() {
        TestCases.TestCase.InputNode result = new ObjectFactory().createTestCasesTestCaseInputNode();
        assertThat(result.getName(), is(nullValue()));
        assertTrue(result.getComponent().isEmpty());
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getList(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
        assertThat(result.getValue(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void createTestCasesTestCaseResultNode() {
        TestCases.TestCase.ResultNode result = new ObjectFactory().createTestCasesTestCaseResultNode();
        assertThat(result.getCast(), is(nullValue()));
        assertThat(result.getComputed(), is(nullValue()));
        assertThat(result.getExpected(), is(nullValue()));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getType(), is(nullValue()));
        assertThat(result.isErrorResult(), is(false));
    }

    @Test(timeout=10000)
    public void createValueType() {
        ValueType result = new ObjectFactory().createValueType();
        assertTrue(result.getComponent().isEmpty());
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getList(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
        assertThat(result.getValue(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void createValueTypeComponent() {
        ValueType.Component result = new ObjectFactory().createValueTypeComponent();
        assertThat(result.getName(), is(nullValue()));
        assertTrue(result.getComponent().isEmpty());
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getList(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
        assertThat(result.getValue(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void createValueTypeList1() {
        assertTrue(new ObjectFactory().createValueTypeList().getItem().isEmpty());
    }

    @Test(timeout=10000)
    public void createValueTypeList2() {
        ValueType.List value = new ValueType.List();
        JAXBElement<ValueType.List> result = new ObjectFactory().createValueTypeList(value);
        assertThat(result.getDeclaredType(), equalTo((Class)ValueType.List.class));
        assertThat(result.getName().getLocalPart(), is("list"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20160719/testcase"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<ValueType>)result.getScope(), equalTo((Class)ValueType.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(false));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createValueTypeValue() {
        Object value = new Object();
        JAXBElement<Object> result = new ObjectFactory().createValueTypeValue(value);
        assertThat(result.getDeclaredType(), equalTo((Class)Object.class));
        assertThat(result.getName().getLocalPart(), is("value"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20160719/testcase"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<ValueType>)result.getScope(), equalTo((Class)ValueType.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(false));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void getAny() {
        assertTrue(new ObjectFactory().createTestCasesTestCaseExtensionElements().getAny().isEmpty());
        assertTrue(new ObjectFactory().createValueTypeExtensionElements().getAny().isEmpty());
    }
}
