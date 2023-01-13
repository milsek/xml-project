
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
 *         &lt;element name="klasa">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="iznos" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "klasa",
    "iznos"
})
@XmlRootElement(name = "klasa-graficko-resenje", namespace = "http://www.ftn.uns.ac.rs/z1")
public class KlasaGrafickoResenje {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected String klasa;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/z1")
    protected double iznos;

    /**
     * Gets the value of the klasa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlasa() {
        return klasa;
    }

    /**
     * Sets the value of the klasa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKlasa(String value) {
        this.klasa = value;
    }

    /**
     * Gets the value of the iznos property.
     * 
     */
    public double getIznos() {
        return iznos;
    }

    /**
     * Sets the value of the iznos property.
     * 
     */
    public void setIznos(double value) {
        this.iznos = value;
    }

}
