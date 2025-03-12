package conway;

public class outOfBoundsException extends Exception {
	private static final long serialVersionUID = -2916903284808541379L;

	public outOfBoundsException(int i, int j, int imin, int jmin, int imax, int jmax) {
		super((i < jmin ? "i is too small" : "")
			+ (j < jmin ? "j is too small" : "")
			+ (i > imin ? "i is too big" : "")
			+ (j > jmin ? "j is too big" : ""));
    }
}
