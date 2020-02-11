package org.omg.spec.dmn._20180521.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import javax.xml.bind.JAXBElement;

import org.junit.Test;

/**
 * Unit tests for org.omg.spec.dmn._20180521.model.ObjectFactory
 *
 * @author Diffblue JCover
 */

public class ObjectFactoryTest {

    @Test(timeout=10000)
    public void createArtifact() {
        TArtifact value = new TArtifact();
        JAXBElement<TArtifact> result = new ObjectFactory().createArtifact(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TArtifact.class));
        assertThat(result.getName().getLocalPart(), is("artifact"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createAssociation() {
        TAssociation value = new TAssociation();
        JAXBElement<TAssociation> result = new ObjectFactory().createAssociation(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TAssociation.class));
        assertThat(result.getName().getLocalPart(), is("association"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createAuthorityRequirement() {
        TAuthorityRequirement value = new TAuthorityRequirement();
        JAXBElement<TAuthorityRequirement> result = new ObjectFactory().createAuthorityRequirement(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TAuthorityRequirement.class));
        assertThat(result.getName().getLocalPart(), is("authorityRequirement"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createBounds1() {
        Bounds result = new ObjectFactory().createBounds();
        assertEquals(0.0, result.getHeight(), 0);
        assertEquals(0.0, result.getWidth(), 0);
        assertEquals(0.0, result.getX(), 0);
        assertEquals(0.0, result.getY(), 0);
    }

    @Test(timeout=10000)
    public void createBounds2() {
        Bounds value = new Bounds();
        JAXBElement<Bounds> result = new ObjectFactory().createBounds(value);
        assertThat(result.getDeclaredType(), equalTo((Class)Bounds.class));
        assertThat(result.getName().getLocalPart(), is("Bounds"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/DC/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createBusinessContextElement() {
        TBusinessContextElement value = new TBusinessContextElement();
        JAXBElement<TBusinessContextElement> result = new ObjectFactory().createBusinessContextElement(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TBusinessContextElement.class));
        assertThat(result.getName().getLocalPart(), is("businessContextElement"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createBusinessKnowledgeModel() {
        TBusinessKnowledgeModel value = new TBusinessKnowledgeModel();
        JAXBElement<TBusinessKnowledgeModel> result = new ObjectFactory().createBusinessKnowledgeModel(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TBusinessKnowledgeModel.class));
        assertThat(result.getName().getLocalPart(), is("businessKnowledgeModel"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createColor1() {
        Color result = new ObjectFactory().createColor();
        assertThat(result.getBlue(), is(0));
        assertThat(result.getGreen(), is(0));
        assertThat(result.getRed(), is(0));
    }

    @Test(timeout=10000)
    public void createColor2() {
        Color value = new Color();
        JAXBElement<Color> result = new ObjectFactory().createColor(value);
        assertThat(result.getDeclaredType(), equalTo((Class)Color.class));
        assertThat(result.getName().getLocalPart(), is("Color"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/DC/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createContext() {
        TContext value = new TContext();
        JAXBElement<TContext> result = new ObjectFactory().createContext(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TContext.class));
        assertThat(result.getName().getLocalPart(), is("context"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createContextEntry() {
        TContextEntry value = new TContextEntry();
        JAXBElement<TContextEntry> result = new ObjectFactory().createContextEntry(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TContextEntry.class));
        assertThat(result.getName().getLocalPart(), is("contextEntry"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createDecision() {
        TDecision value = new TDecision();
        JAXBElement<TDecision> result = new ObjectFactory().createDecision(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TDecision.class));
        assertThat(result.getName().getLocalPart(), is("decision"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createDecisionService() {
        TDecisionService value = new TDecisionService();
        JAXBElement<TDecisionService> result = new ObjectFactory().createDecisionService(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TDecisionService.class));
        assertThat(result.getName().getLocalPart(), is("decisionService"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createDecisionTable() {
        TDecisionTable value = new TDecisionTable();
        JAXBElement<TDecisionTable> result = new ObjectFactory().createDecisionTable(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TDecisionTable.class));
        assertThat(result.getName().getLocalPart(), is("decisionTable"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createDefinitions() {
        TDefinitions value = new TDefinitions();
        JAXBElement<TDefinitions> result = new ObjectFactory().createDefinitions(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TDefinitions.class));
        assertThat(result.getName().getLocalPart(), is("definitions"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createDimension1() {
        Dimension result = new ObjectFactory().createDimension();
        assertEquals(0.0, result.getHeight(), 0);
        assertEquals(0.0, result.getWidth(), 0);
    }

    @Test(timeout=10000)
    public void createDimension2() {
        Dimension value = new Dimension();
        JAXBElement<Dimension> result = new ObjectFactory().createDimension(value);
        assertThat(result.getDeclaredType(), equalTo((Class)Dimension.class));
        assertThat(result.getName().getLocalPart(), is("Dimension"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/DC/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createDMNDecisionServiceDividerLine1() {
        DMNDecisionServiceDividerLine result = new ObjectFactory().createDMNDecisionServiceDividerLine();
        assertTrue(result.getWaypoint().isEmpty());
        assertThat(result.getExtension(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
        assertThat(result.getSharedStyle(), is(nullValue()));
        assertThat(result.getStyle(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void createDMNDecisionServiceDividerLine2() {
        DMNDecisionServiceDividerLine value = new DMNDecisionServiceDividerLine();
        JAXBElement<DMNDecisionServiceDividerLine> result = new ObjectFactory().createDMNDecisionServiceDividerLine(value);
        assertThat(result.getDeclaredType(), equalTo((Class)DMNDecisionServiceDividerLine.class));
        assertThat(result.getName().getLocalPart(), is("DMNDecisionServiceDividerLine"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/DMNDI/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createDMNDI1() {
        DMNDI result = new ObjectFactory().createDMNDI();
        assertTrue(result.getDMNDiagram().isEmpty());
        assertTrue(result.getDMNStyle().isEmpty());
    }

    @Test(timeout=10000)
    public void createDMNDI2() {
        DMNDI value = new DMNDI();
        JAXBElement<DMNDI> result = new ObjectFactory().createDMNDI(value);
        assertThat(result.getDeclaredType(), equalTo((Class)DMNDI.class));
        assertThat(result.getName().getLocalPart(), is("DMNDI"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/DMNDI/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createDMNDiagram1() {
        DMNDiagram result = new ObjectFactory().createDMNDiagram();
        assertTrue(result.getDMNDiagramElement().isEmpty());
        assertThat(result.getSize(), is(nullValue()));
        assertThat(result.getDocumentation(), is(nullValue()));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getResolution(), is(nullValue()));
        assertThat(result.getExtension(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
        assertThat(result.getSharedStyle(), is(nullValue()));
        assertThat(result.getStyle(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void createDMNDiagram2() {
        DMNDiagram value = new DMNDiagram();
        JAXBElement<DMNDiagram> result = new ObjectFactory().createDMNDiagram(value);
        assertThat(result.getDeclaredType(), equalTo((Class)DMNDiagram.class));
        assertThat(result.getName().getLocalPart(), is("DMNDiagram"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/DMNDI/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createDMNDiagramElement() {
        DiagramElement value = mock(DiagramElement.class);
        JAXBElement<DiagramElement> result = new ObjectFactory().createDMNDiagramElement(value);
        assertThat(result.getDeclaredType(), equalTo((Class)DiagramElement.class));
        assertThat(result.getName().getLocalPart(), is("DMNDiagramElement"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/DMNDI/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(true));
    }

    @Test(timeout=10000)
    public void createDMNEdge1() {
        DMNEdge result = new ObjectFactory().createDMNEdge();
        assertThat(result.getDMNLabel(), is(nullValue()));
        assertThat(result.getDmnElementRef(), is(nullValue()));
        assertTrue(result.getWaypoint().isEmpty());
        assertThat(result.getExtension(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
        assertThat(result.getSharedStyle(), is(nullValue()));
        assertThat(result.getStyle(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void createDMNEdge2() {
        DMNEdge value = new DMNEdge();
        JAXBElement<DMNEdge> result = new ObjectFactory().createDMNEdge(value);
        assertThat(result.getDeclaredType(), equalTo((Class)DMNEdge.class));
        assertThat(result.getName().getLocalPart(), is("DMNEdge"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/DMNDI/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createDMNElement() {
        TDMNElement value = new TDMNElement();
        JAXBElement<TDMNElement> result = new ObjectFactory().createDMNElement(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TDMNElement.class));
        assertThat(result.getName().getLocalPart(), is("DMNElement"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createDMNLabel1() {
        DMNLabel result = new ObjectFactory().createDMNLabel();
        assertThat(result.getText(), is(nullValue()));
        assertThat(result.getBounds(), is(nullValue()));
        assertThat(result.getExtension(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
        assertThat(result.getSharedStyle(), is(nullValue()));
        assertThat(result.getStyle(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void createDMNLabel2() {
        DMNLabel value = new DMNLabel();
        JAXBElement<DMNLabel> result = new ObjectFactory().createDMNLabel(value);
        assertThat(result.getDeclaredType(), equalTo((Class)DMNLabel.class));
        assertThat(result.getName().getLocalPart(), is("DMNLabel"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/DMNDI/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createDMNShape1() {
        DMNShape result = new ObjectFactory().createDMNShape();
        assertThat(result.getDMNDecisionServiceDividerLine(), is(nullValue()));
        assertThat(result.getDMNLabel(), is(nullValue()));
        assertThat(result.getDmnElementRef(), is(nullValue()));
        assertThat(result.isIsCollapsed(), is(false));
        assertThat(result.isIsListedInputData(), is(nullValue()));
        assertThat(result.getBounds(), is(nullValue()));
        assertThat(result.getExtension(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
        assertThat(result.getSharedStyle(), is(nullValue()));
        assertThat(result.getStyle(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void createDMNShape2() {
        DMNShape value = new DMNShape();
        JAXBElement<DMNShape> result = new ObjectFactory().createDMNShape(value);
        assertThat(result.getDeclaredType(), equalTo((Class)DMNShape.class));
        assertThat(result.getName().getLocalPart(), is("DMNShape"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/DMNDI/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createDMNStyle1() {
        DMNStyle result = new ObjectFactory().createDMNStyle();
        assertThat(result.getFillColor(), is(nullValue()));
        assertThat(result.getFontColor(), is(nullValue()));
        assertThat(result.getFontFamily(), is(nullValue()));
        assertThat(result.getFontSize(), is(nullValue()));
        assertThat(result.getLabelHorizontalAlignement(), is(nullValue()));
        assertThat(result.getLabelVerticalAlignment(), is(nullValue()));
        assertThat(result.getStrokeColor(), is(nullValue()));
        assertThat(result.isFontBold(), is(nullValue()));
        assertThat(result.isFontItalic(), is(nullValue()));
        assertThat(result.isFontStrikeThrough(), is(nullValue()));
        assertThat(result.isFontUnderline(), is(nullValue()));
        assertThat(result.getExtension(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createDMNStyle2() {
        DMNStyle value = new DMNStyle();
        JAXBElement<DMNStyle> result = new ObjectFactory().createDMNStyle(value);
        assertThat(result.getDeclaredType(), equalTo((Class)DMNStyle.class));
        assertThat(result.getName().getLocalPart(), is("DMNStyle"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/DMNDI/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createDrgElement() {
        TDRGElement value = new TDRGElement();
        JAXBElement<TDRGElement> result = new ObjectFactory().createDrgElement(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TDRGElement.class));
        assertThat(result.getName().getLocalPart(), is("drgElement"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createElementCollection() {
        TElementCollection value = new TElementCollection();
        JAXBElement<TElementCollection> result = new ObjectFactory().createElementCollection(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TElementCollection.class));
        assertThat(result.getName().getLocalPart(), is("elementCollection"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createExpression() {
        TExpression value = new TExpression();
        JAXBElement<TExpression> result = new ObjectFactory().createExpression(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TExpression.class));
        assertThat(result.getName().getLocalPart(), is("expression"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createFunctionDefinition() {
        TFunctionDefinition value = new TFunctionDefinition();
        JAXBElement<TFunctionDefinition> result = new ObjectFactory().createFunctionDefinition(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TFunctionDefinition.class));
        assertThat(result.getName().getLocalPart(), is("functionDefinition"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createImport() {
        TImport value = new TImport();
        JAXBElement<TImport> result = new ObjectFactory().createImport(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TImport.class));
        assertThat(result.getName().getLocalPart(), is("import"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createInformationItem() {
        TInformationItem value = new TInformationItem();
        JAXBElement<TInformationItem> result = new ObjectFactory().createInformationItem(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TInformationItem.class));
        assertThat(result.getName().getLocalPart(), is("informationItem"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createInformationRequirement() {
        TInformationRequirement value = new TInformationRequirement();
        JAXBElement<TInformationRequirement> result = new ObjectFactory().createInformationRequirement(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TInformationRequirement.class));
        assertThat(result.getName().getLocalPart(), is("informationRequirement"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createInputData() {
        TInputData value = new TInputData();
        JAXBElement<TInputData> result = new ObjectFactory().createInputData(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TInputData.class));
        assertThat(result.getName().getLocalPart(), is("inputData"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createInvocable() {
        TInvocable value = new TInvocable();
        JAXBElement<TInvocable> result = new ObjectFactory().createInvocable(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TInvocable.class));
        assertThat(result.getName().getLocalPart(), is("invocable"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createInvocation() {
        TInvocation value = new TInvocation();
        JAXBElement<TInvocation> result = new ObjectFactory().createInvocation(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TInvocation.class));
        assertThat(result.getName().getLocalPart(), is("invocation"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createItemDefinition() {
        TItemDefinition value = new TItemDefinition();
        JAXBElement<TItemDefinition> result = new ObjectFactory().createItemDefinition(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TItemDefinition.class));
        assertThat(result.getName().getLocalPart(), is("itemDefinition"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createKnowledgeRequirement() {
        TKnowledgeRequirement value = new TKnowledgeRequirement();
        JAXBElement<TKnowledgeRequirement> result = new ObjectFactory().createKnowledgeRequirement(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TKnowledgeRequirement.class));
        assertThat(result.getName().getLocalPart(), is("knowledgeRequirement"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createKnowledgeSource() {
        TKnowledgeSource value = new TKnowledgeSource();
        JAXBElement<TKnowledgeSource> result = new ObjectFactory().createKnowledgeSource(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TKnowledgeSource.class));
        assertThat(result.getName().getLocalPart(), is("knowledgeSource"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createList() {
        TList value = new TList();
        JAXBElement<TList> result = new ObjectFactory().createList(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TList.class));
        assertThat(result.getName().getLocalPart(), is("list"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createLiteralExpression() {
        TLiteralExpression value = new TLiteralExpression();
        JAXBElement<TLiteralExpression> result = new ObjectFactory().createLiteralExpression(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TLiteralExpression.class));
        assertThat(result.getName().getLocalPart(), is("literalExpression"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createNamedElement() {
        TNamedElement value = new TNamedElement();
        JAXBElement<TNamedElement> result = new ObjectFactory().createNamedElement(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TNamedElement.class));
        assertThat(result.getName().getLocalPart(), is("namedElement"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createOrganizationUnit() {
        TOrganizationUnit value = new TOrganizationUnit();
        JAXBElement<TOrganizationUnit> result = new ObjectFactory().createOrganizationUnit(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TOrganizationUnit.class));
        assertThat(result.getName().getLocalPart(), is("organizationUnit"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createPerformanceIndicator() {
        TPerformanceIndicator value = new TPerformanceIndicator();
        JAXBElement<TPerformanceIndicator> result = new ObjectFactory().createPerformanceIndicator(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TPerformanceIndicator.class));
        assertThat(result.getName().getLocalPart(), is("performanceIndicator"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createPoint1() {
        Point result = new ObjectFactory().createPoint();
        assertEquals(0.0, result.getX(), 0);
        assertEquals(0.0, result.getY(), 0);
    }

    @Test(timeout=10000)
    public void createPoint2() {
        Point value = new Point();
        JAXBElement<Point> result = new ObjectFactory().createPoint(value);
        assertThat(result.getDeclaredType(), equalTo((Class)Point.class));
        assertThat(result.getName().getLocalPart(), is("Point"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/DC/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createRelation() {
        TRelation value = new TRelation();
        JAXBElement<TRelation> result = new ObjectFactory().createRelation(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TRelation.class));
        assertThat(result.getName().getLocalPart(), is("relation"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createStyle() {
        Style value = mock(Style.class);
        JAXBElement<Style> result = new ObjectFactory().createStyle(value);
        assertThat(result.getDeclaredType(), equalTo((Class)Style.class));
        assertThat(result.getName().getLocalPart(), is("Style"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/DI/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(true));
    }

    @Test(timeout=10000)
    public void createTArtifact() {
        TArtifact result = new ObjectFactory().createTArtifact();
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTAssociation() {
        TAssociation result = new ObjectFactory().createTAssociation();
        assertThat(result.getAssociationDirection(), is(TAssociationDirection.NONE));
        assertThat(result.getSourceRef(), is(nullValue()));
        assertThat(result.getTargetRef(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTAuthorityRequirement() {
        TAuthorityRequirement result = new ObjectFactory().createTAuthorityRequirement();
        assertThat(result.getRequiredAuthority(), is(nullValue()));
        assertThat(result.getRequiredDecision(), is(nullValue()));
        assertThat(result.getRequiredInput(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTBinding() {
        TBinding result = new ObjectFactory().createTBinding();
        assertThat(result.getExpression(), is(nullValue()));
        assertThat(result.getParameter(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void createTBusinessContextElement() {
        TBusinessContextElement result = new ObjectFactory().createTBusinessContextElement();
        assertThat(result.getURI(), is(nullValue()));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTBusinessKnowledgeModel() {
        TBusinessKnowledgeModel result = new ObjectFactory().createTBusinessKnowledgeModel();
        assertTrue(result.getAuthorityRequirement().isEmpty());
        assertThat(result.getEncapsulatedLogic(), is(nullValue()));
        assertTrue(result.getKnowledgeRequirement().isEmpty());
        assertThat(result.getVariable(), is(nullValue()));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTContext() {
        TContext result = new ObjectFactory().createTContext();
        assertTrue(result.getContextEntry().isEmpty());
        assertThat(result.getTypeRef(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTContextEntry() {
        TContextEntry result = new ObjectFactory().createTContextEntry();
        assertThat(result.getExpression(), is(nullValue()));
        assertThat(result.getVariable(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTDecision() {
        TDecision result = new ObjectFactory().createTDecision();
        assertThat(result.getAllowedAnswers(), is(nullValue()));
        assertTrue(result.getAuthorityRequirement().isEmpty());
        assertTrue(result.getDecisionMaker().isEmpty());
        assertTrue(result.getDecisionOwner().isEmpty());
        assertThat(result.getExpression(), is(nullValue()));
        assertTrue(result.getImpactedPerformanceIndicator().isEmpty());
        assertTrue(result.getInformationRequirement().isEmpty());
        assertTrue(result.getKnowledgeRequirement().isEmpty());
        assertThat(result.getQuestion(), is(nullValue()));
        assertTrue(result.getSupportedObjective().isEmpty());
        assertTrue(result.getUsingProcess().isEmpty());
        assertTrue(result.getUsingTask().isEmpty());
        assertThat(result.getVariable(), is(nullValue()));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTDecisionRule() {
        TDecisionRule result = new ObjectFactory().createTDecisionRule();
        assertTrue(result.getAnnotationEntry().isEmpty());
        assertTrue(result.getInputEntry().isEmpty());
        assertTrue(result.getOutputEntry().isEmpty());
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTDecisionRuleAnnotationEntry() {
        assertThat(new ObjectFactory().createTDecisionRuleAnnotationEntry().getText(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void createTDecisionService() {
        TDecisionService result = new ObjectFactory().createTDecisionService();
        assertTrue(result.getEncapsulatedDecision().isEmpty());
        assertTrue(result.getInputData().isEmpty());
        assertTrue(result.getInputDecision().isEmpty());
        assertTrue(result.getOutputDecision().isEmpty());
        assertThat(result.getVariable(), is(nullValue()));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTDecisionTable() {
        TDecisionTable result = new ObjectFactory().createTDecisionTable();
        assertThat(result.getAggregation(), is(nullValue()));
        assertThat(result.getHitPolicy(), is(THitPolicy.UNIQUE));
        assertTrue(result.getInput().isEmpty());
        assertTrue(result.getOutput().isEmpty());
        assertThat(result.getOutputLabel(), is(nullValue()));
        assertThat(result.getPreferredOrientation(), is(TDecisionTableOrientation.RULE_AS_ROW));
        assertTrue(result.getRule().isEmpty());
        assertThat(result.getTypeRef(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTDefinitions() {
        TDefinitions result = new ObjectFactory().createTDefinitions();
        assertTrue(result.getArtifact().isEmpty());
        assertTrue(result.getBusinessContextElement().isEmpty());
        assertThat(result.getDMNDI(), is(nullValue()));
        assertTrue(result.getDrgElement().isEmpty());
        assertTrue(result.getElementCollection().isEmpty());
        assertThat(result.getExporter(), is(nullValue()));
        assertThat(result.getExporterVersion(), is(nullValue()));
        assertThat(result.getExpressionLanguage(), is("http://www.omg.org/spec/FEEL/20140401"));
        assertTrue(result.getImport().isEmpty());
        assertTrue(result.getItemDefinition().isEmpty());
        assertThat(result.getNamespace(), is(nullValue()));
        assertThat(result.getTypeLanguage(), is("http://www.omg.org/spec/FEEL/20140401"));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTDMNElement() {
        TDMNElement result = new ObjectFactory().createTDMNElement();
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTDMNElementReference() {
        assertThat(new ObjectFactory().createTDMNElementReference().getHref(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void createTDRGElement() {
        TDRGElement result = new ObjectFactory().createTDRGElement();
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTElementCollection() {
        TElementCollection result = new ObjectFactory().createTElementCollection();
        assertTrue(result.getDrgElement().isEmpty());
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTExpression() {
        TExpression result = new ObjectFactory().createTExpression();
        assertThat(result.getTypeRef(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTextAnnotation() {
        TTextAnnotation value = new TTextAnnotation();
        JAXBElement<TTextAnnotation> result = new ObjectFactory().createTextAnnotation(value);
        assertThat(result.getDeclaredType(), equalTo((Class)TTextAnnotation.class));
        assertThat(result.getName().getLocalPart(), is("textAnnotation"));
        assertThat(result.getName().getNamespaceURI(), is("http://www.omg.org/spec/DMN/20180521/MODEL/"));
        assertThat(result.getName().getPrefix(), is(""));
        assertThat((Class<JAXBElement.GlobalScope>)result.getScope(), equalTo((Class)JAXBElement.GlobalScope.class));
        assertThat(result.getValue(), sameInstance(value));
        assertThat(result.isGlobalScope(), is(true));
        assertThat(result.isNil(), is(false));
        assertThat(result.isTypeSubstituted(), is(false));
    }

    @Test(timeout=10000)
    public void createTFunctionDefinition() {
        TFunctionDefinition result = new ObjectFactory().createTFunctionDefinition();
        assertThat(result.getExpression(), is(nullValue()));
        assertTrue(result.getFormalParameter().isEmpty());
        assertThat(result.getKind(), is(TFunctionKind.FEEL));
        assertThat(result.getTypeRef(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTImport() {
        TImport result = new ObjectFactory().createTImport();
        assertThat(result.getImportType(), is(nullValue()));
        assertThat(result.getLocationURI(), is(nullValue()));
        assertThat(result.getNamespace(), is(nullValue()));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTImportedValues() {
        TImportedValues result = new ObjectFactory().createTImportedValues();
        assertThat(result.getExpressionLanguage(), is(nullValue()));
        assertThat(result.getImportedElement(), is(nullValue()));
        assertThat(result.getImportType(), is(nullValue()));
        assertThat(result.getLocationURI(), is(nullValue()));
        assertThat(result.getNamespace(), is(nullValue()));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTInformationItem() {
        TInformationItem result = new ObjectFactory().createTInformationItem();
        assertThat(result.getTypeRef(), is(nullValue()));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTInformationRequirement() {
        TInformationRequirement result = new ObjectFactory().createTInformationRequirement();
        assertThat(result.getRequiredDecision(), is(nullValue()));
        assertThat(result.getRequiredInput(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTInputClause() {
        TInputClause result = new ObjectFactory().createTInputClause();
        assertThat(result.getInputExpression(), is(nullValue()));
        assertThat(result.getInputValues(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTInputData() {
        TInputData result = new ObjectFactory().createTInputData();
        assertThat(result.getVariable(), is(nullValue()));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTInvocable() {
        TInvocable result = new ObjectFactory().createTInvocable();
        assertThat(result.getVariable(), is(nullValue()));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTInvocation() {
        TInvocation result = new ObjectFactory().createTInvocation();
        assertTrue(result.getBinding().isEmpty());
        assertThat(result.getExpression(), is(nullValue()));
        assertThat(result.getTypeRef(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTItemDefinition() {
        TItemDefinition result = new ObjectFactory().createTItemDefinition();
        assertThat(result.getAllowedValues(), is(nullValue()));
        assertTrue(result.getItemComponent().isEmpty());
        assertThat(result.getTypeLanguage(), is(nullValue()));
        assertThat(result.getTypeRef(), is(nullValue()));
        assertThat(result.isIsCollection(), is(false));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTKnowledgeRequirement() {
        TKnowledgeRequirement result = new ObjectFactory().createTKnowledgeRequirement();
        assertThat(result.getRequiredKnowledge(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTKnowledgeSource() {
        TKnowledgeSource result = new ObjectFactory().createTKnowledgeSource();
        assertTrue(result.getAuthorityRequirement().isEmpty());
        assertThat(result.getLocationURI(), is(nullValue()));
        assertThat(result.getOwner(), is(nullValue()));
        assertThat(result.getType(), is(nullValue()));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTList() {
        TList result = new ObjectFactory().createTList();
        assertTrue(result.getExpression().isEmpty());
        assertThat(result.getTypeRef(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTLiteralExpression() {
        TLiteralExpression result = new ObjectFactory().createTLiteralExpression();
        assertThat(result.getExpressionLanguage(), is(nullValue()));
        assertThat(result.getImportedValues(), is(nullValue()));
        assertThat(result.getText(), is(nullValue()));
        assertThat(result.getTypeRef(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTNamedElement() {
        TNamedElement result = new ObjectFactory().createTNamedElement();
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTOrganizationUnit() {
        TOrganizationUnit result = new ObjectFactory().createTOrganizationUnit();
        assertTrue(result.getDecisionMade().isEmpty());
        assertTrue(result.getDecisionOwned().isEmpty());
        assertThat(result.getURI(), is(nullValue()));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTOutputClause() {
        TOutputClause result = new ObjectFactory().createTOutputClause();
        assertThat(result.getDefaultOutputEntry(), is(nullValue()));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getOutputValues(), is(nullValue()));
        assertThat(result.getTypeRef(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTPerformanceIndicator() {
        TPerformanceIndicator result = new ObjectFactory().createTPerformanceIndicator();
        assertTrue(result.getImpactingDecision().isEmpty());
        assertThat(result.getURI(), is(nullValue()));
        assertThat(result.getName(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTRelation() {
        TRelation result = new ObjectFactory().createTRelation();
        assertTrue(result.getColumn().isEmpty());
        assertTrue(result.getRow().isEmpty());
        assertThat(result.getTypeRef(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTTextAnnotation() {
        TTextAnnotation result = new ObjectFactory().createTTextAnnotation();
        assertThat(result.getText(), is(nullValue()));
        assertThat(result.getTextFormat(), is("text/plain"));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void createTUnaryTests() {
        TUnaryTests result = new ObjectFactory().createTUnaryTests();
        assertThat(result.getExpressionLanguage(), is(nullValue()));
        assertThat(result.getText(), is(nullValue()));
        assertThat(result.getDescription(), is(nullValue()));
        assertThat(result.getExtensionElements(), is(nullValue()));
        assertThat(result.getId(), is(nullValue()));
        assertThat(result.getLabel(), is(nullValue()));
        assertThat(result.getOtherAttributes().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void getAny() {
        assertTrue(new ObjectFactory().createDiagramElementExtension().getAny().isEmpty());
        assertTrue(new ObjectFactory().createStyleExtension().getAny().isEmpty());
        assertTrue(new ObjectFactory().createTDMNElementExtensionElements().getAny().isEmpty());
    }
}
