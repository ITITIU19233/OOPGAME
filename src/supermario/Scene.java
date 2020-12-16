package supermario;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Object.Block;
import Object.Pipe;
import Persons.Mario;
@SuppressWarnings("serial")
public class Scene extends JPanel {
	private ImageIcon iconFond;
	private Image imgFond1;
	private Image imgFond2;
//	private ImageIcon iconMario;
//	private Image imgMario;
	private ImageIcon castle;
	private Image imgCastle;
	private ImageIcon depart;
	private Image imgDepart;
	private int xFond1;
	private int xFond2;
	private int fixedCastle;
	private int moveHorizontal;
	public Mario mario;
	public Pipe redPipe;
	public  Block  block;
	
	
	public Scene() {
		this.xFond1 = -50;
		this.xFond2 = 750;
		this.moveHorizontal = 0;
		this.fixedCastle =-1;
			
		iconFond =new ImageIcon(getClass().getResource("/images/fondEcran.png"));
		this.imgFond1= this.iconFond.getImage(); //return this 
		this.imgFond2= this.iconFond.getImage();
		
		this.castle = new ImageIcon(getClass().getResource("/images/chateau1.png")); 
		this.imgCastle = this.castle.getImage();  
		this.depart = new ImageIcon(getClass().getResource("/images/depart.png"));
		this.imgDepart = this.depart.getImage();
		
		mario = new Mario(300,245);
		redPipe = new Pipe(600, 230);
		block = new Block(400, 180);
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Keyboard());
		
		Thread movement = new Thread(new MoveScreen());
		movement.start();
	}	
	
		public int getMoveHorizontal() {
		return moveHorizontal;
	}
	public void setMoveHorizontal(int moveHorizontal) {
		this.moveHorizontal = moveHorizontal;
	}
	
		public int getFixedCastle() {
		return fixedCastle;
	}

	public void setFixedCastle(int fixedCastle) {
		this.fixedCastle = fixedCastle;
	}
	
		public int getxFond1() {
		return xFond1;
	}

	public void setxFond1(int xFond1) {
		this.xFond1 = xFond1;
	}


	public int getxFond2() {
		return xFond2;
	}

	public void setxFond2(int xFond2) {
		this.xFond2 = xFond2;
	}
		public void Displacement() {
			
			if(this.fixedCastle >= 0) {
				this.fixedCastle = this.fixedCastle + this.moveHorizontal;
				this.xFond1 = this.xFond1 - this.moveHorizontal;
				this.xFond2 = this.xFond2  - this.moveHorizontal;
				}
						
			if(this.xFond1 == -800) {
				this.xFond1 = 800;
			}
			else if(this.xFond2 == -800) {
				this.xFond2 =800;
			}
			else if(this.xFond1 == 800) {
				this.xFond1 =-800;
			}
			else if(this.xFond2 == 800) {
				this.xFond2 = -800;
			}
		}
		public void paintComponent(Graphics g) { //draw to jpanel 
			super.paintComponent(g);//super.paintComponent() gọi lại phương thức paintComponent() của lớp cha là lớp JPanel, 
			//mà trong phương thức này ở lớp cha chỉ đơn giản là vẽ một cửa sổ trống không, 
			//tức là khi gọi phương thức này chúng ta làm công việc là xóa trắng toàn bộ cửa sổ
			Graphics g2 =(Graphics2D)g ;//create
			this.Displacement();
			g2.drawImage(this.imgFond1, this.xFond1, 0, null);
			g2.drawImage(this.imgFond2, this.xFond2, 0, null);//this picture override another pic
			g2.drawImage(this.mario.foot("mario", 25), 300, 245, null); //to middle number set Mario picture position
			g2.drawImage(this.imgCastle, 10 - this.fixedCastle , 95, null); 
	 		g2.drawImage(this.imgDepart, 220 - this.fixedCastle, 234, null); 
			//move the screen with him
	 		g2.drawImage(this.redPipe.getImagePipe(), this.redPipe.getX()- this.fixedCastle, this.redPipe.getY(), null);
	 		g2.drawImage(this.block.getImageBlock(), this.block.getX()- this.fixedCastle , this.block.getY(), null);

	}
	
}

//@SuppressWarnings("serial")
//public class Scene extends JPanel {
	
//	private ImageIcon icoFond;
//	private Image imgFond1;
//	private Image imgFond2;
//	
//	private ImageIcon icoChateau1;  
//	private Image imgChateau1;  
//	private ImageIcon icoDepart;  
//	private Image imgDepart;
//	
//	private int xFond1;
//	private int xFond2;
//	private int dx;
//	private int xPos; 
//	
//	public Mario mario;
//	
//	
	
//	public Scene(){
//		
//		super();
//		
//		this.xFond1 = -50;
//		this.xFond2 = 750;
//		this.dx = 0;
//		this.xPos = -1;
//		
//		icoFond = new ImageIcon(getClass().getResource("/images/fondEcran.png"));
//		this.imgFond1 = this.icoFond.getImage();
//		this.imgFond2 = this.icoFond.getImage();
//		
//		this.icoChateau1 = new ImageIcon(getClass().getResource("/images/chateau1.png")); 
//		this.imgChateau1 = this.icoChateau1.getImage();  
//		this.icoDepart = new ImageIcon(getClass().getResource("/images/depart.png"));
//		this.imgDepart = this.icoDepart.getImage();
//		
//		mario = new Mario(300, 245);
//		
//		this.setFocusable(true);
//		this.requestFocusInWindow();
//		this.addKeyListener(new Clavier());
//		
//		Thread chronoEcran = new Thread(new Chrono());
//		chronoEcran.start();
//		}
//
//	public int getDx() {return dx;}
//	
//	public int getxPos() {return xPos;}

//	public void setDx(int dx) {this.dx = dx;}
//	
//	public void setxPos(int xPos) {this.xPos = xPos;}
//		
//	public void setxFond1(int xFond1) {this.xFond1 = xFond1;}
//
//	public void setxFond2(int xFond2) {this.xFond2 = xFond2;}
//
//	public void deplacementFond(){ 
//		
//		if(this.xPos >= 0){
//			this.xPos = this.xPos + this.dx;		
//		    this.xFond1 = this.xFond1 - this.dx;
//		    this.xFond2 = this.xFond2 - this.dx;
//		}
//		// Permanence du fond d'�cran
//		if(this.xFond1 == -800){this.xFond1 = 800;}
//		else if(this.xFond2 == -800){this.xFond2 = 800;}
//		else if(this.xFond1 == 800){this.xFond1 = -800;}
//		else if(this.xFond2 == 800){this.xFond2 = -800;}
//	}
//	public void paintComponent(Graphics g) { 
//		
//		super.paintComponent(g);
//		Graphics g2 = (Graphics2D)g;
//		this.deplacementFond();
//		g2.drawImage(this.imgFond1, this.xFond1, 0, null); // Fond1
//		g2.drawImage(this.imgFond2, this.xFond2, 0, null); // Fond 2
// 		g2.drawImage(this.mario.getImgMario(), 300, 245, null); //*** code provisoire
// 		g2.drawImage(this.imgChateau1, 10 - this.xPos, 95, null); // Ch�teau du d�but
// 		g2.drawImage(this.imgDepart, 220 - this.xPos, 234, null); // Panneau d�part
//	}
//}
