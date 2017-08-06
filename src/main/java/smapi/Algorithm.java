
package smapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for algorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="algorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AES/CBC/PKCS#7"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "algorithm")
@XmlEnum
public enum Algorithm {

    @XmlEnumValue("AES/CBC/PKCS#7")
    AES_CBC_PKCS_7("AES/CBC/PKCS#7");
    private final String value;

    Algorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm fromValue(String v) {
        for (Algorithm c: Algorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
