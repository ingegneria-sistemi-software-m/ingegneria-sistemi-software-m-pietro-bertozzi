package conway;

import java.util.Objects;

public class Cell {
	private boolean alive;
	
	public Cell() {
		this(false);
	}
	public Cell(boolean alive) {
		this.alive = alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public void switchAlive() {
		this.alive = !this.alive;
	}
	
	public boolean isAlive() {
		return alive;
	}
	
	public void showCell(IOutDev outdev) {
		outdev.write(this.isAlive() ? "1" : "0");
	}
	
    @Override
	public int hashCode() {
		return Objects.hash(alive);
	}
    
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Cell other = (Cell) obj;
		return alive == other.alive;
	}
}
