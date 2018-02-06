package youtubesonos;

import smapi.CustomFault;
import smapi.CustomFaultDetail;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPFault;
import javax.xml.ws.soap.SOAPFaultException;

public class SonosFaults {

    private static SOAPFactory soapFactory;

    static {
        try {
            soapFactory = SOAPFactory.newInstance();
        }
        catch (SOAPException e) {
            e.printStackTrace();
        }
    }

    private static CustomFault getFault(String faultCode, String message) {
        return getFault(faultCode, message, null);
    }

    private static CustomFault getFault(String faultCode, String message, int sonosError) {
        CustomFaultDetail detail = new CustomFaultDetail();
        detail.setSonosError(sonosError);
        return getFault(faultCode, message, detail);
    }

    private static CustomFault getFault(String faultCode, String message, CustomFaultDetail detail) {
        SOAPFault soapFault;

        try {
            soapFault = soapFactory.createFault(message, new QName(faultCode));
            return new CustomFault(message, detail, new SOAPFaultException(soapFault));
        }
        catch (SOAPException e) {
            return new CustomFault(message, detail);
        }
    }

    public static final CustomFault LOGIN_INVALID = getFault("Client.LoginInvalid", "The provided credentials are not valid for this service");
    public static final CustomFault AUTH_TOKEN_EXPIRED = getFault("Client.AuthTokenExpired", "Your credentials have expired");
    public static final CustomFault NOT_LINKED_RETRY = getFault("Client.NOT_LINKED_RETRY", "Link code not yet authorized, try again.", 5);
    public static final CustomFault NOT_LINKED_FAILURE = getFault("Client.NOT_LINKED_FAILURE", "Link code not valid", 6);
    public static final CustomFault ITEM_NOT_FOUND = getFault("Client.ItemNotFound", "The requested item could not be found");
}
