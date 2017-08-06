
package smapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userAccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="userAccountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="premium"/>
 *     &lt;enumeration value="trial"/>
 *     &lt;enumeration value="free"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "userAccountType")
@XmlEnum
public enum UserAccountType {

    @XmlEnumValue("premium")
    PREMIUM("premium"),
    @XmlEnumValue("trial")
    TRIAL("trial"),
    @XmlEnumValue("free")
    FREE("free");
    private final String value;

    UserAccountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserAccountType fromValue(String v) {
        for (UserAccountType c: UserAccountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
