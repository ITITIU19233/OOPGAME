package oop.gameplay.objects;

import javax.swing.ImageIcon;

public class Block extends Object{
	public Block(int x, int y) {
		super(x, y, 30, 30);		
		super.icoObjet = new ImageIcon(getClass().getResource("/images/bloc.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
}
