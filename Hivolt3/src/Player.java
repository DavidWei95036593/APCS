import java.awt.event.KeyEvent;

public class Player extends Character{
//Returns coordinates of the player so that player is able to move from current position (Erick and David)
	public Player(int xPoints, int yPoints) {
		super(xPoints, yPoints);
		}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}

