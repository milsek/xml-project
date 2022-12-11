
package P1.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t-podnosilac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t-podnosilac">
 *   &lt;complexContent>
 *     &lt;extension base="{p1}t-lice">
 *       &lt;sequence>
 *         &lt;element name="broj-faksa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pronalazac" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t-podnosilac", namespace = "p1", propOrder = {
    "brojFaksa"
})
@XmlSeeAlso({
    TPodnosilacPravnoLice.class,
    TPodnosilacFizickoLice.class
})
public abstract class TPodnosilac
    extends TLice
{

    @XmlElement(name = "broj-faksa", namespace = "p1", required = true)
    protected String brojFaksa;
    @XmlAttribute(name = "pronalazac")
    protected Boolean pronalazac;

    /**
     * Gets the value of the brojFaksa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojFaksa() {
        return brojFaksa;
    }

    /**
     * Sets the value of the brojFaksa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojFaksa(String value) {
        this.brojFaksa = value;
    }

    /**
     * Gets the value of the pronalazac property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPronalazac() {
        return pronalazac;
    }

    /**
     * Sets the value of the pronalazac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPronalazac(Boolean value) {
        this.pronalazac = value;
    }

}
