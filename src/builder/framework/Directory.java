package builder.framework;

import builder.BMWBuilder;
import builder.BZCar;
import builder.BZCarBuilder;

import java.util.ArrayList;

/**
 * Created by microzhang on 2016/10/6.
 */
public class Directory {
    ArrayList<String> listStep = new ArrayList<>();
    AbstractBuilder builder;

    public AbstractCar getBMWCar() {
        builder = new BMWBuilder();
        listStep.clear();
        listStep.add(AbstractCar.START);
        listStep.add(AbstractCar.STOP);
        builder.setStep(listStep);
        return builder.getCar();
    }

    public AbstractCar getBZCar() {
        builder = new BZCarBuilder();
        listStep.clear();
        listStep.add(AbstractCar.BABA);
        listStep.add(AbstractCar.START);
        listStep.add(AbstractCar.STOP);
        builder.setStep(listStep);
        return builder.getCar();
    }
}
