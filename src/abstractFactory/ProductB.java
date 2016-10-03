package abstractFactory;

import abstractFactory.framework.AbstractProductB;

/**
 * Created by zhanglei1 on 2016/10/3.
 */
public class ProductB extends AbstractProductB {
    @Override
    public void size() {
        System.out.println("产品B 大小:50");
    }

    @Override
    public void weight() {
        System.out.println("产品B 重量:520");
    }
}
