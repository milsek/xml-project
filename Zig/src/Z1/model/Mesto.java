
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
 *         &lt;element name="naziv">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="postanski-broj">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[1-3][0-9]{4}"/>
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
    "naziv",
    "postanskiBroj",
        "drzava"
})
@XmlRootElement(name = "mesto", namespace = "z1")
public class Mesto {

    @XmlElement(namespace = "z1", required = true)
    protected String naziv;
    @XmlElement(name = "postanski-broj", namespace = "z1", required = true)
    protected String postanskiBroj;

    @XmlElement(namespace = "z1")
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
     *     {@link String }
     *     
     */
    public String getPostanskiBroj() {
        return postanskiBroj;
    }

    /**
     * Sets the value of the postanskiBroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostanskiBroj(String value) {
        this.postanskiBroj = value;
    }

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


    public String toString(int numOfTabs) {
        String tabs = "";
        for(int i = 0; i < numOfTabs; i++){
            tabs += "\t";
        }
        String drzavaDeo = drzava != null ? drzava : "Srbija";
        return "\n\t"+tabs+"Mesto{" +
                "\n\t"+tabs+"Naziv: " + naziv +
                "\n\t"+tabs+"Postanski broj: " + postanskiBroj +
                "\n\t"+tabs+"Drzava:  " + drzavaDeo +
                '}';
    }
}
