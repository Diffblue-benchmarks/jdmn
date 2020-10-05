package com.gs.dmn.transformation.formatter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NopJavaFormatterDiffblueTest {
  @Test
  public void testFormatSource() {
    // Arrange, Act and Assert
    assertEquals(
        "package com.gs.dmn.generated.tck.cl2_0001_input_data_string;\n" + "\n" + "import java.util.*;\n"
            + "import java.util.stream.Collectors;\n" + "\n"
            + "@javax.annotation.Generated(value = {\"decision.ftl\", \"'Greeting Message'\"})\n"
            + "@com.gs.dmn.runtime.annotation.DRGElement(\n"
            + "    namespace = \"com.gs.dmn.generated.tck.cl2_0001_input_data_string\",\n"
            + "    name = \"'Greeting Message'\",\n" + "    label = \"\",\n"
            + "    elementKind = com.gs.dmn.runtime.annotation.DRGElementKind.DECISION,\n"
            + "    expressionKind = com.gs.dmn.runtime.annotation.ExpressionKind.LITERAL_EXPRESSION,\n"
            + "    hitPolicy = com.gs.dmn.runtime.annotation.HitPolicy.UNKNOWN,\n" + "    rulesCount = -1\n" + ")\n"
            + "public class GreetingMessage extends com.gs.dmn.runtime.DefaultDMNBaseDecis",
        (new NopJavaFormatter()).formatSource("package com.gs.dmn.generated.tck.cl2_0001_input_data_string;\n" + "\n"
            + "import java.util.*;\n" + "import java.util.stream.Collectors;\n" + "\n"
            + "@javax.annotation.Generated(value = {\"decision.ftl\", \"'Greeting Message'\"})\n"
            + "@com.gs.dmn.runtime.annotation.DRGElement(\n"
            + "    namespace = \"com.gs.dmn.generated.tck.cl2_0001_input_data_string\",\n"
            + "    name = \"'Greeting Message'\",\n" + "    label = \"\",\n"
            + "    elementKind = com.gs.dmn.runtime.annotation.DRGElementKind.DECISION,\n"
            + "    expressionKind = com.gs.dmn.runtime.annotation.ExpressionKind.LITERAL_EXPRESSION,\n"
            + "    hitPolicy = com.gs.dmn.runtime.annotation.HitPolicy.UNKNOWN,\n" + "    rulesCount = -1\n" + ")\n"
            + "public class GreetingMessage extends com.gs.dmn.runtime.DefaultDMNBaseDecis"));
    assertEquals(
        "package com.gs.dmn.generated.tck.cl2_0001_input_data_string;\n" + "\n" + "import java.util.*;\n"
            + "import java.util.stream.Collectors;\n" + "\n"
            + "@javax.annotation.Generated(value = {\"junit.ftl\", \"0001-input-data-string.dmn\"})\n"
            + "public class Test0001InputDataString extends com.gs.dmn.runtime.DefaultDMNBaseDecision {\n"
            + "    @org.junit.Test\n" + "    public void testCase001() {\n"
            + "        com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_ = new com.gs.dmn.runtime.annotation"
            + ".AnnotationSet();\n" + " ",
        (new NopJavaFormatter()).formatSource("package com.gs.dmn.generated.tck.cl2_0001_input_data_string;\n" + "\n"
            + "import java.util.*;\n" + "import java.util.stream.Collectors;\n" + "\n"
            + "@javax.annotation.Generated(value = {\"junit.ftl\", \"0001-input-data-string.dmn\"})\n"
            + "public class Test0001InputDataString extends com.gs.dmn.runtime.DefaultDMNBaseDecision {\n"
            + "    @org.junit.Test\n" + "    public void testCase001() {\n"
            + "        com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_ = new com.gs.dmn.runtime.annotation"
            + ".AnnotationSet();\n" + " "));
    assertEquals(
        "package com.gs.dmn.generated.tck.cl2_0002_input_data_number;\n" + "\n" + "import java.util.*;\n"
            + "import java.util.stream.Collectors;\n" + "\n" + "@javax.annotation.Generated(value = {\"",
        (new NopJavaFormatter()).formatSource(
            "package com.gs.dmn.generated.tck.cl2_0002_input_data_number;\n" + "\n" + "import java.util.*;\n"
                + "import java.util.stream.Collectors;\n" + "\n" + "@javax.annotation.Generated(value = {\""));
  }
}

