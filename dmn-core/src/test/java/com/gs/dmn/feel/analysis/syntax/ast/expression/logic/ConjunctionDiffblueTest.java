package com.gs.dmn.feel.analysis.syntax.ast.expression.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.environment.Environment;
import com.gs.dmn.feel.analysis.semantics.environment.EnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.type.BooleanType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.Name;
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

public class ConjunctionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    Name leftOperand = new Name("A");

    // Act
    Conjunction actualConjunction = new Conjunction(leftOperand, new Name("B"));

    // Assert
    assertEquals("and", actualConjunction.getOperator());
    assertTrue(actualConjunction.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Conjunction(Name(A),Name(B))", actualConjunction.toString());
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
    BooleanType booleanType = new BooleanType();
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("B", booleanType));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);
    FEELContext params = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    Name leftOperand = new Name("A");
    Conjunction conjunction = new Conjunction(leftOperand, new Name("B"));

    // Act and Assert
    assertSame(conjunction, conjunction.accept(new FEELSemanticVisitor(dmnTransformer), params));
    Type actualType = ((Conjunction) conjunction.accept(new FEELSemanticVisitor(dmnTransformer), params))
        .getRightOperand().getType();
    BooleanType expectedType = booleanType.BOOLEAN;
    assertSame(expectedType,
        ((Conjunction) conjunction.accept(new FEELSemanticVisitor(dmnTransformer), params)).getType());
    assertSame(booleanType, actualType);
  }

  @Test
  public void testAccept2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    Environment makeEnvironmentResult = instanceResult.makeEnvironment(instanceResult.getRootEnvironment(), null);
    BooleanType booleanType = new BooleanType();
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("A", booleanType));
    makeEnvironmentResult.addDeclaration(instanceResult.makeVariableDeclaration("B", booleanType));
    TDecision tDecision = new TDecision();
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    environmentMemoizer.put(tDecision, makeEnvironmentResult);
    FEELContext makeContextResult = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    Name leftOperand = new Name("A");
    Conjunction conjunction = new Conjunction(leftOperand, new Name("B"));
    conjunction.accept(new FEELSemanticVisitor(basicDMN2JavaTransformer), makeContextResult);

    // Act and Assert
    assertEquals("booleanAnd(a, b)",
        conjunction.accept(new FEELToJavaVisitor(basicDMN2JavaTransformer), makeContextResult));
  }
}

