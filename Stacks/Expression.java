package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Expression {

	private Stack<Double> numbers;
	private Stack<Character> operators;

	public Expression() {
		operators = new Stack<Character>();
		numbers = new Stack<Double>();

	}

// uses the character to perform the appropriate math operation	 
	double calculate(char x) {

		double a = numbers.pop();
		double b = numbers.pop();
		switch (x) {
		case '+':
			return b + a;
        case '-':
			return b-a;
        case '*':
			return b * a;
        case '/':
			return b / a;
        case '^':
			return Math.pow(b,a);
		default:
			return -9999;
		}

	}

//returns an int to check order of operations
	public int getPriority(char x) {
        if(x == '+' || x == '-'){
            return 1;
        }
        if(x == '*' || x == '/'){
            return 2;
        }
        if(x == '^'){
            return 3;
        }
    return -999;
	}

//adds the operator to the stack or evaluates operation on top of stack 

	public void changeStack(char x) {
        if(operators.isEmpty()){
            operators.push(x);
        }
        else if(getPriority(x) > getPriority(operators.peek())){
            operators.push(x);
        } else {
            numbers.push(calculate(operators.pop()));
            // operators.push(x);
            changeStack(x);
        }

	}

	public double evaluate(String exp) {
		Scanner s = new Scanner(exp);// .useDelimiter("\\s* \\s*");
		// Load first 3 elements from expression
		numbers.push(s.nextDouble());
		operators.push(s.next().charAt(0));
		numbers.push(s.nextDouble());
		// empty the string
		while (s.hasNext()) {
			changeStack(s.next().charAt(0));
			numbers.push(s.nextDouble());
		}

		// empty the stacks to evaluate
		while (!operators.isEmpty())
			numbers.push(calculate(operators.pop()));
		//final answer
		return numbers.pop();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Expression tc = new Expression();

	System.out.println(tc.evaluate (" 13 * 4"));
    System.out.println(tc.evaluate (" 3 * 4 ^ 2 + 5"));
    System.out.println(tc.evaluate (" 2 - 10 - 3 * 2 - 5"));
    System.out.println(tc.evaluate (" 2 ^ 3 - 3 * 2 - 5 + 7"));
    System.out.println(tc.evaluate (" 4 + 3 * 2 + 3 ^ 2 - 7"));
	}

}
