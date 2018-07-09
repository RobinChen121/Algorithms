package chapter1.three;

import java.util.Stack;

public class Evaluate
{
	static double evaluate(String expression){
		Stack<Double> operands = new Stack<>();
		Stack<String> operators = new Stack<>();
		String[] characters = expression.split("\\s+");

		for (String character : characters) {
			if (character.equals("(")) continue;
			else if (isOperator(character)) operators.push(character);
			else if (character.equals(")")){
				String operator = operators.pop();
				double operandA = operands.pop();
				double operandB = operands.pop();

				if (operator.equals("+")) operands.push(operandB + operandA);
				else if (operator.equals("-")) operands.push(operandB - operandA);
				else if (operator.equals("*"))operands.push(operandB * operandA);
				else if (operator.equals("/")) operands.push(operandB / operandA);
			}
			else operands.push(Double.parseDouble(character));
		}
		return operands.pop();
	}

	static boolean isOperator(String character){
		return character.equals("+") || character.equals("-") || character.equals("*") || character.equals("/");
	}
	
	public static void main(String[] args) {
		double result = evaluate("( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )");
		System.out.println(result);
	}
	
}
