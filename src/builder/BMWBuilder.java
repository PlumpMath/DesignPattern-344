package builder;

import builder.framework.AbstractBuilder;
import builder.framework.AbstractCar;

import java.util.ArrayList;

/**
 * Created by microzhang on 2016/10/6.
 */
public class BMWBuilder extends AbstractBuilder {
    private AbstractCar abstractCar = new BMWCar();

    @Override
    public AbstractCar getCar() {
        return abstractCar;
    }

    @Override
    public void setStep(ArrayList<String> listStep) {
        abstractCar.setStep(listStep);
    }
}
