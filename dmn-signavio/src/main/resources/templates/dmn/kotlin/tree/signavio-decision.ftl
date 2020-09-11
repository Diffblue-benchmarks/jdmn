<#--
    Copyright 2016 Goldman Sachs.

    Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.

    You may obtain a copy of the License at
        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the License for the
    specific language governing permissions and limitations under the License.
-->
<#include "signavio-drgElementCommon.ftl">
<#if javaPackageName?has_content>
package ${javaPackageName}
</#if>

import java.util.*
import java.util.stream.Collectors

@javax.annotation.Generated(value = ["signavio-decision.ftl", "${transformer.escapeInString(modelRepository.name(drgElement))}"])
@${transformer.drgElementAnnotationClassName()}(
    namespace = "${javaPackageName}",
    name = "${modelRepository.name(drgElement)}",
    label = "${modelRepository.label(drgElement)}",
    elementKind = ${transformer.elementKindAnnotationClassName()}.${transformer.elementKind(drgElement)},
    expressionKind = ${transformer.expressionKindAnnotationClassName()}.${transformer.expressionKind(drgElement)},
    hitPolicy = ${transformer.hitPolicyAnnotationClassName()}.${transformer.hitPolicy(drgElement)},
    rulesCount = ${modelRepository.rulesCount(drgElement)}
)
class ${javaClassName}(${transformer.decisionConstructorSignature(drgElement)}) : ${decisionBaseClass}() {
    <#if transformer.shouldGenerateApplyWithConversionFromString(drgElement)>
    fun apply(${transformer.drgElementSignatureWithConversionFromString(drgElement)}): ${transformer.drgElementOutputType(drgElement)} {
        return try {
            apply(${transformer.drgElementDefaultArgumentListExtraCacheWithConversionFromString(drgElement)})
        } catch (e: Exception) {
            logError("Cannot apply decision '${javaClassName}'", e)
            null
        }
    }

    fun apply(${transformer.drgElementSignatureExtraCacheWithConversionFromString(drgElement)}): ${transformer.drgElementOutputType(drgElement)} {
        return try {
            apply(${transformer.drgElementArgumentListExtraCacheWithConversionFromString(drgElement)})
        } catch (e: Exception) {
            logError("Cannot apply decision '${javaClassName}'", e)
            null
        }
    }

    </#if>
    fun apply(${transformer.drgElementSignature(drgElement)}): ${transformer.drgElementOutputType(drgElement)} {
        return apply(${transformer.drgElementDefaultArgumentListExtraCache(drgElement)})
    }

    fun apply(${transformer.drgElementSignatureExtraCache(drgElement)}): ${transformer.drgElementOutputType(drgElement)} {
        <@applyMethodBody drgElement />
    }
    <#if transformer.isGenerateProto()>

    fun apply(${transformer.drgElementSignatureProto(drgElement)}): ${transformer.qualifiedResponseMessageName(drgElement)} {
        return apply(${transformer.drgElementDefaultArgumentListExtraCacheProto(drgElement)})
    }

    fun apply(${transformer.drgElementSignatureExtraCacheProto(drgElement)}): ${transformer.qualifiedResponseMessageName(drgElement)} {
        // Create arguments from Request Message
        <#assign parameters = transformer.drgElementTypeSignature(drgElement) />
        <#list parameters as parameter>
        val ${parameter.left}: ${transformer.toNativeType(parameter.right)}? = ${transformer.extractParameterFromRequestMessage(drgElement, parameter)}
        </#list>

        // Invoke apply method
        <#assign outputVariable = "output_" />
        val ${outputVariable}: ${transformer.drgElementOutputType(drgElement)} = apply(${transformer.drgElementArgumentListExtraCache(drgElement)})

        // Convert output to Response Message
        <#assign responseMessageName = transformer.qualifiedResponseMessageName(drgElement) />
        val builder_: ${responseMessageName}.Builder = ${responseMessageName}.newBuilder()
        <#assign outputType = transformer.drgElementOutputFEELType(drgElement) />
        builder_.${transformer.protoSetter(drgElement)}(${transformer.convertValueToProtoNativeType(outputVariable, outputType)})
        return builder_.build()
    }
    </#if>
    <@evaluateExpressionMethod drgElement />

    companion object {
        val ${transformer.drgElementMetadataFieldName()} : ${transformer.drgElementMetadataClassName()} = ${transformer.drgElementMetadataClassName()}(
            "${javaPackageName}",
            "${modelRepository.name(drgElement)}",
            "${modelRepository.label(drgElement)}",
            ${transformer.elementKindAnnotationClassName()}.${transformer.elementKind(drgElement)},
            ${transformer.expressionKindAnnotationClassName()}.${transformer.expressionKind(drgElement)},
            ${transformer.hitPolicyAnnotationClassName()}.${transformer.hitPolicy(drgElement)},
            ${modelRepository.rulesCount(drgElement)}
        )
    <#if transformer.isGenerateProto()>

        @JvmStatic
        fun requestToMap(${transformer.requestVariableName(drgElement)}: ${transformer.qualifiedRequestMessageName(drgElement)}): kotlin.collections.Map<String, Any?> {
            <#assign stm = transformer.convertProtoRequestToMapBody(drgElement)>
            <#list stm.statements as child>
            ${child.expression}
            </#list>
        }

        @JvmStatic
        fun responseToOutput(${transformer.responseVariableName(drgElement)}: ${transformer.qualifiedResponseMessageName(drgElement)}): ${transformer.drgElementOutputType(drgElement)} {
            <#assign stm = transformer.convertProtoResponseToOutputBody(drgElement)>
            <#list stm.statements as child>
            ${child.expression}
            </#list>
        }
    </#if>
    }
}
