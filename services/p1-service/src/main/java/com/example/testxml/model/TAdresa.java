
package com.example.testxml.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t-adresa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t-adresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ulica"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="naziv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="broj" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mesto"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="naziv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="postanski-broj"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
 *                         &lt;totalDigits value="5"/&gt;
 *                         &lt;pattern value="[0-9]{5}"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="drzava" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "t-adresa", namespace = "http://www.ftn.uns.ac.rs/p1", propOrder = {
    "ulica",
    "mesto"
})
public class TAdresa {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/p1", required = true)
    protected TAdresa.Ulica ulica;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/p1", required = true)
    protected TAdresa.Mesto mesto;

    /**
     * Gets the value of the ulica property.
     * 
     * @return
     *     possible object is
     *     {@link TAdresa.Ulica }
     *     
     */
    public TAdresa.Ulica getUlica() {
        return ulica;
    }

    /**
     * Sets the value of the ulica property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAdresa.Ulica }
     *     
     */
    public void setUlica(TAdresa.Ulica value) {
        this.ulica = value;
    }

    /**
     * Gets the value of the mesto property.
     * 
     * @return
     *     possible object is
     *     {@link TAdresa.Mesto }
     *     
     */
    public TAdresa.Mesto getMesto() {
        return mesto;
    }

    /**
     * Sets the value of the mesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAdresa.Mesto }
     *     
     */
    public void setMesto(TAdresa.Mesto value) {
        this.mesto = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="naziv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="postanski-broj"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&gt;
     *               &lt;totalDigits value="5"/&gt;
     *               &lt;pattern value="[0-9]{5}"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="drzava" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "naziv",
        "postanskiBroj",
        "drzava"
    })
    public static class Mesto {

        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/p1", required = true)
        protected String naziv;
        @XmlElement(name = "postanski-broj", namespace = "http://www.ftn.uns.ac.rs/p1", required = true)
        protected BigInteger postanskiBroj;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/p1", required = true)
        protected String drzava;

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
         * Gets the value of the postanskiBroj property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPostanskiBroj() {
            return postanskiBroj;
        }

        /**
         * Sets the value of the postanskiBroj property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPostanskiBroj(BigInteger value) {
            this.postanskiBroj = value;
        }

        /**
         * Gets the value of the drzava property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDrzava() {
            return drzava;
        }

        /**
         * Sets the value of the drzava property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDrzava(String value) {
            this.drzava = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="naziv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="broj" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "naziv",
        "broj"
    })
    public static class Ulica {

        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/p1", required = true)
        protected String naziv;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/p1", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger broj;

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
         * Gets the value of the broj property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBroj() {
            return broj;
        }

        /**
         * Sets the value of the broj property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBroj(BigInteger value) {
            this.broj = value;
        }

    }

}
