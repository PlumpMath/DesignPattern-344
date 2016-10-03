package simpleFactory.myInterface;

/**
 * Created by zhanglei1 on 2016/10/3.
 */
public abstract class AbstractFactory implements IFactory {
    private static final String TAG = AbstractFactory.class.getSimpleName();

    public void factoryInner() {
        System.out.println(TAG + " : productInner");
    }
}
