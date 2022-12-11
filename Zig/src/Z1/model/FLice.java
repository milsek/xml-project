
package Z1.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FLice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FLice">
 *   &lt;complexContent>
 *     &lt;extension base="{z1}Lice">
 *       &lt;sequence>
 *         &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FLice", namespace = "z1", propOrder = {
    "ime",
    "prezime"
})
public class FLice
    extends Lice
{

    @XmlElement(namespace = "z1", required = true)
    protected String ime;
    @XmlElement(namespace = "z1", required = true)
    protected String prezime;

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

    public String toString(int numOfTabs) {
        String tabs = "";
        for(int i = 0; i < numOfTabs; i++){
            tabs += "\t";
        }
        return "\n\t"+tabs+"FLice{" +
                "\n\t"+tabs+"Ime: " + ime +
                "\n\t"+tabs+"Prezime: " + prezime +
                "\n\t"+tabs+"" + adresa.toString(numOfTabs+1) +
                "\n\t"+tabs+"" + kontakt.toString(numOfTabs+1) +
                '}';
    }
}
