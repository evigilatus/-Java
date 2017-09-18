package mitExamples;
import java.util.Scanner;

public class GravityCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double gravity = sc.nextDouble();
		double inVelocity = 0.0;
		double fallingTime = sc.nextDouble();
		double inPosition = 0.0;
		sc.close();
		
		double finalPosition = 1/2*gravity*fallingTime*fallingTime;
		finalPosition+=inVelocity*fallingTime;
		finalPosition+=inPosition;
		
		System.out.println("An object's position after " + fallingTime + " seconds is " + finalPosition + " m." ); 
	}
}
