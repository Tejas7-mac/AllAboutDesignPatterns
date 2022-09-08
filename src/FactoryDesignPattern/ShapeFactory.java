package FactoryDesignPattern;

public class ShapeFactory {

    public Shape getShape(String shapeName) {

        if(shapeName == null) {
            return null;
        } else if (shapeName.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if(shapeName.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        } else if(shapeName.equalsIgnoreCase("Rectangle")) {
            return  new Rectangle();
        }
        return  null;
    }
}
