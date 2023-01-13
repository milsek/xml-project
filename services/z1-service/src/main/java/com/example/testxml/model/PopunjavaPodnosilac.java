
package com.example.testxml.model;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="podnosilac-prijave" type="{http://www.ftn.uns.ac.rs/z1}Lice" maxOccurs="5"/>
 *         &lt;element name="punomocnik" type="{http://www.ftn.uns.ac.rs/z1}Lice"/>
 *         &lt;element name="zajednicki-predstavnik" type="{http://www.ftn.uns.ac.rs/z1}Lice"/>
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/z1}zig"/>
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/z1}znak"/>
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/z1}nicanska-klasifikacija"/>
 *         &lt;element name="pravo-prvenstva-i-osnov">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/z1}placene-takse"/>
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
    "podnosilacPrijave",
    "punomocnik",
    "zajednickiPredstavnik",
    "zig",
    "znak",
    "nicanskaKlasifikacija",
    "pravoPrvenstvaIOsnov",
    "placeneTakse"
})
@XmlRootElement(name = "popunjava-podnosilac", namespace = "http://www.ftn.uns.ac.rs/z1")
public class PopunjavaPodnosilac {

    @XmlElement(name = "podnosilac-prijave", namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected List<Lice> podnosilacPrijave;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected Lice punomocnik;
    @XmlElement(name = "zajednicki-predstavnik", namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected Lice zajednickiPredstavnik;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected Zig zig;
    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected Znak znak;
    @XmlElement(name = "nicanska-klasifikacija", namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected NicanskaKlasifikacija nicanskaKlasifikacija;
    @XmlElement(name = "pravo-prvenstva-i-osnov", namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected String pravoPrvenstvaIOsnov;
    @XmlElement(name = "placene-takse", namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected PlaceneTakse placeneTakse;

    /**
     * Gets the value of the podnosilacPrijave property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the podnosilacPrijave property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPodnosilacPrijave().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lice }
     * 
     * 
     */
    public List<Lice> getPodnosilacPrijave() {
        if (podnosilacPrijave == null) {
            podnosilacPrijave = new ArrayList<Lice>();
        }
        return this.podnosilacPrijave;
    }

    /**
     * Gets the value of the punomocnik property.
     * 
     * @return
     *     possible object is
     *     {@link Lice }
     *     
     */
    public Lice getPunomocnik() {
        return punomocnik;
    }

    /**
     * Sets the value of the punomocnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lice }
     *     
     */
    public void setPunomocnik(Lice value) {
        this.punomocnik = value;
    }

    /**
     * Gets the value of the zajednickiPredstavnik property.
     * 
     * @return
     *     possible object is
     *     {@link Lice }
     *     
     */
    public Lice getZajednickiPredstavnik() {
        return zajednickiPredstavnik;
    }

    /**
     * Sets the value of the zajednickiPredstavnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lice }
     *     
     */
    public void setZajednickiPredstavnik(Lice value) {
        this.zajednickiPredstavnik = value;
    }

    /**
     * Gets the value of the zig property.
     * 
     * @return
     *     possible object is
     *     {@link Zig }
     *     
     */
    public Zig getZig() {
        return zig;
    }

    /**
     * Sets the value of the zig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zig }
     *     
     */
    public void setZig(Zig value) {
        this.zig = value;
    }

    /**
     * Gets the value of the znak property.
     * 
     * @return
     *     possible object is
     *     {@link Znak }
     *     
     */
    public Znak getZnak() {
        return znak;
    }

    /**
     * Sets the value of the znak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Znak }
     *     
     */
    public void setZnak(Znak value) {
        this.znak = value;
    }

    /**
     * Gets the value of the nicanskaKlasifikacija property.
     * 
     * @return
     *     possible object is
     *     {@link NicanskaKlasifikacija }
     *     
     */
    public NicanskaKlasifikacija getNicanskaKlasifikacija() {
        return nicanskaKlasifikacija;
    }

    /**
     * Sets the value of the nicanskaKlasifikacija property.
     * 
     * @param value
     *     allowed object is
     *     {@link NicanskaKlasifikacija }
     *     
     */
    public void setNicanskaKlasifikacija(NicanskaKlasifikacija value) {
        this.nicanskaKlasifikacija = value;
    }

    /**
     * Gets the value of the pravoPrvenstvaIOsnov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPravoPrvenstvaIOsnov() {
        return pravoPrvenstvaIOsnov;
    }

    /**
     * Sets the value of the pravoPrvenstvaIOsnov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPravoPrvenstvaIOsnov(String value) {
        this.pravoPrvenstvaIOsnov = value;
    }

    /**
     * Gets the value of the placeneTakse property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceneTakse }
     *     
     */
    public PlaceneTakse getPlaceneTakse() {
        return placeneTakse;
    }

    /**
     * Sets the value of the placeneTakse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceneTakse }
     *     
     */
    public void setPlaceneTakse(PlaceneTakse value) {
        this.placeneTakse = value;
    }

}
