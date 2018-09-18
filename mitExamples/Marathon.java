/*Find the fastest runner. Print the name and his/her time (in minutes).
Optional: Find the second fastest runner. 
Print the name and his/her time (in minutes).*/

package mitExamples;
public class Marathon {
	public static int bestResultValue = Integer.MAX_VALUE;
	public static int secondResultValue = Integer.MAX_VALUE;
	public static int bestResultIndex = 0;
	public static int secondResultIndex = 0;
	
	public static void main (String[] arguments) {
		
		 String[] names = {
		"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
		"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
		"Aaron", "Kate"
		};
		 
		 
		int[] times = {
		341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
		343, 317, 265
		};
		
		System.out.println("First Runner: " + names[bestResultIndex] + "; Time: " + times[bestResultIndex]);
		System.out.println("Second Runner: " + names[secondResultIndex] + "; Time: " + times[secondResultIndex]);
		
	}
	
	
	public static int findFirstRunner(String[] names, int[] times) {
		bestResultValue = Integer.MAX_VALUE;
		bestResultIndex = 0;
		
		for(int i=0;i<names.length;i++) {
			if(times[i]<bestResultValue)
				bestResultIndex=i;
		}
				
		return bestResultIndex;
	}
	
	public static int findSecondRunner(String[] names, int[] times) {
		 secondResultValue = Integer.MAX_VALUE;
		 secondResultIndex = 0;
	
		for(int i=0;i<names.length;i++) {
			if(i==bestResultIndex)
				continue;
			else {
				if(times[i]<secondResultValue) {
					secondResultValue = times[i];
					secondResultIndex = i;
				}
			}
		}
		
		return secondResultIndex;
	
	}
}