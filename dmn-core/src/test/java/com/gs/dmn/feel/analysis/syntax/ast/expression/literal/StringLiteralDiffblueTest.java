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

public class StringLiteralDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    StringLiteral actualStringLiteral = new StringLiteral("value");

    // Assert
    assertTrue(actualStringLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", actualStringLiteral.getLexeme());
  }

  @Test
  public void testDeriveType() {
    // Arrange
    StringLiteral stringLiteral = new StringLiteral("value");

    // Act
    stringLiteral.deriveType(null);

    // Assert
    assertTrue(stringLiteral.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
  }

  @Test
  public void testAccept() {
    // Arrange
    StringLiteral stringLiteral = new StringLiteral("value");
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(stringLiteral, stringLiteral.accept(visitor, FEELContext.makeContext(null)));
    assertTrue(((StringLiteral) stringLiteral.accept(visitor, FEELContext.makeContext(null)))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.StringType);
  }

  @Test
  public void testAccept2() {
    // Arrange
    StringLiteral stringLiteral = new StringLiteral("value");
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertTrue(((StringLiteral) stringLiteral.accept(new CloneVisitor(), params))
        .getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("value", ((StringLiteral) stringLiteral.accept(new CloneVisitor(), params)).getLexeme());
  }

  @Test
  public void testAccept3() {
    // Arrange
    StringLiteral stringLiteral = new StringLiteral("value");
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(stringLiteral, stringLiteral.accept(new NopVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("StringLiteral(value)", (new StringLiteral("value")).toString());
  }
}

