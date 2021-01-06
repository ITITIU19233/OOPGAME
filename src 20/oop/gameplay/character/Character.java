package oop.gameplay.character;

import java.awt.Image;

import javax.swing.ImageIcon;

import oop.gameplay.mario.Main;
import oop.gameplay.objects.Object;

public class Character {
	private int largeur, hauteur; 
	private int x, y; 
	protected boolean marche; 
	protected boolean versDroite;
	public int compteur;
	protected boolean alive; 
	public Character(int x, int y, int largeur, int hauteur){				
		this.x = x;
		this.y = y;
		this.largeur = largeur;
		this.hauteur = hauteur;		
		this.compteur = 0;
		this.marche = false;
		this.versDroite = true;	
		this.alive = true;
	}	
	public int getX() {return x;}

	public int getY() {return y;}

    public int getLargeur() {return largeur;}
	
	public int getHauteur() {return hauteur;}

	public boolean isMarche() {return marche;}

	public boolean isVersDroite() {return versDroite;}

	public int getCompteur() {return compteur;}
	
	public boolean isAlive() {
		return alive;
	}	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setMarche(boolean marche) {
		this.marche = marche;
	}
	
	public void setVersDroite(boolean versDroite) {
		this.versDroite = versDroite;
	}

	public void setCompteur(int compteur) {this.compteur = compteur;}
	
	public void setAlive(boolean alive) {this.alive = alive;}
	public Image marche(String nom, int frequence){	
		String str;
		ImageIcon ico;
		Image img;		
		if(this.marche == false){
			if(this.versDroite == true){str = "/images/" + nom + "ArretDroite.png";}
			else{str = "/images/" + nom + "ArretGauche.png";}
		}else{
			this.compteur++;
			if(this.compteur / frequence == 0){
				if(this.versDroite == true){str = "/images/" + nom + "ArretDroite.png";}
				else{str = "/images/" + nom + "ArretGauche.png";}
			}else{
				if(this.versDroite == true){str = "/images/" + nom + "MarcheDroite.png";}
				else{str = "/images/" + nom + "MarcheGauche.png";}
			}
			if(this.compteur == 2 * frequence){this.compteur = 0;}
		}
		ico = new ImageIcon(getClass().getResource(str));
		img = ico.getImage();
		return img;
	}
    
	public void deplacement(){		
		if(Main.scene.getxPos() >= 0){this.x = this.x - Main.scene.getDx();}
	}
    protected boolean contactAvant(Object objet){
	    if(this.x + this.largeur < objet.getX() || this.x + this.largeur > objet.getX() + 5 ||
	       this.y + this.hauteur <= objet.getY() || this.y >= objet.getY() + objet.getHauteur()){return false;}
		else{return true;}
	} 
    protected boolean contactArriere(Object objet){		
		if(this.x > objet.getX() + objet.getLargeur() || this.x + this.largeur < objet.getX() + objet.getLargeur() - 5 || 
		   this.y + this.hauteur <= objet.getY() || this.y >= objet.getY() + objet.getHauteur()){return false;}
		else{return true;}
	}
    protected boolean contactDessous(Object objet){		
		if(this.x + this.largeur < objet.getX() + 5 || this.x > objet.getX() + objet.getLargeur() - 5 || 
		   this.y + this.hauteur < objet.getY() || this.y + this.hauteur > objet.getY() + 5){return false;}
		else{return true;}		
	}
    protected boolean contactDessus(Object objet){
		if(this.x + this.largeur < objet.getX() + 5 || this.x > objet.getX() + objet.getLargeur() - 5 || 
		   this.y < objet.getY() + objet.getHauteur() || this.y > objet.getY() + objet.getHauteur() + 5){return false;}
		else{return true;}
	}   
    
    public boolean proche(Object objet){  	
    	if((this.x > objet.getX() - 10 && this.x < objet.getX() + objet.getLargeur() + 10) 
    	|| (this.x + this.largeur > objet.getX() - 10 && this.x + this.largeur < objet.getX() + objet.getLargeur() + 10)){return true;}
    	else{return false;}
    }
    
    protected boolean contactAvant(Character character){
		if(this.isVersDroite() == true){
			if(this.x + this.largeur < character.getX() || this.x + this.largeur > character.getX() + 5 || 
			   this.y + this.hauteur <= character.getY() || this.y >= character.getY() + character.getHauteur()){return false;}
			else{return true;}
		}else{return false;}
	} 
    
    protected boolean contactArriere(Character character){	
		if(this.x > character.getX() + character.getLargeur() || this.x + this.largeur < character.getX() + character.getLargeur() - 5 || 
		   this.y + this.hauteur <= character.getY() || this.y >= character.getY() + character.getHauteur()){return false;}
		else{return true;}
	}
    
    protected boolean contactDessous(Character character){
    	if(this.x + this.largeur < character.getX() || this.x > character.getX() + character.getLargeur() || 
    	   this.y + this.hauteur < character.getY() || this.y + this.hauteur > character.getY()){return false;}
		else{return true;}
	}
    
    public boolean proche(Character character){  	
    	if((this.x > character.getX() - 10 && this.x < character.getX() + character.getLargeur() + 10) 
    	|| (this.x + this.largeur > character.getX() - 10 && this.x + this.largeur < character.getX() + character.getLargeur() + 10)){
    	return true;}
    	else{return false;}
    }
    
}
