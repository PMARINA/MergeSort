/**
 * @author PMARINA
 * @version Jun 12, 2016
 */

public class Square {
	private static final int HEIGHT = 2;
	private double x;
	private double y;

	/**
	 * @param x
	 *            the x coordinate of the square
	 * @param y
	 *            the y coordinate of the square
	 */
	Square(double x, double y) {
		this.setX(x);
		this.setY(y);
	}

	/**
	 * Draw the square to the screen
	 */
	public void drawToScreen() {
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledSquare(x, y, HEIGHT / 2);

	}

	/**
	 * @return the height of the square
	 */
	public static int getHeight() {
		return HEIGHT;
	}

	/**
	 * @return the x coordinate
	 */
	public double getX() {
		return x;
	}

	/**
	 * @return the y coordinate
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param x
	 *            the new x coordinate of the square
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @param y
	 *            the new y coordinate of the square
	 */
	public void setY(double y) {
		this.y = y;
	}
}
