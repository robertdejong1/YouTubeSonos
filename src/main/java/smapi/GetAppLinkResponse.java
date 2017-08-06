
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
 *         &lt;element name="getAppLinkResult" type="{http://www.sonos.com/Services/1.1}appLinkResult"/>
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
    "getAppLinkResult"
})
@XmlRootElement(name = "getAppLinkResponse")
public class GetAppLinkResponse {

    @XmlElement(required = true)
    protected AppLinkResult getAppLinkResult;

    /**
     * Gets the value of the getAppLinkResult property.
     * 
     * @return
     *     possible object is
     *     {@link AppLinkResult }
     *     
     */
    public AppLinkResult getGetAppLinkResult() {
        return getAppLinkResult;
    }

    /**
     * Sets the value of the getAppLinkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppLinkResult }
     *     
     */
    public void setGetAppLinkResult(AppLinkResult value) {
        this.getAppLinkResult = value;
    }

}
