
package com.example.testxml.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t-forma-dela.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="t-forma-dela"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Stampani tekst"/&gt;
 *     &lt;enumeration value="Opticki disk"/&gt;
 *     &lt;enumeration value="Slika na platnu"/&gt;
 *     &lt;enumeration value="USB"/&gt;
 *     &lt;enumeration value="Notni zapis"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "t-forma-dela", namespace = "http://www.ftn.uns.ac.rs/a1")
@XmlEnum
public enum TFormaDela {

    @XmlEnumValue("Stampani tekst")
    STAMPANI_TEKST("Stampani tekst"),
    @XmlEnumValue("Opticki disk")
    OPTICKI_DISK("Opticki disk"),
    @XmlEnumValue("Slika na platnu")
    SLIKA_NA_PLATNU("Slika na platnu"),
    USB("USB"),
    @XmlEnumValue("Notni zapis")
    NOTNI_ZAPIS("Notni zapis");
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
