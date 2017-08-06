
package smapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trackMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trackMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="artistId" type="{http://www.sonos.com/Services/1.1}id" minOccurs="0"/>
 *             &lt;element name="artist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             &lt;element name="composerId" type="{http://www.sonos.com/Services/1.1}id" minOccurs="0"/>
 *             &lt;element name="composer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             &lt;element name="albumArtistId" type="{http://www.sonos.com/Services/1.1}id" minOccurs="0"/>
 *             &lt;element name="albumArtist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             &lt;element name="albumId" type="{http://www.sonos.com/Services/1.1}id" minOccurs="0"/>
 *             &lt;element name="album" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="authorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             &lt;element name="narratorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             &lt;element name="narrator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             &lt;element name="bookId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             &lt;element name="book" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="genreId" type="{http://www.sonos.com/Services/1.1}id" minOccurs="0"/>
 *         &lt;element name="genre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="albumArtURI" type="{http://www.sonos.com/Services/1.1}albumArtUrl" minOccurs="0"/>
 *         &lt;element name="trackNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="canPlay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canSkip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canAddToFavorites" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canResume" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canSeek" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "trackMetadata", propOrder = {
    "artistId",
    "artist",
    "composerId",
    "composer",
    "albumArtistId",
    "albumArtist",
    "albumId",
    "album",
    "authorId",
    "author",
    "narratorId",
    "narrator",
    "bookId",
    "book",
    "genreId",
    "genre",
    "duration",
    "rating",
    "albumArtURI",
    "trackNumber",
    "canPlay",
    "canSkip",
    "canAddToFavorites",
    "canResume",
    "canSeek",
    "hasOutOfBandMetadata"
})
public class TrackMetadata {

    protected String artistId;
    protected String artist;
    protected String composerId;
    protected String composer;
    protected String albumArtistId;
    protected String albumArtist;
    protected String albumId;
    protected String album;
    protected String authorId;
    protected String author;
    protected String narratorId;
    protected String narrator;
    protected String bookId;
    protected String book;
    protected String genreId;
    protected String genre;
    protected Integer duration;
    protected Integer rating;
    protected AlbumArtUrl albumArtURI;
    protected Integer trackNumber;
    protected Boolean canPlay;
    protected Boolean canSkip;
    protected Boolean canAddToFavorites;
    protected Boolean canResume;
    protected Boolean canSeek;
    protected Boolean hasOutOfBandMetadata;

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
     * Gets the value of the composerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComposerId() {
        return composerId;
    }

    /**
     * Sets the value of the composerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComposerId(String value) {
        this.composerId = value;
    }

    /**
     * Gets the value of the composer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComposer() {
        return composer;
    }

    /**
     * Sets the value of the composer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComposer(String value) {
        this.composer = value;
    }

    /**
     * Gets the value of the albumArtistId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlbumArtistId() {
        return albumArtistId;
    }

    /**
     * Sets the value of the albumArtistId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlbumArtistId(String value) {
        this.albumArtistId = value;
    }

    /**
     * Gets the value of the albumArtist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlbumArtist() {
        return albumArtist;
    }

    /**
     * Sets the value of the albumArtist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlbumArtist(String value) {
        this.albumArtist = value;
    }

    /**
     * Gets the value of the albumId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlbumId() {
        return albumId;
    }

    /**
     * Sets the value of the albumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlbumId(String value) {
        this.albumId = value;
    }

    /**
     * Gets the value of the album property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlbum() {
        return album;
    }

    /**
     * Sets the value of the album property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlbum(String value) {
        this.album = value;
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
     * Gets the value of the bookId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * Sets the value of the bookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookId(String value) {
        this.bookId = value;
    }

    /**
     * Gets the value of the book property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBook() {
        return book;
    }

    /**
     * Sets the value of the book property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBook(String value) {
        this.book = value;
    }

    /**
     * Gets the value of the genreId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenreId() {
        return genreId;
    }

    /**
     * Sets the value of the genreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenreId(String value) {
        this.genreId = value;
    }

    /**
     * Gets the value of the genre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the value of the genre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenre(String value) {
        this.genre = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRating(Integer value) {
        this.rating = value;
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
     * Gets the value of the trackNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrackNumber() {
        return trackNumber;
    }

    /**
     * Sets the value of the trackNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrackNumber(Integer value) {
        this.trackNumber = value;
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
     * Gets the value of the canSeek property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSeek() {
        return canSeek;
    }

    /**
     * Sets the value of the canSeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSeek(Boolean value) {
        this.canSeek = value;
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
