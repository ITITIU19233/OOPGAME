package supermario;

public class MoveScreen  implements Runnable{
	
	
	private final int PAUSE = 3;

	@Override
	public void run() {
		while(true) {
			
			Main.scene.repaint();
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	
	}
}
	
	


