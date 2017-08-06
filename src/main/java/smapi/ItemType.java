
package smapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="itemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="artist"/>
 *     &lt;enumeration value="album"/>
 *     &lt;enumeration value="genre"/>
 *     &lt;enumeration value="playlist"/>
 *     &lt;enumeration value="track"/>
 *     &lt;enumeration value="search"/>
 *     &lt;enumeration value="stream"/>
 *     &lt;enumeration value="show"/>
 *     &lt;enumeration value="program"/>
 *     &lt;enumeration value="favorites"/>
 *     &lt;enumeration value="favorite"/>
 *     &lt;enumeration value="collection"/>
 *     &lt;enumeration value="container"/>
 *     &lt;enumeration value="albumList"/>
 *     &lt;enumeration value="trackList"/>
 *     &lt;enumeration value="streamList"/>
 *     &lt;enumeration value="artistTrackList"/>
 *     &lt;enumeration value="audiobook"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "itemType")
@XmlEnum
public enum ItemType {

    @XmlEnumValue("artist")
    ARTIST("artist"),
    @XmlEnumValue("album")
    ALBUM("album"),
    @XmlEnumValue("genre")
    GENRE("genre"),
    @XmlEnumValue("playlist")
    PLAYLIST("playlist"),
    @XmlEnumValue("track")
    TRACK("track"),
    @XmlEnumValue("search")
    SEARCH("search"),
    @XmlEnumValue("stream")
    STREAM("stream"),
    @XmlEnumValue("show")
    SHOW("show"),
    @XmlEnumValue("program")
    PROGRAM("program"),
    @XmlEnumValue("favorites")
    FAVORITES("favorites"),
    @XmlEnumValue("favorite")
    FAVORITE("favorite"),
    @XmlEnumValue("collection")
    COLLECTION("collection"),
    @XmlEnumValue("container")
    CONTAINER("container"),
    @XmlEnumValue("albumList")
    ALBUM_LIST("albumList"),
    @XmlEnumValue("trackList")
    TRACK_LIST("trackList"),
    @XmlEnumValue("streamList")
    STREAM_LIST("streamList"),
    @XmlEnumValue("artistTrackList")
    ARTIST_TRACK_LIST("artistTrackList"),
    @XmlEnumValue("audiobook")
    AUDIOBOOK("audiobook"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemType fromValue(String v) {
        for (ItemType c: ItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
