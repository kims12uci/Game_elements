package labs.lab5;

public abstract class Enemy {
	private int health;
	
	public Enemy() {
		health = 100;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		if (health >= 100) {
			this.health = 100;
		} else if (health <= 0) {
			this.health = 0;
		} else {
			this.health = health;
		}
	}
}
