
package com.example.testxml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t-pravno-lice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t-pravno-lice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/a1}t-lice"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="poslovno-ime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sediste" type="{http://www.ftn.uns.ac.rs/a1}t-adresa"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t-pravno-lice", namespace = "http://www.ftn.uns.ac.rs/a1", propOrder = {
    "poslovnoIme",
    "sediste"
})
public class TPravnoLice
    extends TLice
{

    @XmlElement(name = "poslovno-ime", namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
    protected String poslovnoIme;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
    protected TAdresa sediste;

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

    /**
     * Gets the value of the sediste property.
     * 
     * @return
     *     possible object is
     *     {@link TAdresa }
     *     
     */
    public TAdresa getSediste() {
        return sediste;
    }

    /**
     * Sets the value of the sediste property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAdresa }
     *     
     */
    public void setSediste(TAdresa value) {
        this.sediste = value;
    }

}
