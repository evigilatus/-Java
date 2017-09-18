package mitExamples;

public class Primes {
	public static void main(String args[]) {
		int n = 50;
		
		test: 
		for(int i=2;i<n;i++) {
			for(int j=2;j<=Math.sqrt((double)i);j++) {
				if(i%j==0) {
					continue test;
				}
			}
			System.out.println(i);
		}
	}
}
