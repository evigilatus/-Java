/* Next, we want to create an class called BallContainer.
 * A BallContainer is a container for Balls. */


package mitExamples;
import java.util.LinkedList;

public class BallContainer {
	// Contents of the box.
    LinkedList<Ball> contents;
    
    
    public BallContainer() {
	contents = new LinkedList<Ball>();
    }
    
    public boolean add(Ball b) {
		if(!contents.contains(b)) {
			contents.add(b);
			return true;
		}
		else
			return false;
		
	}

    /**
     * Removes a ball from the container. This method returns
     * <tt>true</tt> if ball was successfully removed from the
     * container, i.e. ball is actually in the container. You cannot
     * remove a Ball if it is not already in the container and so ths
     * method will return <tt>false</tt>, otherwise.
     * @param b Ball to be removed.
     * @return true if ball was successfully removed from the container,
     * i.e. ball is actually in the container. Returns false, if ball is not
     * in the container.
     */
    public boolean remove(Ball b) {
		if(contents.contains(b)) {
			contents.remove(b);
			return true;
		}
		else
			return false;
    }

    /**
     * Each Ball has a volume. This method returns the total volume of
     * all the Balls in the container.
     * @return the volume of the contents of the container.
     */
    public double getCapacity() {
    		double totalCapacity = 0;
    		for(Ball ball:contents) {
    			totalCapacity+=ball.capacity;
    		}
    		return totalCapacity;
    }

    /**
     * Returns the number of Balls in this container.
     * @return the number of Balls in this container.
     */
    public int size() {
    		int ballsNumber = 0;
		for(Ball ball:contents) {
			ballsNumber++;
		}
		return ballsNumber;
    }

    /**
     * Empties the container, i.e. removes all its contents.
     */
    public void clear() {
		contents = null;
    }

    /**
     * This method returns <tt>true</tt> if this container contains
     * the specified Ball. It will return <tt>false</tt> otherwise.
     * @param b Ball to be checked if its in container
     * @return true if this container contains the specified Ball. Returns
     * false, otherwise.
     */
    public boolean contains(Ball b) {
    		for(Ball ball:contents) {
    			if(ball.hashCode()==b.hashCode())
    				return true; 			   			
    		}
    		return false;
    }
}
