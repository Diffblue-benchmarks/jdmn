package com.gs.dmn.feel.analysis.scanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.scanner.ContextDependentFEELLexer
 *
 * @author Diffblue JCover
 */

public class ContextDependentFEELLexerTest {

    @Test(timeout=10000)
    public void isNamePartChar() {
        assertThat(ContextDependentFEELLexer.isNamePartChar(248), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(65_008), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(63_744), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(12_289), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(11_264), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(8_304), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(8_255), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(8_204), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(895), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(880), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(768), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(216), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(192), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(183), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(97), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(95), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(65), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(63), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(48), is(true));
        assertThat(ContextDependentFEELLexer.isNamePartChar(1), is(false));
        assertThat(ContextDependentFEELLexer.isNamePartChar(58), is(false));
    }

    @Test(timeout=10000)
    public void isNameStartChar() {
        assertThat(ContextDependentFEELLexer.isNameStartChar(1), is(false));
        assertThat(ContextDependentFEELLexer.isNameStartChar(63), is(true));
    }

    @Test(timeout=10000)
    public void nextToken() {
        CharStream inputTape = mock(CharStream.class);
        String[] names = new String[] { "bar" };
        Token result = new ContextDependentFEELLexer(inputTape).nextToken(new LexicalContext(names));
        assertThat(result.getChannel(), is(0));
        assertThat(result.getCharPositionInLine(), is(-1));
        assertThat(result.getInputStream(), is(nullValue()));
        assertThat(result.getLine(), is(0));
        assertThat(result.getStartIndex(), is(0));
        assertThat(result.getStopIndex(), is(0));
        assertThat(result.getText(), is(""));
        assertThat(result.getTokenIndex(), is(-1));
        assertThat(result.getTokenSource(), is(nullValue()));
        assertThat(result.getType(), is(-1));
    }
}
