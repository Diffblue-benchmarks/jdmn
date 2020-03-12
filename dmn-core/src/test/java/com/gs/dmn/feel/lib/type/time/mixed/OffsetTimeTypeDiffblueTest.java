package com.gs.dmn.feel.lib.type.time.mixed;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl;
import java.util.LinkedList;
import net.sf.saxon.value.SaxonDuration;
import org.junit.Test;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;

public class OffsetTimeTypeDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    DatatypeFactoryImpl datatypeFactoryImpl = new DatatypeFactoryImpl();

    // Act and Assert
    assertSame(datatypeFactoryImpl, (new OffsetTimeType(logger, datatypeFactoryImpl)).datatypeFactory);
  }

  @Test
  public void offsetTimeEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new OffsetTimeType(logger, new DatatypeFactoryImpl())).offsetTimeEqual(null, null));
  }

  @Test
  public void offsetTimeGreaterEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new OffsetTimeType(logger, new DatatypeFactoryImpl())).offsetTimeGreaterEqualThan(null, null));
  }

  @Test
  public void offsetTimeGreaterThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new OffsetTimeType(logger, new DatatypeFactoryImpl())).offsetTimeGreaterThan(null, null));
  }

  @Test
  public void offsetTimeLessEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new OffsetTimeType(logger, new DatatypeFactoryImpl())).offsetTimeLessEqualThan(null, null));
  }

  @Test
  public void offsetTimeLessThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new OffsetTimeType(logger, new DatatypeFactoryImpl())).offsetTimeLessThan(null, null));
  }

  @Test
  public void timeAddDurationTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    OffsetTimeType offsetTimeType = new OffsetTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(offsetTimeType.timeAddDuration(null, new SaxonDuration(null)));
  }

  @Test
  public void timeEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new OffsetTimeType(logger, new DatatypeFactoryImpl())).timeEqual(null, null));
  }

  @Test
  public void timeGreaterEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new OffsetTimeType(logger, new DatatypeFactoryImpl())).timeGreaterEqualThan(null, null));
  }

  @Test
  public void timeGreaterThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new OffsetTimeType(logger, new DatatypeFactoryImpl())).timeGreaterThan(null, null));
  }

  @Test
  public void timeLessEqualThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertTrue((new OffsetTimeType(logger, new DatatypeFactoryImpl())).timeLessEqualThan(null, null));
  }

  @Test
  public void timeLessThanTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new OffsetTimeType(logger, new DatatypeFactoryImpl())).timeLessThan(null, null));
  }

  @Test
  public void timeNotEqualTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertFalse((new OffsetTimeType(logger, new DatatypeFactoryImpl())).timeNotEqual(null, null));
  }

  @Test
  public void timeSubtractDurationTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);
    OffsetTimeType offsetTimeType = new OffsetTimeType(logger, new DatatypeFactoryImpl());

    // Act and Assert
    assertNull(offsetTimeType.timeSubtractDuration(null, new SaxonDuration(null)));
  }

  @Test
  public void timeSubtractTest() {
    // Arrange
    LinkedList<SubstituteLoggingEvent> substituteLoggingEventList = new LinkedList<SubstituteLoggingEvent>();
    substituteLoggingEventList.add(new SubstituteLoggingEvent());
    SubstituteLogger logger = new SubstituteLogger("log", substituteLoggingEventList, true);

    // Act and Assert
    assertNull((new OffsetTimeType(logger, new DatatypeFactoryImpl())).timeSubtract(null, null));
  }
}

