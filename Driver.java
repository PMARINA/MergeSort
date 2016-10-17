import java.util.ArrayList;

/**
 * @author PMARINA
 * @version Jun 12, 2016
 */

public class Driver {
	/**
	 * @param a
	 *            the player with which to check
	 * @param s
	 *            the square with which to check
	 * @return whether or not the player and the square are colliding
	 */
	private static boolean checkCollision(Player a, Square s) {
		double circleDistancex = Math.abs(a.getX() - s.getX());
		double circleDistancey = Math.abs(a.getY() - s.getY());

		if (circleDistancex > (Square.getHeight() / 2 + Player.getRadius())) {
			return false;
		}

		double cornerDistance_sq = Math.pow((circleDistancex - Square.getHeight() / 2), 2)
				+ Math.pow((circleDistancey - Square.getHeight() / 2), 2);

		return (cornerDistance_sq <= (Math.pow(Player.getRadius(), 2)));
	}

	/**
	 * @param daball
	 *            the circle to check with
	 * @param a
	 *            the player to check with
	 * @return whether or not the player and the circle are colliding
	 */
	private static boolean circleCollide(Circle daball, Player a) {
		return Math.pow(daball.getX() - a.getX(), 2) + Math.pow(daball.getY() - a.getY(), 2) <= Math
				.pow(Circle.getRadius() + Circle.getRadius(), 2);
	}

	public static void main(String[] args) {
		StdDraw.setScale(-10, 10);
		Player a = new Player(0, 0);
		ArrayList<Circle> ballz = new ArrayList<Circle>();
		boolean gameNotWon = true;
		int curScore = 0;
		Square s = new Square(0, 0);// (Math.random()*21-10,Math.random()*21-10);
		boolean hax = false;
		while (gameNotWon) {
			if (StdDraw.isKeyPressed(' ')) {
				hax = !hax;
			}
			a.updatePos();
			for (int i = 0; i < ballz.size(); i++) {
				Circle daball = ballz.get(i);
				if (!hax) {
					daball.setX(daball.getX() + daball.getVx());
					daball.setY(daball.getY() + daball.getVy());
				}
				daball.courseCorrect();
				daball.drawToScreen();
			}
			a.drawToScreen();
			s.drawToScreen();

			for (int i = 0; i < ballz.size(); i++) {
				Circle daball = ballz.get(i);
				if (circleCollide(daball, a) && !hax) {
					gameNotWon = false;
				}
			}

			if (checkCollision(a, s)) {
				s = new Square(Math.random() * 21 - 10, Math.random() * 21 - 10);
				curScore++;
				double c = Math.random() * 21 - 10;
				double b = Math.random() * 21 - 10;
				while (circleCollide(new Circle(c, b, 0, 0), a)) {
					c = Math.random() * 21 - 10;
					b = Math.random() * 21 - 10;
				}
				ballz.add(new Circle(c, b, Math.random() / 10 - 0.05, Math.random() / 10 - 0.05));
			}
			StdDraw.textLeft(-10, 9.5, "Hax: " + hax);
			StdDraw.textLeft(-10, 8.5, "Score: " + curScore);
			StdDraw.show(5);
			StdDraw.clear();
		}
		StdDraw.text(0, 0, "You lost with a score of " + curScore);
		StdDraw.show();
	}
}
