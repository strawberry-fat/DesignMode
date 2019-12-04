package abstractFactory.computer;

import abstractFactory.computetinterface.NotebookComputer;

public class LenovoNote implements NotebookComputer {
    @Override
    public void start() {
        System.out.println("LenovoNote,Start.");
    }
}
