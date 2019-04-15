package strategypattern.behavior.impl;

import strategypattern.behavior.TravelBehavior;

/**
 * Description 用轱辘行驶的交通工具
 *
 * @author liub
 * @date 2019-04-15 15:00
 */
public class WheelTravelBehavior implements TravelBehavior {

    @Override
    public void travelWay() {
        System.out.println("travel with wheel");
    }
}
