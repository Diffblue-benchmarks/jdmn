package com.gs.dmn.validation;

import static org.junit.Assert.assertTrue;

import com.gs.dmn.DMNModelRepository;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.validation.NopDMNValidator
 *
 * @author Diffblue JCover
 */

public class NopDMNValidatorTest {

    @Test(timeout=10000)
    public void validateReturnsEmpty() {
        assertTrue(new NopDMNValidator().validate(new DMNModelRepository()).isEmpty());
    }
}
