package templateMethod;

import org.junit.Test;
import templateMethod.framework.AbstractTemplateCar;

/**
 * Created by microzhang on 2016/10/4.
 */
public class TestFun {
    @Test
    public void testTemplateMethod() {
        AbstractTemplateCar car = new CarB();
        car.run();
    }
}
