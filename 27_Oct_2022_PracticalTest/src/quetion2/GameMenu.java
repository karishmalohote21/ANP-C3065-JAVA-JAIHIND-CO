package quetion2;
import java.util.Scanner;
public class GameMenu {
	void startGame() {
		System.out.println("start game");
	}
	void displyGameInstruction() {
		System.out.println("start game");
	}
	void exitGame() {
		System.out.println("exit game");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameMenu gameMenuObj = new GameMenu();
		for(;;) {
		System.out.println("1. start the game \n 2.Display game instruction \n 3.Exit the game");
		Scanner scannerObj= new Scanner(System.in);
		System.out.println("Enter the choice 1,2 and 3");
		int menuChoice=scannerObj.nextInt();
		
		switch(menuChoice) {
		case 1:
			gameMenuObj.startGame();
			break;
		case 2:
			gameMenuObj.displyGameInstruction();
			break;
		case 3:
			gameMenuObj.exitGame();
			break;
			default: 
				System.out.println("Not a valid");		
		}
		}
	}

}
