package oop.gameplay.display;

public class CountDown implements Runnable{
	private final int PAUSE = 1000;	
	private int time;
	private String str;

	public CountDown(){
		this.time = 180; 
		this.str = "Time : 180";
		
		Thread cntdown = new Thread(this);
		cntdown.start();
	}
	public int getTime() {
		return time;
	}
	
    public String getStr() {
		return str;
	}
	@Override
	public void run() {		
		
		while(true){										
		    try{Thread.sleep(PAUSE);}
			catch (InterruptedException e){}
			this.time--;
			this.str = "Time : " + this.time;
		}		
	} 
	
}
