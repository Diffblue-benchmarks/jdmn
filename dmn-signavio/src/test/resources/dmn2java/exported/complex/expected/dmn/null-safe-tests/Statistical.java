
import java.util.*;
import java.util.stream.Collectors;

@javax.annotation.Generated(value = {"decision-with-extension.ftl", "statistical"})
@com.gs.dmn.runtime.annotation.DRGElement(
    namespace = "",
    name = "statistical",
    label = "statistical",
    elementKind = com.gs.dmn.runtime.annotation.DRGElementKind.DECISION,
    expressionKind = com.gs.dmn.runtime.annotation.ExpressionKind.LITERAL_EXPRESSION,
    hitPolicy = com.gs.dmn.runtime.annotation.HitPolicy.UNKNOWN,
    rulesCount = -1
)
public class Statistical extends com.gs.dmn.signavio.runtime.DefaultSignavioBaseDecision {
    public static final com.gs.dmn.runtime.listener.DRGElement DRG_ELEMENT_METADATA = new com.gs.dmn.runtime.listener.DRGElement(
        "",
        "statistical",
        "statistical",
        com.gs.dmn.runtime.annotation.DRGElementKind.DECISION,
        com.gs.dmn.runtime.annotation.ExpressionKind.LITERAL_EXPRESSION,
        com.gs.dmn.runtime.annotation.HitPolicy.UNKNOWN,
        -1
    );

    public Statistical() {
    }

    public java.math.BigDecimal apply(String numberList, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_) {
        try {
            return apply((numberList != null ? asList(com.gs.dmn.serialization.JsonSerializer.OBJECT_MAPPER.readValue(numberList, java.math.BigDecimal[].class)) : null), annotationSet_, new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER), new com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor());
        } catch (Exception e) {
            logError("Cannot apply decision 'Statistical'", e);
            return null;
        }
    }

    public java.math.BigDecimal apply(String numberList, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_) {
        try {
            return apply((numberList != null ? asList(com.gs.dmn.serialization.JsonSerializer.OBJECT_MAPPER.readValue(numberList, java.math.BigDecimal[].class)) : null), annotationSet_, eventListener_, externalExecutor_);
        } catch (Exception e) {
            logError("Cannot apply decision 'Statistical'", e);
            return null;
        }
    }

    public java.math.BigDecimal apply(List<java.math.BigDecimal> numberList, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_) {
        return apply(numberList, annotationSet_, new com.gs.dmn.runtime.listener.LoggingEventListener(LOGGER), new com.gs.dmn.runtime.external.DefaultExternalFunctionExecutor());
    }

    public java.math.BigDecimal apply(List<java.math.BigDecimal> numberList, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_) {
        try {
            // Start decision 'statistical'
            long statisticalStartTime_ = System.currentTimeMillis();
            com.gs.dmn.runtime.listener.Arguments statisticalArguments_ = new com.gs.dmn.runtime.listener.Arguments();
            statisticalArguments_.put("numberList", numberList);
            eventListener_.startDRGElement(DRG_ELEMENT_METADATA, statisticalArguments_);

            // Evaluate decision 'statistical'
            java.math.BigDecimal output_ = evaluate(numberList, annotationSet_, eventListener_, externalExecutor_);

            // End decision 'statistical'
            eventListener_.endDRGElement(DRG_ELEMENT_METADATA, statisticalArguments_, output_, (System.currentTimeMillis() - statisticalStartTime_));

            return output_;
        } catch (Exception e) {
            logError("Exception caught in 'statistical' evaluation", e);
            return null;
        }
    }

    protected java.math.BigDecimal evaluate(List<java.math.BigDecimal> numberList, com.gs.dmn.runtime.annotation.AnnotationSet annotationSet_, com.gs.dmn.runtime.listener.EventListener eventListener_, com.gs.dmn.runtime.external.ExternalFunctionExecutor externalExecutor_) {
        return numericMultiply(mode(numberList), numericDivide(numericAdd(avg(numberList), median(numberList)), numericAdd(min(numberList), max(numberList))));
    }
}