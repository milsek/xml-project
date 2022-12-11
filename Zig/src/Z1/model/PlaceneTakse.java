
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
 *         &lt;element name="osnovna-taksa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element ref="{z1}klasa-graficko-resenje"/>
 *         &lt;element name="ukupno" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "osnovnaTaksa",
    "klasaGrafickoResenje",
    "ukupno"
})
@XmlRootElement(name = "placene-takse", namespace = "z1")
public class PlaceneTakse {

    @XmlElement(name = "osnovna-taksa", namespace = "z1")
    protected double osnovnaTaksa;
    @XmlElement(name = "klasa-graficko-resenje", namespace = "z1", required = true)
    protected KlasaGrafickoResenje klasaGrafickoResenje;
    @XmlElement(namespace = "z1")
    protected double ukupno;

    /**
     * Gets the value of the osnovnaTaksa property.
     * 
     */
    public double getOsnovnaTaksa() {
        return osnovnaTaksa;
    }

    /**
     * Sets the value of the osnovnaTaksa property.
     * 
     */
    public void setOsnovnaTaksa(double value) {
        this.osnovnaTaksa = value;
    }

    /**
     * Gets the value of the klasaGrafickoResenje property.
     * 
     * @return
     *     possible object is
     *     {@link KlasaGrafickoResenje }
     *     
     */
    public KlasaGrafickoResenje getKlasaGrafickoResenje() {
        return klasaGrafickoResenje;
    }

    /**
     * Sets the value of the klasaGrafickoResenje property.
     * 
     * @param value
     *     allowed object is
     *     {@link KlasaGrafickoResenje }
     *     
     */
    public void setKlasaGrafickoResenje(KlasaGrafickoResenje value) {
        this.klasaGrafickoResenje = value;
    }

    /**
     * Gets the value of the ukupno property.
     * 
     */
    public double getUkupno() {
        return ukupno;
    }

    /**
     * Sets the value of the ukupno property.
     * 
     */
    public void setUkupno(double value) {
        this.ukupno = value;
    }


    public String toString(int numOfTabs) {
        String tabs = "";
        for(int i = 0; i < numOfTabs; i++){
            tabs += "\t";
        }
        return "\n\t"+tabs+"PlaceneTakse{" +
                "\n\t"+tabs+"Osnovna taksa: " + osnovnaTaksa +
                "\n\t"+tabs+"" + klasaGrafickoResenje.toString(numOfTabs + 1) +
                "\n\t"+tabs+"Ukupno: " + ukupno +
                '}';
    }
}
