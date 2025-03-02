package conway;

import java.util.Arrays;

public class Grid {
	private Cell[][] cells;
	
	public Grid() {
        this(3, 3);
    }
    public Grid(int rows, int cols) {
        this.cells= new Cell[rows][cols];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getCols(); j++) {
                this.cells[i][j] = new Cell(false);
            }
        }
    }
    
    public void setCellState(int i, int j, boolean state) {
        this.cells[i][j].setAlive(state);
    }
    public void switchCellState(int i, int j){
    	this.cells[i][j].switchAlive();
    }
    public void resetGrid() {
    	for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getCols(); j++) {
                this.cells[i][j].setAlive(false);
            }
        }
    }
    
    public Cell[][] getCells () {
    	return this.cells;
    }
    
    public boolean getCellState(int i, int j) throws outOfBoundsException {
    	if (this.isOutOfBounds(i, j)) throw new outOfBoundsException(i, j, 0, 0, this.getRows(), this.getCols());
        return this.cells[i][j].isAlive();
    }
    public int getRows() {
    	return this.cells.length;
    }
    public int getCols() {
    	return this.cells[0].length;
    }
    public boolean isOutOfBounds(int i, int j) {
    	return i < 0 || i >= this.getRows() || j < 0 || j >= this.getCols();
    }
    
    public void showGrid(IOutDev outdev) {
    	for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getCols(); j++) {
                this.cells[i][j].showCell(outdev);
            }
            outdev.write("\n");
        }
	}
    
	@Override
	public int hashCode() {
		return 31 * Arrays.deepHashCode(cells);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Grid other = (Grid) obj;
		return Arrays.deepEquals(cells, other.cells);
	}
}
