package com.gs.dmn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.runtime.DMNRuntimeException;
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
import org.omg.spec.dmn._20180521.model.TInputData;
import org.omg.spec.dmn._20180521.model.TItemDefinition;
import org.omg.spec.dmn._20180521.model.TNamedElement;

public class DMNModelRepositoryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void isMultipleHitTest() {
    // Arrange, Act and Assert
    assertFalse((new DMNModelRepository()).isMultipleHit(THitPolicy.UNIQUE));
  }

  @Test(timeout=10000)
  public void isEmptyTest() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isEmpty(null));
  }

  @Test(timeout=10000)
  public void findDRGElementByNameTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DMNModelRepository()).findDRGElementByName("name");
  }

  @Test(timeout=10000)
  public void constructorTest4() {
    // Arrange
    TDefinitions tDefinitions = new TDefinitions();

    // Act
    DMNModelRepository actualDmnModelRepository = new DMNModelRepository(tDefinitions);

    // Assert
    PrefixNamespaceMappings expectedPrefixNamespaceMappings = actualDmnModelRepository.prefixNamespaceMappings;
    List<TDefinitions> expectedAllDefinitions = actualDmnModelRepository.allDefinitions;
    List<TDefinitions> actualAllDefinitions = actualDmnModelRepository.getAllDefinitions();
    TDefinitions actualRootDefinitions = actualDmnModelRepository.getRootDefinitions();
    assertSame(expectedAllDefinitions, actualAllDefinitions);
    assertSame(expectedPrefixNamespaceMappings, actualDmnModelRepository.getPrefixNamespaceMappings());
    assertSame(tDefinitions, actualRootDefinitions);
  }

  @Test(timeout=10000)
  public void getRootDefinitionsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertSame(dmnModelRepository.rootDefinitions, dmnModelRepository.getRootDefinitions());
  }

  @Test(timeout=10000)
  public void findChildDefinitionsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertNull(dmnModelRepository.findChildDefinitions(new TDRGElement(), "foo"));
  }

  @Test(timeout=10000)
  public void isInvocationExpressionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.isInvocationExpression(new TDRGElement());
  }

  @Test(timeout=10000)
  public void directDRGElementsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.directDRGElements(new TDRGElement()).size());
  }

  @Test(timeout=10000)
  public void allInputDatasTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.allInputDatas(new TDRGElement()).size());
  }

  @Test(timeout=10000)
  public void lookupItemDefinitionTest3() {
    // Arrange, Act and Assert
    assertNull((new DMNModelRepository()).lookupItemDefinition("name"));
  }

  @Test(timeout=10000)
  public void decisionsTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.decisions(new TDefinitions()).size());
  }

  @Test(timeout=10000)
  public void hasAggregatorTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertFalse(dmnModelRepository.hasAggregator(new TDecisionTable()));
  }

  @Test(timeout=10000)
  public void removeSingleQuotesTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new DMNModelRepository()).removeSingleQuotes("name"));
  }

  @Test(timeout=10000)
  public void findDecisionServiceByNameTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DMNModelRepository()).findDecisionServiceByName("name");
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void typeRefTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.typeRef(new TNamedElement());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void allSubDecisionsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.allSubDecisions(new TDRGElement()).size());
  }

  @Test(timeout=10000)
  public void directInputDatasTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.directInputDatas(new TDRGElement()).size());
  }

  @Test(timeout=10000)
  public void getAllDefinitionsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act
    List<TDefinitions> actualAllDefinitions = dmnModelRepository.getAllDefinitions();

    // Assert
    assertSame(dmnModelRepository.allDefinitions, actualAllDefinitions);
    assertEquals(1, actualAllDefinitions.size());
  }

  @Test(timeout=10000)
  public void isContextExpressionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.isContextExpression(new TDRGElement());
  }

  @Test(timeout=10000)
  public void getOutputDecisionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    dmnModelRepository.getOutputDecision(new TDecisionService());
  }

  @Test(timeout=10000)
  public void hasNamespaceTest() {
    // Arrange, Act and Assert
    assertFalse(DMNModelRepository.hasNamespace("foo"));
  }

  @Test(timeout=10000)
  public void isOutputOrderHitTest() {
    // Arrange, Act and Assert
    assertFalse((new DMNModelRepository()).isOutputOrderHit(THitPolicy.UNIQUE));
  }

  @Test(timeout=10000)
  public void hasDefaultValueTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertFalse(dmnModelRepository.hasDefaultValue(new TDecisionTable()));
  }

  @Test(timeout=10000)
  public void inputDatasTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.inputDatas(new TDefinitions()).size());
  }

  @Test(timeout=10000)
  public void getPrefixNamespaceMappingsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertSame(dmnModelRepository.prefixNamespaceMappings, dmnModelRepository.getPrefixNamespaceMappings());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void findKnowledgeModelByNameTest() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DMNModelRepository()).findKnowledgeModelByName("name");
  }

  @Test(timeout=10000)
  public void labelTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals("", dmnModelRepository.label(new TDMNElement()));
  }

  @Test(timeout=10000)
  public void variableTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertNull(dmnModelRepository.variable(new TNamedElement()));
  }

  @Test(timeout=10000)
  public void atLeastTwoRulesTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertFalse(dmnModelRepository.atLeastTwoRules(new TDecisionTable()));
  }

  @Test(timeout=10000)
  public void drgElementsTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.drgElements(new TDefinitions()).size());
  }

  @Test(timeout=10000)
  public void extractIdTest() {
    // Arrange, Act and Assert
    assertEquals("foo", DMNModelRepository.extractId("foo"));
  }

  @Test(timeout=10000)
  public void isFreeTextLiteralExpressionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.isFreeTextLiteralExpression(new TNamedElement());
  }

  @Test(timeout=10000)
  public void isQuotedNameTest() {
    // Arrange, Act and Assert
    assertFalse((new DMNModelRepository()).isQuotedName("name"));
  }

  @Test(timeout=10000)
  public void allInvocablesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DMNModelRepository()).allInvocables(null).size());
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange and Act
    DMNModelRepository actualDmnModelRepository = new DMNModelRepository();

    // Assert
    PrefixNamespaceMappings expectedPrefixNamespaceMappings = actualDmnModelRepository.prefixNamespaceMappings;
    List<TDefinitions> expectedAllDefinitions = actualDmnModelRepository.allDefinitions;
    TDefinitions expectedRootDefinitions = actualDmnModelRepository.rootDefinitions;
    List<TDefinitions> actualAllDefinitions = actualDmnModelRepository.getAllDefinitions();
    TDefinitions actualRootDefinitions = actualDmnModelRepository.getRootDefinitions();
    assertSame(expectedAllDefinitions, actualAllDefinitions);
    assertSame(expectedPrefixNamespaceMappings, actualDmnModelRepository.getPrefixNamespaceMappings());
    assertSame(expectedRootDefinitions, actualRootDefinitions);
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void sortItemComponentTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.sortItemComponent(new TItemDefinition()).size());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void isFirstSingleHitTest() {
    // Arrange, Act and Assert
    assertFalse((new DMNModelRepository()).isFirstSingleHit(THitPolicy.UNIQUE));
  }

  @Test(timeout=10000)
  public void nameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertNull(dmnModelRepository.name(new TNamedElement()));
  }

  @Test(timeout=10000)
  public void makeRefTest() {
    // Arrange, Act and Assert
    assertEquals("foofoo", DMNModelRepository.makeRef("foo", "foo"));
  }

  @Test(timeout=10000)
  public void normalizeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    TItemDefinition tItemDefinition = new TItemDefinition();

    // Act and Assert
    assertSame(tItemDefinition, dmnModelRepository.normalize(tItemDefinition));
  }

  @Test(timeout=10000)
  public void extractNamespaceTest() {
    // Arrange, Act and Assert
    assertNull((new DMNModelRepository()).extractNamespace("foo"));
  }

  @Test(timeout=10000)
  public void lookupItemDefinitionTest2() {
    // Arrange, Act and Assert
    assertNull((new DMNModelRepository()).lookupItemDefinition(null, (QualifiedName) null));
  }

  @Test(timeout=10000)
  public void isSingleHitTest() {
    // Arrange, Act and Assert
    assertTrue((new DMNModelRepository()).isSingleHit(THitPolicy.UNIQUE));
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange
    TDefinitions rootDefinitions = new TDefinitions();
    PrefixNamespaceMappings prefixNamespaceMappings = new PrefixNamespaceMappings();

    // Act
    DMNModelRepository actualDmnModelRepository = new DMNModelRepository(rootDefinitions, prefixNamespaceMappings);

    // Assert
    List<TDefinitions> expectedAllDefinitions = actualDmnModelRepository.allDefinitions;
    TDefinitions expectedRootDefinitions = actualDmnModelRepository.rootDefinitions;
    List<TDefinitions> actualAllDefinitions = actualDmnModelRepository.getAllDefinitions();
    TDefinitions actualRootDefinitions = actualDmnModelRepository.getRootDefinitions();
    assertSame(expectedAllDefinitions, actualAllDefinitions);
    assertSame(prefixNamespaceMappings, actualDmnModelRepository.getPrefixNamespaceMappings());
    assertSame(expectedRootDefinitions, actualRootDefinitions);
  }

  @Test(timeout=10000)
  public void directSubInvocablesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DMNModelRepository()).directSubInvocables(null).size());
  }

  @Test(timeout=10000)
  public void computeCachedElementsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DMNModelRepository()).computeCachedElements(true).size());
  }

  @Test(timeout=10000)
  public void directSubDecisionsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DMNModelRepository()).directSubDecisions(null).size());
  }

  @Test(timeout=10000)
  public void getImportedNamesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DMNModelRepository()).getImportedNames().size());
  }

  @Test(timeout=10000)
  public void decisionServicesTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.decisionServices(new TDefinitions()).size());
  }

  @Test(timeout=10000)
  public void expressionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    dmnModelRepository.expression(new TNamedElement());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    TDefinitions rootDefinitions = new TDefinitions();

    // Act
    DMNModelRepository actualDmnModelRepository = new DMNModelRepository(rootDefinitions, null,
        new PrefixNamespaceMappings());

    // Assert
    PrefixNamespaceMappings expectedPrefixNamespaceMappings = actualDmnModelRepository.prefixNamespaceMappings;
    List<TDefinitions> expectedAllDefinitions = actualDmnModelRepository.allDefinitions;
    TDefinitions expectedRootDefinitions = actualDmnModelRepository.rootDefinitions;
    List<TDefinitions> actualAllDefinitions = actualDmnModelRepository.getAllDefinitions();
    TDefinitions actualRootDefinitions = actualDmnModelRepository.getRootDefinitions();
    assertSame(expectedAllDefinitions, actualAllDefinitions);
    assertSame(expectedPrefixNamespaceMappings, actualDmnModelRepository.getPrefixNamespaceMappings());
    assertSame(expectedRootDefinitions, actualRootDefinitions);
  }

  @Test(timeout=10000)
  public void nextTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertNull(dmnModelRepository.next(new TItemDefinition()));
  }

  @Test(timeout=10000)
  public void displayNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    dmnModelRepository.displayName(new TNamedElement());
  }

  @Test(timeout=10000)
  public void businessKnowledgeModelsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();

    // Act and Assert
    assertEquals(0, dmnModelRepository.businessKnowledgeModels(new TDefinitions()).size());
  }

  @Test(timeout=10000)
  public void lookupItemDefinitionTest() {
    // Arrange, Act and Assert
    assertNull((new DMNModelRepository()).lookupItemDefinition((QualifiedName) null));
  }
}

