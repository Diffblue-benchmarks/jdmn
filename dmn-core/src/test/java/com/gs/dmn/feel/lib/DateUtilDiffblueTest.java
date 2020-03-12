package com.gs.dmn.feel.lib;

import static org.junit.Assert.assertTrue;
import java.time.temporal.TemporalAccessor;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DateUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void dateTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    DateUtil.date(null, null, null);
  }
  @Test
  public void dateTest2() {
    // Arrange, Act and Assert
    assertTrue(DateUtil.date(new Integer(1), new Integer(1), new Integer(1)) instanceof java.time.LocalDate);
  }
  @Test
  public void dateTest3() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    DateUtil.date(new Integer(1144), new Integer(1144), new Integer(1144));
  }
  @Test
  public void dateTest4() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    DateUtil.date("^-?(([1-9]\\d\\d\\d+)|(0\\d\\d\\d))-");
  }
  @Test
  public void dateTest5() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    DateUtil.date((TemporalAccessor) null);
  }
}

