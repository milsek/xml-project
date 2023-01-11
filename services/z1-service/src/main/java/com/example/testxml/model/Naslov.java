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
 *         &lt;element name="naziv">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{z1}izdavac"/>
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
    "naziv",
    "izdavac"
})
@XmlRootElement(name = "naslov", namespace = "z1")
public class Naslov {

    @XmlElement(namespace = "z1", required = true)
    protected String naziv;
    @XmlElement(namespace = "z1", required = true)
    protected Izdavac izdavac;

    /**
     * Gets the value of the naziv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Sets the value of the naziv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaziv(String value) {
        this.naziv = value;
    }

    /**
     * Gets the value of the izdavac property.
     * 
     * @return
     *     possible object is
     *     {@link Izdavac }
     *     
     */
    public Izdavac getIzdavac() {
        return izdavac;
    }

    /**
     * Sets the value of the izdavac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Izdavac }
     *     
     */
    public void setIzdavac(Izdavac value) {
        this.izdavac = value;
    }

    public String toString(int numOfTabs) {
        String tabs = "";
        for(int i = 0; i < numOfTabs; i++){
            tabs += "\t";
        }
        return "\n\t"+tabs+"Naslov{" +
                "\n\t"+tabs+"" + naziv +
                "\n\t"+tabs+"" + izdavac.toString(numOfTabs+1) +
                '}';
    }
}
