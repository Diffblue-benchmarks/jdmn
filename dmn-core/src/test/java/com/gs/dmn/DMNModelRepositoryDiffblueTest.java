package com.gs.dmn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.runtime.Pair;
import com.gs.dmn.serialization.PrefixNamespaceMappings;
import com.gs.dmn.transformation.basic.QualifiedName;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TBusinessKnowledgeModel;
import org.omg.spec.dmn._20180521.model.TDMNElement;
import org.omg.spec.dmn._20180521.model.TDMNElementReference;
import org.omg.spec.dmn._20180521.model.TDRGElement;
import org.omg.spec.dmn._20180521.model.TDecision;
import org.omg.spec.dmn._20180521.model.TDecisionService;
import org.omg.spec.dmn._20180521.model.TDecisionTable;
import org.omg.spec.dmn._20180521.model.TDefinitions;
import org.omg.spec.dmn._20180521.model.THitPolicy;
import org.omg.spec.dmn._20180521.model.TInformationItem;
import org.omg.spec.dmn._20180521.model.TInformationRequirement;
import org.omg.spec.dmn._20180521.model.TInputData;
import org.omg.spec.dmn._20180521.model.TItemDefinition;
import org.omg.spec.dmn._20180521.model.TNamedElement;
import org.omg.spec.dmn._20180521.model.TOutputClause;

public class DMNModelRepositoryDiffblueTest {
  @Test
  public void testAllInputDatas() {
    // Arrange, Act and Assert
    assertEquals(0, (new DMNModelRepository()).allInputDatas(null).size());
  }

  @Test
  public void testAllInputDatas2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.allInputDatas(new TDRGElement()).size());
  }

  @Test
  public void testAllInvocables() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.allInvocables(new TDRGElement()).size());
  }

  @Test
  public void testAllInvocables2() {
    // Arrange
    TDefinitions left = new TDefinitions();
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new Pair<TDefinitions, PrefixNamespaceMappings>(left, new PrefixNamespaceMappings()));

    // Act and Assert
    assertEquals(0, dmnModelRepository.allInvocables(new TDRGElement()).size());
  }

  @Test
  public void testAllSubDecisions() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.allSubDecisions(new TDRGElement()).size());
  }

  @Test
  public void testAtLeastTwoRules() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertFalse(dmnModelRepository.atLeastTwoRules(new TDecisionTable()));
  }

  @Test
  public void testBusinessKnowledgeModels() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.businessKnowledgeModels(new TDefinitions()).size());
  }

  @Test
  public void testBusinessKnowledgeModels2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act
    List<TBusinessKnowledgeModel> actualBusinessKnowledgeModelsResult = dmnModelRepository.businessKnowledgeModels();

    // Assert
    assertSame(dmnModelRepository.businessKnowledgeModels, actualBusinessKnowledgeModelsResult);
    assertEquals(0, actualBusinessKnowledgeModelsResult.size());
    assertSame(actualBusinessKnowledgeModelsResult, dmnModelRepository.businessKnowledgeModels);
  }

  @Test
  public void testComputeCachedElements() {
    // Arrange, Act and Assert
    assertEquals(0, (new DMNModelRepository()).computeCachedElements(true).size());
  }

  @Test
  public void testComputeCachedElements2() {
    // Arrange, Act and Assert
    assertEquals(0, (new DMNModelRepository()).computeCachedElements(false).size());
  }

  @Test
  public void testDecisionServices() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.decisionServices(new TDefinitions()).size());
  }

  @Test
  public void testDecisionServices2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act
    List<TDecisionService> actualDecisionServicesResult = dmnModelRepository.decisionServices();

    // Assert
    assertSame(dmnModelRepository.decisionServices, actualDecisionServicesResult);
    assertEquals(0, actualDecisionServicesResult.size());
    assertSame(actualDecisionServicesResult, dmnModelRepository.decisionServices);
  }

  @Test
  public void testDecisions() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act
    List<TDecision> actualDecisionsResult = dmnModelRepository.decisions();

    // Assert
    assertSame(dmnModelRepository.decisions, actualDecisionsResult);
    assertEquals(0, actualDecisionsResult.size());
    assertSame(actualDecisionsResult, dmnModelRepository.decisions);
  }

  @Test
  public void testDecisions2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.decisions(new TDefinitions()).size());
  }

  @Test
  public void testDirectDRGElements() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.directDRGElements(new TDRGElement()).size());
  }

  @Test
  public void testDirectInputDatas() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TDRGElement parent = new TDRGElement();
    ArrayList<TInformationRequirement> tInformationRequirementList = new ArrayList<TInformationRequirement>();
    tInformationRequirementList.add(new TInformationRequirement());

    // Act and Assert
    assertEquals(0, dmnModelRepository.directInputDatas(parent, tInformationRequirementList).size());
  }

  @Test
  public void testDirectInputDatas2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.directInputDatas(new TDRGElement()).size());
  }

  @Test
  public void testDirectSubDecisions() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.directSubDecisions(new TDRGElement()).size());
  }

  @Test
  public void testDirectSubDecisions2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.directSubDecisions(new TDecisionService()).size());
  }

  @Test
  public void testDirectSubDecisions3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.directSubDecisions(new TDecision()).size());
  }

  @Test
  public void testDirectSubInvocables() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.directSubInvocables(new TDRGElement()).size());
  }

  @Test
  public void testDirectSubInvocables2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.directSubInvocables(new TBusinessKnowledgeModel()).size());
  }

  @Test
  public void testDirectSubInvocables3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.directSubInvocables(new TDecision()).size());
  }

  @Test
  public void testDisplayName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TNamedElement tNamedElement = new TNamedElement();
    tNamedElement.setName("value");

    // Act and Assert
    assertEquals("value", dmnModelRepository.displayName(tNamedElement));
  }

  @Test
  public void testDisplayName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TNamedElement tNamedElement = new TNamedElement();
    tNamedElement.setLabel("value");

    // Act and Assert
    assertEquals("value", dmnModelRepository.displayName(tNamedElement));
  }

  @Test
  public void testDrgElements() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act
    List<TDRGElement> actualDrgElementsResult = dmnModelRepository.drgElements();

    // Assert
    assertSame(dmnModelRepository.drgElements, actualDrgElementsResult);
    assertEquals(0, actualDrgElementsResult.size());
    assertSame(actualDrgElementsResult, dmnModelRepository.drgElements);
  }

  @Test
  public void testDrgElements2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.drgElements(new TDefinitions()).size());
  }

  @Test
  public void testExpression() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertNull(dmnModelRepository.expression(new TInformationItem()));
  }

  @Test
  public void testExtractId() {
    // Arrange
    String actualExtractIdResult = DMNModelRepository.extractId("#");

    // Act and Assert
    assertEquals("", actualExtractIdResult);
    assertEquals("http://", DMNModelRepository.extractId("http://"));
  }

  @Test
  public void testExtractNamespace() {
    // Arrange, Act and Assert
    assertNull((new DMNModelRepository()).extractNamespace("#"));
  }

  @Test
  public void testFindChildDefinitions() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertNull(dmnModelRepository.findChildDefinitions(new TDRGElement(), "#"));
  }

  @Test
  public void testGetImportedNames() {
    // Arrange, Act and Assert
    assertEquals(0, (new DMNModelRepository()).getImportedNames().size());
  }

  @Test
  public void testHasAggregator() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertFalse(dmnModelRepository.hasAggregator(new TDecisionTable()));
  }

  @Test
  public void testHasDefaultValue() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertFalse(dmnModelRepository.hasDefaultValue(new TDecisionTable()));
  }

  @Test
  public void testHasNamespace() {
    // Arrange, Act and Assert
    assertFalse(DMNModelRepository.hasNamespace("#"));
  }

  @Test
  public void testImportName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TDMNElementReference tdmnElementReference = new TDMNElementReference();
    tdmnElementReference.setHref("value");

    // Act and Assert
    assertNull(dmnModelRepository.importName(tdmnElementReference));
  }

  @Test
  public void testImportName2() {
    // Arrange, Act and Assert
    assertNull((new DMNModelRepository()).importName(null));
  }

  @Test
  public void testImportNameForId() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TDMNElementReference tdmnElementReference = new TDMNElementReference();
    tdmnElementReference.setHref("value");

    // Act and Assert
    assertNull(dmnModelRepository.importNameForId(tdmnElementReference, "123"));
  }

  @Test
  public void testImportNameForId2() {
    // Arrange, Act and Assert
    assertNull((new DMNModelRepository()).importNameForId(null, "123"));
  }

  @Test
  public void testImportNameForId3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TDMNElementReference tdmnElementReference = new TDMNElementReference();
    tdmnElementReference.setHref("value");

    // Act and Assert
    assertNull(dmnModelRepository.importNameForId(tdmnElementReference, ""));
  }

  @Test
  public void testInputDatas() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.inputDatas(new TDefinitions()).size());
  }

  @Test
  public void testInputDatas2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act
    List<TInputData> actualInputDatasResult = dmnModelRepository.inputDatas();

    // Assert
    assertSame(dmnModelRepository.inputDatas, actualInputDatasResult);
    assertEquals(0, actualInputDatasResult.size());
    assertSame(actualInputDatasResult, dmnModelRepository.inputDatas);
  }

  @Test
  public void testIsContextExpression() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertFalse(dmnModelRepository.isContextExpression(new TDecision()));
  }

  @Test
  public void testIsDecisionTableExpression() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertFalse(dmnModelRepository.isDecisionTableExpression(new TDecision()));
  }

  @Test
  public void testIsEmpty() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isEmpty(null));
  }

  @Test
  public void testIsEmpty2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    ArrayList<TItemDefinition> tItemDefinitionList = new ArrayList<TItemDefinition>();
    tItemDefinitionList.add(new TItemDefinition());

    // Act and Assert
    assertFalse(dmnModelRepository.isEmpty(tItemDefinitionList));
  }

  @Test
  public void testIsFirstSingleHit() {
    // Arrange, Act and Assert
    assertFalse((new DMNModelRepository()).isFirstSingleHit(THitPolicy.UNIQUE));
  }

  @Test
  public void testIsFirstSingleHit2() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isFirstSingleHit(THitPolicy.FIRST));
  }

  @Test
  public void testIsFreeTextLiteralExpression() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertFalse(dmnModelRepository.isFreeTextLiteralExpression(new TDecision()));
  }

  @Test
  public void testIsInvocationExpression() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertFalse(dmnModelRepository.isInvocationExpression(new TDecision()));
  }

  @Test
  public void testIsLiteralExpression() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertFalse(dmnModelRepository.isLiteralExpression(new TDecisionService()));
  }

  @Test
  public void testIsLiteralExpression2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertFalse(dmnModelRepository.isLiteralExpression(new TBusinessKnowledgeModel()));
  }

  @Test
  public void testIsLiteralExpression3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertFalse(dmnModelRepository.isLiteralExpression(new TDecision()));
  }

  @Test
  public void testIsMultipleHit() {
    // Arrange, Act and Assert
    assertFalse((new DMNModelRepository()).isMultipleHit(THitPolicy.UNIQUE));
  }

  @Test
  public void testIsMultipleHit2() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isMultipleHit(THitPolicy.OUTPUT_ORDER));
  }

  @Test
  public void testIsMultipleHit3() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isMultipleHit(THitPolicy.COLLECT));
  }

  @Test
  public void testIsOutputOrderHit() {
    // Arrange, Act and Assert
    assertFalse((new DMNModelRepository()).isOutputOrderHit(THitPolicy.UNIQUE));
  }

  @Test
  public void testIsOutputOrderHit2() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isOutputOrderHit(THitPolicy.PRIORITY));
  }

  @Test
  public void testIsOutputOrderHit3() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isOutputOrderHit(THitPolicy.OUTPUT_ORDER));
  }

  @Test
  public void testIsQuotedName() {
    // Arrange, Act and Assert
    assertFalse((new DMNModelRepository()).isQuotedName("#"));
  }

  @Test
  public void testIsSingleHit() {
    // Arrange, Act and Assert
    assertFalse((new DMNModelRepository()).isSingleHit(THitPolicy.COLLECT));
  }

  @Test
  public void testIsSingleHit2() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isSingleHit(THitPolicy.UNIQUE));
  }

  @Test
  public void testIsSingleHit3() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isSingleHit(THitPolicy.PRIORITY));
  }

  @Test
  public void testIsSingleHit4() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isSingleHit(THitPolicy.ANY));
  }

  @Test
  public void testItemDefinitions() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TDefinitions tDefinitions = new TDefinitions();

    // Act
    List<TItemDefinition> actualItemDefinitionsResult = dmnModelRepository.itemDefinitions(tDefinitions);

    // Assert
    assertEquals(0, actualItemDefinitionsResult.size());
    assertSame(actualItemDefinitionsResult, tDefinitions.getItemDefinition());
  }

  @Test
  public void testItemDefinitions2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act
    List<TItemDefinition> actualItemDefinitionsResult = dmnModelRepository.itemDefinitions();

    // Assert
    assertSame(dmnModelRepository.itemDefinitions, actualItemDefinitionsResult);
    assertEquals(0, actualItemDefinitionsResult.size());
    assertSame(actualItemDefinitionsResult, dmnModelRepository.itemDefinitions);
  }

  @Test
  public void testLabel() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals("", dmnModelRepository.label(new TDMNElement()));
  }

  @Test
  public void testLookupItemDefinition() {
    // Arrange
    QualifiedName typeRef = new QualifiedName("name");

    // Act and Assert
    assertNull((new DMNModelRepository()).lookupItemDefinition(typeRef));
  }

  @Test
  public void testLookupItemDefinition2() {
    // Arrange, Act and Assert
    assertNull((new DMNModelRepository()).lookupItemDefinition((QualifiedName) null));
  }

  @Test
  public void testLookupItemDefinition3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    ArrayList<TItemDefinition> tItemDefinitionList = new ArrayList<TItemDefinition>();
    tItemDefinitionList.add(new TItemDefinition());

    // Act and Assert
    assertNull(dmnModelRepository.lookupItemDefinition(tItemDefinitionList, new QualifiedName("name")));
  }

  @Test
  public void testLookupItemDefinition4() {
    // Arrange, Act and Assert
    assertNull((new DMNModelRepository()).lookupItemDefinition("#"));
  }

  @Test
  public void testLookupItemDefinition5() {
    // Arrange, Act and Assert
    assertNull((new DMNModelRepository()).lookupItemDefinition((String) null));
  }

  @Test
  public void testLookupItemDefinition6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    ArrayList<TItemDefinition> tItemDefinitionList = new ArrayList<TItemDefinition>();
    tItemDefinitionList.add(new TItemDefinition());

    // Act and Assert
    assertNull(dmnModelRepository.lookupItemDefinition(tItemDefinitionList, "#"));
  }

  @Test
  public void testMakeRef() {
    // Arrange
    String actualMakeRefResult = DMNModelRepository.makeRef("#", "#");

    // Act and Assert
    assertEquals("##", actualMakeRefResult);
    assertEquals("#", DMNModelRepository.makeRef("", "#"));
  }

  @Test
  public void testName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertNull(dmnModelRepository.name(new TNamedElement()));
  }

  @Test
  public void testNext() {
    // Arrange, Act and Assert
    assertNull((new DMNModelRepository()).next(null));
  }

  @Test
  public void testNext2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertNull(dmnModelRepository.next(new TItemDefinition()));
  }

  @Test
  public void testNext3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setTypeRef("value");

    // Act and Assert
    assertNull(dmnModelRepository.next(tItemDefinition));
  }

  @Test
  public void testNormalize() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TItemDefinition tItemDefinition = new TItemDefinition();

    // Act and Assert
    assertSame(tItemDefinition, dmnModelRepository.normalize(tItemDefinition));
  }

  @Test
  public void testOutputClauseName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TDRGElement element = new TDRGElement();
    TOutputClause tOutputClause = new TOutputClause();
    tOutputClause.setName("value");

    // Act and Assert
    assertEquals("value", dmnModelRepository.outputClauseName(element, tOutputClause));
  }

  @Test
  public void testRemoveSingleQuotes() {
    // Arrange, Act and Assert
    assertEquals("#", (new DMNModelRepository()).removeSingleQuotes("#"));
  }

  @Test
  public void testRulesCount() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(-1, dmnModelRepository.rulesCount(new TDecision()));
  }

  @Test
  public void testSameId() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TDMNElement tdmnElement = new TDMNElement();
    tdmnElement.setId("value");

    // Act and Assert
    assertFalse(dmnModelRepository.sameId(tdmnElement, "#"));
  }

  @Test
  public void testSameName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TNamedElement tNamedElement = new TNamedElement();
    tNamedElement.setName("value");

    // Act and Assert
    assertFalse(dmnModelRepository.sameName(tNamedElement, "#"));
  }

  @Test
  public void testSortItemComponent() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.sortItemComponent(new TItemDefinition()).size());
  }

  @Test
  public void testSortItemComponent2() {
    // Arrange, Act and Assert
    assertEquals(0, (new DMNModelRepository()).sortItemComponent(null).size());
  }

  @Test
  public void testTopologicalSort() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.topologicalSort(new TDecision()).size());
  }

  @Test
  public void testTopologicalSortWithMarkers() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.topologicalSortWithMarkers(new TDecision()).size());
  }

  @Test
  public void testTopologicalSortWithMarkers2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TDecision tDecision = new TDecision();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act
    dmnModelRepository.topologicalSortWithMarkers(tDecision, objectList);

    // Assert
    assertSame(tDecision, ((StartMarker) objectList.get(1)).getDecision());
  }

  @Test
  public void testTypeRef() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertNull(dmnModelRepository.typeRef(new TInformationItem()));
  }

  @Test
  public void testVariable() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertNull(dmnModelRepository.variable(new TNamedElement()));
  }
}

