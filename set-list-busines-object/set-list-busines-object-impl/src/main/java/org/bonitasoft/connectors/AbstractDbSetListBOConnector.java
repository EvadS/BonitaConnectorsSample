package org.bonitasoft.connectors;

import org.bonitasoft.engine.connector.AbstractConnector;
import org.bonitasoft.engine.connector.ConnectorValidationException;

public abstract class AbstractDbSetListBOConnector  extends AbstractConnector
 {

    protected final static String URL_INPUT_PARAMETER = "node_url";
    protected final String STATUS_OUTPUT_PARAM = "status";

    //inputs
    protected final String getUrl() {
        return (String) getInputParameter(URL_INPUT_PARAMETER);
    }

    //outputs
    protected final void setStatus(Integer responseStatus) {
        setOutputParameter(STATUS_OUTPUT_PARAM, responseStatus);
    }

    @Override
    public void validateInputParameters() throws ConnectorValidationException {
        try {
           getUrl();
        } catch (ClassCastException cce) {
            throw new ConnectorValidationException("url type is invalid");
        }
    }
}
