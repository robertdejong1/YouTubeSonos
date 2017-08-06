
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
 *         &lt;element name="reportPlaySecondsResult" type="{http://www.sonos.com/Services/1.1}reportPlaySecondsResult"/>
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
    "reportPlaySecondsResult"
})
@XmlRootElement(name = "reportPlaySecondsResponse")
public class ReportPlaySecondsResponse {

    @XmlElement(required = true)
    protected ReportPlaySecondsResult reportPlaySecondsResult;

    /**
     * Gets the value of the reportPlaySecondsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPlaySecondsResult }
     *     
     */
    public ReportPlaySecondsResult getReportPlaySecondsResult() {
        return reportPlaySecondsResult;
    }

    /**
     * Sets the value of the reportPlaySecondsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPlaySecondsResult }
     *     
     */
    public void setReportPlaySecondsResult(ReportPlaySecondsResult value) {
        this.reportPlaySecondsResult = value;
    }

}
