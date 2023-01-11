package com.example.testxml.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for t-da-ne.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="t-da-ne">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="da"/>
 *     &lt;enumeration value="ne"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "t-da-ne", namespace = "a1")
@XmlEnum
public enum TDaNe {

    @XmlEnumValue("da")
    DA("da"),
    @XmlEnumValue("ne")
    NE("ne");
    private final String value;

    TDaNe(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TDaNe fromValue(String v) {
        for (TDaNe c: TDaNe.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
