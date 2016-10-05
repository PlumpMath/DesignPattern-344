package builder;

import builder.framework.AbstractCar;

/**
 * Created by microzhang on 2016/10/6.
 */
public class BMWCar extends AbstractCar {
    @Override
    public void start() {
        System.out.println("宝马车--启动");
    }

    @Override
    public void stop() {
        System.out.println("宝马车--停止");
    }

    @Override
    public void baba() {
        System.out.println("宝马车--鸣笛");
    }
}
