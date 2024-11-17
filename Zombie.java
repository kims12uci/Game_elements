package labs.lab5;

public class Zombie extends Enemy implements Stompable, GameElement {
	private double height;
	
	public Zombie(double height) {
		super();
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public int stompOn() {
		height = height / 2.0;
		setHealth(getHealth() - 25);
		return 0;
	}
	
	public void tick() {
		setHealth(getHealth() + 5);
		height *= 1.1;
	}
}
