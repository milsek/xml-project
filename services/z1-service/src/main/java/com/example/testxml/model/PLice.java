
package com.example.testxml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PLice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PLice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/z1}Lice">
 *       &lt;sequence>
 *         &lt;element name="poslovno-ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PLice", namespace = "http://www.ftn.uns.ac.rs/z1", propOrder = {
    "poslovnoIme"
})
public class PLice
    extends Lice
{

    @XmlElement(name = "poslovno-ime", namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected String poslovnoIme;

    /**
     * Gets the value of the poslovnoIme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoslovnoIme() {
        return poslovnoIme;
    }

    /**
     * Sets the value of the poslovnoIme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoslovnoIme(String value) {
        this.poslovnoIme = value;
    }

}
