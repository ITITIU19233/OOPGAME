package Persons;

import java.awt.Image;

import javax.swing.ImageIcon;


import supermario.Main;

public class character {
	private int width, height;
	private int x, y;
	private boolean foot;
	private boolean moveOn;
	private int count;
	public character( int x, int y, int width, int height) {
		
		this.x = x;
		this.y = y;
		this.width=width;
		this.height=height;
		this.count =0;
		this.foot=false;
		this.moveOn = true;
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
	public boolean isFoot() {
		return foot;
	}
	public void setFoot(boolean foot) {
		this.foot = foot;
	}
	public boolean isMoveOn() {
		return moveOn;
	}
	public void setMoveOn(boolean moveOn) {
		this.moveOn = moveOn;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public Image foot(String str, int timer) {
		
		String s;
		ImageIcon icon;
		Image image;
		if(this.foot== false || Main.scene.getMoveHorizontal() <= 0) {
			if(this.moveOn == true) {
				s= "/images/" + str + "ArretDroite.png";
			}
			else {
				s = "/images/" + str + "ArretGauche.png";
			}
		}
			else {
				this.count++;
				if(this.count / timer == 0) {
					if(this.moveOn == true ) {
						s= "/images/" + str + "ArretDroite.png";
					}
					else {
						s= "/images/" + str + "ArretGauche.png";
						
					}
				}
					else {
						if(this.moveOn ==true ) {
							s= "/images/" + str + "MarcheDroite.png";
						}
						else {
							s = "/images/" + str + "MarcheGauche.png";
						}
						
					}
					if(this.count == 2 *timer) {
						this.count =0;
					}
				}
				icon = new ImageIcon(getClass().getResource(s));
				image = icon.getImage();
				return image;
			}
			
		
	}
	
	 

