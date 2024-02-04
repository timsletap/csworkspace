package Stacks;
import java.util.Stack;
public class PostFix {


/*
* @param expr==&gt; postfix expression with single digits and +,-,*,/ as a String
* @return calculated value of the expression as a double
*/
public static double calculate(String expr) {
    Stack<Double> stack = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(Double.parseDouble(Character.toString(c)));
            } else {
                double x2 = stack.pop();
                double x1 = stack.pop();  
                switch (c) {
                    case '+':
                        stack.push(x1 + x2);
                        break;
                    case '-':
                        stack.push(x1 - x2);
                        break;
                    case '*':
                        stack.push(x1 * x2);
                        break;
                    case '/':
                        stack.push(x1 / x2);
                        break;
                }
            }
        }
        return stack.pop();
    }


public static void main(String[] args) {
System.out.println(calculate("53+")); //8
System.out.println(calculate("27+12++")); //12
System.out.println(calculate("55+2*4/9+")); //14
}
}

