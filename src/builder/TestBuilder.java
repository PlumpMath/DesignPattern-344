package builder;

import builder.framework.AbstractCar;
import builder.framework.Directory;
import org.junit.Test;

/**
 * Created by microzhang on 2016/10/6.
 */
public class TestBuilder {
    @Test
    public void testBuilder() {
        Directory directory = new Directory();
        AbstractCar bmwCar = directory.getBMWCar();
        bmwCar.run();

        AbstractCar bzCar = directory.getBZCar();
        bzCar.run();
    }
}
