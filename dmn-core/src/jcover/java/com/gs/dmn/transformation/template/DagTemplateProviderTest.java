package com.gs.dmn.transformation.template;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.gs.dmn.transformation.template.DagTemplateProvider
 *
 * @author Diffblue JCover
 */

public class DagTemplateProviderTest {

    @Test(timeout=10000)
    public void baseTemplatePath() {
        assertThat(new DagTemplateProvider().baseTemplatePath(), is("/templates/dmn2java"));
    }

    @Test(timeout=10000)
    public void bkmTemplateName() {
        assertThat(new DagTemplateProvider().bkmTemplateName(), is("tree/bkm.ftl"));
    }

    @Test(timeout=10000)
    public void decisionTableRuleOutputTemplate() {
        assertThat(new DagTemplateProvider().decisionTableRuleOutputTemplate(), is("tree/decisionTableRuleOutput.ftl"));
    }

    @Test(timeout=10000)
    public void decisionTemplateName() {
        assertThat(new DagTemplateProvider().decisionTemplateName(), is("dag/decision.ftl"));
    }

    @Test(timeout=10000)
    public void itemDefinitionClassTemplate() {
        assertThat(new DagTemplateProvider().itemDefinitionClassTemplate(), is("common/itemDefinitionClass.ftl"));
    }

    @Test(timeout=10000)
    public void itemDefinitionInterfaceTemplate() {
        assertThat(new DagTemplateProvider().itemDefinitionInterfaceTemplate(), is("common/itemDefinitionInterface.ftl"));
    }

    @Test(timeout=10000)
    public void testBaseTemplatePath() {
        assertThat(new DagTemplateProvider().testBaseTemplatePath(), is("/templates/tck"));
    }

    @Test(timeout=10000)
    public void testTemplateName() {
        assertThat(new DagTemplateProvider().testTemplateName(), is("common/junit.ftl"));
    }
}
