package Stacks;
import java.util.*;
public class StackMethods {
    public static Stack<String> reverse(Stack<String> x) {
        Stack<String> temp = new Stack<String>();
        while (!x.isEmpty()) {
            temp.push(x.pop());
        }
        return temp;
    }

    public static Stack<String> combine(Stack<String> x, Stack<String> y) {
        Stack<String> temp = new Stack<String>();
        while (!y.isEmpty()) {
            temp.push(y.pop());
        }
        while (!x.isEmpty()) {
            temp.push(x.pop());
        }

        return reverse(temp);
    }

    public static Stack<String> alternate(Stack<String> x, Stack<String> y) {
        Stack<String> result = new Stack<String>();
        

        while (!x.isEmpty() || !y.isEmpty()) {
            if (!x.isEmpty()) {
                result.push(x.pop());
            }
            if (!y.isEmpty()) {
                result.push(y.pop());
            }
           
        }

        return reverse(result);
    }

    public static Stack<String> removeEveryOther(Stack<String> x) {
        Stack<String> result = new Stack<String>();
        boolean remove = false;

        while (!x.isEmpty()) {
            if (!remove) {
                result.push(x.pop());
            } else {
                x.pop();
            }
            remove = !remove;
        }

        return reverse(result);
    }

    public static double getAverage(Stack<Integer> x) {
        if (x.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        int count = 0;

        Stack<Integer> temp = (Stack<Integer>) x.clone();

        while (!temp.isEmpty()) {
            sum += temp.pop();
            count++;
        }

        return sum / count;
    }

    public static boolean isPalindrome(Stack<String> x) {
        Stack<String> reversed = reverse(x);
        Stack<String> temp = (Stack<String>) x.clone();

        while (!temp.isEmpty()) {
            if (!temp.pop().equals(reversed.pop())) {
                return false;
            }
        }

        return true;
    }

       


    public static void main(String[] args) {
   
        Stack<String> t = new Stack<String>();
        t.push("A");
        t.push("B");
        t.push("C");
        t.push("D");
        t.push("E");
        System.out.println("Original t:" + t);
 
        Stack<String> tClone = (Stack<String>) t.clone();
        Stack<String> tClone2 = (Stack<String>) t.clone();
        Stack<String> u = new Stack<String>();
        u.push("F");
        u.push("G");
        u.push("H");
        System.out.println("Original u:" + u);
        Stack<String> uClone = (Stack<String>) u.clone();
        System.out.println("Combine(t,u): " + combine(t, u));
        System.out.println("alternate(t,u): " + alternate(tClone, uClone));
        System.out.println("RemoveEveryOther t: " + removeEveryOther(tClone2));
 
        Stack<Integer> z = new Stack<Integer>();
        z.push(10);
        z.push(20);
        z.push(3);
        z.push(7);
        z.push(11);
        System.out.println("Original z:" + z);
        System.out.println("Average z: " + getAverage(z));
 
        Stack<String> v = new Stack<String>();
        v.push("Z");
        v.push("Y");
        v.push("X");
        v.push("Y");
        v.push("Z");
        Stack<String> vClone = (Stack<String>) v.clone();
        
        System.out.println("Original v:" + v);
        System.out.println("Reverse:" + reverse(v));
        System.out.println("Palindrome (v)?:" + isPalindrome(vClone));
        
        Stack<String> w = new Stack<String>();
        w.push("A");
        w.push("B");
        w.push("C");
        w.push("D");
        w.push("E");
        System.out.println("Original v:" + v);
        System.out.println("Palindrome (w)?:" + isPalindrome(w));

/*Original t:[A, B, C, D, E]
Original u:[F, G, H]
Combine(t,u): [A, B, C, D, E, F, G, H]
alternate(t,u): [A, B, F, C, G, D, H, E]
RemoveEveryOther t: [B, D]
Original z:[10, 20, 3, 7, 11]
Average z: 10.2
Original v:[Z, Y, X, Y, Z]
Reverse:[Z, Y, X, Y, Z]
Palindrome (v)?:true
Original v:[]
Palindrome (w)?:false
*/
 }
    
}