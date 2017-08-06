
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
 *         &lt;element name="householdId" type="{http://www.sonos.com/Services/1.1}id"/>
 *         &lt;element name="linkCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkDeviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callbackPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "householdId",
    "linkCode",
    "linkDeviceId",
    "callbackPath"
})
@XmlRootElement(name = "getDeviceAuthToken")
public class GetDeviceAuthToken {

    @XmlElement(required = true)
    protected String householdId;
    @XmlElement(required = true)
    protected String linkCode;
    protected String linkDeviceId;
    protected String callbackPath;

    /**
     * Gets the value of the householdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdId() {
        return householdId;
    }

    /**
     * Sets the value of the householdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdId(String value) {
        this.householdId = value;
    }

    /**
     * Gets the value of the linkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkCode() {
        return linkCode;
    }

    /**
     * Sets the value of the linkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkCode(String value) {
        this.linkCode = value;
    }

    /**
     * Gets the value of the linkDeviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkDeviceId() {
        return linkDeviceId;
    }

    /**
     * Sets the value of the linkDeviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkDeviceId(String value) {
        this.linkDeviceId = value;
    }

    /**
     * Gets the value of the callbackPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackPath() {
        return callbackPath;
    }

    /**
     * Sets the value of the callbackPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackPath(String value) {
        this.callbackPath = value;
    }

}
