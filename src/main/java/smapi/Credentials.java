
package smapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="zonePlayerId" type="{http://www.sonos.com/Services/1.1}id" minOccurs="0"/>
 *         &lt;element name="deviceId" type="{http://www.sonos.com/Services/1.1}id" minOccurs="0"/>
 *         &lt;element name="deviceProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceCert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.sonos.com/Services/1.1}sessionId"/>
 *           &lt;element ref="{http://www.sonos.com/Services/1.1}login"/>
 *           &lt;element ref="{http://www.sonos.com/Services/1.1}loginToken"/>
 *         &lt;/choice>
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
    "zonePlayerId",
    "deviceId",
    "deviceProvider",
    "deviceCert",
    "sessionId",
    "login",
    "loginToken"
})
@XmlRootElement(name = "credentials")
public class Credentials {

    protected String zonePlayerId;
    protected String deviceId;
    protected String deviceProvider;
    protected String deviceCert;
    protected String sessionId;
    protected Login login;
    protected LoginToken loginToken;

    /**
     * Gets the value of the zonePlayerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZonePlayerId() {
        return zonePlayerId;
    }

    /**
     * Sets the value of the zonePlayerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZonePlayerId(String value) {
        this.zonePlayerId = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the deviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceProvider() {
        return deviceProvider;
    }

    /**
     * Sets the value of the deviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceProvider(String value) {
        this.deviceProvider = value;
    }

    /**
     * Gets the value of the deviceCert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceCert() {
        return deviceCert;
    }

    /**
     * Sets the value of the deviceCert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceCert(String value) {
        this.deviceCert = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link Login }
     *     
     */
    public Login getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link Login }
     *     
     */
    public void setLogin(Login value) {
        this.login = value;
    }

    /**
     * Gets the value of the loginToken property.
     * 
     * @return
     *     possible object is
     *     {@link LoginToken }
     *     
     */
    public LoginToken getLoginToken() {
        return loginToken;
    }

    /**
     * Sets the value of the loginToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginToken }
     *     
     */
    public void setLoginToken(LoginToken value) {
        this.loginToken = value;
    }

}
