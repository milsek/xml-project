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
 *         &lt;element ref="{z1}naslov"/>
 *         &lt;element ref="{z1}popunjava-podnosilac"/>
 *         &lt;element ref="{z1}popunjava-zavod"/>
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
    "naslov",
    "popunjavaPodnosilac",
    "popunjavaZavod"
})
@XmlRootElement(name = "obrazac-z1", namespace = "z1")
public class ObrazacZ1 {

    @XmlElement(namespace = "z1", required = true)
    protected Naslov naslov;
    @XmlElement(name = "popunjava-podnosilac", namespace = "z1", required = true)
    protected PopunjavaPodnosilac popunjavaPodnosilac;
    @XmlElement(name = "popunjava-zavod", namespace = "z1", required = true)
    protected PopunjavaZavod popunjavaZavod;

    /**
     * Gets the value of the naslov property.
     * 
     * @return
     *     possible object is
     *     {@link Naslov }
     *     
     */
    public Naslov getNaslov() {
        return naslov;
    }

    /**
     * Sets the value of the naslov property.
     * 
     * @param value
     *     allowed object is
     *     {@link Naslov }
     *     
     */
    public void setNaslov(Naslov value) {
        this.naslov = value;
    }

    /**
     * Gets the value of the popunjavaPodnosilac property.
     * 
     * @return
     *     possible object is
     *     {@link PopunjavaPodnosilac }
     *     
     */
    public PopunjavaPodnosilac getPopunjavaPodnosilac() {
        return popunjavaPodnosilac;
    }

    /**
     * Sets the value of the popunjavaPodnosilac property.
     * 
     * @param value
     *     allowed object is
     *     {@link PopunjavaPodnosilac }
     *     
     */
    public void setPopunjavaPodnosilac(PopunjavaPodnosilac value) {
        this.popunjavaPodnosilac = value;
    }

    /**
     * Gets the value of the popunjavaZavod property.
     * 
     * @return
     *     possible object is
     *     {@link PopunjavaZavod }
     *     
     */
    public PopunjavaZavod getPopunjavaZavod() {
        return popunjavaZavod;
    }

    /**
     * Sets the value of the popunjavaZavod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PopunjavaZavod }
     *     
     */
    public void setPopunjavaZavod(PopunjavaZavod value) {
        this.popunjavaZavod = value;
    }

    public String toString(int numOfTabs) {
        String tabs = "";
        for(int i = 0; i < numOfTabs; i++){
            tabs += "\t";
        }
        return "ObrazacZ1{" +
                "\n\t"+tabs+"" + naslov.toString(numOfTabs+1) +
                "\n\t"+tabs+"" + popunjavaPodnosilac.toString(numOfTabs+1) +
                "\n\t"+tabs+"" + popunjavaZavod.toString(numOfTabs+1) +
                '}';
    }
}
