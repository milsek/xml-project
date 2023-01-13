
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
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/z1}prilozi-uz-zahtev"/>
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/z1}identifikacija-ziga"/>
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
    "priloziUzZahtev",
    "identifikacijaZiga"
})
@XmlRootElement(name = "popunjava-zavod", namespace = "http://www.ftn.uns.ac.rs/z1")
public class PopunjavaZavod {

    @XmlElement(name = "prilozi-uz-zahtev", namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected PriloziUzZahtev priloziUzZahtev;
    @XmlElement(name = "identifikacija-ziga", namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected IdentifikacijaZiga identifikacijaZiga;

    /**
     * Gets the value of the priloziUzZahtev property.
     * 
     * @return
     *     possible object is
     *     {@link PriloziUzZahtev }
     *     
     */
    public PriloziUzZahtev getPriloziUzZahtev() {
        return priloziUzZahtev;
    }

    /**
     * Sets the value of the priloziUzZahtev property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriloziUzZahtev }
     *     
     */
    public void setPriloziUzZahtev(PriloziUzZahtev value) {
        this.priloziUzZahtev = value;
    }

    /**
     * Gets the value of the identifikacijaZiga property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifikacijaZiga }
     *     
     */
    public IdentifikacijaZiga getIdentifikacijaZiga() {
        return identifikacijaZiga;
    }

    /**
     * Sets the value of the identifikacijaZiga property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifikacijaZiga }
     *     
     */
    public void setIdentifikacijaZiga(IdentifikacijaZiga value) {
        this.identifikacijaZiga = value;
    }

}
