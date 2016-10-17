/**
 * @author PMARINA
 * @version Jun 12, 2016
 */

public class Player {
	private static final double RADIUS = 1;

	private double x;

	private double y;

	/**
	 * @param x
	 *            the x coordinate of the player
	 * @param y
	 *            the y coordinate of the player
	 */
	public Player(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	/**
	 * Draws the player to the screen
	 */
	public void drawToScreen() {
		StdDraw.setPenColor();
		StdDraw.filledCircle(getX(), getY(), getRadius());
	}

	/**
	 * @return the radius of the player
	 */
	public static double getRadius() {
		return RADIUS;
	}

	/**
	 * @return the x coordinate of the player
	 */
	public double getX() {
		return x;
	}

	/**
	 * @return the y coordinate of the player
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param x
	 *            the new x coordinate of the player
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @param y
	 *            the new y coordinate of the player
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * updates the position of the player
	 */
	public void updatePos() {
		this.x = StdDraw.mouseX();
		this.y = StdDraw.mouseY();
	}

}
