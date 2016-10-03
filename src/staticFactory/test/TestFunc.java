package staticFactory.test;

import org.junit.Test;
import staticFactory.ProductA;
import staticFactory.framework.IProduct;
import staticFactory.framework.StaticFactory;

/**
 * Created by zhanglei1 on 2016/10/3.
 */
public class TestFunc {
    @Test
    public void testStaticFactory() {
        IProduct product = StaticFactory.createProduct(ProductA.class);
        product.productName();
    }
}
