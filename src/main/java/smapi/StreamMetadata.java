
package smapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for streamMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="streamMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentShowId" type="{http://www.sonos.com/Services/1.1}id" minOccurs="0"/>
 *         &lt;element name="currentShow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondsRemaining" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="secondsToNextShow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bitrate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="logo" type="{http://www.sonos.com/Services/1.1}albumArtUrl" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isEphemeral" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reliability" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="subtitle" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="nextShowSeconds" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="hasOutOfBandMetadata" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "streamMetadata", propOrder = {
    "currentHost",
    "currentShowId",
    "currentShow",
    "secondsRemaining",
    "secondsToNextShow",
    "bitrate",
    "logo",
    "description",
    "isEphemeral",
    "reliability",
    "title",
    "subtitle",
    "nextShowSeconds",
    "hasOutOfBandMetadata"
})
public class StreamMetadata {

    protected String currentHost;
    protected String currentShowId;
    protected String currentShow;
    protected Integer secondsRemaining;
    protected Integer secondsToNextShow;
    protected Integer bitrate;
    protected AlbumArtUrl logo;
    protected String description;
    protected Boolean isEphemeral;
    @XmlSchemaType(name = "anyURI")
    protected String reliability;
    @XmlSchemaType(name = "anyURI")
    protected String title;
    @XmlSchemaType(name = "anyURI")
    protected String subtitle;
    @XmlSchemaType(name = "anyURI")
    protected String nextShowSeconds;
    protected Boolean hasOutOfBandMetadata;

    /**
     * Gets the value of the currentHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentHost() {
        return currentHost;
    }

    /**
     * Sets the value of the currentHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentHost(String value) {
        this.currentHost = value;
    }

    /**
     * Gets the value of the currentShowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentShowId() {
        return currentShowId;
    }

    /**
     * Sets the value of the currentShowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentShowId(String value) {
        this.currentShowId = value;
    }

    /**
     * Gets the value of the currentShow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentShow() {
        return currentShow;
    }

    /**
     * Sets the value of the currentShow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentShow(String value) {
        this.currentShow = value;
    }

    /**
     * Gets the value of the secondsRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecondsRemaining() {
        return secondsRemaining;
    }

    /**
     * Sets the value of the secondsRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecondsRemaining(Integer value) {
        this.secondsRemaining = value;
    }

    /**
     * Gets the value of the secondsToNextShow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecondsToNextShow() {
        return secondsToNextShow;
    }

    /**
     * Sets the value of the secondsToNextShow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecondsToNextShow(Integer value) {
        this.secondsToNextShow = value;
    }

    /**
     * Gets the value of the bitrate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBitrate() {
        return bitrate;
    }

    /**
     * Sets the value of the bitrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBitrate(Integer value) {
        this.bitrate = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link AlbumArtUrl }
     *     
     */
    public AlbumArtUrl getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlbumArtUrl }
     *     
     */
    public void setLogo(AlbumArtUrl value) {
        this.logo = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isEphemeral property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEphemeral() {
        return isEphemeral;
    }

    /**
     * Sets the value of the isEphemeral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEphemeral(Boolean value) {
        this.isEphemeral = value;
    }

    /**
     * Gets the value of the reliability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReliability() {
        return reliability;
    }

    /**
     * Sets the value of the reliability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReliability(String value) {
        this.reliability = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the subtitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * Sets the value of the subtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtitle(String value) {
        this.subtitle = value;
    }

    /**
     * Gets the value of the nextShowSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextShowSeconds() {
        return nextShowSeconds;
    }

    /**
     * Sets the value of the nextShowSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextShowSeconds(String value) {
        this.nextShowSeconds = value;
    }

    /**
     * Gets the value of the hasOutOfBandMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOutOfBandMetadata() {
        return hasOutOfBandMetadata;
    }

    /**
     * Sets the value of the hasOutOfBandMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOutOfBandMetadata(Boolean value) {
        this.hasOutOfBandMetadata = value;
    }

}
