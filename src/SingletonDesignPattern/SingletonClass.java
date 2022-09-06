package SingletonDesignPattern;

public class SingletonClass {

    private static SingletonClass instance = new SingletonClass();

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        return instance;
    }

    public void show() {
        System.out.println("Implementation of Singleton Design pattern is done (:");
    }
}
