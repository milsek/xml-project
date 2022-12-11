
package A1.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t-vrsta-dela.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="t-vrsta-dela">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KnjizevnoDelo"/>
 *     &lt;enumeration value="MuzickoDelo"/>
 *     &lt;enumeration value="LikovnoDelo"/>
 *     &lt;enumeration value="RacunarskiProgram"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "t-vrsta-dela", namespace = "a1")
@XmlEnum
public enum TVrstaDela {

    @XmlEnumValue("KnjizevnoDelo")
    KNJIZEVNO_DELO("KnjizevnoDelo"),
    @XmlEnumValue("MuzickoDelo")
    MUZICKO_DELO("MuzickoDelo"),
    @XmlEnumValue("LikovnoDelo")
    LIKOVNO_DELO("LikovnoDelo"),
    @XmlEnumValue("RacunarskiProgram")
    RACUNARSKI_PROGRAM("RacunarskiProgram");
    private final String value;

    TVrstaDela(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TVrstaDela fromValue(String v) {
        for (TVrstaDela c: TVrstaDela.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
