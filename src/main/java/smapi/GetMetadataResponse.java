
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
 *         &lt;element name="getMetadataResult" type="{http://www.sonos.com/Services/1.1}mediaList"/>
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
    "getMetadataResult"
})
@XmlRootElement(name = "getMetadataResponse")
public class GetMetadataResponse {

    @XmlElement(required = true)
    protected MediaList getMetadataResult;

    /**
     * Gets the value of the getMetadataResult property.
     * 
     * @return
     *     possible object is
     *     {@link MediaList }
     *     
     */
    public MediaList getGetMetadataResult() {
        return getMetadataResult;
    }

    /**
     * Sets the value of the getMetadataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaList }
     *     
     */
    public void setGetMetadataResult(MediaList value) {
        this.getMetadataResult = value;
    }

}
