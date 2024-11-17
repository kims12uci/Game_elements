package labs.lab5;

public class Monster extends Enemy implements Stompable, GameElement {
	private String color;
	
	public Monster() {
		super();
		color = "green";
	}
	
	public String getColor() {
		return color;
	}
	
	public int stompOn() {
		color = "red";
		setHealth(getHealth() - 100);
		return 100;
	}
	
	public void tick() {
		setHealth(getHealth() - 10);
		if (color.equals("red") || color.equals("blue")) {
			color = "green";
		} else if (color.equals("green")) {
			color = "yellow";
		} else if (color.equals("yellow")) {
			color = "blue";
		}
	}
}
