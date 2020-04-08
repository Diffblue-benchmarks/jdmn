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

public class AnyDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new Any()).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testDeriveType() {
    // Arrange
    Any any = new Any();

    // Act
    any.deriveType(null);

    // Assert
    assertTrue(any.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void testAccept() {
    // Arrange
    Any any = new Any();
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(any, any.accept(new CloneVisitor(), params));
  }

  @Test
  public void testAccept2() {
    // Arrange
    Any any = new Any();
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(any, any.accept(visitor, FEELContext.makeContext(null)));
    assertTrue(((Any) any.accept(visitor, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.BooleanType);
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("Any()", (new Any()).toString());
  }
}

