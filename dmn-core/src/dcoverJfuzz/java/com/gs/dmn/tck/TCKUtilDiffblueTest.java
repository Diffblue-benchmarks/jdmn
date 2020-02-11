package com.gs.dmn.tck;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.lib.DefaultFEELLib;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.runtime.DMNRuntimeException;
import com.gs.dmn.runtime.interpreter.StandardDMNInterpreter;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.omg.dmn.tck.marshaller._20160719.TestCases;
import org.omg.dmn.tck.marshaller._20160719.ValueType;
import org.omg.spec.dmn._20180521.model.TDRGElement;

public class TCKUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void qualifiedNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("foo.foo", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).qualifiedName("foo", "foo"));
  }

  @Test(timeout=10000)
  public void evaluateTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);
    TCKUtil tckUtil = new TCKUtil(dmnTransformer, new DefaultFEELLib());
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository1, null,
        feelTypeTranslator1, new NopLazyEvaluationDetector(), null);
    StandardDMNInterpreter interpreter = new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib());
    TestCases.TestCase testCase = new TestCases.TestCase();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    tckUtil.evaluate(interpreter, testCase, new TestCases.TestCase.ResultNode());
  }

  @Test(timeout=10000)
  public void drgElementArgumentsExtraCacheTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("foo", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).drgElementArgumentsExtraCache("foo"));
  }

  @Test(timeout=10000)
  public void annotationSetClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).annotationSetClassName());
  }

  @Test(timeout=10000)
  public void upperCaseFirstTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("Name", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).upperCaseFirst("name"));
  }

  @Test(timeout=10000)
  public void drgElementArgumentsExtraTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("foo, eventListener_, externalExecutor_",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).drgElementArgumentsExtra("foo"));
  }

  @Test(timeout=10000)
  public void assertClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Assert", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).assertClassName());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertFalse((new TCKUtil(dmnTransformer, new DefaultFEELLib())).isCaching());
  }

  @Test(timeout=10000)
  public void defaultEventListenerClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.NopEventListener",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).defaultEventListenerClassName());
  }

  @Test(timeout=10000)
  public void defaultExternalExecutorClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.external.DefaultExternalFuncti" + "onExecutor",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).defaultExternalExecutorClassName());
  }

  @Test(timeout=10000)
  public void toJavaTypeTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);
    TCKUtil tckUtil = new TCKUtil(dmnTransformer, new DefaultFEELLib());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    tckUtil.toJavaType(new TestCases.TestCase.InputNode());
  }

  @Test(timeout=10000)
  public void cacheInterfaceNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.cache.Cache",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).cacheInterfaceName());
  }

  @Test(timeout=10000)
  public void cacheVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("cache_", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).cacheVariableName());
  }

  @Test(timeout=10000)
  public void inputDataVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);
    TCKUtil tckUtil = new TCKUtil(dmnTransformer, new DefaultFEELLib());

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    tckUtil.inputDataVariableName(new TestCases.TestCase.InputNode());
  }

  @Test(timeout=10000)
  public void eventListenerVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("eventListener_", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).eventListenerVariableName());
  }

  @Test(timeout=10000)
  public void makeValueTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);
    TCKUtil tckUtil = new TCKUtil(dmnTransformer, new DefaultFEELLib());
    ValueType valueType = new ValueType();

    // Act and Assert
    thrown.expect(ClassCastException.class);
    tckUtil.makeValue(valueType, new AnyType());
  }

  @Test(timeout=10000)
  public void defaultCacheClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.cache.DefaultCache",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).defaultCacheClassName());
  }

  @Test(timeout=10000)
  public void makeArgsTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);
    TCKUtil tckUtil = new TCKUtil(dmnTransformer, new DefaultFEELLib());
    TDRGElement drgElement = new TDRGElement();

    // Act and Assert
    assertEquals(0, tckUtil.makeArgs(drgElement, new TestCases.TestCase()).size());
  }

  @Test(timeout=10000)
  public void isCachingTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertFalse((new TCKUtil(dmnTransformer, new DefaultFEELLib())).isCaching("foo"));
  }

  @Test(timeout=10000)
  public void drgElementDefaultArgumentsExtraCacheTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("foo",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).drgElementDefaultArgumentsExtraCache("foo"));
  }

  @Test(timeout=10000)
  public void externalExecutorClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.external.ExternalFuncti" + "onExecutor",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).externalExecutorClassName());
  }

  @Test(timeout=10000)
  public void getterTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("getName()", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).getter("name"));
  }

  @Test(timeout=10000)
  public void makeEnvironmentTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);
    TCKUtil tckUtil = new TCKUtil(dmnTransformer, new DefaultFEELLib());

    // Act and Assert
    assertNull(tckUtil.makeEnvironment(new TestCases.TestCase()).getParent());
  }

  @Test(timeout=10000)
  public void lowerCaseFirstTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("name", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).lowerCaseFirst("name"));
  }

  @Test(timeout=10000)
  public void toJavaExpressionTest2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);
    TCKUtil tckUtil = new TCKUtil(dmnTransformer, new DefaultFEELLib());
    TestCases testCases = new TestCases();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    tckUtil.toJavaExpression(testCases, new TestCases.TestCase.ResultNode());
  }

  @Test(timeout=10000)
  public void toJavaExpressionTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);
    TCKUtil tckUtil = new TCKUtil(dmnTransformer, new DefaultFEELLib());
    TestCases testCases = new TestCases();
    TestCases.TestCase testCase = new TestCases.TestCase();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    tckUtil.toJavaExpression(testCases, testCase, new TestCases.TestCase.InputNode());
  }

  @Test(timeout=10000)
  public void makeValueTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);
    TCKUtil tckUtil = new TCKUtil(dmnTransformer, new DefaultFEELLib());

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Context@0", tckUtil.makeValue(new ValueType()).toString());
  }

  @Test(timeout=10000)
  public void isCachingTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertFalse((new TCKUtil(dmnTransformer, new DefaultFEELLib())).isCaching());
  }

  @Test(timeout=10000)
  public void eventListenerClassNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.EventListener",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).eventListenerClassName());
  }

  @Test(timeout=10000)
  public void drgElementSignatureExtraCacheTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("foo", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).drgElementSignatureExtraCache("foo"));
  }

  @Test(timeout=10000)
  public void annotationSetVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("annotationSet_", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).annotationSetVariableName());
  }

  @Test(timeout=10000)
  public void externalExecutorVariableNameTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);

    // Act and Assert
    assertEquals("externalExecutor_",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).externalExecutorVariableName());
  }
}

