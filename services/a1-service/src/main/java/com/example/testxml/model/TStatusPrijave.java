
package com.example.testxml.model;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t-status-prijave.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="t-status-prijave"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="obradjen"/&gt;
 *     &lt;enumeration value="neobradjen"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "t-status-prijave", namespace = "http://www.ftn.uns.ac.rs/a1")
@XmlEnum
public enum TStatusPrijave {

    @XmlEnumValue("obradjen")
    OBRADJEN("obradjen"),
    @XmlEnumValue("neobradjen")
    NEOBRADJEN("neobradjen");
    private final String value;

    TStatusPrijave(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TStatusPrijave fromValue(String v) {
        for (TStatusPrijave c: TStatusPrijave.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
