package labs.lab5;

public class Dragon extends Enemy implements Stompable, GameElement {
	private boolean fireBreathing;
	
	public Dragon(boolean fireBreathing) {
		super();
		this.fireBreathing = fireBreathing;
	}
	
	public boolean isFireBreathing() {
		return fireBreathing;
	}
	
	public int stompOn() {
		fireBreathing = !fireBreathing;
		setHealth(getHealth() + 50);
		return -50;
	}
	
	public void tick() {
		setHealth(getHealth() - 20);
	}
}
