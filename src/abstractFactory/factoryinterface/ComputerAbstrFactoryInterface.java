package abstractFactory.factoryinterface;

import abstractFactory.computetinterface.DesktComputer;
import abstractFactory.computetinterface.NotebookComputer;

public interface ComputerAbstrFactoryInterface {
    public abstract DesktComputer creatDestopComputer();
    public abstract NotebookComputer creatNotebookComputer();
}
