package com.gs.dmn.transformation.basic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import javax.xml.namespace.QName;
import org.junit.Test;

public class QualifiedNameDiffblueTest {
  @Test
  public void testToQualifiedName() {
    // Arrange, Act and Assert
    assertNull(QualifiedName.toQualifiedName((QName) null));
  }

  @Test
  public void testToQualifiedName2() {
    // Arrange and Act
    QualifiedName actualToQualifiedNameResult = QualifiedName.toQualifiedName(new QName("localPart"));

    // Assert
    assertEquals("", actualToQualifiedNameResult.getNamespace());
    assertEquals("localPart", actualToQualifiedNameResult.getLocalPart());
  }

  @Test
  public void testToQualifiedName3() {
    // Arrange, Act and Assert
    assertNull(QualifiedName.toQualifiedName((String) null));
  }

  @Test
  public void testToQualifiedName4() {
    // Arrange and Act
    QualifiedName actualToQualifiedNameResult = QualifiedName.toQualifiedName("qName");

    // Assert
    assertNull(actualToQualifiedNameResult.getNamespace());
    assertEquals("qName", actualToQualifiedNameResult.getLocalPart());
  }

  @Test
  public void testToQualifiedName5() {
    // Arrange and Act
    QualifiedName actualToQualifiedNameResult = QualifiedName.toQualifiedName("PPPPPPPPPPPPPPPPPPP.");

    // Assert
    assertEquals("PPPPPPPPPPPPPPPPPPP", actualToQualifiedNameResult.getNamespace());
    assertEquals("", actualToQualifiedNameResult.getLocalPart());
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    QualifiedName actualQualifiedName = new QualifiedName("namespace", "localPart");

    // Assert
    assertEquals("namespace", actualQualifiedName.getNamespace());
    assertEquals("localPart", actualQualifiedName.getLocalPart());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    QualifiedName actualQualifiedName = new QualifiedName("name");

    // Assert
    assertNull(actualQualifiedName.getNamespace());
    assertEquals("name", actualQualifiedName.getLocalPart());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    QualifiedName actualQualifiedName = new QualifiedName("uuuuuuuuuuuuuuuuuu.s");

    // Assert
    assertEquals("uuuuuuuuuuuuuuuuuu", actualQualifiedName.getNamespace());
    assertEquals("s", actualQualifiedName.getLocalPart());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("QualifiedName(null, name)", (new QualifiedName("name")).toString());
  }
}

