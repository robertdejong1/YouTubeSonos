
package smapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createContainerResult" type="{http://www.sonos.com/Services/1.1}createContainerResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createContainerResult"
})
@XmlRootElement(name = "createContainerResponse")
public class CreateContainerResponse {

    @XmlElement(required = true)
    protected CreateContainerResult createContainerResult;

    /**
     * Gets the value of the createContainerResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreateContainerResult }
     *     
     */
    public CreateContainerResult getCreateContainerResult() {
        return createContainerResult;
    }

    /**
     * Sets the value of the createContainerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateContainerResult }
     *     
     */
    public void setCreateContainerResult(CreateContainerResult value) {
        this.createContainerResult = value;
    }

}
