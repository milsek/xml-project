
package A1.model;

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
 *       &lt;sequence>
 *         &lt;element name="zaglavlje">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="podaci-o-izdavacu">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="naziv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="adresa" type="{a1}t-adresa"/>
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
 *         &lt;element name="autori">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="autor">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="pseudonim-znak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="adresa" type="{a1}t-adresa"/>
 *                             &lt;element name="drzavljanstvo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="godina-smrti" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="podnosilac" type="{a1}t-lice"/>
 *         &lt;element name="punomocnik">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="adresa" type="{a1}t-adresa"/>
 *                   &lt;element name="drzavljanstvo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="autorsko-delo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="identifikator">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="alternativni-naslov" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="prerada">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="naslov-originala" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="autor-originala">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="pseudonim-znak" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="radni-odnos" type="{a1}t-da-ne"/>
 *                   &lt;element name="nacin-koriscenja" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="vrsta" type="{a1}t-vrsta-dela" />
 *                 &lt;attribute name="forma" type="{a1}t-forma-dela" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="prilozi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="opis" type="{a1}t-prilog"/>
 *                   &lt;element name="primer" type="{a1}t-prilog"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="identifikacija-prijave">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="broj" type="{a1}t-broj-prijave"/>
 *                   &lt;element name="datum-podnosenja" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
    "zaglavlje",
    "autori",
    "podnosilac",
    "punomocnik",
    "autorskoDelo",
    "prilozi",
    "identifikacijaPrijave"
})
@XmlRootElement(name = "obrazac-a1", namespace = "a1")
public class ObrazacA1 {

    @XmlElement(namespace = "a1", required = true)
    protected ObrazacA1 .Zaglavlje zaglavlje;
    @XmlElement(namespace = "a1", required = true)
    protected ObrazacA1 .Autori autori;
    @XmlElement(namespace = "a1", required = true)
    protected TLice podnosilac;
    @XmlElement(namespace = "a1", required = true)
    protected ObrazacA1 .Punomocnik punomocnik;
    @XmlElement(name = "autorsko-delo", namespace = "a1", required = true)
    protected ObrazacA1 .AutorskoDelo autorskoDelo;
    @XmlElement(namespace = "a1", required = true)
    protected ObrazacA1 .Prilozi prilozi;
    @XmlElement(name = "identifikacija-prijave", namespace = "a1", required = true)
    protected ObrazacA1 .IdentifikacijaPrijave identifikacijaPrijave;

    /**
     * Gets the value of the zaglavlje property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacA1 .Zaglavlje }
     *     
     */
    public ObrazacA1 .Zaglavlje getZaglavlje() {
        return zaglavlje;
    }

    /**
     * Sets the value of the zaglavlje property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacA1 .Zaglavlje }
     *     
     */
    public void setZaglavlje(ObrazacA1 .Zaglavlje value) {
        this.zaglavlje = value;
    }

    /**
     * Gets the value of the autori property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacA1 .Autori }
     *     
     */
    public ObrazacA1 .Autori getAutori() {
        return autori;
    }

    /**
     * Sets the value of the autori property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacA1 .Autori }
     *     
     */
    public void setAutori(ObrazacA1 .Autori value) {
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
     *     {@link ObrazacA1 .Punomocnik }
     *     
     */
    public ObrazacA1 .Punomocnik getPunomocnik() {
        return punomocnik;
    }

    /**
     * Sets the value of the punomocnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacA1 .Punomocnik }
     *     
     */
    public void setPunomocnik(ObrazacA1 .Punomocnik value) {
        this.punomocnik = value;
    }

    /**
     * Gets the value of the autorskoDelo property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacA1 .AutorskoDelo }
     *     
     */
    public ObrazacA1 .AutorskoDelo getAutorskoDelo() {
        return autorskoDelo;
    }

    /**
     * Sets the value of the autorskoDelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacA1 .AutorskoDelo }
     *     
     */
    public void setAutorskoDelo(ObrazacA1 .AutorskoDelo value) {
        this.autorskoDelo = value;
    }

    /**
     * Gets the value of the prilozi property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacA1 .Prilozi }
     *     
     */
    public ObrazacA1 .Prilozi getPrilozi() {
        return prilozi;
    }

    /**
     * Sets the value of the prilozi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacA1 .Prilozi }
     *     
     */
    public void setPrilozi(ObrazacA1 .Prilozi value) {
        this.prilozi = value;
    }

    /**
     * Gets the value of the identifikacijaPrijave property.
     * 
     * @return
     *     possible object is
     *     {@link ObrazacA1 .IdentifikacijaPrijave }
     *     
     */
    public ObrazacA1 .IdentifikacijaPrijave getIdentifikacijaPrijave() {
        return identifikacijaPrijave;
    }

    /**
     * Sets the value of the identifikacijaPrijave property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObrazacA1 .IdentifikacijaPrijave }
     *     
     */
    public void setIdentifikacijaPrijave(ObrazacA1 .IdentifikacijaPrijave value) {
        this.identifikacijaPrijave = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="autor">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="pseudonim-znak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="adresa" type="{a1}t-adresa"/>
     *                   &lt;element name="drzavljanstvo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="godina-smrti" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
        "autor"
    })
    public static class Autori {

        @XmlElement(namespace = "a1")
        protected List<ObrazacA1 .Autori.Autor> autor;

        /**
         * Gets the value of the autor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
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
         * {@link ObrazacA1 .Autori.Autor }
         * 
         * 
         */
        public List<ObrazacA1 .Autori.Autor> getAutor() {
            if (autor == null) {
                autor = new ArrayList<ObrazacA1 .Autori.Autor>();
            }
            return this.autor;
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
         *         &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="pseudonim-znak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="adresa" type="{a1}t-adresa"/>
         *         &lt;element name="drzavljanstvo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="godina-smrti" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
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

            @XmlElement(namespace = "a1", required = true)
            protected String ime;
            @XmlElement(namespace = "a1", required = true)
            protected String prezime;
            @XmlElement(name = "pseudonim-znak", namespace = "a1")
            protected String pseudonimZnak;
            @XmlElement(namespace = "a1", required = true)
            protected TAdresa adresa;
            @XmlElement(namespace = "a1", required = true)
            protected String drzavljanstvo;
            @XmlElement(name = "godina-smrti", namespace = "a1")
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="identifikator">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="alternativni-naslov" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="prerada">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="naslov-originala" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="autor-originala">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="pseudonim-znak" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *         &lt;element name="radni-odnos" type="{a1}t-da-ne"/>
     *         &lt;element name="nacin-koriscenja" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="vrsta" type="{a1}t-vrsta-dela" />
     *       &lt;attribute name="forma" type="{a1}t-forma-dela" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
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

        @XmlElement(namespace = "a1", required = true)
        protected ObrazacA1 .AutorskoDelo.Identifikator identifikator;
        @XmlElement(namespace = "a1", required = true)
        protected ObrazacA1 .AutorskoDelo.Prerada prerada;
        @XmlElement(name = "radni-odnos", namespace = "a1", required = true)
        @XmlSchemaType(name = "string")
        protected TDaNe radniOdnos;
        @XmlElement(name = "nacin-koriscenja", namespace = "a1", required = true)
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
         *     {@link ObrazacA1 .AutorskoDelo.Identifikator }
         *     
         */
        public ObrazacA1 .AutorskoDelo.Identifikator getIdentifikator() {
            return identifikator;
        }

        /**
         * Sets the value of the identifikator property.
         * 
         * @param value
         *     allowed object is
         *     {@link ObrazacA1 .AutorskoDelo.Identifikator }
         *     
         */
        public void setIdentifikator(ObrazacA1 .AutorskoDelo.Identifikator value) {
            this.identifikator = value;
        }

        /**
         * Gets the value of the prerada property.
         * 
         * @return
         *     possible object is
         *     {@link ObrazacA1 .AutorskoDelo.Prerada }
         *     
         */
        public ObrazacA1 .AutorskoDelo.Prerada getPrerada() {
            return prerada;
        }

        /**
         * Sets the value of the prerada property.
         * 
         * @param value
         *     allowed object is
         *     {@link ObrazacA1 .AutorskoDelo.Prerada }
         *     
         */
        public void setPrerada(ObrazacA1 .AutorskoDelo.Prerada value) {
            this.prerada = value;
        }

        /**
         * Gets the value of the radniOdnos property.
         * 
         * @return
         *     possible object is
         *     {@link TDaNe }
         *     
         */
        public TDaNe getRadniOdnos() {
            return radniOdnos;
        }

        /**
         * Sets the value of the radniOdnos property.
         * 
         * @param value
         *     allowed object is
         *     {@link TDaNe }
         *     
         */
        public void setRadniOdnos(TDaNe value) {
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
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="alternativni-naslov" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "alternativniNaslov"
        })
        public static class Identifikator {

            @XmlElement(namespace = "a1", required = true)
            protected String naslov;
            @XmlElement(name = "alternativni-naslov", namespace = "a1", required = true)
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
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="naslov-originala" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="autor-originala">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="pseudonim-znak" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "naslovOriginala",
            "autorOriginala"
        })
        public static class Prerada {

            @XmlElement(name = "naslov-originala", namespace = "a1", required = true)
            protected String naslovOriginala;
            @XmlElement(name = "autor-originala", namespace = "a1", required = true)
            protected ObrazacA1 .AutorskoDelo.Prerada.AutorOriginala autorOriginala;

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
             *     {@link ObrazacA1 .AutorskoDelo.Prerada.AutorOriginala }
             *     
             */
            public ObrazacA1 .AutorskoDelo.Prerada.AutorOriginala getAutorOriginala() {
                return autorOriginala;
            }

            /**
             * Sets the value of the autorOriginala property.
             * 
             * @param value
             *     allowed object is
             *     {@link ObrazacA1 .AutorskoDelo.Prerada.AutorOriginala }
             *     
             */
            public void setAutorOriginala(ObrazacA1 .AutorskoDelo.Prerada.AutorOriginala value) {
                this.autorOriginala = value;
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
             *         &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="pseudonim-znak" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "ime",
                "prezime",
                "pseudonimZnak"
            })
            public static class AutorOriginala {

                @XmlElement(namespace = "a1", required = true)
                protected String ime;
                @XmlElement(namespace = "a1", required = true)
                protected String prezime;
                @XmlElement(name = "pseudonim-znak", namespace = "a1", required = true)
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="broj" type="{a1}t-broj-prijave"/>
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
        "broj",
        "datumPodnosenja"
    })
    public static class IdentifikacijaPrijave {

        @XmlElement(namespace = "a1", required = true)
        protected String broj;
        @XmlElement(name = "datum-podnosenja", namespace = "a1", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumPodnosenja;

        /**
         * Gets the value of the broj property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBroj() {
            return broj;
        }

        /**
         * Sets the value of the broj property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBroj(String value) {
            this.broj = value;
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
     *       &lt;choice>
     *         &lt;element name="opis" type="{a1}t-prilog"/>
     *         &lt;element name="primer" type="{a1}t-prilog"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
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

        @XmlElement(namespace = "a1")
        protected TPrilog opis;
        @XmlElement(namespace = "a1")
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="adresa" type="{a1}t-adresa"/>
     *         &lt;element name="drzavljanstvo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "ime",
        "prezime",
        "adresa",
        "drzavljanstvo"
    })
    public static class Punomocnik {

        @XmlElement(namespace = "a1", required = true)
        protected String ime;
        @XmlElement(namespace = "a1", required = true)
        protected String prezime;
        @XmlElement(namespace = "a1", required = true)
        protected TAdresa adresa;
        @XmlElement(namespace = "a1", required = true)
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="naslov" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="podaci-o-izdavacu">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="naziv" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="adresa" type="{a1}t-adresa"/>
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
        "naslov",
        "podaciOIzdavacu"
    })
    public static class Zaglavlje {

        @XmlElement(namespace = "a1", required = true)
        protected String naslov;
        @XmlElement(name = "podaci-o-izdavacu", namespace = "a1", required = true)
        protected ObrazacA1 .Zaglavlje.PodaciOIzdavacu podaciOIzdavacu;

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
         *     {@link ObrazacA1 .Zaglavlje.PodaciOIzdavacu }
         *     
         */
        public ObrazacA1 .Zaglavlje.PodaciOIzdavacu getPodaciOIzdavacu() {
            return podaciOIzdavacu;
        }

        /**
         * Sets the value of the podaciOIzdavacu property.
         * 
         * @param value
         *     allowed object is
         *     {@link ObrazacA1 .Zaglavlje.PodaciOIzdavacu }
         *     
         */
        public void setPodaciOIzdavacu(ObrazacA1 .Zaglavlje.PodaciOIzdavacu value) {
            this.podaciOIzdavacu = value;
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
         *         &lt;element name="adresa" type="{a1}t-adresa"/>
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
        public static class PodaciOIzdavacu {

            @XmlElement(namespace = "a1", required = true)
            protected String naziv;
            @XmlElement(namespace = "a1", required = true)
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
