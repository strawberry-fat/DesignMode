package abstractFactory.factory;

import abstractFactory.computer.HpDesktopComputer;
import abstractFactory.computer.HpNoteComputer;
import abstractFactory.computetinterface.DesktComputer;
import abstractFactory.computetinterface.NotebookComputer;
import abstractFactory.factoryinterface.ComputerAbstrFactoryInterface;

public class HpFactory implements ComputerAbstrFactoryInterface {
    @Override
    public DesktComputer creatDestopComputer() {
        return new HpDesktopComputer();
    }

    @Override
    public NotebookComputer creatNotebookComputer() {
        return new HpNoteComputer();
    }
}
