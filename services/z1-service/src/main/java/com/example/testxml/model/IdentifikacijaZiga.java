package com.example.testxml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{z1}broj-prijave-ziga"/>
 *         &lt;element name="datum-podnosenja" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
    "brojPrijaveZiga",
    "datumPodnosenja"
})
@XmlRootElement(name = "identifikacija-ziga", namespace = "z1")
public class IdentifikacijaZiga {

    @XmlElement(name = "broj-prijave-ziga", namespace = "z1", required = true)
    protected BrojPrijaveZiga brojPrijaveZiga;
    @XmlElement(name = "datum-podnosenja", namespace = "z1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPodnosenja;

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

    /**
     * Gets the value of the datumPodnosenja property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumPodnosenja() {
        return datumPodnosenja;
    }

    /**
     * Sets the value of the datumPodnosenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumPodnosenja(XMLGregorianCalendar value) {
        this.datumPodnosenja = value;
    }

    public String toString(int numOfTabs) {
        String tabs = "";
        for(int i = 0; i < numOfTabs; i++){
            tabs += "\t";
        }
        return "\n\t"+tabs+"IdentifikacijaZiga{" +
                "\n\t"+tabs+"" + brojPrijaveZiga.toString(numOfTabs+1) +
                "\n\t"+tabs+"" + datumPodnosenja +
                '}';
    }
}
