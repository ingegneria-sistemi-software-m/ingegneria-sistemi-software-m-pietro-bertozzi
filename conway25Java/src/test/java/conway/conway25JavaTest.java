package conway;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import conway.devices.ConwayOutput;

public class conway25JavaTest {
	private static Life life;
	private static ConwayOutput co;
	
	@BeforeClass
	public static void setup() {
		System.out.println("setup");
		life = new Life();
		co = new ConwayOutput();
		new LifeController(life, co);
	}
	
	@After
	public void down() {
		System.out.println("down");
	}
	
	@Test
	public void verticalToOrizzontal() {
		Grid expectedGrid = new Grid(3, 3);
		for (int j = 0; j < expectedGrid.getCols(); j++) {
		    expectedGrid.switchCellState(1, j);
		}
		life.getGrid().resetGrid();
		life.getGrid().switchCellState(0, 1);
		life.getGrid().switchCellState(1, 1);
		life.getGrid().switchCellState(2, 1);
		life.computeNextGen();
		for (int i = 0; i < life.getGrid().getRows(); i++) {
		    for (int j = 0; j < life.getGrid().getCols(); j++) {
		         assertEquals(expectedGrid.getCells()[i][j], life.getGrid().getCells()[i][j]);
		    }
		}
	}

	@Test
	public void orizzontalToVertical() {
		Grid expectedGrid = new Grid(3, 3);
		for (int i = 0; i < expectedGrid.getRows(); i++) {
		    expectedGrid.switchCellState(i, 1);
		}
		life.getGrid().resetGrid();
		life.getGrid().switchCellState(1, 0);
		life.getGrid().switchCellState(1, 1);
		life.getGrid().switchCellState(1, 2);
		life.computeNextGen();
		for (int i = 0; i < life.getGrid().getRows(); i++) {
		    for (int j = 0; j < life.getGrid().getCols(); j++) {
		         assertEquals(expectedGrid.getCells()[i][j], life.getGrid().getCells()[i][j]);
		    }
		}
	}
}

