package oop.gameplay.mario;

import javax.swing.JFrame;
public class Main {
	public static Scene scene;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Mario");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 360);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		scene = new Scene();	
		frame.setContentPane(scene); 
		frame.setVisible(true);		
	}
}