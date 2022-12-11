
package A1.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t-prilog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t-prilog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="odobren" type="{a1}t-da-ne"/>
 *         &lt;element name="putanja" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t-prilog", namespace = "a1", propOrder = {
    "odobren",
    "putanja"
})
public class TPrilog {

    @XmlElement(namespace = "a1", required = true)
    @XmlSchemaType(name = "string")
    protected TDaNe odobren;
    @XmlElement(namespace = "a1", required = true)
    protected String putanja;

    /**
     * Gets the value of the odobren property.
     * 
     * @return
     *     possible object is
     *     {@link TDaNe }
     *     
     */
    public TDaNe getOdobren() {
        return odobren;
    }

    /**
     * Sets the value of the odobren property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDaNe }
     *     
     */
    public void setOdobren(TDaNe value) {
        this.odobren = value;
    }

    /**
     * Gets the value of the putanja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPutanja() {
        return putanja;
    }

    /**
     * Sets the value of the putanja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPutanja(String value) {
        this.putanja = value;
    }

}
