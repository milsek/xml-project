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
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="primalac-zahteva">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="naziv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="adresa" type="{p1}t-adresa"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="naziv-pronalaska" maxOccurs="2" minOccurs="2">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="jezik" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="srpski"/>
 *                       &lt;enumeration value="engleski"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="podnosilac" type="{p1}t-podnosilac"/>
 *         &lt;element name="pronalazac">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{p1}t-pronalazac">
 *                 &lt;attribute name="anoniman" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="punomocnik" type="{p1}t-punomocnik"/>
 *         &lt;element name="podaci-o-dostavljanju">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="adresa" type="{p1}t-adresa"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="nacin" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="elektronski dokument"/>
 *                       &lt;enumeration value="papirni dokument"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="podaci-o-prvobitnoj-prijavi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="broj-prijave" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="datum-podnosenja" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="zahtev-za-priznanje-prava-prvenstva">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ranija-prijava" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="datum-podnosenja" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="broj" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                             &lt;element name="oznaka-organizacije">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="[A-Z][A-Z]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="broj-prijave" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="datum-prijave" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="priznati-datum-prijave" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "primalacZahteva",
    "nazivPronalaska",
    "podnosilac",
    "pronalazac",
    "punomocnik",
    "podaciODostavljanju",
    "podaciOPrvobitnojPrijavi",
    "zahtevZaPriznanjePravaPrvenstva"
})
@XmlRootElement(name = "obrazac-p1", namespace = "p1")
public class ObrazacP1 {

    @XmlElement(name = "primalac-zahteva", namespace = "p1", required = true)
    protected ObrazacP1 .PrimalacZahteva primalacZahteva;
    @XmlElement(name = "naziv-pronalaska", namespace = "p1", required = true)
    protected List<ObrazacP1 .NazivPronalaska> nazivPronalaska;
    @XmlElement(namespace = "p1", required = true)
    protected TPodnosilac podnosilac;
    @XmlElement(namespace = "p1", required = true)
    protected ObrazacP1 .Pronalazac pronalazac;
    @XmlElement(namespace = "p1", required = true)
    protected TPunomocnik punomocnik;
    @XmlElement(name = "podaci-o-dostavljanju", namespace = "p1", required = true)
    protected ObrazacP1 .PodaciODostavljanju podaciODostavljanju;
    @XmlElement(name = "podaci-o-prvobitnoj-prijavi", namespace = "p1", required = true)
    protected ObrazacP1 .PodaciOPrvobitnojPrijavi podaciOPrvobitnojPrijavi;
    @XmlElement(name = "zahtev-za-priznanje-prava-prvenstva", namespace = "p1", required = true)
    protected ObrazacP1 .ZahtevZaPriznanjePravaPrvenstva zahtevZaPriznanjePravaPrvenstva;
    @XmlAttribute(name = "broj-prijave", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger brojPrijave;
    @XmlAttribute(name = "datum-prijave", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPrijave;
    @XmlAttribute(name = "priznati-datum-prijave", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar priznatiDatumPrijave;

    /**
     * Gets the value of the primalacZahteva property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacP1 .PrimalacZahteva }
     *     
     */
    public ObrazacP1 .PrimalacZahteva getPrimalacZahteva() {
        return primalacZahteva;
    }

    /**
     * Sets the value of the primalacZahteva property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacP1 .PrimalacZahteva }
     *     
     */
    public void setPrimalacZahteva(ObrazacP1 .PrimalacZahteva value) {
        this.primalacZahteva = value;
    }

    /**
     * Gets the value of the nazivPronalaska property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nazivPronalaska property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNazivPronalaska().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObrazacP1 .NazivPronalaska }
     * 
     * 
     */
    public List<ObrazacP1 .NazivPronalaska> getNazivPronalaska() {
        if (nazivPronalaska == null) {
            nazivPronalaska = new ArrayList<ObrazacP1 .NazivPronalaska>();
        }
        return this.nazivPronalaska;
    }

    /**
     * Gets the value of the podnosilac property.
     * 
     * @return
     *     possible object is
     *     {@link TPodnosilac }
     *     
     */
    public TPodnosilac getPodnosilac() {
        return podnosilac;
    }

    /**
     * Sets the value of the podnosilac property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPodnosilac }
     *     
     */
    public void setPodnosilac(TPodnosilac value) {
        this.podnosilac = value;
    }

    /**
     * Gets the value of the pronalazac property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacP1 .Pronalazac }
     *     
     */
    public ObrazacP1 .Pronalazac getPronalazac() {
        return pronalazac;
    }

    /**
     * Sets the value of the pronalazac property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacP1 .Pronalazac }
     *     
     */
    public void setPronalazac(ObrazacP1 .Pronalazac value) {
        this.pronalazac = value;
    }

    /**
     * Gets the value of the punomocnik property.
     * 
     * @return
     *     possible object is
     *     {@link TPunomocnik }
     *     
     */
    public TPunomocnik getPunomocnik() {
        return punomocnik;
    }

    /**
     * Sets the value of the punomocnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPunomocnik }
     *     
     */
    public void setPunomocnik(TPunomocnik value) {
        this.punomocnik = value;
    }

    /**
     * Gets the value of the podaciODostavljanju property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacP1 .PodaciODostavljanju }
     *     
     */
    public ObrazacP1 .PodaciODostavljanju getPodaciODostavljanju() {
        return podaciODostavljanju;
    }

    /**
     * Sets the value of the podaciODostavljanju property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacP1 .PodaciODostavljanju }
     *     
     */
    public void setPodaciODostavljanju(ObrazacP1 .PodaciODostavljanju value) {
        this.podaciODostavljanju = value;
    }

    /**
     * Gets the value of the podaciOPrvobitnojPrijavi property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacP1 .PodaciOPrvobitnojPrijavi }
     *     
     */
    public ObrazacP1 .PodaciOPrvobitnojPrijavi getPodaciOPrvobitnojPrijavi() {
        return podaciOPrvobitnojPrijavi;
    }

    /**
     * Sets the value of the podaciOPrvobitnojPrijavi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacP1 .PodaciOPrvobitnojPrijavi }
     *     
     */
    public void setPodaciOPrvobitnojPrijavi(ObrazacP1 .PodaciOPrvobitnojPrijavi value) {
        this.podaciOPrvobitnojPrijavi = value;
    }

    /**
     * Gets the value of the zahtevZaPriznanjePravaPrvenstva property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacP1 .ZahtevZaPriznanjePravaPrvenstva }
     *     
     */
    public ObrazacP1 .ZahtevZaPriznanjePravaPrvenstva getZahtevZaPriznanjePravaPrvenstva() {
        return zahtevZaPriznanjePravaPrvenstva;
    }

    /**
     * Sets the value of the zahtevZaPriznanjePravaPrvenstva property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacP1 .ZahtevZaPriznanjePravaPrvenstva }
     *     
     */
    public void setZahtevZaPriznanjePravaPrvenstva(ObrazacP1 .ZahtevZaPriznanjePravaPrvenstva value) {
        this.zahtevZaPriznanjePravaPrvenstva = value;
    }

    /**
     * Gets the value of the brojPrijave property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrojPrijave() {
        return brojPrijave;
    }

    /**
     * Sets the value of the brojPrijave property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrojPrijave(BigInteger value) {
        this.brojPrijave = value;
    }

    /**
     * Gets the value of the datumPrijave property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumPrijave() {
        return datumPrijave;
    }

    /**
     * Sets the value of the datumPrijave property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumPrijave(XMLGregorianCalendar value) {
        this.datumPrijave = value;
    }

    /**
     * Gets the value of the priznatiDatumPrijave property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriznatiDatumPrijave() {
        return priznatiDatumPrijave;
    }

    /**
     * Sets the value of the priznatiDatumPrijave property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriznatiDatumPrijave(XMLGregorianCalendar value) {
        this.priznatiDatumPrijave = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="jezik" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="srpski"/>
     *             &lt;enumeration value="engleski"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class NazivPronalaska {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "jezik", required = true)
        protected String jezik;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the jezik property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJezik() {
            return jezik;
        }

        /**
         * Sets the value of the jezik property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJezik(String value) {
            this.jezik = value;
        }

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
     *         &lt;element name="adresa" type="{p1}t-adresa"/>
     *       &lt;/sequence>
     *       &lt;attribute name="nacin" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="elektronski dokument"/>
     *             &lt;enumeration value="papirni dokument"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "adresa"
    })
    public static class PodaciODostavljanju {

        @XmlElement(namespace = "p1", required = true)
        protected TAdresa adresa;
        @XmlAttribute(name = "nacin", required = true)
        protected String nacin;

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
         * Gets the value of the nacin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNacin() {
            return nacin;
        }

        /**
         * Sets the value of the nacin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNacin(String value) {
            this.nacin = value;
        }

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
     *         &lt;element name="broj-prijave" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
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
        "brojPrijave",
        "datumPodnosenja"
    })
    public static class PodaciOPrvobitnojPrijavi {

        @XmlElement(name = "broj-prijave", namespace = "p1", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger brojPrijave;
        @XmlElement(name = "datum-podnosenja", namespace = "p1", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumPodnosenja;

        /**
         * Gets the value of the brojPrijave property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBrojPrijave() {
            return brojPrijave;
        }

        /**
         * Sets the value of the brojPrijave property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBrojPrijave(BigInteger value) {
            this.brojPrijave = value;
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
     *         &lt;element name="naziv" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="adresa" type="{p1}t-adresa"/>
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
        "adresa"
    })
    public static class PrimalacZahteva {

        @XmlElement(namespace = "p1", required = true)
        protected String naziv;
        @XmlElement(namespace = "p1", required = true)
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{p1}t-pronalazac">
     *       &lt;attribute name="anoniman" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Pronalazac
        extends TPronalazac
    {

        @XmlAttribute(name = "anoniman")
        protected Boolean anoniman;

        /**
         * Gets the value of the anoniman property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAnoniman() {
            return anoniman;
        }

        /**
         * Sets the value of the anoniman property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAnoniman(Boolean value) {
            this.anoniman = value;
        }

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
     *         &lt;element name="ranija-prijava" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="datum-podnosenja" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="broj" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *                   &lt;element name="oznaka-organizacije">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="[A-Z][A-Z]"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
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
        "ranijaPrijava"
    })
    public static class ZahtevZaPriznanjePravaPrvenstva {

        @XmlElement(name = "ranija-prijava", namespace = "p1", required = true)
        protected List<ObrazacP1 .ZahtevZaPriznanjePravaPrvenstva.RanijaPrijava> ranijaPrijava;

        /**
         * Gets the value of the ranijaPrijava property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ranijaPrijava property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRanijaPrijava().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ObrazacP1 .ZahtevZaPriznanjePravaPrvenstva.RanijaPrijava }
         * 
         * 
         */
        public List<ObrazacP1 .ZahtevZaPriznanjePravaPrvenstva.RanijaPrijava> getRanijaPrijava() {
            if (ranijaPrijava == null) {
                ranijaPrijava = new ArrayList<ObrazacP1 .ZahtevZaPriznanjePravaPrvenstva.RanijaPrijava>();
            }
            return this.ranijaPrijava;
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
         *         &lt;element name="datum-podnosenja" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="broj" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
         *         &lt;element name="oznaka-organizacije">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="[A-Z][A-Z]"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "datumPodnosenja",
            "broj",
            "oznakaOrganizacije"
        })
        public static class RanijaPrijava {

            @XmlElement(name = "datum-podnosenja", namespace = "p1", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datumPodnosenja;
            @XmlElement(namespace = "p1", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger broj;
            @XmlElement(name = "oznaka-organizacije", namespace = "p1", required = true)
            protected String oznakaOrganizacije;

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

            /**
             * Gets the value of the oznakaOrganizacije property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOznakaOrganizacije() {
                return oznakaOrganizacije;
            }

            /**
             * Sets the value of the oznakaOrganizacije property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOznakaOrganizacije(String value) {
                this.oznakaOrganizacije = value;
            }

        }

    }

}
