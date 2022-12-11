
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
 *         &lt;element name="godina">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minExclusive value="1920"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="4"/>
 *               &lt;pattern value="[0-9]{4}"/>
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
    "godina",
    "id"
})
@XmlRootElement(name = "broj-prijave-ziga", namespace = "z1")
public class BrojPrijaveZiga {

    @XmlElement(namespace = "z1")
    protected int godina;
    @XmlElement(namespace = "z1", required = true)
    protected String id;

    /**
     * Gets the value of the godina property.
     * 
     */
    public int getGodina() {
        return godina;
    }

    /**
     * Sets the value of the godina property.
     * 
     */
    public void setGodina(int value) {
        this.godina = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public String toString(int numOfTabs) {
        String tabs = "";
        for(int i = 0; i < numOfTabs; i++){
            tabs += "\t";
        }
        return "\n\t"+tabs+"BrojPrijaveZiga{" +
                "\n\t"+tabs+"" + godina +
                "\n\t"+tabs+"" + id +
                '}';
    }
}
