package com.gs.dmn.tck;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.lib.DefaultFEELLib;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.HashMap;
import org.junit.Test;
import org.omg.dmn.tck.marshaller._20160719.TestCases;
import org.omg.dmn.tck.marshaller._20160719.ValueType;
import org.omg.spec.dmn._20180521.model.TDRGElement;
import org.omg.spec.dmn._20180521.model.TDecisionService;

public class TCKUtilDiffblueTest {
  @Test
  public void testAnnotationSetClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.annotation.AnnotationSet",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).annotationSetClassName());
  }

  @Test
  public void testAnnotationSetVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("annotationSet_", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).annotationSetVariableName());
  }

  @Test
  public void testAssertClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Assert", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).assertClassName());
  }

  @Test
  public void testCacheInterfaceName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.cache.Cache",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).cacheInterfaceName());
  }

  @Test
  public void testCacheVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("cache_", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).cacheVariableName());
  }

  @Test
  public void testConstructor() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertFalse((new TCKUtil(dmnTransformer, new DefaultFEELLib())).isCaching());
  }

  @Test
  public void testDefaultCacheClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.cache.DefaultCache",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).defaultCacheClassName());
  }

  @Test
  public void testDefaultEventListenerClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.NopEventListener",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).defaultEventListenerClassName());
  }

  @Test
  public void testDefaultExternalExecutorClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.external.DefaultExternalFuncti" + "onExecutor",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).defaultExternalExecutorClassName());
  }

  @Test
  public void testDrgElementArgumentsExtra() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("null, eventListener_, externalExecutor_",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).drgElementArgumentsExtra("null"));
  }

  @Test
  public void testDrgElementArgumentsExtraCache() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("null", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).drgElementArgumentsExtraCache("null"));
  }

  @Test
  public void testDrgElementDefaultArgumentsExtraCache() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("null",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).drgElementDefaultArgumentsExtraCache("null"));
  }

  @Test
  public void testDrgElementSignatureExtraCache() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("null", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).drgElementSignatureExtraCache("null"));
  }

  @Test
  public void testEventListenerClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.listener.EventListener",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).eventListenerClassName());
  }

  @Test
  public void testEventListenerVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("eventListener_", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).eventListenerVariableName());
  }

  @Test
  public void testExternalExecutorClassName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.external.ExternalFuncti" + "onExecutor",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).externalExecutorClassName());
  }

  @Test
  public void testExternalExecutorVariableName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("externalExecutor_",
        (new TCKUtil(dmnTransformer, new DefaultFEELLib())).externalExecutorVariableName());
  }

  @Test
  public void testGetter() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("getNull()", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).getter("null"));
  }

  @Test
  public void testIsCaching() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertFalse((new TCKUtil(dmnTransformer, new DefaultFEELLib())).isCaching());
  }

  @Test
  public void testIsCaching2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertFalse((new TCKUtil(dmnTransformer, new DefaultFEELLib())).isCaching("null"));
  }

  @Test
  public void testLowerCaseFirst() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("null", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).lowerCaseFirst("null"));
  }

  @Test
  public void testMakeArgs() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);
    TCKUtil tckUtil = new TCKUtil(dmnTransformer, new DefaultFEELLib());
    TDRGElement drgElement = new TDRGElement();

    // Act and Assert
    assertEquals(0, tckUtil.makeArgs(drgElement, new TestCases.TestCase()).size());
  }

  @Test
  public void testMakeArgs2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);
    TCKUtil tckUtil = new TCKUtil(dmnTransformer, new DefaultFEELLib());
    TDecisionService drgElement = new TDecisionService();

    // Act and Assert
    assertEquals(0, tckUtil.makeArgs(drgElement, new TestCases.TestCase()).size());
  }

  @Test
  public void testMakeEnvironment() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);
    TCKUtil tckUtil = new TCKUtil(dmnTransformer, new DefaultFEELLib());

    // Act and Assert
    assertNull(tckUtil.makeEnvironment(new TestCases.TestCase()).getParent());
  }

  @Test
  public void testMakeValue() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);
    TCKUtil tckUtil = new TCKUtil(dmnTransformer, new DefaultFEELLib());

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Context@0", tckUtil.makeValue(new ValueType()).toString());
  }

  @Test
  public void testMakeValue2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);
    TCKUtil tckUtil = new TCKUtil(dmnTransformer, new DefaultFEELLib());

    // Act and Assert
    assertEquals("com.gs.dmn.runtime.Context@0", tckUtil.makeValue(new ValueType(), null).toString());
  }

  @Test
  public void testQualifiedName() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("null.foo", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).qualifiedName("null", "foo"));
  }

  @Test
  public void testUpperCaseFirst() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertEquals("Null", (new TCKUtil(dmnTransformer, new DefaultFEELLib())).upperCaseFirst("null"));
  }
}

