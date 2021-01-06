package oop.gameplay.character;

import java.awt.Image;

import javax.swing.ImageIcon;

import oop.gameplay.objects.Object;

public class Turtle extends Character implements Runnable{
	private Image imgTortue;
	private ImageIcon icoTortue;

	private final int PAUSE = 15; 
	private int dxTortue; 

	public Turtle(int x, int y) {
			
		super(x, y, 43, 50);
		super.setVersDroite(true);
		super.setMarche(true);
		this.dxTortue = 1;	
		this.icoTortue = new ImageIcon(getClass().getResource("/images/tortueArretGauche.png"));
		this.imgTortue = this.icoTortue.getImage();
	
		Thread movingmushroom = new Thread(this);
		movingmushroom.start();
		}
		
	public Image getImgTortue() {return imgTortue;}
	public void bouge(){ 
	    if(super.isVersDroite() == true){this.dxTortue = 1;}
	    else{this.dxTortue = -1;}
	    super.setX(super.getX() + this.dxTortue);  	
	}
	
	@Override
	public void run() {
		try{Thread.sleep(20);}
		catch (InterruptedException e){}		
		
		while(true){ 
			if(this.alive == true){
		    this.bouge();
		    try{Thread.sleep(PAUSE);}
			catch (InterruptedException e){}
			}
		}
	}
	

	public void contact(Object objet) {			
		if(super.contactAvant(objet) == true && this.isVersDroite() == true){					
            super.setVersDroite(false);
	    	this.dxTortue = -1; 
	    }else if(super.contactArriere(objet) == true && this.isVersDroite() == false){
	    	super.setVersDroite(true);
	    	this.dxTortue = 1;     
	    }	
	}
	
	public void contact(Character character) {		
	    if(super.contactAvant(character) == true && this.isVersDroite() == true){					
            super.setVersDroite(false);
    	    this.dxTortue = -1; 
        }else if(super.contactArriere(character) == true && this.isVersDroite() == false){
    	    super.setVersDroite(true);
    	    this.dxTortue = 1;     
        }	
    }
	
    public Image meurt(){		
		String str;
    	ImageIcon ico;
		Image img;	
		
        str = "/images/tortueFermee.png";	
        ico = new ImageIcon(getClass().getResource(str));
		img = ico.getImage();
		return img;
	}
}
