package StrategyDesignPattern;


public class Duck {

    protected FlyBehaviour flyBehaviour;

    public Duck(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void perFormFly() {

        flyBehaviour.fly();

    }

}
