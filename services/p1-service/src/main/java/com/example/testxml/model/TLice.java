
package com.example.testxml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t-lice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t-lice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/p1}t-adresa"/&gt;
 *         &lt;element name="broj-telefona" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="e-mail"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Za-z0-9._%+-]+@[A-Za-z0-9]+[.][A-Za-z]{2,}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t-lice", namespace = "http://www.ftn.uns.ac.rs/p1", propOrder = {
    "adresa",
    "brojTelefona",
    "eMail"
})
@XmlSeeAlso({
    TPodnosilac.class,
    TPronalazac.class,
    TPunomocnik.class
})
public abstract class TLice {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/p1", required = true)
    protected TAdresa adresa;
    @XmlElement(name = "broj-telefona", namespace = "http://www.ftn.uns.ac.rs/p1", required = true)
    protected String brojTelefona;
    @XmlElement(name = "e-mail", namespace = "http://www.ftn.uns.ac.rs/p1", required = true)
    protected String eMail;

    /**
     * Gets the value of the adresa property.
     * 
     * @return
     *     possible object is
     *     {@link TAdresa }
     *     
     */
    public TAdresa getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAdresa }
     *     
     */
    public void setAdresa(TAdresa value) {
        this.adresa = value;
    }

    /**
     * Gets the value of the brojTelefona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojTelefona() {
        return brojTelefona;
    }

    /**
     * Sets the value of the brojTelefona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojTelefona(String value) {
        this.brojTelefona = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

}
