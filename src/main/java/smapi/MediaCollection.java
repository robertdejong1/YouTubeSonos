
package smapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mediaCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mediaCollection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sonos.com/Services/1.1}AbstractMedia">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="artist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             &lt;element name="artistId" type="{http://www.sonos.com/Services/1.1}id" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="authorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             &lt;element name="narratorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             &lt;element name="narrator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="canScroll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canPlay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canEnumerate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canAddToFavorites" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="containsFavorite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canCache" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canSkip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="albumArtURI" type="{http://www.sonos.com/Services/1.1}albumArtUrl" minOccurs="0"/>
 *         &lt;element name="canResume" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="authRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canAddToFavorite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="canReorderItems" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="canDeleteItems" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="renameable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="userContent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mediaCollection", propOrder = {
    "artist",
    "artistId",
    "authorId",
    "author",
    "narratorId",
    "narrator",
    "canScroll",
    "canPlay",
    "canEnumerate",
    "canAddToFavorites",
    "containsFavorite",
    "canCache",
    "canSkip",
    "albumArtURI",
    "canResume",
    "authRequired",
    "homogeneous",
    "canAddToFavorite"
})
public class MediaCollection
    extends AbstractMedia
{

    protected String artist;
    protected String artistId;
    protected String authorId;
    protected String author;
    protected String narratorId;
    protected String narrator;
    protected Boolean canScroll;
    protected Boolean canPlay;
    protected Boolean canEnumerate;
    protected Boolean canAddToFavorites;
    protected Boolean containsFavorite;
    protected Boolean canCache;
    protected Boolean canSkip;
    protected AlbumArtUrl albumArtURI;
    protected Boolean canResume;
    protected Boolean authRequired;
    protected Boolean homogeneous;
    protected Boolean canAddToFavorite;
    @XmlAttribute
    protected Boolean readOnly;
    @XmlAttribute
    protected Boolean canReorderItems;
    @XmlAttribute
    protected Boolean canDeleteItems;
    @XmlAttribute
    protected Boolean renameable;
    @XmlAttribute
    protected Boolean userContent;

    /**
     * Gets the value of the artist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Sets the value of the artist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtist(String value) {
        this.artist = value;
    }

    /**
     * Gets the value of the artistId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtistId() {
        return artistId;
    }

    /**
     * Sets the value of the artistId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtistId(String value) {
        this.artistId = value;
    }

    /**
     * Gets the value of the authorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorId() {
        return authorId;
    }

    /**
     * Sets the value of the authorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorId(String value) {
        this.authorId = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the narratorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarratorId() {
        return narratorId;
    }

    /**
     * Sets the value of the narratorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarratorId(String value) {
        this.narratorId = value;
    }

    /**
     * Gets the value of the narrator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarrator() {
        return narrator;
    }

    /**
     * Sets the value of the narrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarrator(String value) {
        this.narrator = value;
    }

    /**
     * Gets the value of the canScroll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanScroll() {
        return canScroll;
    }

    /**
     * Sets the value of the canScroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanScroll(Boolean value) {
        this.canScroll = value;
    }

    /**
     * Gets the value of the canPlay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanPlay() {
        return canPlay;
    }

    /**
     * Sets the value of the canPlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanPlay(Boolean value) {
        this.canPlay = value;
    }

    /**
     * Gets the value of the canEnumerate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanEnumerate() {
        return canEnumerate;
    }

    /**
     * Sets the value of the canEnumerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanEnumerate(Boolean value) {
        this.canEnumerate = value;
    }

    /**
     * Gets the value of the canAddToFavorites property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanAddToFavorites() {
        return canAddToFavorites;
    }

    /**
     * Sets the value of the canAddToFavorites property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanAddToFavorites(Boolean value) {
        this.canAddToFavorites = value;
    }

    /**
     * Gets the value of the containsFavorite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainsFavorite() {
        return containsFavorite;
    }

    /**
     * Sets the value of the containsFavorite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainsFavorite(Boolean value) {
        this.containsFavorite = value;
    }

    /**
     * Gets the value of the canCache property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanCache() {
        return canCache;
    }

    /**
     * Sets the value of the canCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanCache(Boolean value) {
        this.canCache = value;
    }

    /**
     * Gets the value of the canSkip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSkip() {
        return canSkip;
    }

    /**
     * Sets the value of the canSkip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSkip(Boolean value) {
        this.canSkip = value;
    }

    /**
     * Gets the value of the albumArtURI property.
     * 
     * @return
     *     possible object is
     *     {@link AlbumArtUrl }
     *     
     */
    public AlbumArtUrl getAlbumArtURI() {
        return albumArtURI;
    }

    /**
     * Sets the value of the albumArtURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlbumArtUrl }
     *     
     */
    public void setAlbumArtURI(AlbumArtUrl value) {
        this.albumArtURI = value;
    }

    /**
     * Gets the value of the canResume property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanResume() {
        return canResume;
    }

    /**
     * Sets the value of the canResume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanResume(Boolean value) {
        this.canResume = value;
    }

    /**
     * Gets the value of the authRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthRequired() {
        return authRequired;
    }

    /**
     * Sets the value of the authRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthRequired(Boolean value) {
        this.authRequired = value;
    }

    /**
     * Gets the value of the homogeneous property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHomogeneous() {
        return homogeneous;
    }

    /**
     * Sets the value of the homogeneous property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHomogeneous(Boolean value) {
        this.homogeneous = value;
    }

    /**
     * Gets the value of the canAddToFavorite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanAddToFavorite() {
        return canAddToFavorite;
    }

    /**
     * Sets the value of the canAddToFavorite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanAddToFavorite(Boolean value) {
        this.canAddToFavorite = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReadOnly() {
        if (readOnly == null) {
            return true;
        } else {
            return readOnly;
        }
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the canReorderItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCanReorderItems() {
        if (canReorderItems == null) {
            return false;
        } else {
            return canReorderItems;
        }
    }

    /**
     * Sets the value of the canReorderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanReorderItems(Boolean value) {
        this.canReorderItems = value;
    }

    /**
     * Gets the value of the canDeleteItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCanDeleteItems() {
        if (canDeleteItems == null) {
            return false;
        } else {
            return canDeleteItems;
        }
    }

    /**
     * Sets the value of the canDeleteItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanDeleteItems(Boolean value) {
        this.canDeleteItems = value;
    }

    /**
     * Gets the value of the renameable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRenameable() {
        if (renameable == null) {
            return false;
        } else {
            return renameable;
        }
    }

    /**
     * Sets the value of the renameable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRenameable(Boolean value) {
        this.renameable = value;
    }

    /**
     * Gets the value of the userContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUserContent() {
        if (userContent == null) {
            return false;
        } else {
            return userContent;
        }
    }

    /**
     * Sets the value of the userContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserContent(Boolean value) {
        this.userContent = value;
    }

}
