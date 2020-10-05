package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.environment.Environment;
import com.gs.dmn.feel.analysis.semantics.environment.EnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.type.NumberType;
import com.gs.dmn.feel.analysis.semantics.type.StringType;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.synthesis.FEELToJavaVisitor;
import com.gs.dmn.feel.synthesis.type.StandardNativeTypeFactory;
import com.gs.dmn.runtime.Pair;
import com.gs.dmn.serialization.PrefixNamespaceMappings;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.basic.EnvironmentMemoizer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.TreeMap;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDecision;
import org.omg.spec.dmn._20180521.model.TDefinitions;

public class NameDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Name actualName = new Name("'Full Name'");

    // Assert
    assertTrue(actualName.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name('Full Name')", actualName.toString());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    Name actualName = new Name("'Monthly Salary'");

    // Assert
    assertTrue(actualName.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name('Monthly Salary')", actualName.toString());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    Name actualName = new Name("'Employment Status'");

    // Assert
    assertTrue(actualName.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name('Employment Status')", actualName.toString());
  }

  @Test
  public void testAccept() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    StringType stringType = new StringType();
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("'Full Name'", stringType));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);
    FEELContext params = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    Name name = new Name("'Full Name'");

    // Act and Assert
    assertSame(name, name.accept(new FEELSemanticVisitor(dmnTransformer), params));
    assertSame(stringType, ((Name) name.accept(new FEELSemanticVisitor(dmnTransformer), params)).getType());
  }

  @Test
  public void testAccept2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    FEELToJavaVisitor visitor = new FEELToJavaVisitor(new BasicDMN2JavaTransformer(dmnModelRepository,
        environmentFactory, nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext params = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));

    // Act and Assert
    assertEquals("fullName", (new Name("'Full Name'")).accept(visitor, params));
  }

  @Test
  public void testAccept3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    NumberType numberType = new NumberType();
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("'Monthly Salary'", numberType));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);
    FEELContext params = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    Name name = new Name("'Monthly Salary'");

    // Act and Assert
    assertSame(name, name.accept(new FEELSemanticVisitor(dmnTransformer), params));
    assertSame(numberType, ((Name) name.accept(new FEELSemanticVisitor(dmnTransformer), params)).getType());
  }
}

