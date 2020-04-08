package com.gs.dmn.feel.analysis.syntax.ast.expression.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.semantics.FEELSemanticVisitor;
import com.gs.dmn.feel.analysis.semantics.type.AnyType;
import com.gs.dmn.feel.analysis.semantics.type.Type;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.type.NamedTypeExpression;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.HashMap;
import org.junit.Test;

public class FormalParameterDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    NamedTypeExpression namedTypeExpression = new NamedTypeExpression("qualifiedName");

    // Act
    FormalParameter actualFormalParameter = new FormalParameter("name", namedTypeExpression);

    // Assert
    assertSame(namedTypeExpression, actualFormalParameter.getTypeExpression());
    assertEquals("name", actualFormalParameter.getName());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    FormalParameter actualFormalParameter = new FormalParameter("name", new AnyType());

    // Assert
    assertEquals("FormalParameter(name, Any)", actualFormalParameter.toString());
    assertEquals("name", actualFormalParameter.getName());
  }

  @Test
  public void testSetType() {
    // Arrange
    AnyType anyType = new AnyType();
    FormalParameter formalParameter = new FormalParameter("name", anyType);

    // Act
    formalParameter.setType(anyType);

    // Assert
    assertEquals("FormalParameter(name, Any)", formalParameter.toString());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new FormalParameter("name", new AnyType())).equals(null));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new FormalParameter("name", new AnyType())).equals("o"));
  }

  @Test
  public void testAccept() {
    // Arrange
    FormalParameter formalParameter = new FormalParameter("name", new AnyType());
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertSame(formalParameter, formalParameter.accept(visitor, FEELContext.makeContext(null)));
  }

  @Test
  public void testAccept2() {
    // Arrange
    FormalParameter formalParameter = new FormalParameter("name", new AnyType());
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(formalParameter, formalParameter.accept(new CloneVisitor(), params));
  }

  @Test
  public void testAccept3() {
    // Arrange
    FormalParameter formalParameter = new FormalParameter("name", (Type) null);
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELSemanticVisitor visitor = new FEELSemanticVisitor(new BasicDMN2JavaTransformer(dmnModelRepository, null,
        feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act
    Object actualAcceptResult = formalParameter.accept(visitor, FEELContext.makeContext(null));

    // Assert
    assertSame(formalParameter, actualAcceptResult);
    assertEquals("FormalParameter(name, Any)", actualAcceptResult.toString());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("FormalParameter(name, Any)", (new FormalParameter("name", new AnyType())).toString());
  }
}

