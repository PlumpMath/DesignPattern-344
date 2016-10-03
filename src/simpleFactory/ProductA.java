package simpleFactory;

import simpleFactory.myInterface.AbstractProduct;

/**
 * Created by zhanglei1 on 2016/10/3.
 */
public class ProductA extends AbstractProduct {
    @Override
    public void product() {
        System.out.println("生产ProductA");
    }
}
