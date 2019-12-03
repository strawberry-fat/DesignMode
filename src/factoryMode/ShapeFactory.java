package factoryMode;

import factoryMode.factoryClass.Circle;
import factoryMode.factoryClass.Rectangle;
import factoryMode.factoryClass.Square;
import factoryMode.interfaces.Shape;

public class ShapeFactory {
    Shape shape;
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if (shapeType.equals("Rectangle")){
            shape = new Rectangle();
            return shape;
        }
        if(shapeType.equals("Square")){
            return new Square();
        }
        if(shapeType.equals("Circle")){
            return new Circle();
        }
        return null;
    }
}
