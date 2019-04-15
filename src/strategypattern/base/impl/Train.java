package strategypattern.base.impl;

import strategypattern.base.Traffic;
import strategypattern.behavior.TravelBehavior;

/**
 * Description
 *
 * @author liub
 * @date 2019-04-15 11:28
 */
public class Train extends Traffic {

    public Train(TravelBehavior travelBehavior){
        this.setTravelBehavior(travelBehavior);
    }
}
