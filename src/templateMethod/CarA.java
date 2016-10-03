package templateMethod;

import templateMethod.framework.AbstractTemplateCar;

/**
 * Created by microzhang on 2016/10/4.
 */
public class CarA extends AbstractTemplateCar {
    @Override
    public void start() {
        System.out.println("汽车A : 启动");
    }

    @Override
    public void stop() {
        System.out.println("汽车A : 停止");
    }

    @Override
    public void alarm() {
        System.out.println("汽车A : 鸣笛");
    }
}
