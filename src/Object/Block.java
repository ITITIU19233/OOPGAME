 package Object;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Block extends Obstacle {
	
	private Image imageBlock;
	private ImageIcon iconBlock;
	
	public Block(int x, int y) {
		super(x, y, 43, 65);
		this.iconBlock = new ImageIcon(getClass().getResource("/images/bloc.png"));
		this.imageBlock = this.iconBlock.getImage();
		
		
	}

	public Image getImageBlock() {
		return imageBlock;
	}

	

	

}
