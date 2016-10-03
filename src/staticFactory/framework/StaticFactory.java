package staticFactory.framework;

/**
 * Created by zhanglei1 on 2016/10/3.
 */
public class StaticFactory {
    public static <T extends IProduct> T createProduct(Class<T> productClass) {
        T product = null;

        try {
            product = (T) Class.forName(productClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return product;
    }
}
