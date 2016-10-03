package simpleFactory.myInterface;

/**
 * Created by zhanglei1 on 2016/10/3.
 */
public interface IFactory {
    public <T extends AbstractProduct> T createProduct(Class<T> productClass);
}
