package strategypattern.behavior.impl;

import strategypattern.behavior.TravelBehavior;

/**
 * Description 使用铁轨行驶的交通工具
 *
 * @author liub
 * @date 2019-04-15 15:04
 */
public class RailHavior implements TravelBehavior {
    @Override
    public void travelWay() {
        System.out.println("travel with rail");
    }
}
