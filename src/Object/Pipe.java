package Object;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Pipe extends Obstacle {

	private Image imagePipe;
	private ImageIcon iconPipe;
	
	public Pipe(int x, int y) {
		super(x, y, 43, 65);
		this.iconPipe = new ImageIcon(getClass().getResource("/images/tuyauRouge.png"));
		this.imagePipe = this.iconPipe.getImage();
		
		
	}

	public Image getImagePipe() {
		return imagePipe;
	}

	
}
