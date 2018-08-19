
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package migration;

import java.util.logging.Logger;


/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-07-26T15:22:03.938-05:00
 * Generated source version: 3.1.12
 * 
 */

@javax.jws.WebService(
                      serviceName = "MigratorWS",
                      portName = "MigratorWSPort",
                      targetNamespace = "http://logic/",
                      wsdlLocation = "http://149.149.134.241:8080/MigratorWS/services/MigratorWSPort?wsdl",
                      endpointInterface = "logic.MigratorWSPortType")
                      
public class MigratorWSPortImpl implements MigratorWSPortType {

    private static final Logger LOG = Logger.getLogger(MigratorWSPortImpl.class.getName());

    /* (non-Javadoc)
     * @see logic.MigratorWSPortType#duplicateWS(logic.Ws ws, java.lang.String destinationManagerURL, java.lang.String destinationWSDLAddress)*
     */
    public boolean duplicateWS(migration.Ws ws, java.lang.String destinationManagerURL, java.lang.String destinationWSDLAddress) { 
        LOG.info("Executing operation duplicateWS");
        System.out.println(ws);
        System.out.println(destinationManagerURL);
        System.out.println(destinationWSDLAddress);
        try {
            boolean _return = true;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see logic.MigratorWSPortType#moveWS(logic.Ws ws, java.lang.String sourceManagerURL, java.lang.String destinationManagerURL, java.lang.String destinationWSDLAddress)*
     */
    public boolean moveWS(migration.Ws ws, java.lang.String sourceManagerURL, java.lang.String destinationManagerURL, java.lang.String destinationWSDLAddress) { 
        LOG.info("Executing operation moveWS");
        System.out.println(ws);
        System.out.println(sourceManagerURL);
        System.out.println(destinationManagerURL);
        System.out.println(destinationWSDLAddress);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see logic.MigratorWSPortType#undeploy(logic.Ws ws, java.lang.String tomcatManagerURL)*
     */
    public boolean undeploy(migration.Ws ws, java.lang.String tomcatManagerURL) { 
        LOG.info("Executing operation undeploy");
        System.out.println(ws);
        System.out.println(tomcatManagerURL);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}