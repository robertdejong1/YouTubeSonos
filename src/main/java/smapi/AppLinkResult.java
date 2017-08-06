
package smapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appLinkResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appLinkResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="authorizeAccount" type="{http://www.sonos.com/Services/1.1}appLinkInfo"/>
 *           &lt;element name="createAccount" type="{http://www.sonos.com/Services/1.1}appLinkInfo" minOccurs="0"/>
 *           &lt;element name="installAction" type="{http://www.sonos.com/Services/1.1}callToActionInfo" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="callToAction" type="{http://www.sonos.com/Services/1.1}callToActionInfo"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appLinkResult", propOrder = {
    "authorizeAccount",
    "createAccount",
    "installAction",
    "callToAction"
})
public class AppLinkResult {

    protected AppLinkInfo authorizeAccount;
    protected AppLinkInfo createAccount;
    protected CallToActionInfo installAction;
    protected CallToActionInfo callToAction;

    /**
     * Gets the value of the authorizeAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AppLinkInfo }
     *     
     */
    public AppLinkInfo getAuthorizeAccount() {
        return authorizeAccount;
    }

    /**
     * Sets the value of the authorizeAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppLinkInfo }
     *     
     */
    public void setAuthorizeAccount(AppLinkInfo value) {
        this.authorizeAccount = value;
    }

    /**
     * Gets the value of the createAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AppLinkInfo }
     *     
     */
    public AppLinkInfo getCreateAccount() {
        return createAccount;
    }

    /**
     * Sets the value of the createAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppLinkInfo }
     *     
     */
    public void setCreateAccount(AppLinkInfo value) {
        this.createAccount = value;
    }

    /**
     * Gets the value of the installAction property.
     * 
     * @return
     *     possible object is
     *     {@link CallToActionInfo }
     *     
     */
    public CallToActionInfo getInstallAction() {
        return installAction;
    }

    /**
     * Sets the value of the installAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallToActionInfo }
     *     
     */
    public void setInstallAction(CallToActionInfo value) {
        this.installAction = value;
    }

    /**
     * Gets the value of the callToAction property.
     * 
     * @return
     *     possible object is
     *     {@link CallToActionInfo }
     *     
     */
    public CallToActionInfo getCallToAction() {
        return callToAction;
    }

    /**
     * Sets the value of the callToAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallToActionInfo }
     *     
     */
    public void setCallToAction(CallToActionInfo value) {
        this.callToAction = value;
    }

}
