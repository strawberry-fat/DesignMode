package factoryMode;

import factoryMode.interfaces.Shape;

/**
 * 工厂模式
 * 工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *
 * 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来a指向新创建的对象。
 *
 * 意图：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 *
 * 主要解决：主要解决接口选择的问题。
 *
 * 何时使用：我们明确地计划不同条件下创建不同实例时。
 *
 * 如何解决：让其子类实现工厂接口，返回的也是一个抽象的产品。
 */
public class TestDemo {
    public static void main(String[] args) {
        //创建工厂类
        ShapeFactory shapeFactory = new ShapeFactory();
        //利用工厂生产shape
        Shape shape = shapeFactory.getShape("Circle");
        Shape shape1 = shapeFactory.getShape("Rectangle");
        Shape shape2 = shapeFactory.getShape("Square");
        //分别调用draw()方法
        shape.draw();
        shape1.draw();
        shape2.draw();
    }
}
