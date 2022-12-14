package StrategyDesignPattern;

public class MallardDuck extends  Duck{

    public MallardDuck(FlyBehaviour flyBehaviour) {
        super(flyBehaviour);
    }

    @Override
    public void perFormFly() {
        flyBehaviour.fly();
    }
}
