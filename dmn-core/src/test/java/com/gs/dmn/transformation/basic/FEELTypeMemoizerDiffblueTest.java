package com.gs.dmn.transformation.basic;

import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDefinitions;
import org.omg.spec.dmn._20180521.model.TItemDefinition;

public class FEELTypeMemoizerDiffblueTest {
  @Test
  public void testGet() {
    // Arrange
    TDefinitions tDefinitions = new TDefinitions();
    QualifiedName qName = QualifiedName.toQualifiedName(tDefinitions, "feel.string");

    // Act and Assert
    assertNull((new FEELTypeMemoizer()).get(tDefinitions, qName));
  }

  @Test
  public void testGet2() {
    // Arrange
    TDefinitions tDefinitions = new TDefinitions();
    QualifiedName qName = QualifiedName.toQualifiedName(tDefinitions, "feel.string");

    // Act and Assert
    assertNull((new FEELTypeMemoizer()).get(tDefinitions, qName));
  }

  @Test
  public void testGet3() {
    // Arrange
    TDefinitions tDefinitions = new TDefinitions();
    QualifiedName qName = QualifiedName.toQualifiedName(tDefinitions, "feel.string");

    // Act and Assert
    assertNull((new FEELTypeMemoizer()).get(tDefinitions, qName));
  }

  @Test
  public void testGet4() {
    // Arrange
    TItemDefinition itemDefinition = new TItemDefinition();

    // Act and Assert
    assertNull((new FEELTypeMemoizer()).get(itemDefinition));
  }

  @Test
  public void testGet5() {
    // Arrange
    TItemDefinition itemDefinition = new TItemDefinition();

    // Act and Assert
    assertNull((new FEELTypeMemoizer()).get(itemDefinition));
  }

  @Test
  public void testGet6() {
    // Arrange
    TItemDefinition itemDefinition = new TItemDefinition();

    // Act and Assert
    assertNull((new FEELTypeMemoizer()).get(itemDefinition));
  }
}

