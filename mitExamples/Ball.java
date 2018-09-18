/* As a warm up exercise, take a look at Ball.java. A Ball is a simple object that has a
capacity.*/

package mitExamples;

public class Ball {
	public double capacity = 0;
	public double weight = 0;
	
	public Ball(double capacity, double weight) {
		this.capacity = capacity;
		this.weight = weight;
	}
	
	public double getCapacity(Ball b) {
		return b.capacity;
	}
}
