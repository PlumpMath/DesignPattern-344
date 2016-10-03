package simpleFactory;

import simpleFactory.myInterface.AbstractFactory;
import simpleFactory.myInterface.AbstractProduct;

/**
 * Created by zhanglei1 on 2016/10/3.
 */
@SuppressWarnings("unchecked")
public class Factory extends AbstractFactory {
    @Override
    public <T extends AbstractProduct> T createProduct(Class<T> productClass) {
        AbstractProduct product = null;
        try {
            product = (AbstractProduct) Class.forName(productClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
