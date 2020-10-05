package com.gs.dmn.transformation;

import static org.junit.Assert.assertSame;
import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.runtime.Pair;
import com.gs.dmn.serialization.PrefixNamespaceMappings;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDefinitions;

public class CompositeDMNTransformerDiffblueTest {
  @Test
  public void testTransform() {
    // Arrange
    CompositeDMNTransformer<Object> compositeDMNTransformer = new CompositeDMNTransformer<Object>(
        new ArrayList<DMNTransformer<Object>>());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertSame(dmnModelRepository, compositeDMNTransformer.transform(dmnModelRepository));
  }

  @Test
  public void testTransform2() {
    // Arrange
    CompositeDMNTransformer<Object> compositeDMNTransformer = new CompositeDMNTransformer<Object>(
        new ArrayList<DMNTransformer<Object>>());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertSame(dmnModelRepository, compositeDMNTransformer.transform(dmnModelRepository));
  }

  @Test
  public void testTransform3() {
    // Arrange
    CompositeDMNTransformer<Object> compositeDMNTransformer = new CompositeDMNTransformer<Object>(
        new ArrayList<DMNTransformer<Object>>());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());

    // Act and Assert
    assertSame(dmnModelRepository, compositeDMNTransformer.transform(dmnModelRepository));
  }

  @Test
  public void testTransform4() {
    // Arrange
    CompositeDMNTransformer<Object> compositeDMNTransformer = new CompositeDMNTransformer<Object>(
        new ArrayList<DMNTransformer<Object>>());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    ArrayList<Object> objectList = new ArrayList<Object>();

    // Act
    Pair<DMNModelRepository, List<Object>> actualTransformResult = compositeDMNTransformer.transform(dmnModelRepository,
        objectList);

    // Assert
    assertSame(objectList, actualTransformResult.getRight());
    assertSame(dmnModelRepository, actualTransformResult.getLeft());
  }

  @Test
  public void testTransform5() {
    // Arrange
    CompositeDMNTransformer<Object> compositeDMNTransformer = new CompositeDMNTransformer<Object>(
        new ArrayList<DMNTransformer<Object>>());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    ArrayList<Object> objectList = new ArrayList<Object>();

    // Act
    Pair<DMNModelRepository, List<Object>> actualTransformResult = compositeDMNTransformer.transform(dmnModelRepository,
        objectList);

    // Assert
    assertSame(objectList, actualTransformResult.getRight());
    assertSame(dmnModelRepository, actualTransformResult.getLeft());
  }

  @Test
  public void testTransform6() {
    // Arrange
    CompositeDMNTransformer<Object> compositeDMNTransformer = new CompositeDMNTransformer<Object>(
        new ArrayList<DMNTransformer<Object>>());
    DMNModelRepository dmnModelRepository = new DMNModelRepository(
        new ArrayList<Pair<TDefinitions, PrefixNamespaceMappings>>());
    ArrayList<Object> objectList = new ArrayList<Object>();

    // Act
    Pair<DMNModelRepository, List<Object>> actualTransformResult = compositeDMNTransformer.transform(dmnModelRepository,
        objectList);

    // Assert
    assertSame(objectList, actualTransformResult.getRight());
    assertSame(dmnModelRepository, actualTransformResult.getLeft());
  }
}

