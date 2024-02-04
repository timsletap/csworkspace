package Stacks;
import java.util.Stack;
public class decodeTester {
    public static String decode(String seq) {
        Stack<Integer> temp = new Stack<Integer>();
        String code = "";
        int num = 0;
        
        for (int i = 1; i <= seq.length() + 1; i++) {
            temp.push(i);

            if (num == seq.length() || seq.charAt(num) == 'I') {
                while (!temp.isEmpty()) {
                    code += "" + temp.pop();
                }
            }

            num++;
        }

        return code;
    }
    public static void main(String[] args) {
    
    
        String seq = "IIDDIDID";
        String result = decode(seq);
        System.out.println("Test: " + seq + " -> " + result); 

    }
}
