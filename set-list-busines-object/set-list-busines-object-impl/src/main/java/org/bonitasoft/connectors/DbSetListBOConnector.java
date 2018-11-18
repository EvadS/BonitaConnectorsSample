package org.bonitasoft.connectors;

import org.bonitasoft.engine.connector.ConnectorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class DbSetListBOConnector extends AbstractDbSetListBOConnector {

    final Logger logger = LoggerFactory.getLogger(DbSetListBOConnector.class);

    @Override
    protected void executeBusinessLogic() throws ConnectorException {

        logger.info("========================================");
        logger.info("apiUrl  : " + getUrl());

        setStatus(500);
    }
}
