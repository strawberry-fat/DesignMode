package factoryMode.factoryClass;

import factoryMode.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is a Circle.");
    }
}
