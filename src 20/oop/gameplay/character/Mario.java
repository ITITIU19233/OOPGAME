package oop.gameplay.character;

import java.awt.Image;

import javax.swing.ImageIcon;

import oop.gameplay.mario.Main;
import oop.gameplay.objects.Coin;
import oop.gameplay.objects.Object;

public class Mario extends Character{
	private Image imgMario;
	private ImageIcon icoMario;
    private boolean saut; 
    private int compteurSaut;
	public Mario(int x, int y) {
		super(x, y, 28, 50);		
		this.icoMario = new ImageIcon(getClass().getResource("/images/marioMarcheDroite.png"));
		this.imgMario = this.icoMario.getImage();
		this.saut = false;
		this.compteurSaut = 0;
	}	
	public Image getImgMario() {return imgMario;}

	public boolean isSaut() {return saut;}
	public void setSaut(boolean saut) {this.saut = saut;}

	@Override
	public Image marche(String nom, int frequence) {
    	String str;
    	ImageIcon ico;
		Image img;			
		if (this.marche == false || Main.scene.getxPos() <= 0 || Main.scene.getxPos() > 4430) {
			if(this.versDroite == true){str = "src/images/" + nom + "ArretDroite.png";}
			else{str = "src/images/" + nom + "ArretGauche.png";}				
		}else{
		    this.compteur++;
		    if (this.compteur / frequence == 0) { 
		    	if(this.versDroite == true){str = "src/images/" + nom + "ArretDroite.png";}
		    	else{str = "src/images/" + nom + "ArretGauche.png";}					
		    }else{
		    	if(this.versDroite == true){str = "src/images/" + nom + "MarcheDroite.png";}
		    	else{str = "src/images/" + nom + "MarcheGauche.png";}	
		    }		    
		    if (this.compteur == 2 * frequence) {this.compteur = 0;}
		}
		
		ico = new ImageIcon(str);
		img = ico.getImage();
		return img;
	}
	
    public Image saute(){		
	    ImageIcon ico;
	    Image img;
	    String str;
		this.compteurSaut++;
		if(this.compteurSaut <= 40){
			if(this.getY() > Main.scene.getHautPlafond()){this.setY(this.getY() - 4);}
			else{this.compteurSaut = 41;}			
			if(this.isVersDroite() == true){str = "/images/marioSautDroite.png";}
			else{str = "/images/marioSautGauche.png";}
		}else if(this.getY() + this.getHauteur() < Main.scene.getySol()){this.setY(this.getY() + 1);
			if(this.isVersDroite() == true){str = "/images/marioSautDroite.png";}
			else{str = "/images/marioSautGauche.png";}
		}else{				
			if(this.isVersDroite() == true){str = "/images/marioArretDroite.png";}
			else{str = "/images/marioArretGauche.png";}	
			this.saut = false;
			this.compteurSaut = 0;
		}
		ico = new ImageIcon(getClass().getResource(str));
		img = ico.getImage();
		return img;
	}
    
	public void contact(Object objet) {
		if((super.contactAvant(objet) == true && this.isVersDroite() == true) || (super.contactArriere(objet) == true && this.isVersDroite() == false)){
			Main.scene.setDx(0);
		    this.setMarche(false);
		}
        if(super.contactDessous(objet) == true && this.saut == true){ 
		}else if(super.contactDessous(objet) == false){ 
			Main.scene.setySol(293); 
			if(this.saut == false){this.setY(243);} 
		}
        if(super.contactDessus(objet) == true){
			Main.scene.setHautPlafond(objet.getY() + objet.getHauteur()); 
		}else if(super.contactDessus(objet) == false && this.saut == false){
			Main.scene.setHautPlafond(0);
		}     
	}
	
	public boolean contactPiece(Coin coin){
		if(this.contactArriere(coin) == true || this.contactAvant(coin) == true || this.contactDessous(coin) == true || 
		   this.contactDessus(coin) == true){
			return true;			
		}else{return false;}
	}	

	public void contact(Character character) {		
		if((super.contactAvant(character) == true) || (super.contactArriere(character) == true)){
			this.setMarche(false);
		    this.setAlive(false);
		}else if(super.contactDessous(character) == true){
			character.setMarche(false);
			character.setAlive(false);
		}
    }
}
