package strategypattern.base.impl;

import strategypattern.base.Traffic;
import strategypattern.behavior.TravelBehavior;

/**
 * Description 公共汽车
 *
 * @author liub
 * @date 2019-04-15 11:28
 */
public class Bus extends Traffic {

    public Bus(TravelBehavior travelBehavior){
        this.setTravelBehavior(travelBehavior);
    }
}
