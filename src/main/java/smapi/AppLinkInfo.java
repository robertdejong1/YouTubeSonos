
package smapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appLinkInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appLinkInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appUrl" type="{http://www.sonos.com/Services/1.1}sonosUri" minOccurs="0"/>
 *         &lt;element name="appUrlStringId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deviceLink" type="{http://www.sonos.com/Services/1.1}deviceLinkCodeResult" minOccurs="0"/>
 *         &lt;element name="failureStringId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failureUrl" type="{http://www.sonos.com/Services/1.1}sonosUri" minOccurs="0"/>
 *         &lt;element name="failureUrlStringId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appLinkInfo", propOrder = {
    "appUrl",
    "appUrlStringId",
    "deviceLink",
    "failureStringId",
    "failureUrl",
    "failureUrlStringId"
})
public class AppLinkInfo {

    protected String appUrl;
    @XmlElement(required = true)
    protected String appUrlStringId;
    protected DeviceLinkCodeResult deviceLink;
    protected String failureStringId;
    protected String failureUrl;
    protected String failureUrlStringId;

    /**
     * Gets the value of the appUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppUrl() {
        return appUrl;
    }

    /**
     * Sets the value of the appUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppUrl(String value) {
        this.appUrl = value;
    }

    /**
     * Gets the value of the appUrlStringId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppUrlStringId() {
        return appUrlStringId;
    }

    /**
     * Sets the value of the appUrlStringId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppUrlStringId(String value) {
        this.appUrlStringId = value;
    }

    /**
     * Gets the value of the deviceLink property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceLinkCodeResult }
     *     
     */
    public DeviceLinkCodeResult getDeviceLink() {
        return deviceLink;
    }

    /**
     * Sets the value of the deviceLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceLinkCodeResult }
     *     
     */
    public void setDeviceLink(DeviceLinkCodeResult value) {
        this.deviceLink = value;
    }

    /**
     * Gets the value of the failureStringId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureStringId() {
        return failureStringId;
    }

    /**
     * Sets the value of the failureStringId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureStringId(String value) {
        this.failureStringId = value;
    }

    /**
     * Gets the value of the failureUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureUrl() {
        return failureUrl;
    }

    /**
     * Sets the value of the failureUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureUrl(String value) {
        this.failureUrl = value;
    }

    /**
     * Gets the value of the failureUrlStringId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureUrlStringId() {
        return failureUrlStringId;
    }

    /**
     * Sets the value of the failureUrlStringId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureUrlStringId(String value) {
        this.failureUrlStringId = value;
    }

}
