
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/p1}obrazac-p1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "obrazacP1"
})
@XmlRootElement(name = "obrasci", namespace = "http://www.ftn.uns.ac.rs/p1")
public class Obrasci {

    @XmlElement(name = "obrazac-p1", namespace = "http://www.ftn.uns.ac.rs/p1")
    protected List<ObrazacP1> obrazacP1;

    /**
     * Gets the value of the obrazacP1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the obrazacP1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObrazacP1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObrazacP1 }
     * 
     * 
     */
    public List<ObrazacP1> getObrazacP1() {
        if (obrazacP1 == null) {
            obrazacP1 = new ArrayList<ObrazacP1>();
        }
        return this.obrazacP1;
    }

}
