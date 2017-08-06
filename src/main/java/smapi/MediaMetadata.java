
package smapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mediaMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mediaMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sonos.com/Services/1.1}AbstractMedia">
 *       &lt;sequence>
 *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element name="trackMetadata" type="{http://www.sonos.com/Services/1.1}trackMetadata"/>
 *           &lt;element name="streamMetadata" type="{http://www.sonos.com/Services/1.1}streamMetadata"/>
 *         &lt;/choice>
 *         &lt;element name="dynamic" type="{http://www.sonos.com/Services/1.1}dynamicData" minOccurs="0"/>
 *         &lt;element name="behaviors" type="{http://www.sonos.com/Services/1.1}behaviorsData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mediaMetadata", propOrder = {
    "mimeType",
    "trackMetadata",
    "streamMetadata",
    "dynamic",
    "behaviors"
})
public class MediaMetadata
    extends AbstractMedia
{

    @XmlElement(required = true)
    protected String mimeType;
    protected TrackMetadata trackMetadata;
    protected StreamMetadata streamMetadata;
    protected DynamicData dynamic;
    protected BehaviorsData behaviors;

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the trackMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link TrackMetadata }
     *     
     */
    public TrackMetadata getTrackMetadata() {
        return trackMetadata;
    }

    /**
     * Sets the value of the trackMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackMetadata }
     *     
     */
    public void setTrackMetadata(TrackMetadata value) {
        this.trackMetadata = value;
    }

    /**
     * Gets the value of the streamMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link StreamMetadata }
     *     
     */
    public StreamMetadata getStreamMetadata() {
        return streamMetadata;
    }

    /**
     * Sets the value of the streamMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamMetadata }
     *     
     */
    public void setStreamMetadata(StreamMetadata value) {
        this.streamMetadata = value;
    }

    /**
     * Gets the value of the dynamic property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicData }
     *     
     */
    public DynamicData getDynamic() {
        return dynamic;
    }

    /**
     * Sets the value of the dynamic property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicData }
     *     
     */
    public void setDynamic(DynamicData value) {
        this.dynamic = value;
    }

    /**
     * Gets the value of the behaviors property.
     * 
     * @return
     *     possible object is
     *     {@link BehaviorsData }
     *     
     */
    public BehaviorsData getBehaviors() {
        return behaviors;
    }

    /**
     * Sets the value of the behaviors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BehaviorsData }
     *     
     */
    public void setBehaviors(BehaviorsData value) {
        this.behaviors = value;
    }

}
