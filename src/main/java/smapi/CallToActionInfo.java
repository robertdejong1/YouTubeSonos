
package smapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callToActionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callToActionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageStringId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.sonos.com/Services/1.1}sonosUri" minOccurs="0"/>
 *         &lt;element name="urlStringId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callToActionInfo", propOrder = {
    "messageStringId",
    "url",
    "urlStringId"
})
public class CallToActionInfo {

    @XmlElement(required = true)
    protected String messageStringId;
    protected String url;
    protected String urlStringId;

    /**
     * Gets the value of the messageStringId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageStringId() {
        return messageStringId;
    }

    /**
     * Sets the value of the messageStringId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageStringId(String value) {
        this.messageStringId = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the urlStringId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlStringId() {
        return urlStringId;
    }

    /**
     * Sets the value of the urlStringId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlStringId(String value) {
        this.urlStringId = value;
    }

}
