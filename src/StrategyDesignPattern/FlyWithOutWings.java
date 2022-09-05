package StrategyDesignPattern;

public class FlyWithOutWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I cannot Fly");
    }
}
