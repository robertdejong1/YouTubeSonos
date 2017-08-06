
package smapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lastUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lastUpdate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalog" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="favorites" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pollInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="autoRefreshEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lastUpdate", propOrder = {
    "catalog",
    "favorites",
    "pollInterval",
    "autoRefreshEnabled"
})
public class LastUpdate {

    @XmlElement(required = true)
    protected String catalog;
    @XmlElement(required = true)
    protected String favorites;
    protected Integer pollInterval;
    protected Boolean autoRefreshEnabled;

    /**
     * Gets the value of the catalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * Sets the value of the catalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalog(String value) {
        this.catalog = value;
    }

    /**
     * Gets the value of the favorites property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFavorites() {
        return favorites;
    }

    /**
     * Sets the value of the favorites property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFavorites(String value) {
        this.favorites = value;
    }

    /**
     * Gets the value of the pollInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPollInterval() {
        return pollInterval;
    }

    /**
     * Sets the value of the pollInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPollInterval(Integer value) {
        this.pollInterval = value;
    }

    /**
     * Gets the value of the autoRefreshEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRefreshEnabled() {
        return autoRefreshEnabled;
    }

    /**
     * Sets the value of the autoRefreshEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRefreshEnabled(Boolean value) {
        this.autoRefreshEnabled = value;
    }

}
