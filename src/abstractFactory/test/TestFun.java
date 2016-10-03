package abstractFactory.test;

import abstractFactory.Factory;
import abstractFactory.ProductA;
import abstractFactory.ProductB;
import abstractFactory.framework.IFactory;
import abstractFactory.framework.IProductTypeA;
import abstractFactory.framework.IProductTypeB;
import org.junit.Test;

/**
 * Created by zhanglei1 on 2016/10/3.
 */
public class TestFun {
    @Test
    public void testAbstractFactory() {
        IFactory factory = new Factory();
        IProductTypeA productTypeA = factory.createProductTypeA(ProductA.class);
        IProductTypeB productTypeB = factory.createProductTypeB(ProductB.class);

        System.out.println("产品A的相关信息--------------------");
        productTypeA.productColor();
        productTypeA.productName();
        productTypeA.productPrice();

        System.out.println("\n");
        System.out.println("产品B的相关信息--------------------");
        productTypeB.productName();
        productTypeB.size();
        productTypeB.weight();
    }
}
