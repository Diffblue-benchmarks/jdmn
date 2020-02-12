package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.lib.DefaultFEELLib;
import com.gs.dmn.feel.lib.FEELLib;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.runtime.DMNRuntimeException;
import com.gs.dmn.runtime.annotation.DRGElementKind;
import com.gs.dmn.runtime.annotation.ExpressionKind;
import com.gs.dmn.runtime.annotation.HitPolicy;
import com.gs.dmn.runtime.interpreter.environment.RuntimeEnvironment;
import com.gs.dmn.runtime.listener.DRGElement;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.omg.spec.dmn._20180521.model.TDRGElement;
import org.omg.spec.dmn._20180521.model.TExpression;

public class StandardDMNInterpreterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void handleErrorTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib())).handleError("message");
  }

  @Test(timeout=10000)
  public void dagOptimisationTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertTrue((new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib())).dagOptimisation());
  }

  @Test(timeout=10000)
  public void getBasicDMNTransformerTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertSame(basicDMN2JavaTransformer,
        (new StandardDMNInterpreter(basicDMN2JavaTransformer, new DefaultFEELLib())).getBasicDMNTransformer());
  }

  @Test(timeout=10000)
  public void convertValueTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    StandardDMNInterpreter standardDMNInterpreter = new StandardDMNInterpreter(basicDMNTransformer,
        new DefaultFEELLib());
    AnyType anyType = new AnyType();

    // Act
    Result actualConvertValueResult = standardDMNInterpreter.convertValue("value", anyType);

    // Assert
    Type actualType = actualConvertValueResult.getType();
    assertSame(anyType, actualType);
    assertNull(actualConvertValueResult.getValue());
  }

  @Test(timeout=10000)
  public void convertResultTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    StandardDMNInterpreter standardDMNInterpreter = new StandardDMNInterpreter(basicDMNTransformer,
        new DefaultFEELLib());
    Result result = new Result("value", new AnyType());
    AnyType anyType = new AnyType();

    // Act
    Result actualConvertResultResult = standardDMNInterpreter.convertResult(result, anyType);

    // Assert
    Type actualType = actualConvertResultResult.getType();
    assertSame(anyType, actualType);
    assertNull(actualConvertResultResult.getValue());
  }

  @Test(timeout=10000)
  public void evaluateExpressionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    StandardDMNInterpreter standardDMNInterpreter = new StandardDMNInterpreter(basicDMNTransformer,
        new DefaultFEELLib());
    TExpression expression = new TExpression();
    TDRGElement element = new TDRGElement();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    standardDMNInterpreter.evaluateExpression(expression, null, null, element, new DRGElement("foo", "name", "foo",
        DRGElementKind.DECISION, ExpressionKind.FUNCTION_DEFINITION, HitPolicy.UNIQUE, 3));
  }

  @Test(timeout=10000)
  public void evaluateInvocationTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    StandardDMNInterpreter standardDMNInterpreter = new StandardDMNInterpreter(basicDMNTransformer,
        new DefaultFEELLib());
    ImportPath importPath = new ImportPath("foo");
    TDRGElement drgElement = new TDRGElement();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    standardDMNInterpreter.evaluateInvocation(importPath, drgElement, null, FEELContext.makeContext(null));
  }

  @Test(timeout=10000)
  public void getFeelLibTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    DefaultFEELLib defaultFEELLib = new DefaultFEELLib();

    // Act and Assert
    assertSame(defaultFEELLib, (new StandardDMNInterpreter(basicDMNTransformer, defaultFEELLib)).getFeelLib());
  }

  @Test(timeout=10000)
  public void handleErrorTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    (new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib())).handleError("message", null);
  }

  @Test(timeout=10000)
  public void evaluateTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    StandardDMNInterpreter standardDMNInterpreter = new StandardDMNInterpreter(basicDMNTransformer,
        new DefaultFEELLib());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    standardDMNInterpreter.evaluate(new ImportPath("foo"), "name", null);
  }

  @Test(timeout=10000)
  public void evaluateInvocationTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    StandardDMNInterpreter standardDMNInterpreter = new StandardDMNInterpreter(basicDMNTransformer,
        new DefaultFEELLib());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    standardDMNInterpreter.evaluateInvocation(new ImportPath("foo"), "name", null, (RuntimeEnvironment) null);
  }

  @Test(timeout=10000)
  public void makeDRGElementAnnotationTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);
    StandardDMNInterpreter standardDMNInterpreter = new StandardDMNInterpreter(basicDMNTransformer,
        new DefaultFEELLib());

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    standardDMNInterpreter.makeDRGElementAnnotation(new TDRGElement(), null);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, new NopLazyEvaluationDetector(), null);

    // Act
    StandardDMNInterpreter actualStandardDMNInterpreter = new StandardDMNInterpreter(basicDMN2JavaTransformer,
        new DefaultFEELLib());

    // Assert
    FEELLib expectedFeelLib = actualStandardDMNInterpreter.feelLib;
    BasicDMN2JavaTransformer actualBasicDMNTransformer = actualStandardDMNInterpreter.getBasicDMNTransformer();
    assertSame(basicDMN2JavaTransformer, actualBasicDMNTransformer);
    assertSame(expectedFeelLib, actualStandardDMNInterpreter.getFeelLib());
  }
}

