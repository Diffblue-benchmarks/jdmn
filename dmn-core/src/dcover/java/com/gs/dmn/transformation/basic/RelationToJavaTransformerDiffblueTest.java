package com.gs.dmn.transformation.basic;

import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.runtime.DMNRuntimeException;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.omg.spec.dmn._20180521.model.TDRGElement;
import org.omg.spec.dmn._20180521.model.TRelation;

public class RelationToJavaTransformerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void relationExpressionToJavaTest() {
    // Arrange
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    RelationToJavaTransformer relationToJavaTransformer = new RelationToJavaTransformer(new BasicDMN2JavaTransformer(
        dmnModelRepository, null, feelTypeTranslator, new NopLazyEvaluationDetector(), null));
    TRelation relation = new TRelation();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    relationToJavaTransformer.relationExpressionToJava(relation, null, new TDRGElement());
  }
}

