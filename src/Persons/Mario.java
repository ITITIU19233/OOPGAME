package Persons;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Mario extends character {
	
	private Image imageMario;
	private ImageIcon iconMario;
	
	public Mario(int x, int y) {
		super(x, y, 28, 50);
		this.iconMario = new ImageIcon("src/images/marioMarcheDroite.png");
		this.imageMario= this.iconMario.getImage();
		
		
		
	}
	public Image getImgageMario() {
		return imageMario;
	}
	

}
