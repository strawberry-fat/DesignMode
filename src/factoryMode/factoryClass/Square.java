package factoryMode.factoryClass;

import factoryMode.interfaces.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("this is a Square.");
    }
}
