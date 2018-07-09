package chapter1.three;

import java.util.Scanner;

import edu.princeton.cs.algs4.Stack;

/** 
* @author chen zhen 
* @version 创建时间：2018年1月13日 上午11:05:09 
* @value 类说明:补充括号，takes from standard input an expression
* without left parentheses and prints the equivalent infix expr
* 很巧妙
*/
public class FixParen {
	 
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
           
            Stack<Character> cStack = new Stack<Character>();
            Stack<String> sStack = new Stack<String>();

            for (int i = 0; i < line.length(); i++)
            { 
            	switch (line.charAt(i))
                    {		
                            case '+':
                            case '-':
                            case '*':
                            case '/':
                                    // cStack case
                                    cStack.push(line.charAt(i));
                                    break;
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                    // "sStack" case
                                    String s = "";
                                    s += line.charAt(i);
                                    sStack.push(s);
                                    break;
                            case ')':
                                    // closing paren case
                                    String a = sStack.pop();
                                    String b = sStack.pop();
                                    char c = cStack.pop();
                                   
                                    StringBuilder buf = new StringBuilder();
                                    buf.append("(");
                                    buf.append(b);
                                    buf.append(c);
                                    buf.append(a);
                                    buf.append(")");
                                   
                                    sStack.push(buf.toString());
                                    break;
                            case ' ':
                                    break;
                    }
            }
           
            System.out.println(sStack.pop());
            sc.close();
    }
}