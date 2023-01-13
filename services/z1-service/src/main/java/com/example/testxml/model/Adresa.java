
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
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/z1}ulica"/>
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/z1}mesto"/>
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
    "ulica",
    "mesto"
})
@XmlRootElement(name = "adresa", namespace = "http://www.ftn.uns.ac.rs/z1")
public class Adresa {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected Ulica ulica;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected Mesto mesto;

    /**
     * Gets the value of the ulica property.
     * 
     * @return
     *     possible object is
     *     {@link Ulica }
     *     
     */
    public Ulica getUlica() {
        return ulica;
    }

    /**
     * Sets the value of the ulica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ulica }
     *     
     */
    public void setUlica(Ulica value) {
        this.ulica = value;
    }

    /**
     * Gets the value of the mesto property.
     * 
     * @return
     *     possible object is
     *     {@link Mesto }
     *     
     */
    public Mesto getMesto() {
        return mesto;
    }

    /**
     * Sets the value of the mesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mesto }
     *     
     */
    public void setMesto(Mesto value) {
        this.mesto = value;
    }

}
