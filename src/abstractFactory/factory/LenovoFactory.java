package abstractFactory.factory;

import abstractFactory.computer.LenovoDesktop;
import abstractFactory.computer.LenovoNote;
import abstractFactory.computetinterface.DesktComputer;
import abstractFactory.computetinterface.NotebookComputer;
import abstractFactory.factoryinterface.ComputerAbstrFactoryInterface;

public class LenovoFactory implements ComputerAbstrFactoryInterface {
    @Override
    public NotebookComputer creatNotebookComputer() {
        return new LenovoNote();
    }

    @Override
    public DesktComputer creatDestopComputer() {
        return new LenovoDesktop();
    }
}
