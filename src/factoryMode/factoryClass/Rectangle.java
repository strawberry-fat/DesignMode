package factoryMode.factoryClass;

import factoryMode.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is Rectangle.");
    }
}
