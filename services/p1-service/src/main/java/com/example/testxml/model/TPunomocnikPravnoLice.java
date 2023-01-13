
package com.example.testxml.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t-punomocnik-pravno-lice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t-punomocnik-pravno-lice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/p1}t-punomocnik"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="poslovno-ime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t-punomocnik-pravno-lice", namespace = "http://www.ftn.uns.ac.rs/p1", propOrder = {
    "poslovnoIme"
})
public class TPunomocnikPravnoLice
    extends TPunomocnik
{

    @XmlElement(name = "poslovno-ime", namespace = "http://www.ftn.uns.ac.rs/p1", required = true)
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
