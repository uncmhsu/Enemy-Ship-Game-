package enemyshipgame;

import java.util.Scanner;

//this is the game without using the factory pattern
//clearly shows the need to use the factory pattern for this game
public class EnemyShipTesting {
	public static void main(String[] args) {
		EnemyShip theEnemy = null;
		Scanner userInput = new Scanner(System.in);
		String enemyShipOption = "";
		System.out.println("What type of ship? (U / R)");
		if (userInput.hasNextLine()) {
			enemyShipOption = userInput.nextLine();
		}
		if (enemyShipOption.equals("U")) {
			theEnemy = new UFOEnemyShip();
		} else {
			if (enemyShipOption.equals("R")) {
				theEnemy = new RocketEnemyShip();
			}
		}

		doStuffEnemy(theEnemy);
	}

	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
