package enemyshipgame;

import java.util.Scanner;

public class EnemyShipTesting {
	public static void main(String[] args) {
		// EnemyShipFactory shipFactory = new EnemyShipFactory();

		EnemyShip theEnemy = null;

		Scanner UserInput = new Scanner(System.in);

		System.out.println("What type of ship? (U / R / B)");

		if (UserInput.hasNextLine()) {
			String typeOfShip = UserInput.nextLine();

			theEnemy = theEnemy.makeEnemyShip(typeOfShip);
		}
		if (theEnemy != null) {
			doStuffEnemy(theEnemy);
		} else
			System.out.println("Enter a U, R, or B next time");

		doStuffEnemy(theEnemy);
	}

	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
