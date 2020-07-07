/*Name: Juan Ramon Feliciano
* Netid: jfelici5
* Assignment: Project 1
* Lab section: TR 12:30pm
*
* I did not collaborate with anyone on this assignment.
*/
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
import java.lang.Math;
public class Catapult {
	
	public static double angle = 45;
	public static double velocity = 50;
	private static int catapultQuality;
	protected static double targetDistance;
	protected static double userShot;
	public static int shotsRemaining = 5;
	protected static int score = 0;
	protected static int bestScore = 0;
	private static double gravity = 9.8;
	private static double recalculatedVelocity;
	private static double recalculatedAngle;
	private static String catapultQualityString;
	private static String targetDistanceString;
	protected static String input = "";
	protected static String inputArray[];
	public static double angleInRadians;
	
	//randomizing target distance
	static void targetDistance() {
	    double minimum = 50;
	    double maximum = 1000;
	    targetDistance = minimum + new Random().nextDouble()*(maximum-minimum);
		if (targetDistance>=700) {
			targetDistanceString = "insanely far away";	
		}else if (targetDistance>=400) {
			targetDistanceString = "pretty far away";
		}else if (targetDistance>=200) {
			targetDistanceString = "decently far away";
		}else if (targetDistance>=50) {
			targetDistanceString = "not very far away";
		}
		System.out.println("Your target is " + targetDistanceString);
	}
	
	//randomizing catapult quality
	public static void catapultQuality() {
		int minimum = 1;
		int maximum = 10;
		catapultQuality = new Random().nextInt((maximum - minimum) + 1) + minimum;
		if (catapultQuality>=10) {
			catapultQualityString = "insanely good";	
		}else if (catapultQuality>=7) {
			catapultQualityString = "pretty good";
		}else if (catapultQuality>=4) {
			catapultQualityString = "average";
		}else if (catapultQuality>=1) {
			catapultQualityString = "not great";
		}
		System.out.println("Your catapult quality is " + catapultQualityString);
	}
	
	//displaying the score - "score" function
	public static void scoreDisplay() {
		System.out.println("Your current score is " + score + " . The best score is " + bestScore);
	}
	
	//sets velocity - "set velocity X" function
	public static void velocitySetter() {
		velocity = Double.parseDouble(inputArray[2]);
		velocityDomainChecker();
		System.out.println("Your new velocity is " + velocity + " m/s");
	}
	
	//checks that velocity is within 0 and 100
	public static void velocityDomainChecker() {
		Scanner velocityRevise = new Scanner(System.in);
		if(velocity  > 100 || velocity < 0) {
			System.out.println("Your velocity is not within our range. Please input a number between 0 and 100");
			do {
				try {
					System.out.println("Hmmm. That doesn't look to be a valid number. Please input a number between 0 and 100");
					velocity = velocityRevise.nextDouble();
				}
				catch(InputMismatchException e) {
			}
				velocityRevise.nextLine();
				
		}while(velocity > 100 || velocity < 0);
		
		System.out.println("Thanks for fixing that up.");
	}
	}	
	
	//randomly calculates velocity based on catapult quality
	public static void velocityRecalculation() {
		Random gaussian = new Random();
		recalculatedVelocity =  velocity + (10-catapultQuality)*gaussian.nextGaussian();
		}
	
	//sets angle - "set angle X" function
	public static void angleSetter() {
		angle = Double.parseDouble(inputArray[2]);
		angleDomainChecker();
		System.out.println("Your new angle is " + angle + " degrees");
	}
	
	//checks that angle is between 0 and 90 degrees
	public static void angleDomainChecker() {
		Scanner angleRevise = new Scanner(System.in);
		if(angle  > 90 || angle < 0) {
			do {
				try {
					System.out.println("Hmmm. That doesn't look to be a valid number. Please input a number between 0 and 90");
					angle = angleRevise.nextDouble();
				}
				catch(InputMismatchException e) {
			}
				angleRevise.nextLine();
				
		}while(angle > 90 || angle < 0);
		
		System.out.println("Thanks for fixing that up.");
	}
	}
	
	public static void angleRecalculation() {
		Random gaussian = new Random();
		recalculatedAngle =  angle + (10-catapultQuality)*gaussian.nextGaussian();
		}
	
	//Math.sin takes input in radians, so this method converts user inputted angle to radians
	public static void convertAngle() {
		angleInRadians = Math.toRadians(2*recalculatedAngle);
	}
	
	//checks that target distance is between 50 and 1000 (for cheat function)
	public static void targetDistanceDomainChecker() {
		Scanner distanceRevise = new Scanner(System.in);
		if(targetDistance >1000 || targetDistance <50) {
			do {
				try {
					System.out.println("Hmmm. Your target distance doesn't seem to be valid, but we can fix that. Please input a number between 50 and 1000");
					targetDistance = distanceRevise.nextDouble();
				}
				catch(InputMismatchException e) {
			}
				distanceRevise.nextLine();
				
		}while(targetDistance >1000 || targetDistance <50);
		
		System.out.println("Thanks for fixing that up.");
	}
		if (targetDistance>=700) {
			targetDistanceString = "insanely far away";	
		}else if (targetDistance>=400) {
			targetDistanceString = "pretty far away";
		}else if (targetDistance>=200) {
			targetDistanceString = "decently far away";
		}else if (targetDistance>=50) {
			targetDistanceString = "not very far away";
		}
	}
	
	//checks that catapult quality is between 1 and 10 (for cheat function)
	public static void catapultQualityDomainChecker() {
		Scanner catapultQualityRevise = new Scanner(System.in);
		if(catapultQuality  > 10 || catapultQuality < 1) {
			do {
				try {
					System.out.println("Hmmm. Your catapult quality doesn't seem to be valid, but we can fix that. Please input a number between 1 and 10");
					catapultQuality = catapultQualityRevise.nextInt();
				}
				catch(InputMismatchException e) {
			}
				catapultQualityRevise.nextLine();
				
		}while(catapultQuality > 10 || catapultQuality < 1);
		
		System.out.println("Thanks for fixing that up.");
	}
		if (catapultQuality>=10) {
			catapultQualityString = "insanely good";	
		}else if (catapultQuality>=7) {
			catapultQualityString = "pretty good";
		}else if (catapultQuality>=4) {
			catapultQualityString = "average";
		}else if (catapultQuality>=1) {
			catapultQualityString = "not great";
		}
	}
	
	//checks that shots remaining has a positive value (for cheat function)
	public static void shotsRemainingDomainChecker() {
		Scanner shotsRemainingRevise = new Scanner(System.in);
		if(shotsRemaining  < 0) {
			do {
				try {
					System.out.println("Hmmm. That doesn't look to be a valid number for shots. Please input a number greater than zero");
					shotsRemaining = shotsRemainingRevise.nextInt();
				}
				catch(InputMismatchException e) {
			}
				shotsRemainingRevise.nextLine();
				
		}while(shotsRemaining < 0);
		
		System.out.println("Thanks for fixing that up.");
	}
	}
	
	//"cheat" function
	public static void cheat() {
		System.out.println("Your old catapult quality is " + catapultQuality + " and the target is " + targetDistance + " meters away");
	}
	
	//"cheat X" function
	public static void cheatX() {
		System.out.println("Your old catapult quality is " + catapultQuality + " and the target is " + targetDistance + " meters away");
		shotsRemaining = (int) (Double.parseDouble(inputArray[1]));
		shotsRemainingDomainChecker();
		System.out.println("You now have " + shotsRemaining + " shots remaining");

	}
	
	//"cheat XY" function
	public static void cheatXY() {
		System.out.println("Your old catapult quality is " + catapultQuality + " and the target is " + targetDistance + " meters away");
		shotsRemaining = (int) (Double.parseDouble(inputArray[1]));
		shotsRemainingDomainChecker();
		catapultQuality = (int) (Double.parseDouble(inputArray[2]));
		catapultQualityDomainChecker();
		System.out.println("Your new catapult quality is " + catapultQuality + " and you have " + shotsRemaining + " shots remaining");
	}
	
	//"cheat XYZ" function
	public static void cheatXYZ() {
		System.out.println("Your old catapult quality is " + catapultQuality + " and the target is " + targetDistance + " meters away");
		shotsRemaining = (int) (Double.parseDouble(inputArray[1]));
		shotsRemainingDomainChecker();
		catapultQuality = (int) (Double.parseDouble(inputArray[2]));
		catapultQualityDomainChecker();
		targetDistance = (Double.parseDouble(inputArray[3]));
		targetDistanceDomainChecker();
		System.out.println("Your new catapult quality is " + catapultQuality + " and you have " + shotsRemaining + " shots remaining. The target is now " + targetDistance + " meters away");
	}
	
	//inspect function
	public static void display() {
		System.out.println("Your catapult quality is " + catapultQualityString + " and the target is " + targetDistanceString);
	}
	
	//calculates user shot
	public static void fire() {
		velocityRecalculation();
		angleRecalculation();
		convertAngle();
		userShot = (((recalculatedVelocity*recalculatedVelocity)/gravity)*(Math.sin(angleInRadians)));
	}
	
	//"reset" function
	public static void reset() {
		shotsRemaining = 5;
		velocity = 50;
		angle = 45;
		score = 0;
	}
	
	
}
