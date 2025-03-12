package conway.devices;

import conway.Life;
import conway.LifeController;

public class ConwayInputMock {
	protected Life life;
	protected LifeController control;
	
	public ConwayInputMock(Life life) {
		this.life = life;
	}

    public void simulateUserControl(){
		//USER CONTROL HERE ...
        life.getGrid().switchCellState( 0, 1 );
		life.getGrid().switchCellState( 1, 1 );
		life.getGrid().switchCellState( 2, 1 );
    }
}
