//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.05 at 10:24:24 AM GMT 
//


package org.omg.dmn.tck.marshaller._20160719;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testCaseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="testCaseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="decision"/&gt;
 *     &lt;enumeration value="bkm"/&gt;
 *     &lt;enumeration value="decisionService"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "testCaseType")
@XmlEnum
public enum TestCaseType {

    @XmlEnumValue("decision")
    DECISION("decision"),
    @XmlEnumValue("bkm")
    BKM("bkm"),
    @XmlEnumValue("decisionService")
    DECISION_SERVICE("decisionService");
    private final String value;

    TestCaseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TestCaseType fromValue(String v) {
        for (TestCaseType c: TestCaseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
