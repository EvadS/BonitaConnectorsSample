package org.bonitasoft.connectors;

import org.bonitasoft.engine.connector.AbstractConnector;
import org.bonitasoft.engine.connector.ConnectorValidationException;

public abstract class AbstractDbSetListBOConnector  extends AbstractConnector
 {

     protected final static String NODE_URL_INPUT_PARAMETER = "node_url";
     protected final static String MYLIST_INPUT_PARAMETER = "myList";
     protected final String STATUS_OUTPUT_PARAMETER = "status";

     protected final java.lang.String getNode_url() {
         return (java.lang.String) getInputParameter(NODE_URL_INPUT_PARAMETER);
     }

     protected final java.util.List getMyList() {
         return (java.util.List) getInputParameter(MYLIST_INPUT_PARAMETER);
     }

     //output
     protected final void setStatus(java.lang.Integer status) {
         setOutputParameter(STATUS_OUTPUT_PARAMETER, status);
     }

     @Override
     public void validateInputParameters() throws ConnectorValidationException {
         try {
             getNode_url();
         } catch (ClassCastException cce) {
             throw new ConnectorValidationException("node_url type is invalid");
         }
         try {
             getMyList();
         } catch (ClassCastException cce) {
             throw new ConnectorValidationException("myList type is invalid");
         }
     }
 }
