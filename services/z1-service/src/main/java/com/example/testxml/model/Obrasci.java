
package com.example.testxml.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="obrazac-z1">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ftn.uns.ac.rs/z1}naslov"/>
 *                   &lt;element ref="{http://www.ftn.uns.ac.rs/z1}popunjava-podnosilac"/>
 *                   &lt;element ref="{http://www.ftn.uns.ac.rs/z1}popunjava-zavod"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="datum-podnosenja" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "obrazacZ1"
})
@XmlRootElement(name = "obrasci", namespace = "http://www.ftn.uns.ac.rs/z1")
public class Obrasci {

    @XmlElement(name = "obrazac-z1", namespace = "http://www.ftn.uns.ac.rs/z1")
    protected List<Obrasci.ObrazacZ1> obrazacZ1;

    /**
     * Gets the value of the obrazacZ1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obrazacZ1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObrazacZ1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Obrasci.ObrazacZ1 }
     * 
     * 
     */
    public List<Obrasci.ObrazacZ1> getObrazacZ1() {
        if (obrazacZ1 == null) {
            obrazacZ1 = new ArrayList<Obrasci.ObrazacZ1>();
        }
        return this.obrazacZ1;
    }


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
     *         &lt;element ref="{http://www.ftn.uns.ac.rs/z1}naslov"/>
     *         &lt;element ref="{http://www.ftn.uns.ac.rs/z1}popunjava-podnosilac"/>
     *         &lt;element ref="{http://www.ftn.uns.ac.rs/z1}popunjava-zavod"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="datum-podnosenja" type="{http://www.w3.org/2001/XMLSchema}date" />
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
    public static class ObrazacZ1 {

        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
        protected Naslov naslov;
        @XmlElement(name = "popunjava-podnosilac", namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
        protected PopunjavaPodnosilac popunjavaPodnosilac;
        @XmlElement(name = "popunjava-zavod", namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
        protected PopunjavaZavod popunjavaZavod;
        @XmlAttribute(name = "id")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlAttribute(name = "datum-podnosenja")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumPodnosenja;

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

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setId(BigInteger value) {
            this.id = value;
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

    }

}
