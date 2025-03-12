package conway;

import conway.devices.ConwayInputMock;
import conway.devices.ConwayOutput;

public class MainConway  {

    public static void main(String[] args) {
        Life life = new Life();
        ConwayInputMock cim = new ConwayInputMock(life);
        cim.simulateUserControl();
		ConwayOutput co = new ConwayOutput();
		LifeController lc = new LifeController(life, co);
        lc.play(10);
    }

}
