
package smapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for httpHeaders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="httpHeaders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="httpHeader" type="{http://www.sonos.com/Services/1.1}httpHeader" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "httpHeaders", propOrder = {
    "httpHeader"
})
public class HttpHeaders {

    protected List<HttpHeader> httpHeader;

    /**
     * Gets the value of the httpHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the httpHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHttpHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HttpHeader }
     * 
     * 
     */
    public List<HttpHeader> getHttpHeader() {
        if (httpHeader == null) {
            httpHeader = new ArrayList<HttpHeader>();
        }
        return this.httpHeader;
    }

}
