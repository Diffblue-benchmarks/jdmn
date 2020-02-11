package com.gs.dmn.transformation.template;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.transformation.template.TreeTemplateProvider
 *
 * @author Diffblue JCover
 */

public class TreeTemplateProviderTest {

    @Test(timeout=10000)
    public void baseTemplatePath() {
        assertThat(new TreeTemplateProvider().baseTemplatePath(), is("/templates/dmn2java"));
    }

    @Test(timeout=10000)
    public void bkmTemplateName() {
        assertThat(new TreeTemplateProvider().bkmTemplateName(), is("tree/bkm.ftl"));
    }

    @Test(timeout=10000)
    public void decisionTableRuleOutputTemplate() {
        assertThat(new TreeTemplateProvider().decisionTableRuleOutputTemplate(), is("tree/decisionTableRuleOutput.ftl"));
    }

    @Test(timeout=10000)
    public void decisionTemplateName() {
        assertThat(new TreeTemplateProvider().decisionTemplateName(), is("tree/decision.ftl"));
    }

    @Test(timeout=10000)
    public void itemDefinitionClassTemplate() {
        assertThat(new TreeTemplateProvider().itemDefinitionClassTemplate(), is("common/itemDefinitionClass.ftl"));
    }

    @Test(timeout=10000)
    public void itemDefinitionInterfaceTemplate() {
        assertThat(new TreeTemplateProvider().itemDefinitionInterfaceTemplate(), is("common/itemDefinitionInterface.ftl"));
    }

    @Test(timeout=10000)
    public void testBaseTemplatePath() {
        assertThat(new TreeTemplateProvider().testBaseTemplatePath(), is("/templates/tck"));
    }

    @Test(timeout=10000)
    public void testTemplateName() {
        assertThat(new TreeTemplateProvider().testTemplateName(), is("common/junit.ftl"));
    }
}
