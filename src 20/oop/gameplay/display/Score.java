package oop.gameplay.display;

public class Score {
	private final int totalcoin = 10;
	private int nbrePieces;
	public Score(){
		this.nbrePieces = 0;
	}
	public int getNbrePieces(){
		return nbrePieces;
	}

	public int getTotalCoin(){
		return totalcoin;
	}
	public void setNbrePieces(int nbrePieces) {this.nbrePieces = nbrePieces;}
}
