package pe.edu.silabo.core.dao;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public class AbstractUnitTest extends AbstractTransactionalDataSourceSpringContextTests {

    @Override
    protected String[] getConfigLocations() {
        setPopulateProtectedVariables(true);
        setAutowireMode(AUTOWIRE_BY_TYPE);
        return new String[] {
                "pe/edu/silabo/core/config/applicationContext-config.xml",
                "pe/edu/silabo/core/config/applicationContext-dao.xml"
                };
    }

    public void testApp() {
        assertTrue(true);
    }

}
