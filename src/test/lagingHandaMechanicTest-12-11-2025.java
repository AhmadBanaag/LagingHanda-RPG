package lagingHanda;
import java.util.Scanner; 
import java.util.Random;

public class lagingHandaMechanicTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random dice = new Random();
		
		String[] creatures = {"DUWENDE", "TIKBALANG", "MANANANGGAL", "KAPRE", "BAKUNAWA"};
		
		System.out.println("----- [ WELCOME TO LAGING HANDA ] -----");
		mechanics();
		
		System.out.println("------------------------------------------------\n");
		//INTRO TO GAME
		
		System.out.print("Unknown: Well,");
		delay(1500);
		System.out.println(" hello there!");
		delay(1500);
		System.out.println("Unknown: I supposed that you are one of those LOST SCOUTS");
		delay(1500);
		System.out.println("Dumakulem: Don't be afraid, my name is \"Dumakulem\". ");
		delay(1500);
		System.out.println("Dumakulem: I am the guardian of these mountains.");
		delay(1500);
		System.out.println("Dumakulem: And you are?");
		System.out.print("Enter your Name: ");
		String player_name = input.nextLine();
		delay(1500);
		System.out.println("Dumakulem: That's a nice name for a scout like you, \"" + player_name + "\".");
		delay(1500);
		System.out.println("Dumakulem: Well, you better start your adventure, Scout " + player_name + ".");
		delay(1500);
		System.out.print("Dumakulem: This game is still in development soooo.... ");
		delay(1500);
		System.out.println("Best of luck!");
		delay(1000);
		System.out.println("Loading...");
		delay(3000);
		
		System.out.println("\n------------------------------------------------\n");
		
		String dice_play = "";
		
		do {
		System.out.print("Please press \"Enter\" to roll a dice(1-4).");
		dice_play = input.nextLine();
		
		if(dice_play.equals("")) {
			System.out.println("Diwata: Nice roll!");
		} else {
			System.out.print("Engkanto: Ahhh...");
			delay(1200);
			System.out.println("I think you are supposed to ONLY press \"Enter\".");
			delay(1200);
			System.out.println("Engkanto: Please Try Again!\n");
		}
		} while (!dice_play.equals(""));
		
		int first_enemy = dice.nextInt(1, 5);
		
		System.out.print("You rolled a... ");
		delay(2000);
		System.out.println(first_enemy);
		delay(2000);
		System.out.println("Your first enemy will be the \"" + creatures[first_enemy - 1 ] + "\"." );
		delay(1300);
		System.out.println("\n------ GOOD LUCK IN YOUR JOURNEY! ------");
		System.out.println("\nLoading...");
		delay(3000);
		
		System.out.println("\n------------------------------------------------\n");
		
		
		
		
		input.close();
	}
	
	public static void mechanics() {
		System.out.println("\nHERE ARE THE MECHANICS FOR THE GAME!");
		delay(1000);
		System.out.println("\n1. There will be a total of FIVE(5) Stages.");
		delay(2000);
		System.out.println("\n2. You will have the options to ATTACK, HEAL, and RUN.");
		delay(2000);
		System.out.println("\n3. Different monsters will have different attributes. During the battle, you will be the one to guess their weakness.");
		delay(2000);
		System.out.println("\n4. Most of the monsters would not let you run, so do your best to defeat them.");
		delay(2000);
		System.out.println("\n5. You will be given more chance to heal, if you defeat a monster.");
		delay(2000);
		System.out.println("\n6. There are more to this game, best to EXPLORE it!");
		delay(2000);
		System.out.println("\nGOODLUCK, SCOUT!");
		delay(2000);
		System.out.println("\nLoading...\n");
		delay(3000);
	}
	
	public static void delay(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
