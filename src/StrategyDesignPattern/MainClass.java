package StrategyDesignPattern;

public class MainClass {

    public static void main(String []args) {

        FlyBehaviour flyBehaviour = new FlyWithWings();
        Duck mallarDuck = new MallardDuck(flyBehaviour);
        mallarDuck.perFormFly();

        FlyBehaviour flyBehaviour1 = new FlyWithOutWings();
        Duck redDuck = new RedDuck(flyBehaviour1);
        redDuck.perFormFly();

    }
}
