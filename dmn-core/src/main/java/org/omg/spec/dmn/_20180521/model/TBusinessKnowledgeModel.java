//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.05 at 10:24:23 AM GMT 
//


package org.omg.spec.dmn._20180521.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tBusinessKnowledgeModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tBusinessKnowledgeModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/DMN/20180521/MODEL/}tInvocable"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="encapsulatedLogic" type="{http://www.omg.org/spec/DMN/20180521/MODEL/}tFunctionDefinition" minOccurs="0"/&gt;
 *         &lt;element name="knowledgeRequirement" type="{http://www.omg.org/spec/DMN/20180521/MODEL/}tKnowledgeRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="authorityRequirement" type="{http://www.omg.org/spec/DMN/20180521/MODEL/}tAuthorityRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBusinessKnowledgeModel", propOrder = {
    "encapsulatedLogic",
    "knowledgeRequirement",
    "authorityRequirement"
})
public class TBusinessKnowledgeModel
    extends TInvocable
{

    protected TFunctionDefinition encapsulatedLogic;
    protected List<TKnowledgeRequirement> knowledgeRequirement;
    protected List<TAuthorityRequirement> authorityRequirement;

    /**
     * Gets the value of the encapsulatedLogic property.
     * 
     * @return
     *     possible object is
     *     {@link TFunctionDefinition }
     *     
     */
    public TFunctionDefinition getEncapsulatedLogic() {
        return encapsulatedLogic;
    }

    /**
     * Sets the value of the encapsulatedLogic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFunctionDefinition }
     *     
     */
    public void setEncapsulatedLogic(TFunctionDefinition value) {
        this.encapsulatedLogic = value;
    }

    /**
     * Gets the value of the knowledgeRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knowledgeRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnowledgeRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TKnowledgeRequirement }
     * 
     * 
     */
    public List<TKnowledgeRequirement> getKnowledgeRequirement() {
        if (knowledgeRequirement == null) {
            knowledgeRequirement = new ArrayList<TKnowledgeRequirement>();
        }
        return this.knowledgeRequirement;
    }

    /**
     * Gets the value of the authorityRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorityRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorityRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAuthorityRequirement }
     * 
     * 
     */
    public List<TAuthorityRequirement> getAuthorityRequirement() {
        if (authorityRequirement == null) {
            authorityRequirement = new ArrayList<TAuthorityRequirement>();
        }
        return this.authorityRequirement;
    }

}
