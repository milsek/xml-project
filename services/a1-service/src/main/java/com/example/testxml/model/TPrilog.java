
package com.example.testxml.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t-prilog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t-prilog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="odobren" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="putanja" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t-prilog", namespace = "http://www.ftn.uns.ac.rs/a1", propOrder = {
    "odobren",
    "putanja"
})
public class TPrilog {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1")
    protected boolean odobren;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
    protected String putanja;

    /**
     * Gets the value of the odobren property.
     * 
     */
    public boolean isOdobren() {
        return odobren;
    }

    /**
     * Sets the value of the odobren property.
     * 
     */
    public void setOdobren(boolean value) {
        this.odobren = value;
    }

    /**
     * Gets the value of the putanja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPutanja() {
        return putanja;
    }

    /**
     * Sets the value of the putanja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPutanja(String value) {
        this.putanja = value;
    }

}
