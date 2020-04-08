package com.gs.dmn.runtime.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import javax.tools.JavaFileObject;
import org.junit.Test;

public class JavaSourceFromStringDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    JavaSourceFromString actualJavaSourceFromString = new JavaSourceFromString("name", "code");

    // Assert
    assertNull(actualJavaSourceFromString.getAccessLevel());
    assertNull(actualJavaSourceFromString.getNestingKind());
    assertEquals("/name.java", actualJavaSourceFromString.getName());
    assertEquals("com.gs.dmn.runtime.compiler.JavaSourceFromString" + "[string:///name.java]",
        actualJavaSourceFromString.toString());
    assertEquals(JavaFileObject.Kind.SOURCE, actualJavaSourceFromString.getKind());
    assertEquals(0L, actualJavaSourceFromString.getLastModified());
  }
}

