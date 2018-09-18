/*Foo Corporation needs a program to calculate how much to pay their hourly employees. 
 * The US Department of Labor requires that employees get paid time and a half for any hours over 40 that they work in a single week. */

package mitExamples;
import java.util.Scanner;
public class FooCorporation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			double base = 0;
			
			do {
			base = sc.nextDouble();
			}
			while(base<8.00);
			
			double hours = sc.nextDouble();
			sc.close();
			
			if(hours>60)
				System.out.println("Error. The number of hours must be no more than 60 ");
			else
				pay(base, hours);
	}
	
	public static double pay(double base, double hours) {
		if(hours>40) 
			return base*hours*1.5;
		else 
			return base*hours;
		
			
	}

}
