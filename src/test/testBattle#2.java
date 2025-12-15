import java.util.Scanner; 
import java.util.Random;

public class testBattle {
	public static void main(String[] args) {
		
		//Add yung parang random na mga upgrades sa character
		//MAX Health 
		//Stamina 
		//Inventory - Magic Items to add.
		//Plot or Lore
		
		Scanner input = new Scanner(System.in);
		Random dice = new Random();
		
		//Enemy
		String[] creatures = {"DUWENDE", "TIKBA1`LANG", "MANANANGGAL", "KAPRE", "BAKUNAWA"};
		int[] enemyHealth = {85, 95, 100, 125};
		String firstEnemy = creatures[0];
		int firstEnemyHealth = enemyHealth[dice.nextInt(0, 4)];
		
		//Hero
		int heroHealth = 75;
		int healthPotions = 5;
		
		//Escape Condition
		boolean heroRun = true;
		
		//Again?
		int again = 0;
		
		clearConsole();
		
		do {
		System.out.println("===================================================");
		System.out.println("                 ⚔️ ENCOUNTER");
		System.out.println("===================================================");
		System.out.println("A \"" + firstEnemy + "\" emerged from the shadows!\n");
		
		do {
		System.out.println(firstEnemy + "'s Health: " + firstEnemyHealth + "\nYour Health: " + heroHealth);
		System.out.println("\nWhat will you do?\n[1] Attack\n[2] Heal\n[3] Run" + "\n=====================");
		System.out.print("Action >  ");
		int heroInput = input.nextInt();
		int enemyInput = dice.nextInt(1, 7);
		
		//HERO CONDITIONS
		switch (heroInput) {
		case 1:
			int userAttack = dice.nextInt(0, 11) + dice.nextInt(0, 21);
			firstEnemyHealth -= userAttack;
			
			System.out.println("\nDamage dealt: " + userAttack);
			
			if (userAttack >= 1 && userAttack <= 10) {
				System.out.println("Hold the weapon right! You barely scratched the " + firstEnemy + "!");
				System.out.println("\n*The " + firstEnemy + " laughed at YOU!");
			} else if (userAttack >= 11 && userAttack <= 24) {
				System.out.println("You hit the " + firstEnemy + " solidly!");
				System.out.println("\n*The " + firstEnemy + " screeched in pain!");
			} else if (userAttack >= 25 && userAttack <= 27) {
				System.out.println("Nice hit! Let's do more of that next time!");
				System.out.println("\n*The " + firstEnemy + " screeched in pain!");
			} else if (userAttack >= 28 && userAttack <= 30) {
				System.out.println("Critical hit! You crushed the enemy with full force!");
				System.out.println("\n*The " + firstEnemy + " roared at YOU!");
			} else {
				System.out.println("Do better! You didn't hit the " + firstEnemy + " at all!");
			}
			break;
		case 2:
			if (healthPotions > 0) {
				healthPotions -= 1;
				heroHealth += 20;
				System.out.println("\nYou've been healed with 20 HP!\nHEALTH POTIONS REMAINING: " + healthPotions);
			} else {
				System.out.println("You run of Health POTIONS");
			}
			System.out.println("\nYour HEALTH: " + heroHealth + " HP");
			break;
		case 3:
			System.out.println("\nYou attempt to flee...");
			
			int escape = dice.nextInt(1, 5);
			int run = dice.nextInt(1, 5);
			
			if (escape == run) {
				System.out.println("\nSuccess!");
				heroRun = false;
			} else {
				System.out.println("\nFailed!");
			}
			break;
		default:
			System.out.println("Only select Action(1-2-3)!");
			System.out.println("You did NOTHING!");
		}
		
		//ENEMY CONDITIONS
		if (enemyInput >= 1 && enemyInput <= 4) {
			int enemyAttack = dice.nextInt(0, 16) + dice.nextInt(0, 20);
			heroHealth -= enemyAttack; 	
			
			System.out.println("\nDamage TAKEN: " + enemyAttack);
			
				if (enemyAttack >= 1 && enemyAttack <= 10) {
					System.out.println("The " + firstEnemy + " barely scratched YOU! Be careful!");
				} else if (enemyAttack >= 11 && enemyAttack <= 24) {
					System.out.println("YOU were hit!");
				} else if (enemyAttack >= 25 && enemyAttack <= 27) {
					System.out.println("Aww shucks, their hits are powerful!");
				} else if (enemyAttack >= 28 && enemyAttack <= 30) {
					System.out.println("Critical hit! You were hit effortlessly!");
				} else {
					System.out.println("That was luck, YOU weren't hit at all");
				}
		} else {
			int heal = dice.nextInt(0, 16);
			firstEnemyHealth += heal;
			System.out.println("\nThe " + firstEnemy + " was healed with " + heal + " HP!\n" + firstEnemy + " Current HP: " + firstEnemyHealth);
		}
		
		System.out.println("\n" + firstEnemy + " HP: " + firstEnemyHealth + "\nYOUR HP: " + heroHealth + "\n==============================");
	
		} while (firstEnemyHealth > 0 && heroHealth > 0 && heroRun);
		
		//===============================================================
		
		//IF YOU WIN
		if (heroHealth > 0 && heroRun) {
		System.out.println("\nYou successfuly defeated the " + firstEnemy + "!");
		} 
		if (heroRun == false) {
			System.out.println("\nYou escaped safely!");
		}
		//IF YOU LOSE
		if (heroHealth <= 0) {
			System.out.println("\nYou lost...Do you want to try again?\n[1] YES\n[2] NO");
			again = input.nextInt();
		} 
		} while (again == 1);
		input.close();
	}
	public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
