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

  @Test
  public void constructorTest() {
    // Arrange and Act
    QualifiedName actualQualifiedName = new QualifiedName("namespace", "localPart");

    // Assert
    assertEquals("namespace", actualQualifiedName.getNamespace());
    assertEquals("localPart", actualQualifiedName.getLocalPart());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    QualifiedName actualQualifiedName = new QualifiedName("name");

    // Assert
    assertNull(actualQualifiedName.getNamespace());
    assertEquals("name", actualQualifiedName.getLocalPart());
  }

  @Test
  public void toQualifiedNameTest() {
    // Arrange and Act
    QualifiedName actualToQualifiedNameResult = QualifiedName.toQualifiedName(new QName("localPart"));

    // Assert
    assertEquals("", actualToQualifiedNameResult.getNamespace());
    assertEquals("localPart", actualToQualifiedNameResult.getLocalPart());
  }

  @Test
  public void toQualifiedNameTest2() {
    // Arrange and Act
    QualifiedName actualToQualifiedNameResult = QualifiedName.toQualifiedName("qName");

    // Assert
    assertNull(actualToQualifiedNameResult.getNamespace());
    assertEquals("qName", actualToQualifiedNameResult.getLocalPart());
  }

  @Test
  public void toQualifiedNameTest3() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    QualifiedName.toQualifiedName("");
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("QualifiedName(null, name)", (new QualifiedName("name")).toString());
  }
}

