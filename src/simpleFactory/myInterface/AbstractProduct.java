package simpleFactory.myInterface;

/**
 * Created by zhanglei1 on 2016/10/3.
 */
public abstract class AbstractProduct implements IProduct {
    private static final String TAG = AbstractProduct.class.getSimpleName();

    public void productInner() {
        System.out.println(TAG + " : productInner");
    }

    @Override
    public abstract void product();
}
