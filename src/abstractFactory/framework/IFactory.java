package abstractFactory.framework;

/**
 * Created by zhanglei1 on 2016/10/3.
 */
public interface IFactory {
    public <T extends AbstractProductA> T createProductTypeA(Class<T> productTypeAClass);

    public <T extends AbstractProductB> T createProductTypeB(Class<T> productTypeBClass);
}
