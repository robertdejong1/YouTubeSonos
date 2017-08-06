
package smapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extendedMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extendedMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="mediaCollection" type="{http://www.sonos.com/Services/1.1}mediaCollection" minOccurs="0"/>
 *           &lt;element name="mediaMetadata" type="{http://www.sonos.com/Services/1.1}mediaMetadata" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="relatedBrowse" type="{http://www.sonos.com/Services/1.1}relatedBrowse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedText" type="{http://www.sonos.com/Services/1.1}relatedText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedPlay" type="{http://www.sonos.com/Services/1.1}relatedPlay" minOccurs="0"/>
 *         &lt;element name="relatedActions" type="{http://www.sonos.com/Services/1.1}relatedActions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extendedMetadata", propOrder = {
    "mediaCollection",
    "mediaMetadata",
    "relatedBrowse",
    "relatedText",
    "relatedPlay",
    "relatedActions"
})
public class ExtendedMetadata {

    protected MediaCollection mediaCollection;
    protected MediaMetadata mediaMetadata;
    protected List<RelatedBrowse> relatedBrowse;
    protected List<RelatedText> relatedText;
    protected RelatedPlay relatedPlay;
    protected RelatedActions relatedActions;

    /**
     * Gets the value of the mediaCollection property.
     * 
     * @return
     *     possible object is
     *     {@link MediaCollection }
     *     
     */
    public MediaCollection getMediaCollection() {
        return mediaCollection;
    }

    /**
     * Sets the value of the mediaCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaCollection }
     *     
     */
    public void setMediaCollection(MediaCollection value) {
        this.mediaCollection = value;
    }

    /**
     * Gets the value of the mediaMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link MediaMetadata }
     *     
     */
    public MediaMetadata getMediaMetadata() {
        return mediaMetadata;
    }

    /**
     * Sets the value of the mediaMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaMetadata }
     *     
     */
    public void setMediaMetadata(MediaMetadata value) {
        this.mediaMetadata = value;
    }

    /**
     * Gets the value of the relatedBrowse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedBrowse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedBrowse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedBrowse }
     * 
     * 
     */
    public List<RelatedBrowse> getRelatedBrowse() {
        if (relatedBrowse == null) {
            relatedBrowse = new ArrayList<RelatedBrowse>();
        }
        return this.relatedBrowse;
    }

    /**
     * Gets the value of the relatedText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedText }
     * 
     * 
     */
    public List<RelatedText> getRelatedText() {
        if (relatedText == null) {
            relatedText = new ArrayList<RelatedText>();
        }
        return this.relatedText;
    }

    /**
     * Gets the value of the relatedPlay property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedPlay }
     *     
     */
    public RelatedPlay getRelatedPlay() {
        return relatedPlay;
    }

    /**
     * Sets the value of the relatedPlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedPlay }
     *     
     */
    public void setRelatedPlay(RelatedPlay value) {
        this.relatedPlay = value;
    }

    /**
     * Gets the value of the relatedActions property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedActions }
     *     
     */
    public RelatedActions getRelatedActions() {
        return relatedActions;
    }

    /**
     * Sets the value of the relatedActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedActions }
     *     
     */
    public void setRelatedActions(RelatedActions value) {
        this.relatedActions = value;
    }

}
