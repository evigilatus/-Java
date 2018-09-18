/*A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. 
 * For example, {[(])} is not balanced because the contents in between { and } are not balanced. 
 * The pair of square brackets encloses a single, unbalanced opening bracket, (, 
 * and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

 *By this logic, we say a sequence of brackets is considered to be balanced if the following conditions are met:
 *It contains no unmatched brackets.
 *The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
 *Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, print YES on a new line; otherwise, print NO on a new line.*/

package hackerRank;

import java.util.Scanner;
import java.util.Stack;

public class DSStack {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			System.out.println(isBalanced(in.next()));
		}
		in.close();
	}

	static boolean isBalanced(String parentheses) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < parentheses.length(); i++) {
			char ch = parentheses.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (stack.empty()) {
				return false;
			} else {
				char top = stack.pop();
				if ((top == '(' && ch != ')') || (top == '[' && ch != ']') || (top == '{' && ch != '}')) {
					return false;
				}
			}
		}
		return stack.empty();
	}
}
