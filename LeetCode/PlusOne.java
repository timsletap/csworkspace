package LeetCode;


public class PlusOne {

    public int[] plusOne(int[] digits) {
       for(int i = digits.length - 1; i >= 0; i--){
        if(digits[i] < 9){
            digits[i]++;
            return digits;
        } 
            digits[i] = 0;
        }
        int[] newDig = new int[digits.length+1];
        newDig[0] = 1;
        return newDig;
        }
            

public static void main(String[] args) {
    PlusOne po = new PlusOne();
    int[] digits = {2,9,9};
    int[] result = po.plusOne(digits);
    for(int i : result){
        System.out.print(i + " ");
    }
}
   
    
}