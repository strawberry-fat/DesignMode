package abstractFactory.computer;

import abstractFactory.computetinterface.NotebookComputer;

public class HpNoteComputer implements NotebookComputer {
    @Override
    public void start() {
        System.out.println("HpNoteBookComputer,Start.");
    }
}
