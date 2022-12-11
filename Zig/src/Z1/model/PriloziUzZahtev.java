
package Z1.model;

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
 *         &lt;element name="primerak-znaka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spisak-robe-i-usluga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="punomocje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="generalno-punomocje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="punomocje-naknadno-dostavljeno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsti-akt-o-kolektivnom-zigu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dokaz-o-pravu-prvenstva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dokaz-o-uplati-takse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "primerakZnaka",
    "spisakRobeIUsluga",
    "punomocje",
    "generalnoPunomocje",
    "punomocjeNaknadnoDostavljeno",
    "opstiAktOKolektivnomZigu",
    "dokazOPravuPrvenstva",
    "dokazOUplatiTakse"
})
@XmlRootElement(name = "prilozi-uz-zahtev", namespace = "z1")
public class PriloziUzZahtev {

    @XmlElement(name = "primerak-znaka", namespace = "z1")
    protected String primerakZnaka;
    @XmlElement(name = "spisak-robe-i-usluga", namespace = "z1")
    protected String spisakRobeIUsluga;
    @XmlElement(namespace = "z1")
    protected String punomocje;
    @XmlElement(name = "generalno-punomocje", namespace = "z1")
    protected String generalnoPunomocje;
    @XmlElement(name = "punomocje-naknadno-dostavljeno", namespace = "z1")
    protected String punomocjeNaknadnoDostavljeno;
    @XmlElement(name = "opsti-akt-o-kolektivnom-zigu", namespace = "z1")
    protected String opstiAktOKolektivnomZigu;
    @XmlElement(name = "dokaz-o-pravu-prvenstva", namespace = "z1")
    protected String dokazOPravuPrvenstva;
    @XmlElement(name = "dokaz-o-uplati-takse", namespace = "z1")
    protected String dokazOUplatiTakse;

    /**
     * Gets the value of the primerakZnaka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerakZnaka() {
        return primerakZnaka;
    }

    /**
     * Sets the value of the primerakZnaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerakZnaka(String value) {
        this.primerakZnaka = value;
    }

    /**
     * Gets the value of the spisakRobeIUsluga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpisakRobeIUsluga() {
        return spisakRobeIUsluga;
    }

    /**
     * Sets the value of the spisakRobeIUsluga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpisakRobeIUsluga(String value) {
        this.spisakRobeIUsluga = value;
    }

    /**
     * Gets the value of the punomocje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunomocje() {
        return punomocje;
    }

    /**
     * Sets the value of the punomocje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunomocje(String value) {
        this.punomocje = value;
    }

    /**
     * Gets the value of the generalnoPunomocje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralnoPunomocje() {
        return generalnoPunomocje;
    }

    /**
     * Sets the value of the generalnoPunomocje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralnoPunomocje(String value) {
        this.generalnoPunomocje = value;
    }

    /**
     * Gets the value of the punomocjeNaknadnoDostavljeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunomocjeNaknadnoDostavljeno() {
        return punomocjeNaknadnoDostavljeno;
    }

    /**
     * Sets the value of the punomocjeNaknadnoDostavljeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunomocjeNaknadnoDostavljeno(String value) {
        this.punomocjeNaknadnoDostavljeno = value;
    }

    /**
     * Gets the value of the opstiAktOKolektivnomZigu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpstiAktOKolektivnomZigu() {
        return opstiAktOKolektivnomZigu;
    }

    /**
     * Sets the value of the opstiAktOKolektivnomZigu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpstiAktOKolektivnomZigu(String value) {
        this.opstiAktOKolektivnomZigu = value;
    }

    /**
     * Gets the value of the dokazOPravuPrvenstva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDokazOPravuPrvenstva() {
        return dokazOPravuPrvenstva;
    }

    /**
     * Sets the value of the dokazOPravuPrvenstva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDokazOPravuPrvenstva(String value) {
        this.dokazOPravuPrvenstva = value;
    }

    /**
     * Gets the value of the dokazOUplatiTakse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDokazOUplatiTakse() {
        return dokazOUplatiTakse;
    }

    /**
     * Sets the value of the dokazOUplatiTakse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDokazOUplatiTakse(String value) {
        this.dokazOUplatiTakse = value;
    }

    public String toString(int numOfTabs) {
        String tabs = "";
        for(int i = 0; i < numOfTabs; i++){
            tabs += "\t";
        }
        String primerak = !primerakZnaka.isEmpty()  ? "\n\t" + tabs + "" + primerakZnaka : "";
        String spisak = !spisakRobeIUsluga.isEmpty()  ? "\n\t" + tabs + "" + spisakRobeIUsluga : "";
        String punom = !punomocje.isEmpty()  ? "\n\t" + tabs + "" + punomocje : "";
        String genPunom = !generalnoPunomocje.isEmpty()  ? "\n\t" + tabs + "" + generalnoPunomocje : "";
        String punNak = !punomocjeNaknadnoDostavljeno.isEmpty()  ? "\n\t" + tabs + "" + punomocjeNaknadnoDostavljeno : "";
        String akt = !opstiAktOKolektivnomZigu.isEmpty()  ? "\n\t" + tabs + "" + opstiAktOKolektivnomZigu : "";
        String dokaz = !dokazOPravuPrvenstva.isEmpty() ? "\n\t" + tabs + "" + dokazOPravuPrvenstva : "";
        String dokazUplate = !dokazOUplatiTakse.isEmpty()  ? "\n\t" + tabs + "" + dokazOUplatiTakse : "";
        return "\n\t"+tabs+"PriloziUzZahtev{" +
                primerak + spisak + punom + genPunom + punNak + akt + dokaz + dokazUplate+
                '}';
    }
}
