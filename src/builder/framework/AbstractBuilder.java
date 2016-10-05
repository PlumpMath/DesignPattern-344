package builder.framework;

import java.util.ArrayList;

/**
 * Created by microzhang on 2016/10/6.
 */
public abstract class AbstractBuilder {

    public abstract AbstractCar getCar();

    public abstract void setStep(ArrayList<String> listStep);
}
