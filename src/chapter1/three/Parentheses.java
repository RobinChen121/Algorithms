package chapter1.three;

import java.util.Scanner;

import edu.princeton.cs.algs4.Stack;

/** 
* @author robinchen.
* @version ����ʱ�䣺2017��12��22�� ����10:44:30.
*  reads in a text stream and uses a stack to determine 
*  whether parentheses are balanced.
* ʹ�� stack ʵ���˵���ѭ����������˫��.
*/
public class Parentheses {
	private static final char LEFT_PAREN = '(';
	private static final char RIGHT_PAREN = ')';
	private static final char LEFT_BRACE = '{';
	private static final char RIGHT_BRACE = '}';
	private static final char LEFT_BRACKET = '[';
	private static final char RIGHT_BRACKET = ']';
	
	public static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == LEFT_PAREN)
				stack.push(LEFT_PAREN);
			if (s.charAt(i) == LEFT_BRACE)
				stack.push(LEFT_BRACE);
			if (s.charAt(i) == LEFT_BRACKET)
				stack.push(LEFT_BRACKET);
			
			if (s.charAt(i) == RIGHT_PAREN) {
				if (stack.isEmpty()) return false;
				if (stack.pop() != LEFT_PAREN) return false;
			}
			if (s.charAt(i) == RIGHT_BRACE) {
				if (stack.isEmpty()) return false;
				if (stack.pop() != LEFT_BRACE) return false;
			}
			if (s.charAt(i) == RIGHT_BRACKET) {
				if (stack.isEmpty()) return false;
				if (stack.pop() != LEFT_BRACKET) return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine().trim();
		System.out.println(isBalanced(S));
		scan.close();
	}

}
