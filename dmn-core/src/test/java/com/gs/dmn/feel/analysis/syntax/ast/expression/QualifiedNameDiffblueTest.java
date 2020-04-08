package com.gs.dmn.feel.analysis.syntax.ast.expression;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.syntax.ast.CloneVisitor;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.NopVisitor;
import com.gs.dmn.feel.synthesis.FEELToJavaForInterpreterVisitor;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class QualifiedNameDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    QualifiedName actualQualifiedName = new QualifiedName(stringList);

    // Assert
    assertEquals("foo", actualQualifiedName.getQualifiedName());
    assertTrue(actualQualifiedName.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    QualifiedName actualQualifiedName = new QualifiedName(null);

    // Assert
    assertEquals("", actualQualifiedName.getQualifiedName());
    assertTrue(actualQualifiedName.getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
  }

  @Test
  public void testGetQualifiedName() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act and Assert
    assertEquals("foo", (new QualifiedName(stringList)).getQualifiedName());
  }

  @Test
  public void testGetName() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act and Assert
    assertEquals("foo", (new QualifiedName(stringList)).getName());
  }

  @Test
  public void testAccept() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    QualifiedName qualifiedName = new QualifiedName(stringList);
    FEELContext params = FEELContext.makeContext(null);

    // Act
    Object actualAcceptResult = qualifiedName.accept(new CloneVisitor(), params);

    // Assert
    assertTrue(((Name) actualAcceptResult).getType() instanceof com.gs.dmn.feel.analysis.semantics.type.AnyType);
    assertEquals("Name(foo)", actualAcceptResult.toString());
  }

  @Test
  public void testAccept2() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    QualifiedName qualifiedName = new QualifiedName(stringList);
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    NopLazyEvaluationDetector lazyEvaluationDetector = new NopLazyEvaluationDetector();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    FEELToJavaForInterpreterVisitor visitor = new FEELToJavaForInterpreterVisitor(new BasicDMN2JavaTransformer(
        dmnModelRepository, null, feelTypeTranslator, lazyEvaluationDetector, stringStringMap));

    // Act and Assert
    assertEquals("foo", qualifiedName.accept(visitor, FEELContext.makeContext(null)));
  }

  @Test
  public void testAccept3() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    QualifiedName qualifiedName = new QualifiedName(stringList);
    FEELContext params = FEELContext.makeContext(null);

    // Act and Assert
    assertSame(qualifiedName, qualifiedName.accept(new NopVisitor(), params));
  }

  @Test
  public void testToString() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act and Assert
    assertEquals("QualifiedName(foo, 1)", (new QualifiedName(stringList)).toString());
  }
}

