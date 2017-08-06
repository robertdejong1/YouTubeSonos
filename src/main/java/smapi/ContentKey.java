
package smapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contentKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contentKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="deviceSessionToken" type="{http://www.sonos.com/Services/1.1}deviceSessionToken" minOccurs="0"/>
 *         &lt;element name="deviceSessionKey" type="{http://www.sonos.com/Services/1.1}encryptionContext" minOccurs="0"/>
 *         &lt;element name="contentKey" type="{http://www.sonos.com/Services/1.1}encryptionContext" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contentKey", propOrder = {
    "uri",
    "deviceSessionToken",
    "deviceSessionKey",
    "contentKey"
})
public class ContentKey {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    protected String deviceSessionToken;
    protected EncryptionContext deviceSessionKey;
    protected EncryptionContext contentKey;

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the deviceSessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSessionToken() {
        return deviceSessionToken;
    }

    /**
     * Sets the value of the deviceSessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSessionToken(String value) {
        this.deviceSessionToken = value;
    }

    /**
     * Gets the value of the deviceSessionKey property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionContext }
     *     
     */
    public EncryptionContext getDeviceSessionKey() {
        return deviceSessionKey;
    }

    /**
     * Sets the value of the deviceSessionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionContext }
     *     
     */
    public void setDeviceSessionKey(EncryptionContext value) {
        this.deviceSessionKey = value;
    }

    /**
     * Gets the value of the contentKey property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionContext }
     *     
     */
    public EncryptionContext getContentKey() {
        return contentKey;
    }

    /**
     * Sets the value of the contentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionContext }
     *     
     */
    public void setContentKey(EncryptionContext value) {
        this.contentKey = value;
    }

}
