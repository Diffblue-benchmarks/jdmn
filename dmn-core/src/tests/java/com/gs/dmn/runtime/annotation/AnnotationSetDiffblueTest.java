package com.gs.dmn.runtime.annotation;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.runtime.annotation.AnnotationSet
 *
 * @author Diffblue JCover
 */

public class AnnotationSetDiffblueTest {

    @Test(timeout=10000)
    public void addAnnotationAnnotationIsEmpty() {
        new AnnotationSet().addAnnotation("/bin/bash", 1, "");
    }

    @Test(timeout=10000)
    public void addAnnotationAnnotationIsGermanyAndDecisionNameIsBar() {
        AnnotationSet annotationSet = new AnnotationSet();
        annotationSet.addAnnotation("bar", 1, "Germany");
        // unknown collection AnnotationSet
    }

    @Test(timeout=10000)
    public void addAnnotationAnnotationListIsEmptyAndDecisionNameIsBar() {
        new AnnotationSet().addAnnotation("bar", 1, new ArrayList<String>());
    }

    @Test(timeout=10000)
    public void addAnnotationAnnotationListIsGermany() {
        AnnotationSet annotationSet = new AnnotationSet();
        List<String> annotationList = new ArrayList<String>();
        ((ArrayList<String>)annotationList).add("Germany");
        annotationSet.addAnnotation("/bin/bash", 1, annotationList);
        // unknown collection AnnotationSet
    }

    @Test(timeout=10000)
    public void addAnnotationAnnotationListIsNull() {
        new AnnotationSet().addAnnotation("/bin/bash", 1, (List<String>)null);
    }

    @Test(timeout=10000)
    public void toSetReturnsEmpty() {
        assertTrue(new AnnotationSet().toSet().isEmpty());
    }
}
