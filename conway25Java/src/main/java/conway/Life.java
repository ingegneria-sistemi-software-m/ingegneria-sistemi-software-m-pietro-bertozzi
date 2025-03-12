package conway;

import java.util.Objects;

public class Life {
    private Grid grid;
    private Grid nextGrid;
 
    public Life() {
    	this(3, 3);
    }
    public Life(int rows, int cols) {
        this.grid = new Grid(rows, cols);
        this.nextGrid = new Grid(rows, cols);
    }

    protected int countNeighborsAlive(int row, int col) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
        	for(int j =- 1; j <= 1; j++) {
        		int newRow = row + i;
        		int newCol = col + j;
        		try {
        			boolean isCellAlive = this.grid.getCellState(newRow, newCol);
        			boolean isInBounds = !this.grid.isOutOfBounds(newRow, newCol);
        			boolean isOther = (i | j) != 0;
        			if (isCellAlive && isInBounds && isOther) count++;
				} catch (outOfBoundsException e) {
					e.printStackTrace();
				}
            }
        }
        return count;
    }
    
    protected void applyRules(int row, int col, int numNeighbors) {
    	boolean state = false;
    	boolean nextState = false;
    	try {
			state = this.grid.getCellState(row, col);
		} catch (outOfBoundsException e) {
			e.printStackTrace();
		}
        if (state) {
            if (numNeighbors < 2) nextState = false;
            else if (numNeighbors > 3) nextState = false;
            else nextState = true;
        }
        else if (numNeighbors == 3) nextState = true;
        this.nextGrid.setCellState(row, col, nextState);
    }

    protected void commitNextGrid() {
        for (int i = 0; i < this.grid.getRows(); i++) {
            for (int j = 0; j < this.grid.getCols(); j++) {
				try {
					boolean state = this.nextGrid.getCellState(i, j);
					this.grid.setCellState(i, j, state);
				} catch (outOfBoundsException e) {
					e.printStackTrace();
				} 
            }
        }
        this.nextGrid.resetGrid();
    }
    
    protected void computeNextGen() {
        for (int i = 0; i < this.grid.getRows(); i++) {
            for (int j = 0; j < this.grid.getCols(); j++) {   	
                int n = countNeighborsAlive(i,j);
                applyRules(i, j, n);
            }
        }
        commitNextGrid();
    }

	public Grid getGrid() {
		return this.grid;
	}

	public Grid getNextGrid() {
		return this.nextGrid;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(grid, nextGrid);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Life other = (Life) obj;
		return Objects.equals(grid, other.grid) && Objects.equals(nextGrid, other.nextGrid);
	}
}
