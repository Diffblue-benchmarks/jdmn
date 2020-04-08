package com.gs.dmn.feel.analysis.syntax.ast.expression.literal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.HashMap;
import org.junit.Test;

public class NullLiteralDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new NullLiteral()).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testDeriveType() {
    // Arrange
    NullLiteral nullLiteral = new NullLiteral();

    // Act
    nullLiteral.deriveType(null);

    // Assert
    assertTrue(nullLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }

  @Test
  public void testAccept() {
    // Arrange
    NullLiteral nullLiteral = new NullLiteral();
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertTrue(((NullLiteral) nullLiteral.accept(new CloneVisitor(), params))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testAccept2() {
    // Arrange
    NullLiteral nullLiteral = new NullLiteral();
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(nullLiteral, nullLiteral.accept(visitor, FEELContext.makeContext(null)));
    assertTrue(((NullLiteral) nullLiteral.accept(visitor, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.NullType);
  }

  @Test
  public void testAccept3() {
    // Arrange
    NullLiteral nullLiteral = new NullLiteral();
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(nullLiteral, nullLiteral.accept(new NopVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("NullLiteral()", (new NullLiteral()).toString());
  }
}

