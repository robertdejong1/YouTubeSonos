
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
 *         &lt;element name="getLastUpdateResult" type="{http://www.sonos.com/Services/1.1}lastUpdate"/>
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
    "getLastUpdateResult"
})
@XmlRootElement(name = "getLastUpdateResponse")
public class GetLastUpdateResponse {

    @XmlElement(required = true)
    protected LastUpdate getLastUpdateResult;

    /**
     * Gets the value of the getLastUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link LastUpdate }
     *     
     */
    public LastUpdate getGetLastUpdateResult() {
        return getLastUpdateResult;
    }

    /**
     * Sets the value of the getLastUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastUpdate }
     *     
     */
    public void setGetLastUpdateResult(LastUpdate value) {
        this.getLastUpdateResult = value;
    }

}
