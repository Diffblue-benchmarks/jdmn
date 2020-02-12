package com.gs.dmn.runtime.compiler;

import com.gs.dmn.DMNModelRepository;
import com.gs.dmn.feel.analysis.syntax.ast.FEELContext;
import com.gs.dmn.feel.analysis.syntax.ast.expression.ExpressionList;
import com.gs.dmn.feel.analysis.syntax.ast.expression.function.FunctionDefinition;
import com.gs.dmn.feel.synthesis.FEELTranslatorForInterpreter;
import com.gs.dmn.feel.synthesis.type.DoubleMixedJavaTimeFEELTypeTranslator;
import com.gs.dmn.runtime.DMNRuntimeException;
import com.gs.dmn.transformation.basic.BasicDMN2JavaTransformer;
import com.gs.dmn.transformation.lazy.NopLazyEvaluationDetector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JavaxToolsCompilerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void makeClassDataTest() {
    // Arrange
    JavaxToolsCompiler javaxToolsCompiler = new JavaxToolsCompiler();
    FunctionDefinition element = new FunctionDefinition(null, new ExpressionList(), true);
    FEELContext context = FEELContext.makeContext(null);
    DMNModelRepository dmnModelRepository = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator = new DoubleMixedJavaTimeFEELTypeTranslator();
    BasicDMN2JavaTransformer dmnTransformer = new BasicDMN2JavaTransformer(dmnModelRepository, null, feelTypeTranslator,
        new NopLazyEvaluationDetector(), null);
    DMNModelRepository dmnModelRepository1 = new DMNModelRepository();
    DoubleMixedJavaTimeFEELTypeTranslator feelTypeTranslator1 = new DoubleMixedJavaTimeFEELTypeTranslator();

    // Act and Assert
    thrown.expect(ClassCastException.class);
    javaxToolsCompiler.makeClassData(element, context, dmnTransformer,
        new FEELTranslatorForInterpreter(new BasicDMN2JavaTransformer(dmnModelRepository1, null, feelTypeTranslator1,
            new NopLazyEvaluationDetector(), null)),
        "name");
  }
  @Test(timeout=10000)
  public void compileTest4() throws Exception {
    // Arrange
    JavaxToolsCompiler javaxToolsCompiler = new JavaxToolsCompiler();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    javaxToolsCompiler.compile(new JavaxToolsClassData("name", "name", "foo"));
  }
  @Test(timeout=10000)
  public void compileTest3() throws Exception {
    // Arrange
    JavaxToolsCompiler javaxToolsCompiler = new JavaxToolsCompiler();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    javaxToolsCompiler.compile(new JavaxToolsClassData("", "name", "foo"));
  }
  @Test(timeout=10000)
  public void compileTest2() throws Exception {
    // Arrange
    JavaxToolsCompiler javaxToolsCompiler = new JavaxToolsCompiler();

    // Act and Assert
    thrown.expect(ClassNotFoundException.class);
    javaxToolsCompiler.compile(new JavaxToolsClassData("name", "name", ""));
  }
  @Test(timeout=10000)
  public void compileTest() throws Exception {
    // Arrange
    JavaxToolsCompiler javaxToolsCompiler = new JavaxToolsCompiler();

    // Act and Assert
    thrown.expect(DMNRuntimeException.class);
    javaxToolsCompiler.compile(new JavaxToolsClassData("name", "name", "-d"));
  }
}

