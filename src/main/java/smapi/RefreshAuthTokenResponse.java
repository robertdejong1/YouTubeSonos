
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
 *         &lt;element name="refreshAuthTokenResult" type="{http://www.sonos.com/Services/1.1}deviceAuthTokenResult"/>
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
    "refreshAuthTokenResult"
})
@XmlRootElement(name = "refreshAuthTokenResponse")
public class RefreshAuthTokenResponse {

    @XmlElement(required = true)
    protected DeviceAuthTokenResult refreshAuthTokenResult;

    /**
     * Gets the value of the refreshAuthTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceAuthTokenResult }
     *     
     */
    public DeviceAuthTokenResult getRefreshAuthTokenResult() {
        return refreshAuthTokenResult;
    }

    /**
     * Sets the value of the refreshAuthTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceAuthTokenResult }
     *     
     */
    public void setRefreshAuthTokenResult(DeviceAuthTokenResult value) {
        this.refreshAuthTokenResult = value;
    }

}
