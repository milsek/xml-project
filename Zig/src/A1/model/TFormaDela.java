
package A1.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t-forma-dela.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="t-forma-dela">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="StampaniTekst"/>
 *     &lt;enumeration value="OptickiDisk"/>
 *     &lt;enumeration value="SlikaNaPlatnu"/>
 *     &lt;enumeration value="USB"/>
 *     &lt;enumeration value="NotniZapis"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "t-forma-dela", namespace = "a1")
@XmlEnum
public enum TFormaDela {

    @XmlEnumValue("StampaniTekst")
    STAMPANI_TEKST("StampaniTekst"),
    @XmlEnumValue("OptickiDisk")
    OPTICKI_DISK("OptickiDisk"),
    @XmlEnumValue("SlikaNaPlatnu")
    SLIKA_NA_PLATNU("SlikaNaPlatnu"),
    USB("USB"),
    @XmlEnumValue("NotniZapis")
    NOTNI_ZAPIS("NotniZapis");
    private final String value;

    TFormaDela(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TFormaDela fromValue(String v) {
        for (TFormaDela c: TFormaDela.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
