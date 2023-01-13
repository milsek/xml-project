
package com.example.testxml.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t-vrsta-dela.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="t-vrsta-dela"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Knjizevno delo"/&gt;
 *     &lt;enumeration value="Muzicko delo"/&gt;
 *     &lt;enumeration value="Likovno delo"/&gt;
 *     &lt;enumeration value="Racunarski program"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "t-vrsta-dela", namespace = "http://www.ftn.uns.ac.rs/a1")
@XmlEnum
public enum TVrstaDela {

    @XmlEnumValue("Knjizevno delo")
    KNJIZEVNO_DELO("Knjizevno delo"),
    @XmlEnumValue("Muzicko delo")
    MUZICKO_DELO("Muzicko delo"),
    @XmlEnumValue("Likovno delo")
    LIKOVNO_DELO("Likovno delo"),
    @XmlEnumValue("Racunarski program")
    RACUNARSKI_PROGRAM("Racunarski program");
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
