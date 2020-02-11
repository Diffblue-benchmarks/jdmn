package com.gs.dmn.serialization;

import static org.mockito.Mockito.mock;

import com.gs.dmn.log.BuildLogger;

import java.io.ByteArrayOutputStream;

import org.junit.Test;
import org.omg.spec.dmn._20180521.model.TDefinitions;

/**
 * Unit tests for com.gs.dmn.serialization.DMNWriter
 *
 * @author Diffblue JCover
 */

public class DMNWriterTest {

    @Test(timeout=10000)
    public void write() {
        BuildLogger logger = mock(BuildLogger.class);
        new DMNWriter(logger).write(new TDefinitions(), new ByteArrayOutputStream(), new DMNNamespacePrefixMapper());
    }
}
