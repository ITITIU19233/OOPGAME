package supermario;

import java.awt.Component;
import java.awt.SecondaryLoop;

import javax.swing.JFrame;

public class Main {
	
	
	public static Scene scene;

	public static void main(String[] args) {
		
		JFrame jframe = new JFrame("Super Mario");		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(700,360);
		jframe.setLocationRelativeTo(null); //middle
		jframe.setResizable(false );
		jframe.setAlwaysOnTop(true);
		// chuyển sang một ứng dụng khác nhưng nó luôn hiển thị ở trên cùng.
		
		scene = new Scene();
		jframe.setContentPane(scene);
		jframe.setVisible(true );
		

	}

}
//import javax.swing.JFrame;
//
////***** La classe Main g�re le flux principal et ex�cute la m�thode main() qui lance l'application *****//
//public class Main {
//	
//	//**** VARIABLES **//
//	public static Scene scene;
//	
//	
//	//**** METHODES **//
//	public static void main(String[] args) {
//		
//		// Cr�ation de la fenetre de l'application
//		JFrame fenetre = new JFrame("Jeu style Mario");
//		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		fenetre.setSize(700, 360);
//		fenetre.setLocationRelativeTo(null);
//		fenetre.setResizable(false);
//		fenetre.setAlwaysOnTop(true);
//		
//		// Instanciation de l'objet scene
//		scene = new Scene();
//				
//		fenetre.setContentPane(scene); // On associe la scene � la fen�tre de l'application
//		fenetre.setVisible(true);		
//	}
//}