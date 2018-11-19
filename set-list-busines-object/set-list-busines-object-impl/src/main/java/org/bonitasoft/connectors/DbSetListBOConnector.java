package org.bonitasoft.connectors;

import org.bonitasoft.engine.connector.ConnectorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class DbSetListBOConnector extends AbstractDbSetListBOConnector {

    final Logger logger = LoggerFactory.getLogger(DbSetListBOConnector.class);

    @Override
    protected void executeBusinessLogic() throws ConnectorException {

        logger.info("========================================");
        logger.info("apiUrl  : " + getNode_url());


        if(getMyList()!= null && getMyList().size()>0)
        {
            for (Object i:getMyList()) {
                logger.info(String.format("%s : " ,i.toString()));
            }
        }
        logger.error(String.format("my list is empty or null   "));

        setStatus(500);
    }
}
