package strategypattern.base;

import strategypattern.behavior.TravelBehavior;

/**
 * Description 交通工具
 *
 * @author liub
 * @date 2019-04-15 11:25
 */
public abstract class Traffic {

    TravelBehavior travelBehavior;

    /**
     * 载客方式 - 乘客坐在座位上
     */
    public void mannedMode(){
        System.out.println("sitting in the seat");
    }

    public void executeTravel(){
        travelBehavior.travelWay();
    }

    public TravelBehavior getTravelBehavior() {
        return travelBehavior;
    }

    public void setTravelBehavior(TravelBehavior travelBehavior) {
        this.travelBehavior = travelBehavior;
    }
}
