
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package controllerPkg;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-09-28T11:56:21.450-05:00
 * Generated source version: 3.1.12
 * 
 */

@javax.jws.WebService(
                      serviceName = "ControllerClassService",
                      portName = "ControllerClassPort",
                      targetNamespace = "http://logic/",
                      wsdlLocation = "http://localhost:8080/ControllerWS/services/ControllerClassPort?wsdl",
                      endpointInterface = "controllerPkg.ControllerWSSEI")
                      
public class ControllerClassPortImpl implements ControllerWSSEI {

    private static final Logger LOG = Logger.getLogger(ControllerClassPortImpl.class.getName());

    /* (non-Javadoc)
     * @see controllerPkg.ControllerWSSEI#start(java.lang.String webContext)*
     */
    public boolean start(java.lang.String webContext) { 
        LOG.info("Executing operation start");
        System.out.println(webContext);
        try {
            boolean _return = true;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see controllerPkg.ControllerWSSEI#getNextEndpoint()*
     */
    public java.lang.String getNextEndpoint() { 
        LOG.info("Executing operation getNextEndpoint");
        try {
            java.lang.String _return = "_return-1723321824";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see controllerPkg.ControllerWSSEI#stop(java.lang.String webContext)*
     */
    public boolean stop(java.lang.String webContext) { 
        LOG.info("Executing operation stop");
        System.out.println(webContext);
        try {
            boolean _return = true;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
