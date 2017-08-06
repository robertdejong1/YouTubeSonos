
package smapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userIdHashCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountType" type="{http://www.sonos.com/Services/1.1}userAccountType" minOccurs="0"/>
 *         &lt;element name="accountStatus" type="{http://www.sonos.com/Services/1.1}userAccountStatus" minOccurs="0"/>
 *         &lt;element ref="{http://www.sonos.com/Services/1.1}nickname" minOccurs="0"/>
 *         &lt;element name="profileUrl" type="{http://www.sonos.com/Services/1.1}sonosUri" minOccurs="0"/>
 *         &lt;element name="pictureUrl" type="{http://www.sonos.com/Services/1.1}sonosUri" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userInfo", propOrder = {
    "userIdHashCode",
    "accountType",
    "accountStatus",
    "nickname",
    "profileUrl",
    "pictureUrl"
})
public class UserInfo {

    @XmlElement(required = true)
    protected String userIdHashCode;
    protected UserAccountType accountType;
    protected UserAccountStatus accountStatus;
    protected String nickname;
    protected String profileUrl;
    protected String pictureUrl;

    /**
     * Gets the value of the userIdHashCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdHashCode() {
        return userIdHashCode;
    }

    /**
     * Sets the value of the userIdHashCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdHashCode(String value) {
        this.userIdHashCode = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link UserAccountType }
     *     
     */
    public UserAccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAccountType }
     *     
     */
    public void setAccountType(UserAccountType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UserAccountStatus }
     *     
     */
    public UserAccountStatus getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAccountStatus }
     *     
     */
    public void setAccountStatus(UserAccountStatus value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the profileUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileUrl() {
        return profileUrl;
    }

    /**
     * Sets the value of the profileUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileUrl(String value) {
        this.profileUrl = value;
    }

    /**
     * Gets the value of the pictureUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * Sets the value of the pictureUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureUrl(String value) {
        this.pictureUrl = value;
    }

}
