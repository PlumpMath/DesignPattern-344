package builder.framework;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by microzhang on 2016/10/6.
 */
public abstract class AbstractCar {
    public static final String START = "start";
    public static final String STOP = "stop";
    public static final String BABA = "babas";

    private List<String> listStep = new ArrayList<String>();

    public abstract void start();

    public abstract void stop();

    public abstract void baba();

    public void setStep(ArrayList<String> listStep) {
        this.listStep = listStep;
    }

    public void run() {
        for (int i = 0; i < listStep.size(); i++) {
            if (listStep.get(i).equals(START)) {
                this.start();
            } else if (listStep.get(i).equals(STOP)) {
                this.stop();
            } else if (listStep.get(i).equals(BABA)) {
                this.baba();
            } else {
                System.out.println("没有设置顺序，不做任何操作!");
            }
        }
    }
}
