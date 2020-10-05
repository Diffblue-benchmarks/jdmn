package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.environment.EnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory;
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

public class NullLiteralDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new NullLiteral()).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue((new NullLiteral()).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue((new NullLiteral()).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testDeriveType() {
    // Arrange
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, (new EnvironmentMemoizer()).get(tDecision));
    NullLiteral nullLiteral = new NullLiteral();

    // Act
    nullLiteral.deriveType(context);

    // Assert
    assertTrue(nullLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }

  @Test
  public void testDeriveType2() {
    // Arrange
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, (new EnvironmentMemoizer()).get(tDecision));
    NullLiteral nullLiteral = new NullLiteral();

    // Act
    nullLiteral.deriveType(context);

    // Assert
    assertTrue(nullLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }

  @Test
  public void testDeriveType3() {
    // Arrange
    TDecision tDecision = new TDecision();
    FEELContext context = FEELContext.makeContext(tDecision, (new EnvironmentMemoizer()).get(tDecision));
    NullLiteral nullLiteral = new NullLiteral();

    // Act
    nullLiteral.deriveType(context);

    // Assert
    assertTrue(nullLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }

  @Test
  public void testAccept() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext params = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(dmnTransformer);
    NullLiteral nullLiteral = new NullLiteral();

    // Act and Assert
    assertSame(nullLiteral, nullLiteral.accept(visitor, params));
    assertTrue(((NullLiteral) nullLiteral.accept(visitor, params))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
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
    assertEquals("null", (new NullLiteral()).accept(visitor, params));
  }

  @Test
  public void testAccept3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory environmentFactory = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, environmentFactory,
        nativeTypeFactory, new NopLazyEvaluationDetector(), inputParameters);
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    FEELContext params = FEELContext.makeContext(tDecision, environmentMemoizer.get(tDecision));
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(dmnTransformer);
    NullLiteral nullLiteral = new NullLiteral();

    // Act and Assert
    assertSame(nullLiteral, nullLiteral.accept(visitor, params));
    assertTrue(((NullLiteral) nullLiteral.accept(visitor, params))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }
}

