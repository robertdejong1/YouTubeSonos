
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
 *         &lt;element name="hardware" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="osVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sonosAppName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callbackPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "hardware",
    "osVersion",
    "sonosAppName",
    "callbackPath"
})
@XmlRootElement(name = "getAppLink")
public class GetAppLink {

    @XmlElement(required = true)
    protected String householdId;
    @XmlElement(required = true)
    protected String hardware;
    @XmlElement(required = true)
    protected String osVersion;
    @XmlElement(required = true)
    protected String sonosAppName;
    @XmlElement(required = true)
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
     * Gets the value of the hardware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardware() {
        return hardware;
    }

    /**
     * Sets the value of the hardware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardware(String value) {
        this.hardware = value;
    }

    /**
     * Gets the value of the osVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * Sets the value of the osVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsVersion(String value) {
        this.osVersion = value;
    }

    /**
     * Gets the value of the sonosAppName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonosAppName() {
        return sonosAppName;
    }

    /**
     * Sets the value of the sonosAppName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonosAppName(String value) {
        this.sonosAppName = value;
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
