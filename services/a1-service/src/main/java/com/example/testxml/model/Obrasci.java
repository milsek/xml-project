
package com.example.testxml.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="obrazac-a1"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="zaglavlje"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="podaci-o-izdavacu"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="naziv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/a1}t-adresa"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="autori"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *                             &lt;element name="autor"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="pseudonim-znak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/a1}t-adresa"/&gt;
 *                                       &lt;element name="drzavljanstvo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="godina-smrti" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="podnosilac" type="{http://www.ftn.uns.ac.rs/a1}t-lice"/&gt;
 *                   &lt;element name="punomocnik" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/a1}t-adresa"/&gt;
 *                             &lt;element name="drzavljanstvo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="autorsko-delo"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="identifikator"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="alternativni-naslov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="prerada" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="naslov-originala" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="autor-originala"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="pseudonim-znak" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="radni-odnos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="nacin-koriscenja" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="vrsta" type="{http://www.ftn.uns.ac.rs/a1}t-vrsta-dela" /&gt;
 *                           &lt;attribute name="forma" type="{http://www.ftn.uns.ac.rs/a1}t-forma-dela" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="prilozi"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="opis" type="{http://www.ftn.uns.ac.rs/a1}t-prilog"/&gt;
 *                             &lt;element name="primer" type="{http://www.ftn.uns.ac.rs/a1}t-prilog"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="datum-podnosenja" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                 &lt;attribute name="broj-projave" type="{http://www.ftn.uns.ac.rs/a1}t-broj-prijave" /&gt;
 *                 &lt;attribute name="status" type="{http://www.ftn.uns.ac.rs/a1}t-status-prijave" /&gt;
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
@XmlType(name = "", propOrder = {
    "obrazacA1"
})
@XmlRootElement(name = "obrasci", namespace = "http://www.ftn.uns.ac.rs/a1")
public class Obrasci {

    @XmlElement(name = "obrazac-a1", namespace = "http://www.ftn.uns.ac.rs/a1")
    protected List<Obrasci.ObrazacA1> obrazacA1;

    /**
     * Gets the value of the obrazacA1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the obrazacA1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObrazacA1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Obrasci.ObrazacA1 }
     * 
     * 
     */
    public List<Obrasci.ObrazacA1> getObrazacA1() {
        if (obrazacA1 == null) {
            obrazacA1 = new ArrayList<Obrasci.ObrazacA1>();
        }
        return this.obrazacA1;
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
     *         &lt;element name="zaglavlje"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="podaci-o-izdavacu"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="naziv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/a1}t-adresa"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="autori"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
     *                   &lt;element name="autor"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="pseudonim-znak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/a1}t-adresa"/&gt;
     *                             &lt;element name="drzavljanstvo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="godina-smrti" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="podnosilac" type="{http://www.ftn.uns.ac.rs/a1}t-lice"/&gt;
     *         &lt;element name="punomocnik" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/a1}t-adresa"/&gt;
     *                   &lt;element name="drzavljanstvo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="autorsko-delo"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="identifikator"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="alternativni-naslov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="prerada" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="naslov-originala" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="autor-originala"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="pseudonim-znak" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="radni-odnos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="nacin-koriscenja" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="vrsta" type="{http://www.ftn.uns.ac.rs/a1}t-vrsta-dela" /&gt;
     *                 &lt;attribute name="forma" type="{http://www.ftn.uns.ac.rs/a1}t-forma-dela" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="prilozi"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element name="opis" type="{http://www.ftn.uns.ac.rs/a1}t-prilog"/&gt;
     *                   &lt;element name="primer" type="{http://www.ftn.uns.ac.rs/a1}t-prilog"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="datum-podnosenja" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="broj-projave" type="{http://www.ftn.uns.ac.rs/a1}t-broj-prijave" /&gt;
     *       &lt;attribute name="status" type="{http://www.ftn.uns.ac.rs/a1}t-status-prijave" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "zaglavlje",
        "autori",
        "podnosilac",
        "punomocnik",
        "autorskoDelo",
        "prilozi"
    })
    public static class ObrazacA1 {

        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
        protected Obrasci.ObrazacA1 .Zaglavlje zaglavlje;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
        protected Obrasci.ObrazacA1 .Autori autori;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
        protected TLice podnosilac;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1")
        protected Obrasci.ObrazacA1 .Punomocnik punomocnik;
        @XmlElement(name = "autorsko-delo", namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
        protected Obrasci.ObrazacA1 .AutorskoDelo autorskoDelo;
        @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
        protected Obrasci.ObrazacA1 .Prilozi prilozi;
        @XmlAttribute(name = "id")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlAttribute(name = "datum-podnosenja")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumPodnosenja;
        @XmlAttribute(name = "broj-projave")
        protected String brojProjave;
        @XmlAttribute(name = "status")
        protected TStatusPrijave status;

        /**
         * Gets the value of the zaglavlje property.
         * 
         * @return
         *     possible object is
         *     {@link Obrasci.ObrazacA1 .Zaglavlje }
         *     
         */
        public Obrasci.ObrazacA1 .Zaglavlje getZaglavlje() {
            return zaglavlje;
        }

        /**
         * Sets the value of the zaglavlje property.
         * 
         * @param value
         *     allowed object is
         *     {@link Obrasci.ObrazacA1 .Zaglavlje }
         *     
         */
        public void setZaglavlje(Obrasci.ObrazacA1 .Zaglavlje value) {
            this.zaglavlje = value;
        }

        /**
         * Gets the value of the autori property.
         * 
         * @return
         *     possible object is
         *     {@link Obrasci.ObrazacA1 .Autori }
         *     
         */
        public Obrasci.ObrazacA1 .Autori getAutori() {
            return autori;
        }

        /**
         * Sets the value of the autori property.
         * 
         * @param value
         *     allowed object is
         *     {@link Obrasci.ObrazacA1 .Autori }
         *     
         */
        public void setAutori(Obrasci.ObrazacA1 .Autori value) {
            this.autori = value;
        }

        /**
         * Gets the value of the podnosilac property.
         * 
         * @return
         *     possible object is
         *     {@link TLice }
         *     
         */
        public TLice getPodnosilac() {
            return podnosilac;
        }

        /**
         * Sets the value of the podnosilac property.
         * 
         * @param value
         *     allowed object is
         *     {@link TLice }
         *     
         */
        public void setPodnosilac(TLice value) {
            this.podnosilac = value;
        }

        /**
         * Gets the value of the punomocnik property.
         * 
         * @return
         *     possible object is
         *     {@link Obrasci.ObrazacA1 .Punomocnik }
         *     
         */
        public Obrasci.ObrazacA1 .Punomocnik getPunomocnik() {
            return punomocnik;
        }

        /**
         * Sets the value of the punomocnik property.
         * 
         * @param value
         *     allowed object is
         *     {@link Obrasci.ObrazacA1 .Punomocnik }
         *     
         */
        public void setPunomocnik(Obrasci.ObrazacA1 .Punomocnik value) {
            this.punomocnik = value;
        }

        /**
         * Gets the value of the autorskoDelo property.
         * 
         * @return
         *     possible object is
         *     {@link Obrasci.ObrazacA1 .AutorskoDelo }
         *     
         */
        public Obrasci.ObrazacA1 .AutorskoDelo getAutorskoDelo() {
            return autorskoDelo;
        }

        /**
         * Sets the value of the autorskoDelo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Obrasci.ObrazacA1 .AutorskoDelo }
         *     
         */
        public void setAutorskoDelo(Obrasci.ObrazacA1 .AutorskoDelo value) {
            this.autorskoDelo = value;
        }

        /**
         * Gets the value of the prilozi property.
         * 
         * @return
         *     possible object is
         *     {@link Obrasci.ObrazacA1 .Prilozi }
         *     
         */
        public Obrasci.ObrazacA1 .Prilozi getPrilozi() {
            return prilozi;
        }

        /**
         * Sets the value of the prilozi property.
         * 
         * @param value
         *     allowed object is
         *     {@link Obrasci.ObrazacA1 .Prilozi }
         *     
         */
        public void setPrilozi(Obrasci.ObrazacA1 .Prilozi value) {
            this.prilozi = value;
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

        /**
         * Gets the value of the brojProjave property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrojProjave() {
            return brojProjave;
        }

        /**
         * Sets the value of the brojProjave property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrojProjave(String value) {
            this.brojProjave = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link TStatusPrijave }
         *     
         */
        public TStatusPrijave getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link TStatusPrijave }
         *     
         */
        public void setStatus(TStatusPrijave value) {
            this.status = value;
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
         *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
         *         &lt;element name="autor"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="pseudonim-znak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/a1}t-adresa"/&gt;
         *                   &lt;element name="drzavljanstvo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="godina-smrti" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
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
        @XmlType(name = "", propOrder = {
            "autor"
        })
        public static class Autori {

            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1")
            protected List<Obrasci.ObrazacA1 .Autori.Autor> autor;

            /**
             * Gets the value of the autor property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the autor property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAutor().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Obrasci.ObrazacA1 .Autori.Autor }
             * 
             * 
             */
            public List<Obrasci.ObrazacA1 .Autori.Autor> getAutor() {
                if (autor == null) {
                    autor = new ArrayList<Obrasci.ObrazacA1 .Autori.Autor>();
                }
                return this.autor;
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
             *         &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="pseudonim-znak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/a1}t-adresa"/&gt;
             *         &lt;element name="drzavljanstvo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="godina-smrti" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ime",
                "prezime",
                "pseudonimZnak",
                "adresa",
                "drzavljanstvo",
                "godinaSmrti"
            })
            public static class Autor {

                @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
                protected String ime;
                @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
                protected String prezime;
                @XmlElement(name = "pseudonim-znak", namespace = "http://www.ftn.uns.ac.rs/a1")
                protected String pseudonimZnak;
                @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
                protected TAdresa adresa;
                @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
                protected String drzavljanstvo;
                @XmlElement(name = "godina-smrti", namespace = "http://www.ftn.uns.ac.rs/a1")
                protected BigInteger godinaSmrti;
                @XmlAttribute(name = "id")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger id;

                /**
                 * Gets the value of the ime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIme() {
                    return ime;
                }

                /**
                 * Sets the value of the ime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIme(String value) {
                    this.ime = value;
                }

                /**
                 * Gets the value of the prezime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrezime() {
                    return prezime;
                }

                /**
                 * Sets the value of the prezime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrezime(String value) {
                    this.prezime = value;
                }

                /**
                 * Gets the value of the pseudonimZnak property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPseudonimZnak() {
                    return pseudonimZnak;
                }

                /**
                 * Sets the value of the pseudonimZnak property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPseudonimZnak(String value) {
                    this.pseudonimZnak = value;
                }

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
                 * Gets the value of the drzavljanstvo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDrzavljanstvo() {
                    return drzavljanstvo;
                }

                /**
                 * Sets the value of the drzavljanstvo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDrzavljanstvo(String value) {
                    this.drzavljanstvo = value;
                }

                /**
                 * Gets the value of the godinaSmrti property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getGodinaSmrti() {
                    return godinaSmrti;
                }

                /**
                 * Sets the value of the godinaSmrti property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setGodinaSmrti(BigInteger value) {
                    this.godinaSmrti = value;
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
         *         &lt;element name="identifikator"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="alternativni-naslov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="prerada" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="naslov-originala" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="autor-originala"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="pseudonim-znak" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="radni-odnos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="nacin-koriscenja" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="vrsta" type="{http://www.ftn.uns.ac.rs/a1}t-vrsta-dela" /&gt;
         *       &lt;attribute name="forma" type="{http://www.ftn.uns.ac.rs/a1}t-forma-dela" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "identifikator",
            "prerada",
            "radniOdnos",
            "nacinKoriscenja"
        })
        public static class AutorskoDelo {

            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
            protected Obrasci.ObrazacA1 .AutorskoDelo.Identifikator identifikator;
            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1")
            protected Obrasci.ObrazacA1 .AutorskoDelo.Prerada prerada;
            @XmlElement(name = "radni-odnos", namespace = "http://www.ftn.uns.ac.rs/a1")
            protected boolean radniOdnos;
            @XmlElement(name = "nacin-koriscenja", namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
            protected String nacinKoriscenja;
            @XmlAttribute(name = "vrsta")
            protected TVrstaDela vrsta;
            @XmlAttribute(name = "forma")
            protected TFormaDela forma;

            /**
             * Gets the value of the identifikator property.
             * 
             * @return
             *     possible object is
             *     {@link Obrasci.ObrazacA1 .AutorskoDelo.Identifikator }
             *     
             */
            public Obrasci.ObrazacA1 .AutorskoDelo.Identifikator getIdentifikator() {
                return identifikator;
            }

            /**
             * Sets the value of the identifikator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Obrasci.ObrazacA1 .AutorskoDelo.Identifikator }
             *     
             */
            public void setIdentifikator(Obrasci.ObrazacA1 .AutorskoDelo.Identifikator value) {
                this.identifikator = value;
            }

            /**
             * Gets the value of the prerada property.
             * 
             * @return
             *     possible object is
             *     {@link Obrasci.ObrazacA1 .AutorskoDelo.Prerada }
             *     
             */
            public Obrasci.ObrazacA1 .AutorskoDelo.Prerada getPrerada() {
                return prerada;
            }

            /**
             * Sets the value of the prerada property.
             * 
             * @param value
             *     allowed object is
             *     {@link Obrasci.ObrazacA1 .AutorskoDelo.Prerada }
             *     
             */
            public void setPrerada(Obrasci.ObrazacA1 .AutorskoDelo.Prerada value) {
                this.prerada = value;
            }

            /**
             * Gets the value of the radniOdnos property.
             * 
             */
            public boolean isRadniOdnos() {
                return radniOdnos;
            }

            /**
             * Sets the value of the radniOdnos property.
             * 
             */
            public void setRadniOdnos(boolean value) {
                this.radniOdnos = value;
            }

            /**
             * Gets the value of the nacinKoriscenja property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNacinKoriscenja() {
                return nacinKoriscenja;
            }

            /**
             * Sets the value of the nacinKoriscenja property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNacinKoriscenja(String value) {
                this.nacinKoriscenja = value;
            }

            /**
             * Gets the value of the vrsta property.
             * 
             * @return
             *     possible object is
             *     {@link TVrstaDela }
             *     
             */
            public TVrstaDela getVrsta() {
                return vrsta;
            }

            /**
             * Sets the value of the vrsta property.
             * 
             * @param value
             *     allowed object is
             *     {@link TVrstaDela }
             *     
             */
            public void setVrsta(TVrstaDela value) {
                this.vrsta = value;
            }

            /**
             * Gets the value of the forma property.
             * 
             * @return
             *     possible object is
             *     {@link TFormaDela }
             *     
             */
            public TFormaDela getForma() {
                return forma;
            }

            /**
             * Sets the value of the forma property.
             * 
             * @param value
             *     allowed object is
             *     {@link TFormaDela }
             *     
             */
            public void setForma(TFormaDela value) {
                this.forma = value;
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
             *         &lt;element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="alternativni-naslov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "naslov",
                "alternativniNaslov"
            })
            public static class Identifikator {

                @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
                protected String naslov;
                @XmlElement(name = "alternativni-naslov", namespace = "http://www.ftn.uns.ac.rs/a1")
                protected String alternativniNaslov;

                /**
                 * Gets the value of the naslov property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNaslov() {
                    return naslov;
                }

                /**
                 * Sets the value of the naslov property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNaslov(String value) {
                    this.naslov = value;
                }

                /**
                 * Gets the value of the alternativniNaslov property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAlternativniNaslov() {
                    return alternativniNaslov;
                }

                /**
                 * Sets the value of the alternativniNaslov property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAlternativniNaslov(String value) {
                    this.alternativniNaslov = value;
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
             *         &lt;element name="naslov-originala" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="autor-originala"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="pseudonim-znak" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            @XmlType(name = "", propOrder = {
                "naslovOriginala",
                "autorOriginala"
            })
            public static class Prerada {

                @XmlElement(name = "naslov-originala", namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
                protected String naslovOriginala;
                @XmlElement(name = "autor-originala", namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
                protected Obrasci.ObrazacA1 .AutorskoDelo.Prerada.AutorOriginala autorOriginala;

                /**
                 * Gets the value of the naslovOriginala property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNaslovOriginala() {
                    return naslovOriginala;
                }

                /**
                 * Sets the value of the naslovOriginala property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNaslovOriginala(String value) {
                    this.naslovOriginala = value;
                }

                /**
                 * Gets the value of the autorOriginala property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Obrasci.ObrazacA1 .AutorskoDelo.Prerada.AutorOriginala }
                 *     
                 */
                public Obrasci.ObrazacA1 .AutorskoDelo.Prerada.AutorOriginala getAutorOriginala() {
                    return autorOriginala;
                }

                /**
                 * Sets the value of the autorOriginala property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Obrasci.ObrazacA1 .AutorskoDelo.Prerada.AutorOriginala }
                 *     
                 */
                public void setAutorOriginala(Obrasci.ObrazacA1 .AutorskoDelo.Prerada.AutorOriginala value) {
                    this.autorOriginala = value;
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
                 *         &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="pseudonim-znak" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "ime",
                    "prezime",
                    "pseudonimZnak"
                })
                public static class AutorOriginala {

                    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
                    protected String ime;
                    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
                    protected String prezime;
                    @XmlElement(name = "pseudonim-znak", namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
                    protected String pseudonimZnak;

                    /**
                     * Gets the value of the ime property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIme() {
                        return ime;
                    }

                    /**
                     * Sets the value of the ime property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIme(String value) {
                        this.ime = value;
                    }

                    /**
                     * Gets the value of the prezime property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPrezime() {
                        return prezime;
                    }

                    /**
                     * Sets the value of the prezime property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPrezime(String value) {
                        this.prezime = value;
                    }

                    /**
                     * Gets the value of the pseudonimZnak property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPseudonimZnak() {
                        return pseudonimZnak;
                    }

                    /**
                     * Sets the value of the pseudonimZnak property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPseudonimZnak(String value) {
                        this.pseudonimZnak = value;
                    }

                }

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
         *       &lt;choice&gt;
         *         &lt;element name="opis" type="{http://www.ftn.uns.ac.rs/a1}t-prilog"/&gt;
         *         &lt;element name="primer" type="{http://www.ftn.uns.ac.rs/a1}t-prilog"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "opis",
            "primer"
        })
        public static class Prilozi {

            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1")
            protected TPrilog opis;
            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1")
            protected TPrilog primer;

            /**
             * Gets the value of the opis property.
             * 
             * @return
             *     possible object is
             *     {@link TPrilog }
             *     
             */
            public TPrilog getOpis() {
                return opis;
            }

            /**
             * Sets the value of the opis property.
             * 
             * @param value
             *     allowed object is
             *     {@link TPrilog }
             *     
             */
            public void setOpis(TPrilog value) {
                this.opis = value;
            }

            /**
             * Gets the value of the primer property.
             * 
             * @return
             *     possible object is
             *     {@link TPrilog }
             *     
             */
            public TPrilog getPrimer() {
                return primer;
            }

            /**
             * Sets the value of the primer property.
             * 
             * @param value
             *     allowed object is
             *     {@link TPrilog }
             *     
             */
            public void setPrimer(TPrilog value) {
                this.primer = value;
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
         *         &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/a1}t-adresa"/&gt;
         *         &lt;element name="drzavljanstvo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "ime",
            "prezime",
            "adresa",
            "drzavljanstvo"
        })
        public static class Punomocnik {

            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
            protected String ime;
            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
            protected String prezime;
            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
            protected TAdresa adresa;
            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
            protected String drzavljanstvo;

            /**
             * Gets the value of the ime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIme() {
                return ime;
            }

            /**
             * Sets the value of the ime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIme(String value) {
                this.ime = value;
            }

            /**
             * Gets the value of the prezime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrezime() {
                return prezime;
            }

            /**
             * Sets the value of the prezime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrezime(String value) {
                this.prezime = value;
            }

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
             * Gets the value of the drzavljanstvo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDrzavljanstvo() {
                return drzavljanstvo;
            }

            /**
             * Sets the value of the drzavljanstvo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDrzavljanstvo(String value) {
                this.drzavljanstvo = value;
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
         *         &lt;element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="podaci-o-izdavacu"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="naziv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/a1}t-adresa"/&gt;
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
        @XmlType(name = "", propOrder = {
            "naslov",
            "podaciOIzdavacu"
        })
        public static class Zaglavlje {

            @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
            protected String naslov;
            @XmlElement(name = "podaci-o-izdavacu", namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
            protected Obrasci.ObrazacA1 .Zaglavlje.PodaciOIzdavacu podaciOIzdavacu;

            /**
             * Gets the value of the naslov property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNaslov() {
                return naslov;
            }

            /**
             * Sets the value of the naslov property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNaslov(String value) {
                this.naslov = value;
            }

            /**
             * Gets the value of the podaciOIzdavacu property.
             * 
             * @return
             *     possible object is
             *     {@link Obrasci.ObrazacA1 .Zaglavlje.PodaciOIzdavacu }
             *     
             */
            public Obrasci.ObrazacA1 .Zaglavlje.PodaciOIzdavacu getPodaciOIzdavacu() {
                return podaciOIzdavacu;
            }

            /**
             * Sets the value of the podaciOIzdavacu property.
             * 
             * @param value
             *     allowed object is
             *     {@link Obrasci.ObrazacA1 .Zaglavlje.PodaciOIzdavacu }
             *     
             */
            public void setPodaciOIzdavacu(Obrasci.ObrazacA1 .Zaglavlje.PodaciOIzdavacu value) {
                this.podaciOIzdavacu = value;
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
             *         &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/a1}t-adresa"/&gt;
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
                "adresa"
            })
            public static class PodaciOIzdavacu {

                @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
                protected String naziv;
                @XmlElement(namespace = "http://www.ftn.uns.ac.rs/a1", required = true)
                protected TAdresa adresa;

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

            }

        }

    }

}
