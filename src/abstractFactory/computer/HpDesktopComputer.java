package abstractFactory.computer;

import abstractFactory.computetinterface.DesktComputer;

public class HpDesktopComputer implements DesktComputer {
    @Override
    public void start() {
        System.out.println("HpDesktopComputer,Start.");
    }
}
