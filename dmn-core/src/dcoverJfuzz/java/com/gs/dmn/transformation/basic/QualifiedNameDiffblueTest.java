package com.gs.dmn.transformation.basic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import javax.xml.namespace.QName;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class QualifiedNameDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void getLocalPartTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new QualifiedName("name")).getLocalPart());
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new QualifiedName("");
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    QualifiedName actualQualifiedName = new QualifiedName("name");

    // Assert
    String actualNamespace = actualQualifiedName.getNamespace();
    assertNull(actualNamespace);
    assertEquals("name", actualQualifiedName.getLocalPart());
  }

  @Test(timeout=10000)
  public void toQualifiedNameTest2() {
    // Arrange and Act
    QualifiedName actualToQualifiedNameResult = QualifiedName.toQualifiedName("name");

    // Assert
    String actualNamespace = actualToQualifiedNameResult.getNamespace();
    assertNull(actualNamespace);
    assertEquals("name", actualToQualifiedNameResult.getLocalPart());
  }

  @Test(timeout=10000)
  public void toQualifiedNameTest() {
    // Arrange, Act and Assert
    assertNull(QualifiedName.toQualifiedName((QName) null));
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("QualifiedName(null, name)", (new QualifiedName("name")).toString());
  }

  @Test(timeout=10000)
  public void getNamespaceTest() {
    // Arrange, Act and Assert
    assertNull((new QualifiedName("name")).getNamespace());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    QualifiedName actualQualifiedName = new QualifiedName("foo", "foo");

    // Assert
    String actualNamespace = actualQualifiedName.getNamespace();
    assertEquals("foo", actualNamespace);
    assertEquals("foo", actualQualifiedName.getLocalPart());
  }
}

