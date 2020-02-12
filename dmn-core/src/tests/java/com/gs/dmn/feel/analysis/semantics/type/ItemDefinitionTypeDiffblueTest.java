package com.gs.dmn.feel.analysis.semantics.type;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Set;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.feel.analysis.semantics.type.ItemDefinitionType
 *
 * @author Diffblue JCover
 */

public class ItemDefinitionTypeDiffblueTest {

    @Test(timeout=10000)
    public void addMemberAliasesIsEmptyAndNameIsInt() {
        ItemDefinitionType itemDefinitionType = new ItemDefinitionType("bar");
        Type type = mock(Type.class);
        when(type.isValid())
            .thenReturn(false);
        assertThat(itemDefinitionType.addMember("int", new ArrayList<String>(), type), sameInstance(itemDefinitionType));
        assertTrue(itemDefinitionType.getMembers().contains("int"));
    }

    @Test(timeout=10000)
    public void conformsToReturnsFalse() {
        Type other = mock(Type.class);
        assertThat(new ItemDefinitionType("int").conformsTo(other), is(false));
    }

    @Test(timeout=10000)
    public void equivalentToReturnsFalse() {
        Type other = mock(Type.class);
        assertThat(new ItemDefinitionType("int").equivalentTo(other), is(false));
    }

    @Test(timeout=10000)
    public void getAliasesNameIsIntReturnsEmpty() {
        assertTrue(new ItemDefinitionType("bar").getAliases("int").isEmpty());
    }

    @Test(timeout=10000)
    public void getMembersReturnsEmpty() {
        ItemDefinitionType itemDefinitionType = new ItemDefinitionType("int");
        Set<String> result = itemDefinitionType.getMembers();
        assertTrue(result.isEmpty());
        assertThat(itemDefinitionType.getMembers(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getMemberTypeMemberIsGifReturnsNull() {
        assertThat(new ItemDefinitionType("int").getMemberType("gif"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isValidReturnsFalse() {
        assertThat(new ItemDefinitionType("int").isValid(), is(false));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new ItemDefinitionType("int").equals("foo"), is(false));
        assertThat(new ItemDefinitionType("int").equals(null), is(false));
    }

    @Test(timeout=10000)
    public void toContextType() {
        ContextType result = new ItemDefinitionType("int").toContextType();
        assertTrue(result.getMembers().isEmpty());
        assertThat(result.isValid(), is(false));
    }
}
