
package com.example.testxml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/z1}boje"/>
 *         &lt;element name="transliteracija" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="prevod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="opis">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "boje",
    "transliteracija",
    "prevod",
    "opis"
})
@XmlRootElement(name = "znak", namespace = "http://www.ftn.uns.ac.rs/z1")
public class Znak {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected Boje boje;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/z1")
    protected String transliteracija;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/z1")
    protected String prevod;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected String opis;

    /**
     * Gets the value of the boje property.
     * 
     * @return
     *     possible object is
     *     {@link Boje }
     *     
     */
    public Boje getBoje() {
        return boje;
    }

    /**
     * Sets the value of the boje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boje }
     *     
     */
    public void setBoje(Boje value) {
        this.boje = value;
    }

    /**
     * Gets the value of the transliteracija property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransliteracija() {
        return transliteracija;
    }

    /**
     * Sets the value of the transliteracija property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransliteracija(String value) {
        this.transliteracija = value;
    }

    /**
     * Gets the value of the prevod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevod() {
        return prevod;
    }

    /**
     * Sets the value of the prevod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevod(String value) {
        this.prevod = value;
    }

    /**
     * Gets the value of the opis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpis() {
        return opis;
    }

    /**
     * Sets the value of the opis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpis(String value) {
        this.opis = value;
    }

}
