package com.gs.dmn.feel.analysis.syntax.ast.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.HashMap;
import org.junit.Test;

public class NullTestDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new NullTest()).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testDeriveType() {
    // Arrange
    NullTest nullTest = new NullTest();

    // Act
    nullTest.deriveType(null);

    // Assert
    assertTrue(nullTest.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void testAccept() {
    // Arrange
    NullTest nullTest = new NullTest();
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(nullTest, nullTest.accept(visitor, FEELContext.makeContext(null)));
    assertTrue(((NullTest) nullTest.accept(visitor, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void testAccept2() {
    // Arrange
    NullTest nullTest = new NullTest();
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(nullTest, nullTest.accept(new CloneVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("NullTest()", (new NullTest()).toString());
  }
}

