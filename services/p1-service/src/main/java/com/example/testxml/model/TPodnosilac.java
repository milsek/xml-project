
package com.example.testxml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t-podnosilac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t-podnosilac"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/p1}t-lice"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="broj-faksa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="pronalazac" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t-podnosilac", namespace = "http://www.ftn.uns.ac.rs/p1", propOrder = {
    "brojFaksa"
})
@XmlSeeAlso({
    TPodnosilacFizickoLice.class,
    TPodnosilacPravnoLice.class
})
public abstract class TPodnosilac
    extends TLice
{

    @XmlElement(name = "broj-faksa", namespace = "http://www.ftn.uns.ac.rs/p1", required = true)
    protected String brojFaksa;
    @XmlAttribute(name = "pronalazac")
    protected Boolean pronalazac;

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
     * Gets the value of the pronalazac property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPronalazac() {
        return pronalazac;
    }

    /**
     * Sets the value of the pronalazac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPronalazac(Boolean value) {
        this.pronalazac = value;
    }

}
