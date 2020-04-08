package com.gs.dmn.runtime.interpreter;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import ch.qos.logback.classic.spi.TurboFilterList;
import ch.qos.logback.classic.turbo.DuplicateMessageFilter;
import com.google.common.util.concurrent.AtomicDouble;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.ContextType;
import com.gs.dmn.feel.lib.DefaultFEELLib;
import com.gs.dmn.feel.lib.FEELLib;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.runtime.Context;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.HashMap;
import net.sf.saxon.value.SaxonDuration;
import org.junit.Test;

public class StandardDMNInterpreterDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMN2JavaTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act
    StandardDMNInterpreter actualStandardDMNInterpreter = new StandardDMNInterpreter(basicDMN2JavaTransformer,
        new DefaultFEELLib());

    // Assert
    assertSame(basicDMN2JavaTransformer, actualStandardDMNInterpreter.getBasicDMNTransformer());
    FEELLib expectedFeelLib = actualStandardDMNInterpreter.feelLib;
    assertSame(expectedFeelLib, actualStandardDMNInterpreter.getFeelLib());
  }

  @Test
  public void testConvertResult() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    StandardDMNInterpreter standardDMNInterpreter = new StandardDMNInterpreter(basicDMNTransformer,
        new DefaultFEELLib());
    SaxonDuration value = new SaxonDuration(null);
    AnyType anyType = new AnyType();

    // Act
    Result actualConvertResultResult = standardDMNInterpreter.convertResult(new Result(value, anyType), anyType);

    // Assert
    assertSame(anyType, actualConvertResultResult.getType());
    assertNull(actualConvertResultResult.getValue());
  }

  @Test
  public void testConvertResult2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    StandardDMNInterpreter standardDMNInterpreter = new StandardDMNInterpreter(basicDMNTransformer,
        new DefaultFEELLib());
    TurboFilterList turboFilterList = new TurboFilterList();
    turboFilterList.add(new DuplicateMessageFilter());
    AnyType anyType = new AnyType();

    // Act
    Result actualConvertResultResult = standardDMNInterpreter.convertResult(new Result(turboFilterList, anyType),
        anyType);

    // Assert
    assertSame(anyType, actualConvertResultResult.getType());
    assertNull(actualConvertResultResult.getValue());
  }

  @Test
  public void testConvertResult3() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    StandardDMNInterpreter standardDMNInterpreter = new StandardDMNInterpreter(basicDMNTransformer,
        new DefaultFEELLib());
    Context value = new Context();
    AnyType anyType = new AnyType();

    // Act
    Result actualConvertResultResult = standardDMNInterpreter.convertResult(new Result(value, anyType), anyType);

    // Assert
    assertSame(anyType, actualConvertResultResult.getType());
    assertNull(actualConvertResultResult.getValue());
  }

  @Test
  public void testConvertResult4() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    StandardDMNInterpreter standardDMNInterpreter = new StandardDMNInterpreter(basicDMNTransformer,
        new DefaultFEELLib());

    // Act
    Result actualConvertResultResult = standardDMNInterpreter.convertResult(new Result("value", null), null);

    // Assert
    assertTrue(actualConvertResultResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue(actualConvertResultResult.getValue() instanceof String);
  }

  @Test
  public void testConvertResult5() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    StandardDMNInterpreter standardDMNInterpreter = new StandardDMNInterpreter(basicDMNTransformer,
        new DefaultFEELLib());
    AnyType anyType = new AnyType();

    // Act
    Result actualConvertResultResult = standardDMNInterpreter.convertResult(new Result(true, anyType), anyType);

    // Assert
    assertSame(anyType, actualConvertResultResult.getType());
    assertNull(actualConvertResultResult.getValue());
  }

  @Test
  public void testConvertResult6() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    StandardDMNInterpreter standardDMNInterpreter = new StandardDMNInterpreter(basicDMNTransformer,
        new DefaultFEELLib());
    AnyType anyType = new AnyType();

    // Act
    Result actualConvertResultResult = standardDMNInterpreter.convertResult(new Result("value", anyType), anyType);

    // Assert
    assertSame(anyType, actualConvertResultResult.getType());
    assertNull(actualConvertResultResult.getValue());
  }

  @Test
  public void testConvertResult7() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    StandardDMNInterpreter standardDMNInterpreter = new StandardDMNInterpreter(basicDMNTransformer,
        new DefaultFEELLib());
    AtomicDouble value = new AtomicDouble();
    AnyType anyType = new AnyType();

    // Act
    Result actualConvertResultResult = standardDMNInterpreter.convertResult(new Result(value, anyType), anyType);

    // Assert
    assertSame(anyType, actualConvertResultResult.getType());
    assertNull(actualConvertResultResult.getValue());
  }

  @Test
  public void testConvertResult8() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    StandardDMNInterpreter standardDMNInterpreter = new StandardDMNInterpreter(basicDMNTransformer,
        new DefaultFEELLib());
    ContextType contextType = new ContextType();

    // Act
    Result actualConvertResultResult = standardDMNInterpreter.convertResult(new Result("value", contextType),
        contextType);

    // Assert
    assertSame(contextType, actualConvertResultResult.getType());
    assertTrue(actualConvertResultResult.getValue() instanceof String);
  }

  @Test
  public void testConvertValue() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);
    StandardDMNInterpreter standardDMNInterpreter = new StandardDMNInterpreter(basicDMNTransformer,
        new DefaultFEELLib());
    AnyType anyType = new AnyType();

    // Act
    Result actualConvertValueResult = standardDMNInterpreter.convertValue("value", anyType);

    // Assert
    assertSame(anyType, actualConvertValueResult.getType());
    assertNull(actualConvertValueResult.getValue());
  }

  @Test
  public void testConvertValue2() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act
    Result actualConvertValueResult = (new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib()))
        .convertValue("value", null);

    // Assert
    assertTrue(actualConvertValueResult.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertTrue(actualConvertValueResult.getValue() instanceof String);
  }

  @Test
  public void testDagOptimisation() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    BasicDMN2JavaTransformer basicDMNTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap);

    // Act and Assert
    assertTrue((new StandardDMNInterpreter(basicDMNTransformer, new DefaultFEELLib())).dagOptimisation());
  }
}

