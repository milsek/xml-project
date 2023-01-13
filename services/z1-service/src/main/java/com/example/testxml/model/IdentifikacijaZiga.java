
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
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/z1}broj-prijave-ziga"/>
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
    "brojPrijaveZiga"
})
@XmlRootElement(name = "identifikacija-ziga", namespace = "http://www.ftn.uns.ac.rs/z1")
public class IdentifikacijaZiga {

    @XmlElement(name = "broj-prijave-ziga", namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected BrojPrijaveZiga brojPrijaveZiga;

    /**
     * Gets the value of the brojPrijaveZiga property.
     * 
     * @return
     *     possible object is
     *     {@link BrojPrijaveZiga }
     *     
     */
    public BrojPrijaveZiga getBrojPrijaveZiga() {
        return brojPrijaveZiga;
    }

    /**
     * Sets the value of the brojPrijaveZiga property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrojPrijaveZiga }
     *     
     */
    public void setBrojPrijaveZiga(BrojPrijaveZiga value) {
        this.brojPrijaveZiga = value;
    }

}
