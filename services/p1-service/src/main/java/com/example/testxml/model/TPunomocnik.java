package com.example.testxml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t-punomocnik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t-punomocnik">
 *   &lt;complexContent>
 *     &lt;extension base="{p1}t-lice">
 *       &lt;attribute name="tip" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Punomocnik za zastupanje"/>
 *             &lt;enumeration value="Punomocnik za prijem pismena"/>
 *             &lt;enumeration value="Zajednicki predstavnik"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t-punomocnik", namespace = "p1")
@XmlSeeAlso({
    TPunomocnikFizickoLice.class,
    TPunomocnikPravnoLice.class
})
public abstract class TPunomocnik
    extends TLice
{

    @XmlAttribute(name = "tip", required = true)
    protected String tip;

    /**
     * Gets the value of the tip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTip() {
        return tip;
    }

    /**
     * Sets the value of the tip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTip(String value) {
        this.tip = value;
    }

}
