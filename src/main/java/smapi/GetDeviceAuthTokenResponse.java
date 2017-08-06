
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
 *         &lt;element name="getDeviceAuthTokenResult" type="{http://www.sonos.com/Services/1.1}deviceAuthTokenResult"/>
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
    "getDeviceAuthTokenResult"
})
@XmlRootElement(name = "getDeviceAuthTokenResponse")
public class GetDeviceAuthTokenResponse {

    @XmlElement(required = true)
    protected DeviceAuthTokenResult getDeviceAuthTokenResult;

    /**
     * Gets the value of the getDeviceAuthTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceAuthTokenResult }
     *     
     */
    public DeviceAuthTokenResult getGetDeviceAuthTokenResult() {
        return getDeviceAuthTokenResult;
    }

    /**
     * Sets the value of the getDeviceAuthTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceAuthTokenResult }
     *     
     */
    public void setGetDeviceAuthTokenResult(DeviceAuthTokenResult value) {
        this.getDeviceAuthTokenResult = value;
    }

}
