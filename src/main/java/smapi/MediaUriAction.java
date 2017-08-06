
package smapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mediaUriAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mediaUriAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IMPLICIT"/>
 *     &lt;enumeration value="EXPLICIT:PLAY"/>
 *     &lt;enumeration value="EXPLICIT:SEEK"/>
 *     &lt;enumeration value="EXPLICIT:SKIP_FORWARD"/>
 *     &lt;enumeration value="EXPLICIT:SKIP_BACK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mediaUriAction")
@XmlEnum
public enum MediaUriAction {

    IMPLICIT("IMPLICIT"),
    @XmlEnumValue("EXPLICIT:PLAY")
    EXPLICIT_PLAY("EXPLICIT:PLAY"),
    @XmlEnumValue("EXPLICIT:SEEK")
    EXPLICIT_SEEK("EXPLICIT:SEEK"),
    @XmlEnumValue("EXPLICIT:SKIP_FORWARD")
    EXPLICIT_SKIP_FORWARD("EXPLICIT:SKIP_FORWARD"),
    @XmlEnumValue("EXPLICIT:SKIP_BACK")
    EXPLICIT_SKIP_BACK("EXPLICIT:SKIP_BACK");
    private final String value;

    MediaUriAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaUriAction fromValue(String v) {
        for (MediaUriAction c: MediaUriAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
