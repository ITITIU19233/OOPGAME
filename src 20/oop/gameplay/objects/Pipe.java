package oop.gameplay.objects;

import javax.swing.ImageIcon;

public class Pipe extends Object{
	public Pipe(int x, int y) {
		super(x, y, 43, 65);		
		super.icoObjet = new ImageIcon(getClass().getResource("/images/tuyauRouge.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
}
