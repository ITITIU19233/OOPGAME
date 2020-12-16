package Object;

public class Obstacle {
	
	private int width, height;
	private int x,y;
	
	public Obstacle (int x, int y,int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}
