package MyProjectPackage;
import java.util.Scanner;
class Guesser{
	int Guessernum;
	
	public int takeNumberGuesser() {
		System.out.println("Guesser guess a number");
		Scanner scan = new Scanner(System.in);
		Guessernum = scan.nextInt();
		return Guessernum;
	}
}
class Player{
	
	int playernum;
	public int takeNumberPlayer() {
		System.out.println("Player guess a number");
		Scanner scan = new Scanner(System.in);
		playernum = scan.nextInt();
		return playernum;
	}
	
}
class Umpire{
	int numfromGuesser;
	int numfromPlayer1;
	int numfromPlayer2;
	int numfromPlayer3;
	
	void collectfromGuesser(){
		Guesser g = new Guesser();
		 numfromGuesser=g.takeNumberGuesser();
	}
	void collectfromPlayer(){
		Player P1=new Player();
		numfromPlayer1=P1.takeNumberPlayer();
		
		Player P2=new Player();
		numfromPlayer2=P2.takeNumberPlayer();
		
		Player P3=new Player();
		numfromPlayer3=P3.takeNumberPlayer();
	}
	
	void compare() {
		if(numfromPlayer1==numfromGuesser) {
			if(numfromPlayer2==numfromGuesser&&numfromPlayer3==numfromGuesser) {
				System.out.println("All Players won the game");
			}
			else if(numfromPlayer2==numfromGuesser) {
				System.out.println("Only Player1 and Player2 won the game");
			}
			else if(numfromPlayer3==numfromGuesser) {
				System.out.println("Only Player1 and Player3 won the game");
			}
			else {
				System.out.println("Only Player1 won the game");
			}
		}
		else if(numfromPlayer2==numfromGuesser) {
			if(numfromPlayer3==numfromGuesser) {
				System.out.println("Only player 2 and 3 won the game");
			}
			else {
				System.out.println("only player2 won the game");
			}
		}
		else if(numfromPlayer3==numfromGuesser) {
			System.out.println("only player3 won the game");
		}
		else {
			System.out.println("No player won the Game");
		}
	}
	
}
public class GuesserGameProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Umpire U = new Umpire();
		U.collectfromGuesser();
		U.collectfromPlayer();
		U.compare();
			
	}

}
