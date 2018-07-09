package chapter1.three;
import java.util.Scanner;

import edu.princeton.cs.algs4.Stack;

/** 
* @author chen zhen 
* @version 创建时间：2018年1月14日 上午11:48:55 
* @value 类说明: Reads in an infix expression 
* and outputs an equivalent postfix expression
*/
public class InfixToPostfix {
	 public static void main(String[] args) {
	        Stack<Character> stack = new Stack<Character>();
	        Scanner scan = new Scanner(System.in);
	        String str = scan.nextLine();
	        for(int i = 0; i < str.length(); i++) {
	        	char s = str.charAt(i);
	            if      (s == '+') stack.push(s);
	            else if (s =='*') stack.push(s);
	            else if (s ==')') System.out.print(stack.pop() + " ");
	            else if (s == '(') System.out.print("");
	            else                    System.out.print(s + " ");
	        }
	        System.out.println();
	        scan.close();
	    }
}
