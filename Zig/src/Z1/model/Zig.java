
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
 *         &lt;element name="tip-ziga">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="individualni"/>
 *               &lt;enumeration value="kolektivni"/>
 *               &lt;enumeration value="garancije"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="znak-ziga">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="postojeci">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="verbalni"/>
 *                         &lt;enumeration value="graficki"/>
 *                         &lt;enumeration value="kombinovani"/>
 *                         &lt;enumeration value="trodimenzionalni"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="drugi">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="izgled-znaka">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
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
    "tipZiga",
    "znakZiga",
    "izgledZnaka"
})
@XmlRootElement(name = "zig", namespace = "z1")
public class Zig {

    @XmlElement(name = "tip-ziga", namespace = "z1", required = true)
    protected String tipZiga;
    @XmlElement(name = "znak-ziga", namespace = "z1", required = true)
    protected Zig.ZnakZiga znakZiga;
    @XmlElement(name = "izgled-znaka", namespace = "z1", required = true)
    protected String izgledZnaka;

    /**
     * Gets the value of the tipZiga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipZiga() {
        return tipZiga;
    }

    /**
     * Sets the value of the tipZiga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipZiga(String value) {
        this.tipZiga = value;
    }

    /**
     * Gets the value of the znakZiga property.
     * 
     * @return
     *     possible object is
     *     {@link Zig.ZnakZiga }
     *     
     */
    public Zig.ZnakZiga getZnakZiga() {
        return znakZiga;
    }

    /**
     * Sets the value of the znakZiga property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zig.ZnakZiga }
     *     
     */
    public void setZnakZiga(Zig.ZnakZiga value) {
        this.znakZiga = value;
    }

    /**
     * Gets the value of the izgledZnaka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIzgledZnaka() {
        return izgledZnaka;
    }

    /**
     * Sets the value of the izgledZnaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIzgledZnaka(String value) {
        this.izgledZnaka = value;
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
     *         &lt;element name="postojeci">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="verbalni"/>
     *               &lt;enumeration value="graficki"/>
     *               &lt;enumeration value="kombinovani"/>
     *               &lt;enumeration value="trodimenzionalni"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="drugi">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "postojeci",
        "drugi"
    })
    public static class ZnakZiga {

        @XmlElement(namespace = "z1")
        protected String postojeci;
        @XmlElement(namespace = "z1")
        protected String drugi;

        /**
         * Gets the value of the postojeci property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostojeci() {
            return postojeci;
        }

        /**
         * Sets the value of the postojeci property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostojeci(String value) {
            this.postojeci = value;
        }

        /**
         * Gets the value of the drugi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDrugi() {
            return drugi;
        }

        /**
         * Sets the value of the drugi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDrugi(String value) {
            this.drugi = value;
        }
        public String toString(int numOfTabs) {
            String tabs = "";
            for(int i = 0; i < numOfTabs; i++){
                tabs += "\t";
            }
            String znak = postojeci != null ? postojeci : drugi;
            return "ZnakZiga{"+
                    "\n\t"+tabs+"" + postojeci +
                    '}';
        }

    }

    public String toString(int numOfTabs) {
        String tabs = "";
        for(int i = 0; i < numOfTabs; i++){
            tabs += "\t";
        }
        return "\n\t"+tabs+"Zig{" +
                "\n\t"+tabs+"" + tipZiga +
                "\n\t"+tabs+"" + znakZiga.toString(numOfTabs + 1) +
                "\n\t"+tabs+"" + izgledZnaka +
                '}';
    }
}
