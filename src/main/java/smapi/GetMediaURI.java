
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
 *         &lt;element name="id" type="{http://www.sonos.com/Services/1.1}id"/>
 *         &lt;element name="action" type="{http://www.sonos.com/Services/1.1}mediaUriAction" minOccurs="0"/>
 *         &lt;element name="secondsSinceExplicit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="deviceSessionToken" type="{http://www.sonos.com/Services/1.1}deviceSessionToken" minOccurs="0"/>
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
    "id",
    "action",
    "secondsSinceExplicit",
    "deviceSessionToken"
})
@XmlRootElement(name = "getMediaURI")
public class GetMediaURI {

    @XmlElement(required = true)
    protected String id;
    protected MediaUriAction action;
    protected Integer secondsSinceExplicit;
    protected String deviceSessionToken;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link MediaUriAction }
     *     
     */
    public MediaUriAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaUriAction }
     *     
     */
    public void setAction(MediaUriAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the secondsSinceExplicit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecondsSinceExplicit() {
        return secondsSinceExplicit;
    }

    /**
     * Sets the value of the secondsSinceExplicit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecondsSinceExplicit(Integer value) {
        this.secondsSinceExplicit = value;
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

}
