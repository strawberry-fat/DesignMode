package abstractFactory.computer;

import abstractFactory.computetinterface.DesktComputer;

public class LenovoDesktop  implements DesktComputer {
    @Override
    public void start() {
        System.out.println("LenovoDesktop,Start.");
    }
}
