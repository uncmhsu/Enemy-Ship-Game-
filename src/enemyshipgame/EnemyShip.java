package enemyshipgame;

public abstract class EnemyShip {
	private String name;
	private double amtDamage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDamage() {
		return amtDamage;
	}

	public void setDamage(double damage) {
		amtDamage = damage;
	}

	public void followHeroShip() {
		System.out.println(getName() + " is following the hero");
	}

	public void displayEnemyShip() {
		System.out.println(getName() + " is on the screen");
	}

	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does " + getDamage());
	}

	public static EnemyShip makeEnemyShip(String newShipType) {
		EnemyShip newShip = null;
		if (newShipType.equals("U")) {
			return new UFOEnemyShip();
		} else {
			if (newShipType.equals("R")) {
				return new RocketEnemyShip();
			} else {
				if (newShipType.equals("B")) {
					return new BigUFOEnemyShip();
				} else
					return null;
			}
		}
	}
}

class BigUFOEnemyShip extends EnemyShip {

	public BigUFOEnemyShip() {
		setName("Big UFO Enemy Ship");
		setDamage(40.0);
	}

}

class RocketEnemyShip extends EnemyShip {
	public RocketEnemyShip() {
		setName("Rocket Enemy Ship");
		setDamage(10.0);
	}
}

class UFOEnemyShip extends EnemyShip {

	public UFOEnemyShip() {
		setName("UFO Enemy Ship");
		setDamage(20.0);
	}
}
