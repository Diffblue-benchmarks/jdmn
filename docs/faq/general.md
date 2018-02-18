# General

## How to execute DMN models?

DMN models can be executed in jDMN in two ways:
* interpretation on JVM
* translation to Java, followed by the execution of the generated code on JVM. 

For more information please look at the other [FAQs](index.md).

## What is a jDMN dialect?

A dialect is a jDMN abstraction introduced to support variations both of source (DMN) and target (Java). For example, 
* FEEL or SFEEL inputs
* Various mappings of the FEEL/DMN types (e.g. one dialect maps FEEL:number to BigDecimal, other maps FEEL:number to Double)

## How many dialects are supported?

The supported dialects are the following:
1. StandardDMNDialectDefinition
2. UniformJavaTimeDMNDialectDefinition
3. MixedJavaTimeDMNDialectDefinition

The dialects map the FEEL primitive types to Java types as follows:


FEEL type |	number | string	| boolean | date |	time | date and time | duration
----------|--------|--------|---------|------|-------|---------------|---------
```StandardDMNDialectDefinition``` | ```java.math.BigDecimal``` | ```java.lang.String``` | ```java.lang.Boolean``` | ```javax.xml.datatype.XMLGregorianCalendar``` | ```javax.xml.datatype.XMLGregorianCalendar``` | ```javax.xml.datatype.XMLGregorianCalendar``` | ```javax.xml.datatype.Duration```
```UniformJavaTimeDMNDialectDefinition``` | ```java.math.BigDecimal``` | ```java.lang.String``` | ```java.lang.Boolean``` | ```java.time.ZonedDateTime``` | ```java.time.ZonedDateTime``` | ```java.time.ZonedDateTime``` | ```javax.xml.datatype.Duration```
```MixedJavaTimeDMNDialectDefinition``` | ```java.math.BigDecimal``` | ```java.lang.String``` | ```java.lang.Boolean``` | ```java.time.LocalDate``` | ```java.time.OffsetTime``` | ```java.time.ZonedDateTime``` | ```javax.xml.datatype.Duration```

The recommended dialect is MixedJavaTimeDMNDialectDefinition. It's a bit more faster than the others and more user friendly.