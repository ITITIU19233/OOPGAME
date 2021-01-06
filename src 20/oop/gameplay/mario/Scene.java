package oop.gameplay.mario;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import oop.gameplay.character.Mario;
import oop.gameplay.character.Mushroom;
import oop.gameplay.character.Turtle;
import oop.gameplay.display.CountDown;
import oop.gameplay.display.Score;
import oop.gameplay.objects.Block;
import oop.gameplay.objects.Coin;
import oop.gameplay.objects.Object;
import oop.gameplay.objects.Pipe;
public class Scene extends JPanel {
	private ImageIcon icoFond;
	private Image imgFond1;
	private Image imgFond2;
	
	private ImageIcon icoChateau1;  
	private Image imgChateau1;  
	private ImageIcon icoDepart;  
	private Image imgDepart;
	
	private int xFond1;
	private int xFond2;
	private int dx;   
	private int xPos;
	private int ySol;
	private int hauteurPlafond; 
	
	public Mario mario;
	
	public Pipe pipe1;
	public Pipe pipe2;
	public Pipe pipe3;
	public Pipe pipe4;
	public Pipe pipe5;
	public Pipe pipe6;
	public Pipe pipe7;
	public Pipe pipe8;
	
	public Block block1;
	public Block block2;
	public Block block3;
	public Block block4;
	public Block block5;
	public Block block6;
	public Block block7;
	public Block block8;
	public Block block9;
	public Block block10;
	public Block block11;
	public Block block12;
	
	public Coin piece1;
	public Coin piece2;
	public Coin piece3;
	public Coin piece4;
	public Coin piece5;
	public Coin piece6;
	public Coin piece7;
	public Coin piece8;
	public Coin piece9;
	public Coin piece10;
	
	public Mushroom mushroom1;
	public Mushroom mushroom2;
	public Mushroom mushroom3;
	public Mushroom mushroom4;
	public Mushroom mushroom5;
	public Mushroom mushroom6;
	public Mushroom mushroom7;
	public Mushroom mushroom8;
	
	public Turtle turtle1;
	public Turtle turtle2;
	public Turtle turtle3;
	public Turtle turtle4;
	public Turtle turtle5;
	public Turtle turtle6;
	public Turtle turtle7;
	public Turtle turtle8;
	public Turtle turtle9;
	
	private ImageIcon icoDrapeau;
	private Image imgDrapeau;
	private ImageIcon icoChateauFin;
	private Image imgChateauFin;
	
	private ArrayList<Object> tabObjects; 
	private ArrayList<Coin> tabCoins; 
	private ArrayList<Turtle> tabTurtle; 
	private ArrayList<Mushroom> tabMushrooms; 
	
	private Score score;
	private Font police;
	private CountDown cntdown;
	public Scene(){
		super();
		this.xFond1 = -50;
		this.xFond2 = 750;
		this.dx = 0;
		this.xPos = -1;
		this.ySol = 293;
		this.hauteurPlafond = 0;
		
		icoFond = new ImageIcon(getClass().getResource("/images/fondEcran.png"));
		this.imgFond1 = this.icoFond.getImage();
		this.imgFond2 = this.icoFond.getImage();
		
		this.icoChateau1 = new ImageIcon(getClass().getResource("/images/chateau1.png")); 
		this.imgChateau1 = this.icoChateau1.getImage();  
		this.icoDepart = new ImageIcon(getClass().getResource("/images/depart.png"));
		this.imgDepart = this.icoDepart.getImage();
		
		mario = new Mario(300, 245);
		
		pipe1 = new Pipe(600, 230);
		pipe2 = new Pipe(1000, 230);
		pipe3 = new Pipe(1600, 230);
		pipe4 = new Pipe(1900, 230);
		pipe5 = new Pipe(2500, 230);
		pipe6 = new Pipe(3000, 230);
		pipe7 = new Pipe(3800, 230);
		pipe8 = new Pipe(4500, 230);
		
		block1 = new Block(400, 180);
		block2 = new Block(1200, 180);
		block3 = new Block(1270, 170);
		block4 = new Block(1340, 160);
		block5 = new Block(2000, 180);
		block6 = new Block(2600, 160);
		block7 = new Block(2650, 180);
		block8 = new Block(3500, 160);
		block9 = new Block(3550, 140);
		block10 = new Block(4000, 170);
		block11 = new Block(4200, 200);
		block12 = new Block(4300, 210);
		
		piece1 = new Coin(402, 145);
		piece2 = new Coin(1202, 140);
		piece3 = new Coin(1272, 95);
		piece4 = new Coin(1342, 40);
		piece5 = new Coin(1650, 145);
		piece6 = new Coin(2650, 145);
		piece7 = new Coin(3000, 135);
		piece8 = new Coin(3400, 125);
		piece9 = new Coin(4200, 145);
		piece10 = new Coin(4600, 40);
		
		mushroom1 = new Mushroom(800, 263);
		mushroom2 = new Mushroom(1100, 263);
		mushroom3 = new Mushroom(2100, 263);
		mushroom4 = new Mushroom(2400, 263);
		mushroom5 = new Mushroom(3200, 263);
		mushroom6 = new Mushroom(3500, 263);
		mushroom7 = new Mushroom(3700, 263);
		mushroom8 = new Mushroom(4500, 263);
		
		turtle1 = new Turtle(950, 243);
		turtle2 = new Turtle(1500, 243);
		turtle3 = new Turtle(1800, 243);
		turtle4 = new Turtle(2400, 243);
		turtle5 = new Turtle(3100, 243);
		turtle6 = new Turtle(3600, 243);
		turtle7 = new Turtle(3900, 243);
		turtle8 = new Turtle(4200, 243);
		turtle9 = new Turtle(4400, 243);
		
		this.icoChateauFin = new ImageIcon(getClass().getResource("/images/chateauFin.png")); 
		this.imgChateauFin = this.icoChateauFin.getImage(); 
		
		this.icoDrapeau = new ImageIcon(getClass().getResource("/images/drapeau.png")); 
		this.imgDrapeau = this.icoDrapeau.getImage(); 
		
		tabObjects = new ArrayList<Object>();			
		this.tabObjects.add(this.pipe1);
		this.tabObjects.add(this.pipe2);
		this.tabObjects.add(this.pipe3);
		this.tabObjects.add(this.pipe4);
		this.tabObjects.add(this.pipe5);
		this.tabObjects.add(this.pipe6);
		this.tabObjects.add(this.pipe7);
		this.tabObjects.add(this.pipe8);
		
		this.tabObjects.add(this.block1);
		this.tabObjects.add(this.block2);
		this.tabObjects.add(this.block3);
		this.tabObjects.add(this.block4);
		this.tabObjects.add(this.block5);
		this.tabObjects.add(this.block6);
		this.tabObjects.add(this.block7);
		this.tabObjects.add(this.block8);
		this.tabObjects.add(this.block9);
		this.tabObjects.add(this.block10);
		this.tabObjects.add(this.block11);
		this.tabObjects.add(this.block12);
			
		tabCoins = new ArrayList<Coin>();			
		this.tabCoins.add(this.piece1);
		this.tabCoins.add(this.piece2);
		this.tabCoins.add(this.piece3);
		this.tabCoins.add(this.piece4);
		this.tabCoins.add(this.piece5);
		this.tabCoins.add(this.piece6);
		this.tabCoins.add(this.piece7);
		this.tabCoins.add(this.piece8);
		this.tabCoins.add(this.piece9);
		this.tabCoins.add(this.piece10);
		
		tabMushrooms = new ArrayList<Mushroom>();	
		this.tabMushrooms.add(this.mushroom1);
		this.tabMushrooms.add(this.mushroom2);
		this.tabMushrooms.add(this.mushroom3);
		this.tabMushrooms.add(this.mushroom4);
		this.tabMushrooms.add(this.mushroom5);
		this.tabMushrooms.add(this.mushroom6);
		this.tabMushrooms.add(this.mushroom7);
		this.tabMushrooms.add(this.mushroom8);
		
		tabTurtle = new ArrayList<Turtle>();
		this.tabTurtle.add(this.turtle1);
		this.tabTurtle.add(this.turtle2);
		this.tabTurtle.add(this.turtle3);
		this.tabTurtle.add(this.turtle4);
		this.tabTurtle.add(this.turtle5);
		this.tabTurtle.add(this.turtle6);
		this.tabTurtle.add(this.turtle7);
		this.tabTurtle.add(this.turtle8);
		this.tabTurtle.add(this.turtle9);
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Keyboard());
		
		score = new Score();
		police = new Font("Arial", Font.PLAIN, 18);
		cntdown = new CountDown();
				
		Thread chronoEcran = new Thread(new MoveScreen());
		chronoEcran.start();
	}

	public int getDx() {return dx;}
	
	public int getxPos() {return xPos;}

	public int getySol() {return ySol;}

	public int getHautPlafond(){return hauteurPlafond;}

	public void setDx(int dx) {this.dx = dx;}
	
	public void setxPos(int xPos) {this.xPos = xPos;}

	public void setySol(int ySol) {this.ySol = ySol;}

	public void setHautPlafond(int hauteurPlafond) {this.hauteurPlafond = hauteurPlafond;}

	public void setxFond1(int xFond1) {this.xFond1 = xFond1;}

	public void setxFond2(int xFond2) {this.xFond2 = xFond2;}
	public void deplacementFond(){
		if(this.xPos >= 0 && this.xPos <= 4430){
			this.xPos = this.xPos + this.dx;		
		    this.xFond1 = this.xFond1 - this.dx;
		    this.xFond2 = this.xFond2 - this.dx;
		}

		if(this.xFond1 == -800){this.xFond1 = 800;}
		else if(this.xFond2 == -800){this.xFond2 = 800;}
		else if(this.xFond1 == 800){this.xFond1 = -800;}
		else if(this.xFond2 == 800){this.xFond2 = -800;}
	}


	public void paintComponent(Graphics g) { 
		
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;

		for(int i = 0; i < this.tabObjects.size(); i++){
		    if(this.mario.proche(this.tabObjects.get(i))){this.mario.contact(this.tabObjects.get(i));}//mario
 		    for(int j = 0; j < this.tabMushrooms.size(); j++){
 			  if(this.tabMushrooms.get(j).proche(this.tabObjects.get(i))){this.tabMushrooms.get(j).contact(this.tabObjects.get(i));} 
 		    }//mushroom
 		    for(int j = 0; j < this.tabTurtle.size(); j++){
 			  if(this.tabTurtle.get(j).proche(this.tabObjects.get(i))){this.tabTurtle.get(j).contact(this.tabObjects.get(i));} 
 		    }// turtles
		}
		
 	 	for(int i = 0; i < this.tabCoins.size(); i++){
 	 		if(this.mario.proche(this.tabCoins.get(i))){
 	 			if(this.mario.contactPiece(this.tabCoins.get(i))){
 	 				this.tabCoins.remove(i);
 	 				this.score.setNbrePieces(this.score.getNbrePieces() + 1);
 	 			}
 	 	    }
 	 	}
 	 	for(int i = 0; i < this.tabMushrooms.size(); i++){ 
 	 		for(int j = 0; j < this.tabMushrooms.size(); j++){
 	 			if(j != i){ 					 				
 	 	 			 if(this.tabMushrooms.get(j).proche(this.tabMushrooms.get(i))){this.tabMushrooms.get(j).contact(this.tabMushrooms.get(i));}
 	 			}
			}
 	 		for(int j = 0; j < this.tabTurtle.size(); j++){
 		 		if(this.tabTurtle.get(j).proche(this.tabMushrooms.get(i))){this.tabTurtle.get(j).contact(this.tabMushrooms.get(i));}
 		 	}
 	    }
 	 	for(int i = 0; i < this.tabTurtle.size(); i++){  
 	 	 	for(int j = 0; j < this.tabMushrooms.size(); j++){
 	 	 	 	if(this.tabMushrooms.get(j).proche(this.tabTurtle.get(i))){this.tabMushrooms.get(j).contact(this.tabTurtle.get(i));} 
 	 	 	}
 	 	 	for(int j = 1; j < this.tabTurtle.size(); j++){
 	 			if(j != i){
 	 		 		if(this.tabTurtle.get(j).proche(this.tabTurtle.get(i))){this.tabTurtle.get(j).contact(this.tabTurtle.get(i));} 
 	 			}
 	 		}
 	 	}    
 	 	for(int i = 0; i < this.tabMushrooms.size(); i++){ 
 	 		if(this.mario.proche(this.tabMushrooms.get(i)) && this.tabMushrooms.get(i).isAlive() == true){
 	 			this.mario.contact(this.tabMushrooms.get(i)); 				  				
 	 		}
 	 	}
 	 	for(int i = 0; i < this.tabTurtle.size(); i++){
 	 	 	if(this.mario.proche(this.tabTurtle.get(i)) && this.tabTurtle.get(i).isAlive() == true){
 	 	 		this.mario.contact(this.tabTurtle.get(i)); 	 		
 	 	 	}
 	 	}		
		this.deplacementFond();
		if(this.xPos >= 0 && this.xPos <= 4430){
		    for(int i = 0; i < this.tabObjects.size(); i++){this.tabObjects.get(i).deplacement();}
		    for(int i = 0; i < this.tabCoins.size(); i++){this.tabCoins.get(i).deplacement();}
		    for(int i = 0; i < this.tabMushrooms.size(); i++){this.tabMushrooms.get(i).deplacement();}
	 		for(int i = 0; i < this.tabTurtle.size(); i++){this.tabTurtle.get(i).deplacement();}
		}
		g2.drawImage(this.imgFond1, this.xFond1, 0, null);
		g2.drawImage(this.imgFond2, this.xFond2, 0, null);
 		g2.drawImage(this.imgChateau1, 10 - this.xPos, 95, null);
 		g2.drawImage(this.imgDepart, 220 - this.xPos, 234, null);
 	 	for(int i = 0; i < this.tabObjects.size(); i++){
 	 		g2.drawImage(this.tabObjects.get(i).getImgObjet(), this.tabObjects.get(i).getX(), this.tabObjects.get(i).getY(), null);
 	 	}	
 	 	for(int i = 0; i < this.tabCoins.size(); i++){
 	 		g2.drawImage(this.tabCoins.get(i).bouge(), this.tabCoins.get(i).getX(), this.tabCoins.get(i).getY(), null);
 	 	}
 	 	g2.drawImage(imgDrapeau, 4650 - this.xPos, 115, null);
 		g2.drawImage(imgChateauFin, 5000 - this.xPos, 145, null);
 		if(this.mario.isSaut()){g2.drawImage(this.mario.saute(), this.mario.getX(), this.mario.getY(), null);}
 		else{g2.drawImage(this.mario.marche("mario", 25), this.mario.getX(), this.mario.getY(), null);}
 	 	for(int i = 0; i < this.tabMushrooms.size(); i++){
 	 		if(this.tabMushrooms.get(i).isAlive() == true){
 	 		    g2.drawImage(this.tabMushrooms.get(i).marche("champ", 45), this.tabMushrooms.get(i).getX(), this.tabMushrooms.get(i).getY(), null);
 	 		}else{
 	 			g2.drawImage(this.tabMushrooms.get(i).meurt(), this.tabMushrooms.get(i).getX(), this.tabMushrooms.get(i).getY() + 20, null); 								
 	 		}
 	 	}
 	    for(int i = 0; i < this.tabTurtle.size(); i++){
 	 		if(this.tabTurtle.get(i).isAlive() == true){
 	 		    g2.drawImage(this.tabTurtle.get(i).marche("tortue", 50), this.tabTurtle.get(i).getX(), this.tabTurtle.get(i).getY(), null);
 	 	    }else{
 	 			g2.drawImage(this.tabTurtle.get(i).meurt(), this.tabTurtle.get(i).getX(), this.tabTurtle.get(i).getY() + 30, null);				
 	 		}
 	 	}
	    g2.setFont(police);
	    g2.drawString(this.score.getNbrePieces() + " coins over " + this.score.getTotalCoin(), 460, 30);
	    g2.drawString(this.cntdown.getStr(), 5, 25);
    }
}