package com.gs.dmn.serialization;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DMNNamespacePrefixMapperDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    DMNNamespacePrefixMapper actualDmnNamespacePrefixMapper = new DMNNamespacePrefixMapper("namespace", "prefix");

    // Assert
    assertEquals("prefix", actualDmnNamespacePrefixMapper.getUserPrefix());
    assertEquals("namespace", actualDmnNamespacePrefixMapper.getUserNamespace());
    assertEquals(7, actualDmnNamespacePrefixMapper.getPreDeclaredNamespaceUris().length);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    DMNNamespacePrefixMapper actualDmnNamespacePrefixMapper = new DMNNamespacePrefixMapper("namespace", "");

    // Assert
    assertEquals("", actualDmnNamespacePrefixMapper.getUserPrefix());
    assertEquals("namespace", actualDmnNamespacePrefixMapper.getUserNamespace());
    assertEquals(6, actualDmnNamespacePrefixMapper.getPreDeclaredNamespaceUris().length);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    DMNNamespacePrefixMapper actualDmnNamespacePrefixMapper = new DMNNamespacePrefixMapper("", "prefix");

    // Assert
    assertEquals("prefix", actualDmnNamespacePrefixMapper.getUserPrefix());
    assertEquals("", actualDmnNamespacePrefixMapper.getUserNamespace());
    assertEquals(6, actualDmnNamespacePrefixMapper.getPreDeclaredNamespaceUris().length);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    DMNNamespacePrefixMapper actualDmnNamespacePrefixMapper = new DMNNamespacePrefixMapper("namespace", "prefix",
        DMNVersion.fromVersion("1.1"));

    // Assert
    assertEquals("prefix", actualDmnNamespacePrefixMapper.getUserPrefix());
    assertEquals("namespace", actualDmnNamespacePrefixMapper.getUserNamespace());
    assertEquals(3, actualDmnNamespacePrefixMapper.getPreDeclaredNamespaceUris().length);
  }

  @Test
  public void constructorTest5() {
    // Arrange and Act
    DMNNamespacePrefixMapper actualDmnNamespacePrefixMapper = new DMNNamespacePrefixMapper();

    // Assert
    assertNull(actualDmnNamespacePrefixMapper.getUserPrefix());
    assertNull(actualDmnNamespacePrefixMapper.getUserNamespace());
    assertEquals(6, actualDmnNamespacePrefixMapper.getPreDeclaredNamespaceUris().length);
  }

  @Test
  public void getPreDeclaredNamespaceUrisTest() {
    // Arrange, Act and Assert
    assertEquals(6, (new DMNNamespacePrefixMapper()).getPreDeclaredNamespaceUris().length);
  }

  @Test
  public void getPreferredPrefixTest() {
    // Arrange, Act and Assert
    assertEquals("suggestion", (new DMNNamespacePrefixMapper()).getPreferredPrefix("namespaceUri", "suggestion", true));
  }
}

