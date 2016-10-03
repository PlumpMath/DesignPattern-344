package templateMethod;

import templateMethod.framework.AbstractTemplateCar;

/**
 * Created by microzhang on 2016/10/4.
 */
public class CarB extends AbstractTemplateCar {
    @Override
    public void start() {
        System.out.println("汽车B : 启动");
    }

    @Override
    public void stop() {
        System.out.println("汽车B : 停止");
    }

    @Override
    public void alarm() {
        System.out.println("汽车B : 鸣笛");
    }
}
