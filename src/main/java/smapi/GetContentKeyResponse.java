
package smapi;

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
 *         &lt;element name="contentKey" type="{http://www.sonos.com/Services/1.1}contentKey"/>
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
    "contentKey"
})
@XmlRootElement(name = "getContentKeyResponse")
public class GetContentKeyResponse {

    @XmlElement(required = true)
    protected ContentKey contentKey;

    /**
     * Gets the value of the contentKey property.
     * 
     * @return
     *     possible object is
     *     {@link ContentKey }
     *     
     */
    public ContentKey getContentKey() {
        return contentKey;
    }

    /**
     * Sets the value of the contentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentKey }
     *     
     */
    public void setContentKey(ContentKey value) {
        this.contentKey = value;
    }

}
