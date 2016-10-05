package builder;

import builder.framework.AbstractCar;

/**
 * Created by microzhang on 2016/10/6.
 */
public class BZCar extends AbstractCar {
    @Override
    public void start() {
        System.out.println("奔驰车--启动");
    }

    @Override
    public void stop() {
        System.out.println("奔驰车--停止");
    }

    @Override
    public void baba() {
        System.out.println("奔驰车--鸣笛");
    }
}
