
package com.example.testxml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t-pronalazac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t-pronalazac"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/p1}t-lice"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="broj-faksa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t-pronalazac", namespace = "http://www.ftn.uns.ac.rs/p1", propOrder = {
    "brojFaksa",
    "ime",
    "prezime"
})
@XmlSeeAlso({
    com.example.testxml.model.ObrazacP1 .Pronalazac.class
})
public class TPronalazac
    extends TLice
{

    @XmlElement(name = "broj-faksa", namespace = "http://www.ftn.uns.ac.rs/p1", required = true)
    protected String brojFaksa;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/p1", required = true)
    protected String ime;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/p1", required = true)
    protected String prezime;

    /**
     * Gets the value of the brojFaksa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojFaksa() {
        return brojFaksa;
    }

    /**
     * Sets the value of the brojFaksa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojFaksa(String value) {
        this.brojFaksa = value;
    }

    /**
     * Gets the value of the ime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIme() {
        return ime;
    }

    /**
     * Sets the value of the ime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIme(String value) {
        this.ime = value;
    }

    /**
     * Gets the value of the prezime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * Sets the value of the prezime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrezime(String value) {
        this.prezime = value;
    }

}
