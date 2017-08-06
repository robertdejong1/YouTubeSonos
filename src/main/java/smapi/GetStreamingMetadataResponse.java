
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
 *         &lt;element name="getStreamingMetadataResult" type="{http://www.sonos.com/Services/1.1}segmentMetadataList"/>
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
    "getStreamingMetadataResult"
})
@XmlRootElement(name = "getStreamingMetadataResponse")
public class GetStreamingMetadataResponse {

    @XmlElement(required = true)
    protected SegmentMetadataList getStreamingMetadataResult;

    /**
     * Gets the value of the getStreamingMetadataResult property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentMetadataList }
     *     
     */
    public SegmentMetadataList getGetStreamingMetadataResult() {
        return getStreamingMetadataResult;
    }

    /**
     * Sets the value of the getStreamingMetadataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentMetadataList }
     *     
     */
    public void setGetStreamingMetadataResult(SegmentMetadataList value) {
        this.getStreamingMetadataResult = value;
    }

}
