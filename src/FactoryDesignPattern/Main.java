package FactoryDesignPattern;

public class Main {

    public static  void main(String []args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("Circle");

        shape.draw();

        Shape shapeOne = shapeFactory.getShape("Rectangle");

        shapeOne.draw();

        Shape shapeTwo = shapeFactory.getShape("Triangle");

        shapeTwo.draw();



    }
}
