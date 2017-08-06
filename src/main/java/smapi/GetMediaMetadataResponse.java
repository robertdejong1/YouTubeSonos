
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
 *         &lt;element name="getMediaMetadataResult" type="{http://www.sonos.com/Services/1.1}mediaMetadata"/>
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
    "getMediaMetadataResult"
})
@XmlRootElement(name = "getMediaMetadataResponse")
public class GetMediaMetadataResponse {

    @XmlElement(required = true)
    protected MediaMetadata getMediaMetadataResult;

    /**
     * Gets the value of the getMediaMetadataResult property.
     * 
     * @return
     *     possible object is
     *     {@link MediaMetadata }
     *     
     */
    public MediaMetadata getGetMediaMetadataResult() {
        return getMediaMetadataResult;
    }

    /**
     * Sets the value of the getMediaMetadataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaMetadata }
     *     
     */
    public void setGetMediaMetadataResult(MediaMetadata value) {
        this.getMediaMetadataResult = value;
    }

}
