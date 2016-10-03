package simpleFactory.test;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import simpleFactory.Factory;
import simpleFactory.ProductA;
import simpleFactory.myInterface.AbstractFactory;
import simpleFactory.myInterface.AbstractProduct;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * Factory Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>10, 3, 2016</pre>
 */
public class FactoryTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: createProduct(Class<T> productClass)
     */
    @Test
    public void testCreateProduct() throws Exception {
        AbstractFactory factory = new Factory();
        AbstractProduct product = factory.createProduct(ProductA.class);
        product.product();
    }


} 
