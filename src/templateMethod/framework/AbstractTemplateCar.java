package templateMethod.framework;

/**
 * Created by microzhang on 2016/10/4.
 */
public abstract class AbstractTemplateCar {
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    public final void run() {
        this.start();
        this.alarm();
        this.stop();
    }
}
