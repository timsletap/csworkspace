package Stacks;

import java.util.Stack;
public class StackMethods2 {


//Converts the int n to a String representation of its binary equivalence
//Divide by 2. Put the remainder on a stack.  Empty the stack into a string.	
public static String convertToBinary(int n) {
	Stack<String> temp = new Stack<String>();
    while(n != 0){
        temp.push(""+ n % 2);
        n /=2 ;
    }
    String x = "";
    while(!temp.isEmpty()){
        x += temp.pop();
    

    }
    return x;
}

//This method nth term of the fibonacci sequence
//1,1,2,3,5,8,13
// Use a stack
//			nthFibonacci(7) returns 13
public static int nthFibonacci(int n) {
    Stack<Integer> temp = new Stack<Integer>();
    temp.push(1); 
    temp.push(1);
    int r = temp.peek();
    int x;
    for(int i = 2; i < n; i++){
        x = temp.pop();
        int b = x + r;
        temp.push(x);
        r = x;
        temp.push(b);
    }
    return temp.pop();

}
	

// determines if a stack is in alphabetical order smallest to greatest from top
// of stack
public static boolean isAlphabetical(Stack<String> one) {
    if (one.isEmpty()) {
        return true; 
    }
    Stack<String> temp = new Stack<>();
    while (!one.isEmpty()) {
        String current = one.pop();
        if(!temp.isEmpty() && current.compareTo(temp.peek()) < 0) {
            return false; 
        }
        temp.push(current);
    }
    while (!temp.isEmpty()) {
        one.push(temp.pop());
    }

    return true; 
}

/*
* The isValidParens() method tests if parenthesese of an expression are
* balanced. An expression is valid if the number of opening parenthesis matches
* the number of closing parenthesis and every opener has a matching closer 
* after it. You must use a stack efficiently. examples: 
* 		isValidParens("(x-(y(z+4)") returns false
* 		isValidParens("(3+4*(5%3))") returns true
* 		isValidParens(" )3+4(") returns false
*/

public static boolean isValidParens(String expression) {
    if (expression.equals("") || expression.equals(null)){
        return false;
    }
	Stack<Character> temp = new Stack<Character>();
    for (int i = 0; i < expression.length(); i++) {
        char c = expression.charAt(i);
        if (c == '(') {
            temp.push(c);
        } else if (c == ')') {
            if (temp.isEmpty()) {
                return false; 
            } else {
                temp.pop();
            }
        }
    }
    return temp.isEmpty(); 
}

public static void main(String[] args) {
System.out.println("46= " + convertToBinary(46));  //101110
	System.out.println("122= " + convertToBinary(123)); //1111011
	System.out.println(nthFibonacci(9)); //34
	System.out.println(nthFibonacci(19)); //4181
	System.out.println(isValidParens("(x-(y(z+4)")); //false
	System.out.println(isValidParens("(3+4*(5%3))"));//true
	System.out.println(isValidParens(")3+4(")); //false
	Stack<String> t = new Stack<String>();
	t.push("E");
	t.push("D");
	t.push("C");
	t.push("B");
	t.push("A");
	System.out.println(isAlphabetical(t));  //true
	t.push("F");
	t.push("G");
	t.push("H");
	System.out.println(isAlphabetical(t));  //false
	}

}