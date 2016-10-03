package abstractFactory;

import abstractFactory.framework.AbstractFactory;
import abstractFactory.framework.AbstractProductA;
import abstractFactory.framework.AbstractProductB;

/**
 * Created by zhanglei1 on 2016/10/3.
 */
public class Factory extends AbstractFactory {
    @Override
    public <T extends AbstractProductA> T createProductTypeA(Class<T> productTypeAClass) {
        AbstractProductA product = null;
        try {
            product = (T) Class.forName(productTypeAClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }

    @Override
    public <T extends AbstractProductB> T createProductTypeB(Class<T> productTypeBClass) {
        AbstractProductB product = null;
        try {
            product = (T) Class.forName(productTypeBClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
