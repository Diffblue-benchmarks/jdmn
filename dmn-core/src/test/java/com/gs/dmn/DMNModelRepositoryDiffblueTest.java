package com.gs.dmn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.runtime.DMNRuntimeException;
import com.gs.dmn.runtime.Pair;
import com.gs.dmn.serialization.PrefixNamespaceMappings;
import com.gs.dmn.transformation.basic.QualifiedName;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.omg.spec.dmn._20180521.model.TBusinessKnowledgeModel;
import org.omg.spec.dmn._20180521.model.TDMNElement;
import org.omg.spec.dmn._20180521.model.TDRGElement;
import org.omg.spec.dmn._20180521.model.TDecision;
import org.omg.spec.dmn._20180521.model.TDecisionService;
import org.omg.spec.dmn._20180521.model.TDecisionTable;
import org.omg.spec.dmn._20180521.model.TDefinitions;
import org.omg.spec.dmn._20180521.model.THitPolicy;
import org.omg.spec.dmn._20180521.model.TInformationRequirement;
import org.omg.spec.dmn._20180521.model.TInputData;
import org.omg.spec.dmn._20180521.model.TItemDefinition;
import org.omg.spec.dmn._20180521.model.TNamedElement;
import org.omg.spec.dmn._20180521.model.TOutputClause;

public class DMNModelRepositoryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void allInputDatasTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.allInputDatas(new TDRGElement()).size());
  }

  @Test
  public void allInvocablesTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.allInvocables(new TDRGElement()).size());
  }

  @Test
  public void allSubDecisionsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.allSubDecisions(new TDRGElement()).size());
  }

  @Test
  public void atLeastTwoRulesTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertFalse(dmnModelRepository.atLeastTwoRules(new TDecisionTable()));
  }

  @Test
  public void businessKnowledgeModelsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.businessKnowledgeModels(new TDefinitions()).size());
  }

  @Test
  public void businessKnowledgeModelsTest2() {
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
  public void computeCachedElementsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DMNModelRepository()).computeCachedElements(true).size());
  }

  @Test
  public void computeCachedElementsTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new DMNModelRepository()).computeCachedElements(false).size());
  }

  @Test
  public void constructorTest() {
    // Arrange
    TDefinitions tDefinitions = new TDefinitions();
    ArrayList<TDefinitions> tDefinitionsList = new ArrayList<TDefinitions>();
    tDefinitionsList.add(new TDefinitions());
    PrefixNamespaceMappings prefixNamespaceMappings = new PrefixNamespaceMappings();

    // Act
    DMNModelRepository actualDmnModelRepository = new DMNModelRepository(tDefinitions, tDefinitionsList,
        prefixNamespaceMappings);

    // Assert
    List<TDefinitions> expectedAllDefinitions = actualDmnModelRepository.allDefinitions;
    assertSame(expectedAllDefinitions, actualDmnModelRepository.getAllDefinitions());
    assertSame(prefixNamespaceMappings, actualDmnModelRepository.getPrefixNamespaceMappings());
    assertSame(tDefinitions, actualDmnModelRepository.getRootDefinitions());
  }

  @Test
  public void constructorTest2() {
    // Arrange
    TDefinitions rootDefinitions = new TDefinitions();

    // Act
    DMNModelRepository actualDmnModelRepository = new DMNModelRepository(rootDefinitions,
        new PrefixNamespaceMappings());

    // Assert
    List<TDefinitions> expectedAllDefinitions = actualDmnModelRepository.allDefinitions;
    assertSame(expectedAllDefinitions, actualDmnModelRepository.getAllDefinitions());
    PrefixNamespaceMappings expectedPrefixNamespaceMappings = actualDmnModelRepository.prefixNamespaceMappings;
    assertSame(expectedPrefixNamespaceMappings, actualDmnModelRepository.getPrefixNamespaceMappings());
    TDefinitions expectedRootDefinitions = actualDmnModelRepository.rootDefinitions;
    assertSame(expectedRootDefinitions, actualDmnModelRepository.getRootDefinitions());
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    DMNModelRepository actualDmnModelRepository = new DMNModelRepository();

    // Assert
    List<TDefinitions> expectedAllDefinitions = actualDmnModelRepository.allDefinitions;
    assertSame(expectedAllDefinitions, actualDmnModelRepository.getAllDefinitions());
    PrefixNamespaceMappings expectedPrefixNamespaceMappings = actualDmnModelRepository.prefixNamespaceMappings;
    assertSame(expectedPrefixNamespaceMappings, actualDmnModelRepository.getPrefixNamespaceMappings());
    TDefinitions expectedRootDefinitions = actualDmnModelRepository.rootDefinitions;
    assertSame(expectedRootDefinitions, actualDmnModelRepository.getRootDefinitions());
  }

  @Test
  public void constructorTest4() {
    // Arrange
    TDefinitions left = new TDefinitions();
    PrefixNamespaceMappings prefixNamespaceMappings = new PrefixNamespaceMappings();

    // Act
    DMNModelRepository actualDmnModelRepository = new DMNModelRepository(
        new Pair<TDefinitions, PrefixNamespaceMappings>(left, prefixNamespaceMappings));

    // Assert
    List<TDefinitions> expectedAllDefinitions = actualDmnModelRepository.allDefinitions;
    assertSame(expectedAllDefinitions, actualDmnModelRepository.getAllDefinitions());
    assertSame(prefixNamespaceMappings, actualDmnModelRepository.getPrefixNamespaceMappings());
    TDefinitions expectedRootDefinitions = actualDmnModelRepository.rootDefinitions;
    assertSame(expectedRootDefinitions, actualDmnModelRepository.getRootDefinitions());
  }

  @Test
  public void constructorTest5() {
    // Arrange and Act
    DMNModelRepository actualDmnModelRepository = new DMNModelRepository(new TDefinitions());

    // Assert
    List<TDefinitions> expectedAllDefinitions = actualDmnModelRepository.allDefinitions;
    assertSame(expectedAllDefinitions, actualDmnModelRepository.getAllDefinitions());
    PrefixNamespaceMappings expectedPrefixNamespaceMappings = actualDmnModelRepository.prefixNamespaceMappings;
    assertSame(expectedPrefixNamespaceMappings, actualDmnModelRepository.getPrefixNamespaceMappings());
    TDefinitions expectedRootDefinitions = actualDmnModelRepository.rootDefinitions;
    assertSame(expectedRootDefinitions, actualDmnModelRepository.getRootDefinitions());
  }

  @Test
  public void decisionServicesTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.decisionServices(new TDefinitions()).size());
  }

  @Test
  public void decisionServicesTest2() {
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
  public void decisionTableTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.decisionTable(new TDRGElement());
  }

  @Test
  public void decisionsTest() {
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
  public void decisionsTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.decisions(new TDefinitions()).size());
  }

  @Test
  public void directDRGElementsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.directDRGElements(new TDRGElement()).size());
  }

  @Test
  public void directInputDatasTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TDRGElement parent = new TDRGElement();
    ArrayList<TInformationRequirement> tInformationRequirementList = new ArrayList<TInformationRequirement>();
    tInformationRequirementList.add(new TInformationRequirement());

    // Act and Assert
    assertEquals(0, dmnModelRepository.directInputDatas(parent, tInformationRequirementList).size());
  }

  @Test
  public void directInputDatasTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.directInputDatas(new TDRGElement()).size());
  }

  @Test
  public void directSubDecisionsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.directSubDecisions(new TDRGElement()).size());
  }

  @Test
  public void directSubInvocablesTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.directSubInvocables(new TDRGElement()).size());
  }

  @Test
  public void displayNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    dmnModelRepository.displayName(new TNamedElement());
  }

  @Test
  public void drgElementsTest() {
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
  public void drgElementsTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.drgElements(new TDefinitions()).size());
  }

  @Test
  public void expressionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.expression(new TNamedElement());
  }

  @Test
  public void extractIdTest() {
    // Arrange
    String actualExtractIdResult = DMNModelRepository.extractId("#");

    // Act and Assert
    assertEquals("", actualExtractIdResult);
    assertEquals("http://", DMNModelRepository.extractId("http://"));
  }

  @Test
  public void extractNamespaceTest() {
    // Arrange, Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    (new DMNModelRepository()).extractNamespace("http://");
  }

  @Test
  public void extractNamespaceTest2() {
    // Arrange, Act and Assert
    assertNull((new DMNModelRepository()).extractNamespace("#"));
  }

  @Test
  public void findChildDefinitionsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertNull(dmnModelRepository.findChildDefinitions(new TDRGElement(), "#"));
  }

  @Test
  public void findDRGElementByNameTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DMNModelRepository()).findDRGElementByName("#");
  }

  @Test
  public void findDecisionServiceByNameTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DMNModelRepository()).findDecisionServiceByName("#");
  }

  @Test
  public void findKnowledgeModelByNameTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DMNModelRepository()).findKnowledgeModelByName("#");
  }

  @Test
  public void getImportedNamesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DMNModelRepository()).getImportedNames().size());
  }

  @Test
  public void getOutputDecisionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    dmnModelRepository.getOutputDecision(new TDecisionService());
  }

  @Test
  public void hasAggregatorTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertFalse(dmnModelRepository.hasAggregator(new TDecisionTable()));
  }

  @Test
  public void hasDefaultValueTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertFalse(dmnModelRepository.hasDefaultValue(new TDecisionTable()));
  }

  @Test
  public void hasNamespaceTest() {
    // Arrange, Act and Assert
    assertFalse(DMNModelRepository.hasNamespace("#"));
  }

  @Test
  public void inputDatasTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.inputDatas(new TDefinitions()).size());
  }

  @Test
  public void inputDatasTest2() {
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
  public void isCompoundDecisionTableTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.isCompoundDecisionTable(new TDRGElement());
  }

  @Test
  public void isContextExpressionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.isContextExpression(new TDRGElement());
  }

  @Test
  public void isDecisionTableExpressionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.isDecisionTableExpression(new TDRGElement());
  }

  @Test
  public void isEmptyTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    ArrayList<TItemDefinition> tItemDefinitionList = new ArrayList<TItemDefinition>();
    tItemDefinitionList.add(new TItemDefinition());

    // Act and Assert
    assertFalse(dmnModelRepository.isEmpty(tItemDefinitionList));
  }

  @Test
  public void isFirstSingleHitTest() {
    // Arrange, Act and Assert
    assertFalse((new DMNModelRepository()).isFirstSingleHit(THitPolicy.UNIQUE));
  }

  @Test
  public void isFirstSingleHitTest2() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isFirstSingleHit(THitPolicy.FIRST));
  }

  @Test
  public void isFreeTextLiteralExpressionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.isFreeTextLiteralExpression(new TNamedElement());
  }

  @Test
  public void isInvocationExpressionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.isInvocationExpression(new TDRGElement());
  }

  @Test
  public void isLiteralExpressionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.isLiteralExpression(new TDRGElement());
  }

  @Test
  public void isMultipleHitTest() {
    // Arrange, Act and Assert
    assertFalse((new DMNModelRepository()).isMultipleHit(THitPolicy.UNIQUE));
  }

  @Test
  public void isMultipleHitTest2() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isMultipleHit(THitPolicy.RULE_ORDER));
  }

  @Test
  public void isOutputOrderHitTest() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isOutputOrderHit(THitPolicy.OUTPUT_ORDER));
  }

  @Test
  public void isOutputOrderHitTest2() {
    // Arrange, Act and Assert
    assertFalse((new DMNModelRepository()).isOutputOrderHit(THitPolicy.UNIQUE));
  }

  @Test
  public void isOutputOrderHitTest3() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isOutputOrderHit(THitPolicy.PRIORITY));
  }

  @Test
  public void isQuotedNameTest() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isQuotedName("'"));
  }

  @Test
  public void isQuotedNameTest2() {
    // Arrange, Act and Assert
    assertFalse((new DMNModelRepository()).isQuotedName("#"));
  }

  @Test
  public void isRelationExpressionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.isRelationExpression(new TDRGElement());
  }

  @Test
  public void isSingleHitTest() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isSingleHit(THitPolicy.FIRST));
  }

  @Test
  public void isSingleHitTest2() {
    // Arrange, Act and Assert
    assertFalse((new DMNModelRepository()).isSingleHit(THitPolicy.COLLECT));
  }

  @Test
  public void isSingleHitTest3() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isSingleHit(THitPolicy.PRIORITY));
  }

  @Test
  public void isSingleHitTest4() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isSingleHit(THitPolicy.UNIQUE));
  }

  @Test
  public void itemDefinitionsTest() {
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
  public void itemDefinitionsTest2() {
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
  public void labelTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals("", dmnModelRepository.label(new TDMNElement()));
  }

  @Test
  public void lookupItemDefinitionTest() {
    // Arrange
    QualifiedName typeRef = new QualifiedName("name");

    // Act and Assert
    assertNull((new DMNModelRepository()).lookupItemDefinition(typeRef));
  }

  @Test
  public void lookupItemDefinitionTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    ArrayList<TItemDefinition> tItemDefinitionList = new ArrayList<TItemDefinition>();
    tItemDefinitionList.add(new TItemDefinition());

    // Act and Assert
    assertNull(dmnModelRepository.lookupItemDefinition(tItemDefinitionList, new QualifiedName("name")));
  }

  @Test
  public void lookupItemDefinitionTest3() {
    // Arrange, Act and Assert
    assertNull((new DMNModelRepository()).lookupItemDefinition("#"));
  }

  @Test
  public void lookupItemDefinitionTest4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    ArrayList<TItemDefinition> tItemDefinitionList = new ArrayList<TItemDefinition>();
    tItemDefinitionList.add(new TItemDefinition());

    // Act and Assert
    assertNull(dmnModelRepository.lookupItemDefinition(tItemDefinitionList, "#"));
  }

  @Test
  public void makeRefTest() {
    // Arrange
    String actualMakeRefResult = DMNModelRepository.makeRef("#", "#");

    // Act and Assert
    assertEquals("##", actualMakeRefResult);
    assertEquals("#", DMNModelRepository.makeRef("", "#"));
  }

  @Test
  public void nameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertNull(dmnModelRepository.name(new TNamedElement()));
  }

  @Test
  public void nextTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertNull(dmnModelRepository.next(new TItemDefinition()));
  }

  @Test
  public void normalizeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TItemDefinition tItemDefinition = new TItemDefinition();

    // Act and Assert
    assertSame(tItemDefinition, dmnModelRepository.normalize(tItemDefinition));
  }

  @Test
  public void outputClauseNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.outputClauseName(element, new TOutputClause());
  }

  @Test
  public void removeSingleQuotesTest() {
    // Arrange, Act and Assert
    assertEquals("#", (new DMNModelRepository()).removeSingleQuotes("#"));
  }

  @Test
  public void removeSingleQuotesTest2() {
    // Arrange, Act and Assert
    thrown.expect(StringIndexOutOfBoundsException.class);
    (new DMNModelRepository()).removeSingleQuotes("'");
  }

  @Test
  public void rulesCountTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.rulesCount(new TDRGElement());
  }

  @Test
  public void sortItemComponentTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.sortItemComponent(new TItemDefinition()).size());
  }

  @Test
  public void topologicalSortTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(ClassCastException.class);
    dmnModelRepository.topologicalSort(new TDRGElement());
  }

  @Test
  public void topologicalSortWithMarkersTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(ClassCastException.class);
    dmnModelRepository.topologicalSortWithMarkers(new TDRGElement());
  }

  @Test
  public void topologicalSortWithMarkersTest2() {
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
  public void typeRefTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.typeRef(new TNamedElement());
  }

  @Test
  public void variableTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertNull(dmnModelRepository.variable(new TNamedElement()));
  }
}

