
package com.example.testxml.model;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="boja" maxOccurs="5">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="plava"/>
 *               &lt;enumeration value="crvena"/>
 *               &lt;enumeration value="zelena"/>
 *               &lt;enumeration value="zuta"/>
 *               &lt;enumeration value="crna"/>
 *               &lt;enumeration value="bela"/>
 *               &lt;enumeration value="narandzasta"/>
 *               &lt;enumeration value="ljubicasta"/>
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
    "boja"
})
@XmlRootElement(name = "boje", namespace = "http://www.ftn.uns.ac.rs/z1")
public class Boje {

    @XmlElement(namespace = "http://www.ftn.uns.ac.rs/z1", required = true)
    protected List<String> boja;

    /**
     * Gets the value of the boja property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boja property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoja().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBoja() {
        if (boja == null) {
            boja = new ArrayList<String>();
        }
        return this.boja;
    }

}
