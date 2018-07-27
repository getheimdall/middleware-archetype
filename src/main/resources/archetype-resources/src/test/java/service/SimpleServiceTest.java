package ${groupId}.service;

import ${groupId}.MiddlewareExampleGET;
import br.com.conductor.heimdall.middleware.spec.Helper;
import br.com.conductor.heimdall.middleware.util.helpermock.HelperMock;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleServiceTest {

    private static Helper helper;
    private static MiddlewareExampleGET middlewareExampleGET;

    @BeforeClass
    public static void setUp() {
        helper = new HelperMock();
        middlewareExampleGET = new MiddlewareExampleGET();
    }

    @Test
    public void simpleTest() {
        middlewareExampleGET.run(helper);
        assertTrue(true);
    }

}