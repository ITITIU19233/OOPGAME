package supermario;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener{

	public void keyPressed (KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			if(Main.scene.getFixedCastle()==-1) {
				Main.scene.setFixedCastle(0);
				Main.scene.setxFond1(-50);
				Main.scene.setxFond2(750 );
				
			}
			Main.scene.mario.setFoot(true);
			Main.scene.mario.setMoveOn(true);
			
			
			
			Main.scene.setMoveHorizontal(1);		
																															
		}
		else if(e.getKeyCode()== KeyEvent.VK_LEFT) {
			Main.scene.mario.setFoot(true);
			Main.scene.mario.setMoveOn(false);
			Main.scene.setMoveHorizontal(-1);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		Main.scene.mario.setFoot(false);
		Main.scene.setMoveHorizontal(0);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
