package abstractFactory.framework;

/**
 * Created by zhanglei1 on 2016/10/3.
 */
public abstract class AbstractProductB implements IProductTypeB {
    @Override
    public void productName() {
        System.out.println("生产产品 AbstractProductB");
    }
}
