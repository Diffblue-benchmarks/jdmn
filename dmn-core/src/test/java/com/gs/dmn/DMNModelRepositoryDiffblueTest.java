package com.gs.dmn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.runtime.DMNRuntimeException;
import com.gs.dmn.runtime.Pair;
import com.gs.dmn.runtime.interpreter.ImportPath;
import com.gs.dmn.serialization.PrefixNamespaceMappings;
import com.gs.dmn.transformation.basic.QualifiedName;
import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.omg.spec.dmn._20180521.model.TBuiltinAggregator;
import org.omg.spec.dmn._20180521.model.TDMNElementReference;
import org.omg.spec.dmn._20180521.model.TDRGElement;
import org.omg.spec.dmn._20180521.model.TDecision;
import org.omg.spec.dmn._20180521.model.TDecisionTable;
import org.omg.spec.dmn._20180521.model.TDefinitions;
import org.omg.spec.dmn._20180521.model.THitPolicy;
import org.omg.spec.dmn._20180521.model.TInformationItem;
import org.omg.spec.dmn._20180521.model.TInputData;
import org.omg.spec.dmn._20180521.model.TItemDefinition;
import org.omg.spec.dmn._20180521.model.TKnowledgeRequirement;

public class DMNModelRepositoryDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testAllInputDatas() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    DRGElementFilter drgElementFilter = new DRGElementFilter(true);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0,
        dmnModelRepository.allInputDatas(new DRGElementReference<TDRGElement>(importPath,
            "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision()), drgElementFilter)
            .size());
  }

  @Test
  public void testAllInputDatas2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    DRGElementFilter drgElementFilter = new DRGElementFilter(true);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0,
        dmnModelRepository.allInputDatas(new DRGElementReference<TDRGElement>(importPath,
            "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision()), drgElementFilter)
            .size());
  }

  @Test
  public void testAllInputDatas3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    DRGElementFilter drgElementFilter = new DRGElementFilter(true);
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0,
        dmnModelRepository.allInputDatas(new DRGElementReference<TDRGElement>(importPath,
            "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision()), drgElementFilter)
            .size());
  }

  @Test
  public void testCollectAllInputDatas() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0, dmnModelRepository.collectAllInputDatas(new DRGElementReference<TDRGElement>(importPath,
        "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision())).size());
  }

  @Test
  public void testCollectAllInputDatas2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0, dmnModelRepository.collectAllInputDatas(new DRGElementReference<TDRGElement>(importPath,
        "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision())).size());
  }

  @Test
  public void testCollectAllInputDatas3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    ImportPath importPath = new ImportPath();

    // Act and Assert
    assertEquals(0, dmnModelRepository.collectAllInputDatas(new DRGElementReference<TDRGElement>(importPath,
        "https://github.com/agilepro/dmn-tck", "0001-input-data-string", new TDecision())).size());
  }

  @Test
  public void testComputeCachedElements() {
    // Arrange, Act and Assert
    assertEquals(0, (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .computeCachedElements(true, 1).size());
    assertEquals(0, (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .computeCachedElements(true, 1).size());
    assertEquals(0, (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .computeCachedElements(true, 1).size());
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    DMNModelRepository actualDmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Assert
    List<TDefinitions> expectedAllDefinitions = actualDmnModelRepository.allDefinitions;
    assertSame(expectedAllDefinitions, actualDmnModelRepository.getAllDefinitions());
    PrefixNamespaceMappings expectedPrefixNamespaceMappings = actualDmnModelRepository.prefixNamespaceMappings;
    assertSame(expectedPrefixNamespaceMappings, actualDmnModelRepository.getPrefixNamespaceMappings());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    DMNModelRepository actualDmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Assert
    List<TDefinitions> expectedAllDefinitions = actualDmnModelRepository.allDefinitions;
    assertSame(expectedAllDefinitions, actualDmnModelRepository.getAllDefinitions());
    PrefixNamespaceMappings expectedPrefixNamespaceMappings = actualDmnModelRepository.prefixNamespaceMappings;
    assertSame(expectedPrefixNamespaceMappings, actualDmnModelRepository.getPrefixNamespaceMappings());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    DMNModelRepository actualDmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Assert
    List<TDefinitions> expectedAllDefinitions = actualDmnModelRepository.allDefinitions;
    assertSame(expectedAllDefinitions, actualDmnModelRepository.getAllDefinitions());
    PrefixNamespaceMappings expectedPrefixNamespaceMappings = actualDmnModelRepository.prefixNamespaceMappings;
    assertSame(expectedPrefixNamespaceMappings, actualDmnModelRepository.getPrefixNamespaceMappings());
  }

  @Test
  public void testDirectDRGElements() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.directDRGElements(new TDecision()).size());
  }

  @Test
  public void testDirectDRGElements2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.directDRGElements(new TInputData()).size());
  }

  @Test
  public void testDirectDRGElements3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.directDRGElements(new TInputData()).size());
  }

  @Test
  public void testDirectInputDatas() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.directInputDatas(new TDecision()).size());
  }

  @Test
  public void testDirectInputDatas2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.directInputDatas(new TInputData()).size());
  }

  @Test
  public void testDirectInputDatas3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.directInputDatas(new TDecision()).size());
  }

  @Test
  public void testDirectSubDecisions() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.directSubDecisions(new TDecision()).size());
  }

  @Test
  public void testDirectSubDecisions2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.directSubDecisions(new TDecision()).size());
  }

  @Test
  public void testDirectSubDecisions3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.directSubDecisions(new TDecision()).size());
  }

  @Test
  public void testDirectSubInvocables() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.directSubInvocables(new TDecision()).size());
  }

  @Test
  public void testDirectSubInvocables2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.directSubInvocables(new TInputData()).size());
  }

  @Test
  public void testDirectSubInvocables3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.directSubInvocables(new TInputData()).size());
  }

  @Test
  public void testDisplayName() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setName("principal");

    // Act and Assert
    assertEquals("principal", (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .displayName(tItemDefinition));
  }

  @Test
  public void testDisplayName2() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setName("rate");

    // Act and Assert
    assertEquals("rate", (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .displayName(tItemDefinition));
  }

  @Test
  public void testDisplayName3() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setName("termMonths");

    // Act and Assert
    assertEquals("termMonths", (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .displayName(tItemDefinition));
  }

  @Test
  public void testExtractId() {
    // Arrange, Act and Assert
    assertEquals("i_FullName", DMNModelRepository.extractId("#i_FullName"));
    assertEquals("i_FullName", DMNModelRepository.extractId("#i_FullName"));
    assertEquals("i_MonthlySalary", DMNModelRepository.extractId("#i_MonthlySalary"));
  }

  @Test
  public void testExtractNamespace() {
    // Arrange, Act and Assert
    assertNull((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .extractNamespace("#i_FullName"));
    assertNull((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .extractNamespace("#i_FullName"));
    assertNull((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .extractNamespace("#i_FullName"));
  }

  @Test
  public void testFindBKMs() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.findBKMs(new TDefinitions()).size());
  }

  @Test
  public void testFindBKMs2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.findBKMs(new TDefinitions()).size());
  }

  @Test
  public void testFindBKMs3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.findBKMs(new TDefinitions()).size());
  }

  @Test
  public void testFindChildDefinitions() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.findChildDefinitions(new TDecision(), "#i_FullName"));
  }

  @Test
  public void testFindChildDefinitions2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.findChildDefinitions(new TDecision(), "#i_FullName"));
  }

  @Test
  public void testFindChildDefinitions3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.findChildDefinitions(new TDecision(), "#i_FullName"));
  }

  @Test
  public void testFindChildImportName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.findChildImportName(new TInputData(), new TInputData()));
  }

  @Test
  public void testFindChildImportName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    TDecision parent = new TDecision();

    // Act and Assert
    assertNull(dmnModelRepository.findChildImportName(parent, new TInputData()));
  }

  @Test
  public void testFindChildImportName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.findChildImportName(new TDecision(), new TDecision()));
  }

  @Test
  public void testFindDRGElementByName() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .findDRGElementByName("'Greeting Message'");
  }

  @Test
  public void testFindDRGElementByName2() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .findDRGElementByName("'Yearly Salary'");
  }

  @Test
  public void testFindDRGElementByName3() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .findDRGElementByName("'Employment Status Statement'");
  }

  @Test
  public void testFindDRGElementByRef() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    dmnModelRepository.findDRGElementByRef(new TDecision(), "#i_FullName");
  }

  @Test
  public void testFindDRGElementByRef2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    dmnModelRepository.findDRGElementByRef(new TDecision(), "#i_FullName");
  }

  @Test
  public void testFindDRGElementByRef3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    dmnModelRepository.findDRGElementByRef(new TDecision(), "#i_FullName");
  }

  @Test
  public void testFindDRGElements() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.findDRGElements(new TDefinitions()).size());
  }

  @Test
  public void testFindDRGElements2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.findDRGElements(new TDefinitions()).size());
  }

  @Test
  public void testFindDRGElements3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.findDRGElements(new TDefinitions()).size());
  }

  @Test
  public void testFindDecisionByRef() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    dmnModelRepository.findDecisionByRef(new TDecision(), "#d_BureauCallType");
  }

  @Test
  public void testFindDecisionByRef2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    dmnModelRepository.findDecisionByRef(new TDecision(), "#d_Eligibility");
  }

  @Test
  public void testFindDecisionByRef3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    dmnModelRepository.findDecisionByRef(new TDecision(),
        "http://www.trisotech.com/definitions/_4e0f0b70-d31c-471c-bd52-5ca709ed362b#d_Pre-bureauRiskCategory");
  }

  @Test
  public void testFindDecisions() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.findDecisions(new TDefinitions()).size());
  }

  @Test
  public void testFindDecisions2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.findDecisions(new TDefinitions()).size());
  }

  @Test
  public void testFindDecisions3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.findDecisions(new TDefinitions()).size());
  }

  @Test
  public void testFindImportName() {
    // Arrange
    TDMNElementReference tdmnElementReference = new TDMNElementReference();
    tdmnElementReference.setHref("#i_FullName");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.findImportName(new TDecision(), tdmnElementReference));
  }

  @Test
  public void testFindImportName2() {
    // Arrange
    TDMNElementReference tdmnElementReference = new TDMNElementReference();
    tdmnElementReference.setHref("#i_FullName");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.findImportName(new TDecision(), tdmnElementReference));
  }

  @Test
  public void testFindImportName3() {
    // Arrange
    TDMNElementReference tdmnElementReference = new TDMNElementReference();
    tdmnElementReference.setHref("#i_FullName");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.findImportName(new TDecision(), tdmnElementReference));
  }

  @Test
  public void testFindInputDataByRef() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    dmnModelRepository.findInputDataByRef(new TDecision(), "#i_FullName");
  }

  @Test
  public void testFindInputDataByRef2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    dmnModelRepository.findInputDataByRef(new TDecision(), "#i_FullName");
  }

  @Test
  public void testFindInputDataByRef3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    dmnModelRepository.findInputDataByRef(new TDecision(), "#i_FullName");
  }

  @Test
  public void testFindInvocableByRef() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    dmnModelRepository.findInvocableByRef(new TDecision(), "#b_PMT");
  }

  @Test
  public void testFindInvocableByRef2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    dmnModelRepository.findInvocableByRef(new TDecision(), "#b_PMT");
  }

  @Test
  public void testFindInvocableByRef3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    dmnModelRepository.findInvocableByRef(new TDecision(), "#b_PMT2");
  }

  @Test
  public void testFindItemDefinitions() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    TDefinitions tDefinitions = new TDefinitions();

    // Act
    List<TItemDefinition> actualFindItemDefinitionsResult = dmnModelRepository.findItemDefinitions(tDefinitions);

    // Assert
    assertEquals(0, actualFindItemDefinitionsResult.size());
    assertSame(actualFindItemDefinitionsResult, tDefinitions.getItemDefinition());
  }

  @Test
  public void testFindItemDefinitions2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    TDefinitions tDefinitions = new TDefinitions();

    // Act
    List<TItemDefinition> actualFindItemDefinitionsResult = dmnModelRepository.findItemDefinitions(tDefinitions);

    // Assert
    assertEquals(0, actualFindItemDefinitionsResult.size());
    assertSame(actualFindItemDefinitionsResult, tDefinitions.getItemDefinition());
  }

  @Test
  public void testFindItemDefinitions3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    TDefinitions tDefinitions = new TDefinitions();

    // Act
    List<TItemDefinition> actualFindItemDefinitionsResult = dmnModelRepository.findItemDefinitions(tDefinitions);

    // Assert
    assertEquals(0, actualFindItemDefinitionsResult.size());
    assertSame(actualFindItemDefinitionsResult, tDefinitions.getItemDefinition());
  }

  @Test
  public void testFindKnowledgeModelByName() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .findKnowledgeModelByName("CreditContingencyFactorTable");
  }

  @Test
  public void testFindKnowledgeModelByName2() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .findKnowledgeModelByName("ApplicationRiskScoreModel");
  }

  @Test
  public void testFindKnowledgeModelByName3() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .findKnowledgeModelByName("BureauCallTypeTable");
  }

  @Test
  public void testGetImportedNames() {
    // Arrange, Act and Assert
    assertEquals(0, (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .getImportedNames().size());
    assertEquals(0, (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .getImportedNames().size());
    assertEquals(0, (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .getImportedNames().size());
  }

  @Test
  public void testGetModel() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.getModel(new TInputData()));
  }

  @Test
  public void testGetModel2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.getModel(new TInputData()));
  }

  @Test
  public void testGetModel3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.getModel(new TInputData()));
  }

  @Test
  public void testGetModelName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.getModelName(new TDecision()));
  }

  @Test
  public void testGetModelName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.getModelName(new TInputData()));
  }

  @Test
  public void testGetModelName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.getModelName(new TInputData()));
  }

  @Test
  public void testGetNamespace() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.getNamespace(new TDecision()));
  }

  @Test
  public void testGetNamespace2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.getNamespace(new TInputData()));
  }

  @Test
  public void testGetNamespace3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.getNamespace(new TInputData()));
  }

  @Test
  public void testGetRootDefinitions() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>())).getRootDefinitions();
  }

  @Test
  public void testGetRootDefinitions2() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>())).getRootDefinitions();
  }

  @Test
  public void testGetRootDefinitions3() {
    // Arrange, Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>())).getRootDefinitions();
  }

  @Test
  public void testHasAggregator() {
    // Arrange
    TBuiltinAggregator value = TBuiltinAggregator.valueOf("SUM");
    TDecisionTable tDecisionTable = new TDecisionTable();
    tDecisionTable.setAggregation(value);

    // Act and Assert
    assertTrue((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .hasAggregator(tDecisionTable));
  }

  @Test
  public void testHasDefaultValue() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertFalse(dmnModelRepository.hasDefaultValue(new TDecisionTable()));
  }

  @Test
  public void testHasDefaultValue2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertFalse(dmnModelRepository.hasDefaultValue(new TDecisionTable()));
  }

  @Test
  public void testHasDefaultValue3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertFalse(dmnModelRepository.hasDefaultValue(new TDecisionTable()));
  }

  @Test
  public void testHasNamespace() {
    // Arrange, Act and Assert
    assertFalse(DMNModelRepository.hasNamespace("#i_FullName"));
    assertFalse(DMNModelRepository.hasNamespace("#i_FullName"));
    assertFalse(DMNModelRepository.hasNamespace("#i_FullName"));
  }

  @Test
  public void testIsEmpty() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertTrue(dmnModelRepository.isEmpty(new ArrayList<TItemDefinition>()));
  }

  @Test
  public void testIsEmpty2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertTrue(dmnModelRepository.isEmpty(new ArrayList<TItemDefinition>()));
  }

  @Test
  public void testIsEmpty3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertTrue(dmnModelRepository.isEmpty(new ArrayList<TItemDefinition>()));
  }

  @Test
  public void testIsFirstSingleHit() {
    // Arrange
    THitPolicy policy = THitPolicy.fromValue("UNIQUE");

    // Act and Assert
    assertFalse((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .isFirstSingleHit(policy));
  }

  @Test
  public void testIsFirstSingleHit2() {
    // Arrange
    THitPolicy policy = THitPolicy.fromValue("UNIQUE");

    // Act and Assert
    assertFalse((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .isFirstSingleHit(policy));
  }

  @Test
  public void testIsFirstSingleHit3() {
    // Arrange
    THitPolicy policy = THitPolicy.fromValue("UNIQUE");

    // Act and Assert
    assertFalse((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .isFirstSingleHit(policy));
  }

  @Test
  public void testIsMultipleHit() {
    // Arrange
    THitPolicy hitPolicy = THitPolicy.fromValue("COLLECT");

    // Act and Assert
    assertTrue((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .isMultipleHit(hitPolicy));
  }

  @Test
  public void testIsOutputOrderHit() {
    // Arrange
    THitPolicy hitPolicy = THitPolicy.fromValue("UNIQUE");

    // Act and Assert
    assertFalse((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .isOutputOrderHit(hitPolicy));
  }

  @Test
  public void testIsOutputOrderHit2() {
    // Arrange
    THitPolicy hitPolicy = THitPolicy.fromValue("UNIQUE");

    // Act and Assert
    assertFalse((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .isOutputOrderHit(hitPolicy));
  }

  @Test
  public void testIsOutputOrderHit3() {
    // Arrange
    THitPolicy hitPolicy = THitPolicy.fromValue("UNIQUE");

    // Act and Assert
    assertFalse((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .isOutputOrderHit(hitPolicy));
  }

  @Test
  public void testIsQuotedName() {
    // Arrange, Act and Assert
    assertFalse((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .isQuotedName("Full Name"));
    assertFalse((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .isQuotedName("Greeting Message"));
    assertTrue((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .isQuotedName("'Greeting Message'"));
  }

  @Test
  public void testIsSingleHit() {
    // Arrange
    THitPolicy policy = THitPolicy.fromValue("UNIQUE");

    // Act and Assert
    assertTrue(
        (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>())).isSingleHit(policy));
  }

  @Test
  public void testIsSingleHit2() {
    // Arrange
    THitPolicy policy = THitPolicy.fromValue("ANY");

    // Act and Assert
    assertTrue(
        (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>())).isSingleHit(policy));
  }

  @Test
  public void testIsSingleHit3() {
    // Arrange
    THitPolicy policy = THitPolicy.fromValue("PRIORITY");

    // Act and Assert
    assertTrue(
        (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>())).isSingleHit(policy));
  }

  @Test
  public void testKnowledgeRequirements() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    TDecision tDecision = new TDecision();

    // Act
    List<TKnowledgeRequirement> actualKnowledgeRequirementsResult = dmnModelRepository.knowledgeRequirements(tDecision);

    // Assert
    assertEquals(0, actualKnowledgeRequirementsResult.size());
    assertSame(actualKnowledgeRequirementsResult, tDecision.getKnowledgeRequirement());
  }

  @Test
  public void testKnowledgeRequirements2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.knowledgeRequirements(new TInputData()).size());
  }

  @Test
  public void testKnowledgeRequirements3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.knowledgeRequirements(new TInputData()).size());
  }

  @Test
  public void testLabel() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals("", dmnModelRepository.label(new TDecision()));
  }

  @Test
  public void testLabel2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals("", dmnModelRepository.label(new TDecision()));
  }

  @Test
  public void testLabel3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals("", dmnModelRepository.label(new TDecision()));
  }

  @Test
  public void testLookupItemDefinition() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    TDefinitions tDefinitions = new TDefinitions();

    // Act and Assert
    assertNull(dmnModelRepository.lookupItemDefinition(tDefinitions,
        QualifiedName.toQualifiedName(tDefinitions, "tEmploymentStatus")));
  }

  @Test
  public void testLookupItemDefinition2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    TDefinitions tDefinitions = new TDefinitions();

    // Act and Assert
    assertNull(dmnModelRepository.lookupItemDefinition(tDefinitions,
        QualifiedName.toQualifiedName(tDefinitions, "feel.string")));
  }

  @Test
  public void testLookupItemDefinition3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    TDefinitions tDefinitions = new TDefinitions();

    // Act and Assert
    assertNull(dmnModelRepository.lookupItemDefinition(tDefinitions,
        QualifiedName.toQualifiedName(tDefinitions, "tEmploymentStatus")));
  }

  @Test
  public void testMakeDRGElementReference() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    ImportPath importPath = new ImportPath();

    // Act
    DRGElementReference<TDRGElement> actualMakeDRGElementReferenceResult = dmnModelRepository
        .<TDRGElement>makeDRGElementReference(importPath, new TDecision());

    // Assert
    assertNull(actualMakeDRGElementReferenceResult.getNamespace());
    assertNull(actualMakeDRGElementReferenceResult.getQualifiedImportName());
    assertNull(actualMakeDRGElementReferenceResult.getModelName());
    assertNull(actualMakeDRGElementReferenceResult.getElementName());
  }

  @Test
  public void testMakeDRGElementReference2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    ImportPath importPath = new ImportPath(new ImportPath(), null);

    // Act
    DRGElementReference<TDRGElement> actualMakeDRGElementReferenceResult = dmnModelRepository
        .<TDRGElement>makeDRGElementReference(importPath, new TInputData());

    // Assert
    assertNull(actualMakeDRGElementReferenceResult.getNamespace());
    assertNull(actualMakeDRGElementReferenceResult.getQualifiedImportName());
    assertNull(actualMakeDRGElementReferenceResult.getModelName());
    assertNull(actualMakeDRGElementReferenceResult.getElementName());
  }

  @Test
  public void testMakeDRGElementReference3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    ImportPath importPath = new ImportPath(null);

    // Act
    DRGElementReference<TDRGElement> actualMakeDRGElementReferenceResult = dmnModelRepository
        .<TDRGElement>makeDRGElementReference(importPath, new TInputData());

    // Assert
    assertNull(actualMakeDRGElementReferenceResult.getNamespace());
    assertNull(actualMakeDRGElementReferenceResult.getQualifiedImportName());
    assertNull(actualMakeDRGElementReferenceResult.getModelName());
    assertNull(actualMakeDRGElementReferenceResult.getElementName());
  }

  @Test
  public void testMakeDRGElementReference4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act
    DRGElementReference<TDRGElement> actualMakeDRGElementReferenceResult = dmnModelRepository
        .<TDRGElement>makeDRGElementReference((String) null, new TInputData());

    // Assert
    assertNull(actualMakeDRGElementReferenceResult.getNamespace());
    assertNull(actualMakeDRGElementReferenceResult.getQualifiedImportName());
    assertNull(actualMakeDRGElementReferenceResult.getModelName());
    String actualToStringResult = actualMakeDRGElementReferenceResult.getImportPath().toString();
    assertNull(actualMakeDRGElementReferenceResult.getElementName());
    assertEquals("[]", actualToStringResult);
  }

  @Test
  public void testMakeDRGElementReference5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act
    DRGElementReference<TDRGElement> actualMakeDRGElementReferenceResult = dmnModelRepository
        .<TDRGElement>makeDRGElementReference((String) null, new TInputData());

    // Assert
    assertNull(actualMakeDRGElementReferenceResult.getNamespace());
    assertNull(actualMakeDRGElementReferenceResult.getQualifiedImportName());
    assertNull(actualMakeDRGElementReferenceResult.getModelName());
    String actualToStringResult = actualMakeDRGElementReferenceResult.getImportPath().toString();
    assertNull(actualMakeDRGElementReferenceResult.getElementName());
    assertEquals("[]", actualToStringResult);
  }

  @Test
  public void testMakeDRGElementReference6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act
    DRGElementReference<TDRGElement> actualMakeDRGElementReferenceResult = dmnModelRepository
        .<TDRGElement>makeDRGElementReference((String) null, new TInputData());

    // Assert
    assertNull(actualMakeDRGElementReferenceResult.getNamespace());
    assertNull(actualMakeDRGElementReferenceResult.getQualifiedImportName());
    assertNull(actualMakeDRGElementReferenceResult.getModelName());
    String actualToStringResult = actualMakeDRGElementReferenceResult.getImportPath().toString();
    assertNull(actualMakeDRGElementReferenceResult.getElementName());
    assertEquals("[]", actualToStringResult);
  }

  @Test
  public void testMakeDRGElementReference7() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act
    DRGElementReference<TDRGElement> actualMakeDRGElementReferenceResult = dmnModelRepository
        .<TDRGElement>makeDRGElementReference(new TDecision());

    // Assert
    assertNull(actualMakeDRGElementReferenceResult.getNamespace());
    assertNull(actualMakeDRGElementReferenceResult.getQualifiedImportName());
    assertNull(actualMakeDRGElementReferenceResult.getModelName());
    String actualToStringResult = actualMakeDRGElementReferenceResult.getImportPath().toString();
    assertNull(actualMakeDRGElementReferenceResult.getElementName());
    assertEquals("[]", actualToStringResult);
  }

  @Test
  public void testMakeDRGElementReference8() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act
    DRGElementReference<TDRGElement> actualMakeDRGElementReferenceResult = dmnModelRepository
        .<TDRGElement>makeDRGElementReference(new TDecision());

    // Assert
    assertNull(actualMakeDRGElementReferenceResult.getNamespace());
    assertNull(actualMakeDRGElementReferenceResult.getQualifiedImportName());
    assertNull(actualMakeDRGElementReferenceResult.getModelName());
    String actualToStringResult = actualMakeDRGElementReferenceResult.getImportPath().toString();
    assertNull(actualMakeDRGElementReferenceResult.getElementName());
    assertEquals("[]", actualToStringResult);
  }

  @Test
  public void testMakeDRGElementReference9() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act
    DRGElementReference<TDRGElement> actualMakeDRGElementReferenceResult = dmnModelRepository
        .<TDRGElement>makeDRGElementReference(new TDecision());

    // Assert
    assertNull(actualMakeDRGElementReferenceResult.getNamespace());
    assertNull(actualMakeDRGElementReferenceResult.getQualifiedImportName());
    assertNull(actualMakeDRGElementReferenceResult.getModelName());
    String actualToStringResult = actualMakeDRGElementReferenceResult.getImportPath().toString();
    assertNull(actualMakeDRGElementReferenceResult.getElementName());
    assertEquals("[]", actualToStringResult);
  }

  @Test
  public void testMakeRef() {
    // Arrange, Act and Assert
    assertEquals("https://github.com/agilepro/dmn-tck#i_FullName",
        DMNModelRepository.makeRef("https://github.com/agilepro/dmn-tck", "#i_FullName"));
    assertEquals("https://github.com/agilepro/dmn-tck#i_FullName",
        DMNModelRepository.makeRef("https://github.com/agilepro/dmn-tck", "#i_FullName"));
    assertEquals("https://github.com/agilepro/dmn-tck#i_FullName",
        DMNModelRepository.makeRef("https://github.com/agilepro/dmn-tck", "#i_FullName"));
  }

  @Test
  public void testName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.name(new TDecision()));
  }

  @Test
  public void testName2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.name(new TDecision()));
  }

  @Test
  public void testName3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.name(new TDecision()));
  }

  @Test
  public void testNext() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setTypeRef("feel.string");
    tItemDefinition.setIsCollection((Boolean) false);

    // Act and Assert
    assertNull(
        (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>())).next(tItemDefinition));
  }

  @Test
  public void testNext2() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setTypeRef("feel.string");
    tItemDefinition.setIsCollection((Boolean) false);

    // Act and Assert
    assertNull(
        (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>())).next(tItemDefinition));
  }

  @Test
  public void testNext3() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setIsCollection((Boolean) false);

    // Act and Assert
    assertNull(
        (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>())).next(tItemDefinition));
  }

  @Test
  public void testNormalize() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setTypeRef("feel.string");
    tItemDefinition.setIsCollection((Boolean) false);

    // Act and Assert
    assertSame(tItemDefinition, (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .normalize(tItemDefinition));
  }

  @Test
  public void testNormalize2() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setTypeRef("feel.string");
    tItemDefinition.setIsCollection((Boolean) false);

    // Act and Assert
    assertSame(tItemDefinition, (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .normalize(tItemDefinition));
  }

  @Test
  public void testNormalize3() {
    // Arrange
    TItemDefinition tItemDefinition = new TItemDefinition();
    tItemDefinition.setIsCollection((Boolean) false);

    // Act and Assert
    assertSame(tItemDefinition, (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .normalize(tItemDefinition));
  }

  @Test
  public void testRemoveSingleQuotes() {
    // Arrange, Act and Assert
    assertEquals("Full Name", (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .removeSingleQuotes("Full Name"));
    assertEquals("Greeting Message",
        (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
            .removeSingleQuotes("Greeting Message"));
    assertEquals("Greeting Message",
        (new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
            .removeSingleQuotes("'Greeting Message'"));
  }

  @Test
  public void testRequiredDecisionReferences() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.requiredDecisionReferences(new TDecision()).size());
  }

  @Test
  public void testRequiredDecisionReferences2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.requiredDecisionReferences(new TDecision()).size());
  }

  @Test
  public void testRequiredDecisionReferences3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.requiredDecisionReferences(new TDecision()).size());
  }

  @Test
  public void testRequiredInputDataReferences() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.requiredInputDataReferences(new TDecision()).size());
  }

  @Test
  public void testRequiredInputDataReferences2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.requiredInputDataReferences(new TDecision()).size());
  }

  @Test
  public void testRequiredInputDataReferences3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.requiredInputDataReferences(new TInputData()).size());
  }

  @Test
  public void testSameId() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setId("i_FullName");

    // Act and Assert
    assertTrue((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>())).sameId(tInputData,
        "#i_FullName"));
  }

  @Test
  public void testSameId2() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setId("i_FullName");

    // Act and Assert
    assertTrue((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>())).sameId(tInputData,
        "#i_FullName"));
  }

  @Test
  public void testSameId3() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setId("i_MonthlySalary");

    // Act and Assert
    assertTrue((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>())).sameId(tInputData,
        "#i_MonthlySalary"));
  }

  @Test
  public void testSameName() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setName("Full Name");

    // Act and Assert
    assertFalse((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .sameName(tInputData, "'Greeting Message'"));
  }

  @Test
  public void testSameName2() {
    // Arrange
    TDecision tDecision = new TDecision();
    tDecision.setName("Greeting Message");

    // Act and Assert
    assertFalse((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .sameName(tDecision, "'Greeting Message'"));
  }

  @Test
  public void testSameName3() {
    // Arrange
    TInputData tInputData = new TInputData();
    tInputData.setName("Monthly Salary");

    // Act and Assert
    assertFalse((new DMNModelRepository(new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>()))
        .sameName(tInputData, "'Yearly Salary'"));
  }

  @Test
  public void testSortItemComponent() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.sortItemComponent(new TItemDefinition()).size());
  }

  @Test
  public void testSortItemComponent2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.sortItemComponent(new TItemDefinition()).size());
  }

  @Test
  public void testSortItemComponent3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertEquals(0, dmnModelRepository.sortItemComponent(new TItemDefinition()).size());
  }

  @Test
  public void testSortedUniqueInputs() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    DRGElementFilter drgElementFilter = new DRGElementFilter(true);

    // Act and Assert
    assertEquals(0, dmnModelRepository.sortedUniqueInputs(new TDecision(), drgElementFilter).size());
  }

  @Test
  public void testSortedUniqueInputs2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    DRGElementFilter drgElementFilter = new DRGElementFilter(true);

    // Act and Assert
    assertEquals(0, dmnModelRepository.sortedUniqueInputs(new TDecision(), drgElementFilter).size());
  }

  @Test
  public void testSortedUniqueInputs3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    DRGElementFilter drgElementFilter = new DRGElementFilter(true);

    // Act and Assert
    assertEquals(0, dmnModelRepository.sortedUniqueInputs(new TDecision(), drgElementFilter).size());
  }

  @Test
  public void testVariable() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.variable(new TInputData()));
  }

  @Test
  public void testVariable2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.variable(new TInputData()));
  }

  @Test
  public void testVariable3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertNull(dmnModelRepository.variable(new TDecision()));
  }

  @Test
  public void testVariableTypeRef() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act
    QualifiedName actualVariableTypeRefResult = dmnModelRepository.variableTypeRef(new TDefinitions(), tInputData);

    // Assert
    assertEquals("feel", actualVariableTypeRefResult.getNamespace());
    assertEquals("string", actualVariableTypeRefResult.getLocalPart());
  }

  @Test
  public void testVariableTypeRef2() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    TInputData tInputData = new TInputData();
    tInputData.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act
    QualifiedName actualVariableTypeRefResult = dmnModelRepository.variableTypeRef(new TDefinitions(), tInputData);

    // Assert
    assertEquals("feel", actualVariableTypeRefResult.getNamespace());
    assertEquals("string", actualVariableTypeRefResult.getLocalPart());
  }

  @Test
  public void testVariableTypeRef3() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    TDecision tDecision = new TDecision();
    tDecision.setVariable(tInformationItem);
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act
    QualifiedName actualVariableTypeRefResult = dmnModelRepository.variableTypeRef(new TDefinitions(), tDecision);

    // Assert
    assertEquals("feel", actualVariableTypeRefResult.getNamespace());
    assertEquals("string", actualVariableTypeRefResult.getLocalPart());
  }

  @Test
  public void testVariableTypeRef4() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.number");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act
    QualifiedName actualVariableTypeRefResult = dmnModelRepository.variableTypeRef(new TDefinitions(),
        tInformationItem);

    // Assert
    assertEquals("feel", actualVariableTypeRefResult.getNamespace());
    assertEquals("number", actualVariableTypeRefResult.getLocalPart());
  }

  @Test
  public void testVariableTypeRef5() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act
    QualifiedName actualVariableTypeRefResult = dmnModelRepository.variableTypeRef(new TDefinitions(),
        tInformationItem);

    // Assert
    assertEquals("feel", actualVariableTypeRefResult.getNamespace());
    assertEquals("string", actualVariableTypeRefResult.getLocalPart());
  }

  @Test
  public void testVariableTypeRef6() {
    // Arrange
    TInformationItem tInformationItem = new TInformationItem();
    tInformationItem.setTypeRef("feel.string");
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act
    QualifiedName actualVariableTypeRefResult = dmnModelRepository.variableTypeRef(new TDefinitions(),
        tInformationItem);

    // Assert
    assertEquals("feel", actualVariableTypeRefResult.getNamespace());
    assertEquals("string", actualVariableTypeRefResult.getLocalPart());
  }
}

