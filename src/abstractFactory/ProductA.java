package abstractFactory;

import abstractFactory.framework.AbstractProductA;

/**
 * Created by zhanglei1 on 2016/10/3.
 */
public class ProductA extends AbstractProductA {
    @Override
    public void productColor() {
        System.out.println("产品A 颜色:红色");
    }

    @Override
    public void productPrice() {
        System.out.println("产品A 价格:100");
    }
}
