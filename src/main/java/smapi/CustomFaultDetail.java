
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
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="SonosError" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="ExceptionInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/sequence>
 *         &lt;element name="refreshAuthTokenResult" type="{http://www.sonos.com/Services/1.1}deviceAuthTokenResult"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sonosError",
    "exceptionInfo",
    "refreshAuthTokenResult"
})
@XmlRootElement(name = "customFaultDetail")
public class CustomFaultDetail {

    @XmlElement(name = "SonosError")
    protected Integer sonosError;
    @XmlElement(name = "ExceptionInfo")
    protected String exceptionInfo;
    protected DeviceAuthTokenResult refreshAuthTokenResult;

    /**
     * Gets the value of the sonosError property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSonosError() {
        return sonosError;
    }

    /**
     * Sets the value of the sonosError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSonosError(Integer value) {
        this.sonosError = value;
    }

    /**
     * Gets the value of the exceptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionInfo() {
        return exceptionInfo;
    }

    /**
     * Sets the value of the exceptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionInfo(String value) {
        this.exceptionInfo = value;
    }

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
