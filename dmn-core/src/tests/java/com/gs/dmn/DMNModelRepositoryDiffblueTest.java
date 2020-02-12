package com.gs.dmn;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import com.gs.dmn.runtime.Pair;
import com.gs.dmn.serialization.PrefixNamespaceMappings;
import com.gs.dmn.transformation.basic.QualifiedName;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDMNElement;
import org.omg.spec.dmn._20180521.model.TDRGElement;
import org.omg.spec.dmn._20180521.model.TDecision;
import org.omg.spec.dmn._20180521.model.TDecisionTable;
import org.omg.spec.dmn._20180521.model.TDefinitions;
import org.omg.spec.dmn._20180521.model.THitPolicy;
import org.omg.spec.dmn._20180521.model.TInformationRequirement;
import org.omg.spec.dmn._20180521.model.TItemDefinition;
import org.omg.spec.dmn._20180521.model.TNamedElement;

/**
 * Unit tests for com.gs.dmn.DMNModelRepository
 *
 * @author Diffblue JCover
 */

public class DMNModelRepositoryDiffblueTest {

    @Test(timeout=10000)
    public void addElementMap() {
        new DMNModelRepository().addElementMap(new TDRGElement(), new TDefinitions());
    }

    @Test(timeout=10000)
    public void allInputDatas() {
        assertTrue(new DMNModelRepository().allInputDatas(new TDRGElement()).isEmpty());
        assertTrue(new DMNModelRepository().allInputDatas(null).isEmpty());
    }

    @Test(timeout=10000)
    public void allInvocablesReturnsEmpty() {
        assertTrue(new DMNModelRepository().allInvocables(new TDRGElement()).isEmpty());
    }

    @Test(timeout=10000)
    public void allSubDecisionsReturnsEmpty() {
        assertTrue(new DMNModelRepository().allSubDecisions(new TDRGElement()).isEmpty());
    }

    @Test(timeout=10000)
    public void atLeastTwoRules() {
        assertThat(new DMNModelRepository().atLeastTwoRules(new TDecisionTable()), is(false));
        assertThat(new DMNModelRepository((TDefinitions)null).atLeastTwoRules(new TDecisionTable()), is(false));
        assertThat(new DMNModelRepository(new TDefinitions(), null, new PrefixNamespaceMappings()).atLeastTwoRules(new TDecisionTable()), is(false));
    }

    @Test(timeout=10000)
    public void businessKnowledgeModels() {
        assertTrue(new DMNModelRepository().businessKnowledgeModels().isEmpty());
        assertTrue(new DMNModelRepository().businessKnowledgeModels(new TDefinitions()).isEmpty());
    }

    @Test(timeout=10000)
    public void collectInputsTdrgElementsIsEmpty() {
        new DMNModelRepository().collectInputs(new TDecision(), new HashSet<TDRGElement>());
    }

    @Test(timeout=10000)
    public void computeCachedElements() {
        assertTrue(new DMNModelRepository().computeCachedElements(false).isEmpty());
        assertTrue(new DMNModelRepository().computeCachedElements(true).isEmpty());
    }

    @Test(timeout=10000)
    public void constructor() {
        TDefinitions rootDefinitions = new TDefinitions();
        List<TDefinitions> importedDefinitions = new ArrayList<TDefinitions>();
        TDefinitions obj1 = new TDefinitions();
        ((ArrayList<TDefinitions>)importedDefinitions).add(obj1);
        PrefixNamespaceMappings prefixNamespaceMappings = new PrefixNamespaceMappings();
        DMNModelRepository obj2 = new DMNModelRepository(rootDefinitions, importedDefinitions, prefixNamespaceMappings);
        assertThat(obj2.getAllDefinitions().size(), is(1));
        assertThat(obj2.getAllDefinitions().get(0), sameInstance(obj1));
        assertTrue(obj2.getImportedNames().isEmpty());
        assertThat(obj2.getPrefixNamespaceMappings(), sameInstance(prefixNamespaceMappings));
        assertThat(obj2.getRootDefinitions(), sameInstance(rootDefinitions));
    }

    @Test(timeout=10000)
    public void decisionServices() {
        assertTrue(new DMNModelRepository().decisionServices().isEmpty());
        assertTrue(new DMNModelRepository().decisionServices(new TDefinitions()).isEmpty());
    }

    @Test(timeout=10000)
    public void decisionsReturnsEmpty() {
        assertTrue(new DMNModelRepository().decisions().isEmpty());
    }

    @Test(timeout=10000)
    public void directDRGElementsReturnsEmpty() {
        assertTrue(new DMNModelRepository().directDRGElements(new TDRGElement()).isEmpty());
    }

    @Test(timeout=10000)
    public void directInputDatas() {
        List<TInformationRequirement> informationRequirement = new ArrayList<TInformationRequirement>();
        ((ArrayList<TInformationRequirement>)informationRequirement).add(new TInformationRequirement());
        assertTrue(new DMNModelRepository().directInputDatas(new TDRGElement(), informationRequirement).isEmpty());
    }

    @Test(timeout=10000)
    public void directInputDatasInformationRequirementIsEmpty() {
        assertTrue(new DMNModelRepository().directInputDatas(new TDRGElement(), new ArrayList<TInformationRequirement>()).isEmpty());
    }

    @Test(timeout=10000)
    public void drgElementsReturnsEmpty() {
        assertTrue(new DMNModelRepository().drgElements().isEmpty());
    }

    @Test(timeout=10000)
    public void extractId() {
        assertThat(DMNModelRepository.extractId("http://"), is("http://"));
        assertThat(DMNModelRepository.extractId("foo"), is("foo"));
        assertThat(DMNModelRepository.extractId("#"), is(""));
    }

    @Test(timeout=10000)
    public void extractNamespaceHrefIsFooReturnsNull() {
        assertThat(new DMNModelRepository().extractNamespace("foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void findChildDefinitionsHrefIsFooReturnsNull() {
        assertThat(new DMNModelRepository().findChildDefinitions(new TDRGElement(), "foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getImportedNamesReturnsEmpty() {
        assertTrue(new DMNModelRepository().getImportedNames().isEmpty());
    }

    @Test(timeout=10000)
    public void getPrefixNamespaceMappings() {
        PrefixNamespaceMappings prefixNamespaceMappings = new PrefixNamespaceMappings();
        assertThat(new DMNModelRepository(new TDefinitions(), prefixNamespaceMappings).getPrefixNamespaceMappings(), sameInstance(prefixNamespaceMappings));
    }

    @Test(timeout=10000)
    public void getRootDefinitions() {
        DMNModelRepository obj1 = new DMNModelRepository();
        TDefinitions result = obj1.getRootDefinitions();
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
        assertThat(obj1.getAllDefinitions().size(), is(1));
        assertThat(obj1.getAllDefinitions().get(0), sameInstance(result));
        assertThat(obj1.getRootDefinitions(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void hasAggregatorReturnsFalse() {
        assertThat(new DMNModelRepository().hasAggregator(new TDecisionTable()), is(false));
    }

    @Test(timeout=10000)
    public void hasDefaultValueReturnsFalse() {
        assertThat(new DMNModelRepository().hasDefaultValue(new TDecisionTable()), is(false));
    }

    @Test(timeout=10000)
    public void hasNamespace() {
        assertThat(DMNModelRepository.hasNamespace("foo"), is(false));
        assertThat(DMNModelRepository.hasNamespace("http://"), is(true));
    }

    @Test(timeout=10000)
    public void importNameForIdReferenceIsNullReturnsNull() {
        assertThat(new DMNModelRepository().importNameForId(null, "/bin/bash"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void importNameReferenceIsNullReturnsNull() {
        assertThat(new DMNModelRepository().importName(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void inputDatas() {
        assertTrue(new DMNModelRepository().inputDatas().isEmpty());
        assertTrue(new DMNModelRepository().inputDatas(new TDefinitions()).isEmpty());
    }

    @Test(timeout=10000)
    public void isEmpty() {
        assertThat(new DMNModelRepository().isEmpty(new ArrayList<org.omg.spec.dmn._20180521.model.TItemDefinition>()), is(true));
        assertThat(new DMNModelRepository().isEmpty(null), is(true));
    }

    @Test(timeout=10000)
    public void isEmptyReturnsFalse() {
        List<TItemDefinition> list = new ArrayList<TItemDefinition>();
        ((ArrayList<TItemDefinition>)list).add(new TItemDefinition());
        assertThat(new DMNModelRepository().isEmpty(list), is(false));
    }

    @Test(timeout=10000)
    public void isFirstSingleHit() {
        assertThat(new DMNModelRepository().isFirstSingleHit(THitPolicy.UNIQUE), is(false));
        assertThat(new DMNModelRepository(new Pair<TDefinitions, PrefixNamespaceMappings>(new TDefinitions(), new PrefixNamespaceMappings())).isFirstSingleHit(THitPolicy.UNIQUE), is(false));
        assertThat(new DMNModelRepository(new TDefinitions()).isFirstSingleHit(THitPolicy.UNIQUE), is(false));
        assertThat(new DMNModelRepository().isFirstSingleHit(THitPolicy.FIRST), is(true));
    }

    @Test(timeout=10000)
    public void isMultipleHit() {
        assertThat(new DMNModelRepository().isMultipleHit(THitPolicy.COLLECT), is(true));
        assertThat(new DMNModelRepository().isMultipleHit(THitPolicy.OUTPUT_ORDER), is(true));
        assertThat(new DMNModelRepository().isMultipleHit(THitPolicy.RULE_ORDER), is(true));
        assertThat(new DMNModelRepository().isMultipleHit(THitPolicy.UNIQUE), is(false));
    }

    @Test(timeout=10000)
    public void isOutputOrderHit() {
        assertThat(new DMNModelRepository().isOutputOrderHit(THitPolicy.OUTPUT_ORDER), is(true));
        assertThat(new DMNModelRepository().isOutputOrderHit(THitPolicy.PRIORITY), is(true));
        assertThat(new DMNModelRepository().isOutputOrderHit(THitPolicy.UNIQUE), is(false));
    }

    @Test(timeout=10000)
    public void isQuotedName() {
        assertThat(new DMNModelRepository().isQuotedName("bar"), is(false));
        assertThat(new DMNModelRepository().isQuotedName(null), is(false));
        assertThat(new DMNModelRepository().isQuotedName("'"), is(true));
    }

    @Test(timeout=10000)
    public void isSingleHit() {
        assertThat(new DMNModelRepository().isSingleHit(THitPolicy.ANY), is(true));
        assertThat(new DMNModelRepository().isSingleHit(THitPolicy.COLLECT), is(false));
        assertThat(new DMNModelRepository().isSingleHit(THitPolicy.FIRST), is(true));
        assertThat(new DMNModelRepository().isSingleHit(null), is(true));
        assertThat(new DMNModelRepository().isSingleHit(THitPolicy.PRIORITY), is(true));
        assertThat(new DMNModelRepository().isSingleHit(THitPolicy.UNIQUE), is(true));
    }

    @Test(timeout=10000)
    public void itemDefinitions1() {
        assertTrue(new DMNModelRepository().itemDefinitions().isEmpty());
    }

    @Test(timeout=10000)
    public void itemDefinitions2() {
        TDefinitions definitions2 = new TDefinitions();
        List<TItemDefinition> result = new DMNModelRepository().itemDefinitions(definitions2);
        assertThat(definitions2.getItemDefinition(), sameInstance(result));
        assertTrue(result.isEmpty());
    }

    @Test(timeout=10000)
    public void labelReturnsEmpty() {
        assertThat(new DMNModelRepository().label(new TDMNElement()), is(""));
    }

    @Test(timeout=10000)
    public void lookupItemDefinition1() {
        List<TItemDefinition> itemDefinitionList = new ArrayList<TItemDefinition>();
        ((ArrayList<TItemDefinition>)itemDefinitionList).add(new TItemDefinition());
        assertThat(new DMNModelRepository().lookupItemDefinition(itemDefinitionList, new QualifiedName("/bin/bash")), is(nullValue()));
    }

    @Test(timeout=10000)
    public void lookupItemDefinition2() {
        List<TItemDefinition> itemDefinitionList = new ArrayList<TItemDefinition>();
        ((ArrayList<TItemDefinition>)itemDefinitionList).add(new TItemDefinition());
        assertThat(new DMNModelRepository().lookupItemDefinition(itemDefinitionList, "/bin/bash"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void lookupItemDefinition3() {
        assertThat(new DMNModelRepository().lookupItemDefinition(new QualifiedName("bar")), is(nullValue()));
        assertThat(new DMNModelRepository().lookupItemDefinition("bar"), is(nullValue()));
        assertThat(new DMNModelRepository().lookupItemDefinition((String)null), is(nullValue()));
        assertThat(new DMNModelRepository().lookupItemDefinition((QualifiedName)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void makeRef() {
        assertThat(DMNModelRepository.makeRef("bar", "Felix"), is("barFelix"));
        assertThat(DMNModelRepository.makeRef("", "Felix"), is("Felix"));
    }

    @Test(timeout=10000)
    public void nameReturnsNull() {
        assertThat(new DMNModelRepository().name(new TNamedElement()), is(nullValue()));
    }

    @Test(timeout=10000)
    public void normalize() {
        TItemDefinition itemDefinition = new TItemDefinition();
        assertThat(new DMNModelRepository().normalize(itemDefinition), sameInstance(itemDefinition));
    }

    @Test(timeout=10000)
    public void normalizeDefinitionsIsNull() {
        new DMNModelRepository().normalize((TDefinitions)null);
    }

    @Test(timeout=10000)
    public void normalizeItemDefinitionIsNullReturnsNull() {
        assertThat(new DMNModelRepository().normalize((TItemDefinition)null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void removeSingleQuotesNameIsBarReturnsBar() {
        assertThat(new DMNModelRepository().removeSingleQuotes("bar"), is("bar"));
    }

    @Test(timeout=10000)
    public void sortItemComponent() {
        assertTrue(new DMNModelRepository().sortItemComponent(new TItemDefinition()).isEmpty());
        assertTrue(new DMNModelRepository().sortItemComponent(null).isEmpty());
    }

    @Test(timeout=10000)
    public void topologicalSortDecisionsIsEmpty() {
        TDecision parent = new TDecision();
        List<TDecision> decisions = new ArrayList<TDecision>();
        new DMNModelRepository().topologicalSort(parent, decisions);
        assertThat(decisions.size(), is(1));
        assertThat(decisions.get(0), sameInstance(parent));
    }

    @Test(timeout=10000)
    public void topologicalSortWithMarkersObjectsIsEmpty() {
        TDecision parent = new TDecision();
        List<Object> objects = new ArrayList<Object>();
        new DMNModelRepository().topologicalSortWithMarkers(parent, objects);
        assertThat(objects.size(), is(2));
        assertThat(objects.get(0), instanceOf(StartMarker.class));
        assertThat(((StartMarker)objects.get(0)).getDecision(), sameInstance(parent));
        assertThat(objects.get(1), instanceOf(TDecision.class));
        assertThat(((TDecision)objects.get(1)), sameInstance(parent));
    }

    @Test(timeout=10000)
    public void variableReturnsNull() {
        assertThat(new DMNModelRepository().variable(new TNamedElement()), is(nullValue()));
    }
}
