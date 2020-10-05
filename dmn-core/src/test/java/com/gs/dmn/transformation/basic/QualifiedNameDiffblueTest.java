package com.gs.dmn.transformation.basic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDefinitions;

public class QualifiedNameDiffblueTest {
  @Test
  public void testToQualifiedName() {
    // Arrange and Act
    QualifiedName actualToQualifiedNameResult = QualifiedName.toQualifiedName(new TDefinitions(), "feel.string");

    // Assert
    assertEquals("feel", actualToQualifiedNameResult.getNamespace());
    assertEquals("string", actualToQualifiedNameResult.getLocalPart());
  }

  @Test
  public void testToQualifiedName2() {
    // Arrange and Act
    QualifiedName actualToQualifiedNameResult = QualifiedName.toQualifiedName(new TDefinitions(), "feel.string");

    // Assert
    assertEquals("feel", actualToQualifiedNameResult.getNamespace());
    assertEquals("string", actualToQualifiedNameResult.getLocalPart());
  }

  @Test
  public void testToQualifiedName3() {
    // Arrange and Act
    QualifiedName actualToQualifiedNameResult = QualifiedName.toQualifiedName(new TDefinitions(), "feel.string");

    // Assert
    assertEquals("feel", actualToQualifiedNameResult.getNamespace());
    assertEquals("string", actualToQualifiedNameResult.getLocalPart());
  }
}

