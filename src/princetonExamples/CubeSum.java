/*that prints out all integers of the form a3 + b3 where a and b are integers between 0 and N in sorted order without using excessive space. 
 * That is, instead of computing an array of the N2 sums and sorting them, build a minimum-oriented priority queue, 
 * initially containing (03, 0, 0), (13, 1, 0), (23, 2, 0), ..., (N3, N, 0). 
 * Then, while the priority queue is nonempty, remove the smallest item (i3 + j3, i, j), print it, and then, 
 * if j < N, insert the item (i3 + (j+1)3, i, j+1). 
 * Use this program to find all distinct integers a, b, c, and d between 0 and 10^6 such that
 *  a3 + b3 = c3 + d3, e.g., 1729 = 9^3 + 10^3 = 1^3 + 12^3.*/

package princetonExamples;
import java.util.PriorityQueue;
import java.util.Scanner;


public class CubeSum implements Comparable<CubeSum> {
    private final int sum;
    private final int i;
    private final int j;

    public CubeSum(int i, int j) {
        this.sum = i*i*i + j*j*j;
        this.i = i;
        this.j = j;
    }

    public int compareTo(CubeSum that) {
        if (this.sum < that.sum) return -1;
        if (this.sum > that.sum) return +1;
        return 0;
    }

    public String toString() {
        return sum + " = " + i + "^3" + " + " + j + "^3";
    }


    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        // initialize priority queue
        PriorityQueue<CubeSum> pq = new PriorityQueue<CubeSum>();
        for (int i = 0; i <= n; i++) {
            pq.add(new CubeSum(i, i));
        }

        // find smallest sum, print it out, and update
        while (!pq.isEmpty()) {
            CubeSum s = pq.peek();
            System.out.println(s);
            if (s.j < n)
                pq.add(new CubeSum(s.i, s.j + 1));
        }
    }

}
