package com.gs.dmn.feel.lib;

import java.time.temporal.TemporalAmount;
import net.sf.saxon.value.SaxonDuration;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DurationUtilDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void compareTest() {
    // Arrange
    SaxonDuration duration1 = new SaxonDuration(null);

    // Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    DurationUtil.compare(duration1, new SaxonDuration(null));
  }
  @Test
  public void durationTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    DurationUtil.duration((TemporalAmount) null);
  }
  @Test
  public void durationTest2() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    DurationUtil.duration("-");
  }
  @Test
  public void normalizeTest() {
    // Arrange, Act and Assert
    thrown.expect(UnsupportedOperationException.class);
    DurationUtil.normalize(new SaxonDuration(null));
  }
}

