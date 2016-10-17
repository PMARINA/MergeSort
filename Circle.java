/**
 * @author PMARINA
 * @version Jun 12, 2016
 */

public class Circle {
	private static final double RADIUS = 0.5;
	private double x;
	private double y;
	private double vx;
	private double vy;

	/**
	 * @param x
	 *            x coordinate of the circle
	 * @param y
	 *            y coordinate of the circle
	 * @param vx
	 *            velocity in the x direction
	 * @param vy
	 *            velocity in the y direction
	 */
	Circle(double x, double y, double vx, double vy) {
		this.setX(x);
		this.setY(y);
		this.setVx(vx);
		this.setVy(vy);
	}

	/**
	 * Draw the circle object to the screen
	 */
	public void drawToScreen() {
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledCircle(x, y, RADIUS);

	}

	/**
	 * @return the radius of the circle
	 */
	public static double getRadius() {
		return RADIUS;
	}

	/**
	 * @return the velocity of the circle in the x direction
	 */
	public double getVx() {
		return vx;
	}

	/**
	 * @return the velocity of the circle in the y direction
	 */
	public double getVy() {
		return vy;
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
	 * @param vx
	 *            the new velocity in the x direction
	 */
	public void setVx(double vx) {
		this.vx = vx;
	}

	/**
	 * @param vy
	 *            the velocity in the y direction
	 */
	public void setVy(double vy) {
		this.vy = vy;
	}

	/**
	 * @param x
	 *            the new x coordinate
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @param y
	 *            the new y coordinate
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * Check whether or not the circle is hitting the wall, if so, fix it
	 */
	public void courseCorrect() {
		if (x >= 10 || x <= -10)
			vx = -vx;
		if (y >= 10 || y <= -10)
			vy = -vy;

	}
}
