package com.gs.dmn.feel.synthesis;

import static org.junit.Assert.assertEquals;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.environment.Environment;
import com.gs.dmn.feel.analysis.semantics.environment.EnvironmentFactory;
import com.gs.dmn.feel.analysis.semantics.environment.StandardEnvironmentFactory;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.literal.StringLiteral;
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

public class SimpleExpressionsToJavaVisitorDiffblueTest {
  @Test
  public void testVisit() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    EnvironmentFactory instanceResult = StandardEnvironmentFactory.instance();
    StandardNativeTypeFactory nativeTypeFactory = new StandardNativeTypeFactory();
    TreeMap<String, String> inputParameters = new TreeMap<String, String>();
    SimpleExpressionsToJavaVisitor simpleExpressionsToJavaVisitor = new SimpleExpressionsToJavaVisitor(
        new BasicDMN2JavaTransformer(dmnModelRepository, instanceResult, nativeTypeFactory,
            new NopLazyEvaluationDetector(), inputParameters));
    EnvironmentMemoizer environmentMemoizer = new EnvironmentMemoizer();
    TDecision tDecision = new TDecision();
    Environment environment = instanceResult.makeEnvironment(environmentMemoizer.get(tDecision), null);
    StringLiteral element = new StringLiteral("\"Approved\"");

    // Act and Assert
    assertEquals("\"Approved\"",
        simpleExpressionsToJavaVisitor.visit(element, FEELContext.makeContext(tDecision, environment)));
  }
}

