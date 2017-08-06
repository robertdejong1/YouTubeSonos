
package smapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceLinkCodeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceLinkCodeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="showLinkCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="linkDeviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deviceLinkCodeResult", propOrder = {
    "regUrl",
    "linkCode",
    "showLinkCode",
    "linkDeviceId"
})
public class DeviceLinkCodeResult {

    @XmlElement(required = true)
    protected String regUrl;
    @XmlElement(required = true)
    protected String linkCode;
    protected boolean showLinkCode;
    protected String linkDeviceId;

    /**
     * Gets the value of the regUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegUrl() {
        return regUrl;
    }

    /**
     * Sets the value of the regUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegUrl(String value) {
        this.regUrl = value;
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
     * Gets the value of the showLinkCode property.
     * 
     */
    public boolean isShowLinkCode() {
        return showLinkCode;
    }

    /**
     * Sets the value of the showLinkCode property.
     * 
     */
    public void setShowLinkCode(boolean value) {
        this.showLinkCode = value;
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

}
