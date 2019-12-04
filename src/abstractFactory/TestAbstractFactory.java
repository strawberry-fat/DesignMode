package abstractFactory;

import abstractFactory.factory.HpFactory;
import abstractFactory.factory.LenovoFactory;
import abstractFactory.factoryinterface.ComputerAbstrFactoryInterface;

public class TestAbstractFactory {
    public static void main(String[] args) {
        //创建联想工厂,分别生产台式和笔记本电脑
        ComputerAbstrFactoryInterface lenovoFactory = new LenovoFactory();
        lenovoFactory.creatDestopComputer().start();
        lenovoFactory.creatNotebookComputer().start();
        //创建HP工厂，分别生产台式和笔记本电脑
        ComputerAbstrFactoryInterface hpFactory = new HpFactory();
        hpFactory.creatNotebookComputer().start();
        hpFactory.creatDestopComputer().start();
    }
}
