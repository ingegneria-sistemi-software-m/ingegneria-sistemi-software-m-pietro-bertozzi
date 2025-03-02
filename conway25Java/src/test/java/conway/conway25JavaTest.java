package conway;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import conway.devices.ConwayInputMock;

//By default, JUnit comes with a bundled copy of hamcrest-core

public class conway25JavaTest {
private static Life life;
private static LifeController cc;
private static ConwayInputMock cim;

	@BeforeClass
	public static void setup() {
		System.out.println("setup");
    	//configureTheSystem
        life = new Life( 3,3 );
        cc = new LifeController(life);   
        cim = new ConwayInputMock(cc, life);		
	}
	
	@After
	public void down() {
		System.out.println("down");
	}
	
	@Test
	public void orizzontalToVertical() {
		life.getGrid().switchCellState(0, 1);
		life.getGrid().switchCellState(1, 1);
		life.getGrid().switchCellState(2, 1);
		
		life.computeNextGen();
		
		//tutto da cambiare non mi piace per nulla coeme è fatto sto progetto
	}
	
	@Test
	public void verticalToOrizzontal() {
	}
}

//Con gradlew test, controllare - logs/apptest.log - build/reports/tests/test/index.html

