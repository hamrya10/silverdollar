import java.util.*;

public class Silverdollar {

	boolean[] strip;
	int gameCoin;
	int nextSpace;
	double totalSize;
	final int PLAYER1 = 1;
	final int PLAYER2 = 2;
	
	
	public Silverdollar(){
		//post: creates the game
		//(Math.random() * .25) + 3;
	}
	
	public boolean[] strip(int stripSize){
		//post: creates a random strip
		totalSize = (double)stripSize;
		strip = new boolean[stripSize];
		return strip;
	}
	
	public int coins(){
		//post: creates a number of coins
		Random newCoin = new Random();
		double value = totalSize * .25;
		gameCoin = (newCoin.nextInt((int)value)) + 3;
		return gameCoin;
	}
	
	public void moveCoin(){
		//post: moves the coin along the strip
		if (strip[nextSpace] == true){
			
			
		}
		strip[nextSpace] = true;
		nextSpace++;
	}
	
	public void printBoard(){
		//post: prints board
	}
	
	
	public static void main(String[] args) {
		
		Silverdollar game = new Silverdollar();
		
		System.out.println("Welcome to the Silver Dollar game!");
		System.out.println("");
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter the length of your strip!");
		String useInpSize = console.next();
		System.out.println("");
		int gameSize = Integer.parseInt(useInpSize);
		game.strip(gameSize);
		
		// TODO Auto-generated method stub

	}

}
