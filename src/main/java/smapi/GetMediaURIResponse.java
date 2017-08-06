
package smapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="getMediaURIResult" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="deviceSessionToken" type="{http://www.sonos.com/Services/1.1}deviceSessionToken" minOccurs="0"/>
 *         &lt;element name="deviceSessionKey" type="{http://www.sonos.com/Services/1.1}encryptionContext" minOccurs="0"/>
 *         &lt;element name="contentKey" type="{http://www.sonos.com/Services/1.1}encryptionContext" minOccurs="0"/>
 *         &lt;element name="httpHeaders" type="{http://www.sonos.com/Services/1.1}httpHeaders" minOccurs="0"/>
 *         &lt;element name="uriTimeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="positionInformation" type="{http://www.sonos.com/Services/1.1}positionInformation" minOccurs="0"/>
 *         &lt;element name="privateDataFieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getMediaURIResult",
    "deviceSessionToken",
    "deviceSessionKey",
    "contentKey",
    "httpHeaders",
    "uriTimeout",
    "positionInformation",
    "privateDataFieldName"
})
@XmlRootElement(name = "getMediaURIResponse")
public class GetMediaURIResponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String getMediaURIResult;
    protected String deviceSessionToken;
    protected EncryptionContext deviceSessionKey;
    protected EncryptionContext contentKey;
    protected HttpHeaders httpHeaders;
    protected Integer uriTimeout;
    protected PositionInformation positionInformation;
    protected String privateDataFieldName;

    /**
     * Gets the value of the getMediaURIResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetMediaURIResult() {
        return getMediaURIResult;
    }

    /**
     * Sets the value of the getMediaURIResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetMediaURIResult(String value) {
        this.getMediaURIResult = value;
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

    /**
     * Gets the value of the httpHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link HttpHeaders }
     *     
     */
    public HttpHeaders getHttpHeaders() {
        return httpHeaders;
    }

    /**
     * Sets the value of the httpHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link HttpHeaders }
     *     
     */
    public void setHttpHeaders(HttpHeaders value) {
        this.httpHeaders = value;
    }

    /**
     * Gets the value of the uriTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUriTimeout() {
        return uriTimeout;
    }

    /**
     * Sets the value of the uriTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUriTimeout(Integer value) {
        this.uriTimeout = value;
    }

    /**
     * Gets the value of the positionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PositionInformation }
     *     
     */
    public PositionInformation getPositionInformation() {
        return positionInformation;
    }

    /**
     * Sets the value of the positionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionInformation }
     *     
     */
    public void setPositionInformation(PositionInformation value) {
        this.positionInformation = value;
    }

    /**
     * Gets the value of the privateDataFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateDataFieldName() {
        return privateDataFieldName;
    }

    /**
     * Sets the value of the privateDataFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateDataFieldName(String value) {
        this.privateDataFieldName = value;
    }

}
