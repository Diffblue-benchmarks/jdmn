package com.gs.dmn;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDRGElement;
import org.omg.spec.dmn._20180521.model.TInputData;

public class DRGElementFilterDiffblueTest {
  @Test
  public void testFilterDRGElements() {
    // Arrange
    DRGElementFilter drgElementFilter = new DRGElementFilter(true);

    // Act and Assert
    assertEquals(0,
        drgElementFilter.filterDRGElements(new ArrayList<DRGElementReference<? extends TDRGElement>>()).size());
  }

  @Test
  public void testFilterDRGElements2() {
    // Arrange
    DRGElementFilter drgElementFilter = new DRGElementFilter(true);

    // Act and Assert
    assertEquals(0,
        drgElementFilter.filterDRGElements(new ArrayList<DRGElementReference<? extends TDRGElement>>()).size());
  }

  @Test
  public void testFilterDRGElements3() {
    // Arrange
    DRGElementFilter drgElementFilter = new DRGElementFilter(true);

    // Act and Assert
    assertEquals(0,
        drgElementFilter.filterDRGElements(new ArrayList<DRGElementReference<? extends TDRGElement>>()).size());
  }

  @Test
  public void testFilterInputs() {
    // Arrange
    DRGElementFilter drgElementFilter = new DRGElementFilter(true);

    // Act and Assert
    assertEquals(0, drgElementFilter.filterInputs(new ArrayList<DRGElementReference<TInputData>>()).size());
  }

  @Test
  public void testFilterInputs2() {
    // Arrange
    DRGElementFilter drgElementFilter = new DRGElementFilter(true);

    // Act and Assert
    assertEquals(0, drgElementFilter.filterInputs(new ArrayList<DRGElementReference<TInputData>>()).size());
  }

  @Test
  public void testFilterInputs3() {
    // Arrange
    DRGElementFilter drgElementFilter = new DRGElementFilter(true);

    // Act and Assert
    assertEquals(0, drgElementFilter.filterInputs(new ArrayList<DRGElementReference<TInputData>>()).size());
  }
}

