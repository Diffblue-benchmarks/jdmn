package com.gs.dmn.serialization;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class DMNNamespacePrefixMapperDiffblueTest {
  @Test(timeout=10000)
  public void getPreferredPrefixTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new DMNNamespacePrefixMapper()).getPreferredPrefix("foo", "foo", true));
  }

  @Test(timeout=10000)
  public void getVersionTest() {
    // Arrange and Act
    DMNVersion actualVersion = (new DMNNamespacePrefixMapper()).getVersion();

    // Assert
    assertSame(actualVersion.DMN_12, actualVersion);
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    DMNNamespacePrefixMapper actualDmnNamespacePrefixMapper = new DMNNamespacePrefixMapper();

    // Assert
    String actualUserPrefix = actualDmnNamespacePrefixMapper.getUserPrefix();
    String[] preDeclaredNamespaceUris = actualDmnNamespacePrefixMapper.getPreDeclaredNamespaceUris();
    assertNull(actualUserPrefix);
    assertNull(actualDmnNamespacePrefixMapper.getUserNamespace());
    assertEquals(6, preDeclaredNamespaceUris.length);
  }

  @Test(timeout=10000)
  public void getUserNamespaceTest() {
    // Arrange, Act and Assert
    assertNull((new DMNNamespacePrefixMapper()).getUserNamespace());
  }

  @Test(timeout=10000)
  public void getPreDeclaredNamespaceUrisTest() {
    // Arrange, Act and Assert
    assertEquals(6, (new DMNNamespacePrefixMapper()).getPreDeclaredNamespaceUris().length);
  }

  @Test(timeout=10000)
  public void getUserPrefixTest() {
    // Arrange, Act and Assert
    assertNull((new DMNNamespacePrefixMapper()).getUserPrefix());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    DMNNamespacePrefixMapper actualDmnNamespacePrefixMapper = new DMNNamespacePrefixMapper("foo", "foo");

    // Assert
    String actualUserPrefix = actualDmnNamespacePrefixMapper.getUserPrefix();
    String[] preDeclaredNamespaceUris = actualDmnNamespacePrefixMapper.getPreDeclaredNamespaceUris();
    assertEquals("foo", actualUserPrefix);
    assertEquals("foo", actualDmnNamespacePrefixMapper.getUserNamespace());
    assertEquals(7, preDeclaredNamespaceUris.length);
  }
}

