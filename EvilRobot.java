package labs.lab5;

public class EvilRobot extends Enemy implements Stompable, GameElement {
	private double strength;
	
	public EvilRobot(double strength) {
		super();
		this.strength = strength;
	}
	
	public double getStrength() {
		return strength;
	}
	
	public int stompOn() {
		strength *= 0.9;
		return 0;
	}
	
	public void tick() {
		strength *= 1.1;
	}
}
