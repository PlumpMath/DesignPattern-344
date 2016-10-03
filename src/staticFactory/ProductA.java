package staticFactory;

import staticFactory.framework.IProduct;

/**
 * Created by zhanglei1 on 2016/10/3.
 */
public class ProductA implements IProduct {
    @Override
    public void productName() {
        System.out.println("产品A");
    }
}
