package builder;

import builder.framework.AbstractBuilder;
import builder.framework.AbstractCar;

import java.util.ArrayList;

/**
 * Created by microzhang on 2016/10/6.
 */
public class BZCarBuilder extends AbstractBuilder {
    private AbstractCar bzCar = new BZCar();

    @Override
    public AbstractCar getCar() {
        return this.bzCar;
    }

    @Override
    public void setStep(ArrayList<String> listStep) {
        this.bzCar.setStep(listStep);
    }
}
