import java.util.Scanner;
public class CatapultGame extends Catapult {
	
	public static void gameLoop() {
		System.out.println("Welcome to Catapult Game 2020!");
		catapultQuality();
		System.out.println("Your velocity is currently set to " + velocity + " m/s");
		System.out.println("Your angle is currently set to " + angle + " degreees");
		targetDistance();
		inputReader();
	}
	
	public static void inputReader() {
		
		Scanner l = new Scanner(System.in);
		
		System.out.println("What would you like to do?");
		
		input = l.nextLine();
		
		if(!input.equals("")) {
			
			{
				inputArray = input.split(" ");
				if(inputArray.length == 4) {
					if(inputArray[0].equalsIgnoreCase("cheat")) {
						cheatXYZ();
						inputReader();
					}else {
						System.out.println("Hmm..that doesn't seem to be a valid command");
						inputReader();
					}
				}
				else if(inputArray.length == 3) {
				if(inputArray[0].equalsIgnoreCase("set")) {
						if(inputArray[1].equalsIgnoreCase("angle")){
							noTrespassing();
							angleSetter();
							inputReader();
							
						}else if(inputArray[1].equalsIgnoreCase("velocity")) {
							noTrespassing();
							velocitySetter();
							inputReader();
						}else { 
							System.out.println("Hmm..that doesn't seem to be a valid command");
							inputReader();
						}
				}
				else if (inputArray[0].equalsIgnoreCase("cheat")) {
					cheatXY();
					inputReader();
				}else {
					System.out.println("Hmm..that doesn't seem to be a valid command");
					inputReader();
				}
				}else if (inputArray.length == 2) {
					if(inputArray[0].equalsIgnoreCase("cheat")) {
						cheatX();
						inputReader();
					}
					else {
						System.out.println("Hmm..that doesn't seem to be a valid command");
						inputReader();
					}
				}else if(inputArray.length == 1) {
					
				if(inputArray[0].equalsIgnoreCase("reset")) {
					reset();
					gameLoop();
				}else if(inputArray[0].equalsIgnoreCase("fire!"))  {
					fire();
					fireMessage();
					inputReader();
				}else if(inputArray[0].equalsIgnoreCase("score")) {
					scoreDisplay();
					inputReader();
				}else if(inputArray[0].equalsIgnoreCase("inspect")) {
					noTrespassing();
					display();
					inputReader();
				}else if (inputArray[0].equalsIgnoreCase("quit")) {
					System.exit(0);
				}else if (inputArray[0].equalsIgnoreCase("cheat")) {
					cheat();
					inputReader();
				}else {
					System.out.println("Hmmm. That doesn't seem to be one of our options. Please ented a valid command");
					inputReader();
				}
			}else {
					System.out.println("Hmm..that doesn't seem to be a valid command. Please enter a valid command");
					inputReader();
				}
			}
		}
		
		input = l.nextLine();
	}

	//calculates score and decrements shots remaining
	public static void fireMessage() {
		if(userShot>=(targetDistance - 12) && userShot<=(targetDistance+12) && shotsRemaining!= 0){
			System.out.println("Perfect hit!");
			score = score+10;
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot>=(targetDistance - 15) && userShot<=(targetDistance+15) && shotsRemaining!=0) {
			System.out.println("Good hit!");
			score = score+7;
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot>=(targetDistance - 20) && userShot<=(targetDistance+20) && shotsRemaining!=0) {
			System.out.println("Hit!");
			score = score+3;
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot<=(targetDistance - 21) && userShot>=(targetDistance - 30) && shotsRemaining!=0){
			System.out.println("Oh! You almost hit it! Just a little bit short! ");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot<=(targetDistance - 31) && userShot>=(targetDistance - 70) && shotsRemaining!=0){
			System.out.println("Not too bad....but a little bit short. Try again!");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot<=(targetDistance - 71) && userShot>=(targetDistance - 110) && shotsRemaining!=0){
			System.out.println("Not great but not too awful, I guess...You're short by around the length of a football field.");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot<=(targetDistance - 111) && userShot>=(targetDistance - 200) && shotsRemaining!=0){
			System.out.println("Yikes...a little bit short. Maybe I should run the 100m dash from your missle to the target");
			System.out.println("...or double that amount?...");
			System.out.println("Eh. Somewhere in that range...");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot<=(targetDistance - 201) && userShot>=(targetDistance - 300) && shotsRemaining!=0){
			System.out.println("A little bit short there, bud. By the height of a sequoia tree, give or take.");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot<=(targetDistance - 301) && userShot>=(targetDistance - 400) && shotsRemaining!=0){
			System.out.println("Not a great effort there, partner you're short by the length of an average golf hole");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot<=(targetDistance - 401) && userShot>=(targetDistance - 500) && shotsRemaining!=0){
			System.out.println("Waaaay short, man. Add four Ben Franklins and a couple of Jacksons worth of meters to that one.");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot<=(targetDistance - 501) && userShot>=(targetDistance - 600) && shotsRemaining!=0){
			System.out.println("Brutally short of the target. I have FIVE fingers on one hand and you're about ~how~ many hundred meters short of the target?");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}
		else if(userShot<=(targetDistance - 601) && userShot>=(targetDistance - 100000) && shotsRemaining!=0){
			System.out.println("OH wow, I don't even know how to describe how far short you are of the target that was soOOOOooOOO short.");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot>=(targetDistance + 21) && userShot<=(targetDistance + 30) && shotsRemaining !=0){
			System.out.println("Oh! You almost hit it! Just a little bit long! ");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot>=(targetDistance + 31) && userShot<=(targetDistance + 70) && shotsRemaining!=0){
			System.out.println("Not too bad....but a little bit long. Try again!");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot>=(targetDistance + 71) && userShot<=(targetDistance + 110) && shotsRemaining!=0){
			System.out.println("Not great but not too awful, I guess...You're long by around the length of a football field.");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot>=(targetDistance + 111) && userShot<=(targetDistance + 200) && shotsRemaining!=0){
			System.out.println("Yikes...a little bit long. Maybe I should run the 100m dash from your missle to the target");
			System.out.println("...or double that amount?...");
			System.out.println("Eh. Somewhere in that range...");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot>=(targetDistance + 201) && userShot<=(targetDistance + 300) && shotsRemaining!=0){
			System.out.println("A little bit long there, bud. By the height of a sequoia tree, give or take.");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot>=(targetDistance + 301) && userShot<=(targetDistance + 400) && shotsRemaining!=0){
			System.out.println("Not a great effort there, partner you're long by the length of an average golf hole");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot>=(targetDistance + 401) && userShot<=(targetDistance + 500) && shotsRemaining!=0){
			System.out.println("Waaaay short, man. Take away four Ben Franklins and a couple of Jacksons worth of meters to that one.");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}else if(userShot>=(targetDistance + 501) && userShot<=(targetDistance + 600) && shotsRemaining!=0){
			System.out.println("Brutally short of the target. I have FIVE fingers on one hand and you're about ~how~ many hundred meters long of the target?");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}
		else if(userShot>=(targetDistance + 601) && userShot<=(targetDistance + 100000) && shotsRemaining!=0){
			System.out.println("OH wow, I don't even know how to describe how far short you are of the target that was soOOOOooOOO long.");
			shotsRemaining--;
			heyEnder();
			System.out.println("You have " + shotsRemaining + " shots left");
			inputReader();
		}
		if (score>=bestScore) {
			bestScore = score;
		}
		System.out.println("The round is over. Your score was " + score + " and the best score is " + bestScore);
		System.out.println("To reset game, enter 'reset'. To quit, enter 'quit'");
		inputReader();
	}
	
	//checks that the user still has shots remaining
	public static void noTrespassing() {
		if (shotsRemaining == 0 && !(input.equalsIgnoreCase("reset") || input.equalsIgnoreCase("quit"))) {
			System.out.println("You have no shots left. You can reset or quit if you want.");
			inputReader();
		}
	}
	
	//produces the ending message with the score
	public static void heyEnder() {
		if (shotsRemaining == 0) {
			System.out.println("The round is over. Your score was " + score + " and the best score is " + bestScore);
			System.out.println("To reset game, enter 'reset'. To quit, enter 'quit'");
			inputReader();
		}
	}
	
	/**
	 * main method. calling gameLoop() creates an infinite loop within inputReader()
	 * game continues until user types "quit"
	 */
	
	public static void main(String[] args) {
		gameLoop();
	}
	}