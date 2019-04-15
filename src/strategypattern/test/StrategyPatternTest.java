package strategypattern.test;

import strategypattern.base.Traffic;
import strategypattern.base.impl.Bus;
import strategypattern.base.impl.Train;
import strategypattern.behavior.impl.RailHavior;
import strategypattern.behavior.impl.WheelTravelBehavior;

/**
 * Description
 *
 * @author liub
 * @date 2019-04-15 15:26
 */
public class StrategyPatternTest {

    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        Traffic traffic = new Bus(new RailHavior());
        traffic.mannedMode();
        traffic.executeTravel();

        Traffic traffic1 = new Train(new WheelTravelBehavior());
        traffic1.mannedMode();
        traffic1.executeTravel();
    }
}
